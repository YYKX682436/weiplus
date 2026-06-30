package ht0;

/* loaded from: classes10.dex */
public class n implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.s f284709a;

    public n(ht0.s sVar) {
        this.f284709a = sVar;
    }

    @Override // ei3.h
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] onPcmReady");
        ei3.e1 e1Var = this.f284709a.f284767o;
        if (e1Var.f253039a == ei3.l.Initialized) {
            e1Var.a(ei3.l.Start);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] not MediaStatus.Initialized, maybe canceled by user");
    }
}
