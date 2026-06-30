package uj3;

/* loaded from: classes14.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428223a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f428224b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f428225c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f428226d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager f428227e;

    /* renamed from: f, reason: collision with root package name */
    public xj3.e f428228f;

    /* renamed from: g, reason: collision with root package name */
    public xj3.b f428229g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f428230h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f428231i;

    /* renamed from: j, reason: collision with root package name */
    public uj3.y0 f428232j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.FrameLayout f428233k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f428234l;

    /* renamed from: m, reason: collision with root package name */
    public int f428235m;

    /* renamed from: n, reason: collision with root package name */
    public int f428236n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f428237o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f428238p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f428239q;

    /* renamed from: r, reason: collision with root package name */
    public int f428240r;

    /* renamed from: s, reason: collision with root package name */
    public int f428241s;

    public b1(android.content.Context context, uj3.b statusManager) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428223a = context;
        this.f428224b = statusManager;
        this.f428225c = new java.util.concurrent.CopyOnWriteArrayList();
        this.f428235m = -1;
        this.f428236n = -1;
        this.f428241s = 3;
    }

    public final void a() {
        android.widget.FrameLayout frameLayout = this.f428233k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            uj3.y0 y0Var = this.f428232j;
            if (y0Var != null) {
                y0Var.c(this.f428223a, frameLayout);
            }
        }
        uj3.b bVar = this.f428224b;
        if (bVar.e() == 90 || bVar.e() == 270) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f428230h;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(4);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f428230h;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(4);
        }
        android.view.View view = this.f428234l;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("thumb_current_page", this.f428240r);
        this.f428224b.f(uj3.a.f428204r, bundle);
    }

    public final void c() {
        android.widget.FrameLayout frameLayout = this.f428233k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            uj3.y0 y0Var = this.f428232j;
            if (y0Var != null) {
                y0Var.c(this.f428223a, frameLayout);
            }
        }
        uj3.y0 y0Var2 = this.f428232j;
        if (y0Var2 != null) {
            y0Var2.d();
        }
        android.widget.FrameLayout frameLayout2 = this.f428233k;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout3 = this.f428231i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f428230h;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        android.view.View view = this.f428234l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d(this.f428235m);
    }

    public final void d(int i17) {
        if (this.f428230h == null || i17 < 0 || this.f428236n < 0) {
            return;
        }
        uj3.y0 y0Var = this.f428232j;
        if (y0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i17 + 1);
            sb6.append('/');
            sb6.append(this.f428236n);
            y0Var.e(sb6.toString());
        }
        xj3.b bVar = this.f428229g;
        if (bVar != null) {
            bVar.f454866i = i17;
            bVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager screenThumbLayoutManager = this.f428227e;
        if (screenThumbLayoutManager != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f428230h;
            kotlin.jvm.internal.o.d(recyclerView);
            screenThumbLayoutManager.smoothScrollToPosition(recyclerView, new androidx.recyclerview.widget.h3(), i17);
        }
    }
}
