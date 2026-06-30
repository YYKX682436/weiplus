package rf4;

/* loaded from: classes4.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgListView f395099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f395100e;

    public q1(com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView, java.util.List list) {
        this.f395099d = storyMsgListView;
        this.f395100e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f395099d.f172001d.getLayoutManager();
        if (layoutManager != null) {
            int size = this.f395100e.size() - 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(size));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
