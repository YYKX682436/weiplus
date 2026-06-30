package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.model.q1 f140424a;

    public final void a(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        e1Var.f140277c2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), -1) > -1;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_url");
        if (str == null) {
            str = "";
        }
        e1Var.f140279d2.f140411b = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url")) && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"))) {
            e1Var.f140280e2 = false;
        } else {
            e1Var.f140280e2 = true;
        }
    }

    public final float b(java.util.List list, float f17, float f18) {
        float f19;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                f19 = 1.0f;
                break;
            }
            com.tencent.mm.plugin.game.model.i0 i0Var = (com.tencent.mm.plugin.game.model.i0) it.next();
            if (i0Var.f140333b <= f17 && i0Var.f140332a > f17) {
                f19 = i0Var.f140334c;
                break;
            }
        }
        return f19 * f18;
    }

    public final java.util.List c(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str3 = str + ".arg_list";
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                str2 = str3;
            } else {
                str2 = str3 + i17;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i17++;
            com.tencent.mm.plugin.game.model.i0 i0Var = new com.tencent.mm.plugin.game.model.i0();
            i0Var.f140332a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2 + ".up_bound"), 0);
            i0Var.f140333b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2 + ".low_bound"), 0);
            i0Var.f140334c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2 + ".arg_value"), 1);
            arrayList.add(i0Var);
        }
    }

    public final java.util.List d(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                str2 = str;
            } else {
                str2 = str + i17;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i17++;
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".$pkg_id");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                arrayList.add(str3);
            }
        }
    }

    public final void e(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.o0 o0Var = e1Var.G2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.banner.$banner_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        o0Var.f140389a = str;
        com.tencent.mm.plugin.game.model.o0 o0Var2 = e1Var.G2;
        ((java.util.ArrayList) o0Var2.f140390b).clear();
        ((java.util.ArrayList) o0Var2.f140390b).addAll(d(".sysmsg.gamecenter.banner.load_with_wepkg.wepkg", map));
    }

    public final void f(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        e1Var.f140279d2.f140410a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), -1);
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_url");
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.game.model.q0 q0Var = e1Var.f140279d2;
        q0Var.f140411b = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_text");
        if (str2 == null) {
            str2 = "";
        }
        q0Var.f140412c = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.jump_liveinfo_json");
        if (str3 == null) {
            str3 = "";
        }
        q0Var.f140415f = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.click_open_url");
        if (str4 == null) {
            str4 = "";
        }
        q0Var.f140416g = str4;
        boolean z17 = false;
        q0Var.f140417h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.click_open_type"), 0);
        q0Var.f140418i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.icon_type"), 2);
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.colored_text");
        if (str5 == null) {
            str5 = "";
        }
        q0Var.f140413d = str5;
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.outer_colored_text");
        if (str6 == null) {
            str6 = "";
        }
        q0Var.f140414e = str6;
        q0Var.f140419j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_width"), 0) / 2;
        q0Var.f140420k = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_height"), 0) / 2;
        q0Var.f140421l = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_rounded_corner"), 0) == 1;
        q0Var.f140422m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_show_control.basic_type"), -1);
        q0Var.f140423n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_show_control.ignore_local_control"), 0) == 1;
        try {
            z17 = new org.json.JSONObject(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_friends_ui_reddot_special_android, "")).optBoolean("gamecenter");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("GameABConfig", e17.getMessage());
        }
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f140414e)) {
            return;
        }
        q0Var.f140410a = 6;
    }

    public final void g(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.l0 l0Var = e1Var.N2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.extra_data.preload");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        l0Var.f140356a = u46.k.g(str);
        com.tencent.mm.plugin.game.model.l0 l0Var2 = e1Var.N2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(l0Var2.f140356a) || l0Var2.f140356a.getBytes().length <= 204800) {
            return;
        }
        l0Var2.f140356a = "";
    }

    public final void h(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.h0 h0Var = e1Var.f140291p2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.float_layer.open_url");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        h0Var.f140323a = str;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1;
        com.tencent.mm.plugin.game.model.h0 h0Var2 = e1Var.f140291p2;
        h0Var2.f140324b = z18;
        h0Var2.f140325c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
        h0Var2.f140326d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) == 1;
        ((java.util.ArrayList) h0Var2.f140327e).clear();
        ((java.util.ArrayList) h0Var2.f140327e).addAll(d(".sysmsg.gamecenter.float_layer.load_with_wepkg.wepkg", map));
    }

    public final void i(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        e1Var.L2.f140370a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.gamelife.replace_notice"), 0) == 1;
        java.lang.Object obj = map.get(".sysmsg.gamecenter.gamelife.chatmsg");
        com.tencent.mm.plugin.game.model.n0 n0Var = e1Var.L2;
        if (obj != null) {
            n0Var.getClass();
        } else {
            n0Var.getClass();
        }
        com.tencent.mm.plugin.game.model.g0 g0Var = n0Var.f140371b;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.gamelife.chatroom.top_chatroom_name");
        if (str == null) {
            str = "";
        }
        g0Var.f140316a = str;
        com.tencent.mm.plugin.game.model.g0 g0Var2 = n0Var.f140371b;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.gamelife.chatroom.entrance_open_chatroom_name");
        g0Var2.f140317b = str2 != null ? str2 : "";
    }

    public final void j(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.y0 y0Var = e1Var.M2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.tab_info.default_key");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        y0Var.f140523a = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.tab_info.red_dot.key");
        java.lang.String str3 = str2 != null ? str2 : "";
        com.tencent.mm.plugin.game.model.y0 y0Var2 = e1Var.M2;
        y0Var2.f140524b = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var2.f140524b)) {
            return;
        }
        y0Var2.f140525c = e1Var.field_createTime + com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.gamecenter.tab_info.red_dot.expire_time"), 86400L);
    }

    public final void k(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.z0 z0Var = e1Var.K2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.$jump_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        z0Var.f140543a = str;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.show_type"), 0);
        com.tencent.mm.plugin.game.model.z0 z0Var2 = e1Var.K2;
        z0Var2.f140544b = P;
        z0Var2.f140545c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.not_in_msg_center"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_icon");
        if (str2 == null) {
            str2 = "";
        }
        z0Var2.f140546d = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_name");
        if (str3 == null) {
            str3 = "";
        }
        z0Var2.f140547e = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.$jump_id");
        if (str4 == null) {
            str4 = "";
        }
        z0Var2.f140548f = str4;
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark");
        if (str5 == null) {
            str5 = "";
        }
        z0Var2.f140549g = str5;
        z0Var2.f140550h.f140227a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.remark_type"), 0);
        com.tencent.mm.plugin.game.model.b1 b1Var = z0Var2.f140550h;
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.text_color");
        if (str6 == null) {
            str6 = "";
        }
        b1Var.f140228b = str6;
        com.tencent.mm.plugin.game.model.b1 b1Var2 = z0Var2.f140550h;
        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.background_color");
        if (str7 == null) {
            str7 = "";
        }
        b1Var2.f140229c = str7;
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.content_pic");
        if (str8 == null) {
            str8 = "";
        }
        z0Var2.f140551i = str8;
        java.lang.String str9 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.first_line_text");
        if (str9 == null) {
            str9 = "";
        }
        z0Var2.f140552j = str9;
        java.lang.String str10 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.second_line_text");
        if (str10 == null) {
            str10 = "";
        }
        z0Var2.f140553k = str10;
        java.lang.String str11 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_id");
        if (str11 == null) {
            str11 = "";
        }
        z0Var2.f140554l = str11;
        z0Var2.f140555m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_count"), 0);
        java.lang.String str12 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.body_text");
        if (str12 == null) {
            str12 = "";
        }
        z0Var2.f140556n = str12;
        java.lang.String str13 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_desc");
        if (str13 == null) {
            str13 = "";
        }
        z0Var2.f140562t = str13;
        java.lang.String str14 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_text");
        if (str14 == null) {
            str14 = "";
        }
        z0Var2.f140563u = str14;
        java.lang.String str15 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quick_response_content_id");
        if (str15 == null) {
            str15 = "";
        }
        z0Var2.f140565w = str15;
        java.lang.String str16 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quota_text");
        if (str16 == null) {
            str16 = "";
        }
        z0Var2.f140564v = str16;
        z0Var2.f140566x = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.support_quick_response_flag"), 0);
        java.lang.String str17 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content");
        if (str17 == null) {
            str17 = "";
        }
        z0Var2.f140557o = str17;
        java.lang.String str18 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_pic");
        if (str18 == null) {
            str18 = "";
        }
        z0Var2.f140558p = str18;
        java.lang.String str19 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_text");
        if (str19 == null) {
            str19 = "";
        }
        z0Var2.f140559q = str19;
        java.lang.String str20 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.source_name");
        if (str20 == null) {
            str20 = "";
        }
        z0Var2.f140560r = str20;
        java.lang.String str21 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.related_id");
        if (str21 == null) {
            str21 = "";
        }
        z0Var2.f140561s = str21;
        java.lang.String str22 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$merge_jump_id");
        if (str22 == null) {
            str22 = "";
        }
        z0Var2.f140568z = str22;
        java.lang.String str23 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$comment_jump_id");
        z0Var2.f140567y = str23 != null ? str23 : "";
    }

    public final void l(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null || map == null) {
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.exposure_count"), 4);
        com.tencent.mm.plugin.game.model.k0 k0Var = e1Var.O2;
        k0Var.f140347a = P;
        ((java.util.ArrayList) k0Var.f140348b.f140343a).clear();
        ((java.util.ArrayList) k0Var.f140348b.f140343a).addAll(c(".sysmsg.gamecenter.exposure_strategy.wifi_strategy", map));
        k0Var.f140348b.f140344b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.wifi_strategy.enabled"), 0) == 1;
        ((java.util.ArrayList) k0Var.f140349c.f140343a).clear();
        ((java.util.ArrayList) k0Var.f140349c.f140343a).addAll(c(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy", map));
        k0Var.f140349c.f140344b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy.enabled"), 0) == 1;
        ((java.util.ArrayList) k0Var.f140350d.f140343a).clear();
        ((java.util.ArrayList) k0Var.f140350d.f140343a).addAll(c(".sysmsg.gamecenter.exposure_strategy.battery_strategy", map));
        k0Var.f140350d.f140344b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.battery_strategy.enabled"), 0) == 1;
        java.util.List list = e1Var.P2;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.String str = ".sysmsg.gamecenter.exposure_strategy.history_message_list";
            if (i17 != 0) {
                str = ".sysmsg.gamecenter.exposure_strategy.history_message_list" + i17;
            }
            if (!map.containsKey(str)) {
                break;
            }
            i17++;
            com.tencent.mm.plugin.game.model.m0 m0Var = new com.tencent.mm.plugin.game.model.m0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".msg_id");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            m0Var.f140365a = str2;
            m0Var.f140366b = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".click_score"), 0.5f);
            arrayList.add(m0Var);
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        float f17 = e1Var.field_clickScore;
        if (k0Var.f140348b.f140344b) {
            f17 = b(k0Var.f140348b.f140343a, com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1.0f : 0.0f, f17);
        }
        com.tencent.mm.plugin.game.model.j0 j0Var = k0Var.f140350d;
        if (j0Var.f140344b) {
            f17 = b(j0Var.f140343a, ph.t.k().c().b(), f17);
        }
        com.tencent.mm.plugin.game.model.j0 j0Var2 = k0Var.f140349c;
        if (j0Var2.f140344b) {
            f17 = b(j0Var2.f140343a, ((float) (e1Var.field_expireTime - com.tencent.mm.sdk.platformtools.t8.i1())) / 3600.0f, f17);
        }
        e1Var.X2 = f17;
        e1Var.Y2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.ignore_exceed_exposure"), 0) == 1;
    }

    public final void m(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        com.tencent.mm.plugin.game.model.x0 x0Var = e1Var.Q2;
        if (x0Var == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.signature");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        x0Var.f140511a = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.nonce");
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.game.model.x0 x0Var2 = e1Var.Q2;
        x0Var2.f140512b = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.timestamp");
        x0Var2.f140513c = str3 != null ? str3 : "";
        x0Var2.f140514d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.verify_info.version"), 0);
    }

    public final void n(java.util.Map map, com.tencent.mm.plugin.game.model.e1 e1Var) {
        e1Var.S2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.report.noticeid");
        if (str == null) {
            str = "";
        }
        e1Var.T2 = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.report.ext_data");
        if (str2 == null) {
            str2 = "";
        }
        e1Var.U2 = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.report.business_data");
        if (str3 == null) {
            str3 = "";
        }
        e1Var.V2 = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.U2)) {
            return;
        }
        try {
            e1Var.field_contentId = new org.json.JSONObject(e1Var.U2).optString("content_id", "");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameNewMessageParser", e17, "gamelog.srv_msg, parser, parseReportInfo, gameMsgId:%s", e1Var.field_gameMsgId);
        }
    }
}
