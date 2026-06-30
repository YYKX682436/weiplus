package db5;

/* loaded from: classes14.dex */
public abstract class f {
    public static void a(android.content.Context context, android.content.Intent intent) {
        if (intent == null || context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        if (intent.getBooleanExtra("animation_pop_in", false)) {
            ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477728p);
        }
        if (intent.getBooleanExtra("animation_push_up_in", false)) {
            ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(android.app.Activity activity) {
        try {
            java.lang.reflect.Method declaredMethod = android.app.Activity.class.getDeclaredMethod("convertFromTranslucent", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new java.lang.Object[0]);
            if (activity instanceof db5.c) {
                ((db5.c) activity).q4();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ActivityUtil", th6, "call convertActivityFromTranslucent Fail: %s", th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(android.app.Activity activity, db5.d dVar) {
        java.lang.Object obj;
        if (fp.h.a(16)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        try {
            java.lang.Class<?> cls = null;
            for (java.lang.Class<?> cls2 : android.app.Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener") && !cls2.getSimpleName().equals("SemTranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            if (dVar != null) {
                db5.e eVar = new db5.e(null);
                eVar.f228322a = new java.lang.ref.WeakReference(dVar);
                obj = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, eVar);
            } else {
                obj = null;
            }
            if (fp.h.a(21)) {
                java.lang.reflect.Method declaredMethod = android.app.Activity.class.getDeclaredMethod("convertToTranslucent", cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity, obj);
            } else {
                java.lang.reflect.Method declaredMethod2 = android.app.Activity.class.getDeclaredMethod("convertToTranslucent", cls, android.app.ActivityOptions.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, obj, null);
            }
            if (activity instanceof db5.c) {
                ((db5.c) activity).k2();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ActivityUtil", th6, "call convertActivityToTranslucent Fail: %s", th6.getMessage());
        }
    }

    public static al5.q d(java.lang.Class cls) {
        int e17 = e(cls);
        if ((32768 & e17) != 0) {
            return al5.q.f5992h;
        }
        if ((e17 & 512) != 0) {
            return al5.q.f5988d;
        }
        if ((e17 & 1024) != 0) {
            return al5.q.f5989e;
        }
        if ((e17 & 8192) != 0) {
            return al5.q.f5991g;
        }
        if ((e17 & 2048) != 0) {
            return al5.q.f5990f;
        }
        return null;
    }

    public static int e(java.lang.Class cls) {
        db5.a aVar = (db5.a) cls.getAnnotation(db5.a.class);
        if (aVar != null) {
            return aVar.value();
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null) {
            return e(superclass);
        }
        return 0;
    }

    public static al5.q f(java.lang.Class cls) {
        int e17 = e(cls);
        return (32768 & e17) != 0 ? al5.q.f5992h : (e17 & 512) != 0 ? al5.q.f5988d : (e17 & 1024) != 0 ? al5.q.f5989e : (e17 & 8192) != 0 ? al5.q.f5991g : (e17 & 2048) != 0 ? al5.q.f5990f : al5.q.f5990f;
    }

    public static boolean g() {
        return fp.h.c(19);
    }

    public static void h(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    public static void i(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477728p);
    }

    public static void j(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477848d6);
    }

    public static void k(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477848d6);
    }
}
