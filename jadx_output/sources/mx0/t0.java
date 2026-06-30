package mx0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332333e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332334f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f332335g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f332336h;

    /* renamed from: i, reason: collision with root package name */
    public int f332337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332338m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332339n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332340o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332341p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f332342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f332343r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(mx0.e1 e1Var, yz5.l lVar, java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332338m = e1Var;
        this.f332339n = lVar;
        this.f332340o = str;
        this.f332341p = str2;
        this.f332342q = mJRecordingSettings;
        this.f332343r = mJAuditCaptureSettings;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.t0(this.f332338m, this.f332339n, this.f332340o, this.f332341p, this.f332342q, this.f332343r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332337i;
        mx0.e1 e1Var = this.f332338m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f332340o;
            java.lang.String str2 = this.f332341p;
            com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings = this.f332342q;
            com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings = this.f332343r;
            this.f332332d = e1Var;
            this.f332333e = str;
            this.f332334f = str2;
            this.f332335g = mJRecordingSettings;
            this.f332336h = mJAuditCaptureSettings;
            this.f332337i = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            e1Var.f331934a.h0(str, str2, mJRecordingSettings, mJAuditCaptureSettings, new mx0.s0(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e1Var.f(booleanValue ? mx0.d0.f331903q : mx0.d0.f331893d);
        e1Var.f331941h = true;
        this.f332339n.invoke(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
