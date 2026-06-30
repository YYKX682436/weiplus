package fv4;

/* loaded from: classes8.dex */
public final class j extends fv4.g {

    /* renamed from: b, reason: collision with root package name */
    public final fv4.g f267016b;

    public j(fv4.g realLogic) {
        kotlin.jvm.internal.o.g(realLogic, "realLogic");
        this.f267016b = realLogic;
    }

    @Override // fv4.g
    public void a() {
        this.f267016b.a();
        this.f267005a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        return this.f267016b.b();
    }

    @Override // fv4.g
    public void c(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        this.f267016b.c(call, result);
    }

    @Override // fv4.g
    public void d(java.lang.String str) {
        this.f267016b.d(str);
    }

    @Override // fv4.g
    public void e(boolean z17) {
        this.f267016b.e(z17);
    }

    @Override // fv4.g
    public void f(fv4.i ctx) {
        fv4.i iVar;
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        fv4.i iVar2;
        tg0.c2 c2Var2;
        tg0.h2 h2Var2;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        this.f267005a = ctx;
        tg0.c2 c2Var3 = ctx.f267009c;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (c2Var3 != null && c2Var3.f419047b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, will call onUiInit");
            tg0.c1 c1Var = c2Var3.f419055j;
            if (c1Var == null || (iVar2 = this.f267005a) == null || (c2Var2 = iVar2.f267009c) == null || (h2Var2 = c2Var2.f419053h) == null) {
                return;
            }
            ((ch0.h0) h2Var2).c(-1, c1Var);
            return;
        }
        if (!(c2Var3 != null && c2Var3.f419048c)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "JS ready, do nothing");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, only notify result");
        tg0.c1 c1Var2 = c2Var3.f419055j;
        if (c1Var2 == null || (iVar = this.f267005a) == null || (c2Var = iVar.f267009c) == null || (h2Var = c2Var.f419053h) == null) {
            return;
        }
        ((ch0.h0) h2Var).a(-1, c1Var2);
    }

    @Override // fv4.g
    public void h(android.view.View flutterView) {
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        this.f267016b.h(flutterView);
    }

    @Override // fv4.g
    public void i() {
        this.f267016b.i();
    }
}
