package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class p extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jp6 f156702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156703b;

    public p(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI, r45.jp6 jp6Var) {
        this.f156703b = mobileRemitHistoryRecodUI;
        this.f156702a = jp6Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "wxname_chg_win dialog click jumpItem.action:continue");
        tw3.b.a(this.f156703b.getContext(), this.f156702a);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "wxname_chg_win dialog click jumpItem.action:exit");
        this.f156703b.U6();
    }
}
