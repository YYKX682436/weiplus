package hj3;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281623e;

    /* renamed from: f, reason: collision with root package name */
    public int f281624f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281626h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hj3.r f281627i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hj3.m mVar, hj3.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281626h = mVar;
        this.f281627i = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hj3.h hVar = new hj3.h(this.f281626h, this.f281627i, continuation);
        hVar.f281625g = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.h) create((jj3.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        hj3.r rVar;
        java.lang.Object c17;
        android.util.Size drawSize;
        mj3.d dVar;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281624f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jj3.d a17 = ((jj3.c) this.f281625g).a();
            if (a17 == null) {
                return null;
            }
            hj3.m mVar = this.f281626h;
            mj3.d dVar2 = mVar.f281648f;
            android.util.Size size = a17.getSize();
            rVar = this.f281627i;
            java.lang.String str = ((hj3.n) rVar).f281651a;
            this.f281625g = size;
            this.f281622d = rVar;
            this.f281623e = dVar2;
            this.f281624f = 1;
            c17 = mVar.f281645c.c(str, this);
            if (c17 == aVar) {
                return aVar;
            }
            drawSize = size;
            dVar = dVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                c18 = obj;
                return (mj3.f) c18;
            }
            dVar = (mj3.d) this.f281623e;
            hj3.r rVar2 = (hj3.r) this.f281622d;
            drawSize = (android.util.Size) this.f281625g;
            kotlin.ResultKt.throwOnFailure(obj);
            rVar = rVar2;
            c17 = obj;
        }
        nj3.e yuvTextureGroupWrapper = (nj3.e) c17;
        kotlin.jvm.internal.o.g(rVar, "<this>");
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        mj3.g gVar = yuvTextureGroupWrapper.f337902f;
        if (gVar == null) {
            gVar = new mj3.g(0, 0, 0, false, false, 24, null);
        }
        mj3.e eVar = new mj3.e(gVar, drawSize, yuvTextureGroupWrapper);
        this.f281625g = null;
        this.f281622d = null;
        this.f281623e = null;
        this.f281624f = 2;
        c18 = dVar.c(eVar, this);
        if (c18 == aVar) {
            return aVar;
        }
        return (mj3.f) c18;
    }
}
