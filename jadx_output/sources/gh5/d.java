package gh5;

/* loaded from: classes5.dex */
public abstract class d {
    public static final gh5.b a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        n3.h2.a(activity.getWindow(), false);
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        android.view.View findViewById = decorView.findViewById(com.tencent.mm.R.id.keyboard_observer_view);
        if (findViewById == null) {
            findViewById = new android.view.View(activity);
            findViewById.setId(com.tencent.mm.R.id.keyboard_observer_view);
            findViewById.setClickable(false);
            findViewById.setFocusable(false);
            findViewById.setImportantForAccessibility(2);
            findViewById.setLayoutParams(new android.widget.FrameLayout.LayoutParams(0, 0));
            ym5.v6.b(decorView, findViewById);
        }
        java.lang.Object tag = findViewById.getTag(com.tencent.mm.R.id.keyboard_observer);
        gh5.b bVar = tag instanceof gh5.b ? (gh5.b) tag : null;
        if (bVar == null) {
            bVar = new gh5.b();
            n3.l1.o(findViewById, bVar);
            n3.a1.u(findViewById, bVar);
            if (n3.x0.b(findViewById)) {
                findViewById.requestApplyInsets();
            } else {
                findViewById.addOnAttachStateChangeListener(new gh5.c(findViewById));
            }
            findViewById.setTag(com.tencent.mm.R.id.keyboard_observer, bVar);
        }
        return bVar;
    }

    public static final boolean b(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        android.view.View decorView = activity.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(decorView);
        if (a17 == null) {
            return false;
        }
        return a17.f(8);
    }
}
