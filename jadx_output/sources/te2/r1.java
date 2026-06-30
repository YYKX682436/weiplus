package te2;

/* loaded from: classes3.dex */
public final class r1 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f418368d;

    public r1(java.util.List tabs) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        this.f418368d = tabs;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f418368d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        java.util.List list = this.f418368d;
        int ordinal = ((te2.u1) list.get(i17)).getType().ordinal();
        if (ordinal == 0) {
            java.lang.String string = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.tencent.mm.R.string.lqp);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (ordinal == 1) {
            java.lang.String string2 = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.tencent.mm.R.string.lqr);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (ordinal != 2) {
            return "";
        }
        java.lang.String string3 = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.tencent.mm.R.string.lqq);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        te2.u1 u1Var = (te2.u1) this.f418368d.get(i17);
        container.addView(u1Var);
        return u1Var;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, any);
    }
}
