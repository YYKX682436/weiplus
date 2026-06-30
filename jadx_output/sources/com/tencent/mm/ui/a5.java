package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.websearch.WebSearchTipPreference f197118d;

    public a5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference) {
        this.f197118d = webSearchTipPreference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference = this.f197118d;
        android.view.View h17 = webSearchTipPreference.h();
        android.content.Context context = webSearchTipPreference.Y1;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(h17, "backgroundColor", context.getColor(com.tencent.mm.R.color.f478491c), context.getColor(com.tencent.mm.R.color.f479502a45), context.getColor(com.tencent.mm.R.color.f478491c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.addListener(new zk5.a(webSearchTipPreference));
        ofInt.start();
    }
}
