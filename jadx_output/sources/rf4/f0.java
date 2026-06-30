package rf4;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395047d;

    public f0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        this.f395047d = storyCommentInputView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395047d;
        storyCommentInputView.setKeyboardVisibility(false);
        yz5.p commentInputCallback = storyCommentInputView.getCommentInputCallback();
        if (commentInputCallback != null) {
            commentInputCallback.invoke("", java.lang.Boolean.FALSE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
