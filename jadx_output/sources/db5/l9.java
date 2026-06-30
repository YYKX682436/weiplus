package db5;

/* loaded from: classes8.dex */
public final class l9 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNavV2 f228435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f228436e;

    public l9(com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f228435d = talkRoomPopupNavV2;
        this.f228436e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2 = this.f228435d;
        talkRoomPopupNavV2.f197690g.setVisibility(8);
        android.widget.LinearLayout linearLayout = talkRoomPopupNavV2.f197689f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.bce);
        }
        this.f228436e.setListener(null);
    }
}
