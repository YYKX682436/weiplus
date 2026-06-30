package rc3;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f394080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rc3.w0 w0Var, int i17, int i18, int i19, int i27, int i28) {
        super(0);
        this.f394075d = w0Var;
        this.f394076e = i17;
        this.f394077f = i18;
        this.f394078g = i19;
        this.f394079h = i27;
        this.f394080i = i28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394075d;
        java.lang.String str = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view update ");
        int i17 = this.f394076e;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f394077f;
        sb6.append(i18);
        sb6.append(' ');
        int i19 = this.f394078g;
        sb6.append(i19);
        sb6.append(' ');
        int i27 = this.f394079h;
        sb6.append(i27);
        sb6.append(' ');
        int i28 = this.f394080i;
        sb6.append(i28);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = w0Var.f394091i;
        jc3.r rVar = mBBuildConfig != null ? mBBuildConfig.f147829s : null;
        jc3.p pVar = mBBuildConfig != null ? mBBuildConfig.f147830t : null;
        if (rVar != null) {
            cf3.d dVar = (cf3.d) w0Var.f394096q.get(java.lang.Integer.valueOf(i17));
            if (dVar != null) {
                dVar.f40928m = new android.graphics.Rect(i18, i19, i27 + i18, i28 + i19);
                android.os.Handler handler = dVar.f40917b;
                java.lang.Runnable runnable = dVar.f40929n;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
        } else if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewLayout canvasId: " + i17);
        } else {
            com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = (com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub) w0Var.f394095p.get(java.lang.Integer.valueOf(i17));
            if (mBSurfaceStub != null) {
                rc3.w0 w0Var2 = this.f394075d;
                w0Var2.S(new rc3.t(w0Var2, this.f394076e, mBSurfaceStub, this.f394077f, this.f394078g, this.f394079h, this.f394080i));
            }
        }
        return jz5.f0.f302826a;
    }
}
