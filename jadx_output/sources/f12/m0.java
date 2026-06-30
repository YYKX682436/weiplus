package f12;

/* loaded from: classes4.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f258641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f258644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f258645h;

    public m0(f12.o0 o0Var, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f258641d = o0Var;
        this.f258642e = str;
        this.f258643f = j17;
        this.f258644g = j18;
        this.f258645h = videoInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f258641d.f258659g;
        kotlin.jvm.internal.o.d(h0Var);
        java.lang.String str = this.f258642e;
        long j17 = this.f258643f;
        long j18 = this.f258644g;
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f258645h;
        java.lang.String str2 = videoInfo != null ? videoInfo.svrFlag : null;
        if (str2 == null) {
            str2 = "";
        }
        ((com.tencent.mm.modelvideo.MMVideoView) h0Var).e0(str, j17, j18, str2);
    }
}
