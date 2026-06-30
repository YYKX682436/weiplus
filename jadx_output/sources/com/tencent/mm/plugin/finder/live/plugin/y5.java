package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c6 f115155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f115156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.finder.live.plugin.c6 c6Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f115155d = c6Var;
        this.f115156e = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = this.f115155d;
        qo0.c.a(c6Var.f112116p, qo0.b.A2, null, 2, null);
        org.json.JSONObject optJSONObject = this.f115156e.optJSONObject("params");
        if (!(optJSONObject != null ? optJSONObject.optBoolean("isCancelPromoting", false) : false)) {
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("toastWording", "") : null;
            if (!(optString == null || optString.length() == 0)) {
                db5.t7.h(c6Var.f365323d.getContext(), optString);
                com.tencent.mars.xlog.Log.i(c6Var.f112117q, "toastMsg: " + optString);
            }
        }
        return jz5.f0.f302826a;
    }
}
