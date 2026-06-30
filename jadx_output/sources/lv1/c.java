package lv1;

/* loaded from: classes8.dex */
public class c extends fv1.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot f321493e;

    public c(com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot cDNDownloadServiceSlot) {
        this.f321493e = cDNDownloadServiceSlot;
    }

    @Override // fv1.c
    public boolean Ba(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95518g).get(str);
        if (str2 != null) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeDownloadTask, cronetId".concat(str2));
            return true;
        }
        hv1.d.f().c(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public boolean Je(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95518g).get(str);
        if (str2 != null) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "pauseDownloadTask, cronetId".concat(str2));
            return true;
        }
        hv1.d.f().d(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "pauseDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public void Vf() {
    }

    @Override // fv1.c
    public void Wb() {
        vk0.e eVar = vk0.c.f437751a;
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot cDNDownloadServiceSlot = this.f321493e;
        if (eVar.b(cDNDownloadServiceSlot)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "addIPCTaskMarker");
        eVar.a(cDNDownloadServiceSlot);
    }

    @Override // fv1.c
    public void X8(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "notifyNetworkChange: " + i17);
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            return;
        }
        com.tencent.mars.WeChatMars.onNetworkChange();
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onNetworkChange();
        }
    }

    @Override // fv1.c
    public int aa(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: %s, enableBrotli:%d", cDNTaskInfo.f95499e, java.lang.Integer.valueOf(cDNTaskInfo.f95510s ? 1 : 0));
        if (!cDNTaskInfo.f95510s) {
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_CDNDownloadServiceSlot_2";
            mVar.F = cDNTaskInfo.f95498d;
            mVar.field_mediaId = cDNTaskInfo.f95500f;
            mVar.field_fullpath = cDNTaskInfo.f95501g;
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str = cDNTaskInfo.f95499e;
            ((uz.a2) y1Var).getClass();
            mVar.f241811z = com.tencent.mm.plugin.downloader.api.f.a(str);
            vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str2 = cDNTaskInfo.f95502h;
            ((uz.a2) y1Var2).getClass();
            mVar.I = com.tencent.mm.plugin.downloader.api.f.a(str2);
            mVar.f241787f = com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95519h;
            mVar.A = cDNTaskInfo.f95504m;
            mVar.B = cDNTaskInfo.f95505n;
            mVar.E = cDNTaskInfo.f95507p;
            mVar.G = cDNTaskInfo.f95506o;
            mVar.H = true;
            mVar.field_filemd5 = cDNTaskInfo.f95509r;
            com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.a(this.f321493e, mVar, cDNTaskInfo.f95503i);
            int g17 = hv1.d.f().g(mVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: " + g17);
            return g17;
        }
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 2;
        vz.y1 y1Var3 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str3 = cDNTaskInfo.f95499e;
        ((uz.a2) y1Var3).getClass();
        cronetRequestParams.url = com.tencent.mm.plugin.downloader.api.f.a(str3);
        cronetRequestParams.followRedirect = true;
        cronetRequestParams.needWriteLocal = true;
        cronetRequestParams.savePath = cDNTaskInfo.f95501g;
        cronetRequestParams.method = "GET";
        cronetRequestParams.enableBrotli = true;
        cronetRequestParams.downloadResumption = true;
        cronetRequestParams.enableUseZstdDecompress = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str4 = cDNTaskInfo.f95503i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(cDNTaskInfo.f95503i);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "ex:" + th6);
            }
            if (!hashMap.isEmpty()) {
                cronetRequestParams.enableVerifyHeader = true;
            }
        }
        if (hashMap.containsKey("Accept-Encoding")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "startCronetHttpsRequest Accept-Encoding:%s", hashMap.get("Accept-Encoding"));
        } else {
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDownloadTask = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(cronetRequestParams, com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95520i);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "use cronet， addDownloadTask: " + startCronetDownloadTask + ", cronet taskId: " + startCronetDownloadTask.taskId);
        ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95517f).put(startCronetDownloadTask.taskId, cDNTaskInfo.f95500f);
        ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95518g).put(cDNTaskInfo.f95499e, startCronetDownloadTask.taskId);
        return startCronetDownloadTask.createRet;
    }

    @Override // fv1.c
    public void ca(fv1.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "registerCallback");
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95516e = fVar;
    }

    @Override // fv1.c
    public void d3(fv1.f fVar) {
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95516e = null;
    }

    @Override // fv1.c
    public void m5() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeIPCTaskMarker");
        vk0.c.f437751a.c(this.f321493e);
    }

    @Override // fv1.c
    public com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState p6(java.lang.String str) {
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class);
        if (cdnManager == null) {
            cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        }
        com.tencent.mars.cdn.CdnManager.CdnTaskStateInfo httpMultiSocketDownloadTaskState = cdnManager.httpMultiSocketDownloadTaskState(str);
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState cDNTaskState = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState();
        if (httpMultiSocketDownloadTaskState != null) {
            cDNTaskState.f95511d = httpMultiSocketDownloadTaskState.taskState;
            cDNTaskState.f95513f = (int) httpMultiSocketDownloadTaskState.fileTotalSize;
            cDNTaskState.f95512e = (int) httpMultiSocketDownloadTaskState.completeSize;
        }
        return cDNTaskState;
    }

    @Override // fv1.c
    public int y2(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: %s filepath:%s enableBrotli:%d", cDNTaskInfo.f95499e, cDNTaskInfo.f95501g, java.lang.Integer.valueOf(cDNTaskInfo.f95510s ? 1 : 0));
        if (!cDNTaskInfo.f95510s) {
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_CDNDownloadServiceSlot_1";
            mVar.F = cDNTaskInfo.f95498d;
            mVar.field_mediaId = cDNTaskInfo.f95500f;
            mVar.field_fullpath = cDNTaskInfo.f95501g;
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str = cDNTaskInfo.f95499e;
            ((uz.a2) y1Var).getClass();
            mVar.f241811z = com.tencent.mm.plugin.downloader.api.f.a(str);
            vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str2 = cDNTaskInfo.f95502h;
            ((uz.a2) y1Var2).getClass();
            mVar.I = com.tencent.mm.plugin.downloader.api.f.a(str2);
            mVar.f241787f = com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95519h;
            mVar.A = cDNTaskInfo.f95504m;
            mVar.B = cDNTaskInfo.f95505n;
            mVar.G = cDNTaskInfo.f95506o;
            mVar.E = cDNTaskInfo.f95507p;
            mVar.field_filemd5 = cDNTaskInfo.f95509r;
            com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.a(this.f321493e, mVar, cDNTaskInfo.f95503i);
            int b17 = hv1.d.f().b(mVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: " + b17);
            return b17;
        }
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 2;
        vz.y1 y1Var3 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str3 = cDNTaskInfo.f95499e;
        ((uz.a2) y1Var3).getClass();
        cronetRequestParams.url = com.tencent.mm.plugin.downloader.api.f.a(str3);
        cronetRequestParams.followRedirect = true;
        cronetRequestParams.needWriteLocal = true;
        cronetRequestParams.savePath = cDNTaskInfo.f95501g;
        cronetRequestParams.method = "GET";
        cronetRequestParams.enableBrotli = true;
        cronetRequestParams.enableUseZstdDecompress = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str4 = cDNTaskInfo.f95503i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(cDNTaskInfo.f95503i);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "ex:" + th6);
            }
            if (!hashMap.isEmpty()) {
                cronetRequestParams.enableVerifyHeader = true;
            }
        }
        if (hashMap.containsKey("Accept-Encoding")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "startCronetHttpsRequest Accept-Encoding:%s", hashMap.get("Accept-Encoding"));
        } else {
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDownloadTask = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(cronetRequestParams, com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95520i);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "use cronet， addDownloadTask: " + startCronetDownloadTask + ", cronet taskId: " + startCronetDownloadTask.taskId);
        ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95517f).put(startCronetDownloadTask.taskId, cDNTaskInfo.f95500f);
        ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95518g).put(cDNTaskInfo.f95499e, startCronetDownloadTask.taskId);
        return startCronetDownloadTask.createRet;
    }
}
