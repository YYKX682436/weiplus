package ho1;

/* loaded from: classes11.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282716i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f282717m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f282718n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(long j17, java.lang.String str, long j18, long j19, ho1.q1 q1Var, long j27, long j28, int i17) {
        super(0);
        this.f282711d = j17;
        this.f282712e = str;
        this.f282713f = j18;
        this.f282714g = j19;
        this.f282715h = q1Var;
        this.f282716i = j27;
        this.f282717m = j28;
        this.f282718n = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatPackageAsync taskId = ");
        sb6.append(this.f282711d);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f282712e;
        sb6.append(str);
        sb6.append(", fromTime = ");
        sb6.append(this.f282713f);
        sb6.append(", toTime = ");
        sb6.append(this.f282714g);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", sb6.toString());
        long j17 = this.f282713f;
        long j18 = this.f282714g;
        ho1.q1 q1Var = this.f282715h;
        if (j17 > j18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "getChatPackageAsync fromTime > toTime, skip DB query, return");
            com.tencent.wechat.aff.affroam.g0 g0Var = q1Var.f282787a;
            if (g0Var != null) {
                g0Var.a(this.f282711d, true, 0L, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f43768a.a(this.f282712e, this.f282716i, j17, j18, this.f282717m, this.f282718n, q1Var.f282794h);
            bw5.w0 w0Var = (bw5.w0) a17.f302841d;
            boolean booleanValue = ((java.lang.Boolean) a17.f302842e).booleanValue();
            long longValue = ((java.lang.Number) a17.f302843f).longValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "onGetChatPackageComplete return, conversationId = " + str + ", isLast = " + booleanValue + ", realOffset = " + longValue);
            com.tencent.wechat.aff.affroam.g0 g0Var2 = q1Var.f282787a;
            if (g0Var2 != null) {
                g0Var2.a(this.f282711d, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
