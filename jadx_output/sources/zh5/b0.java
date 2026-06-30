package zh5;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f472999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f473000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f473001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.i f473002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z17, sf3.g gVar, sf3.j jVar, sf3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472999d = z17;
        this.f473000e = gVar;
        this.f473001f = jVar;
        this.f473002g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zh5.b0(this.f472999d, this.f473000e, this.f473001f, this.f473002g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zh5.b0 b0Var = (zh5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        sf3.g gVar = this.f473000e;
        gVar.c();
        this.f473001f.a(gVar, this.f473002g);
        return jz5.f0.f302826a;
    }
}
