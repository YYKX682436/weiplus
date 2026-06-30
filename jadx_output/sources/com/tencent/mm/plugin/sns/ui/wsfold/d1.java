package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class d1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f171353d;

    public d1(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f171353d = wxRecyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldMainUIC", "changeToNormalData onGlobalLayout");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f171353d;
        wxRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        wxRecyclerView.scrollTo(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$2");
    }
}
