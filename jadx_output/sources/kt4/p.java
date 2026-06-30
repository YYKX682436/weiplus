package kt4;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312046c = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        ((java.lang.Integer) objArr[0]).intValue();
        java.lang.String str = (java.lang.String) objArr[1];
        np5.b0 b0Var = this.f338834b;
        b0Var.c(2996);
        b0Var.a(new com.tencent.mm.plugin.wallet.balance.model.lqt.f3(kt4.r.F(this.f312046c), str), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.d dVar;
        if (!(m1Var instanceof com.tencent.mm.plugin.wallet.balance.model.lqt.f3)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "openLqbAccount scene end, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.wallet.balance.model.lqt.f3 f3Var = (com.tencent.mm.plugin.wallet.balance.model.lqt.f3) m1Var;
        android.os.Bundle bundle = new android.os.Bundle();
        kt4.r rVar = this.f312046c;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0 && i18 == 0) {
            r45.p15 p15Var = f3Var.f177632d;
            r45.ce4 ce4Var = p15Var.f382663f;
            if (ce4Var != null && (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI) && (dVar = ((com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI) mMActivity).f181036d) != null) {
                dVar.a(ce4Var, null);
            }
            if (p15Var.f382661d == 0) {
                rVar.f213801c.putBoolean("key_goto_lqt_detail", true);
                bundle.putInt("key_process_result_code", -1);
            } else if (p15Var.f382663f == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "toast: %s", p15Var.f382662e);
                dp.a.makeText(mMActivity, p15Var.f382662e, 1).show();
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "net error: %s", m1Var);
            db5.e1.F(mMActivity, jt4.f.a(mMActivity, str), "", false);
        }
        rVar.f(mMActivity, bundle);
        return true;
    }
}
