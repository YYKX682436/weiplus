package zh1;

/* loaded from: classes8.dex */
public abstract class w {
    public static final boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static final void b(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        if (!a(context)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenMaterial.Commons", "notifyChangeFixed, context is invalid, why?");
            return;
        }
        try {
            k0Var.j();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.OpenMaterial.Commons", e17, "notifyChangeFixed, fail", new java.lang.Object[0]);
        }
    }
}
