package dk2;

/* loaded from: classes10.dex */
public final class v9 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f234241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234244g;

    public v9(dk2.ca caVar, java.lang.String str, yz5.l lVar, yz5.l lVar2) {
        this.f234241d = caVar;
        this.f234242e = str;
        this.f234243f = lVar;
        this.f234244g = lVar2;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        pm0.v.X(new dk2.u9(this.f234241d, str, i17, this.f234242e, this.f234243f, hVar, this.f234244g));
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "onDataAvailable: " + str + ", offset: " + j17 + ", length: " + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "onM3U8Ready: " + str);
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "onMoovReady: " + str + ", offset: " + j17 + ", length: " + j18);
    }
}
