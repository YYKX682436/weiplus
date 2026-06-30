package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class y2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f158046a;

    public y2(com.tencent.mm.plugin.remittance.ui.h3 h3Var) {
        this.f158046a = h3Var;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "preloadLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "preloadLiteApp success: " + info + ", errCode: " + i17);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f158046a;
        ((com.tencent.mm.feature.lite.i) g0Var).Qj(h3Var.f157735d, "wxalite5902f97ca32a59d74355fc2e32843e79@pay", "pages/home/home", "preloadLiteApp");
        h3Var.f157745q = true;
    }
}
