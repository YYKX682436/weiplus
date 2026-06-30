package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference;", "Lcom/tencent/mm/ui/base/preference/MMPreferenceFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderNewSettingPrivacyPreference extends com.tencent.mm.ui.base.preference.MMPreferenceFragment {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.m2 f128643m;

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public int m0() {
        return com.tencent.mm.R.xml.f494880dd;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public boolean n0(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.n0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128643m;
        if (m2Var == null) {
            return true;
        }
        m2Var.e(rVar, preference);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.ui.m2 m2Var;
        super.onActivityCreated(bundle);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBounceEnabled(false);
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            com.tencent.mm.ui.base.preference.h0 h0Var = this.f197764d;
            kotlin.jvm.internal.o.f(h0Var, "getPreferenceScreen(...)");
            m2Var = new com.tencent.mm.plugin.finder.ui.m2(activity, h0Var);
        } else {
            m2Var = null;
        }
        this.f128643m = m2Var;
        if (m2Var != null) {
            m2Var.c();
        }
        setMMTitle(com.tencent.mm.R.string.mat);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.pb(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imk);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128643m;
        if (m2Var != null) {
            m2Var.d(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128643m;
        if (m2Var == null || (fVar = m2Var.f129498e) == null) {
            return;
        }
        fVar.b();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128643m;
        if (m2Var != null) {
            m2Var.h();
        }
    }
}
