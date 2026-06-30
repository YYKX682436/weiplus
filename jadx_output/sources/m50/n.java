package m50;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f323492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m50.x f323493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f f323494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f323495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m50.x xVar, com.tencent.mm.ui.widget.dialog.f fVar, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f323493e = xVar;
        this.f323494f = fVar;
        this.f323495g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m50.n(this.f323493e, this.f323494f, this.f323495g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m50.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f323492d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(oy.j.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            m50.x xVar = this.f323493e;
            android.app.Activity context = xVar.getContext();
            java.lang.String d76 = xVar.d7();
            int b76 = xVar.b7();
            this.f323492d = 1;
            obj = ((te5.l1) ((oy.j) c17)).ij(context, d76, b76, null, null, false, 2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        m50.m mVar = new m50.m(this.f323494f, this.f323495g, this.f323493e, str, null);
        this.f323492d = 2;
        if (kotlinx.coroutines.l.g(g3Var, mVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
