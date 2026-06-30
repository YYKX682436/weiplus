package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI f170745d;

    public wd(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        this.f170745d = snsAdStreamVideoPlayUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        java.lang.String str3 = "onMMMenuItemSelected";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = this.f170745d;
        switch (itemId) {
            case 1002:
                str = "onMMMenuItemSelected";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                int i19 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                snsAdStreamVideoPlayUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("ad_video_title", snsAdStreamVideoPlayUI.f166784q);
                intent.putExtra("Retr_Msg_Type", 2);
                j45.l.v(snsAdStreamVideoPlayUI, ".ui.transmit.SelectConversationUI", intent, 999);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
            case 1003:
                str = "onMMMenuItemSelected";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                int i27 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                snsAdStreamVideoPlayUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_link", snsAdStreamVideoPlayUI.f166778h);
                intent2.putExtra("Ksnsupload_type", 11);
                intent2.putExtra("Ksnsupload_title", snsAdStreamVideoPlayUI.f166784q);
                intent2.putExtra("Ksnsupload_imgurl", snsAdStreamVideoPlayUI.f166779i);
                intent2.putExtra("KSnsStreamVideoTotalTime", snsAdStreamVideoPlayUI.f166773J);
                intent2.putExtra("KSnsStreamVideoWroding", snsAdStreamVideoPlayUI.G);
                intent2.putExtra("KSnsStreamVideoWebUrl", snsAdStreamVideoPlayUI.H);
                intent2.putExtra("KSnsStreamVideoAduxInfo", snsAdStreamVideoPlayUI.f166787t);
                intent2.putExtra("KSnsStreamVideoPublishId", snsAdStreamVideoPlayUI.f166788u);
                intent2.putExtra("need_result", true);
                intent2.putExtra("key_snsad_statextstr", snsAdStreamVideoPlayUI.E);
                int i28 = snsAdStreamVideoPlayUI.f166790w;
                java.lang.String str5 = "sns_";
                if (i28 == i64.o1.Sight.f289269d || i28 == i64.o1.AdUrl.f289269d) {
                    str5 = "sns_" + snsAdStreamVideoPlayUI.f166793z;
                } else if (i28 == i64.o1.Chat.f289269d || i28 == i64.o1.TalkChat.f289269d) {
                    str5 = "msg_" + snsAdStreamVideoPlayUI.A;
                } else if (i28 == i64.o1.Fav.f289269d) {
                    str5 = "fav_" + c01.z1.r() + "_" + snsAdStreamVideoPlayUI.B;
                }
                java.lang.String a17 = c01.n2.a(str5);
                c01.n2.d().c(a17, true).i("prePublishId", str5);
                intent2.putExtra("reportSessionId", a17);
                intent2.setClass(snsAdStreamVideoPlayUI, com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
                snsAdStreamVideoPlayUI.startActivityForResult(intent2, ce1.f.CTRL_INDEX);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
            case 1004:
                int i29 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                snsAdStreamVideoPlayUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).wi(doFavoriteEvent, 0, snsAdStreamVideoPlayUI.f166773J, snsAdStreamVideoPlayUI.f166784q, "", snsAdStreamVideoPlayUI.f166778h, snsAdStreamVideoPlayUI.G, snsAdStreamVideoPlayUI.H, snsAdStreamVideoPlayUI.f166779i, snsAdStreamVideoPlayUI.f166780m, snsAdStreamVideoPlayUI.f166791x, snsAdStreamVideoPlayUI.f166787t, snsAdStreamVideoPlayUI.f166788u, snsAdStreamVideoPlayUI.E);
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6323i = snsAdStreamVideoPlayUI;
                c4Var.f6327m = 24;
                doFavoriteEvent.e();
                if (doFavoriteEvent.f54091h.f6433a != 0 || (i18 = snsAdStreamVideoPlayUI.f166790w) == 0) {
                    str = "onMMMenuItemSelected";
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                } else {
                    str = "onMMMenuItemSelected";
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    i64.s1.e(i64.p1.Fav, snsAdStreamVideoPlayUI.f166788u, snsAdStreamVideoPlayUI.f166787t, snsAdStreamVideoPlayUI.f166789v, i18, snsAdStreamVideoPlayUI.f166791x, snsAdStreamVideoPlayUI.f166792y, snsAdStreamVideoPlayUI.f166793z, snsAdStreamVideoPlayUI.A, snsAdStreamVideoPlayUI.B, snsAdStreamVideoPlayUI.C, 0);
                }
                if (snsAdStreamVideoPlayUI.D) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, snsAdStreamVideoPlayUI.I.field_snsId, 11, 0));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
        }
        str3 = str;
        str4 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
    }
}
