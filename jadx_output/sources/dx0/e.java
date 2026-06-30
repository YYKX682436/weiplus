package dx0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f244428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.g f244429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, dx0.g gVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244428d = clipSegment;
        this.f244429e = gVar;
        this.f244430f = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dx0.e(this.f244428d, this.f244429e, this.f244430f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dx0.e eVar = (dx0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dx0.g gVar = this.f244429e;
        com.tencent.maas.moviecomposing.o0 c17 = com.tencent.maas.moviecomposing.o0.c(this.f244428d, gVar.f244435b, true);
        ex0.a0 a0Var = gVar.f244434a;
        a0Var.getClass();
        com.tencent.maas.base.MJID segmentID = this.f244430f;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        a0Var.D.put(segmentID, c17);
        gVar.b(segmentID);
        return jz5.f0.f302826a;
    }
}
