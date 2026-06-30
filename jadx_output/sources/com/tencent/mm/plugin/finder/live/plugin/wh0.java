package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ai0 f114938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f114939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f114938d = ai0Var;
        this.f114939e = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = this.f114938d;
        qo0.c.a(ai0Var.f111888p, qo0.b.D2, null, 2, null);
        org.json.JSONObject optJSONObject = this.f114939e.optJSONObject("params");
        if (!(optJSONObject != null ? optJSONObject.optBoolean("isCancelPromoting", false) : false)) {
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("toastWording", "") : null;
            if (!(optString == null || optString.length() == 0)) {
                db5.t7.h(ai0Var.f365323d.getContext(), optString);
                com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "toastMsg: " + optString);
            }
        }
        return jz5.f0.f302826a;
    }
}
