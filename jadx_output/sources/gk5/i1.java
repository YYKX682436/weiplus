package gk5;

/* loaded from: classes.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f272670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f272671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f272672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(gk5.k1 k1Var, wi5.o oVar, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272670d = k1Var;
        this.f272671e = oVar;
        this.f272672f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.i1(this.f272670d, this.f272671e, this.f272672f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gk5.i1 i1Var = (gk5.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.util.LinkedList) ((com.tencent.mm.storage.k4) c01.d9.b().q()).Q()).size() > 0) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f272670d.O6();
            if (O6 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new gk5.h1(this.f272670d, this.f272671e, Ni, this.f272672f, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
