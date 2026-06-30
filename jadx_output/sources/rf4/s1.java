package rf4;

/* loaded from: classes4.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395106d;

    public s1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        this.f395106d = storyMsgView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a outsideClickListener = this.f395106d.getOutsideClickListener();
        if (outsideClickListener != null) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
