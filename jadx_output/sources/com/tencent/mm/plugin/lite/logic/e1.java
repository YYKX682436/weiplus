package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes7.dex */
public class e1 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f143923d = {"libplzma", "libunrar"};

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_6d71aa8c";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        super.haveSpecifiedResourceAsync(j17, str, str2, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource projectId: %s, name: %s, version: %d", str, str2, java.lang.Integer.valueOf(i17));
        if (i18 == 1002) {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(str, str2);
            if (Ui == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource hava no local resource.");
                return;
            }
            long j18 = Ui.f217590e;
            if (j18 != i17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource local resource version: %d, specified resource version: %d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            }
        }
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackCheckSuccessAsync(j17, str, str2, i17, rVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackCheckSuccess projectId: %s, name: %s, version: %d, type: %s", str, str2, java.lang.Integer.valueOf(i17), rVar.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackFailAsync(j17, i17, i18, str, str2, i19, rVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackFail projectId: %s, name: %s, version: %d, errNo: %d, errCode: %d, type: %s", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), rVar.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackStartPeriodAsync(long j17, java.lang.String str) {
        super.onCallBackStartPeriodAsync(j17, str);
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackSuccessAsync(j17, str, str2, i17, rVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackSuccess projectId: %s, name: %s, version: %d, type: %s", str, str2, java.lang.Integer.valueOf(i17), rVar.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x xVar) {
        super.postProcessAsync(j17, xVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "postProcess projectId: %s, name: %s, version: %d，path: %s", xVar.d(), xVar.getName(), java.lang.Long.valueOf(xVar.f217590e), xVar.getPath());
    }
}
