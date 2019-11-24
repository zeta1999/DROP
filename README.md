# DROP

**v4.48**  *23 November 2019*

<p align="center"><img src="https://github.com/lakshmiDRIP/DROP/blob/master/DRIP_Logo.gif?raw=true" width="100"></p>

DROP implements libraries for single products (fixed income, FX, and asset backed), portfolios (optimal portfolios, XVA, and Exposure analytics), and numerical support (linear algebra, numerical optimizer, and algorithm support).

DROP is composed of three modules.

 * [***Analytics Core Module***](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md)   =>   Fixed Income Analytics, Asset Back Analytics, Exposure and Margin Analytics, and XVA Analytics.
 * [***Portfolio Core Module***](https://github.com/lakshmiDRIP/DROP/blob/master/PortfolioCore.md)   =>   Portfolio Contruction, along with Execution/Transaction Cost Models.
 * [***Numerical Core Module***](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md)   =>   Model Validation, Spline Builder, Statistical Learning, Numerical Optimizer, and Algorithm Support Libraries.


## Pointers

[![Travis](https://travis-ci.org/lakshmiDRIP/DROP.svg)](https://travis-ci.org/lakshmiDRIP/DROP)    [![CircleCI](https://img.shields.io/circleci/project/github/lakshmiDRIP/DROP.svg)](https://circleci.com/gh/lakshmiDRIP/workflows/DROP)    [![CircleCI](https://circleci.com/gh/lakshmiDRIP/DROP.svg?style=svg)](https://circleci.com/gh/lakshmiDRIP/DROP)    [![Build status](https://ci.appveyor.com/api/projects/status/m5p8sfeth4cewr4v?svg=true)](https://ci.appveyor.com/project/lakshmiDRIP/drop)    
[![Git](https://img.shields.io/github/release/lakshmiDRIP/DROP.svg)](https://github.com/lakshmiDRIP/DROP/releases)    
[![Dependency Status](https://www.versioneye.com/user/projects/5a2e15d50fb24f6ad613a09f/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/5a2e15d50fb24f6ad613a09f)    [![Waffle.io - Columns and their card count](https://badge.waffle.io/lakshmiDRIP/DROP.svg?columns=all)](https://waffle.io/lakshmiDRIP/DROP)    
[![Stack Overflow](http://img.shields.io/:stack%20overflow-drip-brightgreen.svg)](http://stackoverflow.com/questions/tagged/drip)    [![Git](http://dmlc.github.io/img/apache2.svg)](./LICENSE)    
[![Join the chat at https://gitter.im/lakshmiDRIPDROP](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/lakshmiDRIPDROP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)    

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7270e4b57c50483699448bf32721ab10)](https://www.codacy.com/app/lakshmiDRIP/DROP?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DROP/DROP&amp;utm_campaign=Badge_Grade)   [![Codacy Badge](https://api.codacy.com/project/badge/Coverage/7270e4b57c50483699448bf32721ab10)](https://www.codacy.com/app/lakshmiDRIP/DROP?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DROP/DROP&amp;utm_campaign=Badge_Coverage)   [![codecov.io](http://codecov.io/github/lakshmiDRIP/DROP/coverage.svg?branch=master)](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master)   [![Coverage Status](https://coveralls.io/repos/github/lakshmiDRIP/DROP/badge.svg?branch=master)](https://coveralls.io/github/lakshmiDRIP/DROP?branch=master)   [![Coverity Status](https://scan.coverity.com/projects/14574/badge.svg)](https://scan.coverity.com/projects/lakshmidrip-drop)    
[![Documentation Status](https://readthedocs.org/projects/dripdrop/badge/?version=latest)](http://dripdrop.readthedocs.io/en/latest/?badge=latest)  [![Javadoc](https://readthedocs.org/projects/xgboost/badge/?version=latest)](https://lakshmidrip.github.io/DROP/Javadoc/index.html)  [![Other](https://readthedocs.org/projects/xgboost/badge/?version=latest)](https://github.com/lakshmiDRIP/DROP/tree/master/Docs)

[![Average time to resolve an issue](http://isitmaintained.com/badge/resolution/lakshmiDRIP/DROP.svg)](http://isitmaintained.com/project/lakshmiDRIP/DROP "Average time to resolve an issue")   [![Percentage of issues still open](http://isitmaintained.com/badge/open/lakshmiDRIP/DROP.svg)](http://isitmaintained.com/project/lakshmiDRIP/DROP "Percentage of issues still open")

[![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

## Repo Structure

 [**Module, Library, and Project Layout**](https://github.com/lakshmiDRIP/DROP/blob/master/Taxonomy.md)

  |        Project         |  Home  |  Issues  |  Library  |  Module  |
  |------------------------|--------|----------|-----------|----------|
  | analytics              | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/analytics/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aanalytics) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | assetbacked            | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/assetbacked/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aassetbacked) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | dynamics               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/dynamics/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Adynamics) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | execution              | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/execution/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aexecution) | [Transaction Cost Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AssetAllocationAnalyticsLibrary.md) | [Portfolio](https://github.com/lakshmiDRIP/DROP/blob/master/PortfolioCore.md) |
  | exposure               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/exposure/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aexposure) | [Exposure Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/ExposureAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | feed                   | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/feed/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Afeed) | [Algorithm Support](https://github.com/lakshmiDRIP/DROP/blob/master/AlgorithmSupportLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | function               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/function/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Afunction) | [Numerical Optimizer](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalOptimizerLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | historical             | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/historical/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Ahistorical) | [Algorithm Support](https://github.com/lakshmiDRIP/DROP/blob/master/AlgorithmSupportLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | json                   | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/json/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Ajson) | [Algorithm Support](https://github.com/lakshmiDRIP/DROP/blob/master/AlgorithmSupportLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | learning               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/learning/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Alearning) | [Statistical Learning](https://github.com/lakshmiDRIP/DROP/blob/master/StatisticalLearningLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | market                 | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/market/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Amarket) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | measure                | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/measure/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Ameasure) | [Numerical Optimizer](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalOptimizerLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | optimization           | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/optimization/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aoptimization) | [Numerical Optimizer](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalOptimizerLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | param                  | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/param/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aparam) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | portfolio construction | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/portfolioconstruction/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aportfolioconstruction) | [Asset Allocation Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AssetAllocationAnalyticsLibrary.md) | [Portfolio](https://github.com/lakshmiDRIP/DROP/blob/master/PortfolioCore.md) |
  | pricer                 | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/pricer/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Apricer) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | product                | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/product/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aproduct) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | quant                  | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/quant/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aquant) | [Numerical Optimizer](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalOptimizerLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | regression             | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/regression/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aregression) | [Algorithm Support](https://github.com/lakshmiDRIP/DROP/blob/master/AlgorithmSupportLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | sequence               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/sequence/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Asequence) | [Statistical Learning](https://github.com/lakshmiDRIP/DROP/blob/master/StatisticalLearningLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | service                | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/service/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aservice) | [Algorithm Support](https://github.com/lakshmiDRIP/DROP/blob/master/AlgorithmSupportLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | simm                   | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/simm/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Asimm) | [Exposure Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/ExposureAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | spaces                 | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/spaces/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aspaces) | [Statistical Learning](https://github.com/lakshmiDRIP/DROP/blob/master/StatisticalLearningLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | spline                 | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/spline/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Aspline) | [Spline Builder](https://github.com/lakshmiDRIP/DROP/blob/master/SplineBuilderLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | state                  | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/state/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Astate) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | template               | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/template/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Atemplate) | [Fixed Income Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/FixedIncomeAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |
  | validation             | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/validation/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Avalidation) | [Model Validation](https://github.com/lakshmiDRIP/DROP/blob/master/ModelValidationLibrary.md) | [Numerical](https://github.com/lakshmiDRIP/DROP/blob/master/NumericalCore.md) |
  | xva                    | [README](https://github.com/lakshmiDRIP/DROP/blob/master/src/main/java/org/drip/xva/README.md) | [Git](https://github.com/lakshmiDRIP/DROP/issues?q=is%3Aopen+is%3Aissue+label%3Axva) | [XVA Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/ExposureAnalyticsLibrary.md) | [Analytics](https://github.com/lakshmiDRIP/DROP/blob/master/AnalyticsCore.md) |


## Installation

 Installation is as simple as building a jar and dropping into the classpath. There are no other dependencies.

## Samples

  [**Java Samples**](https://github.com/lakshmiDRIP/DROP/tree/master/src/main/java/org/drip/sample)   |   [**Excel Samples**](https://github.com/lakshmiDRIP/DROP/tree/master/Excel)   |   [**Test Data**](https://github.com/lakshmiDRIP/DROP/tree/master/Daemons)

## Documentation

 [**Javadoc API**](https://lakshmidrip.github.io/DROP/Javadoc/index.html) | [**DROP Specifications**](https://github.com/lakshmiDRIP/DROP/tree/master/Docs/Internal) | [**Release Notes**](https://github.com/lakshmiDRIP/DROP/tree/master/ReleaseNotes) | User guide is a work in progress!

## Misc

  [**JUnit Tests**](https://lakshmidrip.github.io/DROP/junit/index.html)   |   [**Jacoco Coverage**](https://lakshmidrip.github.io/DROP/jacoco/index.html)   |   [**Jacoco Session**](https://lakshmidrip.github.io/DROP/jacoco/jacoco-sessions.html)   |   [**Credit Attributions**](https://lakshmidrip.github.io/DROP/credits.html)   |   [**Version Specifications**](https://lakshmidrip.github.io/DROP/version.html)

## Contact

lakshmidrip7977@gmail.com

[![codecov.io](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master/graphs/sunburst.svg)](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master)  [![codecov.io](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master/graphs/icicle.svg)](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master)  [![codecov.io](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master/graphs/tree.svg)](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master)  [![codecov.io](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master/graphs/commits.svg)](https://codecov.io/gh/lakshmiDRIP/DROP/branch/master)  
