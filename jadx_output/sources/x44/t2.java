package x44;

/* loaded from: classes4.dex */
public final class t2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("qrUrl");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = data.optString("qrExtInfo");
        java.lang.String str2 = optString2 == null ? "" : optString2;
        boolean optBoolean = data.optBoolean("needUpdateQRUrl", false);
        boolean optBoolean2 = data.optBoolean("useLBS", false);
        double optDouble = data.optDouble("latitude", 0.0d);
        double optDouble2 = data.optDouble("longitude", 0.0d);
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        if (optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ScanQRCode", "the qr url is empty!!!");
            b(g("the qr url is empty!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            return;
        }
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ScanQRCode", "the activity is null!!!");
            b(g("the activity is null!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            return;
        }
        if (optBoolean2) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", optDouble);
            jSONObject.put("longitude", optDouble2);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            str = jSONObject2;
        } else {
            str = "";
        }
        java.lang.String o17 = env.b().o();
        java.lang.String str3 = o17 == null ? "" : o17;
        java.lang.String j17 = env.b().j();
        java.lang.String str4 = j17 == null ? "" : j17;
        android.app.Activity a17 = env.a();
        m54.l b17 = env.b();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qrExtInfo", str2);
        bundle.putInt("qrIsDirectJump", 1);
        bundle.putBoolean("qrInitBottomSheet", false);
        ca4.b0 b0Var = new ca4.b0(a17, b17, optInt, bundle);
        if (optBoolean) {
            com.tencent.mars.xlog.Log.i("SnsAdJs.ScanQRCode", "the need update qr url is true");
            x44.n2 n2Var = new x44.n2(this, b0Var, optString);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            gm0.j1.d().a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, new x44.p2(n2Var));
            gm0.j1.d().g(new ib4.m(str, str2, "", str3, "", str4));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        } else {
            p(optString, b0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
    }

    public final void p(java.lang.String str, ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        java.lang.String l17 = za4.t0.l("adId", str);
        if ((l17 == null || l17.length() == 0) || !com.tencent.mm.vfs.w6.j(l17)) {
            x44.s2 s2Var = new x44.s2(this, b0Var, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("download", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            za4.t0.d("adId", str, new x44.o2(str, s2Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("download", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        } else {
            b0Var.k(l17, str, x44.q2.f451880a);
            b(l());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
    }
}
