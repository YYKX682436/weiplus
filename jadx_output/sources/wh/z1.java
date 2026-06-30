package wh;

/* loaded from: classes12.dex */
public final class z1 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f445909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f445910b;

    public z1(java.lang.String str, java.lang.String str2, wh.a2 a2Var) {
        android.os.IBinder a17 = a(str);
        this.f445909a = a17;
        java.lang.Class<?> cls = java.lang.Class.forName(str2);
        java.lang.Class<?> cls2 = java.lang.Class.forName(str2 + "$Stub");
        java.lang.ClassLoader classLoader = cls2.getClassLoader();
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("get service manager ClassLoader fail!");
        }
        this.f445910b = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{android.os.IBinder.class, android.os.IInterface.class, cls}, new wh.y1(a2Var, cls2.getDeclaredMethod("asInterface", android.os.IBinder.class).invoke(null, a17)));
    }

    public static android.os.IBinder a(java.lang.String str) {
        return (android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", java.lang.String.class).invoke(null, str);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return "queryLocalInterface".equals(method.getName()) ? this.f445910b : method.invoke(this.f445909a, objArr);
    }
}
