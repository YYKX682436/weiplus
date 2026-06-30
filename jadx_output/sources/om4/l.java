package om4;

/* loaded from: classes.dex */
public class l implements java.lang.Runnable {
    public l(om4.m mVar, om4.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard ftsrecommendVideo folder %b", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(lp0.b.D() + "ftsrecommendVideo/", true)));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard topstory folder %b", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(lp0.b.D() + "topstory/", true)));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard cache topstory folder %b", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir() + "topstory/", true)));
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(pm4.w.i());
        if (!r6Var.m()) {
            com.tencent.mm.vfs.w6.u(pm4.w.i());
            com.tencent.mm.vfs.w6.u(pm4.w.i() + ".nomedia/");
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStory", "Create TopStoryCacheFolder");
            return;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete Cache File %s %b", r6Var2.o(), java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(r6Var2.o(), true)));
            }
        }
        com.tencent.mm.vfs.w6.u(pm4.w.i() + ".nomedia/");
    }
}
