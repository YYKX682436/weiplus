package rt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt4.f f399543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rt4.f fVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f399543c = fVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        rt4.f fVar = this.f399543c;
        com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement = (com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement) fVar.f213801c.getParcelable("key_card_element");
        this.f338834b.a(new rt4.a(netScenePayUElementQuery$PayUBankcardElement.f181229e, netScenePayUElementQuery$PayUBankcardElement.f181230f, fVar.f213801c.getString("key_bank_username"), fVar.f213801c.getString("key_card_id"), fVar.f213801c.getString("key_expire_data"), netScenePayUElementQuery$PayUBankcardElement.f181231g, fVar.f213801c.getString("key_cvv"), fVar.f213801c.getString("key_pwd1")), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof rt4.a;
        rt4.f fVar = this.f399543c;
        if (z17 && i17 == 0 && i18 == 0) {
            fVar.f213801c.putInt("key_errcode_payu", 0);
            fVar.f(this.f338833a, fVar.f213801c);
        }
        if (m1Var instanceof rt4.b) {
            if (i17 == 0 && i18 == 0) {
                rt4.b bVar = (rt4.b) m1Var;
                com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement = bVar.f399542e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(netScenePayUElementQuery$PayUBankcardElement.f181228d)) {
                    netScenePayUElementQuery$PayUBankcardElement.f181230f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493596kw2);
                }
                fVar.f213801c.putParcelable("key_card_element", bVar.f399542e);
            } else {
                com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement2 = new com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = "err card element";
                }
                netScenePayUElementQuery$PayUBankcardElement2.f181230f = str;
                fVar.f213801c.putParcelable("key_card_element", netScenePayUElementQuery$PayUBankcardElement2);
            }
        }
        return false;
    }
}
