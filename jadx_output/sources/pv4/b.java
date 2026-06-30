package pv4;

/* loaded from: classes.dex */
public abstract class b {
    public static final float a() {
        return java.lang.Math.max(java.lang.Math.min(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a), 1.4f), 1.0f);
    }

    public static final void b(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "<this>");
        float f17 = view.getResources().getDisplayMetrics().density;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (i17 * f17);
        layoutParams.height = (int) (i18 * f17);
        view.setLayoutParams(layoutParams);
    }

    public static final void c(android.view.View view, float f17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        float a17 = a();
        float f18 = view.getResources().getDisplayMetrics().density;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (f17 * f18 * a17);
        view.setLayoutParams(layoutParams);
    }

    public static final void d(android.view.View view, float f17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        float a17 = a();
        float f18 = view.getResources().getDisplayMetrics().density;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (f17 * f18 * a17);
        view.setLayoutParams(layoutParams);
    }
}
