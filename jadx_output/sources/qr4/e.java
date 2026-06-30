package qr4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366129c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (z0Var != null && (payInfo = z0Var.f14035n) != null) {
            payInfo.f192109e = 21;
        }
        qr4.h hVar = this.f366129c;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders");
        int i17 = hVar.f213801c.getInt("key_pay_flag", 0);
        if (i17 == 1) {
            z0Var.f14022a = "1";
        } else if (i17 != 2) {
            if (i17 != 3) {
                return false;
            }
            if (hVar.r()) {
                z0Var.f14022a = "6";
            } else {
                z0Var.f14022a = "3";
            }
        } else if (hVar.r()) {
            z0Var.f14022a = "5";
        } else {
            z0Var.f14022a = "2";
        }
        this.f338834b.d(new ds4.g(z0Var, orders), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ds4.g;
        qr4.h hVar = this.f366129c;
        if (z17) {
            ds4.g gVar = (ds4.g) m1Var;
            if (gVar.isPaySuccess) {
                hVar.f213801c.putParcelable("key_orders", gVar.f242926x);
            }
            com.tencent.mm.wallet_core.a.d(this.f338833a, hVar.f213801c);
            return true;
        }
        if (!(m1Var instanceof as4.b)) {
            return false;
        }
        as4.b bVar = (as4.b) m1Var;
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = bVar.f214061s;
        if (realnameGuideHelper != null) {
            hVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
        }
        hVar.f213801c.putString("kreq_token", bVar.C);
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        qr4.h hVar = this.f366129c;
        this.f338834b.d(new as4.b((com.tencent.mm.plugin.wallet_core.model.Authen) hVar.f213801c.getParcelable("key_authen"), (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders"), false), true);
        return true;
    }
}
