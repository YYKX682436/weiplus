package x1;

/* loaded from: classes14.dex */
public abstract class g {
    public static final java.lang.String a(int i17, n0.o oVar, int i18) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.i(androidx.compose.ui.platform.a1.f10502a);
        android.content.res.Resources resources = ((android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b)).getResources();
        kotlin.jvm.internal.o.f(resources, "LocalContext.current.resources");
        java.lang.String string = resources.getString(i17);
        kotlin.jvm.internal.o.f(string, "resources.getString(id)");
        return string;
    }
}
