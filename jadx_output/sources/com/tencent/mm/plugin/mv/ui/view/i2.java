package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.mv.ui.view.i2 f151871d = new com.tencent.mm.plugin.mv.ui.view.i2();

    public i2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.8f, 0.07f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat.setDuration(300L);
        return ofFloat;
    }
}
