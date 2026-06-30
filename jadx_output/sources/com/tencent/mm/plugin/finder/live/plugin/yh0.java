package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f115199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ai0 f115200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(org.json.JSONObject jSONObject, com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var) {
        super(0);
        this.f115199d = jSONObject;
        this.f115200e = ai0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject optJSONObject = this.f115199d.optJSONObject("params");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
        if (!(optString == null || optString.length() == 0)) {
            com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = this.f115200e;
            db5.t7.m(ai0Var.f365323d.getContext(), optString);
            com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "toastMsg: " + optString);
        }
        return jz5.f0.f302826a;
    }
}
