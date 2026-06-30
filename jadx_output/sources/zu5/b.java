package zu5;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f475892a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Method f475893b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class[] f475894c;

    public b(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f475894c = clsArr;
    }

    public synchronized java.lang.Object a(java.lang.Object obj, boolean z17, java.lang.Object... objArr) {
        synchronized (this) {
            if (!this.f475892a) {
                for (java.lang.Class<android.os.Message> cls = android.os.Message.class; cls != null; cls = cls.getSuperclass()) {
                    try {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("recycleUnchecked", this.f475894c);
                        declaredMethod.setAccessible(true);
                        this.f475893b = declaredMethod;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f475892a = true;
            }
        }
        java.lang.reflect.Method method = this.f475893b;
        if (method != null) {
            return method.invoke(obj, objArr);
        }
        if (z17) {
            ku5.o.f312599c.w("ReflectFiled", "Field %s is no exists", "recycleUnchecked");
            return null;
        }
        throw new java.lang.NoSuchFieldException("Method recycleUnchecked is not exists.");
    }
}
