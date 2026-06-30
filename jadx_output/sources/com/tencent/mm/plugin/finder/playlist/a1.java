package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        super(0);
        this.f122253d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122253d;
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = s1Var.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var.z();
        s1Var.n(null, null);
        return jz5.f0.f302826a;
    }
}
