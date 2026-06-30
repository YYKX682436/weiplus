package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class mf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f209141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNavV2 f209142f;

    public mf(int i17, int i18, android.widget.LinearLayout linearLayout, float f17, float f18, com.tencent.mm.ui.MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2) {
        this.f209140d = i17;
        this.f209141e = linearLayout;
        this.f209142f = multiTalkRoomPopupNavV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f209140d + ((0 - r0) * animatedFraction);
        android.widget.LinearLayout linearLayout = this.f209141e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) f17;
        linearLayout.setLayoutParams(layoutParams);
        float f18 = 270.0f + ((-180.0f) * animatedFraction);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f209142f.f196995e;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(f18);
    }
}
