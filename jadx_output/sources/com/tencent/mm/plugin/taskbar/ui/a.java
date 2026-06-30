package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.taskbar.ui.a f172555d = new com.tencent.mm.plugin.taskbar.ui.a();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "received CommonUsedWeAppOnStorageChangeListener");
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "not support load common used data");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "ljd begin reloadData");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.taskbar.ui.b.f172561d;
        if (weakReference != null && (o2Var = (com.tencent.mm.plugin.taskbar.ui.o2) weakReference.get()) != null) {
            o2Var.d(true, 7);
        }
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.taskbar.ui.b.f172561d;
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var2 = weakReference2 != null ? (com.tencent.mm.plugin.taskbar.ui.o2) weakReference2.get() : null;
        if (o2Var2 != null) {
            o2Var2.f172664j = java.lang.System.currentTimeMillis();
        }
        java.lang.ref.WeakReference weakReference3 = com.tencent.mm.plugin.taskbar.ui.b.f172561d;
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var3 = weakReference3 != null ? (com.tencent.mm.plugin.taskbar.ui.o2) weakReference3.get() : null;
        if (o2Var3 != null) {
            o2Var3.f172667m = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "ljd end reloadData");
    }
}
