package qf2;

/* loaded from: classes.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362399h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(qf2.y1 y1Var, dk2.m mVar, dk2.m mVar2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362396e = y1Var;
        this.f362397f = mVar;
        this.f362398g = mVar2;
        this.f362399h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.h1(this.f362396e, this.f362397f, this.f362398g, this.f362399h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362395d;
        qf2.y1 y1Var = this.f362396e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((az2.f) ((jz5.n) y1Var.f362659o).getValue()).a();
            qf2.y1 y1Var2 = this.f362396e;
            dk2.m mVar = this.f362397f;
            qf2.f1 f1Var = qf2.f1.f362366d;
            this.f362395d = 1;
            if (qf2.y1.b7(y1Var2, mVar, 1, false, f1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain end");
                ((az2.f) ((jz5.n) y1Var.f362659o).getValue()).b();
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.u4 u4Var = ((mm2.o4) y1Var.business(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.f234154a != null) {
            qf2.y1 y1Var3 = this.f362396e;
            dk2.m mVar2 = this.f362398g;
            qf2.g1 g1Var = new qf2.g1(this.f362399h);
            this.f362395d = 2;
            if (qf2.y1.b7(y1Var3, mVar2, 3, false, g1Var, this) == aVar) {
                return aVar;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain end");
        ((az2.f) ((jz5.n) y1Var.f362659o).getValue()).b();
        return jz5.f0.f302826a;
    }
}
