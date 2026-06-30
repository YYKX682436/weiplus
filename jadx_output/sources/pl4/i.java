package pl4;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f356713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f356714e;

    public i(pl4.k kVar, boolean z17) {
        this.f356713d = kVar;
        this.f356714e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl4.k kVar = this.f356713d;
        boolean z17 = this.f356714e;
        synchronized (kVar.f356721e) {
            if (kVar.f356727k) {
                kVar.f356729m = false;
                kVar.f356727k = false;
                kVar.f356731o = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "stopDownload " + kVar.f356718b);
                if (z17) {
                    com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor eKeyDecryptor = kVar.f356722f;
                    kVar.f356722f = null;
                    if (eKeyDecryptor != null) {
                        eKeyDecryptor.a();
                    }
                }
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(kVar.f356718b);
            }
        }
    }
}
