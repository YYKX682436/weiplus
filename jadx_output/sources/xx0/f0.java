package xx0;

/* loaded from: classes5.dex */
public final class f0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f457895d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f457896e;

    /* renamed from: f, reason: collision with root package name */
    public final xx0.i f457897f;

    /* renamed from: g, reason: collision with root package name */
    public final xx0.j f457898g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f457899h;

    public f0(kotlinx.coroutines.y0 scope, java.util.List tabs, xx0.i dataProvider, xx0.j jVar) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(dataProvider, "dataProvider");
        this.f457895d = scope;
        this.f457896e = tabs;
        this.f457897f = dataProvider;
        this.f457898g = jVar;
        this.f457899h = new java.util.LinkedHashMap();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        xx0.d0 d0Var = ((xx0.e0) any).f457888a;
        synchronized (d0Var) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.r2 r2Var = d0Var.f457882m;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                d0Var.f457882m = null;
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        container.removeView(d0Var);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f457896e.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object any) {
        xx0.d0 d0Var;
        kotlin.jvm.internal.o.g(any, "any");
        xx0.e0 e0Var = any instanceof xx0.e0 ? (xx0.e0) any : null;
        if (e0Var == null || (d0Var = e0Var.f457888a) == null) {
            return -2;
        }
        long tabID = d0Var.getTabID();
        java.util.Iterator it = this.f457896e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((vt3.r) it.next()).f440039a == tabID) {
                break;
            }
            i17++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return ((vt3.r) this.f457896e.get(i17)).f440040b;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) this.f457899h).get(java.lang.Long.valueOf(((vt3.r) this.f457896e.get(i17)).f440039a));
        if (e0Var == null) {
            android.content.Context context = container.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e0Var = new xx0.e0(new xx0.d0(context, this.f457895d, (vt3.r) this.f457896e.get(i17), this.f457897f, this.f457898g));
            this.f457899h.put(java.lang.Long.valueOf(((vt3.r) this.f457896e.get(i17)).f440039a), e0Var);
        }
        container.addView(e0Var.f457888a);
        xx0.d0 d0Var = e0Var.f457888a;
        synchronized (d0Var) {
            d0Var.f457879g.setVisibility(0);
            d0Var.f457880h.setVisibility(8);
            d0Var.f457882m = kotlinx.coroutines.l.d(d0Var.f457876d, null, null, new xx0.w(d0Var, null), 3, null);
        }
        return e0Var;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, ((xx0.e0) any).f457888a);
    }
}
