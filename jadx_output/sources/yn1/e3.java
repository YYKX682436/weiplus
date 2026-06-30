package yn1;

/* loaded from: classes11.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f463652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f463656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f463657i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463658m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f463659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f463660o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(long j17, long j18, yn1.a4 a4Var, long j19, long j27, boolean z17, java.lang.String str, long j28, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463652d = j17;
        this.f463653e = j18;
        this.f463654f = a4Var;
        this.f463655g = j19;
        this.f463656h = j27;
        this.f463657i = z17;
        this.f463658m = str;
        this.f463659n = j28;
        this.f463660o = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.e3(this.f463652d, this.f463653e, this.f463654f, this.f463655g, this.f463656h, this.f463657i, this.f463658m, this.f463659n, this.f463660o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.e3 e3Var = (yn1.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long j17 = this.f463652d;
        long j18 = this.f463653e;
        yn1.a4 a4Var = this.f463654f;
        if (j17 > j18) {
            com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getChatPackageAsync] fromTime > toTime, skip DB query, return");
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                aVar2.a(this.f463655g, true, this.f463656h, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f43768a.a(this.f463658m, this.f463659n, j17, j18, this.f463656h, this.f463660o, new do1.a(false, this.f463657i));
            bw5.w0 w0Var = (bw5.w0) a17.f302841d;
            boolean booleanValue = ((java.lang.Boolean) a17.f302842e).booleanValue();
            long longValue = ((java.lang.Number) a17.f302843f).longValue();
            com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getChatPackageAsync] taskId=" + this.f463655g + ", isDone=" + booleanValue + ", afterOffset=" + longValue);
            com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
            if (aVar3 != null) {
                aVar3.a(this.f463655g, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
