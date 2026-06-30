package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class nd {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f174129a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f174130b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f174131c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f174132d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f174133e;

    public nd(boolean z17) {
        this.f174129a = z17;
    }

    public final void a(android.widget.FrameLayout frameLayout) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleX", 1.2f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleY", 1.2f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
        frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
        frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.start();
    }

    public final void b(com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout, android.widget.FrameLayout frameLayout, boolean z17) {
        kk4.b player;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        boolean s17 = ((kk4.v) player).s();
        boolean z18 = this.f174131c;
        if (z17) {
            s17 = s17 && z18;
        }
        if (s17) {
            kk4.b.i(player, false, false, 3, null);
            a(frameLayout);
        }
        this.f174131c = false;
    }
}
