package rv0;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.o f400114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(rv0.n1 n1Var, ex0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400113e = n1Var;
        this.f400114f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.m3(this.f400113e, this.f400114f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400112d;
        rv0.n1 n1Var = this.f400113e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400112d = 1;
            if (gx0.bf.d7(p76, null, null, false, this, 7, null) == aVar) {
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
        gx0.bf p77 = n1Var.p7();
        com.tencent.maas.model.time.MJTime A = this.f400114f.f257167a.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        this.f400112d = 2;
        if (gx0.bf.r7(p77, false, A, 0, false, null, this, 29, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
