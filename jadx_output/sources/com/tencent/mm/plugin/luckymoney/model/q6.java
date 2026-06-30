package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q6 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o6 f145564a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wv3 f145565b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f145566c;

    public static com.tencent.mm.plugin.luckymoney.model.q6 a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            com.tencent.mm.plugin.luckymoney.model.q6 q6Var = new com.tencent.mm.plugin.luckymoney.model.q6();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("operation");
            if (optJSONObject != null) {
                q6Var.f145564a = com.tencent.mm.plugin.luckymoney.model.g5.h(optJSONObject);
            }
            q6Var.f145565b = com.tencent.mm.plugin.luckymoney.model.g5.b(jSONObject.optJSONObject(ya.b.SOURCE));
            q6Var.f145566c = com.tencent.mm.plugin.luckymoney.model.g5.i(jSONObject.optJSONArray("upright_corner_list"));
            return q6Var;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShowSourceOpen", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
