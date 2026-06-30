package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class lf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f209080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNavV2 f209081f;

    public lf(int i17, android.widget.LinearLayout linearLayout, float f17, float f18, com.tencent.mm.ui.MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2) {
        this.f209079d = i17;
        this.f209080e = linearLayout;
        this.f209081f = multiTalkRoomPopupNavV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.widget.LinearLayout linearLayout = this.f209080e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) (this.f209079d * animatedFraction);
        linearLayout.setLayoutParams(layoutParams);
        float f17 = 90.0f + (180.0f * animatedFraction);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f209081f.f196995e;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(f17);
    }
}
