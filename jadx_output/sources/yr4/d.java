package yr4;

/* loaded from: classes9.dex */
public class d extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465092c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "start do authen");
        r45.jd jdVar = (r45.jd) objArr[0];
        yr4.u uVar = this.f465092c;
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) uVar.f213801c.getParcelable("key_authen");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
        bankcard.field_bindSerial = jdVar.f377713g;
        java.lang.String str = jdVar.f377711e;
        bankcard.field_mobile = str;
        bankcard.field_desc = jdVar.f377714h;
        bankcard.field_bankcardType = authen.f179545g;
        uVar.f213801c.putString("key_mobile", str);
        uVar.f213801c.putParcelable("key_bankcard", bankcard);
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) uVar.f213801c.getParcelable("key_orders");
        authen.I = jdVar.f377710d;
        authen.f179541J = jdVar.f377713g;
        authen.K = jdVar.f377712f;
        authen.L = "1";
        as4.b a17 = zr4.a.a(authen, orders, false);
        if (a17 != null) {
            this.f338834b.d(a17, true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof as4.b)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "finish auth");
        as4.b bVar = (as4.b) m1Var;
        com.tencent.mm.plugin.wallet_core.model.Authen authen = bVar.B;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = bVar.A;
        yr4.u uVar = this.f465092c;
        uVar.f213801c.putParcelable("key_authen", authen);
        uVar.f213801c.putParcelable("key_orders", orders);
        uVar.f213801c.putString("kreq_token", bVar.C);
        uVar.f213801c.putBoolean("key_is_return_from_switch_phone", true);
        uVar.f213801c.putInt("key_err_code", 0);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) uVar.f213801c.getParcelable("key_bankcard");
        bankcard.field_bankcardType = authen.f179545g;
        bankcard.field_bindSerial = authen.f179546h;
        uVar.m(this.f338833a);
        return true;
    }
}
