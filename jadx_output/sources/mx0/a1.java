package mx0;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f331817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f331818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f331819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f331820g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mx0.e1 e1Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331818e = e1Var;
        this.f331819f = z17;
        this.f331820g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.a1(this.f331818e, this.f331819f, this.f331820g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331817d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = this.f331818e.f331934a;
            this.f331817d = 1;
            obj = p0Var.B(this.f331819f, this);
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
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.z0 z0Var = new mx0.z0(this.f331820g, booleanValue, null);
        this.f331817d = 2;
        if (kotlinx.coroutines.l.g(g3Var, z0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
