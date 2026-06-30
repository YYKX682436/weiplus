package p10;

/* loaded from: classes7.dex */
public final class e0 extends com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI f350944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI) {
        super(magicEcsNirvanaUI, null, 0);
        this.f350944m = magicEcsNirvanaUI;
    }

    @Override // zq0.a, xq0.d
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view surface available, isCanvasFirstFrameRendered: ");
        com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI = this.f350944m;
        sb6.append(magicEcsNirvanaUI.f65846r);
        com.tencent.mars.xlog.Log.i("MagicCanvasViewContainer", sb6.toString());
        if (magicEcsNirvanaUI.f65846r) {
            magicEcsNirvanaUI.X6();
        }
    }

    @Override // zq0.a, xq0.d
    public void c(int i17, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f350944m.f65836e;
        com.tencent.mars.xlog.Log.i("MagicCanvasViewContainer", "canvas view first frame rendered, cost time: " + currentTimeMillis + "ms, surfaceReady: " + z17);
        p10.c0 c0Var = this.f350944m.f65838g;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("loadingComponent");
            throw null;
        }
        c0Var.a();
        this.f350944m.f65846r = true;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MagicCanvasViewContainer", "first frame rendered but surface not ready, redraw canvas");
            this.f350944m.X6();
        }
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUILaunchResult;
        ((ku5.t0) ku5.t0.f312615d).h(new q10.o(this.f350944m.f65842n, d5Var, 0), "MicroMsg.EcsNirvanaReportUtil");
        ((ku5.t0) ku5.t0.f312615d).h(new q10.o(this.f350944m.f65842n, bw5.d5.EcsNirvanaLaunchTime, (int) currentTimeMillis), "MicroMsg.EcsNirvanaReportUtil");
    }

    @Override // zq0.a, xq0.d
    public boolean isValid() {
        return this.f350944m.f65837f;
    }
}
