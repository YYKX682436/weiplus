package u4;

/* loaded from: classes13.dex */
public abstract class x1 extends u4.a2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Method f424579a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f424580b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f424581c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f424582d;

    @Override // u4.a2
    public float a(android.view.View view) {
        if (!f424582d) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getTransitionAlpha", new java.lang.Class[0]);
                f424581c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f424582d = true;
        }
        java.lang.reflect.Method method = f424581c;
        if (method != null) {
            try {
                return ((java.lang.Float) method.invoke(view, new java.lang.Object[0])).floatValue();
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
        return super.a(view);
    }
}
