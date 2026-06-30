package yr4;

/* loaded from: classes9.dex */
public class q extends yr4.t {
    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0) {
            return mMActivity.getString(com.tencent.mm.R.string.kff);
        }
        if (i17 != 1) {
            return null;
        }
        return mMActivity.getString(com.tencent.mm.R.string.kfe);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) objArr[0];
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = vr4.f1.wi().Ai().f13999h;
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "balance == null");
            return false;
        }
        bankcard.O2 += orders.f179678h;
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
