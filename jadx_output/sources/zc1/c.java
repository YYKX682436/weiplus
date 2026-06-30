package zc1;

/* loaded from: classes7.dex */
public class c implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final uh1.e f471398d;

    /* renamed from: f, reason: collision with root package name */
    public final gb1.a f471400f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471399e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f471401g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public c(uh1.e eVar, gb1.a aVar) {
        this.f471398d = eVar;
        this.f471400f = aVar;
    }

    public static boolean b(zc1.c cVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        cVar.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
        uh1.f a17 = uh1.h.f427795a.a(lVar.getAppId());
        if (a17 == null || !a17.f427790g.contains(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "download abort %s", str);
        return true;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "downloadTaskId";
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.plugin.appbrand.jsapi.l r27, uh1.a r28, boolean r29, org.json.JSONObject r30, int r31, java.util.Map r32, uh1.d r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc1.c.c(com.tencent.mm.plugin.appbrand.jsapi.l, uh1.a, boolean, org.json.JSONObject, int, java.util.Map, uh1.d, java.lang.String):void");
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        if (!this.f471401g.getAndSet(true)) {
            if (this.f471398d != null) {
                lVar.getAppId();
                this.f471399e = com.tencent.mm.plugin.appbrand.vf.a(3);
            }
            if (this.f471399e) {
                uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateDownloadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar.H), lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(aVar.H);
                }
            }
        }
        lVar.getAppId();
        zc1.a aVar2 = new zc1.a(this, jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), lVar, str);
        uh1.a aVar3 = (uh1.a) lVar.b(uh1.a.class);
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar3);
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "url is null");
            e(lVar, str, "url is null or nil", 600005);
            return;
        }
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar3.f427740d;
        if (z17 && !uh1.j0.A(aVar3.f427752s, optString, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "not in domain url %s", optString);
            e(lVar, str, "url not in domain list", 600002);
            return;
        }
        if (aVar3.f427748o <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
        }
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar3, 3);
        }
        if (optInt <= 0) {
            optInt = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        }
        c(lVar, aVar3, z17, jSONObject, optInt, g17, aVar2, str);
    }

    public void e(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseCreateDownloadTask", "sendFailMsg, downloadTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str2);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject);
        bVar.n(this.f471400f.a(str));
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
        uh1.h.f427795a.getClass();
        sb6.append(uh1.i.f427798b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}
