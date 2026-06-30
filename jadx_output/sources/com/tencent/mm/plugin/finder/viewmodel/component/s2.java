package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFavDrawer f135852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer) {
        super(1);
        this.f135852d = finderFavDrawer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a it = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = this.f135852d;
        if (finderFavDrawer != null) {
            finderFavDrawer.h(it);
        }
        return jz5.f0.f302826a;
    }
}
