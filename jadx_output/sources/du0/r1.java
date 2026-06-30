package du0;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.s1 f243430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f243431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f243432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(du0.s1 s1Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243430e = s1Var;
        this.f243431f = clipSegment;
        this.f243432g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.r1(this.f243430e, this.f243431f, this.f243432g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243429d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cw0.d1 d1Var = this.f243430e.f243437d;
            this.f243429d = 1;
            d1Var.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cw0.c1(this.f243432g, d1Var, this.f243431f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
