package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class t0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203090a;

    public t0(com.tencent.mm.ui.chatting.view.c1 c1Var) {
        this.f203090a = c1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        java.util.Calendar selectCalendar;
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f203090a;
        com.tencent.mm.wepicker.RemindTimePickerRemake remindTimePickerRemake = c1Var.f202892h;
        long timeInMillis = (remindTimePickerRemake == null || (selectCalendar = remindTimePickerRemake.getSelectCalendar()) == null) ? 0L : selectCalendar.getTimeInMillis();
        long j17 = timeInMillis / 1000;
        c1Var.f202898n.f59199j = j17;
        com.tencent.mm.ui.chatting.view.h0 h0Var = c1Var.f202896l;
        if (h0Var != null) {
            pj5.j jVar = (pj5.j) h0Var;
            long c17 = timeInMillis - c01.id.c();
            android.content.Context context = jVar.f355379a;
            if (c17 < 300000) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.lxc);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
            } else {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = jVar.f355380b.f202894j;
                if (z2Var != null) {
                    z2Var.B();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "hide");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(795L, 1L, 1L, false);
                boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(context);
                com.tencent.mm.storage.f9 f9Var = jVar.f355381c;
                if (isConnected) {
                    r45.lo5 lo5Var = new r45.lo5();
                    lo5Var.f379675d = jVar.f355384f;
                    lo5Var.f379677f = (int) j17;
                    lo5Var.f379676e = 1;
                    lo5Var.f379678g = 1;
                    r45.wq4 wq4Var = new r45.wq4();
                    wq4Var.f389390f = f9Var.Q0();
                    wq4Var.f389391g = f9Var.I0();
                    wq4Var.f389388d = pj5.k.f355386a.a(context, f9Var);
                    lo5Var.f379679h = new com.tencent.mm.protobuf.g(wq4Var.toByteArray());
                    com.tencent.mm.modelsimple.t1.a(jVar.f355382d, jVar.f355383e, lo5Var, new pj5.i(jVar.f355379a, jVar.f355380b, jVar.f355385g, timeInMillis));
                } else {
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var2.d(com.tencent.mm.R.string.p7a);
                    e4Var2.c();
                    java.lang.String Q0 = f9Var.Q0();
                    com.tencent.mm.autogen.mmdata.rpt.MessageScheduleReportStruct messageScheduleReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageScheduleReportStruct();
                    messageScheduleReportStruct.f59193d = 2L;
                    if (com.tencent.mm.storage.z3.R4(Q0)) {
                        messageScheduleReportStruct.f59194e = 2L;
                    } else {
                        messageScheduleReportStruct.f59194e = 1L;
                    }
                    messageScheduleReportStruct.k();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "ok");
    }
}
