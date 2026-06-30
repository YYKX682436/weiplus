package ei3;

/* loaded from: classes10.dex */
public class o0 implements ei3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f253114a;

    public o0(ei3.w0 w0Var) {
        this.f253114a = w0Var;
    }

    @Override // ei3.h
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "onPcmReady");
        ei3.w0 w0Var = this.f253114a;
        if (w0Var.f253176p.f253039a != ei3.l.Initialized) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
        } else {
            w0Var.f253169i.e();
            this.f253114a.f253176p.a(ei3.l.Start);
        }
    }
}
