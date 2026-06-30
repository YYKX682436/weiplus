package j00;

/* loaded from: classes9.dex */
public final class s0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296884b;

    public s0(j00.k1 k1Var) {
        this.f296884b = k1Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "onEnterBackground");
        j00.k1 k1Var = this.f296884b;
        java.lang.Runnable task = k1Var.f296817n;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.n3 n3Var = k1Var.f296814h;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.postDelayed(task, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "onExitBackground");
        this.f296884b.f296814h.removeCallbacksAndMessages(null);
    }
}
