package t00;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.z7 f414379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c00.n3 n3Var, long j17, bw5.z7 z7Var) {
        super(1);
        this.f414377d = n3Var;
        this.f414378e = j17;
        this.f414379f = z7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.i9 i9Var = (bw5.i9) obj;
        c00.n3 n3Var = this.f414377d;
        if (i9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "resp is null");
            n3Var.a();
        } else {
            org.json.JSONObject b17 = t00.a0.f414262a.b(i9Var, this.f414378e);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsSectionDataActionHandler", "reqScene:" + this.f414379f.f35845e + " onSuccess, result count: " + i9Var.f28501d.size() + ",hitCache:" + i9Var.f28502e);
            n3Var.b(b17);
        }
        return jz5.f0.f302826a;
    }
}
