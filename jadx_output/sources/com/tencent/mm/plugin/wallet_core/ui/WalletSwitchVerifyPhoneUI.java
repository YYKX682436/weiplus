package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletSwitchVerifyPhoneUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f180102g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView f180103d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f180104e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180105f = false;

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) getInput().getParcelable("key_authen");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        if (authen == null || bankcard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletSwitchVerifyPhoneUI", "authen or bankcard is null");
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.ElementQuery a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.a(bankcard.field_bankcardType);
        getInput().putParcelable("elemt_query", a17);
        authen.f179545g = bankcard.field_bankcardType;
        authen.f179546h = bankcard.field_bindSerial;
        bankcard.field_bankPhone = a17.f179662v;
        getInput().putBoolean("key_balance_change_phone_need_confirm_phone", true);
        getInput().putBoolean("key_is_changing_balance_phone_num", true);
        getInput().putInt("key_err_code", 418);
        com.tencent.mm.wallet_core.a.d(this, getInput());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8h;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView switchPhoneItemGroupView = (com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView) findViewById(com.tencent.mm.R.id.kub);
        this.f180103d = switchPhoneItemGroupView;
        switchPhoneItemGroupView.setOnItemSelectListener(new com.tencent.mm.plugin.wallet_core.ui.z8(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        super.onCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.f493621l03));
        initView();
        boolean z17 = getInput().getBoolean("key_block_bind_new_card", false);
        this.f180105f = z17;
        if (!z17) {
            com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView switchPhoneItemView = new com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView(getContext(), 0);
            switchPhoneItemView.setTag(-1);
            switchPhoneItemView.a(getString(com.tencent.mm.R.string.kzz), null);
            this.f180103d.a(switchPhoneItemView, -1);
        }
        if (getProcess() != null && getProcess().e().equals("PayProcess") && getInput().getInt("key_can_verify_tail", 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "show verify id card item");
            java.lang.String string = getString(com.tencent.mm.R.string.kmg);
            com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView switchPhoneItemView2 = new com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView(getContext(), com.tencent.mm.R.layout.d8f);
            switchPhoneItemView2.setTag(-2);
            switchPhoneItemView2.a(string, null);
            this.f180103d.a(switchPhoneItemView2, -1);
        }
        addSceneEndListener(1667);
        addSceneEndListener(461);
        addSceneEndListener(hc1.i.CTRL_INDEX);
        doSceneProgress(new ss4.h(getPayReqKey()));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1667);
        removeSceneEndListener(461);
        removeSceneEndListener(hc1.i.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.text.SpannableString spannableString;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.h) {
                ss4.h hVar = (ss4.h) m1Var;
                java.util.LinkedList linkedList = hVar.f412063f.f379271f;
                this.f180104e = linkedList;
                if (linkedList != null) {
                    java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.wallet_core.ui.a9(this));
                }
                r45.t90 t90Var = hVar.f412063f.f379272g;
                if (t90Var != null) {
                    getInput().putString("key_true_name", t90Var.f386211d);
                    getInput().putString("key_cre_name", t90Var.f386213f);
                    getInput().putString("key_cre_type", t90Var.f386212e);
                }
                java.util.List list = this.f180104e;
                if (list == null || list.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
                    return true;
                }
                int size = this.f180104e.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return true;
                    }
                    r45.jd jdVar = (r45.jd) this.f180104e.get(size);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(jdVar.f377710d) || !jdVar.f377710d.equals("cft")) {
                        com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView switchPhoneItemView = new com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView(getContext(), 0);
                        switchPhoneItemView.setTag(java.lang.Integer.valueOf(size));
                        switchPhoneItemView.a(jdVar.f377711e, getString(com.tencent.mm.R.string.f493624l06));
                        this.f180103d.a(switchPhoneItemView, 0);
                    } else {
                        com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView switchPhoneItemView2 = new com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView(getContext(), 0);
                        java.lang.String string = getString(com.tencent.mm.R.string.f493618l00, jdVar.f377714h, (com.tencent.mm.sdk.platformtools.t8.K0(jdVar.f377715i) || !jdVar.f377715i.equals("1")) ? getString(com.tencent.mm.R.string.f493619l01) : getString(com.tencent.mm.R.string.f493620l02), jdVar.f377716m);
                        if (this.f180105f) {
                            spannableString = new android.text.SpannableString(string);
                        } else {
                            java.lang.String string2 = getString(com.tencent.mm.R.string.f493623l05);
                            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
                            java.lang.String str2 = string + "，";
                            b4Var.f180147e = getResources().getColor(com.tencent.mm.R.color.f478724ff);
                            android.text.SpannableString spannableString2 = new android.text.SpannableString(str2 + string2);
                            spannableString2.setSpan(b4Var, str2.length(), str2.length() + string2.length(), 33);
                            b4Var.f180146d = new com.tencent.mm.plugin.wallet_core.ui.b9(this, jdVar);
                            spannableString = spannableString2;
                        }
                        switchPhoneItemView2.setTag(java.lang.Integer.valueOf(size));
                        switchPhoneItemView2.a(jdVar.f377711e, spannableString);
                        this.f180103d.a(switchPhoneItemView2, 0);
                    }
                }
            } else if (m1Var instanceof ss4.z) {
                U6();
            }
        }
        return false;
    }
}
