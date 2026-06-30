package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class n2 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172652d;

    public n2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var) {
        this.f172652d = o2Var;
    }

    @Override // uh4.i0
    public final void onDataChanged() {
        com.tencent.mm.plugin.taskbar.ui.a2 a2Var = this.f172652d.f172655a;
        if (a2Var != null) {
            ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var).t1();
        }
    }
}
