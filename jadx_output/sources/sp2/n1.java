package sp2;

/* loaded from: classes2.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411104d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f411107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f411108h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f411109i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f411110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f411111n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f411112o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f411113p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f411114q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(sp2.o2 o2Var, boolean z17, int i17, com.tencent.mm.protobuf.g gVar, int i18, long j17, yz5.a aVar, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411106f = o2Var;
        this.f411107g = z17;
        this.f411108h = i17;
        this.f411109i = gVar;
        this.f411110m = i18;
        this.f411111n = j17;
        this.f411112o = aVar;
        this.f411113p = lVar;
        this.f411114q = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sp2.n1 n1Var = new sp2.n1(this.f411106f, this.f411107g, this.f411108h, this.f411109i, this.f411110m, this.f411111n, this.f411112o, this.f411113p, this.f411114q, continuation);
        n1Var.f411105e = obj;
        return n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411104d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f411105e;
            sp2.o2 o2Var = this.f411106f;
            o2Var.f411164z = true;
            sp2.m1 m1Var = new sp2.m1(this.f411107g, this.f411106f, this.f411109i, this.f411108h, this.f411107g && this.f411108h == 0 && kotlin.jvm.internal.o.b(o2Var.V, "default"), this.f411110m, this.f411111n);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            aq2.m mVar = new aq2.m(m1Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), o2Var.f411121a);
            this.f411104d = 1;
            z17 = false;
            j17 = ay1.l.j(mVar, false, this, 1, null);
            if (j17 == aVar) {
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
            j17 = obj;
            z17 = false;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) j17;
        sp2.o2 o2Var2 = this.f411106f;
        o2Var2.f411164z = z17;
        oz5.l lVar = ((kotlinx.coroutines.internal.h) o2Var2.f411129e).f310496d;
        sp2.l1 l1Var = new sp2.l1(fVar, this.f411108h, o2Var2, this.f411107g, this.f411110m, this.f411112o, this.f411111n, this.f411113p, this.f411114q, null);
        this.f411104d = 2;
        if (kotlinx.coroutines.l.g(lVar, l1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
