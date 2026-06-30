package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class f0 implements o13.x {
    public f0(com.tencent.mm.plugin.websearch.q0 q0Var) {
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mm.plugin.websearch.o0 o0Var = (com.tencent.mm.plugin.websearch.o0) vVar.f351156a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener ret %d, webViewId %s", java.lang.Integer.valueOf(vVar.f351158c), java.lang.Integer.valueOf(o0Var.f181578s));
        if (vVar.f351158c == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("ret", 0);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (p13.y yVar : vVar.f351160e) {
                    if (yVar.f351190h != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(yVar.f351190h);
                        jSONObject2.put("timeStamp", yVar.f351188f);
                        jSONArray2.put(jSONObject2);
                    }
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("items", jSONArray2);
                jSONArray.put(jSONObject3);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray);
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.websearch.e0(this, o0Var, jSONObject));
        }
    }
}
