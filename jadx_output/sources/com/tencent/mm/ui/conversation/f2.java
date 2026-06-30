package com.tencent.mm.ui.conversation;

/* loaded from: classes15.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.f2 f207664a = new com.tencent.mm.ui.conversation.f2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f207665b;

    /* renamed from: c, reason: collision with root package name */
    public static long f207666c;

    /* renamed from: d, reason: collision with root package name */
    public static long f207667d;

    /* renamed from: e, reason: collision with root package name */
    public static long f207668e;

    /* renamed from: f, reason: collision with root package name */
    public static long f207669f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f207665b = hashMap;
        hashMap.put("notifymessage", new com.tencent.mm.ui.conversation.e2());
    }

    public final void a(int i17, int i18, java.lang.String str, int i19, int i27, com.tencent.mm.storage.f9 msg, int i28) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.autogen.mmdata.rpt.LiveTipsActionReportStruct liveTipsActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveTipsActionReportStruct();
        liveTipsActionReportStruct.f58662d = i17;
        liveTipsActionReportStruct.f58663e = i18;
        java.lang.String str2 = "";
        liveTipsActionReportStruct.f58664f = liveTipsActionReportStruct.b("Content", str != null ? r26.i0.t(str, ",", "", false) : null, true);
        liveTipsActionReportStruct.f58665g = i19;
        liveTipsActionReportStruct.f58666h = i27;
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(msg.j(), "msg", null);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            if (str3 == null) {
                str3 = "";
            }
            liveTipsActionReportStruct.f58667i = liveTipsActionReportStruct.b("finderUsername", str3, true);
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            if (str4 == null) {
                str4 = "";
            }
            liveTipsActionReportStruct.f58668j = liveTipsActionReportStruct.b("feedId", str4, true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            if (str5 == null) {
                str5 = "";
            }
            liveTipsActionReportStruct.f58669k = liveTipsActionReportStruct.b("liveId", str5, true);
            java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str6 == null) {
                str6 = "";
            }
            liveTipsActionReportStruct.f58673o = com.tencent.mm.sdk.platformtools.t8.D1(str6, 0);
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.sessionbuffer");
            if (str7 == null) {
                str7 = "";
            }
            liveTipsActionReportStruct.f58676r = liveTipsActionReportStruct.b("sessionBuffer", str7, true);
            liveTipsActionReportStruct.f58674p = i28 > 0 ? 1L : 0L;
            liveTipsActionReportStruct.f58675q = i28;
            if (i17 == 1) {
                long j17 = f207666c == msg.I0() ? 0L : 1L;
                liveTipsActionReportStruct.f58670l = j17;
                f207667d = j17;
            } else {
                liveTipsActionReportStruct.f58670l = f207667d;
            }
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
            if (str8 != null) {
                str2 = str8;
            }
            liveTipsActionReportStruct.f58671m = liveTipsActionReportStruct.b("msgType", str2, true);
            liveTipsActionReportStruct.f58672n = liveTipsActionReportStruct.b("msgId", pm0.v.u(msg.I0()), true);
            liveTipsActionReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvItemExposureHelper", "report 22611, " + liveTipsActionReportStruct.n());
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvItemExposureHelper", e17, "reportLiveTips", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvItemExposureHelper", th6, "reportLiveTips", new java.lang.Object[0]);
        }
    }

    public final void b(int i17, int i18, java.lang.String str, int i19, com.tencent.mm.storage.f9 msg, int i27, java.lang.String str2) {
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true);
        com.tencent.mm.autogen.mmdata.rpt.ServiceNotifyBoxReportStruct serviceNotifyBoxReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ServiceNotifyBoxReportStruct();
        serviceNotifyBoxReportStruct.f60248d = i17;
        serviceNotifyBoxReportStruct.f60253i = i18;
        serviceNotifyBoxReportStruct.f60249e = java.lang.System.currentTimeMillis() / 1000;
        serviceNotifyBoxReportStruct.f60252h = serviceNotifyBoxReportStruct.b("Content", str != null ? r26.i0.t(str, ",", "", false) : null, true);
        serviceNotifyBoxReportStruct.f60255k = o17 ? 1L : 0L;
        serviceNotifyBoxReportStruct.f60254j = i19;
        serviceNotifyBoxReportStruct.f60264t = serviceNotifyBoxReportStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str2, true);
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(msg.j(), "msg", null);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str4 == null) {
                str4 = "";
            }
            serviceNotifyBoxReportStruct.f60257m = com.tencent.mm.sdk.platformtools.t8.D1(str4, 0);
            long j17 = 0;
            serviceNotifyBoxReportStruct.f60258n = i27 > 0 ? 1L : 0L;
            serviceNotifyBoxReportStruct.f60259o = i27;
            if (i17 == 1) {
                long j18 = f207666c == msg.I0() ? 0L : 1L;
                serviceNotifyBoxReportStruct.f60256l = j18;
                f207668e = j18;
            } else {
                serviceNotifyBoxReportStruct.f60256l = f207668e;
            }
            serviceNotifyBoxReportStruct.f60251g = serviceNotifyBoxReportStruct.b("MsgId", pm0.v.u(msg.I0()), true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.template_id");
            if (str5 == null) {
                str5 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5) && (str5 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.templateid")) == null) {
                str5 = "";
            }
            serviceNotifyBoxReportStruct.f60261q = serviceNotifyBoxReportStruct.b("TemplatelD", str5, true);
            java.lang.String str6 = (java.lang.String) d17.get(".msg.fromusername");
            if (str6 == null) {
                str6 = "";
            }
            serviceNotifyBoxReportStruct.f60250f = serviceNotifyBoxReportStruct.b("UserName", str6, true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                serviceNotifyBoxReportStruct.f60250f = serviceNotifyBoxReportStruct.b("UserName", str3, true);
            }
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            if (str7 == null) {
                str7 = "";
            }
            serviceNotifyBoxReportStruct.f60263s = serviceNotifyBoxReportStruct.b("feedId", str7, true);
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            if (str8 == null) {
                str8 = "";
            }
            serviceNotifyBoxReportStruct.f60262r = serviceNotifyBoxReportStruct.b("liveId", str8, true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(serviceNotifyBoxReportStruct.f60250f)) {
                j17 = com.tencent.mm.ui.chatting.viewitems.qg.c(serviceNotifyBoxReportStruct.f60250f);
            }
            serviceNotifyBoxReportStruct.f60260p = j17;
            serviceNotifyBoxReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvItemExposureHelper", "report 32753, " + serviceNotifyBoxReportStruct.n());
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvItemExposureHelper", e17, "reportServiceNotifyBox", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvItemExposureHelper", th6, "reportServiceNotifyBox", new java.lang.Object[0]);
        }
    }
}
