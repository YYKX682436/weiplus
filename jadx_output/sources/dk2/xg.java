package dk2;

/* loaded from: classes3.dex */
public final class xg {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f234357a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f234358b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f234359c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f234360d;

    public xg(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        runnable = (i17 & 4) != 0 ? null : runnable;
        this.f234357a = str;
        this.f234358b = true;
        dk2.wg wgVar = new dk2.wg(this, runnable);
        this.f234359c = wgVar;
        this.f234360d = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? new com.tencent.mm.sdk.platformtools.n3(wgVar) : new com.tencent.mm.sdk.platformtools.n3(str2, wgVar);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f234357a);
        sb6.append(" finishTask isQuit:");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f234360d;
        sb6.append(n3Var.isQuit());
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", sb6.toString());
        n3Var.sendEmptyMessage(2);
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", this.f234357a + " removeTask");
        this.f234360d.removeCallbacksAndMessages(null);
        this.f234358b = true;
    }

    public final void c(java.lang.Long l17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f234357a);
        sb6.append(" tryRunTask isQuit:");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f234360d;
        sb6.append(n3Var.isQuit());
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", sb6.toString());
        n3Var.obtainMessage(1, l17).sendToTarget();
    }
}
