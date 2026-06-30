package rf4;

/* loaded from: classes13.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector f395122d;

    public x(com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector storyCommentColorSelector) {
        this.f395122d = storyCommentColorSelector;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector storyCommentColorSelector = this.f395122d;
        storyCommentColorSelector.setSelectedColor(-16777216);
        storyCommentColorSelector.a();
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
