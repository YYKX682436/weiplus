package fn4;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f264494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f264495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.base.b f264496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f264497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264498h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f264499i;

    public e1(fn4.i1 i1Var, long j17, long j18, com.tencent.mm.plugin.sight.base.b bVar, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo, java.lang.String str) {
        this.f264499i = i1Var;
        this.f264494d = j17;
        this.f264495e = j18;
        this.f264496f = bVar;
        this.f264497g = videoInfo;
        this.f264498h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.b bVar;
        fn4.i1 i1Var = this.f264499i;
        fn4.l1 l1Var = i1Var.f264557f;
        if (l1Var.f264573b == null || (bVar = l1Var.f264581j) == null) {
            return;
        }
        rm4.d dVar = bVar.o4().f264479f;
        if (dVar != null && dVar.f397465n == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - dVar.f397452a;
            dVar.f397465n = currentTimeMillis;
            long j17 = this.f264494d;
            dVar.f397466o = j17;
            long j18 = this.f264495e;
            dVar.f397467p = j17 + j18;
            dVar.f397473v = this.f264496f;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onMoovReady %d %d %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f264497g;
        i1Var.f264557f.f264573b.e0(this.f264498h, this.f264494d, this.f264495e, videoInfo != null ? videoInfo.svrFlag : "");
    }
}
