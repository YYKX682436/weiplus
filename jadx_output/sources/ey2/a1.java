package ey2;

/* loaded from: classes2.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f257315d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f257317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f257318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f257319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f257320i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ey2.b1 b1Var, int i17, int i18, r45.oq2 oq2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257317f = b1Var;
        this.f257318g = i17;
        this.f257319h = i18;
        this.f257320i = oq2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ey2.a1 a1Var = new ey2.a1(this.f257317f, this.f257318g, this.f257319h, this.f257320i, continuation);
        a1Var.f257316e = obj;
        return a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ey2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257315d;
        ey2.b1 b1Var = this.f257317f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f257316e;
            ey2.z0 z0Var = new ey2.z0(this.f257318g, b1Var, this.f257319h, this.f257320i);
            b1Var.f257326e = true;
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            gb2.d dVar = new gb2.d(z0Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, 4, null);
            this.f257315d = 1;
            if (dVar.i(false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        b1Var.f257326e = false;
        return jz5.f0.f302826a;
    }
}
