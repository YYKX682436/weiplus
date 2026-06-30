package rf4;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView, android.content.Context context) {
        super(2);
        this.f395123d = storyCommentView;
        this.f395124e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        gf4.a comment = (gf4.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(comment, "comment");
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395123d;
        if (booleanValue) {
            com.tencent.mm.plugin.story.ui.view.StoryCommentView.c(storyCommentView);
            java.lang.String str = comment.f271330a;
            storyCommentView.C = str;
            storyCommentView.D = comment.f271334e;
            rf4.a aVar = storyCommentView.f171972x;
            if (aVar != null && (storyCommentInputView = aVar.f395015f) != null) {
                storyCommentInputView.c((java.lang.CharSequence) storyCommentView.B.get(str), storyCommentView.C, true);
            }
        } else {
            int i17 = comment.f271341l;
            android.content.Context context = this.f395124e;
            java.lang.String string = i17 == 0 ? context.getResources().getString(com.tencent.mm.R.string.jlm) : context.getResources().getString(com.tencent.mm.R.string.jlo);
            kotlin.jvm.internal.o.d(string);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(string);
            u1Var.n(context.getString(com.tencent.mm.R.string.f490367t0));
            u1Var.k(-65536);
            u1Var.a(true);
            u1Var.b(new rf4.w0(storyCommentView, comment));
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
