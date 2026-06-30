package hr3;

/* loaded from: classes9.dex */
public class w8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f284146d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f284147e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f284148f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f284149g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f284150h;

    public w8(android.content.Context context) {
        this.f284146d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetWxGame", "onAttach");
        this.f284148f = rVar;
        this.f284147e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494860a4);
        this.f284149g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxgame_top");
        this.f284150h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxgame_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetWxGame", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1884795432:
                if (str.equals("contact_info_wxgame_go_to")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1342339903:
                if (str.equals("contact_info_wxgame_install")) {
                    c17 = 1;
                    break;
                }
                break;
            case -998595717:
                if (str.equals("contact_info_wxgame_top")) {
                    c17 = 2;
                    break;
                }
                break;
            case -841195146:
                if (str.equals("contact_info_wxgame_clear_data")) {
                    c17 = 3;
                    break;
                }
                break;
            case 77887290:
                if (str.equals("contact_info_wxgame_invite_friend")) {
                    c17 = 4;
                    break;
                }
                break;
            case 1039481017:
                if (str.equals("contact_info_wxgame_not_disturb")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1094963909:
                if (str.equals("contact_info_wxgame_push_setting")) {
                    c17 = 6;
                    break;
                }
                break;
            case 2141869704:
                if (str.equals("contact_info_wxgame_uninstall")) {
                    c17 = 7;
                    break;
                }
                break;
        }
        android.content.Context context = this.f284146d;
        switch (c17) {
            case 0:
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    int intExtra = activity.getIntent().getIntExtra("key_wxgame_setting_from_scene", 0);
                    if (((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                        if (intExtra == 3) {
                            activity.finish();
                        }
                    } else if (intExtra == 1) {
                        activity.finish();
                    }
                    return true;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f284147e.d1());
                intent.putExtra("finish_direct", true);
                if (((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                    intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
                    ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(context, intent);
                } else {
                    j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                }
                return true;
            case 1:
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
                Q.show();
                gm0.j1.d().a(30, new hr3.u8(this, Q));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("gh_25d9ac85a4bc");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(1);
                gm0.j1.d().g(new com.tencent.mm.pluginsdk.model.m3(1, arrayList, arrayList2, "", ""));
                return true;
            case 2:
                if (this.f284149g.N()) {
                    c01.e2.t0(this.f284147e.d1(), true, true);
                    com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
                    weGamePluginReportStruct.f62911d = 2L;
                    weGamePluginReportStruct.f62912e = 3L;
                    weGamePluginReportStruct.f62913f = weGamePluginReportStruct.b("BizContent", null, true);
                    weGamePluginReportStruct.k();
                } else {
                    c01.e2.B0(this.f284147e.d1(), true, true);
                    com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
                    weGamePluginReportStruct2.f62911d = 2L;
                    weGamePluginReportStruct2.f62912e = 4L;
                    weGamePluginReportStruct2.f62913f = weGamePluginReportStruct2.b("BizContent", null, true);
                    weGamePluginReportStruct2.k();
                }
                return true;
            case 3:
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.t8(this), null);
                return true;
            case 4:
                java.lang.String d17 = this.f284147e.d1();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Talker_Name", this.f284147e.d1());
                intent2.putExtra("Select_block_List", d17);
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("Select_Send_Card", true);
                intent2.putExtra("mutil_select_is_ret", true);
                j45.l.v(context, ".ui.transmit.SelectConversationUI", intent2, 1);
                return true;
            case 5:
                boolean N = this.f284150h.N();
                a("mute", N);
                if (N) {
                    c01.e2.p0(this.f284147e, true);
                    com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
                    weGamePluginReportStruct3.f62911d = 3L;
                    weGamePluginReportStruct3.f62912e = 3L;
                    weGamePluginReportStruct3.f62913f = weGamePluginReportStruct3.b("BizContent", null, true);
                    weGamePluginReportStruct3.k();
                } else {
                    c01.e2.z0(this.f284147e, true);
                    com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
                    weGamePluginReportStruct4.f62911d = 3L;
                    weGamePluginReportStruct4.f62912e = 4L;
                    weGamePluginReportStruct4.f62913f = weGamePluginReportStruct4.b("BizContent", null, true);
                    weGamePluginReportStruct4.k();
                }
                return true;
            case 6:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(context, "com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI");
                android.content.Context context2 = this.f284146d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context2, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetWxGame", "gotoPushSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetWxGame", "gotoPushSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 7:
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.v8(this), null);
                return true;
            default:
                return false;
        }
    }

    public final void a(java.lang.String str, boolean z17) {
        if (((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str, z17);
            } catch (org.json.JSONException unused) {
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject);
        }
    }

    public final void b() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284148f).h("contact_info_wxgame_header_helper");
        helperHeaderPreference.M(this.f284147e.d1(), this.f284147e.f2(), this.f284146d.getString(com.tencent.mm.R.string.bji));
        if (!this.f284147e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_invite_friend", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_push_setting", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_go_to", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_invite_friend", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_push_setting", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f284148f).m("contact_info_wxgame_clear_data", false);
        this.f284149g.O(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f284147e.d1()));
        this.f284150h.O(c01.e2.P(this.f284147e));
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && i17 == 1 && intent != null) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("received_card_name").split(","));
            java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                ((dk5.s5) tg3.t1.a()).Di("gh_25d9ac85a4bc", str, com.tencent.mm.storage.z3.R4(str), null);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetWxGame", "onDetach");
        return true;
    }
}
