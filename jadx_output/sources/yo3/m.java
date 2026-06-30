package yo3;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f464154a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f464155b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f464156c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f464157d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f464158e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f464159f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f464160g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f464161h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f464162i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f464163j = false;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f464164k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f464165l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f464166m = "";

    public static void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "clear offline data");
        to3.c0.Ai().Vi(196630, "0");
        to3.c0.Ai().Vi(196626, "");
        to3.c0.Ai().Vi(196627, "");
        to3.c0.Ai().Vi(196628, "");
        to3.c0.Ai().Vi(196617, "");
        to3.c0.Ai().Vi(196632, "");
        to3.c0.Ai().Vi(196641, "");
        to3.c0.Ai().Vi(196647, "");
        to3.c0.Ai().Vi(196649, "");
        l();
        t("", "", "", "", 2);
        r(0);
        to3.c0.Ai().Vi(196629, "0");
        to3.c0.Ai().Vi(196631, "");
        to3.c0.Ai().Ri().f448145b = null;
        to3.c0.Ai().Ui().getClass();
        com.tencent.mm.wallet_core.model.g.c().a(to3.c0.Ai().Ni(196617));
        to3.c0.Ai().Vi(196615, "");
        f464158e = "";
        to3.c0.Ai().Vi(196656, "");
        f464156c = "";
    }

    public static void b(android.app.Activity activity, int i17) {
        java.lang.String Ni = to3.c0.Ai().Ni(196640);
        int i18 = 0;
        if (!android.text.TextUtils.isEmpty(Ni) && j(Ni)) {
            i18 = com.tencent.mm.sdk.platformtools.t8.P(Ni, 0);
        }
        y(activity, "create", "", i18 > 0 ? i18 * 100 : com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL, i17);
    }

    public static java.util.List c(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        for (int i17 = 0; i17 < a17.size(); i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i17);
            if (z17) {
                arrayList.add(bankcard);
            } else {
                arrayList.add(bankcard);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + arrayList.size());
        return arrayList;
    }

    public static com.tencent.mm.plugin.wallet_core.model.Bankcard d(boolean z17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(z17);
        if (a17 != null && a17.field_support_micropay && com.tencent.mm.sdk.platformtools.t8.K0(a17.field_forbidWord)) {
            return a17;
        }
        java.util.ArrayList a18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        for (int i17 = 0; i17 < a18.size(); i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a18.get(i17);
            if (bankcard != null && bankcard.field_support_micropay) {
                return bankcard;
            }
        }
        return null;
    }

    public static java.lang.String e() {
        if (!android.text.TextUtils.isEmpty(f464154a)) {
            return f464154a;
        }
        gm0.j1.n().f273288b.g(new c01.ra(new yo3.j(), null));
        if (android.text.TextUtils.isEmpty(f464154a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "token is null");
        }
        return f464154a;
    }

    public static int f() {
        if (f464159f == 0) {
            f464159f = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, 0)).intValue();
        }
        return f464159f;
    }

    public static int g() {
        java.lang.String Ni = to3.c0.Ai().Ni(196649);
        if (android.text.TextUtils.isEmpty(Ni) || !j(Ni)) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.t8.P(Ni, 0);
    }

    public static void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "launch 3rd app: %s", str);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineUtil", "can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp resp = new com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp();
        resp.errCode = 0;
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = h17.field_packageName;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    public static boolean i() {
        com.tencent.mm.wallet_core.b.a().getClass();
        if (!((h45.q) i95.n0.c(h45.q.class)).isKindaEnabled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "isKindaEnabled false");
            return false;
        }
        boolean isOfflineReady = ((h45.q) i95.n0.c(h45.q.class)).isOfflineReady();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "is kinda ready is %s", java.lang.Boolean.valueOf(isOfflineReady));
        if (!k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "offlinepay is not create, depend on isKindaReady");
            if (!isOfflineReady && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 112L, 1L, false);
                com.tencent.mm.wallet_core.b.a().getClass();
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_kinda_ready, true)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                    return true;
                }
            }
            return isOfflineReady;
        }
        if (!(f() == 2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "abtest is on, but using v1authcode, request get token");
            to3.c0.Ai().Ui().b(1, 1);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "using v2authcode, depend on isKindaReady");
        if (!isOfflineReady && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 111L, 1L, false);
            com.tencent.mm.wallet_core.b.a().getClass();
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_kinda_ready, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                return true;
            }
        }
        return isOfflineReady;
    }

    public static boolean j(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static boolean k() {
        java.lang.String Ni = to3.c0.Ai().Ni(196630);
        return Ni != null && Ni.equals("1");
    }

    public static int l() {
        com.tencent.mm.wallet_core.b.a().getClass();
        return 1;
    }

    public static boolean m() {
        java.lang.String Ni = to3.c0.Ai().Ni(196641);
        return Ni != null && Ni.equals("1");
    }

    public static void n(android.content.Context context) {
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        boolean z17 = false;
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_host_change_to_cn_android", "", false, false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17) && com.tencent.mm.sdk.platformtools.t8.P(a17, 0) != 0) {
            z17 = true;
        }
        com.tencent.mm.wallet_core.ui.r1.V(context, z17 ? "zh_CN".equals(d17) ? context.getString(com.tencent.mm.R.string.k4m) : "zh_TW".equals(d17) ? context.getString(com.tencent.mm.R.string.k4p) : "zh_HK".equals(d17) ? context.getString(com.tencent.mm.R.string.k4o) : context.getResources().getString(com.tencent.mm.R.string.k4n) : "zh_CN".equals(d17) ? context.getString(com.tencent.mm.R.string.k4q) : "zh_TW".equals(d17) ? context.getString(com.tencent.mm.R.string.k4t) : "zh_HK".equals(d17) ? context.getString(com.tencent.mm.R.string.k4s) : context.getResources().getString(com.tencent.mm.R.string.k4r), true);
    }

    public static java.util.LinkedList o(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            if (jSONObject != null) {
                yo3.k kVar = new yo3.k();
                kVar.f464150a = jSONObject.optInt("card_id");
                jSONObject.optString("bank_type");
                kVar.f464151b = jSONObject.optString("bind_serial");
                jSONObject.optString("forbid_word");
                linkedList.add(kVar);
            }
        }
        return linkedList;
    }

    public static java.util.LinkedList p(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    yo3.l lVar = new yo3.l();
                    lVar.f464152a = jSONObject.optString("bank_type");
                    lVar.f464153b = jSONObject.optString("icon_url");
                    linkedList.add(lVar);
                }
            }
            return linkedList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static a36.c q(java.util.Map map, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6;
        java.lang.String str3;
        if (i17 == 0) {
            str = ".sysmsg.paymsg.user_roll.activity_info.record.exposure_info.";
        } else {
            str = ".sysmsg.paymsg.user_roll.activity_info.record" + i17 + ".exposure_info.";
        }
        if (map == null) {
            return null;
        }
        a36.c cVar = new a36.c();
        cVar.f1105e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + "is_query_others"), 0);
        cVar.f1106f = (java.lang.String) map.get(str + "draw_lottery_params");
        cVar.f1107g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + "is_show_btn"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + "exposure_info_modify_params");
        if (str4 == null) {
            str4 = "";
        }
        cVar.f1109i = str4;
        a36.a aVar = new a36.a();
        java.lang.String str5 = str + "btn_info.";
        aVar.f1091d = (java.lang.String) map.get(str5 + "btn_words");
        aVar.f1092e = (java.lang.String) map.get(str5 + "btn_color");
        aVar.f1093f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str5 + "btn_op_type"), 0);
        aVar.f1094g = (java.lang.String) map.get(str5 + "url");
        aVar.f1096i = (java.lang.String) map.get(str5 + "get_lottery_params");
        java.lang.String str6 = str5 + "mini_app_info.";
        a36.g gVar = new a36.g();
        aVar.f1095h = gVar;
        gVar.f1142d = (java.lang.String) map.get(str6 + "activity_tinyapp_username");
        aVar.f1095h.f1143e = (java.lang.String) map.get(str6 + "activity_tinyapp_path");
        a36.g gVar2 = aVar.f1095h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str6);
        java.lang.String str7 = "activity_tinyapp_version";
        sb7.append("activity_tinyapp_version");
        gVar2.f1144f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7.toString()), 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1091d) || !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1094g) || !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1096i) || !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1095h.f1142d) || !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1095h.f1143e)) {
            cVar.f1108h = aVar;
        }
        cVar.f1110m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + "user_opertaion_type"), 0);
        cVar.f1111n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + "is_show_layer"), 0);
        cVar.f1113p = (java.lang.String) map.get(str + "background_img_whole");
        cVar.f1104d = new java.util.LinkedList();
        int i18 = 0;
        while (true) {
            if (i18 >= 255) {
                str2 = str7;
                break;
            }
            if (i18 == 0) {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                str3 = "single_exposure_info_list.record.";
            } else {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("single_exposure_info_list.record");
                sb6.append(i18);
                str3 = ".";
            }
            sb6.append(str3);
            java.lang.String sb8 = sb6.toString();
            a36.i iVar = new a36.i();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(sb8);
            str2 = str7;
            sb9.append("logo");
            iVar.f1149d = (java.lang.String) map.get(sb9.toString());
            iVar.f1150e = (java.lang.String) map.get(sb8 + "award_name");
            iVar.f1151f = (java.lang.String) map.get(sb8 + "award_description");
            iVar.f1152g = (java.lang.String) map.get(sb8 + "background_img");
            iVar.f1153h = (java.lang.String) map.get(sb8 + "award_name_color");
            iVar.f1154i = (java.lang.String) map.get(sb8 + "award_description_color");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1149d) || !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1150e) || !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1151f) || !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1152g) || !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1153h) || !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1154i)) {
                cVar.f1104d.add(iVar);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1150e) || com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1151f)) {
                break;
            }
            i18++;
            str7 = str2;
        }
        cVar.f1112o = new a36.f();
        java.lang.String str8 = str + "layer_info.";
        cVar.f1112o.f1133d = (java.lang.String) map.get(str8 + "layer_title");
        cVar.f1112o.f1134e = (java.lang.String) map.get(str8 + "layer_logo");
        cVar.f1112o.f1135f = (java.lang.String) map.get(str8 + "layer_type");
        cVar.f1112o.f1136g = (java.lang.String) map.get(str8 + "layer_name");
        cVar.f1112o.f1137h = (java.lang.String) map.get(str8 + "layer_description");
        cVar.f1112o.f1138i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str8 + "is_show_layer_btn"), 0);
        cVar.f1112o.f1139m = new a36.e();
        java.lang.String str9 = str8 + "layer_btn_info.";
        cVar.f1112o.f1139m.f1127d = (java.lang.String) map.get(str9 + "btn_words");
        cVar.f1112o.f1139m.f1128e = (java.lang.String) map.get(str9 + "btn_color");
        cVar.f1112o.f1139m.f1129f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str9 + "btn_op_type"), 0);
        cVar.f1112o.f1139m.f1130g = (java.lang.String) map.get(str9 + "get_lottery_params");
        cVar.f1112o.f1139m.f1131h = (java.lang.String) map.get(str9 + "url");
        java.lang.String str10 = str9 + "mini_app_info.";
        cVar.f1112o.f1139m.f1132i = new a36.g();
        cVar.f1112o.f1139m.f1132i.f1142d = (java.lang.String) map.get(str10 + "activity_tinyapp_username");
        cVar.f1112o.f1139m.f1132i.f1143e = (java.lang.String) map.get(str10 + "activity_tinyapp_path");
        a36.g gVar3 = cVar.f1112o.f1139m.f1132i;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(str10);
        java.lang.String str11 = str2;
        sb10.append(str11);
        gVar3.f1144f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb10.toString()), 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(str8 + "voice_url"))) {
            cVar.f1112o.f1140n = new com.tencent.mm.protobuf.g(((java.lang.String) map.get(str8 + "voice_url")).getBytes());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(str8 + "voice_data"))) {
            cVar.f1112o.f1141o = new com.tencent.mm.protobuf.g(((java.lang.String) map.get(str8 + "voice_data")).getBytes());
        }
        a36.b bVar = new a36.b();
        java.lang.String str12 = str + "draw_lottery_info.";
        bVar.f1098e = (java.lang.String) map.get(str12 + "url");
        bVar.f1099f = (java.lang.String) map.get(str12 + "animation_wording");
        bVar.f1100g = (java.lang.String) map.get(str12 + "animation_wording_color");
        bVar.f1101h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str12 + "op_type"), 0);
        bVar.f1102i = (java.lang.String) map.get(str12 + "after_animation_wording");
        bVar.f1103m = (java.lang.String) map.get(str12 + "after_animation_wording_color");
        java.lang.String str13 = str12 + "mini_app_info.";
        a36.g gVar4 = new a36.g();
        bVar.f1097d = gVar4;
        gVar4.f1142d = (java.lang.String) map.get(str13 + "activity_tinyapp_username");
        bVar.f1097d.f1143e = (java.lang.String) map.get(str13 + "activity_tinyapp_path");
        bVar.f1097d.f1144f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str13 + str11), 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f1098e) || !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f1099f) || !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f1100g) || !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f1097d.f1142d) || !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f1097d.f1143e)) {
            cVar.f1114q = bVar;
        }
        return cVar;
    }

    public static void r(int i17) {
        if (i17 > 0) {
            boolean z17 = to3.c0.f420951i;
            synchronized (to3.c0.class) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, java.lang.Integer.valueOf(i17));
                to3.c0.f420952m = i17;
                to3.c0.f420953n = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "set token num: %s", java.lang.Integer.valueOf(i17));
        }
    }

    public static void s(java.lang.String str) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().E(str);
    }

    public static void t(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        f464154a = str;
        f464155b = str2;
        f464156c = str3;
        f464157d = str4;
        to3.c0.Ai().Vi(196656, str3);
        f464156c = str3;
        u(i17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
        gm0.j1.n().f273288b.g(new c01.ra(new yo3.i(), null));
    }

    public static void u(int i17) {
        int i18 = f464159f;
        f464159f = i17;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        if (i18 != i17) {
            yo3.f fVar = yo3.f.f464145a;
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePriorBankcardLogic", "onTokenTypeChanged: " + f());
            fVar.b();
            java.util.Iterator it = yo3.f.f464147c.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = (com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) ((yo3.e) it.next());
                walletOfflineCoinPurseUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "on token type change");
                walletOfflineCoinPurseUI.c7();
                walletOfflineCoinPurseUI.h7();
            }
        }
    }

    public static void v(android.app.Activity activity) {
        db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.l1p));
        if (android.text.TextUtils.isEmpty(to3.c0.Ai().Ni(196616))) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(activity, to3.c0.Ai().Ni(196616), true);
    }

    public static void w(android.app.Activity activity, int i17, int i18) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192108d = 5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i17);
        if (i18 >= 0) {
            bundle.putInt("key_entry_scene", i18);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            com.tencent.mm.wallet_core.a.j(activity, to3.i.class, bundle, null);
            return;
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y()) {
            bundle.putBoolean("key_is_bind_bankcard", true);
            com.tencent.mm.wallet_core.a.j(activity, to3.l.class, bundle, null);
        } else if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.tencent.mm.wallet_core.a.j(activity, to3.i.class, bundle, null);
        } else {
            bundle.putBoolean("key_is_bind_bankcard", true);
            com.tencent.mm.wallet_core.a.j(activity, to3.l.class, bundle, null);
        }
    }

    public static void x(android.app.Activity activity, int i17, int i18, android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192108d = 5;
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i17);
        if (i18 >= 0) {
            bundle.putInt("key_entry_scene", i18);
        }
        com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
        com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(activity, bundle);
    }

    public static void y(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("oper", str);
        bundle.putInt("offline_chg_fee", i17);
        bundle.putString("pwd_tips", str2);
        if (i18 >= 0) {
            bundle.putInt("offline_from_scene", i18);
        }
        com.tencent.mm.wallet_core.a.j(activity, to3.v.class, bundle, null);
    }
}
