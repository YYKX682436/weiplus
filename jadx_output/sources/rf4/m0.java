package rf4;

/* loaded from: classes4.dex */
public final class m0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395084d;

    public m0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395084d = storyCommentView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        yz5.a outsideClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395084d;
        boolean z17 = false;
        if (storyCommentView.f171969u != 3 && (outsideClickListener = storyCommentView.getOutsideClickListener()) != null) {
            z17 = ((java.lang.Boolean) outsideClickListener.invoke()).booleanValue();
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
