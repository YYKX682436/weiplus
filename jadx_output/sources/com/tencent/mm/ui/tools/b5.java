package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public final class b5 {

    /* renamed from: b, reason: collision with root package name */
    public static int f210298b = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.tools.b5 f210297a = new com.tencent.mm.ui.tools.b5();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f210299c = new java.util.LinkedHashSet();

    public final void a(com.tencent.mm.ui.tools.w4 w4Var, android.app.Activity activity, boolean z17) {
        android.view.Window window;
        if (w4Var == null || activity == null) {
            com.tencent.mars.xlog.Log.e("KeyBoardHeightProviderUtil", "register: NPE");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("register: activity:");
        sb6.append(activity);
        sb6.append(" , observer: ");
        sb6.append(w4Var);
        sb6.append(" , hasWindowFocus: ");
        sb6.append(activity.hasWindowFocus());
        sb6.append("  isFinishing:");
        sb6.append(activity.isFinishing());
        sb6.append(" decorView:");
        android.view.Window window2 = activity.getWindow();
        sb6.append(window2 != null ? window2.getDecorView() : null);
        sb6.append(" observer.getActivity:");
        sb6.append(w4Var.a());
        com.tencent.mars.xlog.Log.i("KeyBoardHeightProviderUtil", sb6.toString());
        f210299c.add(w4Var);
        android.app.Activity a17 = w4Var.a();
        if (a17 == null || (window = a17.getWindow()) == null) {
            com.tencent.mars.xlog.Log.e("KeyBoardHeightProviderUtil", "setOnApplyWindowInsetsListener fail");
            return;
        }
        android.view.View decorView = window.getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.post(new com.tencent.mm.ui.tools.z4(window, activity));
    }

    public final void b(com.tencent.mm.ui.tools.w4 w4Var) {
        android.view.Window window;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = w4Var != null ? w4Var.a() : null;
        objArr[1] = w4Var;
        com.tencent.mars.xlog.Log.i("KeyBoardHeightProviderUtil", "unRegister: activity:%s observer:%s ", objArr);
        if (w4Var != null) {
            f210299c.remove(w4Var);
            android.app.Activity a17 = w4Var.a();
            if (a17 == null || (window = a17.getWindow()) == null) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.post(new com.tencent.mm.ui.tools.a5(window));
        }
    }
}
