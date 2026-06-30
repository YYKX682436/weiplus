package w42;

/* loaded from: classes7.dex */
public class a implements w42.b {

    /* renamed from: a, reason: collision with root package name */
    public com.eclipsesource.mmv8.V8 f442889a;

    public a() {
        try {
            ((et.o) ((e42.y) i95.n0.c(e42.y.class))).getClass();
            com.tencent.mm.plugin.appbrand.jsruntime.n0.b();
            this.f442889a = com.eclipsesource.mmv8.V8.createV8Runtime();
            t42.a.h(true);
        } catch (java.lang.Throwable th6) {
            t42.a.h(false);
            com.tencent.mars.xlog.Log.e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] init V8 fail for : %s", th6.getMessage());
        }
    }
}
