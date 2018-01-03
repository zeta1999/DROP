
package org.drip.state.identifier;

/*
 * -*- mode: java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 */

/*!
 * Copyright (C) 2018 Lakshmi Krishnamurthy
 * Copyright (C) 2017 Lakshmi Krishnamurthy
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
 * CreditSupportAnnexLabel specifies the Label of of a CSA Specification. The References are:
 *  
 *  - Burgard, C., and M. Kjaer (2014): PDE Representations of Derivatives with Bilateral Counter Party Risk
 *  	and Funding Costs <i>Journal of Credit Risk</i> <b>7 (3)</b> 1-19.<br><br>
 *  
 *  - Cesari, G., J. Aquilina, N. Charpillon, X. Filipovic, G. Lee, and L. Manda (2009): Modeling, Pricing,
 *  	and Hedging Counter-party Credit Exposure - A Technical Guide <i>Springer Finance</i>
 *  		<b>New York</b>.<br><br>
 *  
 *  - Gregory, J. (2009): Being Two-faced over Counter-party Credit Risk <i>Risk</i> <b>20 (2)</b>
 *  	86-90.<br><br>
 *  
 *  - Li, B., and Y. Tang (2007): Quantitative Analysis, Derivatives Modeling, and Trading Strategies in the
 *  	Presence of Counter-party Credit Risk for the Fixed Income Market <i>World Scientific Publishing </i>
 *  		<b>Singapore</b>.<br><br>
 * 
 *  - Piterbarg, V. (2010): Funding Beyond Discounting: Collateral Agreements and Derivatives Pricing
 *  	<i>Risk</i> <b>21 (2)</b> 97-102.<br><br>
 * 
 * @author Lakshmi Krishnamurthy
 */

public class CreditSupportAnnexLabel implements org.drip.state.identifier.LatentStateLabel
{
	private java.lang.String _strCurrency = "";
	private java.lang.String _strAssociation = "";

	/**
	 * Generate the ISDA CSA
	 * 
	 * @param strCurrency The Currency
	 * 
	 * @return The ISDA CSA
	 */

	public static final CreditSupportAnnexLabel ISDA (
		final java.lang.String strCurrency)
	{
		try {
			return new CreditSupportAnnexLabel (
				strCurrency,
				"ISDA"
			);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * CreditSupportAnnexLabel Constructor
	 * 
	 * @param strCurrency The CSA Currency
	 * @param strAssociation The CSA Specifier
	 * 
	 * @throws java.lang.Exception Thrown if the Inputs are Invalid
	 */

	public CreditSupportAnnexLabel (
		final java.lang.String strCurrency,
		final java.lang.String strAssociation)
		throws java.lang.Exception
	{
		if (null == (_strCurrency = strCurrency) || _strCurrency.isEmpty() ||
			null == (_strAssociation = strAssociation) || _strAssociation.isEmpty())
			throw new java.lang.Exception ("CreditSupportAnnexLabel Constructor => Invalid Inputs");
	}

	/**
	 * Retrieve the CSA Currency
	 * 
	 * @return The CSA Currency
	 */

	public java.lang.String currency()
	{
		return _strCurrency;
	}

	/**
	 * Retrieve the CSA Specification Association/Organization
	 * 
	 * @return The CSA Specification Association/Organization
	 */

	public java.lang.String association()
	{
		return _strAssociation;
	}

	@Override public java.lang.String fullyQualifiedName()
	{
		return _strCurrency + "::" + _strAssociation;
	}

	@Override public boolean match (
		final org.drip.state.identifier.LatentStateLabel lslOther)
	{
		return null == lslOther || !(lslOther instanceof org.drip.state.identifier.CreditSupportAnnexLabel) ?
			false : fullyQualifiedName().equalsIgnoreCase (lslOther.fullyQualifiedName());
	}
}
