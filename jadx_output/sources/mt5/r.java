package mt5;

/* loaded from: classes8.dex */
public class r implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f331332a = new java.util.concurrent.atomic.AtomicReference();

    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        java.lang.String str;
        synchronized (this.f331332a) {
            if (this.f331332a.get() == null) {
                try {
                    java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName("android.app.ZteDeviceIdentifyManager").getDeclaredConstructor(android.content.Context.class);
                    declaredConstructor.setAccessible(true);
                    this.f331332a.set(declaredConstructor.newInstance(context));
                } catch (java.lang.Throwable unused) {
                    return new lt5.f(null, -10);
                }
            }
        }
        java.lang.Object obj = this.f331332a.get();
        if (obj == null) {
            return new lt5.f(null, -10);
        }
        try {
            str = (java.lang.String) obj.getClass().getMethod(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused2) {
            str = null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            return new lt5.f(str, 0);
        }
        try {
            str = (java.lang.String) obj.getClass().getMethod(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, android.content.Context.class).invoke(obj, context);
        } catch (java.lang.Throwable unused3) {
        }
        return !android.text.TextUtils.isEmpty(str) ? new lt5.f(str, 0) : new lt5.f(null, -10);
    }
}
