package zc1;

/* loaded from: classes7.dex */
public class a implements uh1.d {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f471393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f471395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc1.c f471397e;

    public a(zc1.c cVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str2) {
        this.f471397e = cVar;
        this.f471394b = str;
        this.f471395c = lVar;
        this.f471396d = str2;
    }

    @Override // uh1.d
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f471395c;
        java.lang.String str = this.f471396d;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent();
                am.u uVar = appBrandNetWorkReqHeaderReceivedEvent.f53981g;
                uVar.f8045a = "download";
                uVar.f8047c = jSONObject;
                uVar.f8046b = str;
                appBrandNetWorkReqHeaderReceivedEvent.e();
                return;
            }
            return;
        }
        this.f471393a = jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "headersReceived");
        hashMap.put("header", this.f471393a);
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(this.f471397e.f471400f.a(str));
    }

    @Override // uh1.d
    public void b(int i17, long j17, long j18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f471396d;
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesWritten", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToWrite", java.lang.Long.valueOf(j18));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(this.f471395c);
        bVar.r(jSONObject);
        bVar.n(this.f471397e.f471400f.a(str));
    }

    @Override // uh1.d
    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, long j17, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %d, dataLength = %d", java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f471394b)) {
            java.lang.String str3 = com.tencent.mm.plugin.appbrand.jsapi.file.c2.D(this.f471395c, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)), this.f471394b, null).f298904b;
            if (!"ok".equals(str3)) {
                if (zc1.c.b(this.f471397e, this.f471395c, this.f471396d)) {
                    return;
                }
                this.f471397e.e(this.f471395c, this.f471396d, str3, 603300);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode filePath %s", this.f471394b);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("downloadTaskId", this.f471396d);
            hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f471394b);
            hashMap.put("dataLength", java.lang.Long.valueOf(j17));
            hashMap.put("statusCode", java.lang.Integer.valueOf(i18));
            hashMap.put("state", ya.b.SUCCESS);
            org.json.JSONObject jSONObject = this.f471393a;
            if (jSONObject != null) {
                hashMap.put("header", jSONObject);
            }
            if (map != null && map.size() > 0) {
                hashMap.put(com.google.android.gms.common.Scopes.PROFILE, map);
            }
            java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
            zc1.b bVar = new zc1.b();
            bVar.p(this.f471395c);
            bVar.r(jSONObject2);
            bVar.n(this.f471397e.f471400f.a(this.f471396d));
            this.f471397e.f471400f.b(this.f471396d);
            return;
        }
        zc1.c cVar = this.f471397e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f471395c;
        cVar.getClass();
        java.lang.String a17 = q75.g.a(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17) && com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MP4.equals(str)) {
            a17 = "mp4";
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = lVar.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)), a17, true, b0Var);
        java.lang.String str4 = createTempFileFrom != com.tencent.mm.plugin.appbrand.appstorage.j1.OK ? null : (java.lang.String) b0Var.f291824a;
        if (str4 == null) {
            if (zc1.c.b(this.f471397e, this.f471395c, this.f471396d)) {
                return;
            }
            this.f471397e.e(this.f471395c, this.f471396d, createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail", 603300);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode localId %s", str4);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("downloadTaskId", this.f471396d);
        hashMap2.put("tempFilePath", str4);
        hashMap2.put("dataLength", java.lang.Long.valueOf(j17));
        hashMap2.put("statusCode", java.lang.Integer.valueOf(i18));
        hashMap2.put("state", ya.b.SUCCESS);
        org.json.JSONObject jSONObject3 = this.f471393a;
        if (jSONObject3 != null) {
            hashMap2.put("header", jSONObject3);
        }
        if (map != null && map.size() > 0) {
            hashMap2.put(com.google.android.gms.common.Scopes.PROFILE, map);
        }
        java.lang.String jSONObject4 = new org.json.JSONObject(hashMap2).toString();
        zc1.b bVar2 = new zc1.b();
        bVar2.p(this.f471395c);
        bVar2.r(jSONObject4);
        bVar2.n(this.f471397e.f471400f.a(this.f471396d));
        this.f471397e.f471400f.b(this.f471396d);
    }

    @Override // uh1.d
    public void d(int i17, java.lang.String str, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f471396d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadError downloadTaskId=%s,errMsg=%d,error=%s,errno=%d", str2, valueOf, str, valueOf2);
        zc1.c cVar = this.f471397e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f471395c;
        if (zc1.c.b(cVar, lVar, str2)) {
            return;
        }
        cVar.e(lVar, str2, str, i18);
    }
}
