package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.finder.playlist.p2 p2Var) {
        super(0);
        this.f122332d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122332d;
        com.tencent.mm.plugin.finder.playlist.s2 s2Var = p2Var.f122397c;
        if (s2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var.f();
        p2Var.b();
        return jz5.f0.f302826a;
    }
}
