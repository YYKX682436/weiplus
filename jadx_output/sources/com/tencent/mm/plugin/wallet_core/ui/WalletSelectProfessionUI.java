package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class WalletSelectProfessionUI extends com.tencent.mm.ui.base.preference.MMPreference {
    private static final java.lang.String TAG = "MicroMsg.WalletSelectProfessionUI";
    protected com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] mProfessions = null;
    private com.tencent.mm.ui.base.preference.r screen;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kzi);
        this.screen = getPreferenceScreen();
        com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
        preferenceTitleCategory.L(getString(com.tencent.mm.R.string.kzh));
        preferenceTitleCategory.C("title_category");
        ((com.tencent.mm.ui.base.preference.h0) this.screen).d(preferenceTitleCategory, -1);
        android.os.Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("key_profession_list");
        if (parcelableArrayExtra != null && parcelableArrayExtra.length > 0) {
            this.mProfessions = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[parcelableArrayExtra.length];
            int i17 = 0;
            while (true) {
                com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] professionArr = this.mProfessions;
                if (i17 >= professionArr.length) {
                    break;
                }
                professionArr[i17] = (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) parcelableArrayExtra[i17];
                i17++;
            }
        }
        com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] professionArr2 = this.mProfessions;
        if (professionArr2 != null) {
            int i18 = 0;
            for (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession : professionArr2) {
                if (profession != null) {
                    java.lang.String str = profession.f179421d;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(getContext());
                        preference.L(str);
                        preference.C("index_" + i18);
                        ((com.tencent.mm.ui.base.preference.h0) this.screen).d(preference, -1);
                    }
                }
                i18++;
            }
        }
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.u8(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.startsWith("index_")) {
            java.lang.String[] split = preference.f197780q.split("_");
            if (split.length == 2) {
                com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = this.mProfessions[com.tencent.mm.sdk.platformtools.t8.P(split[1], 0)];
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_select_profession", profession);
                setResult(-1, intent);
            } else {
                com.tencent.mars.xlog.Log.w(TAG, "error key: %s, %s", preference.f197780q, preference.o());
                setResult(0);
            }
            finish();
        }
        return true;
    }
}
