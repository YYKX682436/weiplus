package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f172632e;

    public j2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var, boolean z17) {
        this.f172631d = o2Var;
        this.f172632e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.taskbar.ui.a2 a2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "do reload data");
        if (!this.f172631d.f172673s) {
            this.f172631d.f172673s = true;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1) {
            this.f172631d.d(false, 7);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "not support load common used data");
        }
        this.f172631d.d(false, 1);
        this.f172631d.d(false, 2);
        lh4.n nVar = (lh4.n) this.f172631d.f172668n.get(4);
        if (nVar != null) {
            this.f172631d.c(nVar);
        }
        if (!this.f172632e || (a2Var = this.f172631d.f172655a) == null) {
            return;
        }
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDataUpdated");
        taskBarView.f172544x2 = true;
        taskBarView.post(taskBarView.X2);
        taskBarView.m1();
    }
}
