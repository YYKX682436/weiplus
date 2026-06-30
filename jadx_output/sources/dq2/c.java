package dq2;

/* loaded from: classes2.dex */
public class c extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f242362i;

    /* renamed from: m, reason: collision with root package name */
    public final int f242363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.FragmentManager fm6, java.util.List fragments, int i17) {
        super(fm6, i17);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f242362i = fragments;
        this.f242363m = i17;
    }

    @Override // androidx.fragment.app.y1
    public long a(int i17) {
        return java.lang.System.identityHashCode(this.f242362i.get(i17));
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f242362i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (androidx.fragment.app.Fragment) this.f242362i.get(i17);
    }

    @Override // androidx.fragment.app.y1, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.lang.Object instantiateItem = super.instantiateItem(container, i17);
        if (this.f242363m == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                java.lang.reflect.Field declaredField = androidx.fragment.app.y1.class.getDeclaredField("f");
                declaredField.setAccessible(true);
                java.lang.reflect.Field declaredField2 = androidx.fragment.app.Fragment.class.getDeclaredField("mState");
                declaredField2.setAccessible(true);
                if (kotlin.jvm.internal.o.b(declaredField2.get(instantiateItem), -1)) {
                    java.lang.Object obj = declaredField.get(this);
                    androidx.fragment.app.i2 i2Var = obj instanceof androidx.fragment.app.i2 ? (androidx.fragment.app.i2) obj : null;
                    if (i2Var != null) {
                        i2Var.m((androidx.fragment.app.Fragment) instantiateItem, androidx.lifecycle.n.INITIALIZED);
                    }
                }
            } catch (java.lang.Throwable th6) {
                pm0.z.b(xy2.b.f458155b, "squareTabInflateError", false, null, null, false, false, new dq2.b(th6), 60, null);
            }
            com.tencent.mars.xlog.Log.i("LiveSquareFragmentPagerAdapter", "instantiateItem fragment cost =  " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ' ');
        }
        return instantiateItem;
    }
}
