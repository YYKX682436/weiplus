package rk3;

/* loaded from: classes3.dex */
public final class f extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f396516d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f396517e;

    public f(rk3.i iVar, android.view.View multiTaskView, android.view.View launcherView) {
        kotlin.jvm.internal.o.g(multiTaskView, "multiTaskView");
        kotlin.jvm.internal.o.g(launcherView, "launcherView");
        this.f396516d = multiTaskView;
        this.f396517e = launcherView;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        android.view.View view = i17 == 0 ? this.f396516d : this.f396517e;
        container.removeView(view);
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        return kotlin.jvm.internal.o.b(view, obj);
    }
}
