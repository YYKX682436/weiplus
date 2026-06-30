package x44;

/* loaded from: classes4.dex */
public final class q1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        long optLong = data.optLong(dm.i4.COL_ID);
        java.lang.String optString = data.optString("appId");
        if (optLong <= 0) {
            if (optString == null || optString.length() == 0) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.QueryDownload", "the download id and app id are all empty!");
                b(g("the download id and app id are all empty!"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
                return;
            }
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.b bVar = gVar.f380d;
        h02.a z07 = !(optString == null || optString.length() == 0) ? bVar.z0(optString) : bVar.D0(optLong);
        if (z07 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", z07.field_appId);
            jSONObject.put(dm.i4.COL_ID, z07.field_downloadId);
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, z07.field_filePath);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, z07.field_fileName);
            jSONObject.put("md5", z07.field_md5);
            jSONObject.put("downloadedSize", z07.field_downloadedSize);
            jSONObject.put("totalSize", z07.field_totalSize);
            jSONObject.put("fileSize", z07.field_fileSize);
            jSONObject.put("isAutoDownload", z07.field_autoDownload);
            jSONObject.put("isAutoInstall", z07.field_autoInstall);
            jSONObject.put("status", z07.field_status);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
            m(jSONObject);
            b(jSONObject);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.QueryDownload", "query download info failed!!");
            b(w44.d.k(this, -1, "query download info failed!!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
    }
}
