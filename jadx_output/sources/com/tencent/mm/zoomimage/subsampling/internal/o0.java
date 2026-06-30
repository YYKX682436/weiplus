package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f215038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f215039e;

    /* renamed from: f, reason: collision with root package name */
    public long f215040f;

    /* renamed from: g, reason: collision with root package name */
    public int f215041g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f215042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215043i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yq5.g f215044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yq5.c f215045n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f215046o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yq5.k kVar, yq5.g gVar, yq5.c cVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f215043i = kVar;
        this.f215044m = gVar;
        this.f215045n = cVar;
        this.f215046o = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.zoomimage.subsampling.internal.o0 o0Var = new com.tencent.mm.zoomimage.subsampling.internal.o0(this.f215043i, this.f215044m, this.f215045n, this.f215046o, continuation);
        o0Var.f215042h = obj;
        return o0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        yq5.k subsamplingImage;
        yq5.g gVar;
        yq5.c cVar;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f215041g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                subsamplingImage = this.f215043i;
                gVar = this.f215044m;
                yq5.c cVar2 = this.f215045n;
                long j18 = this.f215046o;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                yq5.d dVar = subsamplingImage.f464600a;
                this.f215042h = subsamplingImage;
                this.f215038d = gVar;
                this.f215039e = cVar2;
                this.f215040f = j18;
                this.f215041g = 1;
                yq5.f fVar = ((yq5.e) dVar).f464595a;
                if (fVar == aVar) {
                    return aVar;
                }
                cVar = cVar2;
                obj = fVar;
                j17 = j18;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j17 = this.f215040f;
                cVar = (yq5.c) this.f215039e;
                gVar = (yq5.g) this.f215038d;
                subsamplingImage = (yq5.k) this.f215042h;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            yq5.f imageSource = (yq5.f) obj;
            ((com.tencent.mm.zoomimage.subsampling.internal.a) gVar).getClass();
            kotlin.jvm.internal.o.g(subsamplingImage, "subsamplingImage");
            kotlin.jvm.internal.o.g(imageSource, "imageSource");
            com.tencent.mm.zoomimage.subsampling.internal.d dVar2 = new com.tencent.mm.zoomimage.subsampling.internal.d(subsamplingImage, imageSource, subsamplingImage.f464601b);
            try {
                yq5.c cVar3 = (yq5.c) ((jz5.n) dVar2.f214933i).getValue();
                if (cVar == null || !kotlin.jvm.internal.o.b(cVar, cVar3)) {
                    com.tencent.mm.zoomimage.subsampling.internal.q0.a(cVar3, gVar, j17);
                }
                dVar2.a();
                m521constructorimpl = kotlin.Result.m521constructorimpl(dVar2);
            } catch (java.lang.Exception e17) {
                try {
                    dVar2.close();
                } catch (java.lang.RuntimeException e18) {
                    throw e18;
                } catch (java.lang.Exception unused) {
                }
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return kotlin.Result.m520boximpl(m521constructorimpl);
    }
}
