package k53;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f304333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f304335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k53.f f304336h;

    public b(k53.f fVar, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f304336h = fVar;
        this.f304332d = str;
        this.f304333e = j17;
        this.f304334f = j18;
        this.f304335g = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideo.MMVideoView mMVideoView = this.f304336h.f304357d.f304358d;
        if (mMVideoView != null) {
            mMVideoView.e0(this.f304332d, this.f304333e, this.f304334f, this.f304335g.svrFlag);
        }
    }
}
