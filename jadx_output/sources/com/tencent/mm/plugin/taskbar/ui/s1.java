package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172705d;

    public s1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172705d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "doReloadData");
        int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172705d;
        taskBarView.w1();
        if (taskBarView.C) {
            taskBarView.f172539s2 = true;
        }
        if (taskBarView.getRecyclerView().E0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "isComputingLayout not update");
            taskBarView.f172544x2 = true;
        } else {
            taskBarView.f172523c2.m();
            taskBarView.f172536p2.notifyDataSetChanged();
            taskBarView.f172544x2 = false;
        }
    }
}
