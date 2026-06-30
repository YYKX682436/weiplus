package xe4;

/* loaded from: classes9.dex */
public class c implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f453968m = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f453969d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f453970e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f453971f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f453972g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f453973h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f453974i;

    public c(android.content.Context context) {
        this.f453969d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f453971f = rVar;
        this.f453970e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494857a1);
        this.f453972g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_top_sport");
        this.f453973h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_not_disturb");
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_record_data".equals(str);
        android.content.Context context = this.f453969d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(context, "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI");
            android.content.Context context2 = this.f453969d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("contact_info_top_sport".equals(str)) {
            if (this.f453972g.N()) {
                ve4.g.a(20);
                c01.e2.t0(this.f453970e.d1(), true, true);
            } else {
                ve4.g.a(21);
                c01.e2.B0(this.f453970e.d1(), true, true);
            }
        } else if ("contact_info_not_disturb".equals(str)) {
            if (this.f453973h.N()) {
                ve4.g.a(22);
                c01.e2.p0(this.f453970e, true);
            } else {
                ve4.g.a(23);
                c01.e2.z0(this.f453970e, true);
            }
        } else if ("contact_info_go_to_sport".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", this.f453970e.d1());
            intent2.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent2, null);
            ve4.g.a(19);
        } else if ("contact_info_go_to_my_profile".equals(str)) {
            java.lang.String r17 = c01.z1.r();
            if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
                return false;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra(dm.i4.COL_USERNAME, r17);
            j45.l.j(context, "exdevice", ".ui.ExdeviceProfileUI", intent3, null);
            ve4.g.a(3);
        } else if ("contact_info_invite_friend".equals(str)) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Select_Talker_Name", this.f453970e.d1());
            intent4.putExtra("Select_block_List", this.f453970e.d1());
            intent4.putExtra("Select_Conv_Type", 3);
            intent4.putExtra("Select_Send_Card", true);
            intent4.putExtra("mutil_select_is_ret", true);
            j45.l.v(context, ".ui.transmit.SelectConversationUI", intent4, 1);
            ve4.g.a(4);
        } else if ("contact_info_common_problem".equals(str)) {
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("KPublisherId", "custom_menu");
            intent5.putExtra("pre_username", this.f453970e.d1());
            intent5.putExtra("prePublishId", "custom_menu");
            intent5.putExtra("preUsername", this.f453970e.d1());
            intent5.putExtra("preChatName", this.f453970e.d1());
            intent5.putExtra("preChatTYPE", c01.h2.a(this.f453970e.d1(), this.f453970e.d1()));
            intent5.putExtra("rawUrl", f453968m);
            intent5.putExtra("geta8key_username", this.f453970e.d1());
            intent5.putExtra("from_scence", 1);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent5, null);
            ve4.g.a(5);
        } else if ("contact_info_privacy_and_notification".equals(str)) {
            j45.l.h(context, "exdevice", ".ui.ExdeviceSettingUI");
        } else if ("contact_info_sport_install".equals(str)) {
            ve4.g.a(13);
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
            this.f453974i = Q;
            Q.show();
            c01.d9.e().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_43f2581f6fd6");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            c01.d9.e().g(new com.tencent.mm.pluginsdk.model.m3(1, linkedList, linkedList2, "", ""));
            com.tencent.mm.plugin.sport.model.t.b(true);
        } else if ("contact_info_sport_uninstall".equals(str)) {
            ve4.g.a(14);
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new xe4.b(this), null);
        } else if ("contact_info_clear_data".equals(str)) {
            android.content.Context context3 = this.f453969d;
            db5.e1.A(context3, context3.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new xe4.a(this), null);
        }
        return false;
    }

    public final void a() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f453971f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f453970e.d1(), this.f453970e.g2(), this.f453969d.getString(com.tencent.mm.R.string.bir));
        if (!this.f453970e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_sport_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_sport_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_go_to_sport", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_go_to_my_profile", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_invite_friend", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_common_problem", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_record_data", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_privacy_and_notification", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_top_sport", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_not_disturb", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_sport_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_sport_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_go_to_sport", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_go_to_my_profile", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_invite_friend", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_common_problem", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_record_data", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_privacy_and_notification", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_top_sport", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f453971f).m("contact_info_not_disturb", false);
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).K(this.f453970e.d1())) {
            this.f453972g.O(true);
        } else {
            this.f453972g.O(false);
        }
        if (c01.e2.P(this.f453970e)) {
            this.f453973h.O(true);
        } else {
            this.f453973h.O(false);
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && i17 == 1 && intent != null) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("received_card_name").split(","));
            java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                ((dk5.s5) tg3.t1.a()).Di("gh_43f2581f6fd6", str, com.tencent.mm.storage.z3.R4(str), null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                    am.mt mtVar = sendMsgEvent.f54752g;
                    mtVar.f7362a = str;
                    mtVar.f7363b = stringExtra;
                    mtVar.f7364c = c01.e2.C(str);
                    mtVar.f7365d = 0;
                    sendMsgEvent.e();
                }
            }
        }
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qk.o oVar;
        if (m1Var instanceof com.tencent.mm.pluginsdk.model.m3) {
            c01.d9.e().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) m1Var).J();
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", J2);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n("gh_43f2581f6fd6", true);
                if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.tencent.mm.storage.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        oVar = r01.z.b(d17);
                        if (oVar != null) {
                            oVar.field_username = J2;
                        }
                        r01.q3.cj().d(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(n17.d1(), true);
                        if (oVar != null) {
                            r01.q3.cj().insert(oVar);
                        } else {
                            qk.o b17 = r01.z.b(n18.d1());
                            if (b17 == null || b17.U0()) {
                                c01.n8.a().c(n18.d1(), 21);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 21);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                r01.q3.cj().replace(r01.q3.cj().b1(n17.d1()));
                c01.d9.b().p().w(327825, java.lang.Boolean.TRUE);
                rn3.i.Di().h(3, 1, 0, "", null);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy register local newtips, tipsId:%s, tipsVersion:%s, key:%s", 3, 1, "");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && ((i18 == -2 || i18 == -101 || i18 == -24) && !com.tencent.mm.sdk.platformtools.t8.K0(str))) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f453974i;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
        }
    }
}
