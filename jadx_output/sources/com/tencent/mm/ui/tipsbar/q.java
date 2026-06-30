package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209949d;

    public q(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup) {
        this.f209949d = chatTipsBarGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209949d;
        chatTipsBarGroup.setTranslationY(-chatTipsBarGroup.getMeasuredHeight());
        chatTipsBarGroup.setAlpha(1.0f);
        android.view.ViewPropertyAnimator translationY = chatTipsBarGroup.animate().translationY(0.0f);
        translationY.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        translationY.setDuration(200L);
        translationY.start();
    }
}
