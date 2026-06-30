package rf4;

/* loaded from: classes4.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395048d;

    public f1(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395048d = storyCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395048d;
        storyCommentView.f171957f.getClass();
        int[] iArr = com.tencent.mm.plugin.story.ui.view.StoryCommentView.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommentView", "LogStory: comment recycler count is " + storyCommentView.f171956e.getChildCount());
        int childCount = storyCommentView.f171956e.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = storyCommentView.f171956e.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.story.ui.view.CommentItemView) {
                com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = (com.tencent.mm.plugin.story.ui.view.CommentItemView) childAt;
                long childCount2 = (storyCommentView.f171956e.getChildCount() - i17) * 30;
                float b17 = (r5 + 1) * i65.a.b(commentItemView.getContext(), 16);
                commentItemView.setAlpha(0.0f);
                commentItemView.setTranslationY(b17);
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(commentItemView, "translationY", b17, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setStartDelay(childCount2);
                ofFloat.start();
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(commentItemView, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(150L);
                ofFloat2.setStartDelay(childCount2);
                ofFloat2.start();
            }
        }
    }
}
