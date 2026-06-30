package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public final class x1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f214019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214020f;

    public x1(java.lang.String str, kotlinx.coroutines.q qVar, java.lang.String str2) {
        this.f214018d = str;
        this.f214019e = qVar;
        this.f214020f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.wallet_core.model.z1 z1Var = com.tencent.mm.wallet_core.model.z1.f214041a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPagDownloader", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        java.lang.String str = this.f214020f;
        kotlinx.coroutines.q qVar = this.f214019e;
        if (i18 == 0) {
            java.lang.String str2 = this.f214018d;
            if (com.tencent.mm.vfs.w6.j(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPagDownloader", "success download：".concat(mediaId));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.wallet_core.model.r1(str2)));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPagDownloader", "failed download：file not Exist");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, str, 3);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                com.tencent.mm.wallet_core.model.z1 z1Var2 = com.tencent.mm.wallet_core.model.z1.f214041a;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.wallet_core.model.q1(10002)));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPagDownloader", "failed download, " + hVar.field_retCode);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, str, 3);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.wallet_core.model.q1(hVar.field_retCode)));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
