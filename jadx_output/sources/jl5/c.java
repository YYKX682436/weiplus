package jl5;

/* loaded from: classes15.dex */
public abstract class c {
    public static void a(android.text.Spannable spannable) {
        java.lang.Class<?> cls;
        java.lang.Class<?>[] clsArr = {android.text.Spannable.class};
        try {
            cls = java.lang.Class.forName(android.text.method.MetaKeyKeyListener.class.getName());
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        java.lang.reflect.Method method = null;
        while (cls != java.lang.Object.class) {
            try {
                method = cls.getDeclaredMethod("resetLockedMeta", clsArr);
            } catch (java.lang.Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        java.lang.Object[] objArr = {spannable};
        try {
            method.setAccessible(true);
            method.invoke(null, objArr);
        } catch (java.lang.Throwable unused3) {
        }
    }

    public static void b(android.view.View view, android.text.Spannable spannable) {
        java.lang.Class<?> cls;
        java.lang.Class<?>[] clsArr = {android.text.Spannable.class};
        try {
            cls = java.lang.Class.forName(android.text.method.MetaKeyKeyListener.class.getName());
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        java.lang.reflect.Method method = null;
        while (cls != java.lang.Object.class) {
            try {
                method = cls.getDeclaredMethod("stopSelecting", clsArr);
            } catch (java.lang.Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        java.lang.Object[] objArr = {view, spannable};
        try {
            method.setAccessible(true);
            method.invoke(null, objArr);
        } catch (java.lang.Throwable unused3) {
        }
    }
}
