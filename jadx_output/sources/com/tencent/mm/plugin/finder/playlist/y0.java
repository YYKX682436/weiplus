package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f122494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.playlist.s1 s1Var, java.lang.Long l17, yz5.l lVar) {
        super(0);
        this.f122493d = s1Var;
        this.f122494e = l17;
        this.f122495f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122493d;
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = s1Var.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var.z();
        s1Var.n(this.f122494e, this.f122495f);
        return jz5.f0.f302826a;
    }
}
