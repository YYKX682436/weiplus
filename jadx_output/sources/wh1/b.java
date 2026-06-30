package wh1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f445918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh1.c f445919e;

    public b(wh1.c cVar, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f445919e = cVar;
        this.f445918d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Class cls;
        java.lang.Class cls2;
        int i17;
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f445918d;
        long j17 = cronetTaskResult.totalReceiveByte;
        int i18 = cronetTaskResult.statusCode;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.errorCode);
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult2 = this.f445918d;
        java.lang.String str = cronetTaskResult2.errorMsg;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult2.statusCode);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f445918d.totalReceiveByte);
        wh1.e eVar = this.f445919e.f445922c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str, valueOf2, valueOf3, eVar.f445941w, eVar.f445943y);
        if (this.f445918d.errorCode != 0) {
            if (this.f445919e.f445922c.f445929h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted uploadFile fail already callback");
                return;
            }
            this.f445919e.f445922c.f445929h = true;
            wh1.e eVar2 = this.f445919e.f445922c;
            wh1.f fVar = eVar2.f445927f;
            ((uh1.b0) fVar).a(eVar2.f445933o, eVar2.f445931m, "upload fail:" + this.f445918d.errorCode + ":" + this.f445918d.errorMsg, 600001);
            uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
            java.lang.String appId = this.f445919e.f445922c.f445926e.getAppId();
            wh1.e eVar3 = this.f445919e.f445922c;
            java.lang.String str2 = eVar3.B;
            java.lang.String str3 = eVar3.f445931m;
            com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult3 = this.f445918d;
            ((ch1.e) h1Var).b(appId, str2, "POST", str3, cronetTaskResult3.totalSendByte, cronetTaskResult3.totalReceiveByte, i18, 2, eVar3.b(), java.lang.System.currentTimeMillis(), null, this.f445919e.f445922c.f445934p);
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 11L, 1L, false);
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 13L, java.lang.System.currentTimeMillis() - this.f445919e.f445922c.f445940v, false);
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (netType == -1) {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 7L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet uploadFile fail ret:%d", java.lang.Integer.valueOf(netType));
            return;
        }
        this.f445919e.f445922c.getClass();
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, (i18 < 100 || i18 >= 200) ? 200 == i18 ? 21 : (i18 <= 200 || i18 >= 300) ? 302 == i18 ? 23 : (i18 < 300 || i18 >= 400) ? 404 == i18 ? 25 : (i18 < 400 || i18 >= 500) ? i18 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
        if (i18 != 200 && uh1.j0.B(i18)) {
            java.lang.String str4 = this.f445918d.newLocation;
            if (!android.text.TextUtils.isEmpty(str4)) {
                wh1.e eVar4 = this.f445919e.f445922c;
                int i19 = eVar4.f445925d;
                int i27 = i19 - 1;
                eVar4.f445925d = i27;
                if (i19 > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i27), this.f445919e.f445922c.f445931m, str4);
                    wh1.e eVar5 = this.f445919e.f445922c;
                    eVar5.f445931m = str4;
                    eVar5.run();
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetworkUploadWorker", "reach the max redirect count(%d)", 15);
                if (this.f445919e.f445922c.f445929h) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                    return;
                }
                this.f445919e.f445922c.f445929h = true;
                wh1.e eVar6 = this.f445919e.f445922c;
                if (eVar6.G) {
                    ((uh1.b0) eVar6.f445927f).c(eVar6.f445933o, eVar6.f445931m, "reach the max redirect count 15", i18, 0L, uh1.j0.k(this.f445918d.webPageProfile));
                } else {
                    ((uh1.b0) eVar6.f445927f).c(eVar6.f445933o, eVar6.f445931m, "reach the max redirect count 15", i18, 0L, null);
                }
                uh1.h1 h1Var2 = (uh1.h1) nd.f.d(uh1.h1.class, true);
                java.lang.String appId2 = this.f445919e.f445922c.f445926e.getAppId();
                wh1.e eVar7 = this.f445919e.f445922c;
                java.lang.String str5 = eVar7.B;
                java.lang.String str6 = eVar7.f445931m;
                com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult4 = this.f445918d;
                ((ch1.e) h1Var2).b(appId2, str5, "POST", str6, cronetTaskResult4.totalSendByte, cronetTaskResult4.totalReceiveByte, i18, 1, eVar7.b(), java.lang.System.currentTimeMillis(), null, this.f445919e.f445922c.f445934p);
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 10L, 1L, false);
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 12L, java.lang.System.currentTimeMillis() - this.f445919e.f445922c.f445940v, false);
                return;
            }
        }
        if (this.f445919e.f445922c.f445929h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f445919e.f445922c.f445929h = true;
        if (this.f445919e.f445922c.f445928g) {
            wh1.e eVar8 = this.f445919e.f445922c;
            if (eVar8.G) {
                z17 = true;
                cls = com.tencent.mm.plugin.appbrand.profile.a.class;
                cls2 = uh1.h1.class;
                i17 = i18;
                ((uh1.b0) eVar8.f445927f).c(eVar8.f445933o, eVar8.f445931m, this.f445918d.getDataString(), i18, j17, uh1.j0.k(this.f445918d.webPageProfile));
            } else {
                z17 = true;
                cls = com.tencent.mm.plugin.appbrand.profile.a.class;
                cls2 = uh1.h1.class;
                i17 = i18;
                ((uh1.b0) eVar8.f445927f).c(eVar8.f445933o, eVar8.f445931m, this.f445918d.getDataString(), i17, j17, null);
            }
            wh1.e eVar9 = this.f445919e.f445922c;
            long j18 = this.f445918d.totalSendByte;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f445919e.f445922c.f445940v;
            eVar9.getClass();
            if (j18 <= 0 || currentTimeMillis <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis));
            } else {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(cls, z17))).c(1791L, com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 30 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 31 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 32 : com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 33 : 34, (long) ((j18 / currentTimeMillis) * 0.9765625d), false);
            }
            this.f445919e.f445921b.getClass();
        } else {
            z17 = true;
            cls = com.tencent.mm.plugin.appbrand.profile.a.class;
            cls2 = uh1.h1.class;
            i17 = i18;
            wh1.e eVar10 = this.f445919e.f445922c;
            ((uh1.b0) eVar10.f445927f).a(eVar10.f445933o, eVar10.f445931m, "force stop", 600004);
        }
        wh1.e eVar11 = this.f445919e.f445922c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload file finished taskid:%s,CronetRequestId:%s,filename: %s", eVar11.f445941w, eVar11.f445943y, eVar11.f445933o);
        wh1.e eVar12 = this.f445919e.f445922c;
        ((uh1.b0) eVar12.f445927f).b(eVar12.f445941w);
        uh1.h1 h1Var3 = (uh1.h1) nd.f.d(cls2, z17);
        java.lang.String appId3 = this.f445919e.f445922c.f445926e.getAppId();
        wh1.e eVar13 = this.f445919e.f445922c;
        java.lang.String str7 = eVar13.B;
        java.lang.String str8 = eVar13.f445931m;
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult5 = this.f445918d;
        ch1.e eVar14 = (ch1.e) h1Var3;
        java.lang.Class cls3 = cls;
        boolean z18 = z17;
        eVar14.b(appId3, str7, "POST", str8, cronetTaskResult5.totalSendByte, cronetTaskResult5.totalReceiveByte, i17, 1, eVar13.b(), java.lang.System.currentTimeMillis(), null, this.f445919e.f445922c.f445934p);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(cls3, z18))).c(1791L, 10L, 1L, false);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(cls3, z18))).c(1791L, 12L, java.lang.System.currentTimeMillis() - this.f445919e.f445922c.f445940v, false);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(cls3, z18))).c(1800L, 3L, java.lang.System.currentTimeMillis() - this.f445919e.f445922c.A, false);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(cls3, z18))).c(1800L, 1L, 1L, false);
    }
}
