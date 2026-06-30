package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        super(0);
        this.f124202d = j3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f124202d;
        com.tencent.mm.view.RefreshLoadMoreLayout P6 = j3Var.P6();
        kotlin.jvm.internal.o.f(P6, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.profile.uic.r2(j3Var, P6);
    }
}
