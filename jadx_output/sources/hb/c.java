package hb;

/* loaded from: classes7.dex */
public final class c extends hb.b {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Class f280009d;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f280010b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f280011c;

    public c() {
        java.lang.Object obj;
        java.lang.reflect.Field field = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            f280009d = cls;
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        this.f280010b = obj;
        try {
            field = java.lang.reflect.AccessibleObject.class.getDeclaredField("override");
        } catch (java.lang.NoSuchFieldException unused2) {
        }
        this.f280011c = field;
    }

    @Override // hb.b
    public void a(java.lang.reflect.AccessibleObject accessibleObject) {
        java.lang.reflect.Field field;
        boolean z17 = false;
        java.lang.Object obj = this.f280010b;
        if (obj != null && (field = this.f280011c) != null) {
            try {
                f280009d.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE).invoke(obj, accessibleObject, java.lang.Long.valueOf(((java.lang.Long) f280009d.getMethod("objectFieldOffset", java.lang.reflect.Field.class).invoke(obj, field)).longValue()), java.lang.Boolean.TRUE);
                z17 = true;
            } catch (java.lang.Exception unused) {
            }
        }
        if (z17) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.SecurityException e17) {
            throw new com.google.gson.m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e17);
        }
    }
}
