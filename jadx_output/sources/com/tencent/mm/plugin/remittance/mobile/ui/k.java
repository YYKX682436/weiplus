package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ow3 f156683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.l f156684e;

    public k(com.tencent.mm.plugin.remittance.mobile.ui.l lVar, r45.ow3 ow3Var) {
        this.f156684e = lVar;
        this.f156683d = ow3Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null && menuItem.getItemId() == 0) {
            r45.ow3 ow3Var = this.f156683d;
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "delete HisRcvr id:%s", ow3Var.f382575d);
            sw3.c cVar = new sw3.c(ow3Var.f382575d);
            com.tencent.mm.plugin.remittance.mobile.ui.l lVar = this.f156684e;
            lVar.f156688a.doSceneProgress(cVar, false);
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = lVar.f156688a;
            ((java.util.ArrayList) mobileRemitHistoryRecodUI.f156568i).remove(ow3Var);
            mobileRemitHistoryRecodUI.f156570n.notifyDataSetChanged();
            mobileRemitHistoryRecodUI.getClass();
            com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
            wCPayTransferToPhoneActionReportStruct.f62121d = 14;
            wCPayTransferToPhoneActionReportStruct.k();
        }
    }
}
