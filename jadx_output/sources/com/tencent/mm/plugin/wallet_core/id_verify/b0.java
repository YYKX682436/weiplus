package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.c0 f179337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo0.c f179339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.wallet_core.id_verify.c0 c0Var, java.lang.String str, zo0.c cVar) {
        super(0);
        this.f179337d = c0Var;
        this.f179338e = str;
        this.f179339f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.wallet_core.id_verify.c0 c0Var = this.f179337d;
        c0Var.f179344a.b(new ip0.a(this.f179338e), c0Var.f179345b, new com.tencent.mm.plugin.wallet_core.id_verify.a0(this.f179339f));
        return jz5.f0.f302826a;
    }
}
