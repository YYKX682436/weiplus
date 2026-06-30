package s35;

/* loaded from: classes5.dex */
public abstract class b implements s35.a {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f402841f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f402842g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f402843h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f402839d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f402840e = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f402844i = false;

    public b(android.content.Context context) {
        this.f402842g = null;
        this.f402842g = new java.lang.ref.WeakReference(context);
        this.f402843h = new android.widget.LinearLayout(context);
    }

    public abstract void a();

    public abstract int b();

    public int c() {
        return 0;
    }

    public void d() {
        k(8);
    }

    public android.view.View e(android.content.Context context, int i17, android.view.ViewGroup viewGroup) {
        if (i17 <= 0) {
            return null;
        }
        return android.view.View.inflate(context, i17, viewGroup);
    }

    public final void f() {
        android.widget.LinearLayout linearLayout;
        if (this.f402844i) {
            return;
        }
        if (this.f402841f == null && (linearLayout = this.f402843h) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) e(linearLayout.getContext(), b(), linearLayout);
            this.f402841f = viewGroup != null ? viewGroup.getChildAt(0) : null;
        }
        h(this.f402841f);
        this.f402844i = true;
    }

    public final boolean g() {
        android.view.View childAt;
        android.view.View view = this.f402841f;
        return (view == null || (childAt = ((android.view.ViewGroup) view).getChildAt(0)) == null || childAt.getVisibility() != 0) ? false : true;
    }

    public abstract void h(android.view.View view);

    public boolean i() {
        android.view.View view = this.f402841f;
        return view != null && view.getVisibility() == 0;
    }

    public void j() {
    }

    public void k(int i17) {
        android.view.View view = this.f402841f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.f402843h;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
    }
}
