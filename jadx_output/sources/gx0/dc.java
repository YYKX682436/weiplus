package gx0;

/* loaded from: classes5.dex */
public final class dc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f276332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f276333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f276334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f276335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(gx0.kc kcVar, com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.model.time.MJTimeRange mJTimeRange, yz5.a aVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276332e = kcVar;
        this.f276333f = segment;
        this.f276334g = mJTimeRange;
        this.f276335h = aVar;
        this.f276336i = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.dc(this.f276332e, this.f276333f, this.f276334g, this.f276335h, this.f276336i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.dc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276331d;
        gx0.kc kcVar = this.f276332e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.model.time.MJTime startTime = this.f276334g.getStartTime();
            kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
            this.f276331d = 1;
            if (gx0.kc.i7(kcVar, this.f276333f, startTime, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.a aVar2 = this.f276335h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        du0.o.o7((gx0.x4) ((jz5.n) kcVar.f276632n).getValue(), this.f276336i, true, false, 4, null);
        return jz5.f0.f302826a;
    }
}
