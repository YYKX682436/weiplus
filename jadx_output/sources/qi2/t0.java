package qi2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f363626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(xg2.h hVar, kotlin.coroutines.Continuation continuation, qi2.w0 w0Var) {
        super(2, continuation);
        this.f363626e = hVar;
        this.f363627f = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi2.t0(this.f363626e, continuation, this.f363627f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363625d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.f71 f71Var = (r45.f71) ((xg2.i) this.f363626e).f454393b;
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftSelectPanelWidget", "indicator_parameter_list origin size: " + f71Var.getList(1).size());
            int size = f71Var.getList(1).size();
            qi2.w0 w0Var = this.f363627f;
            if (size > 0) {
                java.util.LinkedList<com.tencent.mm.protobuf.g> list = f71Var.getList(1);
                kotlin.jvm.internal.o.f(list, "getIndicator_parameter_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.mm.protobuf.g gVar : list) {
                    r45.km1 km1Var = new r45.km1();
                    try {
                        km1Var.parseFrom(gVar.f192156a);
                    } catch (java.io.IOException unused) {
                    }
                    ce2.i e17 = dk2.u7.f234181a.e(km1Var.getString(0));
                    vi2.f fVar = e17 != null ? new vi2.f(e17) : null;
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                java.util.List F0 = kz5.n0.F0(arrayList, new qi2.u0());
                com.tencent.mars.xlog.Log.i("FinderLivePkGiftSelectPanelWidget", "indicator_parameter_list after size: " + F0.size());
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                qi2.q0 q0Var = new qi2.q0(w0Var, F0, null);
                this.f363625d = 1;
                if (kotlinx.coroutines.l.g(g3Var, q0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
                qi2.r0 r0Var = new qi2.r0(w0Var, null);
                this.f363625d = 2;
                if (kotlinx.coroutines.l.g(g3Var2, r0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
