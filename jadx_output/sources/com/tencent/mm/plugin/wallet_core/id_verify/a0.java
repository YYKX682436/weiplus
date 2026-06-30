package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes10.dex */
public final class a0 implements zo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zo0.c f179331a;

    public a0(zo0.c cVar) {
        this.f179331a = cVar;
    }

    @Override // zo0.b
    public void a() {
        pm0.v.X(new com.tencent.mm.plugin.wallet_core.id_verify.z(this.f179331a));
    }

    @Override // zo0.b
    public void b(hp0.i resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.plugin.wallet_core.id_verify.y(this.f179331a, resp));
    }
}
