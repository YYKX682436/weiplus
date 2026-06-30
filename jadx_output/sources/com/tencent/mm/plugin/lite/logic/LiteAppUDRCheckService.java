package com.tencent.mm.plugin.lite.logic;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J8\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J0\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J0\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J@\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/lite/logic/LiteAppUDRCheckService;", "Lea5/l;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getProjectIdList", "", "addToPeriod", "Lcom/tencent/wechat/aff/udr/v;", "getParameter", "", "taskId", "Lcom/tencent/wechat/aff/udr/x;", "resource", "Ljz5/f0;", "postProcessAsync", "projectId", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "version", "errNo", "errCode", "haveSpecifiedResourceAsync", "onCallBackStartPeriodAsync", "Lcom/tencent/wechat/aff/udr/r;", "type", "onCallBackCheckSuccessAsync", "onCallBackSuccessAsync", "onCallBackFailAsync", "liteAppProjectIdList", "Ljava/util/ArrayList;", "<init>", "()V", "Companion", "com/tencent/mm/plugin/lite/logic/z2", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LiteAppUDRCheckService extends ea5.l {
    public static final com.tencent.mm.plugin.lite.logic.z2 Companion = new com.tencent.mm.plugin.lite.logic.z2(null);
    private static final java.lang.String TAG = "MicroMsg.LiteApp.LiteAppUDRCheckService";
    private java.util.ArrayList<java.lang.String> liteAppProjectIdList;

    public static final java.util.ArrayList<com.tencent.wechat.aff.udr.v> configCheckParameters() {
        return Companion.a();
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList<com.tencent.wechat.aff.udr.v> getParameter() {
        return Companion.a();
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList<java.lang.String> getProjectIdList() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i(TAG, "not in main process.");
            return new java.util.ArrayList<>();
        }
        if (this.liteAppProjectIdList == null) {
            com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
            s17.getClass();
            this.liteAppProjectIdList = new java.util.ArrayList<>(new java.util.concurrent.CopyOnWriteArraySet(s17.f143952f));
        }
        com.tencent.mars.xlog.Log.i(TAG, "getProjectIdList: " + this.liteAppProjectIdList);
        return this.liteAppProjectIdList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        com.tencent.mars.xlog.Log.i(TAG, "haveSpecifiedResource projectId: %s, name: %s, version: %d", projectId, name, java.lang.Integer.valueOf(i17));
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackCheckSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i(TAG, "onCallBackCheckSuccess projectId: %s, name: %s, version: %d, type: %s", projectId, name, java.lang.Integer.valueOf(i17), type.name());
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp: %s udr check success. resource name: %s. version: %d. type: %s.", projectId, name, java.lang.Integer.valueOf(i17), type.name());
        if (type == com.tencent.wechat.aff.udr.r.TYPE_CHECK) {
            com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) s17.f143951e).get(projectId);
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = (com.tencent.liteapp.gen.LiteAppReporter) ((java.util.concurrent.ConcurrentHashMap) s17.f143953g).get(projectId);
            if (projectId.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(name) || name.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)) {
                    if (k2Var != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        k2Var.f144000e = currentTimeMillis;
                        k2Var.f144001f = currentTimeMillis;
                    }
                    if (liteAppReporter != null) {
                        liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_SUCCESS, "Ilink");
                        return;
                    }
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(name) || name.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)) {
                if (k2Var != null) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    k2Var.f144000e = currentTimeMillis2;
                    k2Var.f144001f = currentTimeMillis2;
                }
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_SUCCESS, "Ilink");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d0, code lost:
    
        if (r0.field_iLinkVersion != r4.f217590e) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0124, code lost:
    
        if (r13.iLinkVersion != r0.f217590e) goto L33;
     */
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCallBackFailAsync(long r27, int r29, int r30, java.lang.String r31, java.lang.String r32, int r33, com.tencent.wechat.aff.udr.r r34) {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.onCallBackFailAsync(long, int, int, java.lang.String, java.lang.String, int, com.tencent.wechat.aff.udr.r):void");
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackStartPeriodAsync(long j17, java.lang.String projectId) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        super.onCallBackStartPeriodAsync(j17, projectId);
        com.tencent.mars.xlog.Log.i(TAG, "onCallBackStartPeriod projectId: %s", projectId);
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp: %s udr start period.", projectId);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(projectId);
        ((java.util.concurrent.ConcurrentHashMap) s17.f143954h).put(projectId, liteAppReporter);
        liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE, "Ilink");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(projectId);
        s17.M(arrayList, "ilink", true);
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i(TAG, "onCallBackSuccess projectId: %s, name: %s, version: %d, type: %s", projectId, name, java.lang.Integer.valueOf(i17), type.name());
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp: %s udr check and download success. resource name: %s. version: %d. type: %s", projectId, name, java.lang.Integer.valueOf(i17), type.name());
        if (type == com.tencent.wechat.aff.udr.r.TYPE_PERIOD) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) s17.f143954h;
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = (com.tencent.liteapp.gen.LiteAppReporter) concurrentHashMap.get(projectId);
            if (liteAppReporter != null) {
                concurrentHashMap.remove(projectId);
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
                hashMap.put("version", java.lang.String.valueOf(i17));
                liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE_SUCCESS, "Ilink", hashMap);
            }
        }
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i(TAG, "postProcess projectId: %s, name: %s, version: %d", resource.d(), resource.getName(), java.lang.Long.valueOf(resource.f217590e));
        com.tencent.mm.plugin.lite.logic.g1.s().J(resource);
    }
}
