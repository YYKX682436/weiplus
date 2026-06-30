package kw1;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312814e;

    /* renamed from: f, reason: collision with root package name */
    public int f312815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw1.o f312817h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kw1.k kVar, kw1.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312816g = kVar;
        this.f312817h = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kw1.b(this.f312816g, this.f312817h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rw1.a aVar;
        kw1.n nVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f312815f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kw1.k kVar = this.f312816g;
            rw1.a aVar3 = kVar.f312855e;
            kw1.o oVar = this.f312817h;
            kw1.n nVar2 = (kw1.n) oVar;
            qw1.j jVar = kVar.f312853c;
            java.lang.String str = ((kw1.n) oVar).f312858a;
            this.f312813d = aVar3;
            this.f312814e = nVar2;
            this.f312815f = 1;
            obj = jVar.c(str, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            nVar = nVar2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (kw1.n) this.f312814e;
            aVar = (rw1.a) this.f312813d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qw1.e yuvTextureGroupWrapper = (qw1.e) obj;
        kotlin.jvm.internal.o.g(nVar, "<this>");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        rw1.b bVar = new rw1.b(nVar.f312861c, nVar.f312859b, yuvTextureGroupWrapper);
        this.f312813d = null;
        this.f312814e = null;
        this.f312815f = 2;
        obj = aVar.c(bVar, this);
        return obj == aVar2 ? aVar2 : obj;
    }
}
