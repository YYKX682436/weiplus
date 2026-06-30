package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.mv.ui.view.u f151954d = new com.tencent.mm.plugin.mv.ui.view.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.2f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        return ofFloat;
    }
}
