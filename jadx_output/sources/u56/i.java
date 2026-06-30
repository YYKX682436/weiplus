package u56;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f424830a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f424831b;

    static {
        int i17;
        try {
            i17 = ((java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION", true, java.lang.System.getSecurityManager() == null ? java.lang.ClassLoader.getSystemClassLoader() : (java.lang.ClassLoader) java.security.AccessController.doPrivileged(new u56.h())).getField("SDK_INT").get(null)).intValue();
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        f424830a = i17;
        f424831b = i17 != 0;
    }
}
