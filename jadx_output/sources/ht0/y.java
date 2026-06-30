package ht0;

/* loaded from: classes10.dex */
public class y implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f284781a;

    public y(ht0.c0 c0Var) {
        this.f284781a = c0Var;
    }

    @Override // ei3.h
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "onPcmReady");
        ei3.e1 e1Var = this.f284781a.f284678p;
        if (e1Var.f253039a != ei3.l.Initialized) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Media.X264MP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
        } else {
            e1Var.a(ei3.l.Start);
        }
    }
}
