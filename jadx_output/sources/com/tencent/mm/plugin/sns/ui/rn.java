package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f170428d;

    public rn(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f170428d = snsOnlineVideoActivity;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f170428d;
        if (itemId == 1003) {
            int i18 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsOnlineVideoActivity.f167329v = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar = snsVideoMenuEvent.f54852g;
            ixVar.f6980a = 1;
            ixVar.f6984e = 4097;
            ixVar.f6983d = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity);
            snsVideoMenuEvent.e();
            com.tencent.mm.plugin.sns.model.k7.f164367a.c(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.U6(snsOnlineVideoActivity), 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 5");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct.f59268e = 2;
            msgFullScreenOperateReportStruct.f59267d = 5;
            msgFullScreenOperateReportStruct.f59269f = 3L;
            msgFullScreenOperateReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1004) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity));
            if (k17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + k17.getSnsId());
            }
            intent.putExtra("k_expose_msg_id", k17 == null ? 0 : k17.getSnsId());
            intent.putExtra("k_username", k17 == null ? "" : k17.field_userName);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 33));
            j45.l.j(snsOnlineVideoActivity, "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 1006) {
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent2 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar2 = snsVideoMenuEvent2.f54852g;
            ixVar2.f6980a = 2;
            ixVar2.f6981b = 17;
            int i19 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            int i27 = snsOnlineVideoActivity.f167315h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            ixVar2.f6982c = i27 == 0;
            ixVar2.f6983d = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity);
            snsVideoMenuEvent2.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 8");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct2.f59268e = 2;
            msgFullScreenOperateReportStruct2.f59267d = 8;
            msgFullScreenOperateReportStruct2.f59269f = 3L;
            msgFullScreenOperateReportStruct2.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1008) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity));
            if (k18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (k18.getTimeLine().ContentObj.f369837e == 15 && ((r45.jj4) k18.getTimeLine().ContentObj.f369840h.get(0)) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
                return;
            } else {
                intent2.putExtra("exdevice_open_scene_type", 2);
                intent2.putExtra("sns_local_id", com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity));
                intent2.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(snsOnlineVideoActivity, ".ui.chatting.ChattingSendDataToDeviceUI", intent2, null);
            }
        } else if (itemId == 1013) {
            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent3 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
            am.ix ixVar3 = snsVideoMenuEvent3.f54852g;
            ixVar3.f6980a = 3;
            ixVar3.f6983d = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity);
            snsVideoMenuEvent3.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 6");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct3.f59268e = 2;
            msgFullScreenOperateReportStruct3.f59267d = 6;
            msgFullScreenOperateReportStruct3.f59269f = 3L;
            msgFullScreenOperateReportStruct3.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
    }
}
