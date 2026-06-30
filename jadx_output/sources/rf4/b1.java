package rf4;

/* loaded from: classes4.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395024d;

    public b1(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395024d = storyCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395024d;
        storyCommentView.f171956e.setVisibility(8);
        storyCommentView.f171956e.setAlpha(1.0f);
    }
}
