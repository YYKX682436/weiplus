package ht0;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f284692d;

    public f(ht0.s sVar) {
        this.f284692d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "frame to stop timeout");
        ht0.s sVar = this.f284692d;
        sVar.f284767o.f253039a = ei3.l.WaitStop;
        ls0.k kVar = sVar.I;
        ht0.d dVar = new ht0.d(this);
        kVar.getClass();
        kVar.d(new ls0.h(dVar));
    }
}
