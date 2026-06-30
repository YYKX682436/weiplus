package e50;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f249536d;

    /* renamed from: e, reason: collision with root package name */
    public int f249537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f249538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f249539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f249541i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f249542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f249543n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e50.v f249544o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, java.lang.String str, byte[] bArr, boolean z17, long j19, e50.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f249538f = j17;
        this.f249539g = j18;
        this.f249540h = str;
        this.f249541i = bArr;
        this.f249542m = z17;
        this.f249543n = j19;
        this.f249544o = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e50.u(this.f249538f, this.f249539g, this.f249540h, this.f249541i, this.f249542m, this.f249543n, this.f249544o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e50.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f249537e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        e50.v vVar = this.f249544o;
        long j18 = this.f249538f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "sendAsync: start " + j18);
                long j19 = this.f249539g;
                java.lang.String str = this.f249540h;
                kotlin.jvm.internal.o.d(str);
                byte[] bArr = this.f249541i;
                kotlin.jvm.internal.o.d(bArr);
                c61.ka kaVar = new c61.ka(new com.tencent.pigeon.mm_foundation.FlutterCgiRequest(j19, str, bArr, this.f249542m, this.f249543n));
                j17 = currentTimeMillis;
                this.f249536d = j17;
                this.f249537e = 1;
                s17 = kaVar.s(this);
                if (s17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j27 = this.f249536d;
                kotlin.ResultKt.throwOnFailure(obj);
                j17 = j27;
                s17 = obj;
            }
            com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse = (com.tencent.pigeon.mm_foundation.FlutterCgiResponse) s17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "sendAsync: end " + j18 + ", cost:" + (java.lang.System.currentTimeMillis() - j17));
            com.tencent.wechat.aff.mm_foundation.a aVar2 = vVar.f249546b;
            if (aVar2 != null) {
                aVar2.A0(this.f249538f, flutterCgiResponse.getErrorType(), flutterCgiResponse.getErrorCode(), flutterCgiResponse.getData());
            }
            return f0Var;
        } catch (java.lang.Exception unused) {
            com.tencent.wechat.aff.mm_foundation.a aVar3 = vVar.f249546b;
            if (aVar3 != null) {
                aVar3.A0(this.f249538f, 3L, -1L, null);
            }
            return f0Var;
        }
    }
}
