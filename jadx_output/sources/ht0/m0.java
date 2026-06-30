package ht0;

/* loaded from: classes10.dex */
public class m0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284708d;

    public m0(ht0.n0 n0Var, java.lang.String str) {
        this.f284708d = str;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "BigSightFFMpegRecorder_tagRotate_after_process";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.vfs.w6.h(this.f284708d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}
