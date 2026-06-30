package u4;

/* loaded from: classes13.dex */
public abstract class y1 extends u4.x1 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Method f424589e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f424590f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Method f424591g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f424592h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f424593i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f424594j;

    @Override // u4.a2
    public void b(android.view.View view, android.graphics.Matrix matrix) {
        if (!f424590f) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToGlobal", android.graphics.Matrix.class);
                f424589e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f424590f = true;
        }
        java.lang.reflect.Method method = f424589e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }

    @Override // u4.a2
    public void c(android.view.View view, android.graphics.Matrix matrix) {
        if (!f424592h) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToLocal", android.graphics.Matrix.class);
                f424591g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f424592h = true;
        }
        java.lang.reflect.Method method = f424591g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }
}
