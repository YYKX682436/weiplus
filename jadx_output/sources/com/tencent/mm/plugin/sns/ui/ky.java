package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ky implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ly f169697a;

    public ky(com.tencent.mm.plugin.sns.ui.ly lyVar) {
        this.f169697a = lyVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1");
        com.tencent.mm.plugin.sns.ui.ly lyVar = this.f169697a;
        if (i17 == 0) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = lyVar.f169880d;
            int i19 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str5 = videoAdPlayerUI.f167667r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            intent.putExtra("ad_video_title", str5);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.v(lyVar.f169880d, ".ui.transmit.SelectConversationUI", intent, 4097);
        } else if (i17 == 1) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI2 = lyVar.f169880d;
            int i27 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            videoAdPlayerUI2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareSns", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_link", videoAdPlayerUI2.f167661i);
            intent2.putExtra("Ksnsupload_type", 11);
            intent2.putExtra("Ksnsupload_title", videoAdPlayerUI2.f167667r);
            intent2.putExtra("Ksnsupload_imgurl", videoAdPlayerUI2.f167663n);
            intent2.putExtra("KSnsStreamVideoTotalTime", videoAdPlayerUI2.f167655J.A);
            intent2.putExtra("KSnsStreamVideoWroding", videoAdPlayerUI2.f167668s);
            intent2.putExtra("KSnsStreamVideoWebUrl", videoAdPlayerUI2.f167669t);
            intent2.putExtra("KSnsStreamVideoAduxInfo", videoAdPlayerUI2.f167670u);
            intent2.putExtra("KSnsStreamVideoPublishId", videoAdPlayerUI2.f167671v);
            intent2.putExtra("need_result", true);
            intent2.putExtra("key_snsad_statextstr", videoAdPlayerUI2.I);
            int i28 = videoAdPlayerUI2.f167673x;
            java.lang.String str6 = "sns_";
            if (i28 == i64.o1.Sight.f289269d || i28 == i64.o1.AdUrl.f289269d) {
                str6 = "sns_" + videoAdPlayerUI2.A;
            } else if (i28 == i64.o1.Chat.f289269d || i28 == i64.o1.TalkChat.f289269d) {
                str6 = "msg_" + videoAdPlayerUI2.B;
            } else if (i28 == i64.o1.Fav.f289269d) {
                str6 = "fav_" + c01.z1.r() + "_" + videoAdPlayerUI2.C;
            }
            java.lang.String a17 = c01.n2.a(str6);
            c01.n2.d().c(a17, true).i("prePublishId", str6);
            intent2.putExtra("reportSessionId", a17);
            j45.l.n(videoAdPlayerUI2, "sns", ".ui.SnsUploadUI", intent2, 4098);
            if (videoAdPlayerUI2.L != 0) {
                j64.b bVar = videoAdPlayerUI2.f167658f.f289121i;
                int i29 = bVar.f297911c;
                if (videoAdPlayerUI2.P) {
                    long j17 = bVar.f297915g;
                    if (j17 != 0) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        i29 += (int) ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
                    }
                }
                com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13228, "1,4," + i29 + "," + videoAdPlayerUI2.M + "," + videoAdPlayerUI2.N + "," + com.tencent.mm.sdk.platformtools.t8.i1() + "," + videoAdPlayerUI2.K + "," + videoAdPlayerUI2.f167666q, (int) com.tencent.mm.sdk.platformtools.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f273288b.g(rVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareSns", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        } else {
            if (i17 != 2) {
                str3 = "onClick";
                str4 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
            }
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI3 = lyVar.f169880d;
            int i37 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            videoAdPlayerUI3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            r45.jj4 jj4Var = videoAdPlayerUI3.f167655J;
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            ((com.tencent.mm.pluginsdk.model.b2) c5Var).wi(doFavoriteEvent, 0, jj4Var.A, videoAdPlayerUI3.f167667r, "", jj4Var.f377875x, videoAdPlayerUI3.f167668s, videoAdPlayerUI3.f167669t, videoAdPlayerUI3.f167663n, videoAdPlayerUI3.f167660h, videoAdPlayerUI3.f167674y, videoAdPlayerUI3.f167670u, videoAdPlayerUI3.f167671v, videoAdPlayerUI3.I);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = videoAdPlayerUI3;
            c4Var.f6327m = 24;
            doFavoriteEvent.e();
            if (doFavoriteEvent.f54091h.f6433a == 0 && (i18 = videoAdPlayerUI3.f167673x) != 0) {
                i64.s1.e(i64.p1.Fav, videoAdPlayerUI3.f167671v, videoAdPlayerUI3.f167670u, videoAdPlayerUI3.f167672w, i18, videoAdPlayerUI3.f167674y, videoAdPlayerUI3.f167675z, videoAdPlayerUI3.A, videoAdPlayerUI3.B, videoAdPlayerUI3.C, videoAdPlayerUI3.D, 0);
            }
            if (videoAdPlayerUI3.f167665p) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, videoAdPlayerUI3.S.field_snsId, 11, 0));
            }
            if (videoAdPlayerUI3.L != 0) {
                j64.b bVar2 = videoAdPlayerUI3.f167658f.f289121i;
                int i38 = bVar2.f297911c;
                if (videoAdPlayerUI3.P) {
                    long j18 = bVar2.f297915g;
                    if (j18 != 0) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        i38 += (int) ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
                    }
                }
                com.tencent.mm.modelstat.r rVar2 = new com.tencent.mm.modelstat.r(13228, "1,5," + i38 + "," + videoAdPlayerUI3.M + "," + videoAdPlayerUI3.N + "," + com.tencent.mm.sdk.platformtools.t8.i1() + "," + videoAdPlayerUI3.K + "," + videoAdPlayerUI3.f167666q, (int) com.tencent.mm.sdk.platformtools.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f273288b.g(rVar2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        }
        str3 = str;
        str4 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
    }
}
