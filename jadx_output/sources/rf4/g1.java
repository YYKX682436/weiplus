package rf4;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryHeaderStageGroup f395053d;

    public g1(com.tencent.mm.plugin.story.ui.view.StoryHeaderStageGroup storyHeaderStageGroup) {
        this.f395053d = storyHeaderStageGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onDeleteClick = this.f395053d.getOnDeleteClick();
        if (onDeleteClick != null) {
            onDeleteClick.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
