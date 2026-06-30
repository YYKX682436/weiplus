package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.b0 f153063d;

    public i0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var) {
        this.f153063d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob0.s3 g17 = this.f153063d.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "backgroundTrim: %s", g17);
        this.f153063d.m(g17, true);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.performance.watchdogs.h0 h0Var = new com.tencent.mm.plugin.performance.watchdogs.h0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(h0Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "backgroundTrim-info2");
    }
}
