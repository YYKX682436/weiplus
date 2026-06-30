package rf4;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentsContainer f395055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentItemView f395056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer, com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView) {
        super(0);
        this.f395055d = commentsContainer;
        this.f395056e = commentItemView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = this.f395055d;
        java.lang.String str = commentsContainer.f171893d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: remove ");
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = this.f395056e;
        sb6.append(commentItemView);
        sb6.append(' ');
        sb6.append(commentItemView.getParent());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        commentsContainer.removeView(commentItemView);
        return jz5.f0.f302826a;
    }
}
