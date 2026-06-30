package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class q9 implements q80.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView f116607a;

    public q9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView) {
        this.f116607a = finderLiveProductSizeAssistPanelView;
    }

    @Override // q80.u
    public void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView = this.f116607a;
        int dimensionPixelOffset = finderLiveProductSizeAssistPanelView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        int a17 = f18 > 0.0f ? ym5.x.a(finderLiveProductSizeAssistPanelView.getContext(), f18) : dimensionPixelOffset;
        boolean z17 = a17 > dimensionPixelOffset * 2;
        int a18 = f17 > 0.0f ? ym5.x.a(finderLiveProductSizeAssistPanelView.getContext(), f17) : finderLiveProductSizeAssistPanelView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479663c1);
        com.tencent.mars.xlog.Log.i("FinderLiveProductSizeAssistPanelView", "onBodySizeChange: isExpand=" + z17 + ", realHeight=" + a17 + ", appId=" + str + ", width=" + f17 + ", height=" + f18 + ", appUuid=" + j17 + ", pageId=" + j18);
        finderLiveProductSizeAssistPanelView.f116086g = a17;
        if (finderLiveProductSizeAssistPanelView.getLayoutParams().height > a17) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.p9(finderLiveProductSizeAssistPanelView, a17, a18));
    }
}
