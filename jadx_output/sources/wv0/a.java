package wv0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx0.g f449896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.n f449897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dx0.g gVar, vv0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449896d = gVar;
        this.f449897e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wv0.a(this.f449896d, this.f449897e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wv0.a aVar = (wv0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vv0.n nVar = this.f449897e;
        com.tencent.maas.base.MJID mjid = nVar.f440398a;
        dx0.g gVar = this.f449896d;
        gVar.f(mjid);
        gVar.b(nVar.f440398a);
        return jz5.f0.f302826a;
    }
}
