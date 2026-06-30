package rf4;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        super(0);
        this.f395127d = storyCommentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int[] iArr = com.tencent.mm.plugin.story.ui.view.StoryCommentView.N;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemContainer.onLoop callback currState:");
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395127d;
        sb6.append(storyCommentView.f171969u);
        sb6.append(", itemContainer.isPause:");
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = storyCommentView.f171955d;
        sb6.append(commentsContainer.isPause);
        sb6.append(' ');
        sb6.append(commentsContainer);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommentView", sb6.toString());
        com.tencent.mm.plugin.story.ui.view.CommentsContainer.d(commentsContainer, storyCommentView.f171967s.f291239g, false, 2, null);
        if (storyCommentView.f171969u == 2 && !commentsContainer.isPause) {
            commentsContainer.setOnLoop(null);
            commentsContainer.a();
            commentsContainer.b();
        }
        return jz5.f0.f302826a;
    }
}
