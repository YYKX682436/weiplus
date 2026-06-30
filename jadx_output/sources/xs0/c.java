package xs0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Constructor f456295a;

    public static final android.hardware.camera2.CaptureRequest.Key a(java.lang.String name, java.lang.Class klass) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(klass, "klass");
        try {
            if (f456295a == null) {
                java.lang.reflect.Constructor constructor = android.hardware.camera2.CaptureRequest.Key.class.getConstructor(java.lang.String.class, klass.getClass());
                f456295a = constructor;
                kotlin.jvm.internal.o.d(constructor);
                constructor.setAccessible(true);
            }
            try {
                java.lang.reflect.Constructor constructor2 = f456295a;
                kotlin.jvm.internal.o.d(constructor2);
                return (android.hardware.camera2.CaptureRequest.Key) constructor2.newInstance(name, klass);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                return null;
            }
        } catch (java.lang.NoSuchMethodException e18) {
            e18.getMessage();
            return null;
        }
    }
}
