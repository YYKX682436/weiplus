package s50;

@j95.b
/* loaded from: classes8.dex */
public class r0 extends i95.w implements u50.y {
    public void wi(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final int i17, final java.lang.String str5, final long j17, final long j18, final java.lang.String str6, final int i18) {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: s50.r0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.autogen.mmdata.rpt.SearchStaytimeReportStruct searchStaytimeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SearchStaytimeReportStruct();
                searchStaytimeReportStruct.f60160d = searchStaytimeReportStruct.b("Query", str, true);
                searchStaytimeReportStruct.f60169m = searchStaytimeReportStruct.b("SessionID", str2, true);
                searchStaytimeReportStruct.f60161e = searchStaytimeReportStruct.b("SearchId", str3, true);
                searchStaytimeReportStruct.f60162f = i17;
                searchStaytimeReportStruct.f60163g = searchStaytimeReportStruct.b("ParentSearchId", str6, true);
                searchStaytimeReportStruct.f60170n = searchStaytimeReportStruct.b("RequestId", str4, true);
                searchStaytimeReportStruct.f60164h = j17;
                searchStaytimeReportStruct.f60165i = i18;
                searchStaytimeReportStruct.f60166j = java.lang.System.currentTimeMillis();
                searchStaytimeReportStruct.f60167k = searchStaytimeReportStruct.b("ExtInfo", str5, true);
                searchStaytimeReportStruct.f60168l = j18;
                searchStaytimeReportStruct.k();
                su4.k3.m(searchStaytimeReportStruct);
            }
        });
    }
}
