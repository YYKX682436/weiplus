package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class WalletBankCardTypeSelectUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f179853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179854e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f179855f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f179856g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f179857h;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494969cy;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179855f = getPreferenceScreen();
        for (int i17 = 0; i17 < this.f179853d.size(); i17++) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference = new com.tencent.mm.ui.base.preference.SelectPreference(getContext());
            selectPreference.C((java.lang.String) this.f179853d.get(i17));
            selectPreference.L((java.lang.CharSequence) this.f179853d.get(i17));
            ((com.tencent.mm.ui.base.preference.h0) this.f179855f).d(selectPreference, -1);
        }
        if (this.f179853d.get(0) != null) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = (com.tencent.mm.ui.base.preference.SelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f179855f).h((java.lang.String) this.f179853d.get(0));
            this.f179857h = selectPreference2;
            selectPreference2.P = true;
            this.f179854e = (java.lang.String) this.f179853d.get(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f179855f).notifyDataSetChanged();
        }
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.w0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.wallet_core.ui.x0(this), null, com.tencent.mm.ui.fb.GREEN);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kld);
        this.f179853d = getIntent().getStringArrayListExtra("bank_type_show_list");
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        for (int i17 = 0; i17 < this.f179853d.size(); i17++) {
            if (str.equals(this.f179853d.get(i17))) {
                com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference = (com.tencent.mm.ui.base.preference.SelectPreference) h0Var.h((java.lang.String) this.f179853d.get(i17));
                this.f179856g = selectPreference;
                selectPreference.P = true;
                this.f179854e = (java.lang.String) this.f179853d.get(i17);
                if (!this.f179857h.f197780q.equals(this.f179856g.f197780q)) {
                    this.f179857h.P = false;
                    this.f179857h = this.f179856g;
                }
                h0Var.notifyDataSetChanged();
            }
        }
        return false;
    }
}
