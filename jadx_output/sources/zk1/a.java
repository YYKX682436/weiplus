package zk1;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).setDescendantFocusability(131072);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AccessibilityExt", "doAccessibilityFocus, focused: " + view.requestFocus());
    }
}
