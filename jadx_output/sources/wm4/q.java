package wm4;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm4.p f447303d;

    public q(wm4.p pVar) {
        this.f447303d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wm4.p pVar = this.f447303d;
        com.tencent.mm.plugin.topstory.ui.home.m2 wi6 = pVar.wi();
        wi6.getClass();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(pm4.w.g());
        int i17 = -1;
        if (r6Var.m()) {
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            if (G == null || G.length <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Files %s", r6Var.o());
            } else {
                int length = G.length;
                int i18 = 0;
                while (i18 < length) {
                    com.tencent.mm.vfs.r6 r6Var2 = G[i18];
                    int P = com.tencent.mm.sdk.platformtools.t8.P(r6Var2.getName(), i17);
                    if (P > 0) {
                        r45.jn6 jn6Var = new r45.jn6();
                        try {
                            byte[] N = com.tencent.mm.vfs.w6.N(r6Var2.o(), 0, i17);
                            jn6Var.parseFrom(N);
                            wi6.f175046f.put(java.lang.Integer.valueOf(P), jn6Var);
                            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put home data cache key:%d size:%d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(N.length));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "loadHomeDataCache %s", r6Var2.n());
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Decode Key Error %s", r6Var2.o());
                    }
                    i18++;
                    i17 = -1;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Exist %s", r6Var.o());
        }
        com.tencent.mm.plugin.topstory.ui.home.m2 wi7 = pVar.wi();
        wi7.getClass();
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(pm4.w.h());
        if (!r6Var3.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Exist %s", r6Var3.o());
            return;
        }
        com.tencent.mm.vfs.r6[] G2 = r6Var3.G();
        if (G2 == null || G2.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Files %s", r6Var3.o());
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var4 : G2) {
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(r6Var4.getName(), -1);
            if (P2 > 0) {
                try {
                    byte[] N2 = com.tencent.mm.vfs.w6.N(r6Var4.o(), 0, -1);
                    wi7.f175047g.put(java.lang.Integer.valueOf(P2), new java.lang.String(N2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put neg cache key:%d size:%d", java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(N2.length));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e18, "loadNegDataCache %s", r6Var4.n());
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Decode Key Error %s", r6Var4.o());
            }
        }
    }
}
