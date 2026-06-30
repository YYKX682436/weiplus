package wo;

/* loaded from: classes7.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f447864a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f447865b;

    static {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("get", java.lang.String.class);
            f447864a = declaredMethod;
            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE);
            f447865b = declaredMethod2;
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
        }
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            return (java.lang.String) f447864a.invoke(null, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static int b(java.lang.String str, int i17) {
        try {
            return ((java.lang.Integer) f447865b.invoke(null, str, java.lang.Integer.valueOf(i17))).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }
}
