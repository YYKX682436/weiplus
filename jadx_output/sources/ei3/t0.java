package ei3;

/* loaded from: classes10.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253123d;

    public t0(ei3.w0 w0Var, java.lang.String str) {
        this.f253123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.vfs.w6.h(this.f253123d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}
