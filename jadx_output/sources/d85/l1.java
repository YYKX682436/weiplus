package d85;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.reflect.InvocationHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final d85.k1 f227214c = new d85.k1(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f227215a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f227216b;

    public l1(java.lang.String str, java.lang.String str2, d85.m1 m1Var) {
        try {
            d85.k1 k1Var = f227214c;
            android.os.IBinder b17 = k1Var.b(str);
            this.f227215a = b17;
            this.f227216b = d85.k1.a(k1Var, str, str2, b17, m1Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("SystemServiceBinderHooker", "catch exception on init, e:" + th6.getMessage());
        }
    }

    public final android.os.IBinder a() {
        java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("Can not get ClassLoader of ".concat(cls.getName()));
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{android.os.IBinder.class}, this);
        kotlin.jvm.internal.o.e(newProxyInstance, "null cannot be cast to non-null type android.os.IBinder");
        return (android.os.IBinder) newProxyInstance;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(proxy, "proxy");
        kotlin.jvm.internal.o.g(method, "method");
        if (kotlin.jvm.internal.o.b("queryLocalInterface", method.getName())) {
            return this.f227216b;
        }
        android.os.IBinder iBinder = this.f227215a;
        return objArr == null ? method.invoke(iBinder, new java.lang.Object[0]) : method.invoke(iBinder, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
