package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172694d;

    public r1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172694d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172694d;
        if (taskBarView.f172531k2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData recent: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172661g.size()));
            taskBarView.f172531k2.setDataList(taskBarView.f172523c2.f172661g);
        }
        if (taskBarView.f172532l2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData my: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172662h.size()));
            taskBarView.f172532l2.setDataList(taskBarView.f172523c2.f172662h);
        }
        if (taskBarView.f172533m2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData common used: %d", java.lang.Integer.valueOf(taskBarView.f172523c2.f172663i.size()));
            int showCount = taskBarView.f172533m2.getShowCount();
            taskBarView.f172533m2.setDataList(taskBarView.f172523c2.f172663i);
            if (taskBarView.H2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "do fadeInOut Item Animation");
                taskBarView.f172533m2.s(showCount);
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData force update commonused weapp isHeaderOpen:%b", java.lang.Boolean.valueOf(taskBarView.f172542v2));
            }
        }
    }
}
