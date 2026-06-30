package gt;

/* loaded from: classes7.dex */
public class a5 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 19) {
            if (i17 != 19 || ballInfo.G == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
            java.lang.String string = ballInfo.G.getString("appId");
            com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent appBrandVoIP1v1FloatBallEvent = new com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent();
            appBrandVoIP1v1FloatBallEvent.f82474d = 1;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(string, appBrandVoIP1v1FloatBallEvent);
            return;
        }
        if (i17 == 1 && i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoRemoved, appbrand content float ball");
            java.lang.String string2 = ballInfo.G.getString("appId");
            com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent appBrandFloatBallHelper$AppBrandContentFloatBallEvent = new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent();
            appBrandFloatBallHelper$AppBrandContentFloatBallEvent.f78058d = 1;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(string2, appBrandFloatBallHelper$AppBrandContentFloatBallEvent);
        }
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        if (ballInfo != null && (i17 = ballInfo.f93046d) == 1 && i17 == 1 && ballInfo.G != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoAdded, appbrand content float ball");
            java.lang.String string = ballInfo.G.getString("appId");
            com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent appBrandFloatBallHelper$AppBrandContentFloatBallEvent = new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent();
            appBrandFloatBallHelper$AppBrandContentFloatBallEvent.f78058d = 2;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(string, appBrandFloatBallHelper$AppBrandContentFloatBallEvent);
        }
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.appbrand.service.h6 h6Var;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var2;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var3;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var4;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var5;
        if (ballInfo == null) {
            return;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 1 || (i17 == 20 && ballInfo.f93047e == 1)) {
            if (ballInfo.G != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoClicked, openAppBrand ballInfo:%s", ballInfo);
                java.lang.String string = ballInfo.G.getString("appId");
                java.lang.String string2 = ballInfo.G.getString(dm.i4.COL_USERNAME);
                int i18 = ballInfo.G.getInt("versionType");
                if ((com.tencent.mm.sdk.platformtools.t8.K0(string2) && com.tencent.mm.sdk.platformtools.t8.K0(string)) || (h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "openAppBrand, launch:%s#%s", string, java.lang.Integer.valueOf(i18));
                if (!rh1.b.a()) {
                    com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                    appBrandStatObject.f87790f = 1131;
                    ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string2, string, i18, -1, null, appBrandStatObject);
                    return;
                }
                l81.b1 b1Var = new l81.b1();
                b1Var.f317012a = string2;
                b1Var.f317014b = string;
                b1Var.f317016c = i18;
                b1Var.f317018d = -1;
                b1Var.f317022f = null;
                b1Var.f317032k = 1131;
                b1Var.f317019d0 = true;
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
                return;
            }
            return;
        }
        if (i17 == 17) {
            if (i17 == 17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string3 = ballInfo.G.getString("appId");
                java.lang.String string4 = ballInfo.G.getString(dm.i4.COL_USERNAME);
                int i19 = ballInfo.G.getInt("versionType");
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject2.f87790f = 1131;
                if ((com.tencent.mm.sdk.platformtools.t8.K0(string4) && com.tencent.mm.sdk.platformtools.t8.K0(string3)) || (h6Var5 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "openAppBrand, launch:%s#%s", string3, java.lang.Integer.valueOf(i19));
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var5).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string4, string3, i19, -1, null, appBrandStatObject2);
                return;
            }
            return;
        }
        if (i17 == 19) {
            if (i17 == 19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string5 = ballInfo.G.getString("appId");
                java.lang.String string6 = ballInfo.G.getString(dm.i4.COL_USERNAME);
                int i27 = ballInfo.G.getInt("versionType");
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject3 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject3.f87790f = 1131;
                if ((com.tencent.mm.sdk.platformtools.t8.K0(string6) && com.tencent.mm.sdk.platformtools.t8.K0(string5)) || (h6Var4 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "openAppBrand, launch:%s#%s", string5, java.lang.Integer.valueOf(i27));
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var4).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string6, string5, i27, -1, null, appBrandStatObject3);
                return;
            }
            return;
        }
        if (i17 == 40) {
            com.tencent.mm.plugin.appbrand.floatball.k1.w0(ballInfo);
            return;
        }
        if (i17 == 7) {
            if (rh1.b.a() && ballInfo.f93046d == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string7 = ballInfo.G.getString("appId");
                java.lang.String string8 = ballInfo.G.getString(dm.i4.COL_USERNAME);
                int i28 = ballInfo.G.getInt("versionType");
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject4 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject4.f87790f = 1131;
                if ((com.tencent.mm.sdk.platformtools.t8.K0(string8) && com.tencent.mm.sdk.platformtools.t8.K0(string7)) || (h6Var3 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "openAppBrand, launch:%s#%s", string7, java.lang.Integer.valueOf(i28));
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var3).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string8, string7, i28, -1, null, appBrandStatObject4);
                return;
            }
            return;
        }
        if (i17 == 33 && rh1.b.a() && ballInfo.f93046d == 33) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
            java.lang.String string9 = ballInfo.G.getString("appId");
            java.lang.String string10 = ballInfo.G.getString(dm.i4.COL_USERNAME);
            int i29 = ballInfo.G.getInt("versionType");
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject5 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject5.f87790f = 1131;
            if ((com.tencent.mm.sdk.platformtools.t8.K0(string10) && com.tencent.mm.sdk.platformtools.t8.K0(string9)) || (h6Var2 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "openAppBrand, launch:%s#%s", string9, java.lang.Integer.valueOf(i29));
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var2).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string10, string9, i29, -1, null, appBrandStatObject5);
        }
    }
}
