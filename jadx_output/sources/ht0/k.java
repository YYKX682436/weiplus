package ht0;

/* loaded from: classes10.dex */
public class k implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f284704d;

    public k(ht0.s sVar) {
        this.f284704d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecGLInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 15L, 1L);
        }
        java.lang.Object obj2 = ht0.s.f284751a0;
        synchronized (obj2) {
            try {
                this.f284704d.V = true;
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e17, "[" + hashCode() + "] initSurfaceLock notify error", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
