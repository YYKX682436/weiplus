package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TopStoryIconViewTipPreference f212600d;

    public z4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference) {
        this.f212600d = topStoryIconViewTipPreference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference = this.f212600d;
        android.view.View view = topStoryIconViewTipPreference.Z1;
        android.content.Context context = topStoryIconViewTipPreference.f196697j2;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(view, "backgroundColor", context.getColor(com.tencent.mm.R.color.f478491c), context.getColor(com.tencent.mm.R.color.f479502a45), context.getColor(com.tencent.mm.R.color.f478491c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new v4.b());
        ofInt.addListener(new com.tencent.mm.ui.wj(topStoryIconViewTipPreference));
        ofInt.start();
    }
}
