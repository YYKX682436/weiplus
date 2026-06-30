package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class m1 implements q80.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView f116469a;

    public m1(com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView) {
        this.f116469a = finderLiveAnchorDataPanelView;
    }

    @Override // q80.u
    public void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView = this.f116469a;
        int dimensionPixelOffset = finderLiveAnchorDataPanelView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        int a17 = f18 > 0.0f ? ym5.x.a(finderLiveAnchorDataPanelView.getContext(), f18) : dimensionPixelOffset;
        boolean z17 = a17 > dimensionPixelOffset * 2;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorDataPanelView", "onBodySizeChange: isExpand=" + z17 + ", realHeight=" + a17 + ", appId=" + str + ", width=" + f17 + ", height=" + f18 + ", appUuid=" + j17 + ", pageId=" + j18);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.l1(finderLiveAnchorDataPanelView, a17, z17));
    }
}
