package rf4;

/* loaded from: classes4.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentItemView f395040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f395041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395042h;

    public e(int i17, int i18, com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView, float f17, kotlin.jvm.internal.h0 h0Var, yz5.a aVar) {
        this.f395038d = i17;
        this.f395039e = i18;
        this.f395040f = commentItemView;
        this.f395041g = h0Var;
        this.f395042h = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        long j17;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) ((this.f395038d - this.f395039e) * (1 - floatValue));
        float f17 = i17;
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = this.f395040f;
        commentItemView.setTranslationY(f17);
        if (floatValue < 0.1f) {
            float f18 = floatValue / 0.1f;
            commentItemView.setScaleX(f18);
            commentItemView.setScaleY(f18);
            commentItemView.setAlpha((f18 * 0.5f) + 0.5f);
        } else {
            commentItemView.setScaleX(1.0f);
            commentItemView.setScaleY(1.0f);
            commentItemView.setAlpha(1.0f);
            kotlin.jvm.internal.h0 h0Var = this.f395041g;
            yz5.a aVar = (yz5.a) h0Var.f310123d;
            if (aVar != null) {
                aVar.invoke();
            }
            h0Var.f310123d = null;
            if (!commentItemView.f171888m) {
                commentItemView.f171888m = true;
                if (commentItemView.com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT java.lang.String.f271336g) {
                    android.view.ViewGroup.LayoutParams layoutParams = commentItemView.getLayoutParams();
                    layoutParams.width = commentItemView.f171891p;
                    layoutParams.height = commentItemView.f171890o;
                    commentItemView.setLayoutParams(layoutParams);
                    j17 = 0;
                } else {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf4.d(commentItemView));
                    j17 = 300;
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                commentItemView.getContentLayout().setVisibility(0);
                commentItemView.getContentLayout().setAlpha(0.0f);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(commentItemView.getContentLayout(), "alpha", 0.0f, 1.0f);
                ofFloat2.setStartDelay(j17);
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        if (i17 < 100) {
            commentItemView.setAlpha(f17 / 100.0f);
        }
        if (commentItemView.getAlpha() < 0.05f) {
            android.animation.ValueAnimator normalAnimator = commentItemView.getNormalAnimator();
            if (normalAnimator != null) {
                normalAnimator.removeAllUpdateListeners();
            }
            yz5.a aVar2 = this.f395042h;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }
}
