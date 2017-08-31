
package org.drip.spline.params;

/*
 * -*- mode: java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 */

/*!
 * Copyright (C) 2017 Lakshmi Krishnamurthy
 * Copyright (C) 2016 Lakshmi Krishnamurthy
 * Copyright (C) 2015 Lakshmi Krishnamurthy
 * Copyright (C) 2014 Lakshmi Krishnamurthy
 * Copyright (C) 2013 Lakshmi Krishnamurthy
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
 * ResponseScalingShapeControl implements the segment level basis functions proportional adjustment to
 *  achieve the desired shape behavior of the response. In addition to the actual shape controller function,
 *  it interprets whether the control is applied on a local or global predicate ordinate basis.
 *
 * @author Lakshmi Krishnamurthy
 */

public class ResponseScalingShapeControl {
	private boolean _bIsLocal = false;
	private org.drip.function.definition.R1ToR1 _auShapeControl = null;

	/**
	 * ResponseScalingShapeControl constructor
	 * 
	 * @param bIsLocal TRUE - Shape Control is applied on a local segment basis
	 * @param auShapeControl - Univariate Shape Controller Function
	 * 
	 * @throws java.lang.Exception Thrown if the Inputs are invalid
	 */

	public ResponseScalingShapeControl (
		final boolean bIsLocal,
		final org.drip.function.definition.R1ToR1 auShapeControl)
		throws java.lang.Exception
	{
		if (null == (_auShapeControl = auShapeControl))
			throw new java.lang.Exception ("ResponseScalingShapeControl ctr: Invalid Inputs");

		_bIsLocal = bIsLocal;
	}

	/**
	 * Indicate if the Control is applied on a Local or a Global Predicate Ordinate Basis
	 * 
	 * @return TRUE - Control is applied on a Local Predicate Ordinate Basis
	 */

	public boolean isLocal()
	{
		return _bIsLocal;
	}

	/**
	 * Retrieve the Shape Control Univariate Function
	 * 
	 * @return The Shape Control Univariate Function
	 */

	public org.drip.function.definition.R1ToR1 shapeController()
	{
		return _auShapeControl;
	}
}
