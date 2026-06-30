package cx;

/* loaded from: classes7.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx.x f224396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f224397e;

    public e0(bx.x xVar, cx.f0 f0Var) {
        this.f224396d = xVar;
        this.f224397e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc3.j0 j0Var;
        cl0.g gVar = new cl0.g();
        cx.f0 f0Var = this.f224397e;
        gVar.o("bizExist", f0Var.f224422e != null ? 1 : 0);
        cx.w0 w0Var = f0Var.f224422e;
        gVar.h("bizStatus", (w0Var == null || (j0Var = w0Var.f282995g) == null) ? null : java.lang.Integer.valueOf(((rc3.w0) j0Var).f394099t));
        gVar.r("isProcessExist", com.tencent.mm.sdk.platformtools.t8.R0(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.w9.f193059g));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        bx.x xVar = bx.x.f36231f;
        bx.x xVar2 = this.f224396d;
        if (xVar2 == xVar) {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandResortMbEnv", 1, gVar2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneThousandth.getValue());
        } else if (xVar2 == bx.x.f36232g) {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandResortMbEnv", 0, gVar2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneThousandth.getValue());
        }
    }
}
