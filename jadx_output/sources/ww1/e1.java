package ww1;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer[] f450174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f450175e;

    public e1(android.media.MediaPlayer[] mediaPlayerArr, java.lang.Object obj) {
        this.f450174d = mediaPlayerArr;
        this.f450175e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f450174d[0] = new to.g();
        try {
            synchronized (this.f450175e) {
                this.f450175e.notify();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
        }
    }
}
