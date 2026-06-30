package v02;

/* loaded from: classes3.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432223e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432224f;

    /* renamed from: g, reason: collision with root package name */
    public int f432225g;

    /* renamed from: h, reason: collision with root package name */
    public long f432226h;

    /* renamed from: i, reason: collision with root package name */
    public int f432227i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432228m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f432229n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432230o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v02.f0 f0Var, com.tencent.mm.storage.f9 f9Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432228m = f0Var;
        this.f432229n = f9Var;
        this.f432230o = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v02.a0(this.f432228m, this.f432229n, this.f432230o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int pj6;
        java.lang.String str;
        v02.f0 f0Var;
        java.lang.String str2;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432227i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v02.f0 f0Var2 = this.f432228m;
            com.tencent.mm.storage.f9 f9Var = this.f432229n;
            pj6 = f0Var2.pj(f9Var);
            java.lang.String nj6 = f0Var2.nj(f9Var);
            long I0 = f9Var.I0();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            this.f432222d = f0Var2;
            this.f432223e = nj6;
            this.f432224f = Q0;
            this.f432225g = pj6;
            this.f432226h = I0;
            this.f432227i = 1;
            obj = v02.f0.Zi(f0Var2, f9Var, this);
            if (obj == aVar) {
                return aVar;
            }
            str = nj6;
            f0Var = f0Var2;
            str2 = Q0;
            j17 = I0;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f432226h;
            int i18 = this.f432225g;
            java.lang.String str3 = (java.lang.String) this.f432224f;
            java.lang.String str4 = (java.lang.String) this.f432223e;
            v02.f0 f0Var3 = (v02.f0) this.f432222d;
            kotlin.ResultKt.throwOnFailure(obj);
            pj6 = i18;
            str = str4;
            f0Var = f0Var3;
            str2 = str3;
            j17 = j18;
        }
        v02.f0.cj(f0Var, pj6, str, j17, str2, (java.lang.String) obj);
        yz5.a aVar2 = this.f432230o;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
