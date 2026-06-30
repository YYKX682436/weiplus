package tb5;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tb5.a f417025a = new tb5.a();

    public final void a(int i17, j31.c reportInfo, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        b(i17, reportInfo, str, str2, 0L);
    }

    public final void b(int i17, j31.c reportInfo, java.lang.String str, java.lang.String str2, long j17) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        if (kotlin.jvm.internal.o.b("gh_579db1f2cf89", str)) {
            com.tencent.mm.autogen.mmdata.rpt.BrandPluginTemplateMsgReportStruct brandPluginTemplateMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BrandPluginTemplateMsgReportStruct();
            brandPluginTemplateMsgReportStruct.f55446d = brandPluginTemplateMsgReportStruct.b(dm.i4.COL_USERNAME, str2, true);
            brandPluginTemplateMsgReportStruct.f55447e = brandPluginTemplateMsgReportStruct.b("templateId", reportInfo.f297371c, true);
            brandPluginTemplateMsgReportStruct.f55448f = brandPluginTemplateMsgReportStruct.b("msgTitle", reportInfo.f297373e, true);
            brandPluginTemplateMsgReportStruct.f55449g = brandPluginTemplateMsgReportStruct.b("msgContent", reportInfo.f297374f, true);
            brandPluginTemplateMsgReportStruct.f55450h = i17;
            brandPluginTemplateMsgReportStruct.f55451i = brandPluginTemplateMsgReportStruct.b("opTimestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            brandPluginTemplateMsgReportStruct.f55452j = j17;
            brandPluginTemplateMsgReportStruct.f55453k = reportInfo.f297379k;
            brandPluginTemplateMsgReportStruct.f55454l = brandPluginTemplateMsgReportStruct.b("weappMsgId", reportInfo.f297385q, true);
            brandPluginTemplateMsgReportStruct.f55455m = brandPluginTemplateMsgReportStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, te5.v1.f418758b, true);
            brandPluginTemplateMsgReportStruct.f55456n = reportInfo.f297386r;
            brandPluginTemplateMsgReportStruct.k();
        }
    }
}
