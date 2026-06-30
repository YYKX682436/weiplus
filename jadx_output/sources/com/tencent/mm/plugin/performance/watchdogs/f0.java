package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.b0 f153043e;

    public f0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var, int i17) {
        this.f153043e = b0Var;
        this.f153042d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.performance.watchdogs.b0 b0Var = this.f153043e;
        int i17 = this.f153042d;
        ob0.s3 h17 = b0Var.h(false, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "[dumpMemoryAsync] %s", h17);
        if (b0Var.c(h17)) {
            b0Var.o(h17, i17);
        }
    }
}
