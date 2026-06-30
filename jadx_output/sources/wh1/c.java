package wh1;

/* loaded from: classes7.dex */
public class c implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f445920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh1.d f445921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wh1.e f445922c;

    public c(wh1.e eVar, wu5.b bVar, wh1.d dVar) {
        this.f445922c = eVar;
        this.f445920a = bVar;
        this.f445921b = dVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        wh1.e eVar = this.f445922c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet file upload onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, eVar.f445941w, eVar.f445943y);
        org.json.JSONObject e17 = uh1.j0.e(com.tencent.mars.cdn.CronetLogic.getHeaderList(responseHeader), 2);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUploadWorker", e18, "JSONException: upload onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        ((uh1.b0) eVar.f445927f).d(e17);
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
        if (uh1.j0.G(this.f445922c.f445926e)) {
            wh1.e eVar = this.f445922c;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress shouldStopTask taskid %s,CronetRequestId:%s", eVar.f445941w, eVar.f445943y);
            if (this.f445922c.f445929h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress already callback");
            } else {
                this.f445922c.f445929h = true;
                com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f445922c.f445943y);
                wh1.e eVar2 = this.f445922c;
                ((uh1.b0) eVar2.f445927f).a(eVar2.f445933o, eVar2.f445931m, "fail:network interrupted error", 600003);
            }
            wu5.b bVar = this.f445920a;
            if (bVar != null) {
                bVar.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetReceiveUploadProgress shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (j18 <= 0 || !this.f445922c.f445928g) {
            return;
        }
        if (j18 > 0) {
            if (j17 > j18) {
                this.f445921b.f445923a = 100;
            } else {
                this.f445921b.f445923a = (int) ((100 * j17) / j18);
            }
            wh1.d dVar = this.f445921b;
            int i17 = dVar.f445924b;
            int i18 = dVar.f445923a;
            if (i17 != i18) {
                wh1.e eVar3 = this.f445922c;
                wh1.f fVar = eVar3.f445927f;
                ((uh1.b0) fVar).e(eVar3.f445933o, eVar3.f445931m, i18, j17, j18);
                wh1.d dVar2 = this.f445921b;
                dVar2.f445924b = dVar2.f445923a;
            }
        } else {
            wh1.e eVar4 = this.f445922c;
            wh1.f fVar2 = eVar4.f445927f;
            ((uh1.b0) fVar2).e(eVar4.f445933o, eVar4.f445931m, this.f445921b.f445923a, j17, 0L);
        }
        if (this.f445921b.f445923a == 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f445921b.f445923a));
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        wu5.b bVar = this.f445920a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new wh1.b(this, cronetTaskResult));
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
