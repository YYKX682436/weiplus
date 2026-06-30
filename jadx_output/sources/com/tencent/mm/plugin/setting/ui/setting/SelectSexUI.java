package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SelectSexUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f160170h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160171d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f160172e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f160173f;

    /* renamed from: g, reason: collision with root package name */
    public int f160174g = -1;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494923bp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160171d = preferenceScreen;
        this.f160172e = (com.tencent.mm.ui.base.preference.SelectPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("select_male");
        this.f160173f = (com.tencent.mm.ui.base.preference.SelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160171d).h("select_female");
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        if (j17 == 1) {
            this.f160172e.P = true;
        } else if (j17 == 2) {
            this.f160173f.P = true;
        }
        setMMTitle(com.tencent.mm.R.string.igv);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.b2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.c2(this), null, com.tencent.mm.ui.fb.GREEN);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("select_male")) {
            this.f160174g = 1;
            this.f160172e.P = true;
            this.f160173f.P = false;
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        } else if (str.equals("select_female")) {
            this.f160174g = 2;
            this.f160172e.P = false;
            this.f160173f.P = true;
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        return false;
    }
}
