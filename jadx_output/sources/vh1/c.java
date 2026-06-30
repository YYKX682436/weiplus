package vh1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f437011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh1.d f437012e;

    public c(vh1.d dVar, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f437012e = dVar;
        this.f437011d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f437011d;
        int i17 = (int) cronetTaskResult.totalReceiveByte;
        int i18 = cronetTaskResult.statusCode;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.errorCode);
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult2 = this.f437011d;
        java.lang.String str = cronetTaskResult2.errorMsg;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult2.statusCode);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f437011d.totalReceiveByte);
        vh1.f fVar = this.f437012e.f437015c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str, valueOf2, valueOf3, fVar.f437033v, fVar.f437035x);
        if (this.f437011d.errorCode != 0) {
            if (this.f437012e.f437015c.f437022h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted downloadFile fail already callback");
                return;
            }
            this.f437012e.f437015c.f437022h = true;
            vh1.f fVar2 = this.f437012e.f437015c;
            fVar2.f437020f.d(fVar2.f437024m, fVar2.f437023i, "download fail:" + this.f437011d.errorCode + ":" + this.f437011d.errorMsg, 600001);
            uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
            java.lang.String appId = this.f437012e.f437015c.f437019e.getAppId();
            vh1.f fVar3 = this.f437012e.f437015c;
            ((ch1.e) h1Var).b(appId, fVar3.f437036y, "GET", fVar3.f437023i, 0L, (long) i17, i18, 2, fVar3.c(), java.lang.System.currentTimeMillis(), this.f437012e.f437015c.f437024m, "");
            uh1.j0.E(1197L, 11L, 1L);
            uh1.j0.E(1197L, 13L, java.lang.System.currentTimeMillis() - this.f437012e.f437015c.f437032u);
            return;
        }
        this.f437012e.f437015c.getClass();
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1197L, (i18 < 100 || i18 >= 200) ? 200 == i18 ? 21 : (i18 <= 200 || i18 >= 300) ? 302 == i18 ? 23 : (i18 < 300 || i18 >= 400) ? 404 == i18 ? 25 : (i18 < 400 || i18 >= 500) ? i18 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
        java.lang.String str2 = "";
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f437011d.getHeaderMap().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.equalsIgnoreCase("Content-Type") || key.equalsIgnoreCase("content-type")) {
                vh1.f fVar4 = this.f437012e.f437015c;
                str2 = fVar4.e(value, fVar4.f437023i);
            }
        }
        if (i18 != 200 && uh1.j0.B(i18)) {
            java.lang.String str3 = this.f437011d.newLocation;
            if (!android.text.TextUtils.isEmpty(str3)) {
                vh1.f fVar5 = this.f437012e.f437015c;
                int i19 = fVar5.f437018d;
                int i27 = i19 - 1;
                fVar5.f437018d = i27;
                if (i19 > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i27), this.f437012e.f437015c.f437023i, str3);
                    vh1.f fVar6 = this.f437012e.f437015c;
                    fVar6.f437023i = str3;
                    fVar6.run();
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDownloadWorker", "reach the max redirect count(%d)", 15);
                if (this.f437012e.f437015c.f437022h) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                    return;
                }
                this.f437012e.f437015c.f437022h = true;
                vh1.f fVar7 = this.f437012e.f437015c;
                if (fVar7.E) {
                    fVar7.f437020f.b(fVar7.f437024m, str2, fVar7.f437023i, i18, 0L, uh1.j0.k(this.f437011d.webPageProfile));
                } else {
                    fVar7.f437020f.b(fVar7.f437024m, str2, fVar7.f437023i, i18, 0L, null);
                }
                uh1.h1 h1Var2 = (uh1.h1) nd.f.d(uh1.h1.class, true);
                java.lang.String appId2 = this.f437012e.f437015c.f437019e.getAppId();
                vh1.f fVar8 = this.f437012e.f437015c;
                ((ch1.e) h1Var2).b(appId2, fVar8.f437036y, "GET", fVar8.f437023i, 0L, i17, i18, 1, fVar8.c(), java.lang.System.currentTimeMillis(), this.f437012e.f437015c.f437024m, str2);
                uh1.j0.E(1197L, 10L, 1L);
                uh1.j0.E(1197L, 12L, java.lang.System.currentTimeMillis() - this.f437012e.f437015c.f437032u);
                return;
            }
        }
        java.lang.String str4 = str2;
        if (this.f437012e.f437015c.f437022h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f437012e.f437015c.f437022h = true;
        if (this.f437012e.f437015c.f437021g) {
            vh1.f fVar9 = this.f437012e.f437015c;
            if (fVar9.E) {
                fVar9.f437020f.b(fVar9.f437024m, str4, fVar9.f437023i, i18, i17, uh1.j0.k(this.f437011d.webPageProfile));
            } else {
                fVar9.f437020f.b(fVar9.f437024m, str4, fVar9.f437023i, i18, i17, null);
            }
            vh1.f fVar10 = this.f437012e.f437015c;
            long j17 = this.f437011d.totalReceiveByte;
            long c17 = fVar10.c();
            fVar10.getClass();
            if (j17 <= 0 || c17 <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17));
            } else {
                uh1.j0.E(1197L, com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 30 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 31 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 32 : com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 33 : 34, (long) ((j17 / c17) * 0.9765625d));
            }
            this.f437012e.f437014b.getClass();
        } else {
            vh1.f fVar11 = this.f437012e.f437015c;
            fVar11.f437020f.d(fVar11.f437024m, fVar11.f437023i, "force stop", 600004);
        }
        vh1.f fVar12 = this.f437012e.f437015c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s", fVar12.f437033v, fVar12.f437035x, str4);
        vh1.f fVar13 = this.f437012e.f437015c;
        fVar13.f437020f.e(fVar13.f437033v);
        uh1.h1 h1Var3 = (uh1.h1) nd.f.d(uh1.h1.class, true);
        java.lang.String appId3 = this.f437012e.f437015c.f437019e.getAppId();
        vh1.f fVar14 = this.f437012e.f437015c;
        ((ch1.e) h1Var3).b(appId3, fVar14.f437036y, "GET", fVar14.f437023i, 0L, i17, i18, 1, fVar14.c(), java.lang.System.currentTimeMillis(), this.f437012e.f437015c.f437024m, str4);
        uh1.j0.E(1197L, 10L, 1L);
        uh1.j0.E(1197L, 12L, java.lang.System.currentTimeMillis() - this.f437012e.f437015c.f437032u);
    }
}
