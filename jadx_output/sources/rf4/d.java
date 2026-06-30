package rf4;

/* loaded from: classes4.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentItemView f395033d;

    public d(com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView) {
        this.f395033d = commentItemView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = this.f395033d;
        android.view.ViewGroup.LayoutParams layoutParams = commentItemView.getLayoutParams();
        int i17 = commentItemView.f171889n;
        layoutParams.width = ((int) ((commentItemView.f171891p - i17) * floatValue)) + i17;
        layoutParams.height = i17 + ((int) ((commentItemView.f171890o - i17) * floatValue));
        commentItemView.setLayoutParams(layoutParams);
    }
}
