package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class k0 implements com.tencent.mm.ui.base.preference.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.EditPreference f197836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f197837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.l0 f197838c;

    public k0(com.tencent.mm.ui.base.preference.l0 l0Var, com.tencent.mm.ui.base.preference.EditPreference editPreference, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f197838c = l0Var;
        this.f197836a = editPreference;
        this.f197837b = preference;
    }

    @Override // com.tencent.mm.ui.base.preference.o
    public void a(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.base.preference.l0 l0Var = this.f197838c;
            com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment = l0Var.f197840d;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.base.preference.MMPreferenceFragment.f197763i;
            mMPreferenceFragment.getClass();
            com.tencent.mm.ui.base.preference.EditPreference editPreference = this.f197836a;
            if (editPreference.f197785v) {
                l0Var.f197840d.f197766f.edit().putString(this.f197837b.f197780q, editPreference.P).commit();
            }
            l0Var.f197840d.f197764d.notifyDataSetChanged();
        }
    }
}
