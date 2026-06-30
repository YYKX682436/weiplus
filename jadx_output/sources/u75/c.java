package u75;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f425181a;

    public static final boolean a() {
        java.lang.Boolean bool;
        java.lang.Boolean bool2 = f425181a;
        if (bool2 != null) {
            kotlin.jvm.internal.o.d(bool2);
            return bool2.booleanValue();
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.android.os.SystemPropertiesEx");
            java.lang.Object invoke = cls.getMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE).invoke(cls.newInstance(), "ro.config.hw_magic_window_enable", java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HuaweiKt", "hasHuaweiMagicWindowFeature: " + th6.getMessage());
            bool = java.lang.Boolean.FALSE;
        }
        f425181a = bool;
        kotlin.jvm.internal.o.d(bool);
        return bool.booleanValue();
    }
}
