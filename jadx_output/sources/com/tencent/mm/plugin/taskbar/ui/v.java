package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.taskbar.ui.v f172733d = new com.tencent.mm.plugin.taskbar.ui.v();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "received myWeAppOnStorageChangeListener");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.taskbar.ui.w.f172737d;
        if (weakReference == null || (o2Var = (com.tencent.mm.plugin.taskbar.ui.o2) weakReference.get()) == null) {
            return;
        }
        o2Var.d(true, 2);
    }
}
