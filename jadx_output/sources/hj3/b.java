package hj3;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281596e;

    /* renamed from: f, reason: collision with root package name */
    public int f281597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f281599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj3.m mVar, hj3.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281598g = mVar;
        this.f281599h = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hj3.b(this.f281598g, this.f281599h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        oj3.a aVar;
        hj3.q qVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f281597f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hj3.m mVar = this.f281598g;
            oj3.a aVar3 = mVar.f281647e;
            hj3.r rVar = this.f281599h;
            hj3.q qVar2 = (hj3.q) rVar;
            nj3.j jVar = mVar.f281645c;
            java.lang.String str = ((hj3.q) rVar).f281651a;
            this.f281595d = aVar3;
            this.f281596e = qVar2;
            this.f281597f = 1;
            obj = jVar.c(str, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            qVar = qVar2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (hj3.q) this.f281596e;
            aVar = (oj3.a) this.f281595d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nj3.e yuvTextureGroupWrapper = (nj3.e) obj;
        kotlin.jvm.internal.o.g(qVar, "<this>");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        oj3.b bVar = new oj3.b(qVar.f281657c, qVar.f281652b, yuvTextureGroupWrapper);
        this.f281595d = null;
        this.f281596e = null;
        this.f281597f = 2;
        obj = aVar.c(bVar, this);
        return obj == aVar2 ? aVar2 : obj;
    }
}
