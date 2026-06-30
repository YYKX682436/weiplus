package sf5;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final sf5.a f407628d = new sf5.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(invoke);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.app.Instrumentation");
        android.app.Instrumentation instrumentation = (android.app.Instrumentation) obj;
        java.lang.String str = "rawInstrumentation=" + instrumentation;
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj2 = java.util.Arrays.copyOf(objArr, 0);
            kotlin.jvm.internal.o.g(obj2, "obj");
            com.tencent.mars.xlog.Log.i("ActivityLifecycleInjector", str, obj2);
        }
        return instrumentation;
    }
}
