package md3;

/* loaded from: classes7.dex */
public final class p extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "navigateToMiniProgram";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r26.n0.B(r1, r0, false) != false) goto L14;
     */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: md3.p.t(lc3.a0):void");
    }

    public final void u(lc3.a0 a0Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        mq0.a aVar;
        jz5.l[] lVarArr;
        try {
            java.lang.String str4 = e().f344331a;
            java.lang.String s07 = str4 == null ? "MagicAdMiniProgram" : r26.n0.s0(str4, "-", str4);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = a0Var.optString("appId");
            b1Var.f317012a = a0Var.optString("userName");
            b1Var.f317022f = a0Var.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            b1Var.f317032k = a0Var.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            java.lang.String appId = b1Var.f317014b;
            kotlin.jvm.internal.o.f(appId, "appId");
            java.lang.String optString = a0Var.optString("sceneNote");
            try {
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                b1Var.f317034l = v(s07, appId, optString);
                b1Var.f317016c = a0Var.optInt("envVersionType", 0);
                b1Var.f317035m = a0Var.optInt("preScene", 0);
                b1Var.f317036n = a0Var.optString("preSceneNote");
                b1Var.f317029i0 = a0Var.optString("adInfo");
                if (a0Var.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA) || a0Var.has("privateExtraData")) {
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                    appBrandLaunchReferrer.f77323e = s07;
                    appBrandLaunchReferrer.f77324f = a0Var.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "{}");
                    appBrandLaunchReferrer.f77325g = a0Var.optString("privateExtraData", "{}");
                    appBrandLaunchReferrer.f77322d = 1;
                    b1Var.f317041s = appBrandLaunchReferrer;
                }
                if (a0Var.has("devuin")) {
                    b1Var.f317020e = kk.v.b(a0Var.optString("devuin"));
                }
                if (a0Var.has("adUxInfo")) {
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    persistableBundle.putString("adUxInfo", a0Var.optString("adUxInfo"));
                    b1Var.f317030j = persistableBundle;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiNavigateToMiniProgramServer", "[MBAd] directLaunch: appId:" + b1Var.f317014b + ", enterPath:" + b1Var.f317022f + ", scene:" + b1Var.f317032k + ", sceneNote:" + b1Var.f317034l + ", prescene:" + b1Var.f317035m + ", presceneNote:" + b1Var.f317036n);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
                s().invoke(k());
                aVar = mq0.a.f330518m;
                lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("impl", str);
                str3 = str2;
            } catch (java.lang.Exception e17) {
                e = e17;
                str3 = str2;
            }
            try {
                lVarArr[1] = new jz5.l("strategy", str3);
                w(a0Var, aVar, kz5.c1.k(lVarArr));
            } catch (java.lang.Exception e18) {
                e = e18;
                java.lang.String obj = e.toString();
                com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiNavigateToMiniProgramServer", "[MBAd] directLaunch failed: " + obj, e);
                s().invoke(h(-1, obj));
                w(a0Var, mq0.a.f330519n, kz5.c1.k(new jz5.l("errMsg", "fail: " + obj), new jz5.l("impl", str), new jz5.l("strategy", str3)));
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str3 = str2;
        }
    }

    public final java.lang.String v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String a17;
        if (!kotlin.jvm.internal.o.b(str, "MagicAdMiniProgram")) {
            return str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(':');
        java.lang.String[] strArr = new java.lang.String[5];
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            a17 = gm0.j1.b().j();
            kotlin.jvm.internal.o.d(a17);
        } else {
            a17 = kk.v.a(gm0.m.i());
            kotlin.jvm.internal.o.d(a17);
        }
        strArr[0] = "hash=".concat(a17);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ts=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb7.append(java.lang.System.currentTimeMillis());
        strArr[1] = sb7.toString();
        strArr[2] = "host=";
        strArr[3] = "version=" + o45.wf.f343029g;
        strArr[4] = "device=2";
        sb6.append(u46.l.k(strArr, "&"));
        sb6.append("::");
        sb6.append(str3);
        return sb6.toString();
    }

    public final void w(lc3.a0 a0Var, mq0.a aVar, java.util.Map map) {
        mq0.z zVar;
        java.lang.String str;
        if (a0Var.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) != 1095) {
            return;
        }
        java.lang.String str2 = "";
        java.lang.String optString = a0Var.optString("adUxInfo", "");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            return;
        }
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("uxinfo", optString)), map == null ? kz5.q0.f314001d : map);
        i95.m c17 = i95.n0.c(mq0.d0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mq0.d0.M3((mq0.d0) c17, aVar, m17, null, 4, null);
        try {
            java.lang.String optString2 = a0Var.optString("traceId", "");
            java.lang.String optString3 = a0Var.optString("frameSetName", "");
            java.lang.String optString4 = a0Var.optString("implType", "");
            java.lang.String optString5 = a0Var.optString("bizName", "");
            java.lang.String optString6 = a0Var.optString("bizScene", "");
            switch (aVar.ordinal()) {
                case 19:
                    zVar = mq0.z.f330647u;
                    break;
                case 20:
                    zVar = mq0.z.f330648v;
                    break;
                case 21:
                    zVar = mq0.z.f330649w;
                    break;
                default:
                    zVar = null;
                    break;
            }
            mq0.z zVar2 = zVar;
            if (zVar2 != null) {
                java.util.Map l17 = kz5.c1.l(new jz5.l("apiName", "navigateToMiniProgram"));
                if (optString.length() > 0) {
                    l17.put("uxinfo", optString);
                }
                if (map != null && (str = (java.lang.String) map.get("errMsg")) != null) {
                    str2 = str;
                }
                if (str2.length() > 0) {
                    l17.put("errMsg", str2);
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    kotlin.jvm.internal.o.d(optString5);
                    kotlin.jvm.internal.o.d(optString6);
                    kotlin.jvm.internal.o.d(optString2);
                    kotlin.jvm.internal.o.d(optString3);
                    kotlin.jvm.internal.o.d(optString4);
                    mq0.c0.ig(c0Var, zVar2, optString5, optString6, optString2, optString3, optString4, null, l17, 64, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }
}
