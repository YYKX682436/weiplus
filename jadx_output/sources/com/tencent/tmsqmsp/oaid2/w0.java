package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class w0 implements com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.Class f215678b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Object f215679c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.reflect.Method f215680d;

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f215681a;

    public w0() {
        try {
            com.tencent.tmsqmsp.oaid2.t0.b("xm start");
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.id.impl.IdProviderImpl");
            f215678b = cls;
            f215679c = cls.newInstance();
            f215680d = f215678b.getMethod(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, android.content.Context.class);
            f215678b.getMethod("getAAID", android.content.Context.class);
        } catch (java.lang.Exception e17) {
            com.tencent.tmsqmsp.oaid2.t0.c("xm reflect exception!".concat(java.lang.String.valueOf(e17)));
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215681a = context;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        return null;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return (f215678b == null || f215679c == null) ? false : true;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        java.lang.reflect.Method method;
        java.lang.Object obj = f215679c;
        if (obj == null || (method = f215680d) == null) {
            return null;
        }
        return a(this.f215681a, obj, method);
    }

    private java.lang.String a(android.content.Context context, java.lang.Object obj, java.lang.reflect.Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            java.lang.Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (java.lang.String) invoke;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
