package wo3;

/* loaded from: classes9.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f448144a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public wo3.t f448145b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f448146c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f448147d;

    public c0() {
        java.util.Map d17;
        int P;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f448146c = arrayList;
        this.f448147d = new java.util.HashSet();
        java.lang.String Ni = to3.c0.Ai().Ni(196631);
        if (!android.text.TextUtils.isEmpty(Ni) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(Ni, "sysmsg", null)) != null && (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1)) >= 0 && P == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
            b(c(d17));
        }
        arrayList.clear();
    }

    public void a(java.lang.String str, boolean z17) {
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null).get(".sysmsg.paymsg.PayMsgType"), -1);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = to3.q.f420973c;
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(20);
        hashSet.add(23);
        hashSet.add(24);
        if (hashSet.contains(java.lang.Integer.valueOf(P))) {
            gm0.j1.e().j(new wo3.r(this, z17));
        }
    }

    public void b(wo3.v vVar) {
        wo3.s sVar;
        if (this.f448144a == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f448144a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f448144a.get(i17);
            if (weakReference != null && (sVar = (wo3.s) weakReference.get()) != null && sVar.onNotify(vVar)) {
                return;
            }
        }
    }

    public final wo3.t c(java.util.Map map) {
        if (this.f448145b == null) {
            this.f448145b = new wo3.t(this);
        }
        this.f448145b.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        this.f448145b.f448213d = (java.lang.String) map.get(".sysmsg.paymsg.isfreeze");
        wo3.t tVar = this.f448145b;
        tVar.getClass();
        this.f448145b.f448214e = (java.lang.String) map.get(".sysmsg.paymsg.freezemsg");
        return this.f448145b;
    }

    public final wo3.w d(java.util.Map map) {
        wo3.w wVar = new wo3.w(this);
        wVar.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        wVar.f448219d = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        return wVar;
    }

    public final wo3.x e(java.util.Map map) {
        wo3.x xVar = new wo3.x(this);
        xVar.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        xVar.f448220d = (java.lang.String) map.get(".sysmsg.paymsg.cftretcode");
        xVar.f448221e = (java.lang.String) map.get(".sysmsg.paymsg.cftretmsg");
        xVar.f448222f = (java.lang.String) map.get(".sysmsg.paymsg.wxretcode");
        xVar.f448223g = (java.lang.String) map.get(".sysmsg.paymsg.wxretmsg");
        xVar.f448224h = (java.lang.String) map.get(".sysmsg.paymsg.error_detail_url");
        xVar.f448225i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.pay_cmd"), -1);
        xVar.f448226j = (java.lang.String) map.get(".sysmsg.paymsg.error_icon_url");
        xVar.f448227k = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.paymsg.error_icon_lightmode_color"), 0L);
        xVar.f448228l = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.paymsg.error_icon_darkmode_color"), 0L);
        xVar.f448229m = (java.lang.String) map.get(".sysmsg.paymsg.view_id");
        xVar.f448230n = (java.lang.String) map.get(".sysmsg.paymsg.right_btn_title");
        xVar.f448231o = (java.lang.String) map.get(".sysmsg.paymsg.tinyapp_username");
        xVar.f448232p = (java.lang.String) map.get(".sysmsg.paymsg.tinyapp_path");
        return xVar;
    }

    public final wo3.y f(java.util.Map map) {
        java.util.Map map2;
        wo3.y yVar;
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity;
        java.lang.Object obj;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity2;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.util.Map map3 = map;
        wo3.y yVar2 = new wo3.y(this);
        yVar2.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.PayMsgType"), -1);
        yVar2.f448233d = (java.lang.String) map3.get(".sysmsg.paymsg.transid");
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = new com.tencent.mm.plugin.wallet_core.model.Orders();
        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity3 = new com.tencent.mm.plugin.wallet_core.model.Orders.Commodity();
        commodity3.f179703d = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_uin");
        commodity3.f179704e = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_name");
        commodity3.f179705f = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.sale_uin");
        commodity3.f179706g = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.sale_name");
        commodity3.f179714r = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trans_id");
        commodity3.f179707h = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.goods_name");
        commodity3.f179709m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.pay_num"), -1) / 100.0d;
        commodity3.f179711o = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trade_state");
        java.lang.Object obj2 = ".sysmsg.paymsg.user_roll.trade_state_name";
        commodity3.f179712p = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trade_state_name");
        commodity3.f179715s = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_bank_name");
        commodity3.f179721y = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.discount");
        commodity3.f179713q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
        commodity3.f179716t = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.fee_type");
        commodity3.f179717u = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.appusername");
        commodity3.f179719w = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.app_telephone");
        commodity3.f179710n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1) / 100.0d;
        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
        promotions.f179773f = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname");
        java.lang.String str21 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username");
        promotions.f179776i = str21;
        promotions.f179771d = 0;
        commodity3.f179718v = str21;
        promotions.f179772e = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url");
        promotions.f179775h = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
        commodity3.f179722z = P;
        commodity3.B = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.rateinfo");
        commodity3.C = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.original_feeinfo");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179773f)) {
            commodity3.I = true;
            ((java.util.ArrayList) commodity3.H).add(promotions);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= 255) {
                map2 = map3;
                yVar = yVar2;
                orders = orders2;
                commodity = commodity3;
                obj = obj2;
                i17 = P;
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
            if (i18 == 0) {
                java.lang.String str22 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
                java.lang.String str23 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
                java.lang.String str24 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
                java.lang.String str25 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
                java.lang.String str26 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
                java.lang.String str27 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
                java.lang.String str28 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
                java.lang.String str29 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
                java.lang.String str30 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
                java.lang.String str31 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
                java.lang.String str32 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
                java.lang.String str33 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
                java.lang.String str34 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
                java.lang.String str35 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
                java.lang.String str36 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
                java.lang.String str37 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_version");
                java.lang.String str38 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.get_award_params");
                java.lang.String str39 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.query_award_status_params");
                str3 = str26;
                str5 = str32;
                str19 = str34;
                str6 = str37;
                str18 = str39;
                str12 = str23;
                yVar = yVar2;
                str16 = str33;
                str11 = str38;
                orders = orders2;
                str7 = str24;
                str9 = str29;
                obj = obj2;
                str14 = str25;
                str15 = str30;
                commodity2 = commodity3;
                str13 = str27;
                str4 = str28;
                i17 = P;
                str8 = str22;
                str10 = str31;
                str20 = str35;
                str17 = str36;
            } else {
                java.lang.String str40 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".icon");
                java.lang.String str41 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".wording");
                java.lang.String str42 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".url");
                java.lang.String str43 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".btn_text");
                java.lang.String str44 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".type");
                java.lang.String str45 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".title");
                java.lang.String str46 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_type");
                java.lang.String str47 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_id");
                java.lang.String str48 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".send_record_id");
                java.lang.String str49 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".award_id");
                java.lang.String str50 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".user_record_id");
                java.lang.String str51 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".small_title");
                java.lang.String str52 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_username");
                java.lang.String str53 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_path");
                java.lang.String str54 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_mch_id");
                java.lang.String str55 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_version");
                java.lang.String str56 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".get_award_params");
                java.lang.String str57 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".query_award_status_params");
                str3 = str44;
                str4 = str46;
                str5 = str50;
                str6 = str55;
                orders = orders2;
                i17 = P;
                str7 = str42;
                str8 = str40;
                str9 = str47;
                str10 = str49;
                str11 = str56;
                commodity2 = commodity3;
                str12 = str41;
                str13 = str45;
                yVar = yVar2;
                obj = obj2;
                str14 = str43;
                str15 = str48;
                str16 = str51;
                str17 = str54;
                str18 = str57;
                str19 = str52;
                str20 = str53;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", java.lang.Integer.valueOf(i18 + 1));
                map2 = map;
                commodity = commodity2;
                break;
            }
            promotions2.f179772e = str8;
            promotions2.f179773f = str12;
            promotions2.f179775h = str7;
            promotions2.f179774g = str14;
            promotions2.f179771d = 1;
            promotions2.f179778n = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
            promotions2.f179777m = str13;
            promotions2.f179780p = com.tencent.mm.sdk.platformtools.t8.P(str4, 0);
            promotions2.f179779o = com.tencent.mm.sdk.platformtools.t8.V(str9, 0L);
            promotions2.f179782r = com.tencent.mm.sdk.platformtools.t8.P(str15, 0);
            promotions2.f179781q = com.tencent.mm.sdk.platformtools.t8.P(str10, 0);
            promotions2.f179783s = com.tencent.mm.sdk.platformtools.t8.P(str5, 0);
            promotions2.f179784t = str16;
            promotions2.f179785u = str19;
            promotions2.f179786v = str20;
            promotions2.f179787w = com.tencent.mm.sdk.platformtools.t8.V(str17, 0L);
            promotions2.f179788x = com.tencent.mm.sdk.platformtools.t8.P(str6, 0);
            promotions2.f179789y = str11;
            promotions2.f179790z = str18;
            a36.c q17 = yo3.m.q(map, i18);
            if (q17 != null) {
                promotions2.A = q17;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity4 = commodity2;
            ((java.util.ArrayList) commodity4.H).add(promotions2);
            i18++;
            commodity3 = commodity4;
            yVar2 = yVar;
            P = i17;
            obj2 = obj;
            orders2 = orders;
            map3 = map;
        }
        java.lang.String str58 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
        java.lang.String str59 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
        at4.w0 w0Var = commodity.f179702J;
        w0Var.f13983a = str58;
        w0Var.f13984b = str59;
        java.lang.String str60 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
        java.lang.String str61 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
        java.lang.String str62 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
        java.lang.String str63 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
        java.lang.String str64 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str60) && !com.tencent.mm.sdk.platformtools.t8.K0(str61) && !com.tencent.mm.sdk.platformtools.t8.K0(str62) && !com.tencent.mm.sdk.platformtools.t8.K0(str63)) {
            com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo recommendTinyAppInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo();
            commodity.D = recommendTinyAppInfo;
            recommendTinyAppInfo.f179791d = str60;
            recommendTinyAppInfo.f179792e = str61;
            recommendTinyAppInfo.f179793f = str62;
            recommendTinyAppInfo.f179794g = str63;
            recommendTinyAppInfo.f179795h = str64;
            recommendTinyAppInfo.f179796i = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text");
            commodity.D.f179797m = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0L);
            com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo recommendTinyAppInfo2 = commodity.D;
            com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0L);
            recommendTinyAppInfo2.getClass();
            commodity.D.f179799o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
            commodity.D.f179800p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
            commodity.D.f179801q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
            commodity.D.f179798n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
            commodity.D.f179802r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_version"), 0);
        }
        commodity.E = new com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo();
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.type"), 0);
        java.lang.String str65 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.url");
        java.lang.String str66 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.username");
        java.lang.String str67 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.path");
        java.lang.String str68 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.version");
        java.lang.String str69 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.url");
        java.lang.String str70 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.dark_mode_url");
        java.lang.String str71 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.url");
        java.lang.String str72 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.dark_mode_url");
        java.lang.String str73 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.title");
        java.lang.String str74 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.desc");
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.type"), -1);
        java.lang.String str75 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.username");
        java.lang.String str76 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.feedid");
        java.lang.String str77 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.nonceid");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "finder jump type：%s", java.lang.Integer.valueOf(P2));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "finder h5 url：%s", str65);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "finder tinyapp username：%s ，path：%s，version：%s", str66, str67, str68);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "finder finder_logo_normal：%s，finder_title：%s，finder_desc:%s，finder_uri_type：%s，finder_uri_username：%s，finder_uri_feedid：%s,finder_uri_nonceid：%s", str69, str73, str74, java.lang.Integer.valueOf(P3), str75, str76, str77);
        com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo finderInfo = commodity.E;
        finderInfo.f179742d = P2;
        finderInfo.f179743e = str65;
        finderInfo.f179744f = str66;
        finderInfo.f179745g = str67;
        finderInfo.f179746h = str68;
        finderInfo.f179747i = str69;
        finderInfo.f179748m = str70;
        finderInfo.f179749n = str71;
        finderInfo.f179750o = str72;
        finderInfo.f179751p = str73;
        finderInfo.f179752q = str74;
        finderInfo.f179753r = P3;
        finderInfo.f179754s = str75;
        finderInfo.f179755t = str76;
        finderInfo.f179756u = str77;
        com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo leadTailViewInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo();
        commodity.F = leadTailViewInfo;
        leadTailViewInfo.f179757d = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.desc");
        commodity.F.f179758e = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.url");
        commodity.F.f179759f = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.dark_mode_url");
        commodity.F.f179760g = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.url");
        commodity.F.f179761h = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.dark_mode_url");
        commodity.F.f179762i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.type"), 0);
        commodity.F.f179763m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.type"), 0);
        commodity.F.f179764n = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.url");
        commodity.F.f179765o = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.username");
        commodity.F.f179766p = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.path");
        commodity.F.f179767q = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.version");
        commodity.F.f179768r = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.busi_param");
        commodity.F.f179769s = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.trans_id");
        commodity.F.f179770t = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.mmpay_mkt_sign");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.wallet_core.model.Orders orders3 = orders;
        orders3.M = arrayList;
        arrayList.add(commodity);
        orders3.V = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
        orders3.W = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording");
        orders3.C = (java.lang.String) map.get(obj);
        orders3.A = i17;
        orders3.f179675e = (java.lang.String) map.get(".sysmsg.req_key");
        orders3.X = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.is_use_show_info"), 0);
        orders3.Z = new java.util.ArrayList();
        for (int i19 = 0; i19 < 255; i19++) {
            java.lang.String str78 = i19 == 0 ? ".sysmsg.paymsg.user_roll.show_info.record." : ".sysmsg.paymsg.user_roll.show_info.record" + i19 + ".";
            com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo();
            showInfo.f179805d = (java.lang.String) map.get(str78 + com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            showInfo.f179806e = (java.lang.String) map.get(str78 + "value");
            showInfo.f179807f = (java.lang.String) map.get(str78 + "name_color");
            showInfo.f179808g = (java.lang.String) map.get(str78 + "value_color");
            java.lang.String str79 = str78 + "value_attr.";
            showInfo.f179809h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str79 + "link_type"), 0);
            showInfo.f179810i = (java.lang.String) map.get(str79 + "link_weapp");
            showInfo.f179811m = (java.lang.String) map.get(str79 + "link_addr");
            showInfo.f179812n = (java.lang.String) map.get(str79 + "link_url");
            showInfo.f179813o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str79 + "text_attr"), 0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(showInfo.f179805d) || !com.tencent.mm.sdk.platformtools.t8.K0(showInfo.f179806e)) {
                orders3.Z.add(showInfo);
            }
        }
        commodity.f179710n = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) map.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0d) / 100.0d;
        if (android.text.TextUtils.isEmpty((java.lang.String) map.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
        } else {
            int i27 = 0;
            while (true) {
                java.lang.String str80 = i27 != 0 ? "" + i27 : "";
                str = ".sysmsg.paymsg.user_roll.discount_array.record" + str80 + ".favor_desc";
                str2 = ".sysmsg.paymsg.user_roll.discount_array.record" + str80 + ".payment_amount";
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str)) || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str2))) {
                    break;
                }
                com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo discountInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo();
                discountInfo.f179741e = (java.lang.String) map.get(str);
                discountInfo.f179740d = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) map.get(str2), 0.0d);
                ((java.util.ArrayList) commodity.A).add(discountInfo);
                i27++;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str + ", payment_amount_key is " + str2 + ", break");
        }
        wo3.y yVar3 = yVar;
        yVar3.f448234e = orders3;
        if (((java.util.ArrayList) orders3.M).size() > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) yVar3.f448234e.M).get(0)).f179714r);
        }
        if (map.containsKey(".sysmsg.paymsg.real_name_info")) {
            yVar3.f448235f = new wo3.a0(this, map);
        }
        return yVar3;
    }

    public final wo3.z g(java.util.Map map) {
        wo3.z zVar = new wo3.z(this);
        zVar.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        zVar.f448236d = (java.lang.String) map.get(".sysmsg.paymsg.good_name");
        zVar.f448237e = (java.lang.String) map.get(".sysmsg.paymsg.total_fee");
        zVar.f448240h = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        zVar.f448238f = (java.lang.String) map.get(".sysmsg.paymsg.id");
        java.lang.String str = (java.lang.String) map.get(".sysmsg.paymsg.confirm_type");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + zVar.f448239g);
        if (android.text.TextUtils.isEmpty(str) || !str.equals("1")) {
            zVar.f448239g = 0;
        } else {
            zVar.f448239g = 1;
        }
        return zVar;
    }

    public final void h(java.lang.String str) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING;
        c17.x(u3Var, "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING;
        c18.x(u3Var2, "");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.pay_cmd"), -1);
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.req_key");
        gm0.j1.u().c().x(u3Var, (java.lang.String) d17.get(".sysmsg.paymsg.ack_key"));
        if (P < 0) {
            P = 0;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(u3Var2, str2);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "msg type is " + P3);
        if (P3 >= 0 && P3 == 4) {
            b(c(d17));
            to3.c0.Ai().Vi(196631, str);
            return;
        }
        if (P3 >= 0 && P3 == 5) {
            if (P2 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "payCmd is PAY_CMD_OFFLINE_PAY_REFRESH_TOKEN (value is 1), refresh offline token");
                to3.c0.Ai().Ui().a(4, 4);
            }
            b(e(d17));
            return;
        }
        if (P3 >= 0 && P3 == 6) {
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.transid");
            com.tencent.mars.xlog.Log.i("helios", "MSG_TYPE_ORDER trasid=" + str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "orders xml: %s", str);
            b(f(d17));
            return;
        }
        if (P3 >= 0 && P3 == 7) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
            return;
        }
        if (P3 >= 0 && P3 == 8) {
            b(g(d17));
            return;
        }
        if (P3 >= 0 && P3 == 10) {
            to3.c0.Ai().Ui().a(4, 4);
            return;
        }
        if (P3 >= 0 && P3 == 20) {
            com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent = new com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent();
            walletOfflineRealNameNotifyEvent.f54962g.f7595a = new wo3.a0(this, d17);
            walletOfflineRealNameNotifyEvent.e();
            return;
        }
        if (P3 < 0 || P3 != 23) {
            if (P3 < 0 || P3 != 24) {
                return;
            }
            b(i(d17));
            return;
        }
        wo3.w d18 = d(d17);
        synchronized (this.f448147d) {
            if (this.f448147d.contains(d18.f448219d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", d18.f448219d);
            } else {
                this.f448147d.add(d18.f448219d);
                b(d18);
            }
        }
    }

    public final wo3.w i(java.util.Map map) {
        wo3.w wVar = new wo3.w(this);
        wVar.f448216a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        wVar.f448219d = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        return wVar;
    }

    public void j(wo3.s sVar) {
        wo3.s sVar2;
        if (this.f448144a == null || sVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f448144a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f448144a.get(i17);
            if (weakReference != null && (sVar2 = (wo3.s) weakReference.get()) != null && sVar2.equals(sVar)) {
                this.f448144a.remove(weakReference);
                return;
            }
        }
    }
}
