package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190688d;

    public v0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190688d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setFloatValues(1.0f, 0.0f);
        valueAnimator.setDuration(150L);
        valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator.start();
        valueAnimator.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.t0(this));
        valueAnimator.addListener(new com.tencent.mm.pluginsdk.ui.chat.u0(this));
    }
}
