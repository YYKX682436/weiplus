package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.f0 f172601d;

    public e0(com.tencent.mm.plugin.taskbar.ui.f0 f0Var) {
        this.f172601d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "doOpenHeader");
        com.tencent.mm.plugin.taskbar.ui.f0 f0Var = this.f172601d;
        f0Var.f172610f.f172763e.smoothScrollBy(f0Var.f172610f.f172764f.getTop(), f0Var.f172609e);
        f0Var.f172610f.o(4);
        f0Var.f172610f.j(true, false, 0, 0);
    }
}
