package com.tencent.mm.view.drawer;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f213583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares, int i17) {
        super(0);
        this.f213583d = recyclerViewDrawerSquares;
        this.f213584e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f213583d;
        recyclerViewDrawerSquares.setOpening(false);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener = recyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(true, false, this.f213584e);
        }
        return jz5.f0.f302826a;
    }
}
