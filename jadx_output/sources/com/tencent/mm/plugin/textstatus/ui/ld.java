package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class ld extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.nd f174057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f174058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(com.tencent.mm.plugin.textstatus.ui.nd ndVar, android.widget.FrameLayout frameLayout) {
        super(3);
        this.f174057d = ndVar;
        this.f174058e = frameLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.widget.FrameLayout frameLayout;
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.textstatus.ui.nd ndVar = this.f174057d;
        if (!ndVar.f174130b && (frameLayout = this.f174058e) != null) {
            if (!ndVar.f174129a || ndVar.f174132d) {
                frameLayout.performHapticFeedback(4);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleX", 1.0f, 1.2f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleY", 1.0f, 1.2f);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f, 1.0f);
            frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
            frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.start();
            ndVar.f174130b = true;
        }
        return jz5.f0.f302826a;
    }
}
