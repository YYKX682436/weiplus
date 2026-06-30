package nk;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nk.c f337940a = new nk.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f337941b = com.tencent.mm.sdk.platformtools.o4.L();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f337943d = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.analyse.DownloadAnalyse$AnalyseData f337942c = new com.tencent.mm.analyse.DownloadAnalyse$AnalyseData(new java.util.HashSet());

    public final void a(java.lang.String taskID, com.tencent.mars.cdn.CdnManager.C2CDownloadResult result, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Iterator it = f337942c.f53188d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) obj).f53190e, taskID)) {
                    break;
                }
            }
        }
        com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator downloadAnalyse$DownloadIndicator = (com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) obj;
        if (downloadAnalyse$DownloadIndicator == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = downloadAnalyse$DownloadIndicator.f53189d;
        sb6.append(j17);
        sb6.append('-');
        java.lang.String str = downloadAnalyse$DownloadIndicator.f53190e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.util.HashSet hashSet = f337943d;
        if (hashSet.contains(sb7)) {
            return;
        }
        hashSet.add(sb7);
        long j18 = result.fileSize;
        downloadAnalyse$DownloadIndicator.f53194i = j18;
        downloadAnalyse$DownloadIndicator.f53196n = 0L;
        if (j18 > 0) {
            long j19 = downloadAnalyse$DownloadIndicator.f53195m;
            if (j19 > j18) {
                downloadAnalyse$DownloadIndicator.f53196n = result.recvedBytes;
            } else {
                long j27 = result.recvedBytes;
                if (j19 + j27 > j18) {
                    downloadAnalyse$DownloadIndicator.f53196n = (j19 + j27) - j18;
                }
            }
        }
        downloadAnalyse$DownloadIndicator.f53195m += result.recvedBytes;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAnalyse", "stopDownload type:" + i17 + " receive:" + result.recvedBytes + " target:" + downloadAnalyse$DownloadIndicator);
        com.tencent.mm.autogen.mmdata.rpt.RepeatDownloadStruct repeatDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.RepeatDownloadStruct();
        repeatDownloadStruct.f59985d = j17;
        repeatDownloadStruct.f59986e = repeatDownloadStruct.b("taskID", str, true);
        repeatDownloadStruct.f59987f = repeatDownloadStruct.b("mediaID", downloadAnalyse$DownloadIndicator.f53192g, true);
        repeatDownloadStruct.f59990i = repeatDownloadStruct.b("snsID", downloadAnalyse$DownloadIndicator.f53191f, true);
        repeatDownloadStruct.f59992k = repeatDownloadStruct.b("downloadFlag", downloadAnalyse$DownloadIndicator.f53193h, true);
        repeatDownloadStruct.f59991j = (int) result.recvedBytes;
        repeatDownloadStruct.f59988g = downloadAnalyse$DownloadIndicator.f53196n;
        repeatDownloadStruct.f59993l = i17;
        repeatDownloadStruct.f59994m = downloadAnalyse$DownloadIndicator.f53199q;
        repeatDownloadStruct.f59995n = repeatDownloadStruct.b("url", downloadAnalyse$DownloadIndicator.f53200r, true);
        repeatDownloadStruct.k();
    }
}
