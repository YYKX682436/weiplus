package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f202999e;

    public m0(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, android.view.View view) {
        this.f202999e = mMChattingListView;
        this.f202998d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.f202999e;
        android.graphics.Rect rect = mMChattingListView.W;
        android.view.View view = this.f202998d;
        view.getGlobalVisibleRect(rect);
        mMChattingListView.W.top = view.getTop();
        mMChattingListView.W.bottom = view.getBottom();
        mMChattingListView.f202844p0.setAlpha((int) (((java.lang.Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
        mMChattingListView.T.postInvalidate();
    }
}
