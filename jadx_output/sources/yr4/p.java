package yr4;

/* loaded from: classes9.dex */
public class p extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465108c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        yr4.u uVar = this.f465108c;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) uVar.f213801c.getParcelable("key_orders");
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "WalletVerifyCodeUI onNext pay_flag : " + uVar.f213801c.getInt("key_pay_flag", 0));
        boolean z17 = uVar.f213801c.getBoolean("key_is_changing_balance_phone_num");
        int i17 = uVar.f213801c.getInt("key_pay_flag", 0);
        np5.b0 b0Var = this.f338834b;
        if (i17 == 1) {
            z0Var.f14022a = "1";
            if (z17) {
                b0Var.d(zr4.a.c(z0Var, orders), true);
            } else {
                ds4.g d17 = zr4.a.d(z0Var, orders);
                if (d17 != null) {
                    b0Var.d(d17, true);
                }
            }
            return true;
        }
        if (i17 == 2) {
            if (uVar.r()) {
                z0Var.f14022a = "5";
            } else {
                z0Var.f14022a = "2";
            }
            if (z17) {
                b0Var.d(zr4.a.c(z0Var, orders), true);
            } else {
                ds4.g d18 = zr4.a.d(z0Var, orders);
                if (d18 != null) {
                    b0Var.d(d18, true);
                }
            }
            return true;
        }
        if (i17 != 3) {
            return false;
        }
        if (uVar.r()) {
            z0Var.f14022a = "6";
        } else {
            z0Var.f14022a = "3";
        }
        if (z17) {
            b0Var.d(zr4.a.c(z0Var, orders), true);
        } else {
            ds4.g d19 = zr4.a.d(z0Var, orders);
            if (d19 != null) {
                b0Var.d(d19, true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof ds4.g) && !(m1Var instanceof ds4.b)) {
            return m1Var instanceof as4.b;
        }
        ds4.g gVar = (ds4.g) m1Var;
        boolean z17 = gVar.isPaySuccess;
        yr4.u uVar = this.f465108c;
        if (z17) {
            uVar.f213801c.putParcelable("key_orders", gVar.f242926x);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = gVar.f214061s;
        if (realnameGuideHelper != null) {
            uVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10707, 1, java.lang.Integer.valueOf((int) ((java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.wallet_core.utils.b1.f180853a) / 1000)));
        return false;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        yr4.u uVar = this.f465108c;
        as4.b bVar = uVar.f465111e;
        if (bVar == null) {
            return false;
        }
        bVar.resend();
        this.f338834b.a(uVar.f465111e, false);
        return true;
    }
}
