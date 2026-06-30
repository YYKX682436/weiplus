package um0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Class f428701a;
    private static java.lang.reflect.Field field_mContext;
    private static java.lang.reflect.Field field_mFastgrabConfigReader;

    public static void a(android.app.Activity activity) {
        if ("HUAWEI".equalsIgnoreCase(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT == 24) {
            try {
                if (f428701a == null) {
                    java.lang.Class<?> cls = java.lang.Class.forName("android.rms.iaware.FastgrabConfigReader");
                    f428701a = cls;
                    java.lang.reflect.Field declaredField = cls.getDeclaredField("mFastgrabConfigReader");
                    field_mFastgrabConfigReader = declaredField;
                    declaredField.setAccessible(true);
                    java.lang.reflect.Field declaredField2 = f428701a.getDeclaredField("mContext");
                    field_mContext = declaredField2;
                    declaredField2.setAccessible(true);
                }
                java.lang.Object obj = field_mFastgrabConfigReader.get(f428701a);
                if (field_mContext.get(obj) == activity) {
                    field_mContext.set(obj, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
