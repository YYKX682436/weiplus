package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class p0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    public static final void f(com.tencent.mm.plugin.game.luggage.jsapi.p0 p0Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<m33.g1> arrayList2;
        p0Var.getClass();
        com.tencent.mm.plugin.game.p0 p0Var2 = (com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        p0Var2.getClass();
        java.util.List J0 = ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).J0(gm0.j1.b().j());
        if (com.tencent.mm.sdk.platformtools.t8.L0(J0)) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) J0).iterator();
            while (it.hasNext()) {
                arrayList.add(p0Var2.oj((p43.a) it.next()));
            }
        }
        if (arrayList != null) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (com.tencent.mm.vfs.w6.j(((m33.g1) obj).f323290d)) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelog.jsapi, JsApiGetLocalMiniGameVideo , allVideoList.size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append("  fileExistVideoList.size = ");
        sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
        com.tencent.mars.xlog.Log.i("getLocalMiniGameVideo", sb6.toString());
        if (arrayList2 == null || arrayList2.isEmpty()) {
            q5Var.a(null, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (m33.g1 g1Var : arrayList2) {
            kotlin.jvm.internal.o.d(g1Var);
            jSONArray.put(p0Var.g(g1Var));
        }
        jSONObject.put("result", jSONArray);
        q5Var.a(null, jSONObject);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "getLocalMiniGameVideo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.o0(e17, this, q5Var));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final org.json.JSONObject g(m33.g1 g1Var) {
        java.lang.String path = g1Var.f323290d;
        kotlin.jvm.internal.o.f(path, "path");
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(path);
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(path, true);
        if (d17 != null) {
            b17.f182754w = d17.a();
            int i17 = d17.f162395n;
            if (i17 == 90 || i17 == 270) {
                b17.f182744p = d17.f162385d;
                b17.f182745q = d17.f162384c;
            } else {
                b17.f182744p = d17.f162384c;
                b17.f182745q = d17.f162385d;
            }
            b17.f182743o = (int) com.tencent.mm.vfs.w6.k(path);
        }
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d18 = com.tencent.mm.plugin.webview.model.m4.d(g1Var.f323293g);
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d18);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", g1Var.f323288b);
        jSONObject.put("appName", g1Var.f323289c);
        java.lang.String str = g1Var.f323294h;
        if (str == null) {
            str = "";
        }
        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
        java.lang.String str2 = g1Var.f323295i;
        jSONObject.put("desc", str2 != null ? str2 : "");
        jSONObject.put("creatTime", g1Var.f323291e);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.COL_LOCALID, b17.f182736e);
        jSONObject2.put("videoId", g1Var.f323287a);
        jSONObject2.put("duration", g1Var.f323292f);
        jSONObject2.put("width", b17.f182744p);
        jSONObject2.put("height", b17.f182745q);
        jSONObject2.put("thumbLocalId", d18.f182736e);
        jSONObject2.put("configJson", g1Var.f323296j);
        jSONObject.put("videoInfo", jSONObject2);
        return jSONObject;
    }
}
