package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class QbCallBackBroadcast extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Runnable f210142a = new com.tencent.mm.ui.tools.g8();

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "reportBottomSheetShown, materialModel: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FilesFloatBall.QbCallBackBroadcast"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k5> r0 = com.tencent.mm.plugin.appbrand.service.k5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k5 r0 = (com.tencent.mm.plugin.appbrand.service.k5) r0
            if (r0 != 0) goto L23
            java.lang.String r9 = "reportBottomSheetShown, openMaterialService is null"
            com.tencent.mars.xlog.Log.w(r1, r9)
            return
        L23:
            bi1.g r2 = bi1.g.ATTACH
            zh1.p r0 = (zh1.p) r0
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r0 = r0.aj(r9)
            r2.toString()
            r3 = 2
            di1.f r0 = di1.g.a(r3, r2, r0)
            java.lang.String r0 = r0.f232640l
            java.lang.String r2 = "getSessionId(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "saveSessionId, materialModel: "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = ", sessionId: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.AppBrand.OpenMaterialsTempStorage"
            com.tencent.mars.xlog.Log.i(r3, r2)
            org.json.JSONObject r9 = ai1.d.e(r9)
            if (r9 == 0) goto La6
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L63
            goto La6
        L63:
            com.tencent.mm.plugin.appbrand.app.q0 r2 = com.tencent.mm.plugin.appbrand.app.q0.f75227a
            com.tencent.mm.sdk.platformtools.o4 r4 = r2.a()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.String r4 = r4.getString(r9, r5)
            goto L72
        L71:
            r4 = r5
        L72:
            if (r4 != 0) goto L7a
            java.lang.String r9 = "saveSessionId, openMaterialCollectionStr is null"
            com.tencent.mars.xlog.Log.w(r3, r9)
            goto La6
        L7a:
            com.tencent.mm.sdk.platformtools.o4 r2 = r2.a()
            if (r2 == 0) goto La1
            java.lang.String r4 = "lastSaveSessionId#OpenMaterial"
            java.lang.String r5 = r2.getString(r4, r5)
            java.lang.String r6 = "#sessionId"
            if (r5 == 0) goto L96
            java.lang.String r7 = "saveSessionId, remove old sessionId"
            com.tencent.mars.xlog.Log.i(r3, r7)
            java.lang.String r3 = r5.concat(r6)
            r2.remove(r3)
        L96:
            java.lang.String r3 = r9.concat(r6)
            r2.putString(r3, r0)
            android.content.SharedPreferences$Editor r5 = r2.putString(r4, r9)
        La1:
            if (r5 != 0) goto La4
            goto La6
        La4:
            r9 = 1
            goto La7
        La6:
            r9 = 0
        La7:
            if (r9 != 0) goto Lae
            java.lang.String r9 = "reportBottomSheetShown, saveOpenMaterialReporter fail"
            com.tencent.mars.xlog.Log.w(r1, r9)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.QbCallBackBroadcast.a(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel):void");
    }

    public final void b(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportOpenMaterialEntranceExposure, materialModel: " + materialModel);
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportOpenMaterialEntranceExposure, openMaterialService is null");
        } else {
            zh1.p pVar = (zh1.p) k5Var;
            ((di1.f) pVar.bj(bi1.g.ATTACH, materialModel, pVar.aj(materialModel), false)).d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.QbCallBackBroadcast.onReceive(android.content.Context, android.content.Intent):void");
    }
}
