package qx5;

/* loaded from: classes13.dex */
public abstract class x {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.xweb.f1 f1Var;
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.WebView.f220189m;
        com.tencent.xweb.f1 f1Var3 = com.tencent.xweb.f1.WV_KIND_PINUS;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\n   default core type:");
        sb6.append(f1Var3);
        com.tencent.xweb.b m17 = com.tencent.xweb.b.m();
        java.lang.String g17 = m17.g("setwebtype", str);
        com.tencent.xweb.f1 f1Var4 = com.tencent.xweb.f1.WV_KIND_NONE;
        if (g17 != null && !g17.isEmpty()) {
            try {
                f1Var4 = com.tencent.xweb.f1.valueOf(g17);
            } catch (java.lang.Throwable th6) {
                by5.c4.d(m17.n(), "convertWebType error", th6);
            }
        }
        com.tencent.xweb.f1 f1Var5 = com.tencent.xweb.f1.WV_KIND_NONE;
        if (f1Var4 != f1Var5) {
            com.tencent.xweb.b m18 = com.tencent.xweb.b.m();
            java.lang.String g18 = m18.g("setwebtype", str);
            if (g18 != null && !g18.isEmpty()) {
                try {
                    f1Var = com.tencent.xweb.f1.valueOf(g18);
                } catch (java.lang.Throwable th7) {
                    by5.c4.d(m18.n(), "convertWebType error", th7);
                }
                sb6.append("\n   has command type:");
                sb6.append(f1Var);
            }
            f1Var = f1Var5;
            sb6.append("\n   has command type:");
            sb6.append(f1Var);
        } else {
            f1Var = f1Var3;
        }
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        boolean z17 = true;
        if (u0Var.d(str, true) != f1Var5) {
            f1Var = u0Var.d(str, true);
            sb6.append("\n   has abtest type:");
            sb6.append(f1Var);
        }
        if (u0Var.d(str, false) != f1Var5) {
            f1Var = u0Var.d(str, false);
            sb6.append("\n   has hardcode type:");
            sb6.append(f1Var);
        }
        if (f1Var == f1Var3 && !org.xwalk.core.XWalkEnvironment.o()) {
            f1Var = com.tencent.xweb.f1.WV_KIND_SYS;
            sb6.append("\n   prefer sys because xweb is not available");
        }
        if (com.tencent.xweb.t1.f()) {
            f1Var = com.tencent.xweb.f1.WV_KIND_SYS;
            sb6.append("\n   prefer sys because child process monitor hit");
        }
        java.util.List list = by5.q.f36580j;
        synchronized (by5.q.class) {
            if (!by5.d4.e().getBoolean("bIgnoreCrashWatch", false)) {
                if (by5.q.d("LOAD_CORE", f1Var, str).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_LOAD_CORE, module:" + str + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 1);
                } else if (by5.q.d("CREATE_WEBVIEW", f1Var, str).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + str + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 2);
                }
            }
            z17 = false;
        }
        if (z17) {
            sb6.append("\n   will not use ");
            sb6.append(f1Var);
            sb6.append(" because of CrashWatchDog hit");
        }
        sb6.insert(0, " module(" + str + ") webview core type:" + f1Var);
        return sb6.toString();
    }

    public static java.lang.String b(com.tencent.xweb.WebView webView) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n local gray value = ");
        sb6.append(by5.a4.b());
        sb6.append("\n local device gray value = ");
        sb6.append(by5.a4.a());
        sb6.append("\n today gray value = ");
        sb6.append(by5.a4.c());
        sb6.append("\n config period(minutes) = ");
        sb6.append(by5.l0.m() / 60000);
        sb6.append("\n config url = ");
        sb6.append(by5.e4.a());
        sb6.append("\n\n system apilevel = ");
        sb6.append(android.os.Build.VERSION.SDK_INT);
        sb6.append("\n target apilevel = ");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getApplicationInfo().targetSdkVersion);
        sb6.append("\n device brand = ");
        sb6.append(android.os.Build.BRAND);
        sb6.append("\n device model = ");
        sb6.append(android.os.Build.MODEL);
        sb6.append("\n device abi = ");
        sb6.append(by5.a.a());
        sb6.append("\n runtime abi = ");
        sb6.append(by5.a.b());
        sb6.append("\n system webview version = ");
        sb6.append(by5.e.d());
        sb6.append("\n\n XWEB_TEST_MODE:false\n FORCE_XWEB_CORE:false\n NEED_TURN_OFF_DYNAMIC_CODE:false\n THIRD_PARD_RELEASE:false\n\n SHOULD_EMBED_XWEB_CORE:false\n XWEB_EMBED_LIB_MD5_MATCH = true\n EMBED_APK_VERSION(32/64) = 0/0\n embed try installed ver = ");
        sb6.append(by5.d4.a("XWEB_EMBED_INSTALL_" + by5.a.b(), false).getInt("INSTALLED_EMBED_VERSION", -1));
        sb6.append("\n installed ver for arm32 = ");
        sb6.append(org.xwalk.core.XWalkEnvironment.g("armeabi-v7a"));
        sb6.append("\n installed ver for arm64 = ");
        sb6.append(org.xwalk.core.XWalkEnvironment.g("arm64-v8a"));
        sb6.append("\n\n client version = 0x");
        android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
        synchronized (bundle) {
            i17 = bundle.getInt("clientVersion", 0);
        }
        sb6.append(java.lang.Integer.toHexString(i17));
        sb6.append("\n app info = ");
        sb6.append(org.xwalk.core.XWalkEnvironment.dumpAppInfo());
        sb6.append("\n useragent = ");
        sb6.append(webView != null ? webView.getSettings().g() : com.eclipsesource.mmv8.Platform.UNKNOWN);
        java.lang.String str4 = sb6.toString() + "\n\n>>>>>> wechat prefer webview core start >>>>>>\n";
        try {
            str = ((str4 + a("mm") + "\n") + a("tools") + "\n") + a("appbrand") + "\n";
        } catch (java.lang.Throwable th6) {
            str = str4 + "dump module prefer webview core, error";
            by5.c4.g("XWebDebugRuntimeHelper", "dump module prefer webview core, error:" + th6.getMessage());
        }
        java.lang.String str5 = str + "<<<<<< wechat prefer webview core end <<<<<<";
        com.tencent.xweb.b m17 = com.tencent.xweb.b.m();
        m17.getClass();
        try {
            str2 = m17.d();
        } catch (java.lang.Throwable th7) {
            by5.c4.d(m17.n(), "getAbstractInfo error", th7);
            str2 = "";
        }
        if (str2 != null && !str2.isEmpty()) {
            str5 = ((str5 + "\n\n>>>>>> core config commands start >>>>>>\n") + str2) + "<<<<<< core config commands end <<<<<<";
        }
        java.lang.String str6 = ((str5 + "\n\n>>>>>> core scheduler start >>>>>>") + "\n " + zx5.p.Z().c()) + "\n " + zx5.o.b0().c();
        zx5.p Z = zx5.p.Z();
        java.lang.String str7 = ((str6 + "\n\n update match gap backward(update speed) = " + Z.d(Z.f(false))) + "\n update match gap forward(提前更新) = " + Z.d(Z.f(true))) + "\n<<<<<< core scheduler end <<<<<<";
        java.lang.String str8 = "";
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
            if (zx5.p.Z().x()) {
                java.lang.String format = simpleDateFormat.format(new java.util.Date(zx5.p.Z().i().f36564c));
                str8 = (((((((((" going to update to apk ver = " + zx5.p.Z().i().f36574m.f36537e) + "\n update time = " + format) + "\n is patch update = " + zx5.p.Z().i().f36571j) + "\n can use cellular = " + zx5.p.Z().i().f36570i) + "\n updateHourStart = " + zx5.p.Z().i().f36574m.f36552t) + "\n updateHourEnd = " + zx5.p.Z().i().f36574m.f36553u) + "\n versionId = " + zx5.p.Z().i().f36574m.f36551s) + "\n try count = " + zx5.p.Z().i().f36565d) + "\n try use shared core count = " + zx5.p.Z().i().f36566e) + "\n";
            }
            str8 = str8 + " last fetch config time = " + simpleDateFormat.format(new java.util.Date(zx5.p.Z().i().f36562a));
            str3 = str8 + "\n last fetch config abi = " + zx5.p.Z().i().f36563b;
        } catch (java.lang.Throwable th8) {
            by5.c4.g("XWebDebugRuntimeHelper", "dump schedule updateInfo, error:" + th8.getMessage());
            str3 = str8 + "\n dump schedule updateInfo, error";
        }
        return ((str7 + "\n\n>>>>>> schedule updateInfo start >>>>>>\n") + str3) + "\n<<<<<< schedule updateInfo end <<<<<<";
    }

    public static java.lang.String c(com.tencent.xweb.WebView webView) {
        java.lang.String versionInfo;
        if (webView != null) {
            versionInfo = webView.getVersionInfo();
        } else if (com.tencent.xweb.WebView.y0()) {
            versionInfo = "pinus, sdkver:20260502, apkver:" + org.xwalk.core.XWalkEnvironment.d();
        } else if (com.tencent.xweb.WebView.x0()) {
            versionInfo = "sys, sdkver:20260502, sysver:" + by5.e.a();
        } else {
            versionInfo = "unknown, sdkver:20260502";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(versionInfo);
        sb6.append("\nprocess:");
        sb6.append(org.xwalk.core.XWalkEnvironment.getProcessName());
        sb6.append(", module:");
        java.lang.String str = "";
        sb6.append(org.xwalk.core.XWalkEnvironment.m(""));
        java.lang.String sb7 = sb6.toString();
        if (webView == null || webView.getCurrentInstanceWebCoreType() != com.tencent.xweb.f1.WV_KIND_PINUS) {
            return sb7;
        }
        int k17 = org.xwalk.core.XWalkEnvironment.k();
        if (k17 == 0) {
            str = "Single";
        } else if (k17 == 1) {
            str = "Render";
        } else if (k17 == 2) {
            str = "Render&GPU";
        }
        if (org.xwalk.core.XWalkEnvironment.k() == 0) {
            return sb7;
        }
        return (sb7 + "\ntype:" + str) + ", sandbox: " + org.xwalk.core.XWalkEnvironment.e();
    }
}
