package oj5;

/* loaded from: classes14.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f345906a = jz5.h.b(oj5.s.f345885d);

    public static final androidx.recyclerview.widget.z2 a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        java.lang.reflect.Field declaredField = androidx.recyclerview.widget.RecyclerView.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(recyclerView);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Recycler");
        return (androidx.recyclerview.widget.z2) obj;
    }

    public static final java.util.ArrayList b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        n3.t1 t1Var = new n3.t1(recyclerView);
        while (t1Var.hasNext()) {
            androidx.recyclerview.widget.k3 m07 = recyclerView.m0((android.view.View) t1Var.next());
            if (m07 != null) {
                arrayList.add(m07);
            }
        }
        return arrayList;
    }

    public static final void c(androidx.recyclerview.widget.RecyclerView recyclerView, oj5.b observer) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(observer, "observer");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null && !kotlin.jvm.internal.o.b(observer.f345835a, adapter)) {
            observer.a(adapter);
            observer.f345835a = adapter;
        }
        androidx.recyclerview.widget.z2 a17 = a(recyclerView);
        oj5.a aVar = new oj5.a(observer, recyclerView);
        java.lang.reflect.Field declaredField = androidx.recyclerview.widget.z2.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(a17, aVar);
    }

    public static oj5.r d(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, boolean z17, oj5.b0 b0Var, com.tencent.mm.sdk.platformtools.n3 n3Var, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        if ((i19 & 8) != 0) {
            b0Var = new oj5.b0();
        }
        oj5.b0 viewPool = b0Var;
        if ((i19 & 16) != 0) {
            n3Var = new com.tencent.mm.sdk.platformtools.n3("AsyncBindViewHandler");
            n3Var.setLogging(false);
        }
        com.tencent.mm.sdk.platformtools.n3 asyncHandler = n3Var;
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(viewPool, "viewPool");
        kotlin.jvm.internal.o.g(asyncHandler, "asyncHandler");
        com.tencent.mars.xlog.Log.i("DynamicViewCacheEx", "supportAsyncBindView");
        oj5.r rVar = new oj5.r(recyclerView, i17, i18, z18, viewPool, asyncHandler);
        recyclerView.setViewCacheExtension(rVar);
        return rVar;
    }

    public static boolean e(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.List viewTypeCount, oj5.b0 b0Var, com.tencent.mm.sdk.platformtools.n3 n3Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            b0Var = new oj5.b0();
        }
        oj5.b0 viewPool = b0Var;
        if ((i17 & 4) != 0) {
            n3Var = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) f345906a).getValue();
        }
        com.tencent.mm.sdk.platformtools.n3 asyncHandler = n3Var;
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(viewTypeCount, "viewTypeCount");
        kotlin.jvm.internal.o.g(viewPool, "viewPool");
        kotlin.jvm.internal.o.g(asyncHandler, "asyncHandler");
        recyclerView.setRecycledViewPool(viewPool);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        recyclerView.post(new oj5.u(recyclerView, c0Var, h0Var, asyncHandler));
        c(recyclerView, new oj5.w(h0Var, asyncHandler, viewTypeCount, c0Var, viewPool, recyclerView));
        return true;
    }
}
