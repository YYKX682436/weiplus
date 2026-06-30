package yo;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f464041a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f464042b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f464043c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f464044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f464045e;

    public b(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f464041a = obj;
        this.f464042b = str;
        this.f464045e = str2;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f464044d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f464041a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f464043c) {
            return;
        }
        this.f464043c = true;
        java.lang.Class<?> cls = this.f464041a.getClass();
        while (cls != null) {
            try {
                try {
                    java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f464042b);
                    declaredField.setAccessible(true);
                    this.f464044d = declaredField;
                    return;
                } catch (java.lang.Exception unused) {
                    java.lang.String str = this.f464045e;
                    if (str != null) {
                        try {
                            if (!str.equals("")) {
                                java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
                                int length = declaredFields.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length) {
                                        java.lang.reflect.Field field = declaredFields[i17];
                                        if (field.getType().getName().equals(str)) {
                                            field.setAccessible(true);
                                            this.f464044d = field;
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
