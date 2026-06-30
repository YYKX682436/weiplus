package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172691e;

    public q1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172691e = taskBarView;
        this.f172690d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172691e;
        rh4.n0 n0Var = taskBarView.f172531k2;
        int i17 = this.f172690d;
        if (n0Var != null && i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData recent: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172661g.size()));
            taskBarView.f172531k2.setDataList(taskBarView.f172523c2.f172661g);
        }
        if (taskBarView.f172532l2 != null && i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData my: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172662h.size()));
            taskBarView.f172532l2.setDataList(taskBarView.f172523c2.f172662h);
        }
        if (taskBarView.f172533m2 == null || i17 != 7) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData common used: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172663i.size()));
        int showCount = taskBarView.f172533m2.getShowCount();
        taskBarView.f172533m2.setDataList(taskBarView.f172523c2.f172663i);
        if (taskBarView.H2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "do fadeInOut Item Animation");
            taskBarView.f172533m2.s(showCount);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDataUpdated force update commonused weapp isHeaderOpen:%b", java.lang.Boolean.valueOf(taskBarView.f172542v2));
            if (taskBarView.f172542v2) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarView.g1(taskBarView, taskBarView.J2);
            }
        }
    }
}
