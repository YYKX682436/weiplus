package ei3;

/* loaded from: classes10.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253058d;

    public i0(ei3.j0 j0Var, java.lang.String str) {
        this.f253058d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.vfs.w6.h(this.f253058d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}
