package db5;

/* loaded from: classes8.dex */
public final class j9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNavV2 f228414e;

    public j9(int i17, com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2, float f17, float f18) {
        this.f228413d = i17;
        this.f228414e = talkRoomPopupNavV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2 = this.f228414e;
        android.view.ViewGroup.LayoutParams layoutParams = talkRoomPopupNavV2.f197690g.getLayoutParams();
        layoutParams.height = (int) (this.f228413d * animatedFraction);
        talkRoomPopupNavV2.f197690g.setLayoutParams(layoutParams);
        float f17 = 90.0f + (180.0f * animatedFraction);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = talkRoomPopupNavV2.f197700t;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(f17);
    }
}
