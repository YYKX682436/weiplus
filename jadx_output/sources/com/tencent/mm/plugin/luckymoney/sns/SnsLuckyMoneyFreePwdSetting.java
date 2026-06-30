package com.tencent.mm.plugin.luckymoney.sns;

/* loaded from: classes9.dex */
public class SnsLuckyMoneyFreePwdSetting extends com.tencent.mm.wallet_core.ui.WalletPreferenceUI {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f145754g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f145755h;

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ac3.a) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "free pwd setting onWalletSceneEnd, errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
            if (i17 != 0 || i18 != 0) {
                X6(119);
                com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
                Z6();
            } else if (((ac3.a) m1Var).f3078d == 1) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
                X6(119);
                Y6(true);
            } else {
                Y6(false);
                X6(118);
                com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
            }
        }
        return false;
    }

    public final void X6(int i17) {
        com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = new com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent();
        am.gw gwVar = snsLuckyMoneyIDKeyReportEvent.f54824g;
        gwVar.f6795a = i17;
        gwVar.getClass();
        gwVar.getClass();
        snsLuckyMoneyIDKeyReportEvent.e();
    }

    public final void Y6(boolean z17) {
        getDefaultSharedPreferences().edit().putBoolean("open_sns_pay_pref", z17).commit();
        this.f145755h.O(z17);
        ((com.tencent.mm.ui.base.preference.h0) this.f145754g).notifyDataSetChanged();
    }

    public final void Z6() {
        boolean z17 = bc3.a.a() == 1;
        this.f145755h.O(z17);
        getDefaultSharedPreferences().edit().putBoolean("open_sns_pay_pref", z17).commit();
        if (android.text.TextUtils.isEmpty(bc3.a.b())) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "SetSnsPayTitle is empty");
            this.f145755h.J(com.tencent.mm.R.string.gl7);
        } else {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "SetSnsPayTitle:" + bc3.a.b());
            this.f145755h.L(bc3.a.b());
        }
        if (android.text.TextUtils.isEmpty(bc3.a.c())) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "getSetSnsPayWording is empty");
            this.f145755h.G(com.tencent.mm.R.string.gl6);
        } else {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "SetSnsPayWording:" + bc3.a.c());
            this.f145755h.H(bc3.a.c());
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f145754g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494959cp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f145754g = getPreferenceScreen();
        setBackBtn(new zb3.c(this));
        setMMTitle(com.tencent.mm.R.string.gl8);
        this.f145755h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f145754g).h("open_sns_pay_pref");
        Z6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        X6(116);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if ("open_sns_pay_pref".equals(preference.f197780q)) {
            if (this.f145755h.N() || bc3.a.a() != 1) {
                X6(120);
                com.tencent.mm.wallet_core.a.j(this, zb3.b.class, null, null);
            } else {
                V6().d(new ac3.a(0, "", ""), true);
                X6(117);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        Z6();
        super.onResume();
    }
}
