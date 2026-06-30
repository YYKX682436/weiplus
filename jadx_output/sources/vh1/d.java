package vh1;

/* loaded from: classes7.dex */
public class d implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f437013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh1.e f437014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh1.f f437015c;

    public d(vh1.f fVar, wu5.b bVar, vh1.e eVar) {
        this.f437015c = fVar;
        this.f437013a = bVar;
        this.f437014b = eVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        long j17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        vh1.f fVar = this.f437015c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, fVar.f437033v, fVar.f437035x);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerList = com.tencent.mars.cdn.CronetLogic.getHeaderList(responseHeader);
        org.json.JSONObject e17 = uh1.j0.e(headerList, 2);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDownloadWorker", e18, "JSONException: download onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        this.f437015c.f437020f.a(e17);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it = headerList.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j17 = 0;
                break;
            }
            java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it.next();
            java.lang.String key = next.getKey();
            java.util.List<java.lang.String> value = next.getValue();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(key) && value != null && !value.isEmpty()) {
                if (key.equals("Content-Length")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader Content-Length:%s", value.get(0));
                    j17 = java.lang.Long.parseLong(value.get(0));
                    break;
                }
                if (key.equals("content-length")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader content-length:%s", value.get(0));
                    j17 = java.lang.Long.parseLong(value.get(0));
                    break;
                }
            }
        }
        if (j17 > 0) {
            uh1.j0.E(1197L, 16L, j17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader contentLength fail");
        }
        if (j17 <= 0 || this.f437015c.f437031t <= 0 || j17 <= this.f437015c.f437031t) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader, contentLength %d exceed limit", java.lang.Long.valueOf(j17));
        if (this.f437015c.f437022h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        } else {
            this.f437015c.f437022h = true;
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f437015c.f437035x);
            vh1.f fVar2 = this.f437015c;
            fVar2.f437020f.d(fVar2.f437024m, fVar2.f437023i, "fail:exceed max file size", 603301);
        }
        wu5.b bVar = this.f437013a;
        if (bVar == null) {
            return -1;
        }
        bVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        wu5.b bVar = this.f437013a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new vh1.c(this, cronetTaskResult));
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        if (uh1.j0.G(this.f437015c.f437019e)) {
            vh1.f fVar = this.f437015c;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged shouldStopTask taskid %s,CronetRequestId:%s", fVar.f437033v, fVar.f437035x);
            if (this.f437015c.f437022h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged already callback");
            } else {
                this.f437015c.f437022h = true;
                com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f437015c.f437035x);
                vh1.f fVar2 = this.f437015c;
                fVar2.f437020f.d(fVar2.f437024m, fVar2.f437023i, "fail:network interrupted error", 600003);
            }
            wu5.b bVar = this.f437013a;
            if (bVar != null) {
                bVar.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.currentWriteByte > 0 && this.f437015c.f437031t > 0 && (cronetDownloadProgress.currentWriteByte > this.f437015c.f437031t || cronetDownloadProgress.totalByte > this.f437015c.f437031t)) {
            if (this.f437015c.f437022h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged max file size already callback");
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(cronetDownloadProgress.totalByte);
            vh1.f fVar3 = this.f437015c;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged writeByte %d or totalByte %d exceed limit,taskid %s,CronetRequestId:%s", valueOf, valueOf2, fVar3.f437033v, fVar3.f437035x);
            this.f437015c.f437022h = true;
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f437015c.f437035x);
            vh1.f fVar4 = this.f437015c;
            fVar4.f437020f.d(fVar4.f437024m, fVar4.f437023i, "fail:exceed max file size", 603301);
            wu5.b bVar2 = this.f437013a;
            if (bVar2 != null) {
                bVar2.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged exceed max file size TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.totalByte <= 0 || !this.f437015c.f437021g) {
            return;
        }
        long j17 = cronetDownloadProgress.totalByte;
        if (j17 > 0) {
            long j18 = cronetDownloadProgress.currentWriteByte;
            if (j18 > j17) {
                this.f437014b.f437016a = 100;
            } else {
                this.f437014b.f437016a = (int) ((100 * j18) / j17);
            }
            vh1.e eVar = this.f437014b;
            int i17 = eVar.f437017b;
            int i18 = eVar.f437016a;
            if (i17 != i18) {
                vh1.f fVar5 = this.f437015c;
                fVar5.f437020f.f(fVar5.f437024m, fVar5.f437023i, i18, j18, j17);
                vh1.e eVar2 = this.f437014b;
                eVar2.f437017b = eVar2.f437016a;
            }
        } else {
            vh1.f fVar6 = this.f437015c;
            fVar6.f437020f.f(fVar6.f437024m, fVar6.f437023i, this.f437014b.f437016a, cronetDownloadProgress.currentWriteByte, 0L);
        }
        if (this.f437014b.f437016a == 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet download size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte), java.lang.Long.valueOf(cronetDownloadProgress.totalByte), java.lang.Integer.valueOf(this.f437014b.f437016a));
        }
    }
}
