package rh4;

/* loaded from: classes8.dex */
public final /* synthetic */ class c0$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView f395706d;

    public /* synthetic */ c0$$a(com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView) {
        this.f395706d = taskBarSectionWeAppRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView.f172709t2;
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395706d;
        if (!taskBarSectionWeAppRecyclerView.E0() && taskBarSectionWeAppRecyclerView.getScrollState() == 0) {
            taskBarSectionWeAppRecyclerView.v1(taskBarSectionWeAppRecyclerView.getContext(), taskBarSectionWeAppRecyclerView.f172716k2);
            return;
        }
        int i18 = taskBarSectionWeAppRecyclerView.f172722q2;
        if (i18 > 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "update item offset delay count reach max");
        } else {
            taskBarSectionWeAppRecyclerView.f172722q2 = i18 + 1;
            taskBarSectionWeAppRecyclerView.postDelayed(new rh4.c0$$a(taskBarSectionWeAppRecyclerView), 300L);
        }
    }
}
