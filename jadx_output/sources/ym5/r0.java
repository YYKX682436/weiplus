package ym5;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f463486b;

    /* renamed from: c, reason: collision with root package name */
    public static long f463487c;

    /* renamed from: d, reason: collision with root package name */
    public static int f463488d;

    /* renamed from: e, reason: collision with root package name */
    public static int f463489e;

    /* renamed from: h, reason: collision with root package name */
    public static final yz5.a f463492h;

    /* renamed from: i, reason: collision with root package name */
    public static final yz5.a f463493i;

    /* renamed from: a, reason: collision with root package name */
    public static final ym5.r0 f463485a = new ym5.r0();

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Rect f463490f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f463491g = true;

    static {
        ym5.a1.f(ym5.k0.f463412d);
        f463492h = ym5.q0.f463477d;
        f463493i = ym5.p0.f463459d;
    }

    public static final void a(ym5.r0 r0Var, android.view.View view, ym5.b1 b1Var) {
        r0Var.getClass();
        ym5.n0 n0Var = b1Var.f463214e;
        float exposePercent = n0Var != null ? n0Var.getExposePercent(view) : 0.0f;
        boolean globalVisibleRect = view.getGlobalVisibleRect(f463490f);
        float width = (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) ? 0.0f : (r4.width() * r4.height()) / (view.getMeasuredWidth() * view.getMeasuredHeight());
        ym5.n0 n0Var2 = b1Var.f463214e;
        boolean additionalCondition = n0Var2 != null ? n0Var2.getAdditionalCondition(view) : true;
        boolean isShown = view.isShown();
        ym5.r0 r0Var2 = f463485a;
        boolean z17 = false;
        if (isShown && view.getAlpha() > 0.0f && view.getParent() != null && globalVisibleRect && view.hasWindowFocus()) {
            if (((exposePercent == 0.0f) || width >= exposePercent) && additionalCondition) {
                ym5.n0 n0Var3 = b1Var.f463214e;
                long exposedId = n0Var3 != null ? n0Var3.getExposedId(view) : -1L;
                r0Var2.c(view, b1Var);
                long j17 = b1Var.f463212c;
                if (j17 != exposedId) {
                    ym5.n0 n0Var4 = b1Var.f463214e;
                    if (n0Var4 != null) {
                        n0Var4.onViewExposed(b1Var.f463210a, j17, exposedId, true);
                    }
                    b1Var.f463212c = exposedId;
                    return;
                }
                return;
            }
        }
        if (b1Var.f463212c != -1) {
            r0Var2.c(view, b1Var);
            ym5.n0 n0Var5 = b1Var.f463214e;
            if (n0Var5 != null) {
                n0Var5.onViewExposed(b1Var.f463210a, b1Var.f463212c, -1L, false);
            }
            b1Var.f463212c = -1L;
        }
        if (b1Var.f463218i) {
            return;
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isDestroyed()) {
            z17 = true;
        }
        if (z17) {
            if (b1Var.f463217h == 0) {
                b1Var.f463217h = java.lang.System.currentTimeMillis();
            } else if (java.lang.System.currentTimeMillis() - b1Var.f463217h > 5000) {
                b1Var.f463218i = true;
                com.tencent.mars.xlog.Log.w("ExposeElves", "[checkLeak] leak view=" + view);
            }
        }
    }

    public static final void b(ym5.r0 r0Var, java.lang.String str) {
        r0Var.getClass();
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        kotlin.jvm.internal.o.f(mainLooper, "getMainLooper(...)");
        if (!(ym5.a1.e(mainLooper) instanceof ym5.l0)) {
            android.os.Looper mainLooper2 = android.os.Looper.getMainLooper();
            kotlin.jvm.internal.o.f(mainLooper2, "getMainLooper(...)");
            android.os.Looper.getMainLooper().setMessageLogging(new ym5.l0(ym5.a1.e(mainLooper2)));
        }
        com.tencent.mars.xlog.Log.i("ExposeElves", "[checkSetLogging] source=" + str);
    }

    public final void c(android.view.View parent, ym5.b1 b1Var) {
        ym5.o0 o0Var = b1Var.f463215f;
        if (o0Var == null) {
            return;
        }
        ym5.u0 u0Var = (ym5.u0) o0Var;
        if ((u0Var.f463544c && u0Var.f463545d.f310116d == 2) || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        long j17 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            kotlin.jvm.internal.o.d(childAt);
            androidx.recyclerview.widget.RecyclerView recyclerView = u0Var.f463543b;
            androidx.recyclerview.widget.k3 m07 = recyclerView.m0(childAt);
            ym5.m0 m0Var = u0Var.f463542a;
            long c17 = m0Var.c(m07);
            float b17 = m0Var.b(childAt);
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(f463490f);
            float width = (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) ? 0.0f : (r4.width() * r4.height()) / (childAt.getMeasuredWidth() * childAt.getMeasuredHeight());
            if (childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.hasWindowFocus() && globalVisibleRect) {
                if (((b17 == 0.0f) || width >= b17) && m0Var.a(recyclerView.m0(childAt))) {
                    linkedList.add(childAt);
                    j17 += c17;
                }
            }
        }
        if (b1Var.f463216g == j17) {
            return;
        }
        b1Var.f463216g = j17;
        ym5.o0 o0Var2 = b1Var.f463215f;
        if (o0Var2 == null) {
            return;
        }
        ym5.u0 u0Var2 = (ym5.u0) o0Var2;
        kotlin.jvm.internal.o.g(parent, "parent");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = u0Var2.f463543b;
            if (!hasNext) {
                u0Var2.f463542a.e(recyclerView2, linkedList2);
                return;
            } else {
                androidx.recyclerview.widget.k3 m08 = recyclerView2.m0((android.view.View) it.next());
                if (m08 != null) {
                    linkedList2.add(m08);
                }
            }
        }
    }
}
