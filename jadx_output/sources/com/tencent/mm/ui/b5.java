package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference f197211d;

    public b5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference tingIconViewTipPreference) {
        this.f197211d = tingIconViewTipPreference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference tingIconViewTipPreference = this.f197211d;
        if (tingIconViewTipPreference.h() == null) {
            return;
        }
        android.view.View h17 = tingIconViewTipPreference.h();
        android.content.Context context = tingIconViewTipPreference.Y1;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(h17, "backgroundColor", context.getColor(com.tencent.mm.R.color.f478491c), context.getColor(com.tencent.mm.R.color.f479502a45), context.getColor(com.tencent.mm.R.color.f478491c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.addListener(new tg5.a(tingIconViewTipPreference));
        ofInt.start();
    }
}
