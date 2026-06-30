package v14;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f432571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.k0 f432573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f432574h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432575i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432576m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v14.p pVar, java.lang.String str, kv.k0 k0Var, boolean z17, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432571e = pVar;
        this.f432572f = str;
        this.f432573g = k0Var;
        this.f432574h = z17;
        this.f432575i = str2;
        this.f432576m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.o(this.f432571e, this.f432572f, this.f432573g, this.f432574h, this.f432575i, this.f432576m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432570d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            v14.n nVar = new v14.n(this.f432571e, this.f432572f, null);
            this.f432570d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        v14.m mVar = new v14.m(this.f432573g, this.f432574h, this.f432572f, bitmap, this.f432571e, this.f432575i, this.f432576m, null);
        this.f432570d = 2;
        if (kotlinx.coroutines.l.g(g3Var, mVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
