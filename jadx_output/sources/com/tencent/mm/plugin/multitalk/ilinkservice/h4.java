package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class h4 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f149602d;

    public h4(java.lang.Runnable runnable) {
        this.f149602d = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "IlinkNoLoggingRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f149602d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
