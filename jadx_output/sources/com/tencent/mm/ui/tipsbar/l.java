package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209947e;

    public l(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, int i17) {
        this.f209946d = chatTipsBarGroup;
        this.f209947e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209946d;
        chatTipsBarGroup.f209911m.setClipToOutline(true);
        int height = chatTipsBarGroup.f209906e.getHeight();
        android.view.ViewPropertyAnimator alpha = chatTipsBarGroup.f209910i.animate().alpha(0.0f);
        alpha.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        alpha.setDuration(250L);
        alpha.start();
        alpha.setUpdateListener(new com.tencent.mm.ui.tipsbar.j(chatTipsBarGroup, this.f209947e, height));
        alpha.setListener(new com.tencent.mm.ui.tipsbar.k(alpha, chatTipsBarGroup));
    }
}
