package x44;

/* loaded from: classes4.dex */
public final class k0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("weAppUserName");
        java.lang.String str4 = optString == null ? "" : optString;
        java.lang.String optString2 = data.optString("weAppPath");
        java.lang.String str5 = optString2 == null ? "" : optString2;
        int optInt = data.optInt("version");
        data.optInt("miniProgramType");
        java.lang.String optString3 = data.optString("componentId");
        if (optString3 == null) {
            optString3 = "";
        }
        boolean optBoolean = data.optBoolean("openInHalfScreen", false);
        com.tencent.mars.xlog.Log.i("SnsAdJs.JumpApp", "it is going to jump to weapp ".concat(str4));
        if (str4.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.JumpApp", "the we app user name is empty!! ");
            b(g("the we app user name is empty!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
            return;
        }
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.JumpApp", "the activity is null");
            b(g("the activity is null"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
            return;
        }
        if (env.b().d() == 2) {
            m54.l b17 = env.b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            str2 = b17.M;
            if (str2 == null) {
                str2 = "";
            }
            m54.l b18 = env.b();
            b18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBuffer", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBuffer", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            str = b18.L;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
            str2 = str;
        }
        if (data.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            i17 = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.MAX_VALUE);
            com.tencent.mars.xlog.Log.i("SnsAdJs.JumpApp", "h5 scene=" + i17);
            if (i17 != Integer.MAX_VALUE) {
                str3 = "";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2056, 4);
            } else {
                str3 = "";
            }
        } else {
            str3 = "";
            i17 = Integer.MAX_VALUE;
        }
        java.lang.String optString4 = data.optString("sceneNote");
        if (optString4 == null) {
            optString4 = str3;
        }
        if (optString4.length() == 0) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            z17 = false;
            objArr[0] = str2;
            objArr[1] = str;
            objArr[2] = optString3;
            objArr[3] = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
            objArr[4] = java.lang.Integer.valueOf(env.b().d());
            objArr[5] = a54.h.a(env.b());
            java.lang.String k17 = env.b().k();
            if (k17 == null) {
                k17 = str3;
            }
            objArr[6] = k17;
            objArr[7] = java.lang.Integer.valueOf(env.b().l());
            optString4 = java.lang.String.format("%s:%s:%s:%s:%d:%s:%s:%d", java.util.Arrays.copyOf(objArr, 8));
            kotlin.jvm.internal.o.f(optString4, "format(...)");
        } else {
            z17 = false;
            com.tencent.mars.xlog.Log.i("SnsAdJs.JumpApp", "h5 sceneNote=".concat(optString4));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2056, 5);
        }
        java.lang.String str6 = optString4;
        java.lang.String c17 = env.b().c();
        java.lang.String D = (c17 == null || c17.length() == 0) ? true : z17 ? ca4.m0.D(a54.h.a(env.b())) : env.b().c();
        java.lang.String m17 = env.b().m();
        if (m17 == null || m17.length() == 0) {
            z17 = true;
        }
        java.lang.String P = z17 ? ca4.m0.P(a54.h.a(env.b())) : env.b().m();
        if (optBoolean && env.b().s()) {
            ca4.z0.p0(env.a(), str4, str5, java.lang.String.valueOf(optInt), D, P, str6, a54.h.a(env.b()), i17 == Integer.MAX_VALUE ? 1200 : i17);
        } else {
            ca4.z0.q0(env.a(), str4, str5, java.lang.String.valueOf(optInt), D, P, str6, a54.h.a(env.b()), i17 == Integer.MAX_VALUE ? 1084 : i17);
        }
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
    }
}
