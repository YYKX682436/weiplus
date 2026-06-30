package wh2;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wh2.l f445955a = new wh2.l();

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        dn.j jVar;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePagLoader", "loadPag url:" + str + ", path:" + str2);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePagLoader", "fileExist");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(new wh2.h(str2)));
        } else {
            try {
                jVar = new dn.j();
                jVar.f241785d = "task_FinderCdnDownloader";
                java.lang.String host = new java.net.URL(str).getHost();
                int f17 = com.tencent.mm.network.n.f(host, false, new java.util.ArrayList());
                int f18 = com.tencent.mm.network.n.f(host, true, new java.util.ArrayList());
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                jVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
                jVar.D1 = str;
                jVar.E1 = host;
                jVar.G1 = str2;
                jVar.J1 = f17;
                jVar.K1 = f18;
                jVar.L1 = false;
                jVar.M1 = "" + com.tencent.mm.sdk.platformtools.v0.f193027a.c();
                jVar.N1 = "";
                jVar.P1 = 150;
                jVar.Q1 = 20201;
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePagLoader", "attachPagTaskInfo mediaId:" + jVar.field_mediaId + " imageUrl:" + str);
            } catch (java.net.MalformedURLException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLivePagLoader", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("Finder.FinderLivePagLoader", "attachPagTaskInfo fail:" + e17);
                jVar = null;
            }
            if (jVar == null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(new wh2.g(10000)));
            } else {
                jVar.f241787f = new dn.d(new wh2.j(str2, rVar));
                if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
                    rVar.m(new wh2.k(jVar));
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePagLoader", "addRecvTask failed.");
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(new wh2.g(10001)));
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
