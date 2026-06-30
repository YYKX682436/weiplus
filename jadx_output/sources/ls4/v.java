package ls4;

/* loaded from: classes8.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls4.w f321104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ls4.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321104e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ls4.v(this.f321104e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ls4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321103d;
        ls4.w wVar = this.f321104e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("WeCoinEncashLogic", "getRealNameInfo");
            com.tencent.mm.ui.MMActivity mMActivity = wVar.f321105a;
            wVar.f321108d = com.tencent.mm.ui.widget.dialog.u3.f(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ggc), false, 3, null);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = wVar.f321105a;
            this.f321103d = 1;
            obj = ((com.tencent.mm.feature.finder.live.t6) b1Var).Ai(mMActivity2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = wVar.f321108d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("WeCoinEncashLogic", "getRealNameInfo succ.");
            js4.p pVar = (js4.p) wVar.f321107c.get();
            if (pVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "realNameDidSuccess callback");
                ((com.tencent.mm.plugin.finder.viewmodel.component.eo) pVar).W6();
            }
            wVar.a();
        } else {
            com.tencent.mars.xlog.Log.i("WeCoinEncashLogic", "getRealNameInfo failed.");
        }
        return jz5.f0.f302826a;
    }
}
