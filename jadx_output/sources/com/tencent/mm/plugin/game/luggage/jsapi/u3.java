package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class u3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportGameWeb";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        java.util.TreeMap treeMap = new java.util.TreeMap(new com.tencent.mm.plugin.game.luggage.jsapi.t3(this));
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("type");
        boolean equals = "1".equals(jSONObject.optString("isReportNow"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportGameWeb", "data is null or not json");
            bVar.c("data_is_null", null);
            return;
        }
        if ("1".equals(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportGameWeb", "report web performance, url:%s", ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).s());
            treeMap.put(1000, java.lang.Boolean.valueOf(equals));
            java.util.HashMap hashMap = (java.util.HashMap) sx4.b0.a(optJSONObject);
            for (java.lang.Integer num : hashMap.keySet()) {
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, hashMap.get(num));
                }
            }
            sx4.b0.b(((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).P(), treeMap);
            bVar.a();
            return;
        }
        if (!"2".equals(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportGameWeb", "type is error. type:%s", optString);
            bVar.c("type_not_right", null);
            return;
        }
        treeMap.putAll(((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).M1());
        java.util.HashMap hashMap2 = (java.util.HashMap) sx4.b0.a(optJSONObject);
        for (java.lang.Integer num2 : hashMap2.keySet()) {
            if (!treeMap.containsKey(num2)) {
                treeMap.put(num2, hashMap2.get(num2));
            }
        }
        java.lang.String a17 = sx4.y.a(treeMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportGameWeb", "report web runtime. isReportNow:%b, reportData: [%s]", java.lang.Boolean.valueOf(equals), a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.f(16145, a17, equals, false);
        bVar.a();
    }
}
