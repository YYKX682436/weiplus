package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class x implements com.tencent.mm.ui.base.preference.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreference f197856a;

    public x(com.tencent.mm.ui.base.preference.MMPreference mMPreference) {
        this.f197856a = mMPreference;
    }

    @Override // com.tencent.mm.ui.base.preference.q0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference, java.lang.Object obj) {
        boolean z17;
        boolean z18;
        com.tencent.mm.ui.base.preference.h0 h0Var;
        com.tencent.mm.ui.base.preference.h0 h0Var2;
        android.content.SharedPreferences sharedPreferences;
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = this.f197856a;
        z17 = mMPreference.isRefreshing;
        if (!z17 && preference.r() && preference.f197783t) {
            mMPreference.isRefreshing = true;
            if (preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                checkBoxPreference.O(checkBoxPreference.N());
                if (checkBoxPreference.f197785v) {
                    sharedPreferences = mMPreference.f197762sp;
                    sharedPreferences.edit().putBoolean(preference.f197780q, checkBoxPreference.N()).commit();
                }
                mMPreference.dirty = true;
                z18 = true;
            } else {
                z18 = false;
            }
            h0Var = mMPreference.adapter;
            mMPreference.dispatchClick(h0Var, preference);
            if (z18) {
                h0Var2 = mMPreference.adapter;
                h0Var2.notifyDataSetChanged();
            }
            mMPreference.isRefreshing = false;
            if (z18) {
                return true;
            }
        }
        return false;
    }
}
