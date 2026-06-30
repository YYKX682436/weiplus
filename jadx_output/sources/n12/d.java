package n12;

/* loaded from: classes10.dex */
public final class d implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n12.e f334068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f334071g;

    public d(n12.e eVar, java.lang.String str, java.lang.String str2, kotlinx.coroutines.q qVar) {
        this.f334068d = eVar;
        this.f334069e = str;
        this.f334070f = str2;
        this.f334071g = qVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onProgress: " + j17 + " / " + j18);
        n12.a aVar = this.f334068d.f334072a;
        if (aVar != null) {
            ((kotlinx.coroutines.flow.h3) ((p12.l) aVar).f351037a).k(java.lang.Float.valueOf(((float) j17) / ((float) j18)));
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onFinish: " + str + ", result: " + i17);
        kotlinx.coroutines.q qVar = this.f334071g;
        if (i17 != 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Invalid ret: " + i17))));
            return;
        }
        java.lang.String str2 = this.f334069e;
        java.lang.String str3 = this.f334070f;
        com.tencent.mm.vfs.w6.w(str2, str3);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(str3));
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onDataAvailable: " + j17 + " / " + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onM3U8Ready");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onMoovReady");
    }
}
