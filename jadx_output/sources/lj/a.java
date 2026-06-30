package lj;

/* loaded from: classes7.dex */
public enum a {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f318795d = false;

    a() {
    }

    public static boolean h() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return false;
            }
            for (java.lang.Object obj : arrayMap.values()) {
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
