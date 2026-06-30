package com.tencent.mm.service;

/* loaded from: classes12.dex */
public class ProcessService$MMProcessService extends com.tencent.mm.service.CommonProcessService {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.booter.k f193209i = null;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (((r0 == 788529167 || r0 == 788529166) || z65.c.a()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d() {
        /*
            j62.e r0 = j62.e.g()
            java.lang.String r1 = "clicfg_notify_service_threadpool_enable"
            r2 = 0
            int r0 = r0.i(r1, r2, r2, r2)
            r1 = 1
            if (r0 == r1) goto L2c
            int r0 = com.tencent.mm.sdk.platformtools.z.f193112h
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 == r3) goto L1d
            r3 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r0 != r3) goto L1b
            goto L1d
        L1b:
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L29
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L2d
        L2c:
            r2 = r1
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enableThreadPool: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MMProcessService"
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.service.ProcessService$MMProcessService.d():boolean");
    }

    @Override // com.tencent.mm.service.CommonProcessService
    public java.lang.String c() {
        return "MicroMsg.MMProcessService";
    }

    @Override // com.tencent.mm.service.CommonProcessService, android.app.Service
    public void onCreate() {
        try {
            int i17 = com.tencent.mm.platformtools.BroadcastHelper.f72400a;
            com.tencent.mm.booter.k kVar = (com.tencent.mm.booter.k) com.tencent.mm.platformtools.BroadcastHelper.class.newInstance();
            this.f193209i = kVar;
            kVar.registerBroadcasts();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMProcessService", "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s ", e17.getMessage());
        }
        super.onCreate();
    }

    @Override // com.tencent.mm.service.CommonProcessService, android.app.Service
    public void onDestroy() {
        com.tencent.mm.booter.k kVar = this.f193209i;
        if (kVar != null) {
            try {
                kVar.unRegisterBroadcasts();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMProcessService", "onDestroy unRegisterBroadcasts() Exception = %s ", e17.getMessage());
            }
        }
        super.onDestroy();
    }
}
