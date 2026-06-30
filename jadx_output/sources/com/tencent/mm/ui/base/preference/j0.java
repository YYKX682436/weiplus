package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class j0 implements com.tencent.mm.ui.base.preference.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.DialogPreference f197833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f197834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.l0 f197835c;

    public j0(com.tencent.mm.ui.base.preference.l0 l0Var, com.tencent.mm.ui.base.preference.DialogPreference dialogPreference, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f197835c = l0Var;
        this.f197833a = dialogPreference;
        this.f197834b = preference;
    }

    @Override // com.tencent.mm.ui.base.preference.k
    public void a(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.base.preference.l0 l0Var = this.f197835c;
            com.tencent.mm.ui.base.preference.MMPreferenceFragment mMPreferenceFragment = l0Var.f197840d;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.base.preference.MMPreferenceFragment.f197763i;
            mMPreferenceFragment.getClass();
            com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = this.f197833a;
            if (dialogPreference.f197785v) {
                l0Var.f197840d.f197766f.edit().putString(this.f197834b.f197780q, dialogPreference.L.f197829h).commit();
            }
            l0Var.f197840d.f197764d.notifyDataSetChanged();
        }
    }
}
