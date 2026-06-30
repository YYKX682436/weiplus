package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f189680d;

    public k0(java.lang.Runnable runnable, com.tencent.mm.pluginsdk.res.downloader.model.i0 i0Var) {
        this.f189680d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) && android.os.Process.getThreadPriority(android.os.Process.myTid()) != 10) {
            android.os.Process.setThreadPriority(10);
        }
        java.lang.Runnable runnable = this.f189680d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
