package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class nf extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f209417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNavV2 f209418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f209419f;

    public nf(android.widget.LinearLayout linearLayout, com.tencent.mm.ui.MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f209417d = linearLayout;
        this.f209418e = multiTalkRoomPopupNavV2;
        this.f209419f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f209417d.setVisibility(8);
        android.view.View view = this.f209418e.f196996f;
        if (view != null) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.bce);
        }
        this.f209419f.setListener(null);
    }
}
