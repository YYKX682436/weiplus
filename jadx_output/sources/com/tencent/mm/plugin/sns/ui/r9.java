package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r9 implements w64.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f170394a;

    public r9(com.tencent.mm.plugin.sns.ui.pa paVar) {
        this.f170394a = paVar;
    }

    @Override // w64.k
    public void a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$11");
        if (adClickActionInfo != null) {
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f170394a;
            if (com.tencent.mm.plugin.sns.ui.pa.i(paVar) != null) {
                int i17 = adClickActionInfo.f162571b;
                if (i17 == 2) {
                    if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.sns.ui.pa.i(paVar).getText().toString())) {
                        com.tencent.mm.plugin.sns.ui.pa.i(paVar).setText(com.tencent.mm.plugin.sns.ui.pa.k(paVar).btnTitle);
                    }
                    new com.tencent.mm.plugin.sns.ui.ea(com.tencent.mm.plugin.sns.ui.pa.i(paVar), adClickActionInfo.B, adClickActionInfo.A, com.tencent.mm.plugin.sns.ui.pa.k(paVar).btnTitle).execute(new java.lang.Void[0]);
                } else if (i17 == 13) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    paVar.z();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else if (i17 != 16) {
                    if (i17 != 6) {
                        if (i17 == 7) {
                            java.lang.String str = adClickActionInfo.Q;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                com.tencent.mm.plugin.sns.ui.pa.i(paVar).setText(str);
                            }
                        }
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(adClickActionInfo.f162599p)) {
                        com.tencent.mm.plugin.sns.ui.pa.i(paVar).setTextColor(-7829368);
                        com.tencent.mm.plugin.sns.ui.pa.i(paVar).setText(adClickActionInfo.f162599p);
                        com.tencent.mm.plugin.sns.ui.pa.i(paVar).setEnabled(false);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        paVar.v(false);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        paVar.x();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    }
                } else if (com.tencent.mm.plugin.sns.ui.pa.l(paVar) != null && adClickActionInfo.f162594m0 != null) {
                    java.lang.String d17 = l44.d.d(ca4.z0.t0(com.tencent.mm.plugin.sns.ui.pa.l(paVar).field_snsId), adClickActionInfo.f162594m0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    paVar.C(d17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$11");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", "adCardActionBtnInfo or mActionBtn is null, can not updateActionBtnTitle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$11");
    }
}
