package hj3;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281609d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj3.c f281611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f281613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lj3.c cVar, hj3.m mVar, hj3.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281611f = cVar;
        this.f281612g = mVar;
        this.f281613h = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hj3.e eVar = new hj3.e(this.f281611f, this.f281612g, this.f281613h, continuation);
        eVar.f281610e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.e) create((jj3.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281609d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jj3.c cVar = (jj3.c) this.f281610e;
            hj3.r rVar = this.f281613h;
            hj3.m mVar = this.f281612g;
            lj3.c cVar2 = this.f281611f;
            if (cVar2 == null) {
                jj3.d a17 = cVar.a();
                if (a17 != null) {
                    kj3.d dVar = mVar.f281649g;
                    hj3.p pVar = (hj3.p) rVar;
                    android.util.Size drawSize = a17.getSize();
                    boolean z17 = pVar.f281655d;
                    mj3.g renderInfo = pVar.f281652b;
                    if (z17) {
                        renderInfo = mj3.g.a(renderInfo, 0, 0, 0, !renderInfo.f327053d, false, 23, null);
                    }
                    kotlin.jvm.internal.o.g(drawSize, "drawSize");
                    kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
                    kj3.e eVar = new kj3.e(renderInfo, drawSize, pVar.f281654c.f294395e, true);
                    this.f281609d = 1;
                    c18 = dVar.c(eVar, this);
                    if (c18 == aVar) {
                        return aVar;
                    }
                    return (kj3.f) c18;
                }
            } else {
                jj3.d a18 = cVar.a();
                if (a18 != null) {
                    kj3.d dVar2 = mVar.f281649g;
                    android.util.Size drawSize2 = a18.getSize();
                    hj3.p pVar2 = (hj3.p) rVar;
                    boolean z18 = pVar2.f281655d;
                    mj3.g renderInfo2 = pVar2.f281652b;
                    if (z18) {
                        renderInfo2 = mj3.g.a(renderInfo2, 0, 0, 0, !renderInfo2.f327053d, false, 23, null);
                    }
                    kotlin.jvm.internal.o.g(drawSize2, "drawSize");
                    kotlin.jvm.internal.o.g(renderInfo2, "renderInfo");
                    kj3.e eVar2 = new kj3.e(renderInfo2, drawSize2, cVar2.f318976c, false);
                    this.f281609d = 2;
                    c17 = dVar2.c(eVar2, this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                c18 = obj;
                return (kj3.f) c18;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        return null;
    }
}
