package qk0;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f364418a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Field f364419b;

    public a(java.lang.Class cls, java.lang.String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
    }

    public synchronized java.lang.Object a(boolean z17) {
        synchronized (this) {
            if (!this.f364418a) {
                for (java.lang.Class<android.os.Looper> cls = android.os.Looper.class; cls != null; cls = cls.getSuperclass()) {
                    try {
                        java.lang.reflect.Field declaredField = cls.getDeclaredField("sThreadLocal");
                        declaredField.setAccessible(true);
                        this.f364419b = declaredField;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f364418a = true;
            }
        }
        java.lang.reflect.Field field = this.f364419b;
        if (field != null) {
            try {
                return field.get(null);
            } catch (java.lang.ClassCastException unused2) {
                throw new java.lang.IllegalArgumentException("unable to cast object");
            }
        }
        if (!z17) {
            throw new java.lang.NoSuchFieldException();
        }
        rk0.c.d("SDK.ReflectStaticFieldSmith", "Field %s is no exists.", "sThreadLocal");
        return null;
    }
}
