package fn2;

/* loaded from: classes10.dex */
public final class t0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f264399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f264400e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f264401f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f264402g;

    public t0(android.content.Context context, java.util.List tabs, fn2.u1 sourceScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f264399d = context;
        this.f264400e = tabs;
        this.f264401f = sourceScene;
        this.f264402g = new android.util.SparseArray();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
        this.f264402g.remove(i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f264400e.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        android.content.Context context = this.f264399d;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f491818mo3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491816mo1);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 2) {
            return "";
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.mnn);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return string3;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fn2.h1 h1Var = new fn2.h1(context, null, 0, this.f264401f, 6, null);
        container.addView(h1Var);
        this.f264402g.put(i17, h1Var);
        return h1Var;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, any);
    }
}
