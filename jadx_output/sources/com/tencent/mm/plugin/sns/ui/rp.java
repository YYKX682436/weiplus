package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rp implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f170429d;

    public rp(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f170429d = snsSightPlayerUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f170429d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.d7(snsSightPlayerUI));
            if (k17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "expose id " + k17.getSnsId());
            }
            intent.putExtra("k_expose_msg_id", k17 == null ? 0 : k17.getSnsId());
            intent.putExtra("k_username", k17 == null ? "" : k17.field_userName);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 33));
            j45.l.j(snsSightPlayerUI, "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 2) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.d7(snsSightPlayerUI));
            if (k18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            }
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            qb4.a.e(doFavoriteEvent, k18);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = snsSightPlayerUI;
            c4Var.f6327m = 17;
            doFavoriteEvent.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            boolean z17 = snsSightPlayerUI.f167372h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            if (z17) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI), 5, k18.field_snsId, 11, 0));
                i64.s1.d(i64.q1.Sight, i64.p1.Fav, i64.r1.Full, 0, k18, com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI));
            }
            if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI) == 0) {
                com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent();
                k18.getLocalid();
                am.ov ovVar = snsFavFeedForDataReportEvent.f54806g;
                ovVar.getClass();
                ovVar.f7579a = ca4.z0.T(k18);
                snsFavFeedForDataReportEvent.e();
            }
        } else if (itemId == 3) {
            int i18 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            snsSightPlayerUI.f167379r = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Conv_Type", 3);
            intent2.putExtra("select_is_ret", true);
            intent2.putExtra("mutil_select_is_ret", true);
            intent2.putExtra("image_path", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.c7(snsSightPlayerUI));
            intent2.putExtra("Retr_Msg_Type", 11);
            j45.l.v(snsSightPlayerUI, ".ui.transmit.SelectConversationUI", intent2, 4097);
        } else if (itemId == 4) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k19 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.d7(snsSightPlayerUI));
            if (k19 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            if (k19.getTimeLine().ContentObj.f369837e == 15 && ((r45.jj4) k19.getTimeLine().ContentObj.f369840h.get(0)) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            } else {
                intent3.putExtra("exdevice_open_scene_type", 2);
                intent3.putExtra("sns_local_id", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.d7(snsSightPlayerUI));
                intent3.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(snsSightPlayerUI, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
    }
}
