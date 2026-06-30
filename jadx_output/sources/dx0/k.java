package dx0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx0.n f244446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dx0.n nVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244446d = nVar;
        this.f244447e = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dx0.k(this.f244446d, this.f244447e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dx0.k kVar = (dx0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fy0.h hVar = (fy0.h) this.f244446d.f244457a;
        hVar.getClass();
        com.tencent.maas.base.MJID segmentID = this.f244447e;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        hVar.f267186a.e(segmentID);
        return jz5.f0.f302826a;
    }
}
