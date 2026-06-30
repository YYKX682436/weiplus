package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class m0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreferenceFragment f197843d;

    public m0(com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment) {
        this.f197843d = mMPreferenceFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment = this.f197843d;
        if (i17 < mMPreferenceFragment.f197765e.getHeaderViewsCount()) {
            return false;
        }
        return mMPreferenceFragment.o0(mMPreferenceFragment.f197764d, (com.tencent.mm.ui.base.preference.Preference) mMPreferenceFragment.f197764d.getItem(i17 - mMPreferenceFragment.f197765e.getHeaderViewsCount()), mMPreferenceFragment.f197765e);
    }
}
