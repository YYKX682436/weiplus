package xw0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457631d;

    /* renamed from: e, reason: collision with root package name */
    public int f457632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sw0.d f457633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sw0.d dVar, xw0.r rVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457633f = dVar;
        this.f457634g = rVar;
        this.f457635h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xw0.k(this.f457633f, this.f457634g, this.f457635h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fv0.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457632e;
        xw0.r rVar = this.f457634g;
        sw0.d dVar2 = this.f457633f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.material.g gVar = dVar2.f413422a.f48223a;
            kotlin.jvm.internal.o.f(gVar, "getMaterialScene(...)");
            fv0.d c17 = fv0.e.c(gVar);
            rVar.r(xw0.r.c(rVar, c17, dVar2));
            sw0.d dVar3 = this.f457633f;
            zu0.i iVar = dVar3.f413423b;
            if (iVar != zu0.i.f475674d) {
                if (iVar == zu0.i.f475676f) {
                    xw0.r.m(this.f457634g, dVar3, this.f457635h, false, 4, null);
                }
                return jz5.f0.f302826a;
            }
            rVar.r(xw0.r.b(rVar, c17, dVar3));
            java.lang.String str = dVar2.f413422a.f48224b;
            kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
            this.f457631d = c17;
            this.f457632e = 1;
            java.lang.Object h17 = rVar.h(str, this);
            if (h17 == aVar) {
                return aVar;
            }
            dVar = c17;
            obj = h17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (fv0.d) this.f457631d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            rVar.r(xw0.r.a(rVar, dVar, dVar2));
            xw0.r.m(this.f457634g, this.f457633f, this.f457635h, false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
