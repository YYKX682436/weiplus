package rf4;

/* loaded from: classes4.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryActionView f395086d;

    public n(com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView) {
        this.f395086d = storyActionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l onActionClicked = this.f395086d.getOnActionClicked();
        if (onActionClicked != null) {
            onActionClicked.invoke(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
