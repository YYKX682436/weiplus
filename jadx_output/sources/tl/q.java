package tl;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.r f420090d;

    public q(tl.r rVar) {
        this.f420090d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "auto stop Timer");
        this.f420090d.d();
    }
}
