package cx;

/* loaded from: classes7.dex */
public final class a1 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224369b;

    public a1(cx.j1 j1Var) {
        this.f224369b = j1Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        java.lang.String pj6;
        cx.j1 j1Var = this.f224369b;
        pj6 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj6, "hy: onEnterBackground");
        java.lang.Runnable task = j1Var.f224428n;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.n3 n3Var = j1Var.f224427m;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.postDelayed(task, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        java.lang.String pj6;
        cx.j1 j1Var = this.f224369b;
        pj6 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj6, "hy: onExitBackground");
        j1Var.f224427m.removeCallbacksAndMessages(null);
    }
}
