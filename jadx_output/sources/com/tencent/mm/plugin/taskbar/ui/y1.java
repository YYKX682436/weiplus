package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public class y1 implements ft.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f172759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f172760b;

    public y1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172759a = null;
        this.f172760b = 0;
        this.f172759a = new java.lang.ref.WeakReference(taskBarView);
        this.f172760b = i17;
    }

    public void a(final boolean z17, final boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "stopLoading");
        java.lang.ref.WeakReference weakReference = this.f172759a;
        final com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = weakReference != null ? (com.tencent.mm.plugin.taskbar.ui.TaskBarView) weakReference.get() : null;
        if (taskBarView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarView", "stopLoading view is recycle");
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        final int i17 = this.f172760b;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "ljd stopLoading refreshImmediately:%b, dataCanUpdated:%b, dataRefreshType:%d", valueOf, valueOf2, java.lang.Integer.valueOf(i17));
        taskBarView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView2 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.this;
                rh4.m mVar = taskBarView2.f172533m2;
                if (mVar != null) {
                    mVar.u();
                }
                boolean z19 = z17;
                taskBarView2.H2 = z19;
                taskBarView2.I2 = false;
                int i18 = i17;
                taskBarView2.J2 = i18;
                if (z19) {
                    taskBarView2.postDelayed(new com.tencent.mm.plugin.taskbar.ui.h1(taskBarView2, i18), 1000L);
                } else if (z18) {
                    taskBarView2.I2 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "need update common data after header close");
                }
            }
        });
    }
}
