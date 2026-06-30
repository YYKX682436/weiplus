package rf4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentsContainer f395049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gf4.a f395050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentItemView f395051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer, gf4.a aVar, com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView) {
        super(0);
        this.f395049d = commentsContainer;
        this.f395050e = aVar;
        this.f395051f = commentItemView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f395049d.f171893d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: comment appear ");
        gf4.a aVar = this.f395050e;
        sb6.append(aVar.f271337h);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        boolean z17 = aVar.f271337h;
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = this.f395051f;
        if (z17) {
            commentItemView.getClass();
            aVar.f271337h = false;
        }
        if (aVar.f271335f) {
            android.graphics.drawable.Drawable background = commentItemView.getMaskView().getBackground();
            if (background instanceof android.graphics.drawable.GradientDrawable) {
                android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(background, "color", commentItemView.getResources().getColor(com.tencent.mm.R.color.f478522a3), commentItemView.getContext().getResources().getColor(com.tencent.mm.R.color.a7g));
                ofInt.setEvaluator(new rf4.b());
                ofInt.setStartDelay(400L);
                ofInt.setDuration(2000L);
                ofInt.start();
            }
            aVar.f271335f = false;
        }
        return jz5.f0.f302826a;
    }
}
