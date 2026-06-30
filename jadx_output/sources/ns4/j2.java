package ns4;

/* loaded from: classes8.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339556e = weCoinIncomeDetailView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ns4.j2(this.f339556e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ns4.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339555d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339556e;
            ms4.t tVar = weCoinIncomeDetailView.f179176s;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            this.f339555d = 1;
            r45.v11 v11Var = tVar.f331122t;
            if ((v11Var != null ? ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).Zi(weCoinIncomeDetailView, v11Var, this) : java.lang.Boolean.FALSE) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
