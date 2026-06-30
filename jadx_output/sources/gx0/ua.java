package gx0;

/* loaded from: classes5.dex */
public final class ua extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f277034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f277035g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(gx0.ac acVar, double d17, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277033e = acVar;
        this.f277034f = d17;
        this.f277035g = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ua(this.f277033e, this.f277034f, this.f277035g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ua) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277032d;
        gx0.ac acVar = this.f277033e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf c86 = acVar.c8();
            this.f277032d = 1;
            if (c86.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bx0.i timelineLayoutType = acVar.A7().getTimelineLayoutType();
        ex0.a0 a0Var = this.f277035g;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f277034f / a0Var.s(timelineLayoutType));
        kotlin.jvm.internal.o.d(fromSeconds);
        acVar.k8(fromSeconds);
        acVar.c8().p7(a0Var.a(fromSeconds), false, 16L);
        return jz5.f0.f302826a;
    }
}
