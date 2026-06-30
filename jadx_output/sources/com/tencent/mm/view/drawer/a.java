package com.tencent.mm.view.drawer;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f213580d;

    public a(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        this.f213580d = recyclerViewDrawerSquares;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f213580d;
        recyclerViewDrawerSquares.setVisibility(8);
        recyclerViewDrawerSquares.setClosing(false);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener = recyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(false, false, 0);
        }
        com.tencent.mm.ui.tools.f5 keyboardHeightProvider = recyclerViewDrawerSquares.getKeyboardHeightProvider();
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.d();
        }
        recyclerViewDrawerSquares.f213549s = false;
        com.tencent.mm.ui.tools.c5 keyboardHeightObserver = recyclerViewDrawerSquares.getKeyboardHeightObserver();
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.w2(0, false);
        }
    }
}
