package u4;

/* loaded from: classes13.dex */
public abstract class s1 {
    public static void a(android.view.ViewGroup viewGroup, boolean z17) {
        if (!u4.t1.f424556b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.ViewGroup.class.getDeclaredMethod("suppressLayout", java.lang.Boolean.TYPE);
                u4.t1.f424555a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            u4.t1.f424556b = true;
        }
        java.lang.reflect.Method method = u4.t1.f424555a;
        if (method != null) {
            try {
                method.invoke(viewGroup, java.lang.Boolean.valueOf(z17));
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
    }
}
