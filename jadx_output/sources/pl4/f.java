package pl4;

/* loaded from: classes15.dex */
public final class f extends pl4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f356709d;

    public f(pl4.k kVar) {
        this.f356709d = kVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        pl4.k kVar = this.f356709d;
        if (kotlin.jvm.internal.o.b(str, kVar.f356718b)) {
            kVar.g();
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "onMoovReady filekey:" + str + " onProgress offset:" + j17 + ", length:" + j18);
        pl4.k kVar = this.f356709d;
        if (kotlin.jvm.internal.o.b(str, kVar.f356718b)) {
            kVar.f356729m = true;
            kVar.f356733q.execute(new pl4.e(kVar));
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onObtainMoovFailed(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "onObtainMoovFailed filekey:" + str + " onProgress reason:" + i17);
        pl4.k kVar = this.f356709d;
        if (kotlin.jvm.internal.o.b(str, kVar.f356718b)) {
            kVar.f356729m = true;
            kVar.b();
            kVar.g();
        }
    }
}
