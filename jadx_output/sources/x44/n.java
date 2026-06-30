package x44;

/* loaded from: classes4.dex */
public final class n implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static final x44.n f451859d = new x44.n();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f451860e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f451861f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f451862g;

    public static /* synthetic */ org.json.JSONObject d(x44.n nVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureFileDownloadInfo$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        org.json.JSONObject a17 = nVar.a(j17, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureFileDownloadInfo$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return a17;
    }

    public final org.json.JSONObject a(long j17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureFileDownloadInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        java.util.Map map = f451860e;
        if (z17 || !map.containsKey(java.lang.Long.valueOf(j17))) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
            gVar.requireAccountInitialized();
            h02.a D0 = gVar.f380d.D0(j17);
            if (D0 != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", D0.field_appId);
                jSONObject.put(dm.i4.COL_ID, D0.field_downloadId);
                jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, D0.field_filePath);
                jSONObject.put("md5", D0.field_md5);
                jSONObject.put("downloadedSize", D0.field_downloadedSize);
                jSONObject.put("fileSize", D0.field_fileSize);
                jSONObject.put("isAutoDownload", D0.field_autoDownload);
                jSONObject.put("isAutoInstall", D0.field_autoInstall);
                jSONObject.put("status", D0.field_status);
                java.lang.String str = D0.field_packageName;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("pkg", str);
                jSONObject.put("fileType", D0.field_fileType);
                jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, D0.field_fileName);
                jSONObject.put("downloaderType", D0.field_downloaderType);
                java.lang.String str2 = D0.field_downloadUrl;
                jSONObject.put("url", str2 != null ? str2 : "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                map.put(valueOf, jSONObject);
            }
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureFileDownloadInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return jSONObject2;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the task failed, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadFailed");
                f451859d.g(j17, d17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when failed, download id is " + j17);
            }
            n(j17);
            f451860e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskFailed, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the task finished, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadFinished");
                d17.put("progress", 100);
                f451859d.g(j17, d17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when finish, download id is " + j17);
            }
            n(j17);
            f451860e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskFinished, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final boolean e(long j17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                z17 = ((java.util.LinkedHashMap) f451861f).get(java.lang.Long.valueOf(j17)) != null;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return z17;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void g(long j17, org.json.JSONObject obj) {
        x44.j0 j0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                j0Var = (x44.j0) ((java.util.LinkedHashMap) f451861f).get(java.lang.Long.valueOf(j17));
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        if (j0Var != null) {
            x44.e3 e3Var = (x44.e3) j0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            try {
                com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the callback event notified!!");
                w44.a aVar = e3Var.f451827a;
                if (aVar != null) {
                    aVar.a("onDownloadStateChange", obj);
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "there is an exception, " + th7.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject a17 = a(j17, j18 == 0 || j19 == 0);
            if (a17 != null) {
                a17.put("state", "downloadProgressChanged");
                a17.put("downloadedSize", j18);
                long optLong = a17.optLong("fileSize", j19);
                if (0 != optLong) {
                    a17.put("progress", a06.d.b(((((float) j18) * 1.0f) / ((float) optLong)) * 100));
                }
                f451859d.g(j17, a17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when progress changed, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskProgressChanged, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadResumed");
                f451859d.g(j17, d17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when resume, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskResumed, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void j(long j17, x44.j0 c17) {
        com.tencent.mm.plugin.downloader.model.r0 i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        kotlin.jvm.internal.o.g(c17, "c");
        synchronized (this) {
            try {
                f451861f.put(java.lang.Long.valueOf(j17), c17);
                if (!f451862g) {
                    if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.tencent.mm.plugin.downloader.model.r0.i()) != null) {
                        i17.a(this);
                    }
                    f451862g = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadPaused");
                f451859d.g(j17, d17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when removed, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskPaused, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadStarted");
                f451859d.g(j17, d17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskStarted, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.downloader.model.r0 i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the task removed, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadRemoved");
                x44.n nVar = f451859d;
                nVar.g(j17, d17);
                java.lang.String optString = d17.optString("url");
                if (optString == null) {
                    optString = "";
                }
                int optInt = d17.optInt("downloaderType", 0);
                if (nVar.e(j17)) {
                    if ((optString.length() > 0) && 2 == optInt) {
                        com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "it is going to delete tmp file of download file");
                        if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.tencent.mm.plugin.downloader.model.r0.i()) != null) {
                            i17.f(optString);
                        }
                    }
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task info is null when removed, download id is " + j17);
            }
            n(j17);
            f451860e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Download", "the task onTaskRemoved, error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void n(long j17) {
        com.tencent.mm.plugin.downloader.model.r0 i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                java.util.Map map = f451861f;
                map.remove(java.lang.Long.valueOf(j17));
                if (map.isEmpty() && f451862g) {
                    if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.tencent.mm.plugin.downloader.model.r0.i()) != null) {
                        i17.s(this);
                    }
                    com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the download call back is removed");
                    f451862g = false;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }
}
