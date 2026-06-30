package tw2;

/* loaded from: classes2.dex */
public final class f extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f422467i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f422468m;

    /* renamed from: n, reason: collision with root package name */
    public final int f422469n;

    public /* synthetic */ f(androidx.fragment.app.FragmentManager fragmentManager, java.util.List list, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(fragmentManager, list, (i18 & 4) != 0 ? 0 : i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f422468m.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (androidx.fragment.app.Fragment) this.f422468m.get(i17);
    }

    @Override // androidx.fragment.app.y1, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.lang.Object instantiateItem = super.instantiateItem(container, i17);
        if (this.f422469n == 1) {
            java.lang.reflect.Field declaredField = androidx.fragment.app.y1.class.getDeclaredField("f");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            androidx.fragment.app.i2 i2Var = obj instanceof androidx.fragment.app.i2 ? (androidx.fragment.app.i2) obj : null;
            if (i2Var != null) {
                i2Var.m((androidx.fragment.app.Fragment) instantiateItem, androidx.lifecycle.n.INITIALIZED);
            }
        }
        return instantiateItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.FragmentManager fm6, java.util.List fragments, int i17) {
        super(fm6, i17);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f422467i = fm6;
        this.f422468m = fragments;
        this.f422469n = i17;
    }
}
