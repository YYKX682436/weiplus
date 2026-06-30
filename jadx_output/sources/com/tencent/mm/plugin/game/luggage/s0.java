package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class s0 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.t0 f139965a;

    public s0(com.tencent.mm.plugin.game.luggage.t0 t0Var) {
        this.f139965a = t0Var;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.f139965a.f139968e);
            jSONObject.put("set_cookie", 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyUtil", "onGetA8Key, e:" + e17.getMessage());
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onGetA8KeyUrl";
    }
}
