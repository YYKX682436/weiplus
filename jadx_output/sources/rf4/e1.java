package rf4;

/* loaded from: classes4.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395044d;

    public e1(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395044d = storyCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395044d;
        storyCommentView.f171955d.a();
        storyCommentView.f171955d.setAlpha(1.0f);
    }
}
