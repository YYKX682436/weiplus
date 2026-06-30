package ix0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix0.g f295281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f295282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f295283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f295284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ix0.g gVar, dw0.c cVar, java.util.List list, com.tencent.maas.moviecomposing.segments.Segment segment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295281e = gVar;
        this.f295282f = cVar;
        this.f295283g = list;
        this.f295284h = segment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix0.b(this.f295281e, this.f295282f, this.f295283g, this.f295284h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295280d;
        ix0.g gVar = this.f295281e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f295280d = 1;
            obj = ix0.g.i(gVar, this.f295282f, this.f295283g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        ug.m C = this.f295284h.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        gVar.getClass();
        if (!list.isEmpty()) {
            gVar.f295306b.p7(C, list);
        }
        return jz5.f0.f302826a;
    }
}
