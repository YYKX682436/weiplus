package rf4;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentItemView f395066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentsContainer f395067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gf4.a f395068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395069g;

    public i(com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView, com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer, gf4.a aVar, int i17) {
        this.f395066d = commentItemView;
        this.f395067e = commentsContainer;
        this.f395068f = aVar;
        this.f395069g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = this.f395066d;
        android.view.View maskView = commentItemView.getMaskView();
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = this.f395067e;
        android.content.Context context = commentsContainer.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        commentsContainer.getClass();
        int color = context.getResources().getColor(com.tencent.mm.R.color.f478522a3);
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.a7g);
        if (!commentsContainer.isUnread) {
            color = color2;
        }
        float b17 = i65.a.b(context, 24);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(b17);
        maskView.setBackground(gradientDrawable);
        commentItemView.setVisibility(0);
        int measuredHeight = commentItemView.getMeasuredHeight();
        int paddingBottom = commentsContainer.getPaddingBottom();
        int i17 = this.f395069g;
        commentsContainer.f171897h = i65.a.c(commentsContainer.getContext(), i17 - paddingBottom) * 9;
        if (commentsContainer.f171897h <= 0) {
            commentsContainer.f171897h = 4000L;
        }
        long j17 = commentsContainer.f171897h;
        int paddingBottom2 = commentsContainer.getPaddingBottom();
        int i18 = i17 - (measuredHeight / 2);
        rf4.g gVar = new rf4.g(commentsContainer, this.f395068f, commentItemView);
        rf4.h hVar = new rf4.h(commentsContainer, commentItemView);
        commentItemView.f171891p = commentItemView.getMeasuredWidth();
        commentItemView.f171890o = commentItemView.getMeasuredHeight();
        commentItemView.getContentLayout().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = commentItemView.getLayoutParams();
        int i19 = commentItemView.f171889n;
        layoutParams.height = i19;
        layoutParams.width = i19;
        commentItemView.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.CommentItemView", "LogStory: animation start " + i19 + ", " + commentItemView.f171891p + ' ' + commentItemView.f171890o);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = gVar;
        rf4.c cVar = new rf4.c(new android.graphics.PointF(0.05f, 0.1f));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        commentItemView.normalAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(cVar);
        }
        android.animation.ValueAnimator valueAnimator = commentItemView.normalAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(j17);
        }
        android.animation.ValueAnimator valueAnimator2 = commentItemView.normalAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new rf4.e(i18, paddingBottom2, commentItemView, 0.1f, h0Var, hVar));
        }
        android.animation.ValueAnimator valueAnimator3 = commentItemView.normalAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        commentsContainer.f171896g = (i65.a.c(commentsContainer.getContext(), measuredHeight) + 96) * 6;
        if (commentsContainer.f171895f == commentsContainer.f171894e.size() - 1) {
            long j18 = commentsContainer.f171897h;
            commentsContainer.f171896g = j18;
            commentsContainer.postDelayed(commentsContainer.f171903q, j18);
        }
        commentsContainer.postDelayed(commentsContainer.f171902p, commentsContainer.f171896g);
    }
}
