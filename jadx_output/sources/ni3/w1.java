package ni3;

/* loaded from: classes12.dex */
public class w1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337752e;

    public w1(ni3.g2 g2Var) {
        this.f337752e = g2Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "reportHeavyUser";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUserRunnable run");
        if (!gm0.j1.a() || this.f337752e.f337599x == 0) {
            return;
        }
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(509L, 17L, 1L, true);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
            gm0.j1.i();
            long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L)).longValue();
            com.tencent.mm.plugin.report.kvdata.log_14375 log_14375Var = new com.tencent.mm.plugin.report.kvdata.log_14375();
            log_14375Var.type_ = 4;
            com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo = new com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo();
            log_14375Var.heavyDetailInfo_ = heavyDetailInfo;
            heavyDetailInfo.flag_ = longValue2;
            gm0.j1.i();
            long longValue3 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_SIZE_LONG, 0L)).longValue();
            heavyDetailInfo.sdFileSize_ = longValue3;
            java.lang.String str = ("" + longValue2) + ";" + longValue3;
            gm0.j1.i();
            long longValue4 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_RATIO_LONG, 0L)).longValue();
            heavyDetailInfo.sdFileRatio_ = longValue4;
            java.lang.String str2 = str + ";" + longValue4;
            gm0.j1.i();
            long longValue5 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_SIZE_LONG, 0L)).longValue();
            heavyDetailInfo.dbSize_ = longValue5;
            java.lang.String str3 = str2 + ";" + longValue5;
            gm0.j1.i();
            long longValue6 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_MESSAGE_LONG, 0L)).longValue();
            heavyDetailInfo.message_ = longValue6;
            java.lang.String str4 = str3 + ";" + longValue6;
            gm0.j1.i();
            long longValue7 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONVERSATION_LONG, 0L)).longValue();
            heavyDetailInfo.conversation_ = longValue7;
            java.lang.String str5 = str4 + ";" + longValue7;
            gm0.j1.i();
            long longValue8 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONTACT_LONG, 0L)).longValue();
            heavyDetailInfo.contact_ = longValue8;
            java.lang.String str6 = str5 + ";" + longValue8;
            gm0.j1.i();
            long longValue9 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CHATROOM_LONG, 0L)).longValue();
            heavyDetailInfo.chatroom_ = longValue9;
            java.lang.String str7 = str6 + ";" + longValue9;
            gm0.j1.i();
            long longValue10 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_REPORT_TYPE_FAV_DB_SIZE_LONG, 0L)).longValue();
            heavyDetailInfo.favDbSize_ = longValue10;
            java.lang.String str8 = str7 + ";" + longValue10;
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("heavyDetailInfo", 0).edit().putLong("sdFileSize", heavyDetailInfo.sdFileSize_).putLong("sdFileRatio", heavyDetailInfo.sdFileRatio_).putLong("dbSize", heavyDetailInfo.dbSize_).putLong(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, heavyDetailInfo.message_).putLong("conversation", heavyDetailInfo.conversation_).putLong("contact", heavyDetailInfo.contact_).putLong("chatroom", heavyDetailInfo.chatroom_).putLong("favDbSize", heavyDetailInfo.favDbSize_).putLong("flag", heavyDetailInfo.flag_).apply();
            try {
                com.tencent.mm.vfs.w6.R(gm0.j1.u().h() + "heavyDetailInfo", new org.json.JSONObject().put("sdFileSize", heavyDetailInfo.sdFileSize_).put("sdFileRatio", heavyDetailInfo.sdFileRatio_).put("dbSize", heavyDetailInfo.dbSize_).put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, heavyDetailInfo.message_).put("conversation", heavyDetailInfo.conversation_).put("contact", heavyDetailInfo.contact_).put("chatroom", heavyDetailInfo.chatroom_).put("favDbSize", heavyDetailInfo.favDbSize_).put("flag", heavyDetailInfo.flag_).toString().getBytes());
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreBaseMonitor", "Failed to write heavyDetailInfo");
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.g(13778, false, false, true, 4, 1, str8);
            g0Var.I(14375, log_14375Var, false, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUser report heavy result[%s]", str8);
        }
    }
}
