package t36;

/* loaded from: classes13.dex */
public class i extends t36.k {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f415453c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f415454d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f415455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f415456f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f415457g;

    public i(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2) {
        this.f415453c = method;
        this.f415454d = method2;
        this.f415455e = method3;
        this.f415456f = cls;
        this.f415457g = cls2;
    }

    @Override // t36.k
    public void a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f415455e.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to remove alpn", e17);
        }
    }

    @Override // t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        try {
            this.f415453c.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(t36.k.class.getClassLoader(), new java.lang.Class[]{this.f415456f, this.f415457g}, new t36.h(t36.k.b(list))));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to set alpn", e17);
        }
    }

    @Override // t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            t36.h hVar = (t36.h) java.lang.reflect.Proxy.getInvocationHandler(this.f415454d.invoke(null, sSLSocket));
            boolean z17 = hVar.f415451b;
            if (!z17 && hVar.f415452c == null) {
                t36.k.f415461a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z17) {
                return null;
            }
            return hVar.f415452c;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to get selected protocol", e17);
        }
    }
}
