package rn2;

/* loaded from: classes3.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f397833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(rn2.t2 t2Var, r45.dz1 dz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397832e = t2Var;
        this.f397833f = dz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.r1(this.f397832e, this.f397833f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397831d;
        rn2.t2 t2Var = this.f397832e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rn2.l0 l0Var = rn2.l0.f397792a;
            com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
            this.f397831d = 1;
            obj = l0Var.e(mMActivity, this.f397833f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        r45.kn1 kn1Var = (r45.kn1) lVar.f302834e;
        jz5.f0 f0Var = null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.lang.Object obj2 = lVar.f302833d;
        if (kn1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", "create lottery bill_status:" + kn1Var.getInteger(1) + '(' + ((java.lang.String) obj2) + ")!");
            int integer = kn1Var.getInteger(1);
            if (integer == 1) {
                gk2.e eVar = gk2.e.f272471n;
                if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).S) {
                    rn2.f fVar = t2Var.f397854f;
                    if (fVar != null) {
                        ((rn2.c1) fVar).h((r45.dz1) kn1Var.getCustom(3), kn1Var.getInteger(2));
                    }
                } else {
                    rn2.f fVar2 = t2Var.f397854f;
                    if (fVar2 != null) {
                        ((rn2.c1) fVar2).v();
                    }
                }
            } else if (integer == 2) {
                com.tencent.mars.xlog.Log.e("FinderLiveLotteryCreateViewCallback", "create lottery fail " + ((java.lang.String) obj2) + '!');
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLotteryCreateViewCallback", "tryCreateLottery fail " + ((java.lang.String) obj2) + '!');
        }
        return f0Var2;
    }
}
