package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public abstract class cl {

    /* renamed from: a, reason: collision with root package name */
    public static int f206295a;

    public static final n3.g3 a(android.content.Context context) {
        n3.g3 g3Var;
        android.view.View peekDecorView;
        kotlin.jvm.internal.o.g(context, "<this>");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            android.view.Window window = activity.getWindow();
            if (window == null || (peekDecorView = window.peekDecorView()) == null) {
                g3Var = null;
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                g3Var = n3.b1.a(peekDecorView);
            }
            if (g3Var != null) {
                return g3Var;
            }
        }
        com.tencent.mm.ui.yk.f("MicroMsg.WeUIToolHelper", "getContextInsets, context is not activity", new java.lang.Object[0]);
        return null;
    }

    public static final int b(android.content.Context context) {
        n3.g3 a17;
        e3.d a18;
        return (context == null || (a17 = a(context)) == null || (a18 = a17.a(2)) == null) ? f206295a : a18.f247047d;
    }

    public static final int c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        n3.g3 a17 = a(context);
        return (a17 == null || !com.tencent.mm.ui.b4.c(context)) ? com.tencent.mm.ui.bl.c(context) : android.os.Build.VERSION.SDK_INT >= 30 ? a17.a(android.view.WindowInsets.Type.tappableElement()).f247047d : com.tencent.mm.ui.bl.c(context);
    }
}
