package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletBalancePrivacyUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178823d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f178824e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference f178825f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference f178826g;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494968cx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.d(this));
        if (getListView() != null) {
            getListView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f178823d = preferenceScreen;
        if (preferenceScreen != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        }
        this.f178825f = (com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178823d).h("wallet_banlance_privacy_cb");
        this.f178824e = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new gs4.l());
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference walletBalancePrivacyMMHeaderPreference = this.f178826g;
        if (walletBalancePrivacyMMHeaderPreference != null) {
            java.util.HashMap hashMap = (java.util.HashMap) walletBalancePrivacyMMHeaderPreference.M;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).wi((java.lang.String) entry.getKey(), (k70.f0) entry.getValue());
            }
            hashMap.clear();
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2635, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2554, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (!com.tencent.mm.sdk.platformtools.t8.D0(preference.f197780q, "wallet_banlance_privacy_cb")) {
            return false;
        }
        com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = (com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference) preference;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "set balance privacy: %s", java.lang.Boolean.valueOf(walletBalancePrivacyCheckBoxPreference.N()));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new gs4.n(walletBalancePrivacyCheckBoxPreference.N()));
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2635, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2554, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (m1Var instanceof gs4.l) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "success get balance privacy detail");
                gs4.l lVar = (gs4.l) m1Var;
                if (this.f178823d == null || lVar.H() == null || lVar.H().f387388g == null) {
                    z17 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "refresh() title_icon:%s,title:%s,switch_title:%s,switch_desc:%s,switch_state:%s", lVar.H().f387388g.f380172e, lVar.H().f387388g.f380171d, lVar.H().f387388g.f380173f, lVar.H().f387388g.f380174g, java.lang.Integer.valueOf(lVar.H().f387387f));
                    ((com.tencent.mm.ui.base.preference.h0) this.f178823d).g(com.tencent.mm.R.xml.f494968cx);
                    com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference walletBalancePrivacyMMHeaderPreference = (com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178823d).h("wallet_balance_privacy_header");
                    this.f178826g = walletBalancePrivacyMMHeaderPreference;
                    java.lang.String str2 = lVar.H().f387388g.f380172e;
                    walletBalancePrivacyMMHeaderPreference.getClass();
                    this.f178826g.L = lVar.H().f387388g.f380171d;
                    com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = (com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178823d).h("wallet_banlance_privacy_cb");
                    this.f178825f = walletBalancePrivacyCheckBoxPreference;
                    walletBalancePrivacyCheckBoxPreference.f197785v = false;
                    walletBalancePrivacyCheckBoxPreference.L(lVar.H().f387388g.f380173f);
                    this.f178825f.H(lVar.H().f387388g.f380174g);
                    com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference2 = this.f178825f;
                    int i19 = lVar.H().f387387f;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    walletBalancePrivacyCheckBoxPreference2.X = i19 == 1;
                    ((com.tencent.mm.ui.base.preference.h0) this.f178823d).notifyDataSetChanged();
                    z17 = true;
                }
                android.app.Dialog dialog = this.f178824e;
                if (dialog != null && dialog.isShowing()) {
                    this.f178824e.dismiss();
                }
                if (!z17) {
                    db5.e1.G(this, getString(com.tencent.mm.R.string.kyr), "", false, new com.tencent.mm.plugin.wallet.pwd.ui.e(this));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "fail get balance privacy detail");
                android.app.Dialog dialog2 = this.f178824e;
                if (dialog2 != null && dialog2.isShowing()) {
                    this.f178824e.dismiss();
                }
                db5.e1.G(this, getString(com.tencent.mm.R.string.kyr), "", false, new com.tencent.mm.plugin.wallet.pwd.ui.f(this));
            }
        }
        if (m1Var instanceof gs4.n) {
            if (i17 != 0 || i18 != 0) {
                db5.t7.makeText(this, getString(com.tencent.mm.R.string.kyn), 1).show();
                com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference3 = this.f178825f;
                if (walletBalancePrivacyCheckBoxPreference3 == null) {
                    walletBalancePrivacyCheckBoxPreference3.S(!walletBalancePrivacyCheckBoxPreference3.N());
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.f36 f36Var = ((gs4.n) m1Var).f275120d;
                if (f36Var == null) {
                    f36Var = new r45.f36();
                }
                objArr[0] = java.lang.Integer.valueOf(f36Var.f373995d);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "fail set balance privacy %s", objArr);
                return;
            }
            gs4.n nVar = (gs4.n) m1Var;
            r45.g36 g36Var = nVar.f275121e;
            if (g36Var == null) {
                g36Var = new r45.g36();
            }
            int i27 = g36Var.f374861f;
            if (this.f178825f == null) {
                this.f178825f = (com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178823d).h("wallet_banlance_privacy_cb");
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference4 = this.f178825f;
            objArr2[0] = walletBalancePrivacyCheckBoxPreference4 != null ? java.lang.Boolean.valueOf(walletBalancePrivacyCheckBoxPreference4.N()) : "null";
            objArr2[1] = java.lang.Integer.valueOf(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalancePrivacyUI", "success set balance privacy detail:%s switchState:%s", objArr2);
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            r45.g36 g36Var2 = nVar.f275121e;
            if (g36Var2 == null) {
                g36Var2 = new r45.g36();
            }
            y07.field_wallet_entrance_balance_switch_state = g36Var2.f374861f;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().insert(y07);
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            fj6.getClass();
            fj6.f14000i = new at4.u1(y07.field_switchConfig, y07.field_wallet_entrance_balance_switch_state);
            com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference5 = this.f178825f;
            if (walletBalancePrivacyCheckBoxPreference5 != null) {
                walletBalancePrivacyCheckBoxPreference5.S(i27 == 1);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.l.class);
    }
}
