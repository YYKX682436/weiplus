package ud;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f426567a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.t f426568b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.magicbrush.MagicBrush f426569c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.magicbrush.a f426570d;

    /* renamed from: e, reason: collision with root package name */
    public final ud.d f426571e;

    public g(android.content.Context androidContext, com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime) {
        kotlin.jvm.internal.o.g(androidContext, "androidContext");
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        this.f426567a = androidContext;
        this.f426568b = jsRuntime;
        this.f426570d = new com.tencent.magicbrush.a();
        this.f426571e = new ud.d(new ud.e(this));
    }

    public final com.tencent.magicbrush.MagicBrush a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        d(this.f426570d);
        com.tencent.magicbrush.MagicBrush h17 = this.f426570d.h();
        kotlin.jvm.internal.o.d(h17);
        synchronized (this) {
            if (!(this.f426569c == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            this.f426569c = h17;
        }
        e(h17, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        return h17;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrush", "destroy");
        ((com.tencent.mm.plugin.appbrand.jsruntime.y) this.f426568b.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.f426571e);
    }

    public void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        wd.g.f444684a.a(this.f426569c, runtime, true);
    }

    public void d(com.tencent.magicbrush.a builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        builder.f48599a = this.f426567a;
        float f17 = ik1.w.f();
        f06.v[] vVarArr = com.tencent.magicbrush.c0.I;
        builder.f48602d.b(builder, vVarArr[0], java.lang.Float.valueOf(f17));
        com.tencent.mm.plugin.appbrand.jsruntime.t tVar = this.f426568b;
        builder.f48601c = new ud.f((com.tencent.mm.plugin.appbrand.jsruntime.l0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class));
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("JsRuntime don't support JsThread addon".toString());
        }
        builder.f48600b = new ud.a(f0Var);
        yg.f0 imageHandler = builder.f48606h;
        kotlin.jvm.internal.o.g(imageHandler, "$this$imageHandler");
        imageHandler.f462055a = true;
        imageHandler.f462057c = new wd.f(14883);
        imageHandler.f462058d = null;
        java.lang.String D = lp0.b.D();
        kotlin.jvm.internal.o.f(D, "DATAROOT_SDCARD_PATH(...)");
        builder.f48615q.b(builder, vVarArr[8], D);
    }

    public void e(com.tencent.magicbrush.MagicBrush magicbrush, long j17) {
        kotlin.jvm.internal.o.g(magicbrush, "magicbrush");
    }
}
