package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class ca implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f180179d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180180e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.ba f180181f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.aa f180182g;

    public void a(android.content.Intent intent) {
        ss4.u uVar = new ss4.u();
        gm0.j1.i();
        gm0.j1.n().f273288b.g(uVar);
        com.tencent.mm.plugin.wallet_core.ui.aa aaVar = this.f180182g;
        if (aaVar != null) {
            aaVar.agree(intent);
        }
    }

    public void b() {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2541, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2791, this);
    }

    public void c() {
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2541, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2791, this);
    }

    public void d(com.tencent.mm.plugin.wallet_core.ui.aa aaVar, boolean z17) {
        this.f180182g = aaVar;
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        if (!this.f180180e && booleanValue) {
            aaVar.nothing();
            return;
        }
        boolean z18 = this.f180179d;
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPayAgreementsHelper", "showProtoCol isShow %s", java.lang.Boolean.valueOf(z18));
            aaVar.nothing();
        } else {
            if (!z17) {
                aaVar.nothing();
                return;
            }
            this.f180179d = true;
            ss4.k kVar = new ss4.k();
            gm0.j1.i();
            gm0.j1.n().f273288b.g(kVar);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.k)) {
            if ((m1Var instanceof ss4.u) && i17 == 0 && i18 == 0) {
                if (!this.f180180e) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPayAgreementsHelper", "agree Ok!");
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            ss4.k kVar = (ss4.k) m1Var;
            at4.d2.a();
            java.lang.String str2 = kVar.f412073f;
            if (this.f180180e) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("agreement_content", kVar.f412073f);
                j45.l.n(this.f180181f.getContext(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent, this.f180181f.getShowAgreenRequestCode());
            } else if (at4.d2.a() && kVar.f412074g) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("agreement_content", kVar.f412073f);
                j45.l.n(this.f180181f.getContext(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent2, this.f180181f.getShowAgreenRequestCode());
            } else {
                com.tencent.mm.plugin.wallet_core.ui.aa aaVar = this.f180182g;
                if (aaVar != null) {
                    aaVar.nothing();
                }
            }
        }
    }
}
