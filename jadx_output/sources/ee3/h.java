package ee3;

/* loaded from: classes7.dex */
public class h implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f251606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee3.i f251607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ee3.j f251608c;

    public h(ee3.j jVar, wu5.b bVar, ee3.i iVar) {
        this.f251608c = jVar;
        this.f251606a = bVar;
        this.f251607b = iVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        long j17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ee3.j jVar = this.f251608c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, jVar.f251624t, jVar.f251625u);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerList = com.tencent.mars.cdn.CronetLogic.getHeaderList(responseHeader);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (headerList != null) {
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerList.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.List<java.lang.String> value = entry.getValue();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(key) && value != null && !value.isEmpty()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(value.get(0));
                    for (int i18 = 1; i18 < value.size(); i18++) {
                        sb6.append(",");
                        sb6.append(value.get(i18));
                    }
                    try {
                        jSONObject.put(key, sb6.toString());
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushNetworkUtil", e17, "JSONException: getHeaderJsonObject put header error", new java.lang.Object[0]);
                    }
                }
            }
        }
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jSONObject.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushDownloadWorker", e18, "JSONException: download onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        this.f251608c.f251613f.g(jSONObject, i17);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it = headerList.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j17 = 0;
                break;
            }
            java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it.next();
            java.lang.String key2 = next.getKey();
            java.util.List<java.lang.String> value2 = next.getValue();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(key2) && value2 != null && !value2.isEmpty()) {
                if (key2.equals("Content-Length")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader Content-Length:%s", value2.get(0));
                    j17 = java.lang.Long.parseLong(value2.get(0));
                    break;
                }
                if (key2.equals("content-length")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader content-length:%s", value2.get(0));
                    j17 = java.lang.Long.parseLong(value2.get(0));
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader contentLength:%d", java.lang.Long.valueOf(j17));
        if (j17 <= 0 || this.f251608c.f251622r <= 0 || j17 <= this.f251608c.f251622r) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader before actually read stream, contentLength %d exceed limit", java.lang.Long.valueOf(j17));
        if (this.f251608c.f251615h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        } else {
            this.f251608c.f251615h = true;
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f251608c.f251625u);
            ee3.j jVar2 = this.f251608c;
            jVar2.f251613f.d(jVar2.f251618n, jVar2.f251617m, "fail:exceed max file size", 303301);
        }
        wu5.b bVar = this.f251606a;
        if (bVar == null) {
            return -1;
        }
        bVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.errorCode);
        java.lang.String str3 = cronetTaskResult.errorMsg;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult.statusCode);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cronetTaskResult.totalReceiveByte);
        ee3.j jVar = this.f251608c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", valueOf, str3, valueOf2, valueOf3, jVar.f251624t, jVar.f251625u, str);
        wu5.b bVar = this.f251606a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new ee3.g(this, cronetTaskResult));
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        int i17;
        ee3.j jVar = this.f251608c;
        lc3.h0 h0Var = jVar.f251612e;
        if (h0Var != null && ((i17 = ((sc3.k1) h0Var).G) == 8 || i17 == 16)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid %s,CronetRequestId:%s", str, jVar.f251624t, jVar.f251625u);
            if (this.f251608c.f251615h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged already callback");
            } else {
                this.f251608c.f251615h = true;
                com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f251608c.f251625u);
                ee3.j jVar2 = this.f251608c;
                jVar2.f251613f.d(jVar2.f251618n, jVar2.f251617m, "fail:network interrupted error", 300003);
            }
            wu5.b bVar = this.f251606a;
            if (bVar != null) {
                bVar.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.currentWriteByte > 0 && jVar.f251622r > 0 && (cronetDownloadProgress.currentWriteByte > this.f251608c.f251622r || cronetDownloadProgress.totalByte > this.f251608c.f251622r)) {
            if (this.f251608c.f251615h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged max file size already callback");
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(cronetDownloadProgress.totalByte);
            ee3.j jVar3 = this.f251608c;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged currentWriteByte %d or progress.totalByte %d exceed limit,fileKey:%s,taskid %s,CronetRequestId:%s", valueOf, valueOf2, str, jVar3.f251624t, jVar3.f251625u);
            this.f251608c.f251615h = true;
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f251608c.f251625u);
            ee3.j jVar4 = this.f251608c;
            jVar4.f251613f.d(jVar4.f251618n, jVar4.f251617m, "fail:exceed max file size", 303301);
            wu5.b bVar2 = this.f251606a;
            if (bVar2 != null) {
                bVar2.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged exceed max file size TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.totalByte <= 0 || !this.f251608c.f251614g) {
            return;
        }
        long j17 = cronetDownloadProgress.totalByte;
        if (j17 > 0) {
            long j18 = cronetDownloadProgress.currentWriteByte;
            if (j18 > j17) {
                this.f251607b.f251609a = 100;
            } else {
                this.f251607b.f251609a = (int) ((100 * j18) / j17);
            }
            ee3.i iVar = this.f251607b;
            int i18 = iVar.f251610b;
            int i19 = iVar.f251609a;
            if (i18 != i19) {
                ee3.j jVar5 = this.f251608c;
                jVar5.f251613f.f(jVar5.f251618n, jVar5.f251617m, i19, j18, j17);
                ee3.i iVar2 = this.f251607b;
                iVar2.f251610b = iVar2.f251609a;
            }
        } else {
            ee3.j jVar6 = this.f251608c;
            jVar6.f251613f.f(jVar6.f251618n, jVar6.f251617m, this.f251607b.f251609a, cronetDownloadProgress.currentWriteByte, 0L);
        }
        if (this.f251607b.f251609a == 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet download size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte), java.lang.Long.valueOf(cronetDownloadProgress.totalByte), java.lang.Integer.valueOf(this.f251607b.f251609a));
        }
    }
}
