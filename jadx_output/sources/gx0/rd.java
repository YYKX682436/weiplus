package gx0;

/* loaded from: classes5.dex */
public final class rd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f276928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.tencent.maas.moviecomposing.Timeline timeline, gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276928e = timeline;
        this.f276929f = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.rd(this.f276928e, this.f276929f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.rd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276927d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.moviecomposing.SynthSpecWrapper n17 = this.f276928e.n(false);
            if (n17 == null) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            this.f276927d = 1;
            gx0.bf bfVar = this.f276929f;
            bfVar.getClass();
            obj = kotlinx.coroutines.l.g(bfVar.f276253t, new gx0.be(bfVar, false, n17, InvalidTime, true, null), this);
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
