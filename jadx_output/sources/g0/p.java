package g0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f267363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.r f267364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1.g f267365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g0.r rVar, d1.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267364e = rVar;
        this.f267365f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g0.p(this.f267364e, this.f267365f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f267363d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g0.m mVar = this.f267364e.f267372g;
            if (mVar == null) {
                kotlin.jvm.internal.o.o("responder");
                throw null;
            }
            this.f267363d = 1;
            b0.h hVar = (b0.h) mVar;
            d1.g localRect = this.f267365f;
            kotlin.jvm.internal.o.g(localRect, "localRect");
            p2.q qVar = hVar.f16308m;
            if (qVar == null) {
                throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
            }
            java.lang.Object b17 = hVar.b(localRect, hVar.a(localRect, qVar.f351396a), this);
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
