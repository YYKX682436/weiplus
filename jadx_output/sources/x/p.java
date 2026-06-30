package x;

/* loaded from: classes16.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.modelbase.f C;
    public final /* synthetic */ df2.lm D;
    public final /* synthetic */ kotlin.jvm.internal.h0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.modelbase.f fVar, df2.lm lmVar, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.C = fVar;
        this.D = lmVar;
        this.E = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = this.E;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = null;
        com.tencent.mm.modelbase.f fVar = this.C;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            df2.lm lmVar = this.D;
            lmVar.Z6();
            db5.t7.h(lmVar.O6(), lmVar.O6().getResources().getString(com.tencent.mm.R.string.f491573er));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if2.b.Y6(lmVar, qo0.b.f365339d2, null, 2, null);
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveHonorVisitorGuideController", "CgiFinderLiveModBasicInfo failed. errType=" + fVar.f70615a + " errCode=" + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
