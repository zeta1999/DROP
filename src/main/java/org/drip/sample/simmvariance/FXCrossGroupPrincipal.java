
package org.drip.sample.simmvariance;

import org.drip.numerical.common.FormatUtil;
import org.drip.numerical.common.NumberUtil;
import org.drip.service.env.EnvManager;
import org.drip.simm.foundation.RiskGroupPrincipalCovariance;
import org.drip.simm.fx.FXRiskThresholdContainer20;
import org.drip.simm.fx.FXRiskThresholdContainer21;

/*
 * -*- mode: java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 */

/*!
 * Copyright (C) 2018 Lakshmi Krishnamurthy
 * 
 *  This file is part of DRIP, a free-software/open-source library for buy/side financial/trading model
 *  	libraries targeting analysts and developers
 *  	https://lakshmidrip.github.io/DRIP/
 *  
 *  DRIP is composed of four main libraries:
 *  
 *  - DRIP Fixed Income - https://lakshmidrip.github.io/DRIP-Fixed-Income/
 *  - DRIP Asset Allocation - https://lakshmidrip.github.io/DRIP-Asset-Allocation/
 *  - DRIP Numerical Optimizer - https://lakshmidrip.github.io/DRIP-Numerical-Optimizer/
 *  - DRIP Statistical Learning - https://lakshmidrip.github.io/DRIP-Statistical-Learning/
 * 
 *  - DRIP Fixed Income: Library for Instrument/Trading Conventions, Treasury Futures/Options,
 *  	Funding/Forward/Overnight Curves, Multi-Curve Construction/Valuation, Collateral Valuation and XVA
 *  	Metric Generation, Calibration and Hedge Attributions, Statistical Curve Construction, Bond RV
 *  	Metrics, Stochastic Evolution and Option Pricing, Interest Rate Dynamics and Option Pricing, LMM
 *  	Extensions/Calibrations/Greeks, Algorithmic Differentiation, and Asset Backed Models and Analytics.
 * 
 *  - DRIP Asset Allocation: Library for model libraries for MPT framework, Black Litterman Strategy
 *  	Incorporator, Holdings Constraint, and Transaction Costs.
 * 
 *  - DRIP Numerical Optimizer: Library for Numerical Optimization and Spline Functionality.
 * 
 *  - DRIP Statistical Learning: Library for Statistical Evaluation and Machine Learning.
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
 * FXCrossGroupPrincipal demonstrates the Computation of the Cross FX Bucket Principal Component Co-variance
 * 	using the FX Risk Group Principal Component. The References are:
 *  
 *  - Andersen, L. B. G., M. Pykhtin, and A. Sokol (2017): Credit Exposure in the Presence of Initial Margin,
 *  	https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2806156, eSSRN.
 *  
 *  - Albanese, C., S. Caenazzo, and O. Frankel (2017): Regression Sensitivities for Initial Margin
 *  	Calculations, https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2763488, eSSRN.
 *  
 *  - Anfuso, F., D. Aziz, P. Giltinan, and K. Loukopoulus (2017): A Sound Modeling and Back-testing
 *  	Framework for Forecasting Initial Margin Requirements,
 *  	https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2716279, eSSRN.
 *  
 *  - Caspers, P., P. Giltinan, R. Lichters, and N. Nowaczyk (2017): Forecasting Initial Margin Requirements
 *  	- A Model Evaluation https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2911167, eSSRN.
 *  
 *  - International Swaps and Derivatives Association (2017): SIMM v2.0 Methodology,
 *  	https://www.isda.org/a/oFiDE/isda-simm-v2.pdf.
 * 
 * @author Lakshmi Krishnamurthy
 */

public class FXCrossGroupPrincipal
{

	private static final void PrintGroupPrincipalCovariance (
		final String simmVersion,
		final String displayLabel,
		final RiskGroupPrincipalCovariance riskGroupPrincipalCovariance)
		throws Exception
	{
		System.out.println ("\t||------------------------------------||");

		System.out.println ("\t||     " + simmVersion + " CROSS GROUP COVARIANCE     ||");

		System.out.println ("\t||------------------------------------||");

		System.out.println (
			"\t|| Cross Group Correlation => " +
			FormatUtil.FormatDouble (riskGroupPrincipalCovariance.extraGroupCorrelation(), 1, 4, 1.) + " ||"
		);

		System.out.println (
			"\t|| Principal Eigenvalue    => " +
			FormatUtil.FormatDouble (
				riskGroupPrincipalCovariance.principalEigenComponent().eigenValue(), 1, 4, 1.
			) + " ||"
		);

		System.out.println ("\t||------------------------------------||");

		System.out.println ("\t||---------------------------------------------------|");

		System.out.println ("\t||         ADJUSTED CURVE PRINCIPAL COVARIANCE       |");

		System.out.println ("\t||---------------------------------------------------|");

		NumberUtil.PrintMatrix (
			"\t|| " + displayLabel,
			riskGroupPrincipalCovariance.adjustedCovariance()
		);

		System.out.println ("\t||---------------------------------------------------|");
	}

	public static final void main (
		final String[] argumentArray)
		throws Exception
	{
		EnvManager.InitEnv ("");

		PrintGroupPrincipalCovariance (
			"2.0",
			"FX CROSS GROUP",
			FXRiskThresholdContainer20.CrossGroupPrincipalCovariance()
		);

		PrintGroupPrincipalCovariance (
			"2.1",
			"FX CROSS GROUP",
			FXRiskThresholdContainer21.CrossGroupPrincipalCovariance()
		);

		EnvManager.TerminateEnv();
	}
}
