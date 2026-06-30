package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, long j17, yz5.l lVar) {
        super(0);
        this.f122317d = s1Var;
        this.f122318e = j17;
        this.f122319f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122317d;
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = s1Var.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var.z();
        s1Var.o(this.f122318e, this.f122319f);
        return jz5.f0.f302826a;
    }
}
