package j00;

/* loaded from: classes9.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296803d;

    public j0(java.lang.String str) {
        this.f296803d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long p17 = c01.w9.p();
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, currentTime:" + p17);
            w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
            java.lang.String str = this.f296803d;
            int i17 = h20.c.f278263a;
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, ret:" + wi6.z0(str, 0, 0, p17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsGiftMsgService", e17, "clearEcsGiftRedLabel db error", new java.lang.Object[0]);
        }
    }
}
