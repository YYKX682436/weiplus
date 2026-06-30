package yn1;

/* loaded from: classes11.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.q0 f463758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463759e;

    public m3(bw5.q0 q0Var, yn1.a4 a4Var) {
        this.f463758d = q0Var;
        this.f463759e = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.q0 q0Var = this.f463758d;
        java.lang.String str = q0Var.f31880h[2] ? q0Var.f31877e : "";
        kotlin.jvm.internal.o.f(str, "getStatusExtra(...)");
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.tencent.mars.xlog.Log.i(this.f463759e.f463606a, "[notifyTaskCode] convIdHash = " + g17);
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.w6.g(new com.tencent.mm.vfs.r6(lp0.b.h0("MicroMsg.BackupMoveServer"), g17).o(), true);
    }
}
