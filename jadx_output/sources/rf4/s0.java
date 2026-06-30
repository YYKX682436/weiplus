package rf4;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395105d;

    public s0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395105d = storyCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395105d;
        storyCommentView.f171959h.animate().cancel();
        storyCommentView.f171959h.animate().alpha(0.0f).withEndAction(new rf4.r0(storyCommentView)).start();
    }
}
