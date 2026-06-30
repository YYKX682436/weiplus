package lm;

/* loaded from: classes9.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f319302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.p f319303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm.r f319304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w65.p pVar, lm.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319303e = pVar;
        this.f319304f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        lm.g gVar = new lm.g(this.f319303e, this.f319304f, continuation);
        gVar.f319302d = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lm.g gVar = (lm.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        w65.p pVar = this.f319303e;
        double d17 = pVar.f443365d;
        lm.r rVar = this.f319304f;
        if (d17 > 0.0d) {
            ((lm.o) ((jz5.n) rVar.f319331o).getValue()).put(pVar.f443363b.id(), new java.lang.Float(pVar.f443365d));
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) rVar.f319330n).getValue()).iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            w65.o oVar = (w65.o) ((d75.c) next).get();
            if (oVar != null) {
                oVar.P2(pVar);
            } else {
                oVar = null;
            }
            if (oVar == null) {
                it.remove();
            }
        }
        return jz5.f0.f302826a;
    }
}
