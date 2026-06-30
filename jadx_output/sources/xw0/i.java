package xw0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457623d;

    /* renamed from: e, reason: collision with root package name */
    public int f457624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sw0.d f457626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xw0.r rVar, sw0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457625f = rVar;
        this.f457626g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xw0.i(this.f457625f, this.f457626g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fv0.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457624e;
        sw0.d dVar2 = this.f457626g;
        xw0.r rVar = this.f457625f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fv0.d dVar3 = fv0.d.f266961m;
            rVar.r(xw0.r.c(rVar, dVar3, dVar2));
            if (dVar2.f413423b == zu0.i.f475674d) {
                rVar.r(xw0.r.b(rVar, dVar3, dVar2));
                java.lang.String str = dVar2.f413422a.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                this.f457623d = dVar3;
                this.f457624e = 1;
                if (rVar.h(str, this) == aVar) {
                    return aVar;
                }
                dVar = dVar3;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (fv0.d) this.f457623d;
        kotlin.ResultKt.throwOnFailure(obj);
        rVar.r(xw0.r.a(rVar, dVar, dVar2));
        return jz5.f0.f302826a;
    }
}
