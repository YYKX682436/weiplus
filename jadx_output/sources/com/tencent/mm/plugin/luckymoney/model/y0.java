package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class y0 implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.z0 f145714a;

    public y0(com.tencent.mm.plugin.luckymoney.model.z0 z0Var) {
        this.f145714a = z0Var;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.m mVar = n1Var.f71106d;
        java.lang.String str = (mVar == null || android.text.TextUtils.isEmpty(mVar.field_fullpath)) ? "" : mVar.field_fullpath;
        com.tencent.mm.modelcdntran.m1 m1Var = com.tencent.mm.modelcdntran.m1.f71077f;
        com.tencent.mm.modelcdntran.m1 m1Var2 = n1Var.f71103a;
        if (m1Var2 != m1Var) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "voice download fullPath: %s %s %s", str, m1Var2, java.lang.Integer.valueOf(n1Var.f71105c));
        }
        int ordinal = m1Var2.ordinal();
        com.tencent.mm.plugin.luckymoney.model.z0 z0Var = this.f145714a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (n1Var.f71108f == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but getSceneResult is null");
                    com.tencent.mm.plugin.luckymoney.model.z0.b(z0Var, str);
                    return;
                }
                long k17 = com.tencent.mm.vfs.w6.k(str);
                if (k17 >= z0Var.f145727d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but realLength:%s < voiceFileLength:%s, need to delete", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(z0Var.f145727d));
                    com.tencent.mm.vfs.w6.h(str);
                    return;
                }
            }
            if (ordinal == 2) {
                dn.g gVar = n1Var.f71107e;
                if (gVar != null) {
                    long j17 = gVar.field_finishedLength;
                    long j18 = n1Var.f71107e.field_toltalLength;
                    return;
                }
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download error");
        com.tencent.mm.plugin.luckymoney.model.z0.b(z0Var, str);
    }
}
