package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class m2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172648d;

    public m2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var) {
        this.f172648d = o2Var;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "received taskBarOnStorageChangeListener");
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172648d;
        o2Var.b(true, 300L);
        int i17 = w0Var.f316974b;
        if (i17 != 5) {
            if (i17 == 2) {
                java.lang.Object obj = w0Var.f316976d;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.model.MultiTaskInfo");
                o2Var.h((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj, 0, 1, 1);
                return;
            }
            return;
        }
        java.lang.Object obj2 = w0Var.f316976d;
        if (obj2 != null) {
            gh4.n0 n0Var = (gh4.n0) obj2;
            int i18 = n0Var.f271944b;
            if (i18 == 2 || i18 == 3) {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = n0Var.f271943a;
                if (multiTaskInfo != null) {
                    o2Var.h(multiTaskInfo, 0, 2, i18);
                } else {
                    kotlin.jvm.internal.o.o("multiTaskInfo");
                    throw null;
                }
            }
        }
    }
}
