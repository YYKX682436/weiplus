package ym5;

/* loaded from: classes15.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f463189a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f463190b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f463191c = new java.util.HashMap();

    public static final void a(int i17, ym5.b1 b1Var) {
        boolean z17 = b1Var.f463211b;
        java.util.HashMap hashMap = f463191c;
        java.util.HashMap hashMap2 = f463190b;
        java.util.HashMap hashMap3 = z17 ? hashMap : hashMap2;
        if (hashMap3.containsKey(java.lang.Integer.valueOf(i17))) {
            return;
        }
        hashMap3.put(java.lang.Integer.valueOf(i17), b1Var);
        ym5.s0 s0Var = new ym5.s0(b1Var);
        android.view.View view = b1Var.f463210a;
        if (view.getTag(com.tencent.mm.R.id.dkk) != null) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.dkk);
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type android.view.View.OnAttachStateChangeListener");
            view.removeOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) tag);
        }
        view.setTag(com.tencent.mm.R.id.dkk, s0Var);
        view.addOnAttachStateChangeListener(s0Var);
        b1Var.f463213d = s0Var;
        ym5.r0 r0Var = ym5.r0.f463485a;
        ym5.r0.f463488d = hashMap2.size();
        ym5.r0.f463489e = hashMap.size();
    }

    public static final ym5.b1 b(android.view.View view) {
        return (ym5.b1) f463190b.get(java.lang.Integer.valueOf(view.hashCode()));
    }

    public static final ym5.b1 c(android.view.View view) {
        return (ym5.b1) f463191c.get(java.lang.Integer.valueOf(view.hashCode()));
    }

    public static final ym5.b1 d(int i17) {
        java.util.HashMap hashMap = f463190b;
        ym5.b1 b1Var = (ym5.b1) hashMap.get(java.lang.Integer.valueOf(i17));
        if (b1Var != null) {
            b1Var.f463212c = -1L;
            b1Var.f463213d = null;
            b1Var.f463219j = true;
        }
        java.util.HashMap hashMap2 = f463191c;
        ym5.b1 b1Var2 = (ym5.b1) hashMap2.get(java.lang.Integer.valueOf(i17));
        if (b1Var2 != null) {
            b1Var2.f463212c = -1L;
            b1Var2.f463213d = null;
            b1Var2.f463219j = true;
        }
        ym5.r0 r0Var = ym5.r0.f463485a;
        ym5.r0.f463488d = hashMap.size();
        ym5.r0.f463489e = hashMap2.size();
        return b1Var;
    }

    public static final android.util.Printer e(android.os.Looper looper) {
        kotlin.jvm.internal.o.g(looper, "<this>");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(looper);
            if (obj instanceof android.util.Printer) {
                return (android.util.Printer) obj;
            }
            return null;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            return null;
        }
    }

    public static final void f(yz5.a call) {
        kotlin.jvm.internal.o.g(call, "call");
        long id6 = java.lang.Thread.currentThread().getId();
        android.os.Handler handler = f463189a;
        if (id6 == handler.getLooper().getThread().getId()) {
            call.invoke();
        } else {
            handler.post(new ym5.t0(call));
        }
    }

    public static final void g(androidx.recyclerview.widget.RecyclerView recyclerView, ym5.m0 m0Var) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        f(new ym5.w0(m0Var, recyclerView));
    }

    public static final void h(android.view.View view, ym5.n0 n0Var) {
        kotlin.jvm.internal.o.g(view, "<this>");
        f(new ym5.x0(n0Var, view));
    }

    public static final void i(android.view.View view, ym5.n0 n0Var) {
        kotlin.jvm.internal.o.g(view, "<this>");
        f(new ym5.z0(n0Var, view));
    }
}
