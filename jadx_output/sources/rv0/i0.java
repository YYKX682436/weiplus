package rv0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f400041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(double d17, ex0.a0 a0Var, rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400041d = d17;
        this.f400042e = a0Var;
        this.f400043f = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.i0(this.f400041d, this.f400042e, this.f400043f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rv0.i0 i0Var = (rv0.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rv0.n1 n1Var = this.f400043f;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f400041d / this.f400042e.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(p76, fromSeconds, true, 0L, 4, null);
        return jz5.f0.f302826a;
    }
}
