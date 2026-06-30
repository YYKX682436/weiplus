package kz0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f313815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.y f313816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313819i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.y yVar, yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313814d = m7Var;
        this.f313815e = c1Var;
        this.f313816f = yVar;
        this.f313817g = lVar;
        this.f313818h = v2Var;
        this.f313819i = v2Var2;
        this.f313820m = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kz0.v(this.f313814d, this.f313815e, this.f313816f, this.f313817g, this.f313818h, this.f313819i, this.f313820m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kz0.v vVar = (kz0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f313817g;
        n0.v2 v2Var = this.f313818h;
        n0.v2 v2Var2 = this.f313819i;
        kz0.q qVar = new kz0.q(lVar, v2Var, v2Var2);
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f313814d;
        m7Var.getClass();
        m7Var.f70090h = qVar;
        m7Var.f70091i = new kz0.r(lVar, v2Var, v2Var2);
        m7Var.f70092j = new kz0.s(lVar, v2Var, v2Var2);
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f313815e;
        c1Var.getClass();
        yz5.a aVar2 = this.f313820m;
        kotlin.jvm.internal.o.g(aVar2, "<set-?>");
        c1Var.f69874e = aVar2;
        c1Var.f69875f = new kz0.t(m7Var);
        kz0.u uVar = new kz0.u(aVar2);
        com.tencent.mm.mj_template.sns.compose.widget.y yVar = this.f313816f;
        yVar.getClass();
        yVar.f70327f = uVar;
        return jz5.f0.f302826a;
    }
}
