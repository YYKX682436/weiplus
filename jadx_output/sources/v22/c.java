package v22;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f432802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f432803e;

    public c(v22.f fVar, boolean z17) {
        this.f432802d = fVar;
        this.f432803e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v22.f fVar = this.f432802d;
        boolean init = fVar.f432811c.init();
        java.lang.String str = fVar.f432809a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init encoder, outputGif: ");
        boolean z17 = this.f432803e;
        sb6.append(z17);
        sb6.append(" ret: ");
        sb6.append(init);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!init) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGifInitFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 33L, 1L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markWxamInitFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 32L, 1L);
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.f432812d = android.os.SystemClock.elapsedRealtime();
    }
}
