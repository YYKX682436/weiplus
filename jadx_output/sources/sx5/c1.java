package sx5;

/* loaded from: classes13.dex */
public abstract class c1 {
    public static sx5.a a(com.tencent.xweb.f1 f1Var, android.content.Context context, com.tencent.xweb.WebView webView, android.view.View view, java.lang.String str) {
        boolean z17;
        java.lang.ClassLoader b17;
        sx5.b1 b1Var;
        android.content.Context context2 = context;
        boolean h17 = f1Var == com.tencent.xweb.f1.WV_KIND_SYS ? com.tencent.xweb.b.m().h("fullscreen_video_enable_sys_try_runtime", "tools", true) : true;
        by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterface, webCoreType:" + f1Var + ", tryRuntimeVideoNativeInterface:" + h17);
        if (h17) {
            if (com.tencent.xweb.pinus.PSCoreWrapper.getInstance() != null) {
                try {
                    java.lang.Class<?> cls = com.tencent.xweb.pinus.PSCoreWrapper.getInstance().getClass("org.xwalk.core.internal.videofullscreen.XWebNativeInterfaceInternal");
                    if (cls != null) {
                        by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByPinus, try use [runtime] class XWebNativeInterfaceInternal");
                        boolean z18 = context2 instanceof com.tencent.xweb.pinus.PSContextWrapper;
                        android.content.Context context3 = context2;
                        if (!z18) {
                            context3 = new com.tencent.xweb.pinus.PSContextWrapper(webView.getContext(), org.xwalk.core.XWalkEnvironment.d());
                        }
                        android.content.Context context4 = context3;
                        b1Var = new sx5.b1(cls.newInstance());
                        try {
                            b1Var.k(null, webView, view, context4, str);
                            try {
                                b1Var.f413701e.b(b());
                            } catch (java.lang.Throwable th6) {
                                by5.c4.d("VideoNativeInterfaceRuntime", "initConfigs error", th6);
                            }
                            by5.s0.e(1749L, 18L, 1L);
                        } catch (java.lang.Exception e17) {
                            by5.c4.d("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByPinus, init interface error", e17);
                            by5.s0.e(1749L, 65L, 1L);
                        }
                    } else {
                        by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByPinus, try use runtime class XWebNativeInterfaceInternal but bot found");
                    }
                } catch (java.lang.Throwable th7) {
                    by5.c4.c("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByPinus, error:" + android.util.Log.getStackTraceString(th7));
                }
                b1Var = null;
            } else {
                if (org.xwalk.core.XWalkEnvironment.d() == 2852 || org.xwalk.core.XWalkEnvironment.d() == 2853) {
                    by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, ignore because of runtime bug");
                } else {
                    boolean z19 = org.xwalk.core.XWalkEnvironment.n(org.xwalk.core.XWalkEnvironment.d()) == com.tencent.xweb.f1.WV_KIND_PINUS;
                    by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, get class by sys");
                    android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
                    synchronized (bundle) {
                        z17 = bundle.getBoolean("isGPVersion", false);
                    }
                    if (z17) {
                        by5.c4.c("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, gpversion can not load dex");
                    } else {
                        if (z19) {
                            try {
                                b17 = vx5.k.f441374a.b();
                            } catch (java.lang.ClassNotFoundException e18) {
                                by5.c4.d("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, class not found, error", e18);
                            }
                        } else {
                            b17 = null;
                        }
                        if (b17 != null) {
                            java.lang.Class<?> loadClass = b17.loadClass("org.xwalk.core.internal.videofullscreen.XWebNativeInterfaceInternal");
                            try {
                                if (loadClass != null) {
                                    by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, try use [runtime] class XWebNativeInterfaceInternal");
                                    if (vx5.k.f441374a.c(true, com.tencent.xweb.b.m().h("fullscreen_video_enable_init_channels_try_runtime", "tools", true))) {
                                        boolean z27 = context2 instanceof com.tencent.xweb.pinus.PSContextWrapper;
                                        android.content.Context context5 = context2;
                                        if (!z27) {
                                            com.tencent.xweb.pinus.PSContextWrapper pSContextWrapper = new com.tencent.xweb.pinus.PSContextWrapper(webView.getContext(), org.xwalk.core.XWalkEnvironment.d());
                                            pSContextWrapper.f220614m = b17;
                                            context5 = pSContextWrapper;
                                        }
                                        android.content.Context context6 = context5;
                                        b1Var = new sx5.b1(loadClass.newInstance());
                                        try {
                                            b1Var.k(null, webView, view, context6, str);
                                            try {
                                                b1Var.f413701e.b(b());
                                            } catch (java.lang.Throwable th8) {
                                                by5.c4.d("VideoNativeInterfaceRuntime", "initConfigs error", th8);
                                            }
                                            by5.s0.e(1749L, 16L, 1L);
                                        } catch (java.lang.Exception e19) {
                                            by5.c4.d("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, init interface error", e19);
                                            by5.s0.e(1749L, 63L, 1L);
                                        }
                                    } else {
                                        by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, init pinus standalone channel failed");
                                        by5.s0.e(1749L, 19L, 1L);
                                    }
                                } else {
                                    by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, try use runtime class XWebNativeInterfaceInternal but bot found");
                                }
                            } catch (java.lang.Throwable th9) {
                                by5.c4.c("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, error:" + android.util.Log.getStackTraceString(th9));
                            }
                        } else {
                            by5.c4.c("XWebNativeInterfaceFactory", "createXWebNativeInterfaceByOthers, classloader is null");
                        }
                    }
                }
                b1Var = null;
            }
            if (b1Var != null) {
                by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterface, use [runtime] class XWebNativeInterfaceInternal");
                xx5.s.a(f1Var, 2, 1, false, null);
                return b1Var;
            }
        }
        by5.c4.f("XWebNativeInterfaceFactory", "createXWebNativeInterface, use [sdk] class XWebNativeInterface");
        sx5.a1 a1Var = new sx5.a1();
        view.getContext();
        a1Var.f413672f = webView;
        a1Var.f413697z1 = str;
        android.os.Bundle b18 = b();
        a1Var.A1 = b18.getBoolean("fullscreen_video_enable_mute", false);
        a1Var.B1 = b18.getBoolean("fullscreen_video_enable_speed", false);
        by5.c4.f("XWebNativeInterface", "initConfigs, before enableMute:" + a1Var.A1 + ", enableSpeed:" + a1Var.B1);
        java.lang.String str2 = a1Var.f413697z1;
        if (str2 != null && !str2.contains("xwebVideoBridge.xwebToJS_Video_MuteChange")) {
            a1Var.A1 = false;
        }
        java.lang.String str3 = a1Var.f413697z1;
        if (str3 != null && !str3.contains("xwebVideoBridge.xwebToJS_Video_RateChange")) {
            a1Var.B1 = false;
        }
        by5.c4.f("XWebNativeInterface", "initConfigs, after enableMute:" + a1Var.A1 + ", enableSpeed:" + a1Var.B1);
        by5.s0.e(1749L, 15L, 1L);
        xx5.s.a(f1Var, 1, 1, h17, null);
        return a1Var;
    }

    public static android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("fullscreen_video_enable_mute", com.tencent.xweb.b.m().h("fullscreen_video_enable_mute", "tools", false));
        bundle.putBoolean("fullscreen_video_enable_speed", com.tencent.xweb.b.m().h("fullscreen_video_enable_speed", "tools", false));
        return bundle;
    }
}
