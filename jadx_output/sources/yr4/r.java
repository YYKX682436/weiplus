package yr4;

/* loaded from: classes9.dex */
public class r extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465109c = uVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getString(com.tencent.mm.R.string.kzs);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.modelbase.m1 m1Var;
        java.lang.String str;
        at4.z0 z0Var = (at4.z0) objArr[0];
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) this.f465109c.f213801c.getParcelable("key_orders");
        if (z0Var == null || orders == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiManager", "empty verify or orders");
            m1Var = null;
        } else {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = z0Var.f14035n;
            if (payInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
                str = payInfo.f192114m;
            } else {
                str = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
                str = orders.f179675e;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "empty reqKey!");
                m1Var = new es4.j(z0Var, orders);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "verifyreg reqKey: %s", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "verifyreg go new split cgi");
                m1Var = str.startsWith("sns_aa_") ? new es4.a(z0Var, orders) : str.startsWith("sns_tf_") ? new es4.h(z0Var, orders) : str.startsWith("sns_ff_") ? new es4.c(z0Var, orders) : str.startsWith("ts_") ? new es4.d(z0Var, orders) : str.startsWith("sns_") ? new es4.f(z0Var, orders) : str.startsWith("up_") ? new es4.i(z0Var, orders) : str.startsWith("seb_ff_") ? new es4.e(z0Var, orders) : str.startsWith("tax_") ? new es4.g(z0Var, orders) : str.startsWith("dc_") ? new es4.b(z0Var, orders) : new es4.j(z0Var, orders);
            }
        }
        if (m1Var != null) {
            this.f338834b.d(m1Var, true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof es4.j) || i17 != 0 || i18 != 0) {
            return false;
        }
        es4.j jVar = (es4.j) m1Var;
        boolean z17 = jVar.isPaySuccess;
        yr4.u uVar = this.f465109c;
        if (z17) {
            uVar.f213801c.putParcelable("key_orders", jVar.f256425x);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = jVar.f214061s;
        if (realnameGuideHelper != null) {
            uVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
        }
        uVar.o(this.f338833a, 0, uVar.f213801c);
        return true;
    }
}
