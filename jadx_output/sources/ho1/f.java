package ho1;

/* loaded from: classes15.dex */
public final class f implements ro1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f282665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282666d;

    public f(ho1.v vVar, long j17, long j18, long j19) {
        this.f282663a = vVar;
        this.f282664b = j17;
        this.f282665c = j18;
        this.f282666d = j19;
    }

    @Override // ro1.d
    public void a(long j17) {
        ho1.v vVar = this.f282663a;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "copyUDisk2Local onCopied " + j17 + " taskId = " + this.f282664b + ", time = " + (java.lang.System.currentTimeMillis() - this.f282665c));
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            t0Var.q1(this.f282666d, j17, 0L);
        }
    }
}
