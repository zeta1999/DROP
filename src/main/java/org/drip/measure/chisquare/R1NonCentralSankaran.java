
package org.drip.measure.chisquare;

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
 * <i>R1NonCentralSankaran</i> implements the Sankaran (1959, 1963) Wilson-Haferty Approximation for the
 * 	R<sup>1</sup> Non-central Chi-Square Distribution. The References are:
 * 
 * <br><br>
 * 	<ul>
 * 		<li>
 * 			Johnson, N. L., S. Kotz, and N. Balakrishnan (1995): <i>Continuous Univariate Distributions
 * 				2<sup>nd</sup> Edition</i> <b>John Wiley and Sons</b>
 * 		</li>
 * 		<li>
 * 			Muirhead, R. (2005): <i>Aspects of Multivariate Statistical Theory 2<sup>nd</sup> Edition</i>
 * 				<b>Wiley</b>
 * 		</li>
 * 		<li>
 * 			Non-central Chi-Squared Distribution (2019): Chi-Squared Function
 * 				https://en.wikipedia.org/wiki/Noncentral_chi-squared_distribution
 * 		</li>
 * 		<li>
 * 			Sankaran, M. (1963): Approximations to the Non-Central Chi-Square Distribution <i>Biometrika</i>
 * 				<b>50 (1-2)</b> 199-204
 * 		</li>
 * 		<li>
 * 			Young, D. S. (2010): tolerance: An R Package for Estimating Tolerance Intervals <i>Journal of
 * 				Statistical Software</i> <b>36 (5)</b> 1-39
 * 		</li>
 * 	</ul>
 *
 *	<br><br>
 *  <ul>
 *		<li><b>Module </b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/ComputationalCore.md">Computational Core Module</a></li>
 *		<li><b>Library</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/NumericalAnalysisLibrary.md">Numerical Analysis Library</a></li>
 *		<li><b>Project</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/src/main/java/org/drip/measure/README.md">R<sup>d</sup> Continuous/Discrete Probability Measures</a></li>
 *		<li><b>Package</b> = <a href = "https://github.com/lakshmiDRIP/DROP/tree/master/src/main/java/org/drip/measure/chisquare/README.md">Chi-Square Distribution Implementation/Properties</a></li>
 *  </ul>
 *
 * @author Lakshmi Krishnamurthy
 */

public class R1NonCentralSankaran
	extends org.drip.measure.chisquare.R1NonCentralWilsonHaferty
{
	private double _h = java.lang.Double.NaN;
	private double _m = java.lang.Double.NaN;
	private double _p = java.lang.Double.NaN;

	/**
	 * Construct a Standard Instance of R1NonCentralSankaran
	 * 
	 * @param degreesOfFreedom Degrees of Freedom
	 * @param nonCentralityParameter Non-centrality Parameter
	 * 
	 * @return Standard Instance of R1NonCentralSankaran
	 */

	public static final R1NonCentralSankaran Standard (
		final int degreesOfFreedom,
		final double nonCentralityParameter)
	{
		if (0 >= degreesOfFreedom ||
			!org.drip.numerical.common.NumberUtil.IsValid (
				nonCentralityParameter
			)
		)
		{
			return null;
		}

		double h = 1. - (
			2. * (degreesOfFreedom + nonCentralityParameter) *
			(degreesOfFreedom + 3. * nonCentralityParameter) / 3. /
			(degreesOfFreedom + 2. * nonCentralityParameter) /
			(degreesOfFreedom + 2. * nonCentralityParameter)
		);
		double p = (degreesOfFreedom + 2. * nonCentralityParameter) /
			(degreesOfFreedom + nonCentralityParameter) /
			(degreesOfFreedom + nonCentralityParameter);
		double m = (h - 1.) * (1. - 3. * h);
		double halfMP = 0.5 * m * p;

		try
		{
			return new R1NonCentralSankaran (
				new org.drip.measure.chisquare.R1NonCentralParameters (
					degreesOfFreedom,
					nonCentralityParameter
				),
				new org.drip.measure.gaussian.R1UnivariateNormal (
					1. + h * p * (h - 1. - halfMP * (2. - h)),
					h * java.lang.Math.sqrt (
						2. * p
					) * (1. + halfMP)
				),
				h,
				p,
				m
			);
		}
		catch (java.lang.Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

	protected R1NonCentralSankaran (
		final org.drip.measure.chisquare.R1NonCentralParameters r1NonCentralParameters,
		final org.drip.measure.gaussian.R1UnivariateNormal r1UnivariateNormal,
		final double h,
		final double p,
		final double m)
		throws java.lang.Exception
	{
		super (
			r1NonCentralParameters,
			r1UnivariateNormal
		);

		_h = h;
		_p = p;
		_m = m;
	}

	/**
	 * Retrieve the Sankaran "h" Parameter
	 * 
	 * @return Sankaran "h" Parameter
	 */

	public double h()
	{
		return _h;
	}

	/**
	 * Retrieve the Sankaran "p" Parameter
	 * 
	 * @return Sankaran "p" Parameter
	 */

	public double p()
	{
		return _p;
	}

	/**
	 * Retrieve the Sankaran "m" Parameter
	 * 
	 * @return Sankaran "m" Parameter
	 */

	public double m()
	{
		return _m;
	}

	@Override public double transform (
		final double x)
	{
		org.drip.measure.chisquare.R1NonCentralParameters parameters = parameters();

		return java.lang.Math.pow (
			x / (
				parameters.degreesOfFreedom() + parameters.nonCentralityParameter()
			),
			_h
		);
	}

	@Override public double inverseTransform (
		final double wilsonHilferty)
	{
		org.drip.measure.chisquare.R1NonCentralParameters parameters = parameters();

		return java.lang.Math.pow (
			wilsonHilferty,
			1. / _h
		) * (
			parameters.degreesOfFreedom() + parameters.nonCentralityParameter()
		);
	}
}
