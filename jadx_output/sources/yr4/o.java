package yr4;

/* loaded from: classes9.dex */
public class o extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465107c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) objArr[0];
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) objArr[1];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WalletCardElementUI onNext pay_flag : ");
        yr4.u uVar = this.f465107c;
        sb6.append(uVar.f213801c.getInt("key_pay_flag", 0));
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", sb6.toString());
        int i17 = uVar.f213801c.getInt("key_pay_flag", 0);
        np5.b0 b0Var = this.f338834b;
        if (i17 == 1) {
            if (uVar.r()) {
                authen.f179542d = 4;
            } else {
                authen.f179542d = 1;
            }
            b0Var.d(new as4.b(authen, orders, false), true);
            return true;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return false;
            }
            if (uVar.r()) {
                authen.f179542d = 6;
            } else {
                authen.f179542d = 3;
            }
            b0Var.d(new as4.b(authen, orders, false), true);
            return true;
        }
        if (uVar.r()) {
            authen.f179542d = 5;
        } else {
            authen.f179542d = 2;
        }
        if (uVar.f213801c.getBoolean("key_is_changing_balance_phone_num", false)) {
            b0Var.d(zr4.a.b(authen, orders, uVar.f213801c.getBoolean("key_isbalance", false)), true);
        } else {
            b0Var.d(new as4.b(authen, orders, false), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof as4.b;
        yr4.u uVar = this.f465107c;
        if (z17) {
            as4.b bVar = (as4.b) m1Var;
            uVar.f465111e = bVar;
            uVar.f213801c.putString("kreq_token", bVar.C);
            if (bVar.isPaySuccess) {
                uVar.f213801c.putParcelable("key_orders", bVar.A);
            }
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = bVar.f214061s;
            if (realnameGuideHelper != null) {
                uVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
            }
        } else if (m1Var instanceof as4.c) {
            as4.c cVar = (as4.c) m1Var;
            uVar.f465111e = cVar;
            uVar.f213801c.putString("kreq_token", cVar.C);
            if (cVar.isPaySuccess) {
                uVar.f213801c.putParcelable("key_orders", cVar.A);
            }
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (!uVar.t(mMActivity, null)) {
            if (!z17 || !((as4.b) m1Var).f13548x) {
                uVar.o(mMActivity, 0, uVar.f213801c);
            }
            return true;
        }
        android.os.Bundle bundle = uVar.f213801c;
        java.lang.String str2 = "";
        if (bundle != null && (payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info")) != null) {
            str2 = payInfo.f192114m;
        }
        this.f338834b.d(new ss4.e0(str2, 13), true);
        return true;
    }
}
