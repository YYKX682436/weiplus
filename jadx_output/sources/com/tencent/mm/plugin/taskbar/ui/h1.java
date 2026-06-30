package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172623e;

    public h1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172623e = taskBarView;
        this.f172622d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172623e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "ljd onDidReAppear isHeaderOpen:%b", java.lang.Boolean.valueOf(taskBarView.f172542v2));
        if (taskBarView.f172542v2) {
            com.tencent.mm.plugin.taskbar.ui.TaskBarView.g1(taskBarView, this.f172622d);
        }
    }
}
