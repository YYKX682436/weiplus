package l44;

/* loaded from: classes4.dex */
public abstract class s4 {
    public static boolean a(android.content.Context context, com.tencent.mm.plugin.sns.storage.ADXml aDXml, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            if (i(aDXml, aDInfo)) {
                com.tencent.mm.plugin.sns.storage.g gVar = aDXml.adFinderInfo;
                boolean f17 = f(context, aDInfo.uxInfo, gVar.f166000b, gVar.f165999a, gVar.f166001c, j17, aDInfo.preloadFinderFeed, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return f17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "checkJumpFinderFeedsDetailUI exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return false;
    }

    public static boolean b(android.content.Context context, com.tencent.mm.plugin.sns.storage.ADXml aDXml, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            if (i(aDXml, aDInfo)) {
                boolean h17 = h(context, aDXml.adFinderInfo.f166000b, aDInfo.uxInfo, ca4.z0.t0(j17), i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return h17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "checkJumpFinderProfileUI exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return false;
    }

    public static int c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 4;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 6;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 3;
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 4;
        }
        if (i17 != 10) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return 2;
    }

    public static boolean d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        android.content.Intent intent = new android.content.Intent();
        if (l17 != null) {
            intent.putExtra("feed_object_id", l17);
        }
        boolean g17 = g(intent, context, str, str2, str3, str4, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return g17;
    }

    public static boolean e(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.Long l17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            d(context, str2, str3, str4, l17, m(str, ca4.z0.t0(j17), i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return false;
        }
    }

    public static boolean f(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, boolean z17, int i17) {
        java.lang.Long l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (z17) {
            try {
                java.util.Map map = l44.a5.f316031b;
                java.lang.Long l18 = (java.lang.Long) map.get(str4);
                if (l18 == null) {
                    l18 = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("ad_finder_feeds_preload_id_app_related", 0).getLong(str4, 0L));
                    map.put(str4, l18);
                    com.tencent.mars.xlog.Log.i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, no memory objectId, should read sp and put objectId to map, and objectId is " + l18);
                } else {
                    com.tencent.mars.xlog.Log.i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, objectId is " + l18);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderPreloadVideoService", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                zy2.u9 u9Var = l44.a5.f316032c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderPreloadVideoService", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                if (u9Var != null) {
                    long longValue = l18.longValue();
                    com.tencent.mm.plugin.finder.service.b2 b2Var = (com.tencent.mm.plugin.finder.service.b2) u9Var;
                    com.tencent.mars.xlog.Log.i("FinderFeedDetailService", "[cancelFeed]... ".concat(pm0.v.u(longValue)));
                    java.lang.String str5 = (java.lang.String) b2Var.f126010c.get(java.lang.Long.valueOf(longValue));
                    if (str5 != null) {
                        com.tencent.mm.plugin.finder.service.y1 y1Var = (com.tencent.mm.plugin.finder.service.y1) ((jz5.n) b2Var.f126008a).getValue();
                        y1Var.getClass();
                        y1Var.a(str5, true, "cancel");
                        y1Var.d();
                    }
                }
                l17 = l18;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return false;
            }
        } else {
            l17 = null;
        }
        boolean e17 = e(context, str, str2, str3, str4, j17, l17, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return e17;
    }

    public static boolean g(android.content.Intent intent, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        android.content.Intent intent2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (intent == null) {
            try {
                intent2 = new android.content.Intent();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return false;
            }
        } else {
            intent2 = intent;
        }
        intent2.putExtra("report_scene", 3);
        intent2.putExtra("from_user", str);
        intent2.putExtra("feed_encrypted_object_id", str3);
        intent2.putExtra("feed_object_nonceId", str2);
        intent2.putExtra("key_from_user_name", str);
        intent2.putExtra("tab_type", 5);
        intent2.putExtra("key_detail_comment_scene", 42);
        intent2.putExtra("is_from_ad", true);
        intent2.putExtra("key_extra_info", str4);
        intent2.putExtra("key_from_comment_scene", 37);
        intent2.putExtra("key_enter_content_by_red_dot", i17 == 16);
        if (!intent2.hasExtra("key_context_id")) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 4, 42, intent2);
        }
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (i17 >= 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.z(context, intent2, i17, false);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.A(context, intent2, false);
        }
        com.tencent.mars.xlog.Log.i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, adInfoExtra=" + str4 + ", objectNonceId=" + str2 + ", finderUsername=" + str + ", exportId=" + str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return true;
    }

    public static boolean h(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            java.lang.String m17 = m(str2, str3, i17);
            com.tencent.mars.xlog.Log.i("FinderAdJumpHelper", "doJumpToFinderProfileUI, finderUsername=" + str + ", adInfoExtra=" + m17 + ", scene=" + i17);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("report_scene", 3);
            intent.putExtra("key_enter_profile_type", 1);
            intent.putExtra("finder_username", str);
            intent.putExtra("key_from_comment_scene", 37);
            intent.putExtra("is_from_ad", true);
            intent.putExtra("key_extra_info", m17);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 4, 32, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(context, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "doJumpToFinderProfileUI exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return false;
        }
    }

    public static boolean i(com.tencent.mm.plugin.sns.storage.ADXml aDXml, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        boolean z17 = (aDXml == null || aDXml.adFinderInfo == null || aDInfo == null || aDInfo.adActionType != 9) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return z17;
    }

    public static boolean j(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderAdFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        boolean z17 = (adClickActionInfo == null || adClickActionInfo.f162571b != 12 || com.tencent.mm.sdk.platformtools.t8.N0(adClickActionInfo.f162584h0, adClickActionInfo.finderUsername)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderAdFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return z17;
    }

    public static boolean k(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderAdLiveRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        boolean z17 = adClickActionInfo != null && ((i17 = adClickActionInfo.f162571b) == 10 || i17 == 24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderAdLiveRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return z17;
    }

    public static boolean l(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTagJumpToFinder", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        boolean z17 = (aDXml == null || (adClickActionInfo = aDXml.adActionLinkClickInfo) == null || adClickActionInfo.f162571b != 14 || lj.f.f(adClickActionInfo.finderUsername)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTagJumpToFinder", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return z17;
    }

    public static java.lang.String m(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            java.lang.String n17 = n(str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (n17 == null) {
                n17 = "";
            }
            jSONObject2.put("uxinfo", n17);
            jSONObject2.put("snsid", str2);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            jSONObject.put("sns_ad", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "makeAdInfoExtra, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return "";
        }
    }

    public static java.lang.String n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                str = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderAdJumpHelper", "urlEncode exp=" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return str;
    }
}
