package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class y4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f206257e;

    public y4(com.tencent.mm.ui.chatting.s4 s4Var, java.lang.String str) {
        this.f206257e = s4Var;
        this.f206256d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.s4 s4Var = this.f206257e;
        if (itemId == 0) {
            com.tencent.mm.ui.chatting.h4 h4Var = s4Var.f202659b;
            java.lang.String str = this.f206256d;
            com.tencent.mm.ui.chatting.h4.y(h4Var, str);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(18890, 5, 0, str, "", "");
            g0Var.d(28838, 0, 1, 0, 0, 2);
            com.tencent.mm.ui.chatting.h4.O(4, 0, s4Var.f202659b.f201647l);
            boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
            com.tencent.mm.ui.chatting.h4.u(s4Var.f202659b, "view_clk", Ri);
            if (Ri) {
                g0Var.A(182, 218);
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(56);
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.ui.chatting.h4.w(s4Var.f202659b);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.d(11701, 1, 0, 0, 1, 3);
        intent.putExtra("key_username", s4Var.f202659b.I());
        intent.putExtra("key_way", 0);
        intent.putExtra("pay_channel", 11);
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
            j45.l.j(s4Var.f202659b.f201645j.g(), "luckymoney", ".ui.LuckyMoneyNewYearSendUI", intent, null);
        } else {
            j45.l.j(s4Var.f202659b.f201645j.g(), "luckymoney", ".ui.LuckyMoneyNewYearSendUIV2", intent, null);
            com.tencent.mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new com.tencent.mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct();
            luckyMoneyNewYearReportStruct.f58699e = 1L;
            luckyMoneyNewYearReportStruct.f58698d = 17L;
            luckyMoneyNewYearReportStruct.k();
        }
        g0Var2.d(28838, 0, 1, 0, 0, 3);
        com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
        hBReportNewStruct.f58415d = 1L;
        hBReportNewStruct.k();
        com.tencent.mm.ui.chatting.h4.O(5, 0, s4Var.f202659b.f201647l);
    }
}
