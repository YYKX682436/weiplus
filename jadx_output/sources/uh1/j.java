package uh1;

/* loaded from: classes7.dex */
public class j implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.r f427803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.n f427804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f427805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.p f427806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.q f427807e;

    public j(uh1.q qVar, uh1.r rVar, uh1.n nVar, long j17, uh1.p pVar) {
        this.f427807e = qVar;
        this.f427803a = rVar;
        this.f427804b = nVar;
        this.f427805c = j17;
        this.f427806d = pVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
        uh1.r rVar = this.f427803a;
        java.lang.String str = rVar.f427881j;
        if (chunkedData == null || chunkedData.data == null || j17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetworkRequest", "onCronetReceiveChunkedData invaild length length:%d,taskid is %s,cronettaskid is %s", java.lang.Long.valueOf(j17), rVar.f427881j, rVar.f427883l);
            return;
        }
        uh1.q.a(this.f427807e, rVar);
        java.nio.ByteBuffer e17 = com.tencent.mm.plugin.appbrand.utils.v3.e(chunkedData.data);
        ad1.b bVar = (ad1.b) this.f427804b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) bVar.f3105a.get();
        if (lVar == null) {
            return;
        }
        uh1.q a17 = uh1.s.f427900a.a(lVar);
        java.lang.String str2 = bVar.f3107c;
        if (a17 == null || !((java.util.concurrent.ConcurrentSkipListSet) a17.f427856c).contains(str2)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestTaskId", str2);
            hashMap.put("state", "chunked");
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, e17);
            ad1.c cVar = new ad1.c();
            com.tencent.mm.plugin.appbrand.utils.u3 d17 = com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getF147808e(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
            if (d17 != com.tencent.mm.plugin.appbrand.utils.u3.OK) {
                if (d17 == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
                    com.tencent.mm.plugin.appbrand.utils.v3.b(lVar, ad1.c.NAME);
                }
            } else {
                java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                cVar.p(lVar);
                cVar.f82374f = jSONObject;
                cVar.n(bVar.f3109e.f3102h.a(str2));
            }
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        uh1.r rVar = this.f427803a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet file request onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, rVar.f427881j, rVar.f427883l);
        org.json.JSONObject e17 = uh1.j0.e(com.tencent.mars.cdn.CronetLogic.getHeaderList(responseHeader), 2);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkRequest", e18, "JSONException: request onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        ((ad1.b) this.f427804b).a(e17, i17);
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        int i17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.errorCode);
        java.lang.String str3 = cronetTaskResult.errorMsg;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult.statusCode);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cronetTaskResult.totalReceiveByte);
        uh1.r rVar = this.f427803a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str3, valueOf2, valueOf3, rVar.f427881j, rVar.f427883l);
        com.tencent.mars.cdn.CronetLogic.WebPageProfile webPageProfile = cronetTaskResult.webPageProfile;
        if (webPageProfile != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted profile, protocol:%s, ip:%s, port:%d", webPageProfile.protocol, webPageProfile.peerIP, java.lang.Integer.valueOf(webPageProfile.port));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet profile is empty");
        }
        uh1.q qVar = this.f427807e;
        uh1.q.a(qVar, rVar);
        if (cronetTaskResult.errorCode == 0) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapList = cronetTaskResult.getHeaderMapList();
            org.json.JSONObject e17 = uh1.j0.e(headerMapList, 2);
            int i18 = cronetTaskResult.statusCode;
            if (i18 != 200) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet failed code: %d,url is %s", java.lang.Integer.valueOf(i18), rVar.f427874c);
                if (uh1.j0.B(i18)) {
                    java.lang.String str4 = cronetTaskResult.newLocation;
                    if (rVar.B) {
                        try {
                            e17.put("Location", str4);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkRequest", e18, "JSONException: request onCronetReceiveHeader put Location error", new java.lang.Object[0]);
                        }
                        ((ad1.b) this.f427804b).a(e17, i18);
                        if (rVar.f427887p) {
                            i17 = i18;
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted manual redirect already callback");
                        } else {
                            rVar.f427887p = true;
                            if (rVar.f427891t) {
                                i17 = i18;
                                this.f427807e.d(this.f427804b, "ok", "", i18, e17, rVar.f427881j, null, uh1.j0.k(cronetTaskResult.webPageProfile), null);
                            } else {
                                i17 = i18;
                                this.f427807e.d(this.f427804b, "ok", "", i17, e17, rVar.f427881j, null, null, null);
                            }
                        }
                    } else {
                        i17 = i18;
                        int i19 = rVar.f427879h;
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            if (i19 > 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i19), rVar.f427874c, str4);
                                rVar.f427874c = str4;
                                rVar.f427879h = i19 - 1;
                                uh1.q.b(qVar, rVar);
                                return;
                            }
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetworkRequest", "cronet reach the max redirect count(%d)", 15);
                            if (rVar.f427887p) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted max redirect already callback");
                            } else {
                                rVar.f427887p = true;
                                if (rVar.f427891t) {
                                    this.f427807e.d(this.f427804b, "ok", "reach the max redirect count 15", i17, e17, rVar.f427881j, null, uh1.j0.k(cronetTaskResult.webPageProfile), null);
                                } else {
                                    this.f427807e.d(this.f427804b, "ok", "reach the max redirect count 15", i17, e17, rVar.f427881j, null, null, null);
                                }
                            }
                            uh1.j0.E(1095L, 1L, 1L);
                            return;
                        }
                    }
                } else {
                    i17 = i18;
                }
                uh1.j0.E(1095L, 3L, 1L);
            } else {
                i17 = i18;
            }
            java.lang.Object e19 = "arraybuffer".equals(rVar.f427880i) ? com.tencent.mm.plugin.appbrand.utils.v3.e(cronetTaskResult.data) : com.tencent.mm.plugin.appbrand.utils.w3.a(cronetTaskResult.getDataString());
            if (rVar.f427887p) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted if already callback");
            } else {
                rVar.f427887p = true;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("beginCGITimestamp", java.lang.Long.valueOf(this.f427805c));
                hashMap.put("CGICallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (headerMapList != null) {
                    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerMapList.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.util.List<java.lang.String> value = entry.getValue();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(key) && value != null && !value.isEmpty()) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(value.get(0));
                            for (int i27 = 1; i27 < value.size(); i27++) {
                                sb6.append(",");
                                sb6.append(value.get(i27));
                            }
                            hashMap2.put(key, sb6.toString());
                        }
                    }
                }
                java.lang.System.currentTimeMillis();
                qVar.getClass();
                if (rVar.f427891t) {
                    this.f427807e.d(this.f427804b, "ok", e19, cronetTaskResult.statusCode, e17, rVar.f427881j, null, uh1.j0.k(cronetTaskResult.webPageProfile), hashMap);
                } else {
                    this.f427807e.d(this.f427804b, "ok", e19, cronetTaskResult.statusCode, e17, rVar.f427881j, null, null, hashMap);
                }
            }
            java.lang.System.currentTimeMillis();
            uh1.j0.E(1095L, 8L, 1L);
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f427862i, rVar.f427885n, rVar.f427875d, rVar.f427874c, rVar.d(), cronetTaskResult.totalReceiveByte, i17, 1, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
        } else {
            if (rVar.f427887p) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "onC2CDownloadCompleted else already callback");
            } else {
                rVar.f427887p = true;
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("requestURL", rVar.f427874c);
                java.lang.String str5 = cronetTaskResult.errorCode + ":" + cronetTaskResult.errorMsg;
                java.lang.System.currentTimeMillis();
                qVar.getClass();
                this.f427807e.c(this.f427804b, "fail", str5, rVar.f427881j, null, 600001, hashMap3);
            }
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f427862i, rVar.f427885n, rVar.f427875d, rVar.f427874c, rVar.d(), 0L, 0, 2, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
            uh1.j0.E(1095L, 5L, 1L);
        }
        ((java.util.concurrent.ConcurrentSkipListSet) qVar.f427856c).remove(rVar.f427881j);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        uh1.q qVar = this.f427807e;
        uh1.u uVar = (uh1.u) qVar.f427861h.get();
        uh1.r rVar = this.f427803a;
        if (uVar != null) {
            int ordinal = uVar.getAppState().ordinal();
            if (!(ordinal == 2 || ordinal == 3)) {
                if (rVar.f427887p) {
                    return;
                }
                long j17 = cronetDownloadProgress.totalByte;
                uh1.n nVar = this.f427804b;
                uh1.p pVar = this.f427806d;
                if (j17 > 0) {
                    long j18 = cronetDownloadProgress.currentWriteByte;
                    if (j18 > j17) {
                        pVar.f427850a = 100;
                    } else {
                        pVar.f427850a = (int) ((100 * j18) / j17);
                    }
                    int i17 = pVar.f427851b;
                    int i18 = pVar.f427850a;
                    if (i17 != i18) {
                        ((ad1.b) nVar).c(rVar.f427881j, rVar.f427874c, i18, j18, j17);
                        pVar.f427851b = pVar.f427850a;
                    }
                } else {
                    long j19 = pVar.f427852c;
                    long j27 = cronetDownloadProgress.currentWriteByte;
                    if (j19 != j27) {
                        ((ad1.b) nVar).c(rVar.f427881j, rVar.f427874c, 0, j27, 0L);
                        pVar.f427852c = cronetDownloadProgress.currentWriteByte;
                    }
                }
                if (pVar.f427850a == 100) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet request size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte), java.lang.Long.valueOf(cronetDownloadProgress.totalByte), java.lang.Integer.valueOf(pVar.f427850a));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid is %s,cronettaskid is %s", str, rVar.f427881j, rVar.f427883l);
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(rVar.f427883l);
        if (rVar.f427887p) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged already callback");
        } else {
            rVar.f427887p = true;
            this.f427807e.c(this.f427804b, "fail", "fail:network interrupted error", rVar.f427881j, null, 600003, null);
        }
        uh1.q.a(qVar, rVar);
    }
}
