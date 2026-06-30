package h03;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f277878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f277879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f277880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277882h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f277883i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.app.Activity activity, byte[] bArr, double d17, java.lang.String str, java.lang.String str2, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277878d = activity;
        this.f277879e = bArr;
        this.f277880f = d17;
        this.f277881g = str;
        this.f277882h = str2;
        this.f277883i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h03.f(this.f277878d, this.f277879e, this.f277880f, this.f277881g, this.f277882h, this.f277883i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h03.f fVar = (h03.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity activity = this.f277878d;
        if (activity != null) {
            o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
            ((wy2.g) eVar).Bi(activity, this.f277879e, kz5.c1.l(new jz5.l("startTime", new java.lang.Float((float) this.f277880f)), new jz5.l("finder_context_id", this.f277881g), new jz5.l("finder_tab_context_id", this.f277882h), new jz5.l("comment_scene", new java.lang.Integer((int) this.f277883i))));
        }
        return jz5.f0.f302826a;
    }
}
