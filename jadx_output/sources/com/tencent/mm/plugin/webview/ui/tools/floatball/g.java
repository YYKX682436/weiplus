package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class g extends gp1.e0 implements hm0.q {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
        if (ballInfo == null) {
            return;
        }
        java.lang.String key = ballInfo.f93049g;
        kotlin.jvm.internal.o.f(key, "key");
        kVar.c(key);
    }

    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
        com.tencent.mars.xlog.Log.w("MicroMsg.SearchFloatBallMgr", "clearCacheWebViewController");
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184211b;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
            if (oVar != null) {
                com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar2 = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
                com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) oVar.f302841d;
                if (e3Var != null && (z17 = e3Var.L) && z17) {
                    e3Var.y1();
                }
            }
        }
        linkedHashMap.clear();
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.os.Bundle bundle = ballInfo != null ? ballInfo.G : null;
        if (bundle == null) {
            return;
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f412943f = bundle.getBoolean("isHomePage");
        j2Var.f412939b = bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        j2Var.f412940c = bundle.getInt("type", 0);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int i17 = j2Var.f412939b;
        ((sg0.y3) o1Var).getClass();
        j2Var.f412942e = su4.r2.f(i17);
        j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j2Var.f412945h = true;
        j2Var.F = ballInfo.f93049g;
        org.json.JSONObject jSONObject = new org.json.JSONObject(bundle.getString("extParams", "{}"));
        java.lang.String string = bundle.getString("navBarParams");
        if (string != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
            j2Var.f412954q = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            j2Var.f412947j = jSONObject2.optBoolean("hideNavBar");
            boolean optBoolean = jSONObject2.optBoolean("hideSearchBar");
            j2Var.f412946i = optBoolean;
            if (optBoolean) {
                j2Var.f412950m = com.tencent.mm.R.color.f478491c;
            }
            jSONObject.put("hideNavBar", j2Var.f412947j);
            jSONObject.put("hideSearchInput", j2Var.f412946i);
        }
        j2Var.f412944g = d75.b.e(jSONObject, com.tencent.mm.plugin.webview.ui.tools.floatball.f.f184196d);
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
