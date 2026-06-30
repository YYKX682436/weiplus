package rv0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(rv0.n1 n1Var, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400340e = n1Var;
        this.f400341f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.y2(this.f400340e, this.f400341f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400339d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        rv0.n1 n1Var = this.f400340e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400339d = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                n1Var.r7().a();
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.k4(m7Var, null), 3, null);
        ex0.a0 a0Var = this.f400341f;
        if (!((java.lang.Boolean) a0Var.P().f302833d).booleanValue()) {
            return f0Var;
        }
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lmi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        ex0.i0.m(a0Var);
        gx0.bf p77 = n1Var.p7();
        this.f400339d = 2;
        if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        n1Var.r7().a();
        return f0Var;
    }
}
