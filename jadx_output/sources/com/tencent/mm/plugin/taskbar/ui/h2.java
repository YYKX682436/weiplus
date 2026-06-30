package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172624d;

    public h2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var) {
        this.f172624d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172624d;
        synchronized (o2Var) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "removeExceedData %d", java.lang.Integer.valueOf(o2Var.f172669o.size()));
            for (com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo : o2Var.f172669o) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(multiTaskInfo);
                ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(multiTaskInfo.field_id, false, 4);
                o2Var.h(multiTaskInfo, 0, 2, 4);
            }
            o2Var.f172669o.clear();
        }
    }
}
