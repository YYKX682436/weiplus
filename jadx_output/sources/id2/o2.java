package id2;

/* loaded from: classes3.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f290705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar, yz5.l lVar) {
        super(2, continuation);
        this.f290704d = hVar;
        this.f290705e = fVar;
        this.f290706f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.o2(this.f290704d, continuation, this.f290705e, this.f290706f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.o2 o2Var = (id2.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f290704d).f454393b;
        this.f290705e.b();
        r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
        boolean z17 = nw1Var != null;
        yz5.l lVar = this.f290706f;
        if (z17) {
            lVar.invoke(nw1Var);
        } else {
            lVar.invoke(null);
            com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "get live info success, but liveInfo is null");
        }
        return jz5.f0.f302826a;
    }
}
