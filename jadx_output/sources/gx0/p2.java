package gx0;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.n f276814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(gx0.u2 u2Var, vv0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276813d = u2Var;
        this.f276814e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.p2(this.f276813d, this.f276814e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.p2 p2Var = (gx0.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ow0.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.u2 u2Var = this.f276813d;
        dx0.g gVar2 = u2Var.B;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("coverThumbnailProvider");
            throw null;
        }
        vv0.n nVar = this.f276814e;
        gVar2.f(nVar.f440398a);
        dx0.g gVar3 = u2Var.B;
        if (gVar3 == null) {
            kotlin.jvm.internal.o.o("coverThumbnailProvider");
            throw null;
        }
        com.tencent.maas.base.MJID mjid = nVar.f440398a;
        gVar3.b(mjid);
        dx0.g gVar4 = u2Var.B;
        if (gVar4 == null) {
            kotlin.jvm.internal.o.o("coverThumbnailProvider");
            throw null;
        }
        dx0.p d17 = gVar4.d(mjid);
        if (d17 != null && (gVar = (ow0.g) u2Var.f69240i) != null) {
            gVar.E(mjid, d17);
        }
        return jz5.f0.f302826a;
    }
}
