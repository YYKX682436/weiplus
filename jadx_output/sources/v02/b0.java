package v02;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432233f;

    /* renamed from: g, reason: collision with root package name */
    public int f432234g;

    /* renamed from: h, reason: collision with root package name */
    public long f432235h;

    /* renamed from: i, reason: collision with root package name */
    public int f432236i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432237m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f432238n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432239o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432240p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, java.lang.Long l17, v02.f0 f0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432237m = str;
        this.f432238n = l17;
        this.f432239o = f0Var;
        this.f432240p = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v02.b0(this.f432237m, this.f432238n, this.f432239o, this.f432240p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String nj6;
        v02.f0 f0Var;
        long j17;
        java.lang.String str;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f432236i;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(this.f432237m, this.f432238n.longValue());
            if (k17 == null) {
                return f0Var2;
            }
            v02.f0 f0Var3 = this.f432239o;
            int pj6 = f0Var3.pj(k17);
            nj6 = f0Var3.nj(k17);
            long I0 = k17.I0();
            java.lang.String Q0 = k17.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            this.f432231d = f0Var3;
            this.f432232e = nj6;
            this.f432233f = Q0;
            this.f432234g = pj6;
            this.f432235h = I0;
            this.f432236i = 1;
            obj = v02.f0.Zi(f0Var3, k17, this);
            if (obj == aVar) {
                return aVar;
            }
            f0Var = f0Var3;
            j17 = I0;
            str = Q0;
            i17 = pj6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f432235h;
            int i19 = this.f432234g;
            java.lang.String str2 = (java.lang.String) this.f432233f;
            nj6 = (java.lang.String) this.f432232e;
            v02.f0 f0Var4 = (v02.f0) this.f432231d;
            kotlin.ResultKt.throwOnFailure(obj);
            str = str2;
            i17 = i19;
            f0Var = f0Var4;
            j17 = j18;
        }
        v02.f0.cj(f0Var, i17, nj6, j17, str, (java.lang.String) obj);
        yz5.a aVar2 = this.f432240p;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return f0Var2;
    }
}
