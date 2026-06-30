package hl1;

/* loaded from: classes7.dex */
public final class d extends hl1.b {

    /* renamed from: e, reason: collision with root package name */
    public float f282089e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f282090f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f282091g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f282092h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.appbrand.o6 runtime, int i17) {
        super(runtime, i17);
        kotlin.jvm.internal.o.g(runtime, "runtime");
    }

    @Override // hl1.b, hl1.h
    public void c() {
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(this.f282081b.f74803n);
        if (d17 == com.tencent.mm.plugin.appbrand.w0.HOME_PRESSED || d17 == com.tencent.mm.plugin.appbrand.w0.RECENT_APPS_PRESSED || d17 == com.tencent.mm.plugin.appbrand.w0.LAUNCH_NATIVE_PAGE || d17 == com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM) {
            return;
        }
        android.graphics.Bitmap bitmap = this.f282090f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f282090f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    @Override // hl1.b, hl1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Canvas r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.d.f(android.graphics.Canvas, android.view.View):void");
    }

    @Override // hl1.b, hl1.h
    public android.view.View g() {
        mi1.v vVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f282081b;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = null;
        try {
            com.tencent.mm.plugin.appbrand.hc hcVar = o6Var.f74796e;
            if (hcVar != null) {
                appBrandRuntime = hcVar.i(o6Var);
            }
        } catch (java.lang.Throwable unused) {
        }
        return (appBrandRuntime == null || (vVar = appBrandRuntime.f74821z) == null) ? o6Var.f74810s : vVar.c();
    }

    @Override // hl1.b
    public void i(int i17, int i18, long j17, android.animation.ValueAnimator animation) {
        float intValue;
        kotlin.jvm.internal.o.g(animation, "animation");
        if (i17 - i18 == 0) {
            intValue = 1.0f;
        } else {
            kotlin.jvm.internal.o.e(animation.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
            intValue = (((java.lang.Integer) r3).intValue() - i17) / (i18 - i17);
        }
        this.f282089e = intValue;
    }

    @Override // hl1.b, hl1.h
    public hl1.g type() {
        return hl1.g.f282096f;
    }
}
