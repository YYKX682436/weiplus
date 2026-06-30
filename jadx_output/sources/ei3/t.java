package ei3;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.u f253122d;

    public t(ei3.u uVar) {
        this.f253122d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.u uVar = this.f253122d;
        try {
            uVar.h();
            uVar.m();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder error: %s", e17.getMessage());
        }
    }
}
