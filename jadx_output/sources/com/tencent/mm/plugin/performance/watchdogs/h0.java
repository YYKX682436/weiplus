package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i0 f153053d;

    public h0(com.tencent.mm.plugin.performance.watchdogs.i0 i0Var) {
        this.f153053d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "after backgroundTrim: %s", this.f153053d.f153063d.g());
    }
}
