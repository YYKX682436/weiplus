package db5;

/* loaded from: classes8.dex */
public final class k9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNavV2 f228425e;

    public k9(int i17, int i18, com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2, float f17, float f18) {
        this.f228424d = i17;
        this.f228425e = talkRoomPopupNavV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f228424d + ((0 - r0) * animatedFraction);
        com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2 = this.f228425e;
        android.view.ViewGroup.LayoutParams layoutParams = talkRoomPopupNavV2.f197690g.getLayoutParams();
        layoutParams.height = (int) f17;
        talkRoomPopupNavV2.f197690g.setLayoutParams(layoutParams);
        float f18 = 270.0f + ((-180.0f) * animatedFraction);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = talkRoomPopupNavV2.f197700t;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(f18);
    }
}
