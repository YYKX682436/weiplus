package k91;

/* loaded from: classes4.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f305806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.u3 f305808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.s3 f305809h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k91.x3 f305810i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(java.lang.String str, long j17, java.lang.String str2, k91.u3 u3Var, k91.s3 s3Var, k91.x3 x3Var) {
        super(0);
        this.f305805d = str;
        this.f305806e = j17;
        this.f305807f = str2;
        this.f305808g = u3Var;
        this.f305809h = s3Var;
        this.f305810i = x3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k91.s3 s3Var = new k91.s3();
        java.lang.String str = this.f305805d;
        s3Var.field_appId = str;
        long j17 = this.f305806e;
        s3Var.field_issueTimestampMs = j17;
        s3Var.field_exptInfo = this.f305807f;
        k91.u3 u3Var = this.f305808g;
        s3Var.field_source = u3Var.ordinal();
        k91.s3 s3Var2 = this.f305809h;
        k91.x3 x3Var = this.f305810i;
        com.tencent.mars.xlog.Log.i("Luggage.WeDataExptInfoStorage", "doReplaceExptInfo, appId:" + str + ", issueTimestamp:" + j17 + ", source:" + u3Var + ", ret:" + (s3Var2 == null ? super/*l75.n0*/.insertNotify(s3Var, true) : super/*l75.n0*/.updateNotify(s3Var, true, "appId")));
        return jz5.f0.f302826a;
    }
}
