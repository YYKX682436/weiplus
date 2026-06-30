package uh5;

/* loaded from: classes12.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f427997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f427998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f427999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.i f428000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z17, sf3.g gVar, sf3.j jVar, sf3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f427997d = z17;
        this.f427998e = gVar;
        this.f427999f = jVar;
        this.f428000g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uh5.b(this.f427997d, this.f427998e, this.f427999f, this.f428000g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uh5.b bVar = (uh5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        sf3.g gVar = this.f427998e;
        gVar.c();
        this.f427999f.a(gVar, this.f428000g);
        return jz5.f0.f302826a;
    }
}
