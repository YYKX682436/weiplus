package dr0;

/* loaded from: classes12.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.q3 f242496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f242497e;

    public p3(dr0.q3 q3Var, long j17) {
        this.f242496d = q3Var;
        this.f242497e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TASK post run: ");
        dr0.q3 q3Var = this.f242496d;
        sb6.append(q3Var.f242515d);
        sb6.append(", delayActual=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f242497e);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", sb6.toString());
        dr0.q3.i(q3Var, null, 1, null);
    }
}
