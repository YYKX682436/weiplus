package va2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f434245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f434246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va2.n f434247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.modelbase.f fVar, kotlin.jvm.internal.c0 c0Var, va2.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f434245d = fVar;
        this.f434246e = c0Var;
        this.f434247f = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new va2.k(this.f434245d, this.f434246e, this.f434247f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        va2.k kVar = (va2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ma1 ma1Var;
        r45.r03 r03Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTopicTabUIC", "[request] launch ui");
        com.tencent.mm.modelbase.f fVar = this.f434245d;
        int i17 = fVar.f70615a;
        va2.n nVar = this.f434247f;
        kotlin.jvm.internal.c0 c0Var = this.f434246e;
        if (i17 == 0 && fVar.f70616b == 0 && (ma1Var = (r45.ma1) fVar.f70618d) != null && (r03Var = (r45.r03) ma1Var.getCustom(1)) != null) {
            nVar.f452711w = r03Var;
            nVar.E7(r03Var);
            c0Var.f310112d = nVar.Q7(r03Var);
        }
        if (!c0Var.f310112d) {
            nVar.C7(fVar.f70616b, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
