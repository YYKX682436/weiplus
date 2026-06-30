package ho1;

/* loaded from: classes5.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282843g;

    public w0(ho1.a1 a1Var, long j17, java.lang.String str, int i17) {
        this.f282840d = a1Var;
        this.f282841e = j17;
        this.f282842f = str;
        this.f282843g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f282840d.f282622a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProgressChanged pkgId=");
        long j17 = this.f282841e;
        sb6.append(j17);
        sb6.append(", transferStatus=");
        java.lang.String str2 = this.f282842f;
        sb6.append(str2);
        sb6.append(", progress=");
        int i17 = this.f282843g;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((nv.v1) i95.n0.c(nv.v1.class)).Bi(j17, str2, i17);
    }
}
