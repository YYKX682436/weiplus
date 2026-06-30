package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class BankMobileRemittanceChooseUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f156556i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f156557d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.NormalIconNewTipPreference f156558e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.NormalIconNewTipPreference f156559f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f156560g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156561h;

    public final void V6() {
        db5.e1.y(getContext(), getContext().getString(com.tencent.mm.R.string.l0g), "", getContext().getString(com.tencent.mm.R.string.ke6), new com.tencent.mm.plugin.remittance.mobile.ui.h(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488176jm, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.ada);
        java.lang.String string = getString(com.tencent.mm.R.string.adi);
        com.tencent.mm.wallet_core.ui.r1.w0(textView, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.remittance.mobile.ui.c(this), true), getContext());
        return linearLayout;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494835i;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        setBackBtn(new com.tencent.mm.plugin.remittance.mobile.ui.b(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f156557d = preferenceScreen;
        this.f156558e = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("bank_mobile_remit_choose_bank");
        this.f156559f = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f156557d).h("bank_mobile_remit_choose_mobile");
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = this.f156558e;
        normalIconNewTipPreference.M1 = true;
        normalIconNewTipPreference.O(getString(com.tencent.mm.R.string.adk));
        this.f156558e.Q(0);
        this.f156558e.Y(8);
        this.f156558e.n0(this.f156557d);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f156558e);
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference2 = this.f156559f;
        normalIconNewTipPreference2.M1 = true;
        normalIconNewTipPreference2.O(getString(com.tencent.mm.R.string.adm));
        this.f156559f.Q(0);
        this.f156559f.Y(8);
        this.f156559f.n0(this.f156557d);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f156559f);
        ((com.tencent.mm.ui.base.preference.h0) this.f156557d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f156560g = null;
        gm0.j1.d().q(2952, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onPreferenceTreeClick() key:%s", preference.f197780q);
        if (!com.tencent.mm.sdk.platformtools.t8.D0("bank_mobile_remit_choose_bank", preference.f197780q)) {
            if (!com.tencent.mm.sdk.platformtools.t8.D0("bank_mobile_remit_choose_mobile", preference.f197780q)) {
                return false;
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(22);
            com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "doNetSceneMobileRemitGetHomePage() ");
            if (this.f156560g == null) {
                this.f156560g = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getContext().getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.remittance.mobile.ui.g(this));
            }
            gm0.j1.d().a(2952, this);
            gm0.j1.d().g(new sw3.d(false));
            com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
            wCPayTransferToPhoneActionReportStruct.f62121d = 4;
            wCPayTransferToPhoneActionReportStruct.k();
            return true;
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(21);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_trans_to_bank_card_unrealname_intercept, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "clicfg_android_trans_to_bank_card_unrealname_intercept is open");
            if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "trans to bank card, intercept, jump to real name page");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) getContext();
                mMActivity.getIntent().putExtra("process_id", com.tencent.mm.plugin.wallet_core.id_verify.a.class.hashCode());
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("real_name_verify_mode", 0);
                bundle.putInt("entry_scene", 49);
                bundle.putInt("realname_verify_process_from_scene", 7);
                com.tencent.mm.wallet_core.a.j(mMActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
                return true;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "clicfg_android_trans_to_bank_card_unrealname_intercept is closed");
        }
        com.tencent.mm.wallet_core.b.a().getClass();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_transfer_to_bank_mini_app_switch_android, false)) {
            if (!((h45.q) i95.n0.c(h45.q.class)).tryStartTransferToBankUseCase(null, new com.tencent.mm.plugin.remittance.mobile.ui.f(this))) {
                j45.l.h(getContext(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            }
            return true;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wx0d0c604dfc7193ec";
        b1Var.f317022f = "pages/index/index.html?from=native";
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.pay.c0.CTRL_INDEX;
        b1Var.f317037o = new com.tencent.mm.plugin.remittance.mobile.ui.d(this);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), b1Var);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d70 d70Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        android.app.Dialog dialog = this.f156560g;
        if (dialog != null && dialog.isShowing()) {
            this.f156560g.dismiss();
            this.f156560g = null;
        }
        if (m1Var instanceof sw3.d) {
            gm0.j1.d().q(2952, this);
            if (i17 != 0 && i18 != 0) {
                V6();
                return;
            }
            r45.np6 np6Var = ((sw3.d) m1Var).f413465t;
            if (np6Var == null) {
                np6Var = null;
            }
            android.content.Intent intent = new android.content.Intent();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f156561h)) {
                intent.putExtra("key_content", this.f156561h);
                this.f156561h = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mResponse.is_new_user: %s", java.lang.Boolean.valueOf(np6Var.f381586p));
            if (!np6Var.f381586p || (d70Var = np6Var.f381587q) == null) {
                j45.l.j(getContext(), "remittance", ".mobile.ui.MobileRemitNumberInputUI", intent, null);
                return;
            }
            try {
                intent.putExtra("key_compliance_item ", d70Var.toByteArray());
                j45.l.j(getContext(), "remittance", ".mobile.ui.MobileRemitWelcomeUI", intent, null);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", " mResponse printStackTrace: %s", e17.toString());
                V6();
            }
        }
    }
}
