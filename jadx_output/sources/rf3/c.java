package rf3;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f394981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f394982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f394983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.i f394984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, sf3.g gVar, sf3.j jVar, sf3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394981d = z17;
        this.f394982e = gVar;
        this.f394983f = jVar;
        this.f394984g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf3.c(this.f394981d, this.f394982e, this.f394983f, this.f394984g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf3.c cVar = (rf3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        sf3.g gVar = this.f394982e;
        gVar.c();
        this.f394983f.a(gVar, this.f394984g);
        return jz5.f0.f302826a;
    }
}
