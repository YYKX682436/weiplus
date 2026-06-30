package yw;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f466444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f466445e;

    public r(long j17, yw.y yVar) {
        this.f466444d = j17;
        this.f466445e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Timeout release ProcLife taskId=");
        long j17 = this.f466444d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        java.util.Map map = this.f466445e.f466510b;
        yw.r2 r2Var = (yw.r2) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (r2Var != null) {
            r2Var.f466449b = false;
            map.remove(java.lang.Long.valueOf(j17));
            mm.d0 d0Var = mm.d0.f328475a;
            synchronized (d0Var.a()) {
                d0Var.a().remove(r2Var);
            }
        }
    }
}
