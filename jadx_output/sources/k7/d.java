package k7;

/* loaded from: classes5.dex */
public abstract class d {
    public static k7.b a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            try {
                throw new java.lang.RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            } catch (java.lang.IllegalAccessException e17) {
                b(cls, e17);
                throw null;
            } catch (java.lang.InstantiationException e18) {
                b(cls, e18);
                throw null;
            } catch (java.lang.NoSuchMethodException e19) {
                b(cls, e19);
                throw null;
            } catch (java.lang.reflect.InvocationTargetException e27) {
                b(cls, e27);
                throw null;
            }
        } catch (java.lang.ClassNotFoundException e28) {
            throw new java.lang.IllegalArgumentException("Unable to find GlideModule implementation", e28);
        }
    }

    public static void b(java.lang.Class cls, java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
