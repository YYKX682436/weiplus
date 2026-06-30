package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreferenceFragment f197840d;

    public l0(com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment) {
        this.f197840d = mMPreferenceFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment = this.f197840d;
        if (i17 < mMPreferenceFragment.f197765e.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = i17 - mMPreferenceFragment.f197765e.getHeaderViewsCount();
        if (!(mMPreferenceFragment.f197764d.f197809h.size() > headerViewsCount)) {
            com.tencent.mars.xlog.Log.e(com.tencent.mm.ui.base.preference.MMPreference.TAG, "checkSafeList false");
            return;
        }
        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) mMPreferenceFragment.f197764d.getItem(headerViewsCount);
        if (preference.r() && preference.f197783t && !(preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference)) {
            if (preference instanceof com.tencent.mm.ui.base.preference.DialogPreference) {
                com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = (com.tencent.mm.ui.base.preference.DialogPreference) preference;
                dialogPreference.M();
                dialogPreference.N = new com.tencent.mm.ui.base.preference.j0(this, dialogPreference, preference);
            }
            if (preference instanceof com.tencent.mm.ui.base.preference.EditPreference) {
                com.tencent.mm.ui.base.preference.EditPreference editPreference = (com.tencent.mm.ui.base.preference.EditPreference) preference;
                editPreference.M();
                editPreference.M = new com.tencent.mm.ui.base.preference.k0(this, editPreference, preference);
            }
            mMPreferenceFragment.getClass();
            if (mMPreferenceFragment instanceof com.tencent.mm.ui.MoreTabUI) {
                view.setSelected(true);
                com.tencent.mm.ui.base.preference.MMPreferenceFragment.f197763i = new java.lang.ref.WeakReference(view);
            }
            if (preference.f197780q != null) {
                mMPreferenceFragment.n0(mMPreferenceFragment.f197764d, preference, com.tencent.mm.ui.base.preference.n0.OnClick);
            }
        }
    }
}
