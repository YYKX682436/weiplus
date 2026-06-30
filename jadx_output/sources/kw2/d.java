package kw2;

/* loaded from: classes15.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final kw2.e a(long j17, java.lang.String mediaId, ek4.b taskContext) {
        r45.vf2 vf2Var;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(taskContext, "taskContext");
        kw2.e eVar = new kw2.e();
        eVar.f312955a = taskContext.f253624a;
        eVar.f312956b = taskContext.f253625b;
        eVar.f312957c = taskContext.f253626c;
        eVar.f312958d = taskContext.f253627d;
        eVar.f312959e = pm0.v.u(j17);
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        eVar.f312965k = valueOf;
        long j18 = taskContext.f253628e;
        eVar.f312960f = j18 / 1000;
        eVar.f312961g = j18;
        eVar.f312976v = mediaId;
        eVar.f312977w = c01.id.a();
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464701r.get(mediaId);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f302841d) != null) {
            java.lang.String string = vf2Var.getString(15);
            if (string == null) {
                string = "";
            }
            eVar.U = string;
        }
        return eVar;
    }

    public final void b(kw2.e eVar, so2.i3 i3Var) {
        eVar.f312962h = i3Var.field_totalSize;
        java.lang.String str = i3Var.field_fileFormat;
        if (str == null) {
            str = "";
        }
        eVar.f312963i = str;
        try {
            eVar.f312967m = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).ij();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "generateClientStatus e:" + th6);
        }
    }

    public final void c(kw2.e downloadReportData, so2.i3 i3Var) {
        kotlin.jvm.internal.o.g(downloadReportData, "downloadReportData");
        if (i3Var == null) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", downloadReportData.Q + " updateFromMediaCacheOnStart return for " + i3Var);
            return;
        }
        downloadReportData.F = i3Var.field_cacheSize;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        downloadReportData.f312965k = valueOf;
        b(downloadReportData, i3Var);
    }

    public final void d(kw2.e downloadReportData, so2.i3 i3Var) {
        kotlin.jvm.internal.o.g(downloadReportData, "downloadReportData");
        if (i3Var == null) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", downloadReportData.Q + " updateFromMediaCacheOnStop return for " + i3Var);
            return;
        }
        if (downloadReportData.K) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "updateFromMediaCacheOnStop return for result item:" + downloadReportData);
            return;
        }
        downloadReportData.G = i3Var.field_cacheSize;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        downloadReportData.f312966l = valueOf;
        downloadReportData.f312964j = downloadReportData.G - downloadReportData.F;
        downloadReportData.f312978x = c01.id.a();
        b(downloadReportData, i3Var);
    }

    public final void e(kw2.e downloadReportData, dn.h result) {
        kotlin.jvm.internal.o.g(downloadReportData, "downloadReportData");
        kotlin.jvm.internal.o.g(result, "result");
        downloadReportData.f312962h = result.field_fileLength;
        java.lang.String field_videoFlag = result.field_videoFlag;
        kotlin.jvm.internal.o.f(field_videoFlag, "field_videoFlag");
        downloadReportData.f312963i = field_videoFlag;
        downloadReportData.f312964j = result.field_recvedBytes;
        java.lang.String valueOf = java.lang.String.valueOf(result.field_startTime);
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        downloadReportData.f312965k = valueOf;
        java.lang.String valueOf2 = java.lang.String.valueOf(result.field_endTime);
        kotlin.jvm.internal.o.g(valueOf2, "<set-?>");
        downloadReportData.f312966l = valueOf2;
        downloadReportData.f312967m = result.f241771f;
        downloadReportData.K = true;
        downloadReportData.f312978x = c01.id.a();
        java.lang.String profile = result.f241778m;
        kotlin.jvm.internal.o.f(profile, "profile");
        downloadReportData.T = r26.i0.t(profile, ",", ";", false);
    }
}
