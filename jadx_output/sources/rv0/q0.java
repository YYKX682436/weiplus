package rv0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.s0 f400193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(rv0.n1 n1Var, com.tencent.maas.model.time.MJTime mJTime, rv0.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400191e = n1Var;
        this.f400192f = mJTime;
        this.f400193g = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.q0(this.f400191e, this.f400192f, this.f400193g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400190d;
        rv0.n1 n1Var = this.f400191e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400190d = 1;
            if (p76.e7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                gx0.kh q76 = n1Var.q7();
                java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lmj);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                q76.r7(string, this.f400193g.f400226a);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.bf p77 = n1Var.p7();
        com.tencent.maas.model.time.MJTime seekTime = this.f400192f;
        kotlin.jvm.internal.o.f(seekTime, "$seekTime");
        this.f400190d = 2;
        if (gx0.bf.d7(p77, null, seekTime, true, this, 1, null) == aVar) {
            return aVar;
        }
        gx0.kh q762 = n1Var.q7();
        java.lang.String string2 = n1Var.getContext().getString(com.tencent.mm.R.string.lmj);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        q762.r7(string2, this.f400193g.f400226a);
        return jz5.f0.f302826a;
    }
}
