package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189307e;

    public g0(java.lang.String str, long j17) {
        this.f189306d = str;
        this.f189307e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.model.e0 e0Var = (com.tencent.mm.pluginsdk.model.e0) com.tencent.mm.pluginsdk.model.i0.f189341b.get(this.f189306d);
        if (e0Var != null) {
            e0Var.f189283d++;
            com.tencent.mm.pluginsdk.model.d0 d0Var = (com.tencent.mm.pluginsdk.model.d0) e0Var.f189285f.get(3);
            if (d0Var != null && d0Var.f189270a == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizImageBlankReporter", "retryDownload force restart id: %s", e0Var.f189284e);
                d0Var.f189270a = 1;
                d0Var.a(this.f189307e);
            }
        }
    }
}
