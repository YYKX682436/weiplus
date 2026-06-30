package hw;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f285379b;

    public g0(hw.o0 o0Var) {
        this.f285379b = o0Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        java.lang.String ij6;
        hw.o0 o0Var = this.f285379b;
        ij6 = o0Var.ij();
        com.tencent.mars.xlog.Log.i(ij6, "hy: onEnterBackground");
        java.lang.Runnable task = o0Var.f285415n;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.n3 n3Var = o0Var.f285414m;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.postDelayed(task, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        java.lang.String ij6;
        hw.o0 o0Var = this.f285379b;
        ij6 = o0Var.ij();
        com.tencent.mars.xlog.Log.i(ij6, "hy: onExitBackground");
        o0Var.f285414m.removeCallbacksAndMessages(null);
    }
}
