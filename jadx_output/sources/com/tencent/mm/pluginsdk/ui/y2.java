package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f192098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout) {
        super(0);
        this.f192098d = speechInputLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f192098d;
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(speechInputLayout.f189827i, android.animation.PropertyValuesHolder.ofFloat("scaleX", 0.5f, 1.1f, 1.0f), android.animation.PropertyValuesHolder.ofFloat("scaleY", 0.5f, 1.1f, 1.0f));
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofPropertyValuesHolder.addListener(new com.tencent.mm.pluginsdk.ui.x2(speechInputLayout));
        return ofPropertyValuesHolder;
    }
}
