package rn2;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f397919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xg2.h hVar, kotlin.coroutines.Continuation continuation, android.content.Context context) {
        super(2, continuation);
        this.f397919d = hVar;
        this.f397920e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.y(this.f397919d, continuation, this.f397920e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rn2.y yVar = (rn2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f397919d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] failed, pb = ");
        rm0.j jVar = aVar2.f454379a;
        java.lang.Boolean bool = null;
        sb6.append((jVar == null || (fVar = jVar.f397427h) == null) ? null : pm0.b0.g(fVar));
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryGiftCreate", sb6.toString());
        rm0.j jVar2 = aVar2.f454379a;
        com.tencent.mm.protobuf.f fVar2 = jVar2 != null ? jVar2.f397427h : null;
        r45.oz1 oz1Var = fVar2 instanceof r45.oz1 ? (r45.oz1) fVar2 : null;
        if (oz1Var != null) {
            r45.qp1 qp1Var = (r45.qp1) oz1Var.getCustom(3);
            java.lang.Integer num = jVar2 != null ? new java.lang.Integer(jVar2.f397424e) : null;
            java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null;
            if (qp1Var != null && num != null && num2 != null) {
                bool = java.lang.Boolean.valueOf(hz2.d.f286313a.j(num.intValue(), num2.intValue(), qp1Var));
            }
            if (bool == null) {
                pm0.v.X(new rn2.b0(this.f397920e));
            }
        }
        return jz5.f0.f302826a;
    }
}
