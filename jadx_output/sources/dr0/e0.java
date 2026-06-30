package dr0;

/* loaded from: classes12.dex */
public final class e0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242419b;

    public e0(dr0.t0 t0Var) {
        this.f242419b = t0Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "deepBg=true");
        this.f242419b.i().setAccDeepBgCount(this.f242419b.i().getAccDeepBgCount() + 1);
        if (this.f242419b.f242541a) {
            dr0.a3 a17 = dr0.a3.f242403d.a();
            a17.getClass();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                dr0.x0 x0Var = dr0.x0.f242571a;
                x0Var.c("RECYCLE_DEEP_BG", "check");
                if (dr0.j2.f242440b.a()) {
                    ((ku5.t0) ku5.t0.f312615d).g(new dr0.w2(a17));
                    return;
                }
                boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
                java.lang.String str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                java.lang.String str2 = !n17 ? "abort: not-main" : !a17.m() ? "abort: not-support" : !com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() ? ih.d.c() ? "abort: fg" : com.tencent.mm.app.w.INSTANCE.f53889n ? "abort: fg-legacy" : "abort skip: matrix-fg but legacy-bg" : com.eclipsesource.mmv8.Platform.UNKNOWN;
                if (a17.k()) {
                    dr0.p1 a18 = dr0.p1.f242489d.a();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    a18.getClass();
                    if (!com.tencent.mm.booter.o.f(context)) {
                        str = "supported NO: ignoreBattOpt=false";
                    } else if (a17.g()) {
                        str = "supported YES: hasDebugger";
                    } else if (android.os.Build.VERSION.SDK_INT >= 30 && !a17.j()) {
                        str = "supported NO: forced splash logo";
                    } else if (!a17.l()) {
                        str = "supported NO: ban model";
                    }
                } else {
                    str = "supported NO: disabled";
                }
                x0Var.c("RECYCLE_DEEP_BG", "check-fail", "notSupported", str2, str);
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "deepBg=false");
        this.f242419b.f242541a = true;
    }
}
