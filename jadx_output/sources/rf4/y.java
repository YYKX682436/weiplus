package rf4;

/* loaded from: classes13.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector f395126d;

    public y(com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector storyCommentColorSelector) {
        this.f395126d = storyCommentColorSelector;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector storyCommentColorSelector = this.f395126d;
        storyCommentColorSelector.getClass();
        storyCommentColorSelector.setSelectedColor(com.tencent.mm.plugin.story.ui.view.StoryCommentView.N[new java.util.Random().nextInt(8)]);
        storyCommentColorSelector.a();
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
