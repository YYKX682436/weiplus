package oa;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f343778a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f343779b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f343780c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f343781d;

    /* renamed from: e, reason: collision with root package name */
    public int f343782e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f343783f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f343784g;

    /* renamed from: h, reason: collision with root package name */
    public oa.k f343785h;

    public boolean a() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f343784g;
        if (tabLayout != null) {
            return tabLayout.getSelectedTabPosition() == this.f343782e;
        }
        throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void b() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f343784g;
        if (tabLayout == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.q(this, true);
    }

    public oa.i c(int i17) {
        this.f343783f = android.view.LayoutInflater.from(this.f343785h.getContext()).inflate(i17, (android.view.ViewGroup) this.f343785h, false);
        f();
        return this;
    }

    public oa.i d(android.view.View view) {
        this.f343783f = view;
        f();
        return this;
    }

    public oa.i e(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(this.f343781d) && !android.text.TextUtils.isEmpty(charSequence)) {
            this.f343785h.setContentDescription(charSequence);
        }
        this.f343780c = charSequence;
        f();
        return this;
    }

    public void f() {
        oa.k kVar = this.f343785h;
        if (kVar != null) {
            kVar.a();
        }
    }
}
