package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class l implements com.tencent.mm.plugin.remittance.mobile.ui.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156688a;

    public l(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f156688a = mobileRemitHistoryRecodUI;
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.x
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv click!");
        r45.ow3 ow3Var = (r45.ow3) view.getTag();
        int i17 = ow3Var.f382580i;
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f156688a;
        if (i17 != 0) {
            db5.e1.E(mobileRemitHistoryRecodUI.getContext(), mobileRemitHistoryRecodUI.getResources().getString(com.tencent.mm.R.string.f492546gx1), "", mobileRemitHistoryRecodUI.getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
        } else {
            mobileRemitHistoryRecodUI.doSceneProgress(new sw3.h("", ow3Var.f382575d, mobileRemitHistoryRecodUI.f156565f, 2), true);
        }
        int i18 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI.f156562r;
        mobileRemitHistoryRecodUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = 13;
        wCPayTransferToPhoneActionReportStruct.k();
    }
}
