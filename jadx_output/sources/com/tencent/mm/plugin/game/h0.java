package com.tencent.mm.plugin.game;

@j95.b
/* loaded from: classes8.dex */
public class h0 extends i95.w implements m33.b1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f139453d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f139454e = false;

    public java.lang.String Ai(android.content.Context context) {
        if (context instanceof com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) {
            return ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).f140997s;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        return context instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI ? r53.f.f392656d : "";
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "null open or null username");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10738, str, str2, str, str3);
        }
    }

    public void Di(android.content.Context context, java.lang.String str, int i17, int i18, int i19) {
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportGameDetail fail, appId is null");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10700, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }

    public void Ni(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, long j17, java.lang.String str4, int i19) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 != null) {
            jj0.a a17 = jj0.a.a();
            boolean k17 = h17.k();
            ((com.tencent.mm.game.report.c) a17).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportReadMsg fail, appId is null");
                return;
            }
            java.lang.String bigInteger = new java.math.BigInteger("00FFFFFFFFFFFFFFFF", 16).and(java.math.BigInteger.valueOf(j17)).toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.reportReadMsg", "%s,%s,%s,%s,%s,%s,%s,%s,%d", str, bigInteger, str2, java.lang.Integer.valueOf(i17), str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k17 ? 1 : 0), str4, java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10532, str, bigInteger, str2, java.lang.Integer.valueOf(i17), str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k17 ? 1 : 0), str4, java.lang.Integer.valueOf(i19));
        }
    }

    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2) {
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportRegToWx fail, appId is null");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        android.content.pm.PackageInfo a17 = ik1.b.a(context, str2);
        g0Var.d(10534, str, java.lang.Integer.valueOf(a17 == null ? 0 : a17.versionCode), nj0.a.b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    public void Ui(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19) {
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "rejectGameMsg fail, appId is null");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10546, str, str2, java.lang.Integer.valueOf(i17), nj0.a.b(), java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19));
        }
    }

    public boolean Vi(android.content.Context context) {
        try {
            return com.tencent.mm.plugin.game.commlib.i.o();
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public void wi(android.content.Context context) {
        if (context != null) {
            context.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
        }
    }
}
