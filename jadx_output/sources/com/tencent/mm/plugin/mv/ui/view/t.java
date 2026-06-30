package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.mv.ui.view.t f151948d = new com.tencent.mm.plugin.mv.ui.view.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.2f, 1.0f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        return ofFloat;
    }
}
