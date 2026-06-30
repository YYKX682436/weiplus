package sj3;

/* loaded from: classes14.dex */
public final class n3 {
    public n3(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final void b(java.lang.String fileMd5, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileMd5, "fileMd5");
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.getClass();
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.s3(i4Var, fileMd5));
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        if (Ri.f150183x1 == null) {
            Ri.f150183x1 = new androidx.lifecycle.j0();
        }
        com.tencent.mm.plugin.multitalk.model.c3 c3Var = new com.tencent.mm.plugin.multitalk.model.c3();
        Ri.f150173p1 = c3Var;
        c3Var.f149903c = java.lang.System.currentTimeMillis();
        Ri.f150173p1.f149901a = fileMd5;
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.multitalk.model.z0 z0Var = new com.tencent.mm.plugin.multitalk.model.z0(Ri);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(z0Var, 3000L, "delayChecking");
        Ri.f150183x1.postValue(Ri.f150173p1);
    }

    public final int c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        int dimensionPixelSize = identifier > 0 ? android.content.res.Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int g17 = com.tencent.mm.ui.bl.g(context);
        return (g17 == 0 || g17 >= dimensionPixelSize) ? dimensionPixelSize : g17;
    }

    public final void d(android.app.Activity activity, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (z17) {
            activity.getWindow().clearFlags(1024);
            activity.getWindow().addFlags(134217728);
        } else {
            activity.getWindow().setFlags(1024, 1024);
            activity.getWindow().clearFlags(134217728);
        }
    }
}
