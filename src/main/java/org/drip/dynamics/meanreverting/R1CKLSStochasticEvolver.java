
package org.drip.dynamics.meanreverting;

/*
 * -*- mode: java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 */

/*!
 * Copyright (C) 2020 Lakshmi Krishnamurthy
 * Copyright (C) 2019 Lakshmi Krishnamurthy
 * 
 *  This file is part of DROP, an open-source library targeting analytics/risk, transaction cost analytics,
 *  	asset liability management analytics, capital, exposure, and margin analytics, valuation adjustment
 *  	analytics, and portfolio construction analytics within and across fixed income, credit, commodity,
 *  	equity, FX, and structured products. It also includes auxiliary libraries for algorithm support,
 *  	numerical analysis, numerical optimization, spline builder, model validation, statistical learning,
 *  	and computational support.
 *  
 *  	https://lakshmidrip.github.io/DROP/
 *  
 *  DROP is composed of three modules:
 *  
 *  - DROP Product Core - https://lakshmidrip.github.io/DROP-Product-Core/
 *  - DROP Portfolio Core - https://lakshmidrip.github.io/DROP-Portfolio-Core/
 *  - DROP Computational Core - https://lakshmidrip.github.io/DROP-Computational-Core/
 * 
 * 	DROP Product Core implements libraries for the following:
 * 	- Fixed Income Analytics
 * 	- Loan Analytics
 * 	- Transaction Cost Analytics
 * 
 * 	DROP Portfolio Core implements libraries for the following:
 * 	- Asset Allocation Analytics
 *  - Asset Liability Management Analytics
 * 	- Capital Estimation Analytics
 * 	- Exposure Analytics
 * 	- Margin Analytics
 * 	- XVA Analytics
 * 
 * 	DROP Computational Core implements libraries for the following:
 * 	- Algorithm Support
 * 	- Computation Support
 * 	- Function Analysis
 *  - Model Validation
 * 	- Numerical Analysis
 * 	- Numerical Optimizer
 * 	- Spline Builder
 *  - Statistical Learning
 * 
 * 	Documentation for DROP is Spread Over:
 * 
 * 	- Main                     => https://lakshmidrip.github.io/DROP/
 * 	- Wiki                     => https://github.com/lakshmiDRIP/DROP/wiki
 * 	- GitHub                   => https://github.com/lakshmiDRIP/DROP
 * 	- Repo Layout Taxonomy     => https://github.com/lakshmiDRIP/DROP/blob/master/Taxonomy.md
 * 	- Javadoc                  => https://lakshmidrip.github.io/DROP/Javadoc/index.html
 * 	- Technical Specifications => https://github.com/lakshmiDRIP/DROP/tree/master/Docs/Internal
 * 	- Release Versions         => https://lakshmidrip.github.io/DROP/version.html
 * 	- Community Credits        => https://lakshmidrip.github.io/DROP/credits.html
 * 	- Issues Catalog           => https://github.com/lakshmiDRIP/DROP/issues
 * 	- JUnit                    => https://lakshmidrip.github.io/DROP/junit/index.html
 * 	- Jacoco                   => https://lakshmidrip.github.io/DROP/jacoco/index.html
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   	you may not use this file except in compliance with the License.
 *   
 *  You may obtain a copy of the License at
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  	distributed under the License is distributed on an "AS IS" BASIS,
 *  	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  
 *  See the License for the specific language governing permissions and
 *  	limitations under the License.
 */

/**
 * <i>R1CKLSStochasticEvolver</i> implements the R<sup>1</sup> Chan-Karolyi-Longstaff-Sanders 1992 Stochastic
 * 	Evolver. The References are:
 *  
 * 	<br><br>
 *  <ul>
 * 		<li>
 * 			Doob, J. L. (1942): The Brownian Movement and Stochastic Equations <i>Annals of Mathematics</i>
 * 				<b>43 (2)</b> 351-369
 * 		</li>
 * 		<li>
 * 			Gardiner, C. W. (2009): <i>Stochastic Methods: A Handbook for the Natural and Social Sciences
 * 				4<sup>th</sup> Edition</i> <b>Springer-Verlag</b>
 * 		</li>
 * 		<li>
 * 			Kadanoff, L. P. (2000): <i>Statistical Physics: Statics, Dynamics, and Re-normalization</i>
 * 				<b>World Scientific</b>
 * 		</li>
 * 		<li>
 * 			Karatzas, I., and S. E. Shreve (1991): <i>Brownian Motion and Stochastic Calculus 2<sup>nd</sup>
 * 				Edition</i> <b>Springer-Verlag</b>
 * 		</li>
 * 		<li>
 * 			Risken, H., and F. Till (1996): <i>The Fokker-Planck Equation � Methods of Solution and
 * 				Applications</i> <b>Springer</b>
 * 		</li>
 *  </ul>
 *
 *	<br><br>
 *  <ul>
 *		<li><b>Module </b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/ProductCore.md">Product Core Module</a></li>
 *		<li><b>Library</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/FixedIncomeAnalyticsLibrary.md">Fixed Income Analytics</a></li>
 *		<li><b>Project</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/src/main/java/org/drip/dynamics/README.md">HJM, Hull White, LMM, and SABR Dynamic Evolution Models</a></li>
 *		<li><b>Package</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/src/main/java/org/drip/dynamics/meanreverting/README.md">Mean Reverting Stochastic Process Dynamics</a></li>
 *  </ul>
 *
 * @author Lakshmi Krishnamurthy
 */

