package ht0;

/* loaded from: classes10.dex */
public class f0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f284693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f284694e;

    public f0(ht0.o0 o0Var, java.lang.Runnable runnable) {
        this.f284694e = o0Var;
        this.f284693d = runnable;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MMSightFFMpegRecorder_stop";
    }

    @Override // java.lang.Runnable
    public void run() {
        ht0.n0 n0Var;
        ht0.n0 n0Var2;
        ht0.o0 o0Var = this.f284694e;
        java.lang.Runnable runnable = this.f284693d;
        o0Var.f284725c.a(ei3.l.WaitStop);
        ei3.y0 y0Var = o0Var.f284724b;
        if (y0Var != null) {
            int i17 = y0Var.f253191a;
            float a17 = (y0Var.f253192b * 1000.0f) / ((float) o0Var.f284724b.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o0Var.f284724b.f253192b), java.lang.Long.valueOf(o0Var.f284724b.a()), java.lang.Float.valueOf(a17));
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, accumulatePauseTime:%s", java.lang.Long.valueOf(o0Var.K));
            int a18 = (int) o0Var.f284724b.a();
            o0Var.f284730h = a18;
            long j17 = o0Var.K;
            if (j17 > 0) {
                o0Var.f284730h = (int) (a18 - j17);
            }
            o0Var.f284731i = a17;
            o0Var.f284724b.b();
            ht0.n0 n0Var3 = o0Var.f284726d;
            if (n0Var3 != null) {
                n0Var3.f284712g = a17;
                n0Var3.f284713h = o0Var.f284730h;
                n0Var3.f284719q = runnable;
                n0Var3.f284714i = true;
                n0Var3.b();
            }
        }
        ht0.a aVar = o0Var.f284723a;
        if (aVar != null && !o0Var.f284722J) {
            aVar.f(new ht0.g0(o0Var));
        } else if (o0Var.M && (n0Var = o0Var.f284726d) != null) {
            n0Var.f284715m = true;
        }
        o0Var.f284725c.a(ei3.l.Stop);
        o0Var.F = uk.k.b(o0Var.f284729g);
        if (o0Var.f284726d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "encodeRunnable is null!, directly call stopcallback");
            o0Var.reset();
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
        if (!o0Var.f284722J || (n0Var2 = o0Var.f284726d) == null) {
            return;
        }
        n0Var2.f284715m = true;
    }
}
