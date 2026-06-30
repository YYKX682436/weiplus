package com.tencent.mm.plugin.wxcredit.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletWXCreditDetailUI extends com.tencent.mm.wallet_core.ui.WalletPreferenceUI {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f188543g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.h f188544h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f188545i;

    /* renamed from: m, reason: collision with root package name */
    public d05.k f188546m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f188547n = false;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f188548o = new e05.r(this);

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof d05.d) {
                at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                fj6.getClass();
                fj6.f14008q = java.lang.System.currentTimeMillis() / 1000;
                d05.k kVar = ((d05.d) m1Var).f225587d;
                this.f188546m = kVar;
                if (kVar != null && kVar.f225595a == 2) {
                    gm0.j1.i();
                    if (((java.lang.Boolean) gm0.j1.u().c().l(196658, java.lang.Boolean.FALSE)).booleanValue()) {
                        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
                        android.os.Bundle bundle = g17.f213801c;
                        bundle.putDouble("key_total_amount", this.f188546m.f225596b);
                        bundle.putBoolean("key_can_upgrade_amount", this.f188546m.f225600f);
                        g17.E(this, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI.class, bundle, 1);
                        return true;
                    }
                }
                if (X6()) {
                    setContentViewVisibility(0);
                    Y6();
                }
                return true;
            }
            if (m1Var instanceof d05.i) {
                V6().d(new ss4.e0(null, 0), true);
            } else if (m1Var instanceof ss4.e0) {
                finish();
            }
        }
        return false;
    }

    public final boolean X6() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f188545i;
        if (bankcard == null) {
            return false;
        }
        if (bankcard.field_bankcardState == 0) {
            return true;
        }
        int i17 = bankcard.field_wxcreditState;
        d05.k kVar = this.f188546m;
        if (kVar != null) {
            i17 = kVar.f225595a;
        }
        if (i17 == 1) {
            return (com.tencent.mm.sdk.platformtools.t8.H1(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14008q) > 300L ? 1 : (com.tencent.mm.sdk.platformtools.t8.H1(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14008q) == 300L ? 0 : -1)) > 0;
        }
        if (i17 == 3) {
            db5.e1.o(this, com.tencent.mm.R.string.l2d, -1, false, new e05.p(this));
            return false;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return true;
            }
            this.f188544h.f213801c.putBoolean("key_can_unbind", false);
        }
        d05.k kVar2 = this.f188546m;
        if (kVar2 == null) {
            return true;
        }
        this.f188544h.f213801c.putString("key_repayment_url", kVar2.f225601g);
        com.tencent.mm.wallet_core.h hVar = this.f188544h;
        hVar.o(this, 1, hVar.f213801c);
        return false;
    }

    public final void Y6() {
        if (!this.f188547n) {
            initView();
        }
        if (this.f188546m != null) {
            com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailHeaderPreference walletWXCreditDetailHeaderPreference = (com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_header");
            walletWXCreditDetailHeaderPreference.N.setText(com.tencent.mm.wallet_core.ui.r1.m(this.f188546m.f225597c));
            java.lang.String str = this.f188545i.field_bankName;
            walletWXCreditDetailHeaderPreference.M.setText(walletWXCreditDetailHeaderPreference.f197770d.getString(com.tencent.mm.R.string.f493642l35, this.f188546m.f225606l, str));
        }
        if (this.f188546m != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_total_amount").L(getString(com.tencent.mm.R.string.l2f, com.tencent.mm.wallet_core.ui.r1.m(this.f188546m.f225596b)));
            ((com.tencent.mm.ui.base.preference.h0) this.f188543g).m("wallet_wxcredit_change_amount", !this.f188546m.f225600f);
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_bill");
            double d17 = this.f188546m.f225598d;
            if (d17 != 0.0d) {
                h17.H(com.tencent.mm.wallet_core.ui.r1.m(d17));
            }
            com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_repayment");
            com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_repayment_tips");
            double d18 = this.f188546m.f225599e;
            if (d18 > 0.0d) {
                h18.H(com.tencent.mm.wallet_core.ui.r1.m(d18));
                h19.L(getString(com.tencent.mm.R.string.f493640l33, this.f188546m.f225602h));
                ((com.tencent.mm.ui.base.preference.h0) this.f188543g).m("wallet_wxcredit_repayment_tips", false);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f188543g).m("wallet_wxcredit_repayment_tips", true);
            }
        }
        if (this.f188545i != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_bank_name").L(this.f188545i.field_bankName);
        }
        ((com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailFooterPreference) ((com.tencent.mm.ui.base.preference.h0) this.f188543g).h("wallet_wxcredit_footer")).P = this.f188548o;
        ((com.tencent.mm.ui.base.preference.h0) this.f188543g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494977d6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f188547n = true;
        setMMTitle(com.tencent.mm.R.string.l2e);
        this.f188543g = getPreferenceScreen();
        setBackBtn(new e05.q(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new e05.t(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setContentViewVisibility(0);
        Y6();
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        V6().c(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        V6().c(600);
        setContentViewVisibility(4);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        this.f188544h = g17;
        if (this.f188545i == null) {
            this.f188545i = (com.tencent.mm.plugin.wallet_core.model.Bankcard) g17.f213801c.getParcelable("key_bankcard");
        }
        if (X6()) {
            if (this.f214094e == null) {
                if (this.f214095f == null) {
                    this.f214095f = com.tencent.mm.wallet_core.a.g(this);
                }
                this.f214094e = this.f214095f.p(this, this.f214093d);
            }
            if (this.f214094e.c(this.f188545i)) {
                return;
            }
            setContentViewVisibility(0);
            initView();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        V6().i(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        V6().i(600);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        d05.k kVar;
        java.lang.String str = preference.f197780q;
        if ("wallet_wxcredit_change_amount".equals(str)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key_bankcard", this.f188545i);
            com.tencent.mm.wallet_core.a.j(this, c05.c.class, bundle, null);
            return true;
        }
        if ("wallet_wxcredit_bill".equals(str)) {
            if (this.f188546m != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("key_url", this.f188546m.f225605k);
                com.tencent.mm.wallet_core.a.j(this, c05.e.class, bundle2, null);
            }
        } else if ("wallet_wxcredit_card_info".equals(str)) {
            if (this.f188546m != null) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("key_url", this.f188546m.f225603i);
                com.tencent.mm.wallet_core.a.j(this, c05.e.class, bundle3, null);
            }
        } else if ("wallet_wxcredit_right".equals(str)) {
            d05.k kVar2 = this.f188546m;
            if (kVar2 != null) {
                com.tencent.mm.wallet_core.ui.r1.V(this, kVar2.f225604j, false);
            }
        } else if ("wallet_wxcredit_repayment".equals(str)) {
            d05.k kVar3 = this.f188546m;
            if (kVar3 != null) {
                com.tencent.mm.wallet_core.ui.r1.V(this, kVar3.f225601g, false);
            }
        } else if ("wallet_wxcredit_bank_name".equals(str) && (kVar = this.f188546m) != null) {
            com.tencent.mm.wallet_core.ui.r1.a0(this, kVar.f225608n.f225594a);
        }
        return false;
    }
}
