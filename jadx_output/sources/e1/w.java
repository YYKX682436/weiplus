package e1;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final e1.w f246290a = new e1.w();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f246291b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f246292c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f246293d;

    public final void a(android.graphics.Canvas canvas, boolean z17) {
        java.lang.reflect.Method method;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            e1.x.f246294a.a(canvas, z17);
            return;
        }
        if (!f246293d) {
            try {
                if (i17 == 28) {
                    java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass());
                    f246291b = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new java.lang.Class[0]);
                    f246292c = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new java.lang.Class[0]);
                } else {
                    f246291b = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new java.lang.Class[0]);
                    f246292c = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new java.lang.Class[0]);
                }
                java.lang.reflect.Method method2 = f246291b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                java.lang.reflect.Method method3 = f246292c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            f246293d = true;
        }
        if (z17) {
            try {
                java.lang.reflect.Method method4 = f246291b;
                if (method4 != null) {
                    kotlin.jvm.internal.o.d(method4);
                    method4.invoke(canvas, new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                return;
            }
        }
        if (z17 || (method = f246292c) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(method);
        method.invoke(canvas, new java.lang.Object[0]);
    }
}
