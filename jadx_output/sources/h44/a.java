package h44;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final h44.b a(h94.a aVar, r45.x30 x30Var) {
        java.lang.String str;
        java.lang.String string;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, foldAdInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        if (x30Var == null) {
            com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, clickActionInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        if (x30Var.f389728d != 2) {
            com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, click_action_type is not download, type=" + x30Var.f389728d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        java.lang.String str2 = x30Var.f389736o;
        java.lang.String str3 = x30Var.f389735n;
        if (com.tencent.mm.sdk.platformtools.t8.N0(str2, str3)) {
            com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, appId or packageName is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        r45.rf0 rf0Var = x30Var.f389747z;
        if (rf0Var == null) {
            com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, pb download_info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        java.lang.String str4 = rf0Var.f384787d;
        java.lang.String str5 = rf0Var.f384788e;
        k44.g gVar = new k44.g(str4, str5, rf0Var.f384789f, rf0Var.f384790g, rf0Var.f384791h, rf0Var.f384792i, rf0Var.f384793m, rf0Var.f384794n, rf0Var.f384795o, rf0Var.f384796p, rf0Var.f384797q, rf0Var.f384798r);
        r45.qf0 qf0Var = x30Var.f389737p;
        if (qf0Var == null || (str = qf0Var.f383925d) == null) {
            str = str5;
        }
        if (qf0Var == null || (string = qf0Var.f383927f) == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            string = context != null ? context.getString(com.tencent.mm.R.string.j68) : null;
        }
        k44.f fVar = new k44.f(str, string);
        java.lang.String str6 = rf0Var.f384787d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
        fVar.f304073c = str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
        h44.b bVar = new h44.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278912a = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278913b = str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278914c = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278915d = bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278916e = gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278917f = fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String c17 = aVar.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278921j = c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String e17 = aVar.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278920i = e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String a17 = aVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278922k = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String d17 = aVar.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTraceId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278923l = d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTraceId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String L = ca4.m0.L(aVar.e());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278924m = L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f278925n = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        if (a44.k.f1285g.b(bVar)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return bVar;
        }
        com.tencent.mars.xlog.Log.e("AdDownloadParams", "parseFromFoldAd, checkJumpDownloadHalfScreenParamsValid failed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
        return null;
    }
}
