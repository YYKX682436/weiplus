package zu5;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f475888a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f475889b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f475890c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f475891d;

    public a(java.lang.Class cls, java.lang.String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f475888a = cls;
        this.f475889b = str;
    }

    public synchronized java.lang.Object a(boolean z17) {
        b();
        java.lang.reflect.Field field = this.f475891d;
        if (field != null) {
            try {
                return field.get(null);
            } catch (java.lang.ClassCastException unused) {
                throw new java.lang.IllegalArgumentException("unable to cast object");
            }
        }
        if (!z17) {
            throw new java.lang.NoSuchFieldException();
        }
        ku5.o.f312599c.w("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.f475889b), new java.lang.Object[0]);
        return null;
    }

    public final synchronized void b() {
        if (this.f475890c) {
            return;
        }
        for (java.lang.Class cls = this.f475888a; cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f475889b);
                declaredField.setAccessible(true);
                this.f475891d = declaredField;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        this.f475890c = true;
    }

    public synchronized boolean c(java.lang.Object obj, java.lang.Object obj2, boolean z17) {
        b();
        java.lang.reflect.Field field = this.f475891d;
        if (field != null) {
            field.set(obj, obj2);
            return true;
        }
        if (z17) {
            ku5.o.f312599c.w("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.f475889b), new java.lang.Object[0]);
            return false;
        }
        throw new java.lang.NoSuchFieldException("Method " + this.f475889b + " is not exists.");
    }
}
