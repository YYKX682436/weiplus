package gx0;

/* loaded from: classes5.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(gx0.w8 w8Var, ex0.a0 a0Var, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276661e = w8Var;
        this.f276662f = a0Var;
        this.f276663g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.l5(this.f276661e, this.f276662f, this.f276663g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276660d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf V6 = this.f276661e.V6();
            com.tencent.maas.moviecomposing.Timeline timeline = this.f276662f.f257092b;
            com.tencent.maas.model.time.MJTime mJTime = this.f276663g;
            this.f276660d = 1;
            if (gx0.bf.d7(V6, timeline, mJTime, false, this, 4, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
