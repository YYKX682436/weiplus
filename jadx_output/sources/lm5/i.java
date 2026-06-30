package lm5;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f319609a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f319610b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f319611c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.ThreadLocal f319612d = new java.lang.ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.lang.reflect.Field f319613e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile java.lang.Boolean f319614f = java.lang.Boolean.FALSE;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f319615g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static boolean f319616h = true;

    static {
        f();
    }

    public static lm5.d a() {
        lm5.d dVar;
        java.lang.reflect.Field e17;
        java.lang.ThreadLocal threadLocal = f319612d;
        lm5.d dVar2 = (lm5.d) threadLocal.get();
        if (dVar2 != null && ((java.util.HashMap) f319610b).isEmpty()) {
            return dVar2;
        }
        synchronized (lm5.i.class) {
            dVar = (lm5.d) ((java.util.HashMap) f319610b).remove(java.lang.Thread.currentThread());
        }
        if (dVar2 != null && dVar == null) {
            return dVar2;
        }
        if (dVar != null) {
            jm5.b.b("Vending.SchedulerProvider", "Override current scheduler: %s", dVar);
            threadLocal.set(dVar);
            return dVar;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        boolean z17 = false;
        if (myLooper != null) {
            if (f319616h) {
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 30 && (e17 = e()) != null) {
                        if (!((java.lang.Boolean) e17.get(myLooper)).booleanValue()) {
                            jm5.b.b("Vending.SchedulerProvider", "Looper is not in loop by mInLooper flag: %s", myLooper);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    jm5.b.b("Vending.SchedulerProvider", "Reflect looper failed: %s, continue", th6.getMessage());
                }
                for (java.lang.StackTraceElement stackTraceElement : new java.lang.Throwable().getStackTrace()) {
                    if (!stackTraceElement.getClassName().equals("android.os.Looper") || !stackTraceElement.getMethodName().equals("loop")) {
                    }
                }
                jm5.b.b("Vending.SchedulerProvider", "Looper is not in loop: %s", myLooper);
            } else {
                jm5.b.b("Vending.SchedulerProvider", "Looper valid check disabled", new java.lang.Object[0]);
            }
            z17 = true;
            break;
        }
        if (z17) {
            dVar = new lm5.j(android.os.Looper.myLooper(), android.os.Looper.myLooper().toString());
            jm5.b.b("Vending.SchedulerProvider", "Create single scheduler: %s", dVar);
        } else if (dVar == null) {
            jm5.b.c("Vending.SchedulerProvider", "This is not a handler thread! %s", java.lang.Thread.currentThread());
            return new lm5.c();
        }
        f319612d.set(dVar);
        return dVar;
    }

    public static void b(boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "enabled" : "disabled";
        jm5.b.b("Vending.SchedulerProvider", "Looper valid check %s", objArr);
        f319616h = z17;
    }

    public static void c(java.lang.String str, lm5.d dVar) {
        iz5.a.d("Scheduler type is null", str);
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String upperCase = str.toUpperCase(locale);
        java.util.Map map = f319609a;
        if (map.containsKey(upperCase)) {
            new java.lang.IllegalStateException("Fatal error! Duplicate scheduler type " + str.toUpperCase(locale));
        }
        map.put(upperCase, dVar);
        if (dVar instanceof lm5.j) {
            synchronized (lm5.i.class) {
                f319610b.put(((lm5.j) dVar).f319618e.getThread(), dVar);
            }
        }
    }

    public static lm5.d d(java.lang.String str) {
        iz5.a.d("Scheduler type is null", str);
        java.util.Map map = f319609a;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        lm5.d dVar = (lm5.d) ((java.util.concurrent.ConcurrentHashMap) map).get(str.toUpperCase(locale));
        iz5.a.d("Scheduler type not found: " + str.toUpperCase(locale), dVar);
        return dVar;
    }

    public static java.lang.reflect.Field e() {
        java.lang.Boolean bool;
        if (f319613e == null && !f319614f.booleanValue()) {
            synchronized (f319615g) {
                if (f319613e == null && !f319614f.booleanValue()) {
                    try {
                        java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("mInLoop");
                        declaredField.setAccessible(true);
                        f319613e = declaredField;
                        bool = java.lang.Boolean.TRUE;
                    } catch (java.lang.Throwable th6) {
                        try {
                            jm5.b.b("Vending.SchedulerProvider", "Reflect looper failed: %s", th6.getMessage());
                            bool = java.lang.Boolean.TRUE;
                        } catch (java.lang.Throwable th7) {
                            f319614f = java.lang.Boolean.TRUE;
                            throw th7;
                        }
                    }
                    f319614f = bool;
                }
            }
        }
        return f319613e;
    }

    public static synchronized void f() {
        synchronized (lm5.i.class) {
            if (f319611c) {
                return;
            }
            jm5.b.b("Vending.SchedulerProvider", "SchedulerProvider provided.", new java.lang.Object[0]);
            f319611c = true;
            c("Vending.UI", lm5.d.f319600a);
            c("Vending.LOGIC", lm5.d.f319601b);
            c("Vending.HEAVY_WORK", lm5.d.f319602c);
        }
    }
}
