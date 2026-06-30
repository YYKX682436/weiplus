package hv1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.g f285267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f285268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f285269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hv1.d f285270h;

    public b(hv1.d dVar, java.lang.String str, dn.g gVar, boolean z17, dn.h hVar) {
        this.f285270h = dVar;
        this.f285266d = str;
        this.f285267e = gVar;
        this.f285268f = z17;
        this.f285269g = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv1.d dVar = this.f285270h;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) dVar.f285277f;
        java.lang.String str = this.f285266d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.g gVar = this.f285267e;
        if (gVar != null) {
            gVar.f241764a = str;
            java.lang.Long valueOf = java.lang.Long.valueOf(gVar.field_toltalLength);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(gVar.field_finishedLength);
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(gVar.field_mtlnotify);
            java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(mVar.f241786e);
            java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(gVar.field_isUploadTask);
            boolean z17 = this.f285268f;
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "MTL: total:%d, cur:%d, mtl:%b, isSend:%b, isUploadTask:%b(%b)", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Boolean.valueOf(z17));
            if (z17 != mVar.f241786e) {
                return;
            }
        }
        dn.h hVar = this.f285269g;
        if (hVar != null) {
            hVar.f241766a = str;
        }
        if (mVar.f241787f != null) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (hVar == null && gVar != null && !gVar.field_mtlnotify && com.tencent.mars.comm.NetStatusUtil.getNetWorkType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1) {
                return;
            }
            mVar.field_lastProgressCallbackTime = currentTimeMillis;
            mVar.f241787f.r4(this.f285266d, 0, this.f285267e, this.f285269g, mVar.field_onlycheckexist);
        }
        dVar.getClass();
        if (gVar == null || gVar.field_finishedLength == gVar.field_toltalLength) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f285278g).remove(str);
        }
        if (hVar != null) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f285277f).remove(str);
            if (hVar.field_retCode == -5103011) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn ERR_VALIDATE_AUTHKEY");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(546L, 4L, 1L, true);
                dVar.e().keep_OnRequestDoGetCdnDnsInfo(999);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|callback";
    }
}
