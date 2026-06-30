package wh;

/* loaded from: classes12.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445741a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445742b;

    /* renamed from: c, reason: collision with root package name */
    public final wh.a2 f445743c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.IBinder f445744d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.IBinder f445745e;

    public b2(java.lang.String str, java.lang.String str2, wh.a2 a2Var) {
        this.f445741a = str;
        this.f445742b = str2;
        this.f445743c = a2Var;
    }

    public boolean a() {
        java.lang.String str = this.f445741a;
        java.lang.String str2 = this.f445742b;
        oj.j.c("Matrix.battery.SystemServiceBinderHooker", "doHook: serviceName:%s, serviceClsName:%s", str, str2);
        try {
            wh.z1 z1Var = new wh.z1(str, str2, this.f445743c);
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
            java.lang.ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null) {
                throw new java.lang.IllegalStateException("Can not get ClassLoader of ".concat(cls.getName()));
            }
            android.os.IBinder iBinder = (android.os.IBinder) java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{android.os.IBinder.class}, z1Var);
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((java.util.Map) declaredField.get(null)).put(str, iBinder);
            this.f445745e = iBinder;
            this.f445744d = z1Var.f445909a;
            return true;
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.battery.SystemServiceBinderHooker", "#doHook exp: " + th6.getLocalizedMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public boolean b() {
        java.lang.String str = this.f445741a;
        if (this.f445744d == null) {
            oj.j.f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mOriginServiceBinder null", new java.lang.Object[0]);
            return false;
        }
        if (this.f445745e == null) {
            oj.j.f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mDelegateServiceBinder null", new java.lang.Object[0]);
            return false;
        }
        try {
            if (this.f445745e != wh.z1.a(str)) {
                oj.j.f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mDelegateServiceBinder != currentBinder", new java.lang.Object[0]);
                return false;
            }
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((java.util.Map) declaredField.get(null)).put(str, this.f445744d);
            return true;
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.battery.SystemServiceBinderHooker", "#doUnHook exp: " + th6.getLocalizedMessage(), new java.lang.Object[0]);
            return false;
        }
    }
}
