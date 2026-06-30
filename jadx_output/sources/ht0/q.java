package ht0;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284750d;

    public q(ht0.s sVar, java.lang.String str) {
        this.f284750d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.vfs.w6.h(this.f284750d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, delete old file error: %s", e17.getMessage());
        }
    }
}
