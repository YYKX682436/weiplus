package xq2;

/* loaded from: classes2.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456045d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vp2.c f456048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, vp2.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456047f = str;
        this.f456048g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xq2.d dVar = new xq2.d(this.f456047f, this.f456048g, continuation);
        dVar.f456046e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xq2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.yz2 yz2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456045d;
        java.lang.String str = this.f456047f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f456046e;
            xq2.c cVar = new xq2.c(this.f456048g, str);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            aq2.g gVar = new aq2.g(cVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, str);
            this.f456045d = 1;
            obj = ay1.l.h(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null && (yz2Var = (r45.yz2) fVar.f70618d) != null) {
            xq2.e.f456050b.R6(yz2Var.f391533w * 1000);
        }
        xq2.e.f456051c.remove(str);
        return jz5.f0.f302826a;
    }
}
