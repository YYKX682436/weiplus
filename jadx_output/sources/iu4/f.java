package iu4;

/* loaded from: classes9.dex */
public class f implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.e3 f295026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295027e;

    public f(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, com.tencent.mm.modelbase.e3 e3Var) {
        this.f295027e = gestureGuardLogicUI;
        this.f295026d = e3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene verifyPattern, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295027e;
        gestureGuardLogicUI.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.gz4) oVar.f70711b.f70700a).f375671d);
            if (gestureGuardLogicUI.f181311f == 0) {
                int i27 = gestureGuardLogicUI.f181326x;
                if (i27 == 1) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct.f62116d = 8L;
                    wCPaySaftyClickReportStruct.f62117e = 2L;
                    wCPaySaftyClickReportStruct.k();
                } else if (i27 == 2) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct2.f62116d = 10L;
                    wCPaySaftyClickReportStruct2.f62117e = 2L;
                    wCPaySaftyClickReportStruct2.k();
                }
            } else {
                java.lang.String stringExtra = gestureGuardLogicUI.getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct3.f62116d = 5L;
                    wCPaySaftyClickReportStruct3.f62117e = 2L;
                    wCPaySaftyClickReportStruct3.k();
                } else if ("next_action.switch_on_pattern".equals(stringExtra)) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct4.f62116d = 4L;
                    wCPaySaftyClickReportStruct4.f62117e = 2L;
                    wCPaySaftyClickReportStruct4.k();
                } else {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct5.f62116d = 5L;
                    wCPaySaftyClickReportStruct5.f62117e = 2L;
                    wCPaySaftyClickReportStruct5.k();
                }
            }
        }
        com.tencent.mm.modelbase.e3 e3Var = this.f295026d;
        if (e3Var != null) {
            return e3Var.callback(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
