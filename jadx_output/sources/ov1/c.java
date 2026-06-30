package ov1;

/* loaded from: classes13.dex */
public class c implements kq.o {

    /* renamed from: c, reason: collision with root package name */
    public static ov1.c f349164c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f349165a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final dn.k f349166b = new ov1.a(this);

    public static void b(ov1.c cVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) cVar.f349165a;
        com.tencent.mars.xlog.Log.i("FileDownloaderWAGameProxy", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((ov1.b) concurrentHashMap.get(str)).f349162a;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("FileDownloaderWAGameProxy", "error proxy_callback null");
            } else if (i17 == 3) {
                pVar.a(str, ((ov1.b) concurrentHashMap.get(str)).f349163b, z17);
            } else {
                pVar.b(str, i18, z17);
            }
        }
    }

    @Override // kq.o
    public int a(java.lang.String str, java.lang.String str2, int i17, kq.p pVar) {
        com.tencent.mars.xlog.Log.i("FileDownloaderWAGameProxy", "addDownloadTask: %s filepath:%s", str, str2);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FileDownloaderWAGameProxy";
        mVar.field_mediaId = str;
        mVar.field_fullpath = str2;
        mVar.f241811z = str;
        mVar.field_fileType = 50001;
        mVar.f241787f = this.f349166b;
        mVar.A = 60;
        mVar.B = 600;
        mVar.C = false;
        ov1.b bVar = new ov1.b(this, null);
        bVar.f349162a = pVar;
        bVar.f349163b = str2;
        ((java.util.concurrent.ConcurrentHashMap) this.f349165a).put(str, bVar);
        int b17 = hv1.d.f().b(mVar);
        com.tencent.mars.xlog.Log.i("FileDownloaderWAGameProxy", "addDownloadTask: " + b17);
        return b17;
    }
}
