package tv0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tv0.j0 j0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422189e = j0Var;
        this.f422190f = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tv0.f(this.f422189e, this.f422190f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422188d;
        tv0.j0 j0Var = this.f422189e;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f422190f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = j0Var.p7();
            rv0.c7 c7Var = rv0.c7.f399960d;
            this.f422188d = 1;
            if (p76.Z6(clipSegment, c7Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Double d17 = new java.lang.Double(clipSegment.v1());
        double doubleValue = d17.doubleValue();
        if (!((java.lang.Double.isInfinite(doubleValue) || java.lang.Double.isNaN(doubleValue)) ? false : true)) {
            d17 = null;
        }
        double doubleValue2 = 1 / (d17 != null ? d17.doubleValue() : 1.0d);
        com.tencent.maas.model.time.MJTime add = j0Var.f422213z.sub(clipSegment.A()).add(clipSegment.x1().getStartTime().multi(doubleValue2));
        kotlin.jvm.internal.o.f(add, "add(...)");
        com.tencent.maas.model.time.MJTime sub = clipSegment.x1().getEndTime().multi(doubleValue2).sub(new com.tencent.maas.model.time.MJTime(1L));
        kotlin.jvm.internal.o.f(sub, "sub(...)");
        com.tencent.maas.model.time.MJTime b17 = ou0.f.b(add, sub);
        if (j0Var.p7().L) {
            j0Var.p7().b7(b17, true);
        }
        return jz5.f0.f302826a;
    }
}