public class R1CKLSStochasticEvolver
	extends org.drip.dynamics.process.R1StochasticEvolver
{
	private org.drip.dynamics.meanreverting.CKLSParameters _cklsParameters = null;

	/**
	 * Construct a Weiner Instance of R1CKLSStochasticEvolver Process
	 * 
	 * @param meanReversionSpeed The Mean Reversion Speed
	 * @param meanReversionLevel The Mean Reversion Level
	 * @param volatility The Volatility
	 * @param cklsExponent The CKLS Exponent
	 * @param timeWidth Wiener Time Width
	 * 
	 * @return Weiner Instance of R1CKLSStochasticEvolver Process
	 */

	public static R1CKLSStochasticEvolver Wiener (
		final double meanReversionSpeed,
		final double meanReversionLevel,
		final double volatility,
		final double cklsExponent,
		final double timeWidth)
	{
		try
		{
			return new R1CKLSStochasticEvolver (
				new org.drip.dynamics.meanreverting.CKLSParameters (
					meanReversionSpeed,
					meanReversionLevel,
					volatility,
					cklsExponent
				), new org.drip.dynamics.ito.R1WienerDriver (
					timeWidth
				)
			);
		}
		catch (java.lang.Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * R1CKLSStochasticEvolver Constructor
	 * 
	 * @param cklsParameters The CKLS Parameters
	 * @param r1StochasticDriver The Stochastic Driver
	 * 
	 * @throws java.lang.Exception Thrown if the Inputs are Invalid
	 */

	public R1CKLSStochasticEvolver (
		final org.drip.dynamics.meanreverting.CKLSParameters cklsParameters,
		final org.drip.dynamics.ito.R1StochasticDriver r1StochasticDriver)
		throws java.lang.Exception
	{
		super (
			new org.drip.dynamics.ito.R1ToR1Drift()
			{
				@Override public double drift (
					final org.drip.dynamics.ito.TimeR1Vertex r1TimeVertex)
					throws java.lang.Exception
				{
					if (null == r1TimeVertex)
					{
						throw new java.lang.Exception (
							"R1CKLSStochasticEvolver::drift => Invalid Inputs"
						);
					}

					return cklsParameters.meanReversionSpeed() * (
						cklsParameters.meanReversionLevel() - r1TimeVertex.x()
					);
				}
			},
			new org.drip.dynamics.ito.R1ToR1Volatility()
			{
				@Override public double volatility (
					final org.drip.dynamics.ito.TimeR1Vertex r1TimeVertex)
					throws java.lang.Exception
				{
					if (null == r1TimeVertex)
					{
						throw new java.lang.Exception (
							"R1CKLSStochasticEvolver::volatility => Invalid Inputs"
						);
					}

					return cklsParameters.volatilityCoefficient() * java.lang.Math.pow (
						r1TimeVertex.x(),
						cklsParameters.volatilityExponent()
					);
				}
			},
			r1StochasticDriver
		);

		_cklsParameters = cklsParameters;
	}

	/**
	 * Retrieve the CKLS Parameters
	 * 
	 * @return The CKLS Parameters
	 */

	public org.drip.dynamics.meanreverting.CKLSParameters cklsParameters()
	{
		return _cklsParameters;
	}

	@Override public org.drip.dynamics.kolmogorov.R1FokkerPlanck fokkerPlanckGenerator()
	{
		try
		{
			return new org.drip.dynamics.kolmogorov.R1FokkerPlanckCKLS (
				_cklsParameters
			);
		}
		catch (java.lang.Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}
}
