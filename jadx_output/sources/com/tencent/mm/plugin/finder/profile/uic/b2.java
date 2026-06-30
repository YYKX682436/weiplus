package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j2 f123549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.profile.uic.j2 j2Var) {
        super(0);
        this.f123549d = j2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = this.f123549d.getRlLayout();
        kotlin.jvm.internal.o.f(rlLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.view.mj(rlLayout);
    }
}
