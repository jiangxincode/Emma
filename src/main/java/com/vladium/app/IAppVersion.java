/* Copyright (C) 2003 Vladimir Roubtsov. All rights reserved.
 * 
 * This program and the accompanying materials are made available under
 * the terms of the Common Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/cpl-v10.html
 * 
 * $Id: IAppVersion.java,v 1.1.1.1 2004/05/09 16:57:28 vlad_r Exp $
 */
package com.vladium.app;

// ----------------------------------------------------------------------------
/**
 * @author Vlad Roubtsov, (C) 2003
 */
public interface IAppVersion {
    // public: ................................................................

    // filled in by the build:

    int APP_MAJOR_VERSION = /* @APP_MAJOR_VERSION@ */ 2;
    int APP_MINOR_VERSION = /* @APP_MINOR_VERSION@ */ 1;

    int APP_BUILD_ID = /* @APP_BUILD_ID@ */ 0;
    String APP_BUILD_RELEASE_TAG = /* @APP_BUILD_RELEASE_TAG@ */ "fixed";
    String APP_BUILD_DATE = /* @APP_BUILD_DATE@ */ "2013-06-22";

    String APP_BUG_REPORT_LINK = /* @APP_BUG_REPORT_LINK@ */ "https://github.com/jiangxincode/Emma";
    String APP_HOME_SITE_LINK = /* @APP_HOME_SITE_LINK@ */ "http://emma.sourceforge.net/index.htmls";

    // derived properties [must be compile-time consts]:

    String APP_BUILD_ID_AND_TAG = "" + APP_BUILD_ID + APP_BUILD_RELEASE_TAG;

    String APP_VERSION = "" + APP_MAJOR_VERSION + "." + APP_MINOR_VERSION;
    String APP_VERSION_WITH_BUILD_ID_AND_TAG = APP_VERSION + "." + APP_BUILD_ID_AND_TAG;

} // end of interface
// ----------------------------------------------------------------------------
