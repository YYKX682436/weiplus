package es;

/* loaded from: classes13.dex */
public abstract class d {
    public static void a(android.app.Activity activity, es.b bVar) {
        java.lang.Object obj;
        try {
            java.lang.Class<?> cls = null;
            for (java.lang.Class<?> cls2 : android.app.Activity.class.getDeclaredClasses()) {
                kd.c.d("MicroMsg.ActivityUtil", "clazz: " + cls2.getSimpleName(), new java.lang.Object[0]);
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    if (cls != null && !cls2.getSimpleName().equals("TranslucentConversionListener")) {
                    }
                    cls = cls2;
                }
            }
            if (bVar != null) {
                es.c cVar = new es.c(null);
                cVar.f256266a = new java.lang.ref.WeakReference(bVar);
                obj = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, cVar);
            } else {
                obj = null;
            }
            java.lang.reflect.Method declaredMethod = android.app.Activity.class.getDeclaredMethod("convertToTranslucent", cls, android.app.ActivityOptions.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, obj, null);
        } catch (java.lang.Throwable th6) {
            kd.c.b("MicroMsg.ActivityUtil", "call convertActivityToTranslucent Fail: %s", th6.getMessage());
        }
    }
}
