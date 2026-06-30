package hj3;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281604d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj3.c f281606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f281608h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(lj3.c cVar, hj3.m mVar, hj3.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281606f = cVar;
        this.f281607g = mVar;
        this.f281608h = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hj3.d dVar = new hj3.d(this.f281606f, this.f281607g, this.f281608h, continuation);
        dVar.f281605e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.d) create((jj3.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281604d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return (kj3.f) obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return null;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        jj3.d a17 = ((jj3.c) this.f281605e).a();
        if (a17 != null) {
            lj3.c cVar = this.f281606f;
            hj3.m mVar = this.f281607g;
            if (cVar == null) {
                kj3.d dVar = mVar.f281649g;
                hj3.p pVar = (hj3.p) this.f281608h;
                android.util.Size drawSize = a17.getSize();
                mj3.g renderInfo = pVar.f281652b;
                kotlin.jvm.internal.o.g(drawSize, "drawSize");
                kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
                kj3.e eVar = new kj3.e(renderInfo, drawSize, pVar.f281654c.f294395e, true);
                this.f281604d = 1;
                obj = dVar.c(eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (kj3.f) obj;
            }
            kj3.d dVar2 = mVar.f281649g;
            android.util.Size drawSize2 = a17.getSize();
            kotlin.jvm.internal.o.g(drawSize2, "drawSize");
            mj3.g renderInfo2 = cVar.f318975b;
            kotlin.jvm.internal.o.g(renderInfo2, "renderInfo");
            kj3.e eVar2 = new kj3.e(renderInfo2, drawSize2, cVar.f318976c, false);
            this.f281604d = 2;
            if (dVar2.c(eVar2, this) == aVar) {
                return aVar;
            }
        }
        return null;
    }
}
