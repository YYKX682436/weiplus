package pv1;

/* loaded from: classes13.dex */
public class c implements rx5.a {

    /* renamed from: c, reason: collision with root package name */
    public static pv1.c f358569c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f358570a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final dn.k f358571b = new pv1.a(this);

    public static void a(pv1.c cVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) cVar.f358570a;
        com.tencent.mars.xlog.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "updateDownloadState, mediaId:%s, state:%d, errCode:%d, errMsg:%s, containCallback:%b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            rx5.b bVar = ((pv1.b) concurrentHashMap.get(str)).f358567a;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("XWeb.MM.FileDownloaderXWEBProxy", "updateDownloadState, proxy_callback is null");
            } else if (i17 == 3) {
                bVar.a(str, ((pv1.b) concurrentHashMap.get(str)).f358568b, z17);
            } else {
                bVar.b(str, i18, z17);
            }
        }
    }
}
