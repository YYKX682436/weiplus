package gx0;

/* loaded from: classes5.dex */
public final class cc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f276293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f276294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f276295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(gx0.kc kcVar, com.tencent.maas.moviecomposing.segments.Segment segment, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276293e = kcVar;
        this.f276294f = segment;
        this.f276295g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.cc(this.f276293e, this.f276294f, this.f276295g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.cc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276292d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.kc kcVar = this.f276293e;
            gx0.bf k76 = kcVar.k7();
            com.tencent.maas.moviecomposing.segments.Segment segment = this.f276294f;
            com.tencent.maas.model.time.MJTimeRange B = segment.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            com.tencent.maas.model.time.MJTime b17 = ou0.d.b(k76, B);
            this.f276292d = 1;
            if (gx0.kc.i7(kcVar, segment, b17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.a aVar2 = this.f276295g;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
