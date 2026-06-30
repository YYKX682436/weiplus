package kw1;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312835e;

    /* renamed from: f, reason: collision with root package name */
    public int f312836f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw1.o f312839i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kw1.k kVar, kw1.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312838h = kVar;
        this.f312839i = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kw1.g gVar = new kw1.g(this.f312838h, this.f312839i, continuation);
        gVar.f312837g = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.g) create((mw1.b) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kw1.o oVar;
        java.lang.Object c17;
        android.util.Size drawSize;
        pw1.d dVar;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312836f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mw1.c a17 = ((mw1.b) this.f312837g).a();
            if (a17 == null) {
                return null;
            }
            kw1.k kVar = this.f312838h;
            pw1.d dVar2 = kVar.f312856f;
            android.util.Size renderSize = ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17).getRenderSize();
            oVar = this.f312839i;
            java.lang.String str = ((kw1.l) oVar).f312858a;
            this.f312837g = renderSize;
            this.f312834d = oVar;
            this.f312835e = dVar2;
            this.f312836f = 1;
            c17 = kVar.f312853c.c(str, this);
            if (c17 == aVar) {
                return aVar;
            }
            drawSize = renderSize;
            dVar = dVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                c18 = obj;
                return (pw1.f) c18;
            }
            dVar = (pw1.d) this.f312835e;
            kw1.o oVar2 = (kw1.o) this.f312834d;
            drawSize = (android.util.Size) this.f312837g;
            kotlin.ResultKt.throwOnFailure(obj);
            oVar = oVar2;
            c17 = obj;
        }
        qw1.e yuvTextureGroupWrapper = (qw1.e) c17;
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        pw1.g gVar = yuvTextureGroupWrapper.f367088f;
        if (gVar == null) {
            gVar = new pw1.g(0, 0, 0, false, 0, 24, null);
        }
        pw1.e eVar = new pw1.e(gVar, drawSize, yuvTextureGroupWrapper);
        this.f312837g = null;
        this.f312834d = null;
        this.f312835e = null;
        this.f312836f = 2;
        c18 = dVar.c(eVar, this);
        if (c18 == aVar) {
            return aVar;
        }
        return (pw1.f) c18;
    }
}
