package d52;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f226540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d52.b f226541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d52.n f226542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d52.b bVar, d52.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226541e = bVar;
        this.f226542f = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        d52.k kVar = new d52.k(this.f226541e, this.f226542f, continuation);
        kVar.f226540d = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d52.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f226540d, null, null, new d52.j(this.f226541e, this.f226542f, null), 3, null);
    }
}
