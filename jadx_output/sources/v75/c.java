package v75;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v75.c f433953a = new v75.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f433954b = jz5.h.b(v75.a.f433951d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f433955c = jz5.h.b(v75.b.f433952d);

    public final float a() {
        java.lang.Class cls = (java.lang.Class) ((jz5.n) f433954b).getValue();
        if (cls == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Honor..DeviceHealthDetect", "This device does not support get TouchDetect result");
            return -1.0f;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("getDetectResult", new java.lang.Class[0]);
            if (method == null) {
                return -5.0f;
            }
            java.lang.Object invoke = method.invoke(((jz5.n) f433955c).getValue(), new java.lang.Object[0]);
            if (invoke == null) {
                return -3.0f;
            }
            java.lang.Class<?> cls2 = invoke.getClass();
            java.lang.reflect.Method method2 = cls2.getMethod("getErrorCode", new java.lang.Class[0]);
            if (!kotlin.jvm.internal.o.b(method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null, 0)) {
                return -3.0f;
            }
            java.lang.reflect.Method method3 = cls2.getMethod("getResult", new java.lang.Class[0]);
            java.lang.Object invoke2 = method3 != null ? method3.invoke(invoke, new java.lang.Object[0]) : null;
            java.lang.Float f17 = invoke2 instanceof java.lang.Float ? (java.lang.Float) invoke2 : null;
            if (f17 == null) {
                return -4.0f;
            }
            float floatValue = f17.floatValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.Honor..DeviceHealthDetect", "device health result:" + floatValue);
            return floatValue;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Honor..DeviceHealthDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
            return -2.0f;
        }
    }
}
