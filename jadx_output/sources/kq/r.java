package kq;

/* loaded from: classes13.dex */
public class r implements kq.p {

    /* renamed from: b, reason: collision with root package name */
    public static kq.o f311227b;

    /* renamed from: a, reason: collision with root package name */
    public kq.q f311228a = null;

    @Override // kq.p
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("WXFileDownloaderBridge", "onTaskFinished url=" + str + ", save_path=" + str2);
        ((oe1.b) this.f311228a).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskSucc save_path = %s, url = %s, is_resume = %s", str2, str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83524d.c(str, true);
        java.util.Map map = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83523c;
        if (map != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
            if (concurrentHashMap.get(str) != null && ((oe1.a) concurrentHashMap.get(str)).f344692e != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f) ((oe1.a) concurrentHashMap.get(str)).f344692e).a(str, str2);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskSucc callback is null");
    }

    @Override // kq.p
    public void b(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("WXFileDownloaderBridge", "onTaskFailed, url=" + str + ", errCode=" + i17);
        ((oe1.b) this.f311228a).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskFail err_code = %s, url = %s,is_resume = %s", java.lang.Integer.valueOf(i17), str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83524d.c(str, false);
        java.util.Map map = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83523c;
        if (map != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
            if (concurrentHashMap.get(str) != null && ((oe1.a) concurrentHashMap.get(str)).f344692e != null) {
                com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f fVar = (com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f) ((oe1.a) concurrentHashMap.get(str)).f344692e;
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadFail err_code = %s, url = %s", java.lang.Integer.valueOf(i17), str);
                fVar.f83618b.C(fVar.f83617a, str, -5, i17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskFail callback is null");
    }

    @Override // kq.p
    public void c(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("WXFileDownloaderBridge", "onTaskProgressChanged, url=" + str + ", cur_size:" + j17 + ", total_size:" + j18);
        this.f311228a.getClass();
    }
}
