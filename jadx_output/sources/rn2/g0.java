package rn2;

/* loaded from: classes.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397742d;

    /* renamed from: e, reason: collision with root package name */
    public int f397743e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f397746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v65.n f397747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, r45.dz1 dz1Var, v65.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397745g = context;
        this.f397746h = dz1Var;
        this.f397747i = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rn2.g0 g0Var = new rn2.g0(this.f397745g, this.f397746h, this.f397747i, continuation);
        g0Var.f397744f = obj;
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        az2.f fVar;
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397743e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f397744f;
            az2.c cVar = az2.f.f16125d;
            android.content.Context context = this.f397745g;
            az2.f a17 = az2.c.a(cVar, context, context.getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
            a17.a();
            rn2.l0 l0Var = rn2.l0.f397792a;
            this.f397744f = y0Var2;
            this.f397742d = a17;
            this.f397743e = 1;
            java.lang.Object a18 = rn2.l0.a(l0Var, this.f397745g, this.f397746h, this);
            if (a18 == aVar) {
                return aVar;
            }
            fVar = a17;
            y0Var = y0Var2;
            obj = a18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            az2.f fVar2 = (az2.f) this.f397742d;
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f397744f;
            kotlin.ResultKt.throwOnFailure(obj);
            fVar = fVar2;
            y0Var = y0Var3;
        }
        jz5.l lVar = (jz5.l) obj;
        java.lang.String str = (java.lang.String) lVar.f302833d;
        r45.oz1 oz1Var = (r45.oz1) lVar.f302834e;
        if (oz1Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new rn2.f0(this.f397745g, oz1Var, str, this.f397747i, fVar, null), 2, null);
        } else {
            this.f397747i.a(new jz5.l("makeOrder fail", null));
            fVar.b();
        }
        return jz5.f0.f302826a;
    }
}
