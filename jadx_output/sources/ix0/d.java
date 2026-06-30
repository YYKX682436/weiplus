package ix0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix0.g f295289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f295290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ru0.e f295291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f295292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ix0.g gVar, com.tencent.maas.moviecomposing.segments.Segment segment, ru0.e eVar, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295289e = gVar;
        this.f295290f = segment;
        this.f295291g = eVar;
        this.f295292h = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix0.d(this.f295289e, this.f295290f, this.f295291g, this.f295292h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295288d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ix0.g gVar = this.f295289e;
            com.tencent.maas.moviecomposing.segments.Segment segment = this.f295290f;
            ru0.e eVar = this.f295291g;
            java.lang.String str = eVar.f399663b;
            java.lang.String str2 = eVar.f399664c;
            java.lang.String o17 = this.f295292h.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            this.f295288d = 1;
            if (ix0.g.h(gVar, segment, str, str2, o17, this) == aVar) {
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
