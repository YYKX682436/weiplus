package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f111812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c6 f111813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(org.json.JSONObject jSONObject, com.tencent.mm.plugin.finder.live.plugin.c6 c6Var) {
        super(0);
        this.f111812d = jSONObject;
        this.f111813e = c6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject optJSONObject = this.f111812d.optJSONObject("params");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
        if (!(optString == null || optString.length() == 0)) {
            com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = this.f111813e;
            db5.t7.m(c6Var.f365323d.getContext(), optString);
            com.tencent.mars.xlog.Log.i(c6Var.f112117q, "toastMsg: " + optString);
        }
        return jz5.f0.f302826a;
    }
}
