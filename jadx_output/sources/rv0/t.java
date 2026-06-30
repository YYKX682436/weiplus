package rv0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400248e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.t(this.f400248e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400247d;
        rv0.n1 n1Var = this.f400248e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400247d = 1;
            if (gx0.bf.d7(p76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                yw0.p pVar = (yw0.p) n1Var.o7().f2().b(yw0.q.f466585h);
                pVar.f466580c = yw0.o.f466576d;
                ((yw0.l) pVar.f466587a).a();
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.bf p77 = n1Var.p7();
        this.f400247d = 2;
        if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        yw0.p pVar2 = (yw0.p) n1Var.o7().f2().b(yw0.q.f466585h);
        pVar2.f466580c = yw0.o.f466576d;
        ((yw0.l) pVar2.f466587a).a();
        return jz5.f0.f302826a;
    }
}
