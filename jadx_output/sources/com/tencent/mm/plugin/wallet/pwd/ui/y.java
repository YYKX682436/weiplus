package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.o1 f179117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.z f179118e;

    public y(com.tencent.mm.plugin.wallet.pwd.ui.z zVar, com.tencent.mm.wallet_core.model.o1 o1Var) {
        this.f179118e = zVar;
        this.f179117d = o1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.wallet_core.model.o1 o1Var = this.f179117d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigitalCertUI", "del crt %s", o1Var.f213960c);
        this.f179118e.f179125d.doSceneProgress(new com.tencent.mm.wallet_core.model.r0(o1Var.f213960c));
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f62116d = 2L;
        wCPaySaftyClickReportStruct.f62117e = 1L;
        wCPaySaftyClickReportStruct.k();
    }
}
