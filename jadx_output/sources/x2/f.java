package x2;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f451482a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f451483b = new java.lang.ThreadLocal();

    public static void a(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            a(viewParent, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
