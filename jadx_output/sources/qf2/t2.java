package qf2;

/* loaded from: classes.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar) {
        super(2, continuation);
        this.f362588d = hVar;
        this.f362589e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.t2(this.f362588d, continuation, this.f362589e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.t2 t2Var = (qf2.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "modifyBattleInfo success ");
        yz5.l lVar = this.f362589e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
