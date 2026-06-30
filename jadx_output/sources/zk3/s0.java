package zk3;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f473500e;

    public s0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, zk3.w0 w0Var) {
        this.f473499d = multiTaskInfo;
        this.f473500e = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        r45.lr4 v07;
        com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f473499d;
        java.lang.String str = null;
        android.graphics.Bitmap a17 = al3.b.f5849a.a(u0Var.c(multiTaskInfo), null);
        java.lang.Integer valueOf = a17 != null ? java.lang.Integer.valueOf(a17.getWidth()) : null;
        java.lang.Integer valueOf2 = a17 != null ? java.lang.Integer.valueOf(a17.getHeight()) : null;
        zk3.w0 w0Var = this.f473500e;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f473499d;
        if (valueOf == null || valueOf2 == null) {
            f0Var = null;
        } else {
            pm0.v.X(new zk3.q0(w0Var, valueOf.intValue(), multiTaskInfo2, valueOf2.intValue(), a17));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSnapshotUIC, error! id:");
            sb6.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
            sb6.append(", title:");
            if (multiTaskInfo != null && (v07 = multiTaskInfo.v0()) != null) {
                str = v07.getString(1);
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", sb6.toString());
            pm0.v.X(new zk3.r0(this.f473500e));
        }
    }
}
