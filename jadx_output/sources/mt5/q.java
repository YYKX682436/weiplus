package mt5;

/* loaded from: classes8.dex */
public class q implements lt5.a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Object f331328c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Class f331329d;

    /* renamed from: a, reason: collision with root package name */
    public int f331330a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f331331b = "";

    @Override // lt5.a
    public synchronized lt5.f a(android.content.Context context) {
        this.f331330a = 0;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.id.impl.IdProviderImpl");
            f331329d = cls;
            try {
                f331328c = cls.newInstance();
                try {
                    java.lang.reflect.Method method = f331329d.getMethod(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, android.content.Context.class);
                    java.lang.Object obj = f331328c;
                    if (obj != null && method != null) {
                        try {
                            java.lang.Object invoke = method.invoke(obj, context);
                            if (invoke != null) {
                                this.f331331b = (java.lang.String) invoke;
                            } else {
                                this.f331330a = -305;
                            }
                        } catch (java.lang.Throwable unused) {
                            this.f331330a = -306;
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                    return lt5.f.a(-304);
                }
            } catch (java.lang.IllegalAccessException unused3) {
                return lt5.f.a(org.chromium.net.NetError.ERR_INVALID_REDIRECT);
            } catch (java.lang.InstantiationException unused4) {
                return lt5.f.a(org.chromium.net.NetError.ERR_UNKNOWN_URL_SCHEME);
            }
        } catch (java.lang.Throwable unused5) {
            return lt5.f.a(org.chromium.net.NetError.ERR_DISALLOWED_URL_SCHEME);
        }
        return new lt5.f(this.f331331b, this.f331330a);
    }
}
