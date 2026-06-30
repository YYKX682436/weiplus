package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f135017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        super(1);
        this.f135017d = finderPlayListDrawer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a it = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f135017d;
        if (finderPlayListDrawer != null) {
            finderPlayListDrawer.t(it);
        }
        return jz5.f0.f302826a;
    }
}
