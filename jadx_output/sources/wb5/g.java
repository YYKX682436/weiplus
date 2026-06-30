package wb5;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f444447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f444448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wb5.i iVar, wi5.o oVar, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444446d = iVar;
        this.f444447e = oVar;
        this.f444448f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wb5.g(this.f444446d, this.f444447e, this.f444448f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wb5.g gVar = (wb5.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.util.LinkedList) ((com.tencent.mm.storage.k4) c01.d9.b().q()).Q()).size() > 0) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f444446d.O6();
            if (O6 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new wb5.f(this.f444446d, this.f444447e, Ni, this.f444448f, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
