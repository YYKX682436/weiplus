package r26;

/* loaded from: classes7.dex */
public abstract class g0 extends r26.f0 {
    public static final java.lang.Double e(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            if (r26.w.f368921a.e(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.lang.Float f(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            if (r26.w.f368921a.e(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
