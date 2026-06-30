package oj;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f345670a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345671b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345672c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f345673d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class[] f345674e;

    public b0(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f345670a = cls;
        this.f345671b = str;
        this.f345674e = clsArr;
    }

    public synchronized java.lang.Object a(java.lang.Object obj, boolean z17, java.lang.Object... objArr) {
        synchronized (this) {
            if (!this.f345672c) {
                for (java.lang.Class cls = this.f345670a; cls != null; cls = cls.getSuperclass()) {
                    try {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(this.f345671b, this.f345674e);
                        declaredMethod.setAccessible(true);
                        this.f345673d = declaredMethod;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f345672c = true;
            }
        }
        java.lang.reflect.Method method = this.f345673d;
        if (method != null) {
            return method.invoke(obj, objArr);
        }
        if (z17) {
            oj.j.f("ReflectFiled", "Field %s is no exists", this.f345671b);
            return null;
        }
        throw new java.lang.NoSuchFieldException("Method " + this.f345671b + " is not exists.");
    }
}
