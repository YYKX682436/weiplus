package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public abstract class MMPreferenceFragment extends com.tencent.mm.ui.MMFragment {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.ref.WeakReference f197763i;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.h0 f197764d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f197765e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences f197766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f197767g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f197768h;

    public static void l0() {
        java.lang.ref.WeakReference weakReference = f197763i;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setSelected(false);
            f197763i = null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public android.view.View getLayoutView() {
        return com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(getContext()), com.tencent.mm.R.layout.c07, null, false);
    }

    public abstract int m0();

    public abstract boolean n0(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.n0 n0Var);

    public boolean o0(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        int m07;
        super.onActivityCreated(bundle);
        this.f197768h = false;
        this.f197766f = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f197765e = (android.widget.ListView) findViewById(android.R.id.list);
        com.tencent.mm.ui.base.preference.h0 h0Var = new com.tencent.mm.ui.base.preference.h0(getContext(), this.f197765e, this.f197766f);
        this.f197764d = h0Var;
        h0Var.f197822x = new com.tencent.mm.ui.base.preference.i0(this);
        h0Var.notifyDataSetChanged();
        if (!(!(this instanceof com.tencent.mm.plugin.finder.ui.FinderNewSettingPrivacyPreference)) && !this.f197768h && (m07 = m0()) != -1) {
            this.f197764d.g(m07);
            this.f197768h = true;
        }
        this.f197765e.setAdapter((android.widget.ListAdapter) this.f197764d);
        this.f197765e.setOnItemClickListener(new com.tencent.mm.ui.base.preference.l0(this));
        this.f197765e.setOnItemLongClickListener(new com.tencent.mm.ui.base.preference.m0(this));
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f197764d;
        if (h0Var != null) {
            h0Var.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        l0();
    }
}
