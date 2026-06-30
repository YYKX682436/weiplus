package ys0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Constructor f465125a;

    public static final android.hardware.camera2.CaptureResult.Key a(java.lang.String name, java.lang.Class klass) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(klass, "klass");
        try {
            if (f465125a == null) {
                java.lang.reflect.Constructor constructor = android.hardware.camera2.CaptureResult.Key.class.getConstructor(java.lang.String.class, klass.getClass());
                f465125a = constructor;
                kotlin.jvm.internal.o.d(constructor);
                constructor.setAccessible(true);
            }
            try {
                java.lang.reflect.Constructor constructor2 = f465125a;
                kotlin.jvm.internal.o.d(constructor2);
                java.lang.Object newInstance = constructor2.newInstance(name, klass);
                kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type android.hardware.camera2.CaptureResult.Key<T of com.tencent.mm.media.widget.camera2.effect.result.WCResultKeyCreator.resultKey>");
                return (android.hardware.camera2.CaptureResult.Key) newInstance;
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
