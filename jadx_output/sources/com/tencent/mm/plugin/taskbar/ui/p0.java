package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172683d;

    public p0(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer) {
        this.f172683d = taskBarContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.P;
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172683d;
        taskBarContainer.i();
        if (com.tencent.mm.ui.bk.C()) {
            int color = taskBarContainer.getResources().getColor(com.tencent.mm.R.color.f478861j7);
            com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView taskBarBottomView = taskBarContainer.f172515y;
            if (taskBarBottomView != null) {
                taskBarBottomView.setDrawColor(color);
                return;
            }
            return;
        }
        int color2 = taskBarContainer.getResources().getColor(com.tencent.mm.R.color.a07);
        com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView taskBarBottomView2 = taskBarContainer.f172515y;
        if (taskBarBottomView2 != null) {
            taskBarBottomView2.setDrawColor(color2);
        }
    }
}
