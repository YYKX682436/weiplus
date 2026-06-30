package rf4;

/* loaded from: classes4.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395032d;

    public c2(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        this.f395032d = storyMsgView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.story.ui.view.StoryMsgView.H;
        this.f395032d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
