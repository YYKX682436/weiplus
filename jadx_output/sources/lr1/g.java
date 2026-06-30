package lr1;

/* loaded from: classes11.dex */
public final class g implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final lr1.g f320662d = new lr1.g();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizStrategyManager", "doBizStrategy callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        lr1.k kVar = lr1.k.f320682a;
        kVar.b().putLong("biz_time_line_strategy_last_time", java.lang.System.currentTimeMillis());
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyResp");
            r45.rm rmVar = (r45.rm) fVar;
            r45.pm pmVar = rmVar.f384993f;
            if (pmVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizStrategyManager", "updateBizStrategyControlInfo RefreshInterval = %d", java.lang.Integer.valueOf(pmVar.f383173d));
                if (pmVar.f383173d > 0) {
                    kVar.b().putLong("biz_time_line_fetch_interval", pmVar.f383173d);
                }
            }
            r45.b43 b43Var = rmVar.f385006v;
            if (b43Var != null && b43Var.f370512e > 0.0f && b43Var.f370511d > 0.0f) {
                kVar.b().putFloat("key_biz_flutter_fling_friction", rmVar.f385006v.f370512e);
                kVar.b().putFloat("key_biz_flutter_min_fling_velocity_factor", rmVar.f385006v.f370511d);
            }
            yw.h1 h1Var = yw.h1.f466332a;
            r45.hm5 hm5Var = rmVar.f385009y;
            if (hm5Var != null) {
                h1Var.m().G("BizTimeLineShowRedPacketCover", hm5Var.f376294d);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveRedPackageCoverConfig BizTimeLineShowRedPacketCover=" + hm5Var.f376294d);
            }
            o25.q qVar = o25.q.f342574a;
            r45.j9 j9Var = rmVar.f384992e;
            if (j9Var != null) {
                qVar.e().putBoolean("biz_time_line_has_fetch_strategy", true);
                qVar.e().putBoolean("biz_time_line_need_preload", j9Var.f377656e);
                qVar.e().putBoolean("biz_time_preload_at_foreground", j9Var.f377662n);
                qVar.e().putBoolean("biz_time_preload_at_chat_list", j9Var.f377663o);
                qVar.e().putBoolean("biz_time_preload_at_biz_box_expose", j9Var.f377664p);
                if (j9Var.f377658g > 0) {
                    qVar.e().putInt("biz_time_line_need_preload_interval", j9Var.f377658g);
                }
                if (j9Var.f377657f > 0) {
                    qVar.e().putInt("biz_time_line_need_preload_top_num", j9Var.f377657f);
                }
                if (j9Var.f377659h > 0) {
                    qVar.e().putInt("biz_time_line_msg_sync_gap", j9Var.f377659h);
                }
                if (j9Var.f377660i > 0) {
                    qVar.e().putInt("biz_time_line_pic_download_gap", j9Var.f377660i);
                }
                if (j9Var.f377661m > 0) {
                    qVar.e().putInt("biz_time_line_pic_limit_minute", j9Var.f377661m);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "CoverPreloadInfo: NeedPreload = " + j9Var.f377656e + ", NeedPreloadFold = " + j9Var.f377655d + ", PreloadInterval = " + j9Var.f377658g + ", PreloadTopNum = " + j9Var.f377658g + ", PreloadSyncGap = " + j9Var.f377659h + ", PreloadPicGap = " + j9Var.f377660i + ", NeedPreloadAtForeground = " + j9Var.f377662n + ", NeedPreloadAtChatList = " + j9Var.f377663o + ", NeedPreloadAtAppMsgExpose = " + j9Var.f377664p);
            }
            c01.y0 y0Var = c01.a1.f37045a;
            r45.zk5 zk5Var = rmVar.f384997m;
            if (zk5Var != null) {
                com.tencent.mars.xlog.Log.i("Micromsg.BizTLRecFeedsDataUtil", "updateSvrSwitch = " + zk5Var.f392176d);
                int i19 = zk5Var.f392176d;
                c01.z0[] z0VarArr = c01.z0.f37577d;
                if (i19 == 1) {
                    y0Var.a().G("BizTLRecommendFeedsSvrOpen", false);
                } else if (i19 == 2) {
                    y0Var.a().G("BizTLRecommendFeedsSvrOpen", true);
                }
                y0Var.a().A("BizTLRecommendFeedsRefreshFreq", zk5Var.f392177e);
                y0Var.a().A("BizTLRecommendFeedsTimingPreload", zk5Var.f392178f);
                y0Var.a().G("BizTLRecommendFeedsShowRecReplaceButton", zk5Var.f392179g);
                y0Var.a().A("BizTLRecommendFeedsTimeGapOfRecDataRequest", zk5Var.f392180h);
                y0Var.a().A("BizTLRecommendClickReplaceNotExposedSwitch", zk5Var.f392182m);
                y0Var.a().A("BizTLRecommendClickNegativeReplaceNotExposedSwitch", zk5Var.f392183n);
                com.tencent.mars.xlog.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsTimingPreload = " + zk5Var.f392178f + ", BizTLRecommendFeedsShowReplaceButton = " + zk5Var.f392179g + ", BizTLRecommendFeedsTimeGapOfRecDataRequest = " + zk5Var.f392180h + ", BizTLRecommendFeedsClickReplaceNotExposedSwitch = " + zk5Var.f392182m + ", BizTLRecommendFeedsNegativeClickReplaceNotExposedSwitch = " + zk5Var.f392183n);
                r45.x25 x25Var = zk5Var.f392181i;
                if (x25Var != null) {
                    y0Var.a().A("BizTLRecommendFeedsBatchWithBizMsgResort", x25Var.f389696d);
                    y0Var.a().A("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", x25Var.f389697e);
                    y0Var.a().A("BizTLRecommendFeedsEnterBoxFilter", x25Var.f389698f);
                    y0Var.a().A("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", x25Var.f389699g);
                    com.tencent.mars.xlog.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsBatchWithBizMsgResort = " + x25Var.f389696d + ", BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard = " + x25Var.f389697e + ", BizTLRecommendFeedsEnterBoxFilter = " + x25Var.f389698f + ", BizTLRecommendFeedsOutBoxPullFeedsControlSwitch = " + x25Var.f389699g);
                }
                y0Var.a().A("BizTLRecommendFeedsClientFeedsUIVersion", zk5Var.f392184o);
                y0Var.a().A("BizTLRecommendFeedsCloseNegativeButton", zk5Var.f392185p);
                com.tencent.mars.xlog.Log.i("Micromsg.BizTLRecFeedsDataUtil", "ClientFeedsUIVersion = " + zk5Var.f392184o);
            }
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            r45.kk kkVar = rmVar.f384999o;
            b0Var.h().A("SvrOpenFlag", kkVar != null ? kkVar.f378772d : 0);
            r45.g85 g85Var = rmVar.f384990J;
            if (g85Var != null) {
                h1Var.m().A("key_biz_pic_text_scroll_list_enable", g85Var.f374991d);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "savePicTextScrollConfig enable=" + g85Var.f374991d);
            }
            com.tencent.mm.storage.g2 g2Var = com.tencent.mm.storage.g2.f193945a;
            r45.hl hlVar = rmVar.f385001q;
            if (hlVar != null) {
                g2Var.a().G("ReSortBizMsgRetrieveInvalidExposureCard", hlVar.f376251d);
                g2Var.a().A("ReSortBizMsgValidExposureAreaRatio", hlVar.f376252e);
                g2Var.a().A("ReSortBizMsgValidExposurePeriod", hlVar.f376253f);
                g2Var.a().G("ReSortBizMsgRedDotSample", hlVar.f376254g);
                g2Var.a().G("ReSortBizMsgRecMsgReportSample", hlVar.f376255h);
                g2Var.a().A("ReSortBizMsgRecMsgReportMaxCount", hlVar.f376256i);
                g2Var.a().A("ReSortBizMsgRecommendReasonMode", hlVar.f376257m);
                g2Var.a().A("AndroidValidExposureMode", hlVar.f376258n);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineResortLogic", "saveConfig RetrieveInvalidExposureCard=" + hlVar.f376251d + ", ValidExposureAreaRatio=" + hlVar.f376252e + ", ValidExposurePeriod=" + hlVar.f376253f + ", RedDotSample=" + hlVar.f376254g + ", RecMsgReportSample=" + hlVar.f376255h + "， RecMsgReportMaxCount=" + hlVar.f376256i + ", RecommendReasonMode=" + hlVar.f376257m);
            }
            r45.jl jlVar = rmVar.f385003s;
            if (jlVar != null) {
                h1Var.m().A("BizResortV2ControlFlag", jlVar.f377906d);
                h1Var.m().A("lift_read_area_size", jlVar.f377907e);
                h1Var.m().D("history_box_wording", jlVar.f377908f);
                h1Var.m().B("resort_scene_bit_switch", jlVar.f377910h);
                h1Var.m().A("hide_box_when_delete", jlVar.f377911i);
                h1Var.m().A("resort_blocked_when_client_running_back", jlVar.f377912m);
                h1Var.m().A("reddot_expose_end_report", jlVar.f377914o);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveConfig controlFlag=" + jlVar.f377906d + " lift_read_area_size=" + jlVar.f377907e + " resort_scene_bit_switch=" + jlVar.f377910h + "  hide_box_when_delete=" + jlVar.f377911i + " resort_blocked_when_client_running_back: " + jlVar.f377912m + " reddot_expose_end_report=" + jlVar.f377914o + ' ');
            }
            dw5.q qVar2 = new dw5.q();
            qVar2.f244408d = h1Var.j();
            boolean[] zArr = qVar2.f244416o;
            zArr[1] = true;
            qVar2.f244409e = h1Var.m().o("lift_read_area_size", 0);
            zArr[2] = true;
            qVar2.f244410f = h1Var.k();
            zArr[3] = true;
            qVar2.f244411g = h1Var.m().q("resort_scene_bit_switch", 0L);
            zArr[4] = true;
            qVar2.f244412h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
            zArr[5] = true;
            qVar2.f244413i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
            zArr[6] = true;
            qVar2.f244414m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
            zArr[7] = true;
            qVar2.f244415n = h1Var.q();
            zArr[8] = true;
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                z40.e eVar = z40.e.get();
                lr1.i iVar = lr1.i.f320678a;
                ((y40.i0) eVar).getClass();
                com.tencent.wechat.mm.finder_box.c0 a17 = a50.e1.f1471a.a();
                if (a17 != null) {
                    a17.B(2, (cw5.g) y40.o0.a(qVar2, new cw5.g()), new y40.e0(iVar));
                }
            }
            com.tencent.wechat.mm.biz.g0.f218063b.J(2, qVar2, lr1.j.f320681a);
            ur1.n nVar = ur1.n.f430361a;
            r45.sl slVar = rmVar.f385002r;
            if (slVar != null) {
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) ur1.n.f430362b).getValue()).H("personal_center_main_table", slVar.toByteArray());
            }
            r45.ev0 ev0Var = rmVar.f385004t;
            if (ev0Var != null) {
                ms1.b bVar = ms1.c.f330966a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineAutoPlayConfig", "updateVideoAutoPlayConfig= " + ev0Var);
                bVar.a().putInt("auto_play_trigger_threshold_in_ms", ev0Var.f373737d);
                bVar.a().putInt("config_key_video_lar_card_auto_play_enable", ev0Var.f373738e);
                bVar.a().putInt("config_key_video_scroll_card_auto_play_enable", ev0Var.f373739f);
                bVar.a().putInt("config_key_often_read_video_scroll_card_auto_play_enabled", ev0Var.f373740g);
            }
            com.tencent.mm.pluginsdk.model.e eVar2 = com.tencent.mm.pluginsdk.model.e.f189277a;
            r45.jm6 jm6Var = rmVar.f385000p;
            if (jm6Var != null) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizCommUtil", "setTimelineSettingInfo bitSet = " + jm6Var.f377955d);
                    com.tencent.mm.sdk.platformtools.o4.R("brandService").H("k_TimelineSettingInfo", jm6Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizCommUtil", "encode TimelineSettingInfo ex %s", e17.getMessage());
                }
            }
            int i27 = rmVar.H;
            yw.h1 h1Var2 = yw.h1.f466332a;
            h1Var2.m().A("key_biz_expt_report_list_rank_wait_cnt", i27);
            h1Var2.m().A("key_biz_prod_report_list_rank_wait_cnt", rmVar.I);
            com.tencent.mm.pluginsdk.model.e eVar3 = com.tencent.mm.pluginsdk.model.e.f189277a;
            r45.dn dnVar = rmVar.f385007w;
            if (dnVar != null) {
                try {
                    com.tencent.mm.sdk.platformtools.o4.R("brandService").H("k_TimelinePersonalCenterSettingInfo", dnVar.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizCommUtil", "encode BizWxaPersonalCenter ex %s", e18.getMessage());
                }
            }
            r45.ul1 ul1Var = rmVar.f385005u;
            if (ul1Var != null) {
                ms1.b bVar2 = ms1.c.f330966a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineAutoPlayConfig", "updateLiveAutoPlayConfig= " + ul1Var);
                bVar2.a().putInt("config_key_live_card_auto_play_enable", ul1Var.f387454d);
                bVar2.a().putInt("config_key_rec_flow_live_dual_card_auto_play_enable", ul1Var.f387455e);
                bVar2.a().putInt("config_key_often_read_live_scroll_card_auto_play_enabled", ul1Var.f387456f);
            }
            com.tencent.mm.pluginsdk.model.e eVar4 = com.tencent.mm.pluginsdk.model.e.f189277a;
            r45.bf5 bf5Var = rmVar.f385010z;
            if (bf5Var != null) {
                java.util.Iterator it = bf5Var.f370729d.iterator();
                while (it.hasNext()) {
                    r45.af5 af5Var = (r45.af5) it.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizCommUtil", "setPublisherNewMsgInfo msg_version:" + af5Var.f369981d + " msg_open:" + af5Var.f369982e);
                    com.tencent.mm.sdk.platformtools.o4.R("brandService").putBoolean("k_personalCenterMessageListUseStyleV2_V" + af5Var.f369981d, af5Var.f369982e == 1);
                }
            }
            r45.am amVar = rmVar.A;
            if (amVar != null) {
                yw.h1 h1Var3 = yw.h1.f466332a;
                h1Var3.m().A("BizHoldSecAfterUserLeaveForReport", amVar.f370113d);
                h1Var3.m().A("BizTimeLineReportArticleJumpPathDepth", amVar.f370114e);
                h1Var3.m().A("BizTimeLineReportShowBatchSize", amVar.f370115f);
                h1Var3.m().D("BizTimeLineReportShowStrategyInfo", amVar.f370116g);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveBizReportConfig BizRecReqReportWaitSec=" + amVar.f370113d + " & BizTimeLineReportArticleJumpPathDepth=" + amVar.f370114e + " & BizTimeLineReportShowBatchSize=" + amVar.f370115f + " & BizTimeLineReportShowStrategyInfo]" + amVar.f370116g);
            }
            r45.em6 em6Var = rmVar.D;
            if (em6Var != null) {
                yw.h1 h1Var4 = yw.h1.f466332a;
                h1Var4.m().A("BizTimeLineFinderInfo", em6Var.f373611d);
                h1Var4.m().G("biz_time_line_finder_display_breathing_light", em6Var.f373612e);
                h1Var4.m().A("biz_time_line_finder_get_live_info_interval", em6Var.f373613f);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveBizTimelineFinderInfo BizTimeLineFinderInfo=" + em6Var.f373611d + ", display_breathing_light: " + em6Var.f373612e + ", get_live_info_interval: " + em6Var.f373613f);
            }
            r45.tb tbVar = rmVar.E;
            if (tbVar != null) {
                yw.h1 h1Var5 = yw.h1.f466332a;
                if (tbVar.f386264d > 0) {
                    h1Var5.m().H("BizAudioFeedsInfo", tbVar.toByteArray());
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveAudioFeedsInfo " + tbVar);
                }
            }
            r45.zw6 zw6Var = rmVar.F;
            if (zw6Var != null) {
                yw.h1 h1Var6 = yw.h1.f466332a;
                h1Var6.m().A("biz_time_line_valid_expose_area_ratio", zw6Var.f392445d);
                h1Var6.m().A("biz_time_line_valid_expose_time_ms", zw6Var.f392446e);
                h1Var6.m().A("biz_time_line_extra_calc_expose_time_ms", zw6Var.f392447f);
                h1Var6.m().A("biz_time_line_new_valid_expose_time_ms", zw6Var.f392448g);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveValidExposeConfig ValidExposeAreaRatio=" + zw6Var.f392445d + ", ValidExposeTimeMs: " + zw6Var.f392446e + ", ExtraCalcExposeTimeMs: " + zw6Var.f392447f + "  NewValidExposeTimeMs: " + zw6Var.f392448g);
            }
            r45.r80 r80Var = rmVar.G;
            if (r80Var != null) {
                yw.h1.f466332a.m().A("key_biz_fetch_contact_create_time_interval_in_second", r80Var.f384608d);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveContactListConfig intervalSec=" + r80Var.f384608d);
            }
            r45.ww4 ww4Var = rmVar.K;
            if (ww4Var != null) {
                yw.h1 h1Var7 = yw.h1.f466332a;
                int i28 = ww4Var.f389545d;
                h1Var7.m().A("key_biz_notify_permanent", i28);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "saveNotifyConfig notifyPermanent=" + i28);
            }
        }
        return 0;
    }
}
