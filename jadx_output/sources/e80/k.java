package e80;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f250027d;

    /* renamed from: e, reason: collision with root package name */
    public int f250028e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.d f250030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m11.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250030g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        e80.k kVar = new e80.k(this.f250030g, continuation);
        kVar.f250029f = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        w11.m1 a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f250028e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f250029f = (kotlinx.coroutines.y0) this.f250029f;
            m11.d dVar = this.f250030g;
            this.f250027d = dVar;
            this.f250028e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.modelbase.f fVar = new com.tencent.mm.modelbase.f();
            dVar.f322670u = new e80.j(fVar, rVar, dVar);
            ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).getClass();
            w11.o1 o1Var = w11.s1.f442146a;
            if (o1Var == null || (a17 = ((aq1.l) o1Var).a(dVar)) == null) {
                fVar.f70615a = 3;
                fVar.f70616b = -1;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(fVar));
            } else {
                gm0.j1.d().g(a17.f442088a);
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
