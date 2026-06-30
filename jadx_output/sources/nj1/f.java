package nj1;

/* loaded from: classes5.dex */
public final class f implements sh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337820b;

    public f(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f337819a = h0Var;
        this.f337820b = h0Var2;
    }

    @Override // sh1.g
    public void a(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17;
        if (i17 > 4096) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "width:" + f0Var.f310116d + " exceed the limit.");
            f0Var.f310116d = 4096;
        }
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = i18;
        if (i18 > 4096) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "height:" + f0Var2.f310116d + " exceed the limit.");
            f0Var2.f310116d = 4096;
        }
        ik1.h0.b(new nj1.d(f0Var, f0Var2, this.f337819a, this.f337820b));
    }

    @Override // sh1.g
    public void b(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "operateWithParams params:".concat(params));
    }

    @Override // sh1.g
    public void c(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        ik1.h0.b(new nj1.c(this.f337820b, this.f337819a, params));
    }

    @Override // sh1.g
    public void d(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        ik1.h0.b(new nj1.e(params, this.f337819a, this.f337820b));
    }

    @Override // sh1.g
    public void onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
    }

    @Override // sh1.g
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "pause");
    }

    @Override // sh1.g
    public void resume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "resume");
    }
}
