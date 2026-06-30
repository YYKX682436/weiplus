package i85;

/* loaded from: classes5.dex */
public final class i extends i85.c {
    @Override // i85.p
    public java.lang.String a() {
        return "telephony.registry";
    }

    @Override // i85.p
    public java.lang.String c() {
        return "com.android.internal.telephony.ITelephonyRegistry";
    }

    @Override // i85.c, i85.p
    public void d(java.lang.Object service) {
        java.lang.Class<?> cls;
        kotlin.jvm.internal.o.g(service, "service");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.reflect.Field field = null;
            try {
                cls = java.lang.Class.forName("android.telephony.TelephonyManager");
            } catch (java.lang.ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    field = cls.getDeclaredField("sRegistry");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.i("HookPhoneRegisterProcessor", "NoSuchFieldException: " + th6.getMessage());
                }
            }
            com.tencent.mars.xlog.Log.i("HookPhoneRegisterProcessor", "TelephonyManager-sRegistry = " + field);
            com.tencent.mars.xlog.Log.i("HookPhoneRegisterProcessor", "mPmFidld = " + field);
            if (field != null) {
                field.setAccessible(true);
                field.set(cls, service);
            }
        }
    }
}
