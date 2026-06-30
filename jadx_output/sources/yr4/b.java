package yr4;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yr4.u uVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f465091c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "onNext for select bank card");
        this.f465091c.f213801c.putInt("key_err_code", 0);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f465091c.f213801c.getParcelable("key_bankcard");
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "directToBindNew()");
            yr4.u uVar = this.f465091c;
            uVar.f213801c.putInt("key_pay_flag", 2);
            uVar.o(this.f338833a, 0, uVar.f213801c);
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.a(bankcard.field_bankcardType) != null) {
            g();
        } else {
            this.f338834b.d(new ss4.z("", "", null), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof as4.c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, forward");
            yr4.u uVar = this.f465091c;
            uVar.o(this.f338833a, 0, uVar.f213801c);
            return true;
        }
        if (i17 == 0 && i18 == 0 && (m1Var instanceof ss4.z)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, directToNext");
            g();
        }
        return false;
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "directToNext()");
        boolean z17 = this.f465091c.f213801c.getBoolean("key_balance_change_phone_need_confirm_phone", false);
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) this.f465091c.f213801c.getParcelable("key_authen");
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) this.f465091c.f213801c.getParcelable("key_orders");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f465091c.f213801c.getParcelable("key_bankcard");
        com.tencent.mm.plugin.wallet_core.model.ElementQuery a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.a(bankcard.field_bankcardType);
        this.f465091c.f213801c.putParcelable("elemt_query", a17);
        if (z17) {
            authen.f179545g = bankcard.field_bankcardType;
            authen.f179546h = bankcard.field_bindSerial;
            yr4.u uVar = this.f465091c;
            uVar.o(this.f338833a, 0, uVar.f213801c);
            return;
        }
        authen.f179550o = "";
        authen.f179545g = bankcard.field_bankcardType;
        authen.f179546h = bankcard.field_bindSerial;
        this.f465091c.f213801c.putString("key_mobile", bankcard.field_mobile);
        if (a17 != null && !a17.f179652i && !a17.f179653m) {
            this.f338834b.a(zr4.a.b(authen, orders, this.f465091c.f213801c.getBoolean("key_isbalance", false)), true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "hy: need rewrite cvv or validThru");
        yr4.u uVar2 = this.f465091c;
        uVar2.o(this.f338833a, 0, uVar2.f213801c);
    }
}
