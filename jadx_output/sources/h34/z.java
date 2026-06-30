package h34;

/* loaded from: classes11.dex */
public abstract class z {
    public static void a(h34.h0 h0Var, android.content.Context context, int i17) {
        if (h0Var == null) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(h0Var.field_username) || !com.tencent.mm.sdk.platformtools.t8.K0(h0Var.field_deeplink)) {
            b(h0Var.field_username, h0Var.field_deeplink, i17, context);
            com.tencent.mars.xlog.Log.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start do nth");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = h0Var.field_username;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = 0;
        g0Var.d(12108, objArr);
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17, android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(android.net.Uri.parse(str2));
        intent.putExtra("translate_link_scene", (i17 == 3 || i17 == 4) ? 17 : 16);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = 1;
        g0Var.d(12108, objArr);
    }

    public static void c(c34.r rVar, android.content.Context context, boolean z17) {
        if (rVar == null) {
            return;
        }
        switch (rVar.field_type) {
            case 6:
                java.lang.String str = rVar.field_username;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                if (n17 != null) {
                    android.content.Intent intent = new android.content.Intent();
                    if (n17.r2() && n17.k2()) {
                        r01.q3.cj().b1(str);
                        if (rVar.field_distance.equals("1")) {
                            intent.putExtra("Chat_User", str);
                            intent.putExtra("finish_direct", true);
                            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
                            return;
                        }
                    }
                    intent.putExtra("Contact_User", str);
                    intent.putExtra("force_get_contact", true);
                    j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                    return;
                }
                return;
            case 7:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("geta8key_scene", z17 ? 26 : 18);
                intent2.putExtra("stastic_scene", 6);
                intent2.putExtra("KAppId", "wxaf060266bfa9a35c");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", "wxaf060266bfa9a35c");
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("rawUrl", rVar.field_username);
                intent2.putExtra("srcUsername", rVar.field_distance);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, context);
                return;
            case 8:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClass(context, com.tencent.mm.plugin.shake.ui.TVInfoUI.class);
                intent3.putExtra("key_TV_xml_bytes", rVar.field_lvbuffer);
                intent3.putExtra("key_TV_come_from_shake", true);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 9:
                com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = new com.tencent.mm.autogen.events.GetA8KeyRedirectEvent();
                am.df dfVar = getA8KeyRedirectEvent.f54376g;
                dfVar.f6446a = 11;
                dfVar.f6447b = rVar.field_username;
                dfVar.f6448c = new java.lang.ref.WeakReference(context);
                getA8KeyRedirectEvent.f192364d = null;
                getA8KeyRedirectEvent.b(android.os.Looper.myLooper());
                return;
            case 10:
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_product_id", rVar.field_username);
                intent4.putExtra("key_product_scene", 9);
                j45.l.j(context, "product", ".ui.MallProductUI", intent4, null);
                return;
            case 11:
            default:
                return;
            case 12:
                b(rVar.field_distance, rVar.field_username, z17 ? 4 : 3, context);
                return;
            case 13:
                java.lang.String str2 = rVar.field_username;
                java.lang.String str3 = rVar.field_reserved3;
                int i17 = rVar.field_reserved2;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mars.xlog.Log.i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
                    return;
                }
                com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                nxVar.f7466a = str2;
                if (str3 == null) {
                    str3 = "";
                }
                nxVar.f7467b = str3;
                nxVar.f7468c = 0;
                nxVar.f7469d = mc1.h.CTRL_INDEX;
                nxVar.f7474i = i17;
                startAppBrandUIFromOuterEvent.e();
                com.tencent.mars.xlog.Log.i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", nxVar.f7466a, nxVar.f7467b, java.lang.Integer.valueOf(nxVar.f7469d), java.lang.Integer.valueOf(nxVar.f7468c), java.lang.Integer.valueOf(nxVar.f7474i));
                return;
        }
    }

    public static boolean d(int i17) {
        return 7 == i17 || 6 == i17 || 8 == i17 || 9 == i17 || 10 == i17 || 12 == i17 || 13 == i17;
    }

    public static boolean e() {
        if (x51.o1.f452058k) {
            return true;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowShakeTV");
        return !com.tencent.mm.sdk.platformtools.t8.K0(d17) && d17.equals("1");
    }
}
