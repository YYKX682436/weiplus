package ho1;

/* loaded from: classes15.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, ho1.v vVar, long j17, long j18, java.lang.String str2, long j19) {
        super(0);
        this.f282808d = str;
        this.f282809e = vVar;
        this.f282810f = j17;
        this.f282811g = j18;
        this.f282812h = str2;
        this.f282813i = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f282808d;
        long length = new java.io.File(str).length();
        ho1.v vVar = this.f282809e;
        java.lang.String str2 = vVar.f282829a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadFileAsync taskId = ");
        long j17 = this.f282810f;
        sb6.append(j17);
        sb6.append(", go in thread time = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f282811g);
        sb6.append(",localPath = ");
        sb6.append(str);
        sb6.append(", localFileSize = ");
        sb6.append(length);
        sb6.append(", exist = ");
        sb6.append(new java.io.File(str).exists());
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ro1.g gVar = vVar.f282831c;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        ro1.f k17 = gVar.k(str, this.f282812h, new ho1.s(vVar, this.f282810f, currentTimeMillis, this.f282813i));
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "copy2Udisk errCode = " + k17.f397986d + " uploadFileAsync taskId = " + j17 + ", time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " localPath = " + str + ", localFileSize = " + length + ", exist = " + new java.io.File(str).exists());
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            t0Var.f1(j17, k17.f397986d);
        }
        return jz5.f0.f302826a;
    }
}
