package pj0;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes11.dex */
public class f extends i95.w implements com.tencent.mm.matrix.dice.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f354925d = "GPU_MEMORY_OPENGL_HOOK";

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        long Ui;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (o45.wf.f343033k) {
            Ui = 1;
        } else {
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_gpu_opengl_hook_open_sample, 100000000L);
        }
        if (Ui > 0) {
            return 1.0d / Ui;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GpuResService", "denominator <= -0L, does not need to rate()");
        return -1.0d;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_gpu_process_open, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.GpuResService", "openGpuProcess = " + fj6);
        if (fj6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GpuResService", "sample success & do action");
            ((ku5.t0) ku5.t0.f312615d).g(new pj0.e(this));
        }
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return 0L;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return this.f354925d;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 29 || i17 == 30) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_background_graphic_release_v2", "1", false, true), 0);
            com.tencent.mars.xlog.Log.e("MicroMsg.GpuResService", "[OpenglLeakPlugin: graphic_release open = %d]", java.lang.Integer.valueOf(P));
            if (P > 0) {
                if (!s63.b.f403413g) {
                    s63.b.f403413g = true;
                    com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.observeForever(s63.b.f403412f);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.GpuResService", "[OpenglLeakPlugin: GraphicCacheRelease start success, processName = %s]", bm5.f1.a());
            }
        }
    }
}
