package gr2;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr2.t0 f274824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, gr2.t0 t0Var) {
        super(0);
        this.f274823d = i17;
        this.f274824e = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oa.i k17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThemeTagChange position: ");
        int i17 = this.f274823d;
        sb6.append(i17);
        sb6.append(" tabLayout: ");
        gr2.t0 t0Var = this.f274824e;
        sb6.append(t0Var.f274830c);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.ThemeTagListWidget", sb6.toString());
        com.google.android.material.tabs.TabLayout tabLayout = t0Var.f274830c;
        if (tabLayout != null && (k17 = tabLayout.k(i17)) != null && !k17.a()) {
            k17.b();
        }
        return jz5.f0.f302826a;
    }
}
