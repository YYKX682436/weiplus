package wv0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449903d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f449904e;

    /* renamed from: f, reason: collision with root package name */
    public int f449905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f449906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f449907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f449908i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ex0.a0 a0Var, com.tencent.maas.base.MJID mjid, rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449906g = a0Var;
        this.f449907h = mjid;
        this.f449908i = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wv0.e(this.f449906g, this.f449907h, this.f449908i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wv0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        rv0.n1 n1Var;
        ex0.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449905f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Iterator it = this.f449906g.f257097g.f257177e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((ex0.r) obj2).f257168b, this.f449907h)) {
                    break;
                }
            }
            ex0.r rVar2 = (ex0.r) obj2;
            if (rVar2 != null) {
                n1Var = this.f449908i;
                gx0.bf p76 = n1Var.p7();
                com.tencent.maas.model.time.MJTime k17 = rVar2.k();
                this.f449903d = n1Var;
                this.f449904e = rVar2;
                this.f449905f = 1;
                if (gx0.bf.d7(p76, null, k17, false, this, 5, null) == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = (ex0.r) this.f449904e;
        n1Var = (rv0.n1) this.f449903d;
        kotlin.ResultKt.throwOnFailure(obj);
        n1Var.v7(rVar.k());
        return jz5.f0.f302826a;
    }
}
