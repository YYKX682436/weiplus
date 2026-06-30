package qh1;

@j95.b
/* loaded from: classes9.dex */
public final class c extends i95.w implements l81.h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final qh1.c f363419d = new qh1.c();

    public final i50.m Ai(java.lang.String str, int i17) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.is_accept_with_force_push"), 0) != 1) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_username");
        if (str2 == null) {
            str2 = "";
        }
        cl0.g gVar = new cl0.g((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.force_push_info"));
        java.lang.String optString = gVar.optString("description");
        java.lang.String optString2 = gVar.optString("forcePushId");
        java.lang.String optString3 = gVar.optString("nickName");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("weAppUsername", str2);
        i95.m c17 = i95.n0.c(i50.o.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString3);
        return i50.o.G3((i50.o) c17, optString2, optString, optString3, hashMap, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.fex), null, 0, false, false, new qh1.a(str2, optString2, i17), 480, null);
    }

    public final i50.m Bi(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "parseGameForceNotifyInfo");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null);
        java.lang.String str2 = (java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfoid");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.expiretime"), Integer.MAX_VALUE);
        int e17 = c01.id.e();
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.jumptype"), 0);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.soundflag"), 1) > 0;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.vibrateflag"), 1) > 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || e17 >= P) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DyeingTemplateMsgHandler", "parseGameForceNotifyInfo fail, infoId: " + str2 + ", expireTime: " + P + ", nowSecond: " + e17);
            return null;
        }
        i50.o oVar = (i50.o) i95.n0.c(i50.o.class);
        kotlin.jvm.internal.o.d(str2);
        java.lang.String str3 = (java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.title");
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = (java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.introduce");
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = (java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.topictitle");
        java.lang.String str8 = str7 == null ? "" : str7;
        kotlin.jvm.internal.o.d(oVar);
        i50.m G3 = i50.o.G3(oVar, str2, str4, str6, null, str8, null, 1, z17, z18, new qh1.b(P2, str2, d17, i17), 40, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "build force notify item finish, infoId: " + str2 + ", expireTime: " + P + ", jumpType: " + P2 + ", jumpInfo: " + ((java.lang.String) d17.get(".msgsource.forcepushinfov2.forcepushinfocontent.jumpinfo")));
        return G3;
    }

    public final java.lang.String Di(java.lang.String str) {
        java.lang.String str2;
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler]  subscribeMsgVoiceBroadcastEnable=" + o17);
        str2 = "";
        if (!o17) {
            return "";
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.is_audio_template"), 0) == 1) {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.audio_template_url");
            str2 = str3 != null ? str3 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "DyeingTemplateMsgReceiveEvent  audio_template_url=".concat(str2));
        }
        return str2;
    }

    public boolean Ni(java.lang.String xml) {
        kotlin.jvm.internal.o.g(xml, "xml");
        return com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(xml, "msg", null).get(".msg.appmsg.mmreader.template_detail.msg_control_info.need_fold"), 0) == 1;
    }

    public final void wi(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI");
        intent.putExtra("Main_User", "notifymessage");
        intent.putExtra("force_notify_type", "force_notify_wxa_subscribemsg");
        intent.putExtra("MainUI_User_Last_Msg_Type", i17);
        intent.putExtra("MainUI_FromFinderNotification", false);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        mm.w.g(intent, "forcePushJumpToServiceNotify");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/msg/dyeingtemplate/DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/msg/dyeingtemplate/DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
