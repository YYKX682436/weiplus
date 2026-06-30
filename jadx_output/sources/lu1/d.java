package lu1;

/* loaded from: classes15.dex */
public abstract class d {
    public static void a(com.tencent.mm.ui.MMActivity mMActivity, int i17, com.tencent.mm.ui.da daVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_is_ret", false);
        intent.putExtra("Select_Conv_Type", 3);
        j45.l.w(mMActivity, ".ui.transmit.SelectConversationUI", intent, i17, daVar);
    }

    public static void b(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardNewMsgUI.class);
        intent.putExtra("from_menu", z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardMsgCenterView", 0, "", "", 0, 0, "", 0, "");
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity, float f17, float f18, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 13);
        intent.putExtra("kwebmap_slat", f17);
        intent.putExtra("kwebmap_lng", f18);
        intent.putExtra("kPoiName", str);
        intent.putExtra("Kwebmap_locaion", str2);
        j45.l.j(mMActivity, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    public static boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
            return false;
        }
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str2;
        if (str3 == null) {
            str3 = "";
        }
        nxVar.f7467b = str3;
        nxVar.f7468c = i18;
        if (i17 == 26) {
            nxVar.f7469d = 1029;
        } else {
            nxVar.f7469d = 1028;
        }
        nxVar.f7470e = str;
        nxVar.f7478m = true;
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", nxVar.f7466a, nxVar.f7467b, java.lang.Integer.valueOf(nxVar.f7469d), java.lang.Integer.valueOf(nxVar.f7468c));
        return true;
    }

    public static boolean e(java.lang.String str, r45.w50 w50Var, int i17, int i18) {
        if (w50Var != null) {
            return d(str, w50Var.f388887p, w50Var.f388888q, i17, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
        return false;
    }

    public static void f(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        if (i17 > 0) {
            nxVar.f7474i = i17;
        }
        nxVar.f7469d = 1028;
        startAppBrandUIFromOuterEvent.e();
    }

    public static void g(com.tencent.mm.ui.MMActivity mMActivity, int i17, java.lang.String str, boolean z17, tt1.j jVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 3);
        intent.putExtra("key_expire_time", i17);
        intent.putExtra("key_begin_time", java.lang.System.currentTimeMillis());
        intent.putExtra("key_card_tips", str);
        intent.putExtra("key_is_mark", z17);
        intent.putExtra("key_card_id", jVar.f());
        intent.putExtra("key_user_card_id", jVar.g());
        intent.putExtra("key_card_code", jVar.i0().f385189o);
        j45.l.j(mMActivity, "offline", ".ui.WalletOfflineEntranceUI", intent, null);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11850, 5, 0);
        g0Var.d(19671, 1, jVar.g());
    }

    public static void h(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_BRAND_NAME", str);
        j45.l.j(mMActivity, "card", ".ui.CardShowWaringTransparentUI", intent, null);
    }

    public static void i(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardActivityHelper", "context is null, err");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public static void j(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", i17);
        j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void k(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", 0);
        intent.putExtra("rawUrl", str);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void l(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!c01.e2.J(str)) {
            i(context, str);
        } else {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        }
    }
}
