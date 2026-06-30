package rf4;

/* loaded from: classes4.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395025d;

    public b2(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        this.f395025d = storyMsgView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395025d;
        if (storyMsgView.getCommentInputView().getInputType() != -1) {
            storyMsgView.getCommentInputView().b();
        } else {
            storyMsgView.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
