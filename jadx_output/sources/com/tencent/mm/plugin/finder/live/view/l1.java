package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView f116450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f116452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView, int i17, boolean z17) {
        super(0);
        this.f116450d = finderLiveAnchorDataPanelView;
        this.f116451e = i17;
        this.f116452f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView = this.f116450d;
        yz5.p onExpandListener = finderLiveAnchorDataPanelView.getOnExpandListener();
        int i17 = this.f116451e;
        boolean z17 = this.f116452f;
        if (onExpandListener != null) {
            onExpandListener.invoke(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        }
        if (finderLiveAnchorDataPanelView.getLayoutParams() == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveAnchorDataPanelView", "animToTargetHeight: layoutParams is null!");
        } else {
            int i18 = finderLiveAnchorDataPanelView.getLayoutParams().height;
            if (i18 != i17) {
                finderLiveAnchorDataPanelView.animate().cancel();
                if (z17) {
                    finderLiveAnchorDataPanelView.animate().setUpdateListener(new com.tencent.mm.plugin.finder.live.view.k1(i17 - i18, finderLiveAnchorDataPanelView, i18)).setDuration(100L).start();
                } else {
                    finderLiveAnchorDataPanelView.getLayoutParams().height = i17;
                    finderLiveAnchorDataPanelView.requestLayout();
                }
            }
        }
        finderLiveAnchorDataPanelView.setRadius(finderLiveAnchorDataPanelView.getContext().getResources().getDimension(z17 ? com.tencent.mm.R.dimen.f479738dv : com.tencent.mm.R.dimen.f479672c9));
        finderLiveAnchorDataPanelView.setBackground(z17 ? new android.graphics.drawable.ColorDrawable(finderLiveAnchorDataPanelView.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_7)) : null);
        return jz5.f0.f302826a;
    }
}
