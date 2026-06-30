package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public abstract class m5 {
    public static com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs a(android.os.Bundle bundle, int i17) {
        java.lang.String string;
        java.lang.String string2 = bundle.getString("SendAppMessageWrapper_AppId");
        if (string2 == null && (string = bundle.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT)) != null) {
            string2 = android.net.Uri.parse(string).getQueryParameter("appid");
        }
        if (string2 == null && (string2 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "_wxapi_payreq_appid")) == null) {
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
        mVar.field_appId = string2;
        if (c01.d9.h() && gm0.j1.a()) {
            com.tencent.mm.pluginsdk.model.app.u5.Di().get(mVar, new java.lang.String[0]);
            if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_packageName)) {
                mVar.field_packageName = bundle.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
            }
        } else {
            mVar.field_packageName = bundle.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        }
        com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs reportUtil$ReportArgs = new com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs();
        reportUtil$ReportArgs.f188785d = mVar.field_packageName;
        reportUtil$ReportArgs.f188786e = i17;
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.fromBundle(bundle);
        reportUtil$ReportArgs.f188787f = req.transaction;
        reportUtil$ReportArgs.f188788g = mVar.field_openId;
        reportUtil$ReportArgs.f188789h = bundle.getInt("_wxapi_command_type");
        return reportUtil$ReportArgs;
    }

    public static void b(android.content.Context context, com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs reportUtil$ReportArgs) {
        if (reportUtil$ReportArgs.f188789h == 1) {
            com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
            resp.transaction = reportUtil$ReportArgs.f188787f;
            resp.errCode = reportUtil$ReportArgs.f188786e;
            resp.openId = reportUtil$ReportArgs.f188788g;
            android.os.Bundle bundle = new android.os.Bundle();
            resp.toBundle(bundle);
            com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
            com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
            args.targetPkgName = reportUtil$ReportArgs.f188785d;
            args.bundle = bundle;
            args.flags = 268435456;
            com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
            return;
        }
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp resp2 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp();
        resp2.errCode = reportUtil$ReportArgs.f188786e;
        resp2.transaction = reportUtil$ReportArgs.f188787f;
        resp2.openId = reportUtil$ReportArgs.f188788g;
        android.os.Bundle bundle2 = new android.os.Bundle();
        resp2.toBundle(bundle2);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle2);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args2 = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args2.targetPkgName = reportUtil$ReportArgs.f188785d;
        args2.bundle = bundle2;
        args2.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args2);
    }

    public static void c(android.content.Context context, com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs reportUtil$ReportArgs, boolean z17, boolean z18) {
        if (reportUtil$ReportArgs == null) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        boolean d17 = c17 != null ? c17.d("kWXEntryActivity_data_center_can_return_cancel", false) : false;
        if (z17) {
            d(z18, reportUtil$ReportArgs.f188786e);
        }
        if (d17 && z18) {
            reportUtil$ReportArgs.f188786e = -2;
        }
        b(context, reportUtil$ReportArgs);
    }

    public static void d(boolean z17, int i17) {
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        if (c17 != null) {
            java.lang.String f17 = c17.f("kWXEntryActivity_data_center_app_id", "");
            boolean d17 = c17.d("kWXEntryActivity_data_center_can_return_cancel", false);
            int e17 = c17.e("kWXEntryActivity_data_center_msg_type", 0);
            int e18 = c17.e("kWXEntryActivity_data_center_scene", 0);
            if (z17) {
                i17 = -2;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15632, f17, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17 ? 0 : -1));
        }
    }
}
