package kw1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312830d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qw1.c f312833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kw1.k kVar, qw1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312832f = kVar;
        this.f312833g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kw1.f fVar = new kw1.f(this.f312832f, this.f312833g, continuation);
        fVar.f312831e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.f) create((mw1.b) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312830d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mw1.c a17 = ((mw1.b) this.f312831e).a();
            if (a17 == null) {
                return null;
            }
            nw1.d dVar = this.f312832f.f312857g;
            android.util.Size drawSize = ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17).getRenderSize();
            qw1.c cVar = this.f312833g;
            kotlin.jvm.internal.o.g(cVar, "<this>");
            kotlin.jvm.internal.o.g(drawSize, "drawSize");
            pw1.g gVar = cVar.f367079c;
            if (gVar == null) {
                gVar = new pw1.g(0, 0, 0, false, 0, 24, null);
            }
            nw1.e eVar = new nw1.e(gVar, drawSize, cVar.f367078b.f294395e, true);
            this.f312830d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (nw1.f) obj;
    }
}
