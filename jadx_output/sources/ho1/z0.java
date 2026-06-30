package ho1;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282861e;

    public z0(ho1.a1 a1Var, long j17) {
        this.f282860d = a1Var;
        this.f282861e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f282860d.f282622a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeStateByPkgId pkgId=");
        long j17 = this.f282861e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
    }
}
