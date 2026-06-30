package rf4;

/* loaded from: classes4.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395111d;

    public u0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395111d = storyCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int[] iArr = com.tencent.mm.plugin.story.ui.view.StoryCommentView.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommentView", "CommentBubble click");
        com.tencent.mm.plugin.story.ui.view.StoryCommentView.b(this.f395111d, true);
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
