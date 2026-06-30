package rc3;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f394043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rc3.w0 w0Var, int i17, boolean z17) {
        super(0);
        this.f394041d = w0Var;
        this.f394042e = i17;
        this.f394043f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.g0 g0Var;
        com.tencent.mars.xlog.Log.i(this.f394041d.f394105z, "canvas view " + this.f394042e + " first frame rendered");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394041d.f394091i;
        if (mBBuildConfig != null && (g0Var = mBBuildConfig.f147828r) != null) {
            g0Var.c(this.f394042e, this.f394043f);
        }
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig2 = this.f394041d.f394091i;
        if (mBBuildConfig2 != null && mBBuildConfig2.f147830t != null) {
            int i17 = this.f394042e;
            boolean z17 = this.f394043f;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewFirstFrameRendered canvasId: " + i17 + ", surfaceReady:" + z17);
            if (!z17) {
                android.util.SparseIntArray sparseIntArray = fh1.x0.M;
                synchronized (sparseIntArray) {
                    sparseIntArray.put(i17, 1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
