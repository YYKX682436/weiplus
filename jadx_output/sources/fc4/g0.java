package fc4;

/* loaded from: classes4.dex */
public final class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f261158d;

    public g0(fc4.j0 j0Var) {
        this.f261158d = j0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
        int itemId = menuItem.getItemId();
        fc4.j0 j0Var = this.f261158d;
        if (itemId == 1003) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar = snsVideoMenuEvent.f54852g;
            ixVar.f6980a = 1;
            ixVar.f6984e = 4097;
            ixVar.f6983d = fc4.j0.O6(j0Var);
            snsVideoMenuEvent.e();
            com.tencent.mm.plugin.sns.model.k7.f164367a.c(k17, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 5");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct.f59268e = (long) 2;
            msgFullScreenOperateReportStruct.f59267d = (long) 5;
            msgFullScreenOperateReportStruct.f59269f = 3L;
            msgFullScreenOperateReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1004) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + k18.getSnsId());
            intent.putExtra("k_expose_msg_id", k18.getSnsId());
            intent.putExtra("k_username", k18.field_userName);
            intent.putExtra("showShare", false);
            java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
            kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
            java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(j0Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 1006) {
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent2 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar2 = snsVideoMenuEvent2.f54852g;
            ixVar2.f6980a = 2;
            ixVar2.f6981b = 17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            int i18 = j0Var.f261172e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            ixVar2.f6982c = i18 == 0;
            ixVar2.f6983d = fc4.j0.O6(j0Var);
            snsVideoMenuEvent2.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 8");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct2.f59268e = (long) 2;
            msgFullScreenOperateReportStruct2.f59267d = (long) 8;
            msgFullScreenOperateReportStruct2.f59269f = 3L;
            msgFullScreenOperateReportStruct2.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1008) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k19 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k19 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (k19.getTimeLine().ContentObj.f369837e == 15 && ((r45.jj4) k19.getTimeLine().ContentObj.f369840h.get(0)) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            } else {
                intent2.putExtra("exdevice_open_scene_type", 2);
                intent2.putExtra("sns_local_id", fc4.j0.O6(j0Var));
                intent2.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(j0Var.getContext(), ".ui.chatting.ChattingSendDataToDeviceUI", intent2, null);
            }
        } else if (itemId == 1013) {
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent3 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar3 = snsVideoMenuEvent3.f54852g;
            ixVar3.f6980a = 3;
            ixVar3.f6983d = fc4.j0.O6(j0Var);
            snsVideoMenuEvent3.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 6");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct3.f59268e = (long) 2;
            msgFullScreenOperateReportStruct3.f59267d = (long) 6;
            msgFullScreenOperateReportStruct3.f59269f = 3L;
            msgFullScreenOperateReportStruct3.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
    }
}
