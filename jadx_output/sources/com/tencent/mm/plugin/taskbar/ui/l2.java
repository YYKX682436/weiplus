package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f172644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172645e;

    public l2(java.util.LinkedList linkedList, com.tencent.mm.plugin.taskbar.ui.o2 o2Var) {
        this.f172644d = linkedList;
        this.f172645e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "async remove timeout taskbar item");
        for (com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo : this.f172644d) {
            this.f172645e.h(multiTaskInfo, 0, 2, 5);
            ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(multiTaskInfo);
            ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(multiTaskInfo.field_id, false, 5);
        }
    }
}
