package ho1;

/* loaded from: classes15.dex */
public final class s implements ro1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f282804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282805d;

    public s(ho1.v vVar, long j17, long j18, long j19) {
        this.f282802a = vVar;
        this.f282803b = j17;
        this.f282804c = j18;
        this.f282805d = j19;
    }

    @Override // ro1.d
    public void a(long j17) {
        ho1.v vVar = this.f282802a;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "copyLocal2UDisk onCopied " + j17 + " taskId = " + this.f282803b + ", time = " + (java.lang.System.currentTimeMillis() - this.f282804c));
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            t0Var.M0(this.f282805d, j17, 0L);
        }
    }
}
