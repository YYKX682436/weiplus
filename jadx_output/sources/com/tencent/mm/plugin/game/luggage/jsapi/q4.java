package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.r4 f139740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.game.luggage.jsapi.r4 r4Var) {
        super(2);
        this.f139739d = q5Var;
        this.f139740e = r4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.game.luggage.jsapi.r4 r4Var = this.f139740e;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139739d;
        if (booleanValue) {
            kotlin.jvm.internal.o.d(q5Var);
            q5Var.a(r4Var.f139743e + ":ok", null);
        } else {
            kotlin.jvm.internal.o.d(q5Var);
            if (str == null) {
                str = r4Var.f139743e + ":fail";
            }
            q5Var.a(str, null);
        }
        return jz5.f0.f302826a;
    }
}
