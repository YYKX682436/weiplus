package com.tencent.mm.view.drawer;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f213582d;

    public c(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        this.f213582d = recyclerViewDrawerSquares;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f213582d;
        recyclerViewDrawerSquares.setAlpha(1.0f);
        recyclerViewDrawerSquares.setTranslationY(recyclerViewDrawerSquares.getHeight());
        recyclerViewDrawerSquares.setVisibility(8);
        recyclerViewDrawerSquares.f213549s = false;
        recyclerViewDrawerSquares.setClosing(false);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener = recyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(false, false, 0);
        }
        com.tencent.mm.ui.tools.f5 keyboardHeightProvider = recyclerViewDrawerSquares.getKeyboardHeightProvider();
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.d();
        }
        com.tencent.mm.ui.tools.c5 keyboardHeightObserver = recyclerViewDrawerSquares.getKeyboardHeightObserver();
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.w2(0, false);
        }
    }
}
