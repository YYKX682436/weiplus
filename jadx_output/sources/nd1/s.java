package nd1;

/* loaded from: classes7.dex */
public final class s {
    public s(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(nd1.s sVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs jsApiNavigateToWC$LaunchArgs) {
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig bgShapeConf;
        int i17;
        boolean z17;
        boolean z18;
        k91.y3 o17;
        sVar.getClass();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = jsApiNavigateToWC$LaunchArgs.f82495f.L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        boolean c17 = halfScreenConfig.c();
        android.os.Bundle bundle = jsApiNavigateToWC$LaunchArgs.f82494e;
        boolean z19 = bundle.getBoolean("halfEnable", c17);
        boolean z27 = bundle.getBoolean("enableFullScreenGesture", halfScreenConfig.f77364n);
        boolean z28 = bundle.getBoolean("autoFullScreenWhenTap", halfScreenConfig.A);
        boolean z29 = bundle.getBoolean("forbidSlidingUpGesture", halfScreenConfig.f77369s);
        boolean z37 = bundle.getBoolean("forbidGestureWhenFullScreen", halfScreenConfig.f77356J);
        boolean z38 = bundle.getBoolean("forceLightMode", halfScreenConfig.f77361h);
        boolean z39 = bundle.getBoolean("showBgMask", halfScreenConfig.f77371u);
        if (bundle.containsKey("shapeConfig")) {
            android.os.Bundle bundle2 = bundle.getBundle("shapeConfig");
            bgShapeConf = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), bundle2 != null ? bundle2.getBoolean("topLeft", false) : false, bundle2 != null ? bundle2.getBoolean("topRight", false) : false, bundle2 != null ? bundle2.getBoolean("topRight", false) : false, bundle2 != null ? bundle2.getBoolean("bottomRight", false) : false);
        } else {
            bgShapeConf = halfScreenConfig.f77360g;
        }
        if (bundle.containsKey("height")) {
            double d17 = bundle.getDouble("height");
            if (java.lang.Double.isNaN(d17)) {
                i17 = -1;
            } else {
                if (!(d17 == 0.0d)) {
                    i17 = vp0.b.b(java.lang.Double.valueOf(d17));
                }
                i17 = -2;
            }
        } else {
            if (halfScreenConfig.c()) {
                i17 = halfScreenConfig.f77357d;
            }
            i17 = -2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("halfRestartAppBrandImpl.url=");
        java.lang.String str = jsApiNavigateToWC$LaunchArgs.f82493d;
        sb6.append(str);
        sb6.append(",halfSingleValue=");
        sb6.append(z19);
        sb6.append(",height=");
        sb6.append(i17);
        sb6.append(",enableFullScreenGesture=");
        sb6.append(z27);
        sb6.append(",context=");
        sb6.append(context.getClass().getName());
        sb6.append(",isFinish=");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToWC", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = jsApiNavigateToWC$LaunchArgs.f82495f;
        b1Var.f317014b = appBrandInitConfigWC.f77278d;
        b1Var.f317022f = str;
        java.lang.Integer num = jsApiNavigateToWC$LaunchArgs.f82496g;
        b1Var.f317032k = num != null ? num.intValue() : 0;
        java.lang.String str2 = jsApiNavigateToWC$LaunchArgs.f82497h;
        if (str2 == null) {
            str2 = "";
        }
        b1Var.f317034l = str2;
        com.tencent.mm.plugin.appbrand.config.l e17 = appBrandInitConfigWC.L1.e();
        if (z19) {
            e17.f77521a = true;
            e17.f77533m = z29;
            e17.E = z37;
            e17.f77522b = i17;
            e17.f77532l = z27;
            e17.f77542v = z28;
            k91.s2 activityAnimStyle = bundle.containsKey("usePushAnimation") ? bundle.getBoolean("usePushAnimation", false) ? k91.s2.f305761e : k91.s2.f305760d : halfScreenConfig.f77358e;
            kotlin.jvm.internal.o.g(activityAnimStyle, "activityAnimStyle");
            e17.f77526f = activityAnimStyle;
            e17.f77530j = z38;
            e17.f77539s = z39;
            kotlin.jvm.internal.o.g(bgShapeConf, "bgShapeConf");
            e17.f77529i = bgShapeConf;
        } else {
            e17.f77521a = false;
            e17.f77532l = false;
            e17.f77542v = false;
        }
        b1Var.G = e17.a();
        if (z19) {
            k91.y3 y3Var = k91.y3.DEFAULT;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        } else {
            boolean containsKey = bundle.containsKey("usePushAnimation");
            k91.y3 y3Var2 = k91.y3.SLIDE;
            k91.y3 y3Var3 = k91.y3.POPUP;
            if (containsKey) {
                z17 = false;
                z18 = true;
                o17 = bundle.getBoolean("usePushAnimation", false) ? y3Var2 : y3Var3;
            } else {
                z17 = false;
                z18 = true;
                o17 = appBrandInitConfigWC.o();
            }
            b1Var.S = o17;
            if (!bundle.containsKey("usePushAnimation")) {
                y3Var2 = appBrandInitConfigWC.q();
            } else if (bundle.getBoolean("usePushAnimation", z17) != z18) {
                y3Var2 = y3Var3;
            }
            b1Var.T = y3Var2;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
