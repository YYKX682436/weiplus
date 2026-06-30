package n95;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f335922a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f335923b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f335924c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f335925d;

    public a(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f335922a = obj;
        this.f335923b = str;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f335925d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f335922a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f335924c) {
            return;
        }
        this.f335924c = true;
        java.lang.Class<?> cls = this.f335922a.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f335923b);
                declaredField.setAccessible(true);
                this.f335925d = declaredField;
                return;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
