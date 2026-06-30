package za4;

/* loaded from: classes12.dex */
public class f0 extends za4.o {

    /* renamed from: f, reason: collision with root package name */
    public final za4.e0 f471078f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f471079g;

    public f0(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, za4.e0 e0Var) {
        this.f471158a = str;
        this.f471159b = str2;
        this.f471079g = str2 + "_tmp";
        this.f471160c = z17;
        this.f471161d = i17;
        this.f471162e = i18;
        this.f471078f = e0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadSmallFileTask", "add downloadTask, url=" + str);
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        int i17 = this.f471161d;
        if (i17 == 41) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 133) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 1000000001) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 44) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 45) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 61) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 2;
        }
        if (i17 != 62) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0256, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0259, code lost:
    
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025e, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0261, code lost:
    
        r3.getInputStream().close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0271, code lost:
    
        r3.disconnect();
        r0 = com.tencent.mm.sdk.platformtools.w2.a(r39.f471158a);
        r2 = a();
        r3 = (int) (java.lang.System.currentTimeMillis() - r21);
        r4 = new m21.x();
        r4.a("20UrlMd5", r0 + ",");
        r4.a("21MediaType", r2 + ",");
        r4.a("22IsPreload", (r39.f471160c ? 1 : 0) + ",");
        r4.a("23CostTime", r3 + ",");
        r4.a("24RetCode", r5 + ",");
        r4.a(r8, r39.f471162e + ",");
        r4.a(r28, r30 + ",");
        r4.a(r23, (r21 / 1000) + ",");
        r0 = new java.lang.StringBuilder(r20);
        r0.append(r4.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13572, r4);
        r4 = r19;
        r2 = r27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2);
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026a, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025b, code lost:
    
        r7.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0612 A[Catch: IOException -> 0x0615, TRY_LEAVE, TryCatch #13 {IOException -> 0x0615, blocks: (B:73:0x060d, B:61:0x0612), top: B:72:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x060d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0725 A[Catch: IOException -> 0x0728, TRY_LEAVE, TryCatch #20 {IOException -> 0x0728, blocks: (B:92:0x0720, B:79:0x0725), top: B:91:0x0720 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0720 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r40) {
        /*
            Method dump skipped, instructions count: 2077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.f0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        za4.e0 e0Var = this.f471078f;
        if (str == null) {
            e0Var.c(this.f471159b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadSmallFileTask", "onPostExecute, errMsg=" + str + ", url=" + this.f471158a);
            e0Var.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
    }
}
