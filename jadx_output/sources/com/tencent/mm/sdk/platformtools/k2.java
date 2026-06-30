package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class k2 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f192795c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f192796d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f192797e;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Runnable f192799g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.lang.Class f192800h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f192801i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f192802j;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f192793a = new java.util.WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f192794b = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f192798f = android.app.Activity.class.getName();

    static {
        f192795c = null;
        f192796d = null;
        f192797e = false;
        com.tencent.mm.sdk.platformtools.i2 i2Var = new com.tencent.mm.sdk.platformtools.i2();
        f192799g = i2Var;
        if ((!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) || com.tencent.mars.xlog.Log.getLogLevel() > 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ListenerInstanceMonitor", "Not debug, assist or monkey env, keep disabled.");
        } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mContext");
                f192795c = declaredField;
                declaredField.setAccessible(true);
                synchronized (i2Var) {
                    if (!f192797e) {
                        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("ListenerInstanceMonitor");
                        f192796d = n3Var;
                        n3Var.setLogging(false);
                        f192796d.postDelayed(i2Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                        f192797e = true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", th6, "init failed, keep disabled.", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ListenerInstanceMonitor", "Not mm process, keep disabled.");
        }
        f192800h = null;
        f192801i = null;
        f192802j = new java.lang.Object();
    }

    public static void a(java.lang.Object obj, android.app.Activity activity, java.lang.reflect.Field field, java.lang.Throwable th6) {
        java.lang.annotation.Annotation annotation;
        try {
            if (f192800h == null) {
                synchronized (f192802j) {
                    if (f192800h == null) {
                        f192800h = com.tencent.mm.sdk.platformtools.DoNotCheckLeakForActivities.class;
                        f192801i = f192800h.getDeclaredMethod("value", new java.lang.Class[0]);
                    }
                }
            }
            if (!obj.getClass().isAnnotationPresent(f192800h)) {
                java.lang.reflect.Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                int length = declaredMethods.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        annotation = null;
                        break;
                    }
                    java.lang.reflect.Method method = declaredMethods[i17];
                    if (method.isAnnotationPresent(f192800h)) {
                        annotation = method.getAnnotation(f192800h);
                        break;
                    }
                    i17++;
                }
            } else {
                annotation = obj.getClass().getAnnotation(f192800h);
            }
            if (annotation != null) {
                java.lang.Class<?> cls = activity.getClass();
                java.lang.Class[] clsArr = (java.lang.Class[]) f192801i.invoke(annotation, new java.lang.Object[0]);
                boolean z17 = true;
                if (clsArr != null && clsArr.length > 0) {
                    int length2 = clsArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length2) {
                            z17 = false;
                            break;
                        } else if (cls.equals(clsArr[i18])) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ListenerInstanceMonitor", "Activity %s held by %s is ignored !!", activity, obj);
                    return;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", th7, "addHeldObjInfo", new java.lang.Object[0]);
        }
        synchronized (f192794b) {
            java.util.Map map = f192793a;
            java.util.Set set = (java.util.Set) ((java.util.WeakHashMap) map).get(obj);
            if (set == null) {
                set = new java.util.HashSet();
                ((java.util.WeakHashMap) map).put(obj, set);
            }
            set.add(new com.tencent.mm.sdk.platformtools.j2(activity, field, th6));
        }
    }

    public static void b(java.lang.Object obj) {
        synchronized (f192799g) {
            if (f192797e) {
                if (obj == null) {
                    return;
                }
                java.lang.Throwable th6 = new java.lang.Throwable();
                for (java.lang.Class<?> cls = obj.getClass(); !java.lang.Object.class.equals(cls); cls = cls.getSuperclass()) {
                    if (android.app.Activity.class.isAssignableFrom(cls)) {
                        d(obj, null, th6);
                    } else if (android.view.View.class.isAssignableFrom(cls)) {
                        e(obj, null, th6);
                    } else {
                        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                            java.lang.Class<?> type = field.getType();
                            if (android.app.Activity.class.isAssignableFrom(type)) {
                                d(obj, field, th6);
                            } else if (android.view.View.class.isAssignableFrom(type)) {
                                e(obj, field, th6);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void c(java.lang.Object obj) {
        synchronized (f192799g) {
            if (f192797e) {
                if (obj == null) {
                    return;
                }
                synchronized (f192794b) {
                    ((java.util.WeakHashMap) f192793a).remove(obj);
                }
            }
        }
    }

    public static void d(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Throwable th6) {
        android.app.Activity activity;
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                activity = (android.app.Activity) field.get(obj);
                if (activity == null) {
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        } else if (!(obj instanceof android.app.Activity)) {
            return;
        } else {
            activity = (android.app.Activity) obj;
        }
        a(obj, activity, field, th6);
    }

    public static void e(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Throwable th6) {
        android.view.View view;
        java.lang.reflect.Field field2 = f192795c;
        if (field == null) {
            if (!(obj instanceof android.view.View)) {
                return;
            } else {
                view = (android.view.View) obj;
            }
        } else {
            if (field2 == null) {
                return;
            }
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                view = (android.view.View) field.get(obj);
                if (view == null) {
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        java.lang.Object obj2 = field2.get(view);
        if (obj2 instanceof android.app.Activity) {
            a(obj, (android.app.Activity) obj2, field, th6);
        }
    }
}
