package com.tencent.mm.plugin.sns.model;

/* loaded from: classes8.dex */
public class j implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.k f164317a;

    public j(com.tencent.mm.plugin.sns.model.k kVar) {
        this.f164317a = kVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        r45.aq3 aq3Var = (r45.aq3) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        if (aq3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        } else {
            byte[] bArr = null;
            try {
                i17 = aq3Var.f370198d;
            } catch (java.lang.Exception e17) {
                e = e17;
                i17 = -1;
            }
            try {
                bArr = aq3Var.toByteArray();
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "fetchQRCodeInfoMM end, ret=" + aq3Var.f370198d + ", urlType=" + aq3Var.f370201g + ", actionCode=" + aq3Var.f370200f);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "fetchQRCodeInfoMM, exp=" + e.toString());
                com.tencent.mm.plugin.sns.model.k kVar = this.f164317a;
                kVar.f164337g.CLIENT_CALL("onFetchQRCodeInfo", java.lang.Long.valueOf(kVar.f164336f), java.lang.Integer.valueOf(i17), 0, bArr);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
            }
            com.tencent.mm.plugin.sns.model.k kVar2 = this.f164317a;
            kVar2.f164337g.CLIENT_CALL("onFetchQRCodeInfo", java.lang.Long.valueOf(kVar2.f164336f), java.lang.Integer.valueOf(i17), 0, bArr);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
    }
}
