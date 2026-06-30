package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitSelectArriveTimeUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f156533d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f156534e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f156535f;

    /* renamed from: g, reason: collision with root package name */
    public int f156536g;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.f488186jw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f156533d = getPreferenceScreen();
        java.util.List list = this.f156534e;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f156535f = new java.util.ArrayList();
        for (int i17 = 0; i17 < this.f156534e.size(); i17++) {
            com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = (com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel) this.f156534e.get(i17);
            int i18 = enterTimeParcel.f156465d;
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            preference.G = com.tencent.mm.R.layout.f488185jv;
            preference.f197785v = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i19 = enterTimeParcel.f156465d;
            sb6.append(i19);
            preference.C(sb6.toString());
            preference.L(enterTimeParcel.f156466e);
            if (i19 == this.f156536g) {
                preference.H = com.tencent.mm.R.layout.c0s;
            } else {
                preference.H = com.tencent.mm.R.layout.c0t;
            }
            if (enterTimeParcel.f156468g == 0) {
                java.lang.String str = enterTimeParcel.f156467f;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    preference.H(str);
                }
                preference.w(false);
            }
            preference.i().putParcelable("arrive_time", enterTimeParcel);
            ((com.tencent.mm.ui.base.preference.h0) this.f156533d).d(preference, -1);
            this.f156535f.add(preference);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.f478706en)));
        android.view.View j17 = getSupportActionBar().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            }
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478706en));
        int i17 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI.f156497d;
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getContentView().setFitsSystemWindows(true);
        setMMTitle(com.tencent.mm.R.string.aer);
        this.f156534e = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
        this.f156536g = getIntent().getIntExtra("key_select_arrive_time", -1);
        initView();
        findViewById(android.R.id.list).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478706en));
        setBackBtn(new qw3.f1(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.util.Iterator it = ((java.util.ArrayList) this.f156535f).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) it.next();
            if (preference2 == preference) {
                preference2.H = com.tencent.mm.R.layout.c0s;
            } else {
                preference2.H = com.tencent.mm.R.layout.c0t;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f156533d).notifyDataSetChanged();
        com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = (com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel) preference.i().getParcelable("arrive_time");
        if (enterTimeParcel == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_time_scene", enterTimeParcel.f156465d);
        setResult(-1, intent);
        finish();
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(qw3.i1.class);
    }
}
