package jp3;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final jp3.t f301029a = new jp3.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f301030b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f301031c = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, java.lang.Integer num, java.lang.String str2, kp3.h hVar, kp3.g gVar) {
        byte[] bArr;
        byte[] bArr2;
        if (hVar != null) {
            com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult = hVar.f310993b;
            com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult2 = hVar.f310994c;
            if (imageDataResult != null || imageDataResult2 != null) {
                int length = (imageDataResult == null || (bArr2 = imageDataResult.data) == null) ? 0 : bArr2.length;
                int length2 = (imageDataResult2 == null || (bArr = imageDataResult2.data) == null) ? 0 : bArr.length;
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[doPalmResultReport] registerImgSize:" + length + ", liveImgSize:" + length2);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = str;
                objArr[1] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
                objArr[2] = str2 == null ? "" : str2;
                objArr[3] = "palm_image_info";
                objArr[4] = 0;
                objArr[5] = java.lang.Integer.valueOf(length);
                objArr[6] = java.lang.Integer.valueOf(length2);
                g0Var.d(31121, objArr);
            }
        }
        if (gVar != null) {
            java.lang.String str3 = gVar.f310989a;
            if (str3 == null || r26.n0.N(str3)) {
                return;
            }
            long k17 = com.tencent.mm.vfs.w6.k(gVar.f310989a);
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[doPalmResultReport] videoSize:" + k17);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[6];
            objArr2[0] = str;
            objArr2[1] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
            objArr2[2] = str2 != null ? str2 : "";
            objArr2[3] = "palm_video_info";
            objArr2[4] = 0;
            objArr2[5] = java.lang.Long.valueOf(k17);
            g0Var2.d(31121, objArr2);
        }
    }

    public final void b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[onCdnUploadStart] mediaId:" + str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f301031c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        concurrentHashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.Integer num2) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f301030b;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmReportHelper", "[onCgiRequestFinished] error, requestId:" + str + ", not start but end!");
            return;
        }
        long longValue = l17.longValue();
        concurrentHashMap.remove(str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[onCgiRequestFinished] requestId:" + str + ", cost:" + currentTimeMillis + "ms, errCode:" + num + ", errMsg:" + str3 + ", respSize:" + num2);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        objArr[3] = "palm_cgi_request_ret";
        objArr[4] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[5] = java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0);
        objArr[6] = 0;
        objArr[7] = str;
        g0Var.d(31121, objArr);
    }

    public final void d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[onCgiRequestStart] requestId:" + str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f301030b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        concurrentHashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Long l17) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f301031c;
        java.lang.Long l18 = (java.lang.Long) concurrentHashMap.get(str);
        if (l18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmReportHelper", "[onCndUploadFinished] error, mediaId:" + str + ", not start but end!");
            return;
        }
        long longValue = l18.longValue();
        concurrentHashMap.remove(str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", "[onCndUploadFinished] mediaId:" + str + ", cost:" + currentTimeMillis + "ms, errCode:" + num + ", fileSize:" + l17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        if (str3 == null) {
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        objArr[2] = "";
        objArr[3] = "palm_cdn_upload_ret";
        objArr[4] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[5] = java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L);
        objArr[6] = 0;
        objArr[7] = str2;
        g0Var.d(31121, objArr);
    }
}
