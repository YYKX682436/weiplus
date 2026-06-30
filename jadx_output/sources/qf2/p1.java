package qf2;

/* loaded from: classes.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.y1 y1Var, yz5.l lVar) {
        super(2, continuation);
        this.f362527d = hVar;
        this.f362528e = y1Var;
        this.f362529f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.p1(this.f362527d, continuation, this.f362528e, this.f362529f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.p1 p1Var = (qf2.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f362527d).f454381b;
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "newModifyAnchorBattle fail: " + aVar2);
        rm0.j jVar = aVar2.f454379a;
        java.lang.String str = jVar != null ? jVar.f397426g : null;
        boolean z17 = str == null || str.length() == 0;
        qf2.y1 y1Var = this.f362528e;
        if (z17) {
            str = y1Var.O6().getResources().getString(com.tencent.mm.R.string.ecp);
        }
        db5.t7.g(y1Var.O6(), str);
        yz5.l lVar = this.f362529f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
