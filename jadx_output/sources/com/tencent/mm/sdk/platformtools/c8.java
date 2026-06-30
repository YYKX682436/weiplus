package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.d8 f192505d;

    public c8(com.tencent.mm.sdk.platformtools.d8 d8Var) {
        this.f192505d = d8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task run manualFinish = ");
        com.tencent.mm.sdk.platformtools.d8 d8Var = this.f192505d;
        sb6.append(d8Var.f192535f);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", sb6.toString());
        if (d8Var.f192535f) {
            d8Var.b();
        } else {
            d8Var.c(d8Var.b());
        }
        long j17 = d8Var.f192533d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        d8Var.f192534e = android.os.SystemClock.elapsedRealtime() - j17;
    }
}
