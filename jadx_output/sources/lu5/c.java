package lu5;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile kotlinx.coroutines.p0 f321459a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f321460b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f321461c;

    static {
        java.lang.Class cls;
        java.lang.reflect.Field field = null;
        try {
            try {
                cls = kotlinx.coroutines.internal.DispatchedContinuation.class;
                int i17 = kotlinx.coroutines.internal.DispatchedContinuation.f310479d;
            } catch (java.lang.ClassNotFoundException unused) {
                cls = java.lang.Class.forName("kotlinx.coroutines.DispatchedContinuation");
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            cls = null;
        }
        f321460b = cls;
        if (cls != null) {
            try {
                java.lang.reflect.Field field2 = cls.getField("continuation");
                if (field2 != null) {
                    field2.setAccessible(true);
                    field = field2;
                }
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
        f321461c = field;
    }
}
