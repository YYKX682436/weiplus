package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class u7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        dn.k kVar;
        if (jSONObject == null) {
            this.f143443f.a("fail:data is null");
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiUploadToCommonCDN", "data is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "JsApiUploadToCommonCDN data=" + jSONObject);
        int optInt = jSONObject.optInt("appType");
        int optInt2 = jSONObject.optInt("fileType");
        int optInt3 = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_BIZ_ID, 3);
        java.lang.String key = jSONObject.optString("fileKey");
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        java.lang.String optString2 = jSONObject.optString("thumbFilePath");
        boolean optBoolean = jSONObject.optBoolean("isStorageMode");
        jSONObject.optInt("snsUploadVersion");
        java.lang.String optString3 = jSONObject.optString("action");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "filePath invalid");
            this.f143443f.a("fail:filePath invalid");
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
                optString = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString);
            } else {
                if (optString.startsWith("/")) {
                    optString = optString.substring(1);
                }
                optString = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str).path + "/" + optString;
            }
            if (optString.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "get full file path fail: ".concat(optString));
                this.f143443f.a("fail:get full file path fail");
                return;
            }
        }
        if (!android.text.TextUtils.isEmpty(optString2)) {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString2)) {
                optString2 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString2);
            }
            if (optString2.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "get full thumb file path fail: " + optString);
                this.f143443f.a("fail:get full thumb file path fail");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(key)) {
            key = kk.k.g(optString.getBytes());
        }
        if (optString3.equals("cancel")) {
            if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelUploadTaskWithResult(key, new com.tencent.mars.cdn.CdnManager.C2CUploadResult()) == 0) {
                this.f143443f.a("fail:cancel succeed");
                java.util.HashMap hashMap = ra3.a.f393486a;
                kotlin.jvm.internal.o.g(key, "key");
                java.util.HashMap hashMap2 = ra3.a.f393486a;
                dn.m mVar = (dn.m) hashMap2.get(key);
                if (mVar != null && (kVar = mVar.f241787f) != null) {
                    dn.g gVar = new dn.g();
                    gVar.field_finishedLength = mVar.B1;
                    dn.h hVar = new dn.h();
                    hVar.field_retCode = -10008;
                    kVar.r4(key, 0, gVar, hVar, false);
                }
                hashMap2.remove(key);
                return;
            }
            return;
        }
        dn.m mVar2 = new dn.m();
        mVar2.f241785d = "task_JsApiUploadToCommonCDN";
        mVar2.field_fileType = optInt2;
        mVar2.field_bzScene = 2;
        mVar2.f241789h = optInt3;
        mVar2.field_appType = optInt;
        mVar2.field_mediaId = key;
        mVar2.field_fullpath = optString;
        mVar2.field_thumbpath = optString2;
        mVar2.field_needStorage = optBoolean;
        mVar2.f241787f = new com.tencent.mm.plugin.lite.jsapi.comms.t7(this);
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2)) {
            this.f143443f.a("fail:cdn com call error");
            return;
        }
        java.util.HashMap hashMap3 = ra3.a.f393486a;
        java.util.HashMap hashMap4 = ra3.a.f393486a;
        java.lang.String field_mediaId = mVar2.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        hashMap4.put(field_mediaId, mVar2);
    }
}
