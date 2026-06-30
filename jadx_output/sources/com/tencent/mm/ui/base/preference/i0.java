package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class i0 implements com.tencent.mm.ui.base.preference.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreferenceFragment f197831a;

    public i0(com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment) {
        this.f197831a = mMPreferenceFragment;
    }

    @Override // com.tencent.mm.ui.base.preference.q0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference, java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment = this.f197831a;
        if (!mMPreferenceFragment.f197767g && preference.r() && preference.f197783t) {
            mMPreferenceFragment.f197767g = true;
            if (preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                checkBoxPreference.O(checkBoxPreference.N());
                if (checkBoxPreference.f197785v) {
                    mMPreferenceFragment.f197766f.edit().putBoolean(preference.f197780q, checkBoxPreference.N()).commit();
                }
                mMPreferenceFragment.getClass();
                z17 = true;
            } else {
                z17 = false;
            }
            if (preference.f197780q != null) {
                mMPreferenceFragment.n0(mMPreferenceFragment.f197764d, preference, com.tencent.mm.ui.base.preference.n0.OnChange);
            }
            if (z17) {
                mMPreferenceFragment.f197764d.notifyDataSetChanged();
            }
            mMPreferenceFragment.f197767g = false;
            if (z17) {
                return true;
            }
        }
        return false;
    }
}
