package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.TranslateControllerView f199068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView) {
        super(0);
        this.f199068d = translateControllerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimator.setDuration(200L);
        valueAnimator.addUpdateListener(new com.tencent.mm.ui.chatting.component.en(this.f199068d));
        return valueAnimator;
    }
}
