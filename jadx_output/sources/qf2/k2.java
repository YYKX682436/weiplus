package qf2;

/* loaded from: classes.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f362449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(qf2.c3 c3Var, dk2.pf pfVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362448e = c3Var;
        this.f362449f = pfVar;
        this.f362450g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.k2(this.f362448e, this.f362449f, this.f362450g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362447d;
        qf2.c3 c3Var = this.f362448e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((az2.f) ((jz5.n) c3Var.f362316r).getValue()).a();
            qf2.c3 c3Var2 = this.f362448e;
            dk2.pf pfVar = this.f362449f;
            qf2.i2 i2Var = qf2.i2.f362410d;
            this.f362447d = 1;
            if (qf2.c3.Z6(c3Var2, pfVar, 1, false, i2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "anchorReplayVisitorBattleAgain end");
                ((az2.f) ((jz5.n) c3Var.f362316r).getValue()).b();
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.u4 u4Var = ((mm2.o4) c3Var.business(mm2.o4.class)).Z;
        if (u4Var != null && (str = u4Var.f234154a) != null) {
            qf2.c3 c3Var3 = this.f362448e;
            qf2.j2 j2Var = new qf2.j2(this.f362450g);
            this.f362447d = 2;
            if (c3Var3.g7(3, str, false, j2Var, this) == aVar) {
                return aVar;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "anchorReplayVisitorBattleAgain end");
        ((az2.f) ((jz5.n) c3Var.f362316r).getValue()).b();
        return jz5.f0.f302826a;
    }
}
