package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLikeDrawer f136632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer) {
        super(1);
        this.f136632d = finderLikeDrawer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a it = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f136632d;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.t(it);
        }
        return jz5.f0.f302826a;
    }
}
