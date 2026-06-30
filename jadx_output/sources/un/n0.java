package un;

/* loaded from: classes.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f429314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f429315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f429316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(un.p0 p0Var, wi5.o oVar, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429314d = p0Var;
        this.f429315e = oVar;
        this.f429316f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un.n0(this.f429314d, this.f429315e, this.f429316f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        un.n0 n0Var = (un.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.util.LinkedList) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().Q()).size() > 0) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f429314d.O6();
            if (O6 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new un.m0(this.f429314d, this.f429315e, Ni, this.f429316f, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
