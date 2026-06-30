package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zx implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel f120615d;

    public zx(com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel finderLiveViewBottomSheetPanel) {
        this.f120615d = finderLiveViewBottomSheetPanel;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel finderLiveViewBottomSheetPanel = this.f120615d;
        sb6.append(finderLiveViewBottomSheetPanel.getHeight());
        com.tencent.mars.xlog.Log.i("FinderLiveViewBottomSheetPanel", sb6.toString());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(finderLiveViewBottomSheetPanel, finderLiveViewBottomSheetPanel.getHeight());
        finderLiveViewBottomSheetPanel.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
