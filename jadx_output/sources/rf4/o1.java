package rf4;

/* loaded from: classes4.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgListView f395091d;

    public o1(com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView) {
        this.f395091d = storyMsgListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = this.f395091d;
        androidx.recyclerview.widget.f2 adapter = storyMsgListView.f172001d.getAdapter();
        if (adapter == null || (layoutManager = storyMsgListView.f172001d.getLayoutManager()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$setup$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$setup$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
