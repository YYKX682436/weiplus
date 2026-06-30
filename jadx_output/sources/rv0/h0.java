package rv0;

/* loaded from: classes5.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f400026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(rv0.n1 n1Var, double d17, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400025e = n1Var;
        this.f400026f = d17;
        this.f400027g = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.h0(this.f400025e, this.f400026f, this.f400027g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400024d;
        rv0.n1 n1Var = this.f400025e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400024d = 1;
            if (p76.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bx0.i timelineLayoutType = n1Var.r7().getTimelineLayoutType();
        ex0.a0 a0Var = this.f400027g;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f400026f / a0Var.s(timelineLayoutType));
        kotlin.jvm.internal.o.d(fromSeconds);
        n1Var.y7(fromSeconds);
        gx0.bf.q7(n1Var.p7(), a0Var.a(fromSeconds), false, 0L, 4, null);
        return jz5.f0.f302826a;
    }
}
