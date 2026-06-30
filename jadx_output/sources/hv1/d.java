package hv1;

/* loaded from: classes12.dex */
public class d implements dn.f {

    /* renamed from: m, reason: collision with root package name */
    public static hv1.d f285274m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f285275d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f285276e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f285277f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f285278g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f285279h = new com.tencent.mm.sdk.platformtools.n3("CdnDownloadNativeService#" + hashCode());

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.l1 f285280i = null;

    public d() {
        new java.util.HashSet();
    }

    public static synchronized hv1.d f() {
        hv1.d dVar;
        synchronized (hv1.d.class) {
            if (f285274m == null) {
                hv1.d dVar2 = new hv1.d();
                f285274m = dVar2;
                dVar2.e();
            }
            dVar = f285274m;
        }
        return dVar;
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f285277f).get(str);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.k kVar = mVar.f241787f;
        if (kVar != null) {
            kVar.O(str, byteArrayOutputStream);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
            return -2;
        }
        boolean z17 = gVar != null ? gVar.field_isUploadTask : false;
        java.lang.System.currentTimeMillis();
        this.f285279h.postToWorker(new hv1.b(this, str, gVar, z17, hVar));
        return 0;
    }

    public int b(dn.m mVar) {
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask task info is null");
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
            return -1;
        }
        if (mVar.field_fileId == null) {
            mVar.field_fileId = "";
        }
        if (mVar.field_aesKey == null) {
            mVar.field_aesKey = "";
        }
        if (((java.util.LinkedList) this.f285275d).contains(mVar.field_fileId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
        } else {
            if (((java.util.concurrent.ConcurrentHashMap) this.f285276e).containsKey(mVar.field_fileId)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
            } else {
                if (!((java.util.concurrent.ConcurrentHashMap) this.f285277f).containsKey(mVar.field_fileId)) {
                    mVar.f241786e = false;
                    this.f285279h.postToWorker(new hv1.a(this, -1, mVar));
                    return 0;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
            }
        }
        return -2;
    }

    public boolean c(java.lang.String str) {
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f285277f).get(str);
        d(str);
        if (mVar == null || mVar.field_fullpath == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "cancelGameRecvTask, delete file:" + mVar.field_fullpath);
        com.tencent.mm.vfs.w6.h(mVar.field_fullpath);
        return true;
    }

    public boolean d(java.lang.String str) {
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f285277f).remove(str);
        if (mVar != null) {
            int i17 = mVar.field_fileType;
            if (i17 == 30001 || i17 == 30003 || i17 == 30007) {
                e().w(str);
            } else if (mVar.F) {
                e().v(str);
            } else {
                e().getClass();
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(str);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.field_fileType);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var.d(10769, -10002, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.field_startTime));
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f285276e).remove(str);
        ((java.util.concurrent.ConcurrentHashMap) this.f285278g).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public com.tencent.mm.modelcdntran.l1 e() {
        if (this.f285280i == null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "use mm process cdn engine.");
                this.f285280i = com.tencent.mm.modelcdntran.s1.cj();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "use new cdn engine.");
                this.f285280i = new com.tencent.mm.modelcdntran.l1(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir() + "/NativeCDNInfo", this);
            }
        }
        return this.f285280i;
    }

    public int g(dn.m mVar) {
        if (!((java.util.concurrent.ConcurrentHashMap) this.f285277f).containsKey(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task add new mediaid:%s", mVar.field_mediaId);
            return b(mVar);
        }
        int resumeHttpMultiSocketDownloadTask = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).resumeHttpMultiSocketDownloadTask(mVar.field_mediaId);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task resume mediaid:%s, ret:%d", mVar.field_mediaId, java.lang.Integer.valueOf(resumeHttpMultiSocketDownloadTask));
        return resumeHttpMultiSocketDownloadTask;
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f285277f).get(str);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        dn.k kVar = mVar.f241787f;
        if (kVar != null) {
            return kVar.w(str, bArr);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        this.f285279h.postToWorker(new hv1.c(this, str, hVar));
        return 0;
    }
}
