package rv0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(rv0.n1 n1Var, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400154e = n1Var;
        this.f400155f = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.o0(this.f400154e, this.f400155f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400153d;
        rv0.n1 n1Var = this.f400154e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            com.tencent.maas.model.time.MJTime seekTime = this.f400155f;
            kotlin.jvm.internal.o.f(seekTime, "$seekTime");
            this.f400153d = 1;
            if (gx0.bf.d7(p76, null, seekTime, true, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lww);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        return jz5.f0.f302826a;
    }
}
