package hr3;

/* loaded from: classes9.dex */
public class t6 implements t25.a, com.tencent.mm.modelbase.u0, r01.d0, r01.w2 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f284001J = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/infringement?username=%s&from=1#wechat_redirect";
    public java.lang.String A;
    public com.tencent.mm.ui.base.preference.CheckBoxPreference C;
    public android.os.Bundle E;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f284002d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f284003e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f284004f;

    /* renamed from: g, reason: collision with root package name */
    public qk.o f284005g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f284006h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f284007i;

    /* renamed from: m, reason: collision with root package name */
    public qk.n f284008m;

    /* renamed from: n, reason: collision with root package name */
    public int f284009n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f284010o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f284011p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.va0 f284012q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f284013r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f284014s;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f284020y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f284021z;

    /* renamed from: t, reason: collision with root package name */
    public boolean f284015t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f284016u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f284017v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f284018w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f284019x = 0;
    public android.content.SharedPreferences B = null;
    public boolean D = true;
    public com.tencent.mm.modelsns.SnsAdClick F = null;
    public java.lang.String G = null;
    public com.tencent.mm.ui.widget.dialog.u3 H = null;
    public boolean I = false;

    public t6(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, r45.va0 va0Var) {
        this.f284012q = null;
        this.f284002d = mMActivity;
        this.f284011p = str;
        this.f284012q = va0Var;
    }

    public static void c(hr3.t6 t6Var) {
        t6Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) t6Var.f284002d, 1, false);
        k0Var.f211872n = new hr3.y5(t6Var);
        k0Var.f211881s = new hr3.a6(t6Var);
        k0Var.v();
    }

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        qk.o oVar = this.f284005g;
        if (oVar != null && oVar.F0() && m1Var.getType() == 1354) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_subscribe_bizinfo");
            if (r01.q3.Vi().y0(r01.q3.Vi().z0(this.f284005g.field_username)) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
            } else {
                checkBoxPreference.O(!r3.t0(4));
                ((com.tencent.mm.ui.base.preference.h0) this.f284003e).notifyDataSetChanged();
            }
        }
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        this.f284003e = rVar;
        this.f284004f = z3Var;
        this.f284010o = z17;
        this.f284009n = i17;
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        this.f284019x = mMActivity.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        this.F = (com.tencent.mm.modelsns.SnsAdClick) mMActivity.getIntent().getParcelableExtra("KSnsAdTag");
        this.E = mMActivity.getIntent().getBundleExtra("Contact_Ext_Args");
        this.G = mMActivity.getIntent().getStringExtra("key_add_contact_report_info");
        n();
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            mMActivity.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
            db5.e1.y(mMActivity, stringExtra, "", mMActivity.getString(com.tencent.mm.R.string.f490507x1), null);
        }
        if (this.D) {
            this.D = false;
            r01.q3.Ai().c(z3Var.d1(), null);
            if (r01.z.k(z3Var.d1())) {
                java.lang.String d18 = z3Var.d1();
                ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                if (r01.z.g(d18)) {
                    r01.q3.Ni().h(d18, this);
                    java.lang.String y07 = r01.z.b(d18).y0();
                    if (y07 != null) {
                        r01.q3.Ai().c(y07, null);
                    }
                } else {
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.j(d18)) {
                        r01.q3.bj().b1(d18, this);
                        java.lang.String d19 = r01.q3.cj().d1(d18);
                        if (d19 != null) {
                            r01.q3.Ai().c(d19, null);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        int i17;
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.ui.base.preference.Preference h17;
        qk.n D0;
        int P;
        int i18;
        int i19;
        if (str == null) {
            return false;
        }
        boolean equals = str.equals("contact_info_verifyuser_weibo");
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (equals) {
            jr3.c cVar = new jr3.c(mMActivity);
            com.tencent.mm.storage.z3 z3Var = this.f284004f;
            java.lang.String str3 = z3Var.f236585x0;
            java.lang.String d17 = z3Var.d1();
            if (str3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ViewTWeibo", "null weibo id");
            } else {
                c01.d9.e().a(205, cVar);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                cVar.f301396d = new er3.d(str3.replace("http://t.qq.com/", "").trim(), d17);
                c01.d9.e().g(cVar.f301396d);
                cVar.f301398f.c(3000L, 3000L);
            }
            return true;
        }
        if ("contact_info_biz_go_chatting".endsWith(str)) {
            if (this.F != null) {
                com.tencent.mm.autogen.events.ReportAdClickEvent reportAdClickEvent = new com.tencent.mm.autogen.events.ReportAdClickEvent();
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = this.F;
                snsAdClick.f71469g = 5;
                reportAdClickEvent.f54680g.f8210a = snsAdClick;
                reportAdClickEvent.e();
            }
            qk.o oVar = this.f284005g;
            if (oVar == null || !(oVar.I0() || this.f284005g.F0())) {
                android.content.Intent intent = new android.content.Intent();
                if (mMActivity.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
                    intent.setFlags(268435456);
                }
                if (this.f284010o) {
                    intent.putExtra("Chat_User", this.f284004f.d1());
                    intent.putExtra("Chat_Mode", 1);
                    mMActivity.setResult(-1, intent);
                } else {
                    intent.putExtra("Chat_User", this.f284004f.d1());
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, mMActivity);
                }
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                if (this.f284005g.F0()) {
                    java.lang.String y07 = this.f284005g.y0();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(y07)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
                        return false;
                    }
                    intent2.putExtra("enterprise_biz_name", y07);
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    intent2.putExtra("enterprise_biz_display_name", c01.a2.e(y07));
                } else {
                    intent2.putExtra("enterprise_biz_name", this.f284004f.d1());
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d18 = this.f284004f.d1();
                    ((sg3.a) v0Var).getClass();
                    intent2.putExtra("enterprise_biz_display_name", c01.a2.e(d18));
                }
                intent2.addFlags(67108864);
                j45.l.u(mMActivity, ".ui.conversation.EnterpriseConversationUI", intent2, null);
                mMActivity.finish();
            }
            p(5, null);
            return true;
        }
        if ("contact_info_biz_add".endsWith(str)) {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
                f();
            } else {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(mMActivity, new hr3.c6(this));
            }
            int i27 = this.f284019x;
            if (i27 != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i27), this.f284004f.d1());
            }
            return true;
        }
        if ("contact_info_biz_read_msg_online".endsWith(str)) {
            return true;
        }
        if ("contact_info_stick_biz".equals(str)) {
            if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_stick_biz")).N()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13307, this.f284004f.d1(), 1, 1, 0, "", java.lang.Integer.valueOf(this.f284009n));
                c01.i0.a(this.f284004f.d1(), true);
            } else {
                c01.e2.B0(this.f284004f.d1(), true, true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13307, this.f284004f.d1(), 1, 2, 0, "", java.lang.Integer.valueOf(this.f284009n));
            }
            return true;
        }
        if ("contact_info_guarantee_info".equals(str) && this.f284008m.f() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f284008m.f().f364197d)) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", this.f284008m.f().f364197d);
            intent3.putExtra("useJs", true);
            intent3.putExtra("vertical_scroll", true);
            intent3.putExtra("geta8key_scene", 3);
            j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        if (str.startsWith("contact_info_bizinfo_external#") && (P = com.tencent.mm.sdk.platformtools.t8.P(str.replace("contact_info_bizinfo_external#", ""), -1)) >= 0 && P < this.f284006h.size()) {
            qk.d dVar = (qk.d) this.f284006h.get(P);
            java.lang.String str4 = dVar.f364063c;
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("rawUrl", str4);
            intent4.putExtra("useJs", true);
            intent4.putExtra("vertical_scroll", true);
            intent4.putExtra("geta8key_scene", 3);
            intent4.putExtra("KPublisherId", "brand_profile");
            intent4.putExtra("prePublishId", "brand_profile");
            if ((this.E != null && ((i19 = this.f284009n) == 39 || i19 == 56 || i19 == 35)) || (i18 = this.f284009n) == 87 || i18 == 89 || i18 == 85 || i18 == 88) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("KFromBizSearch", true);
                bundle.putBundle("KBizSearchExtArgs", this.E);
                intent4.putExtra("jsapiargs", bundle);
                int i28 = this.f284004f.r2() ? 7 : 6;
                int identifier = mMActivity.getResources().getIdentifier(dVar.f364062b, "string", mMActivity.getPackageName());
                java.lang.String str5 = dVar.f364061a;
                if (identifier > 0) {
                    str5 = mMActivity.getString(identifier);
                }
                p(i28, str5);
            }
            j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent4, null);
            return true;
        }
        if ("contact_info_subscribe_bizinfo".endsWith(str) || "contact_info_show_brand".endsWith(str) || "contact_info_locate".endsWith(str)) {
            qk.o oVar2 = this.f284005g;
            if (oVar2 == null) {
                return true;
            }
            if ("contact_info_subscribe_bizinfo".endsWith(str)) {
                if (!oVar2.J0()) {
                    if (oVar2.W0()) {
                        oVar2.field_brandFlag |= 1;
                        if (this.f284008m == null) {
                            z17 = false;
                            this.f284008m = oVar2.D0(false);
                        } else {
                            z17 = false;
                        }
                        qk.n nVar = this.f284008m;
                        if (nVar == null || !nVar.q()) {
                            i17 = 1;
                            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_template_recv", true);
                        } else {
                            j45.l.g("brandservice");
                            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_template_recv", z17);
                            i17 = 1;
                        }
                    } else {
                        i17 = 1;
                        oVar2.field_brandFlag &= -2;
                        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_template_recv", true);
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[6];
                    objArr[0] = oVar2.field_username;
                    objArr[i17] = java.lang.Integer.valueOf(i17);
                    objArr[2] = java.lang.Integer.valueOf(oVar2.W0() ? 3 : 4);
                    objArr[3] = 0;
                    objArr[4] = "";
                    objArr[5] = java.lang.Integer.valueOf(this.f284009n);
                    g0Var.d(13307, objArr);
                } else if (oVar2.F0()) {
                    c01.d9.e().a(td1.t.CTRL_INDEX, this);
                    er3.e eVar = new er3.e(oVar2.field_username, ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_subscribe_bizinfo")).N() ? 0 : 4, 4);
                    c01.d9.e().g(eVar);
                    this.H = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.o6(this, eVar));
                } else if (oVar2.I0()) {
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_subscribe_bizinfo");
                    r01.q bj6 = r01.q3.bj();
                    java.lang.String str6 = oVar2.field_username;
                    boolean z19 = !checkBoxPreference.N();
                    bj6.getClass();
                    r45.hk hkVar = new r45.hk();
                    hkVar.f376221d = str6;
                    hkVar.f376224g = z19 ? 17 : 0;
                    hkVar.f376222e = 0;
                    r01.o3 o3Var = new r01.o3(hkVar, 17, 1, this);
                    this.H = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.p6(this, gm0.j1.n().f273288b.h(o3Var, 0) ? o3Var : null));
                }
            } else if ("contact_info_show_brand".endsWith(str)) {
                int i29 = oVar2.field_brandFlag;
                if ((i29 & 2) == 0) {
                    oVar2.field_brandFlag = i29 | 2;
                } else {
                    oVar2.field_brandFlag = i29 & (-3);
                }
            } else if ("contact_info_locate".endsWith(str)) {
                if (oVar2.u0()) {
                    oVar2.field_brandFlag &= -5;
                } else {
                    db5.e1.u(mMActivity, mMActivity.getString(com.tencent.mm.R.string.b18, this.f284004f.g2()), mMActivity.getString(com.tencent.mm.R.string.f490573yv), new hr3.j6(this, oVar2), new hr3.l6(this, oVar2));
                }
            }
            if (oVar2.F0() || oVar2.I0()) {
                return true;
            }
            d(oVar2, false);
            return true;
        }
        if ("contact_info_verifyuser".endsWith(str)) {
            if (com.tencent.mm.storage.z3.M4(this.f284004f.d1())) {
                com.tencent.mm.sdk.platformtools.x9.a();
            }
            if (c01.e2.a0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetBizInfo", "contact_info_verifyuser no click isWeChatUser.");
                return true;
            }
            qk.o oVar3 = this.f284005g;
            if (oVar3 == null || (D0 = oVar3.D0(false)) == null) {
                return true;
            }
            java.lang.String str7 = (D0.k() == null || com.tencent.mm.sdk.platformtools.t8.K0(D0.k().f364179d)) ? (D0.i() == null || com.tencent.mm.sdk.platformtools.t8.K0(D0.i().f364246b)) ? null : D0.i().f364246b : D0.k().f364179d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                return true;
            }
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("rawUrl", str7);
            intent5.putExtra("useJs", true);
            intent5.putExtra("vertical_scroll", true);
            intent5.putExtra("geta8key_scene", 3);
            j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent5, null);
            return true;
        }
        if ("contact_info_trademark".endsWith(str)) {
            qk.o oVar4 = this.f284005g;
            if (oVar4 != null && oVar4.D0(false) != null) {
                qk.n D02 = oVar4.D0(false);
                org.json.JSONObject jSONObject = D02.f364256a;
                if (jSONObject != null) {
                    D02.f364281z = jSONObject.optString("TrademarkUrl");
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(D02.f364281z)) {
                    android.content.Intent intent6 = new android.content.Intent();
                    qk.n D03 = oVar4.D0(false);
                    org.json.JSONObject jSONObject2 = D03.f364256a;
                    if (jSONObject2 != null) {
                        D03.f364281z = jSONObject2.optString("TrademarkUrl");
                    }
                    intent6.putExtra("rawUrl", D03.f364281z);
                    intent6.putExtra("useJs", true);
                    intent6.putExtra("vertical_scroll", true);
                    intent6.putExtra("geta8key_scene", 3);
                    j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent6, null);
                    return true;
                }
            }
            return true;
        }
        if ("contact_is_mute".endsWith(str)) {
            boolean z27 = !this.f284013r;
            this.f284013r = z27;
            if (z27) {
                c01.e2.p0(this.f284004f, true);
            } else {
                c01.e2.z0(this.f284004f, true);
            }
            r(this.f284013r);
        }
        if ("enterprise_contact_info_enter".equals(str)) {
            if (mMActivity == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
            } else if (this.f284005g == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
            } else {
                android.content.Intent intent7 = new android.content.Intent();
                intent7.putExtra("enterprise_biz_name", this.f284005g.field_username);
                intent7.addFlags(67108864);
                j45.l.j(mMActivity, "brandservice", ".ui.EnterpriseBizContactListUI", intent7, null);
            }
        }
        if ("contact_info_biz_disable".equals(str)) {
            str2 = "enterprise_biz_name";
            db5.e1.A(mMActivity, mMActivity.getString(com.tencent.mm.R.string.c17), "", mMActivity.getString(com.tencent.mm.R.string.f491127c16), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new hr3.m6(this), null);
        } else {
            str2 = "enterprise_biz_name";
        }
        if ("contact_info_biz_enable".equals(str)) {
            h(true);
        }
        if ("contact_info_template_recv".equals(str)) {
            android.content.Intent intent8 = new android.content.Intent();
            intent8.putExtra(str2, this.f284005g.field_username);
            j45.l.j(mMActivity, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", intent8, null);
        }
        if ("contact_info_service_phone".equals(str) && (h17 = ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_service_phone")) != null && h17.n() != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.n().toString())) {
            java.lang.String charSequence = h17.n().toString();
            db5.e1.K(mMActivity, true, charSequence, "", mMActivity.getString(com.tencent.mm.R.string.bd7), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new hr3.f6(this, charSequence), null);
        }
        if ("contact_info_expose_btn".equals(str)) {
            g();
        }
        if (str.equals("biz_placed_to_the_top")) {
            if (this.B == null) {
                this.B = mMActivity.getSharedPreferences(mMActivity.getPackageName() + "_preferences", 0);
            }
            com.tencent.mm.storage.z3 z3Var2 = this.f284004f;
            if (z3Var2 != null) {
                if (z3Var2.w2()) {
                    this.f284004f.getClass();
                    c01.e2.B0(this.f284004f.d1(), true, true);
                    this.B.edit().putBoolean("biz_placed_to_the_top", false).commit();
                    return true;
                }
                c01.i0.a(this.f284004f.d1(), true);
                this.f284004f.getClass();
                this.B.edit().putBoolean("biz_placed_to_the_top", true).commit();
                return true;
            }
        }
        return true;
    }

    @Override // r01.d0
    public void a(java.util.LinkedList linkedList) {
        r01.e0 fj6 = r01.q3.fj();
        synchronized (fj6.f368050d) {
            if (fj6.f368054h.contains(this)) {
                fj6.f368054h.remove(this);
            }
        }
        if (this.f284003e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
            return;
        }
        if (this.f284004f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
            return;
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f284020y)) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ob7 ob7Var = (r45.ob7) it.next();
                java.lang.String str = ob7Var.f382137d;
                if (str != null && str.equals(this.f284020y)) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_kf_worker", false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_kf_worker").H(ob7Var.f382139f);
                    return;
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_kf_worker", false);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_kf_worker");
        if (h17 == null || linkedList.get(0) == null) {
            return;
        }
        h17.H(((r45.ob7) linkedList.get(0)).f382139f);
    }

    @Override // r01.d0
    public java.lang.String b() {
        return "MicroMsg.ContactWidgetBizInfo";
    }

    public final void d(qk.o oVar, boolean z17) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_subscribe_bizinfo");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_locate");
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f379659d = oVar.field_brandFlag;
        ln4Var.f379660e = this.f284004f.d1();
        if (l(this.f284009n)) {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
        }
        r01.q3.cj().update(oVar, new java.lang.String[0]);
        checkBoxPreference.O(oVar.W0());
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.O(oVar.u0());
        }
        if (z17) {
            n();
        }
    }

    public boolean e() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (mMActivity.getIntent() == null) {
            return false;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID);
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("device_type");
        com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent();
        am.f5 f5Var = exDeviceCheckDeviceIsBoundEvent.f54119g;
        f5Var.f6638b = stringExtra;
        f5Var.f6637a = stringExtra2;
        exDeviceCheckDeviceIsBoundEvent.e();
        return exDeviceCheckDeviceIsBoundEvent.f54120h.f6739a;
    }

    public final void f() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (mMActivity.getIntent() != null && mMActivity.getIntent().getBooleanExtra("KIsHardDevice", false)) {
            java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("KHardDeviceBindTicket");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
            } else if (!e()) {
                c01.d9.e().a(536, this);
                com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent();
                am.y4 y4Var = exDeviceBindHardDeviceEvent.f54112g;
                y4Var.f8430a = stringExtra;
                y4Var.f8432c = 1;
                exDeviceBindHardDeviceEvent.e();
                com.tencent.mm.modelbase.m1 m1Var = exDeviceBindHardDeviceEvent.f54113h.f8514a;
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f284002d;
                this.H = db5.e1.Q(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.d6(this, m1Var));
                return;
            }
        }
        r35.a aVar = new r35.a(mMActivity, new hr3.e6(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(this.f284009n));
        java.lang.String str = this.f284014s;
        if (str != null) {
            aVar.f369015p = str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            aVar.f369016q = this.A;
        }
        aVar.f369025z = true;
        aVar.b(this.f284004f.d1(), linkedList, false, this.G);
    }

    public final void g() {
        java.lang.String str;
        com.tencent.mm.storage.z3 z3Var = this.f284004f;
        if (z3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        qk.o oVar = this.f284005g;
        intent.putExtra("rawUrl", (oVar == null || !oVar.I0() || (str = this.f284005g.field_appId) == null) ? java.lang.String.format(f284001J, this.f284004f.d1()) : java.lang.String.format("https://work.weixin.qq.com/wework_admin/wxPlugins/wwappComplaint?scene=2&ref=wxPluginsWwCorp&complaintsCorpid=%s", str));
        intent.putExtra("showShare", false);
        j45.l.j(this.f284002d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void h(boolean z17) {
        er3.f fVar = new er3.f(this.f284005g.field_username, !z17);
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, this);
        c01.d9.e().g(fVar);
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        this.H = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), this.f284002d.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.n6(this, fVar));
    }

    public final void i(r01.a0 a0Var) {
        java.lang.System.currentTimeMillis();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
        if (Ni.n0(a0Var.field_openId) == null) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = a0Var.field_openId;
            r0Var.f70532d = a0Var.field_headImgUrl;
            r0Var.f70534f = 0;
            r0Var.f70530b = 3;
            Ni.y0(r0Var);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().b(a0Var.field_openId);
        java.lang.System.currentTimeMillis();
    }

    public final java.lang.String j(int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (i17 == 0) {
            return mMActivity.getResources().getString(com.tencent.mm.R.string.bjb);
        }
        if (i17 == 1) {
            return mMActivity.getResources().getString(com.tencent.mm.R.string.apa);
        }
        if (i17 == 2) {
            return mMActivity.getResources().getString(com.tencent.mm.R.string.apb);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", java.lang.Integer.valueOf(i17));
        return mMActivity.getResources().getString(com.tencent.mm.R.string.be6);
    }

    public final void k(boolean z17) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (this.f284004f.k2()) {
            try {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.l2v);
                if (frameLayout != null) {
                    if (!z17) {
                        if (frameLayout.findViewById(com.tencent.mm.R.id.cax) == null) {
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.a0f, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.ccx);
                            textView.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.bdb));
                            textView.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f478734fp));
                            textView.setOnClickListener(new hr3.s6(this));
                            frameLayout.addView(linearLayout);
                        }
                        frameLayout.setVisibility(0);
                        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_expose_btn", true);
                        return;
                    }
                    android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.cax);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "isShowExposeBtn Exception: " + e17.getMessage());
            }
        }
    }

    public final boolean l(int i17) {
        return i17 == 81 || i17 == 92 || i17 == 93 || i17 == 94;
    }

    public final boolean m(java.lang.String str) {
        try {
            long V = com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
            if (V > 0) {
                return V - (java.lang.System.currentTimeMillis() / 1000) < 0;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 3503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.t6.n():void");
    }

    public final void o() {
        com.tencent.mm.storage.z3 z3Var = this.f284004f;
        if (z3Var == null || !z3Var.r2() || com.tencent.mm.storage.z3.z4(this.f284004f.d1()) || c01.e2.c0(this.f284004f.d1())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_is_mute", true);
            com.tencent.mm.storage.z3 z3Var2 = this.f284004f;
            if (z3Var2 == null || z3Var2.r2() || !l(this.f284009n)) {
                ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_expose_btn", true);
                k(true);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_expose_btn", false);
                k(false);
            }
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_is_mute", false);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_verifyuser_weibo", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_subscribe_bizinfo", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_template_recv", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_locate", true);
        if (this.f284015t) {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_biz_add", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_time_expired", true);
        }
        com.tencent.mm.storage.z3 z3Var3 = this.f284004f;
        if (z3Var3 == null || !((com.tencent.mm.storage.z3.l4(z3Var3.d1()) || c01.e2.c0(this.f284004f.d1())) && this.f284004f.r2())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_biz_go_chatting", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_biz_go_chatting", false);
        }
        if (c01.e2.c0(this.f284004f.d1())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f284003e).m("contact_info_user_desc", true);
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "null == context");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
            java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
            com.tencent.mm.ui.widget.snackbar.j.c(mMActivity.getString(com.tencent.mm.R.string.f_p), null, mMActivity, null, null);
        }
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference bizInfoHeaderPreference = (com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_info_header_bizinfo");
        if (bizInfoHeaderPreference == null) {
            return true;
        }
        bizInfoHeaderPreference.O();
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.protobuf.f fVar2;
        r45.gi5 gi5Var2;
        r45.gi5 gi5Var3;
        r45.xj xjVar;
        com.tencent.mm.protobuf.f fVar3;
        com.tencent.mm.protobuf.f fVar4;
        this.f284021z = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.H;
        if (u3Var != null && u3Var.isShowing()) {
            this.H.dismiss();
        }
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "scene == null");
            return;
        }
        c01.d9.e().q(m1Var.getType(), this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.getType()));
            return;
        }
        m1Var.getType();
        if (m1Var.getType() == 536) {
            c01.d9.e().q(536, this);
            n();
            return;
        }
        r45.mi6 mi6Var = null;
        r1 = null;
        r45.t16 t16Var = null;
        mi6Var = null;
        if (m1Var.getType() == 1363) {
            com.tencent.mm.modelbase.o oVar = ((er3.e) m1Var).f256029e;
            r45.u16 u16Var = (oVar == null || (fVar4 = oVar.f70711b.f70700a) == null) ? null : (r45.u16) fVar4;
            if (oVar != null && (fVar3 = oVar.f70710a.f70684a) != null) {
                t16Var = (r45.t16) fVar3;
            }
            if (u16Var == null || (gi5Var3 = u16Var.f386949d) == null || gi5Var3.f375288d != 0 || (xjVar = u16Var.f386950e) == null || com.tencent.mm.sdk.platformtools.t8.K0(xjVar.f390153d)) {
                if (u16Var == null || (gi5Var2 = u16Var.f386949d) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:resp == null");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:code:%s", java.lang.Integer.valueOf(gi5Var2.f375288d));
                    return;
                }
            }
            if (u16Var.f386950e == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd resp.user == null");
                return;
            }
            s01.a0 y07 = r01.q3.Vi().y0(u16Var.f386950e.f390153d);
            if (y07 == null) {
                y07 = new s01.a0();
                y07.field_userId = u16Var.f386950e.f390153d;
            }
            r45.xj xjVar2 = u16Var.f386950e;
            y07.field_userName = xjVar2.f390154e;
            y07.field_brandUserName = t16Var.f386067d;
            y07.field_UserVersion = xjVar2.f390155f;
            y07.field_headImageUrl = xjVar2.f390156g;
            y07.field_profileUrl = xjVar2.f390157h;
            y07.field_bitFlag = xjVar2.f390158i;
            y07.field_addMemberUrl = xjVar2.f390159m;
            y07.field_needToUpdate = false;
            if (r01.q3.Vi().J0(y07)) {
                return;
            }
            r01.q3.Vi().insert(y07);
            return;
        }
        if (m1Var.getType() != 1394) {
            if (m1Var.getType() == 1343) {
                n();
                return;
            } else {
                if (m1Var.getType() == 1228) {
                    n();
                    return;
                }
                return;
            }
        }
        com.tencent.mm.modelbase.o oVar2 = ((er3.f) m1Var).f256031e;
        r45.li6 li6Var = (oVar2 == null || (fVar2 = oVar2.f70710a.f70684a) == null) ? null : (r45.li6) fVar2;
        if (oVar2 != null && (fVar = oVar2.f70711b.f70700a) != null) {
            mi6Var = (r45.mi6) fVar;
        }
        if (mi6Var == null || (gi5Var = mi6Var.f380551d) == null || gi5Var.f375288d != 0) {
            if (mi6Var == null || mi6Var.f380551d == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.getType()));
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(mi6Var.f380551d.f375288d));
                return;
            }
        }
        if (!(!li6Var.f379506e)) {
            qk.o oVar3 = this.f284005g;
            oVar3.field_brandFlag |= 1;
            d(oVar3, true);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(oVar3.field_username);
            if (((com.tencent.mm.storage.m4) c01.d9.b().r()).u(oVar3.field_enterpriseFather) <= 0) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(oVar3.field_enterpriseFather);
                return;
            } else {
                c01.d9.b().k().b(oVar3.field_enterpriseFather);
                return;
            }
        }
        qk.o oVar4 = this.f284005g;
        oVar4.field_brandFlag &= -2;
        d(oVar4, true);
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).p(oVar4.field_username) == null) {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4(oVar4.field_username);
            java.lang.String y08 = this.f284005g.y0();
            if (y08 == null) {
                y08 = "";
            }
            l4Var.T1(y08);
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).q5(oVar4.field_username);
            if (q57 != null) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var);
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).a0(q57);
            } else {
                l4Var.f2();
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var);
            }
        }
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).p(oVar4.field_enterpriseFather) != null) {
            c01.d9.b().k().b(oVar4.field_enterpriseFather);
            return;
        }
        com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4(oVar4.field_enterpriseFather);
        l4Var2.f2();
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var2);
    }

    public final void p(int i17, java.lang.String str) {
        int i18;
        java.lang.String str2;
        android.os.Bundle bundle = this.E;
        if (bundle != null) {
            int i19 = this.f284009n;
            if (i19 == 39 || i19 == 56 || i19 == 35 || i19 == 87 || i19 == 88 || i19 == 89 || i19 == 85) {
                if (this.f284004f == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
                    return;
                }
                java.lang.String string = bundle.getString("Contact_Ext_Args_Search_Id");
                java.lang.String string2 = this.E.getString("Contact_Ext_Args_Query_String");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string2 == null) {
                    string2 = "";
                }
                int i27 = this.E.getInt("Contact_Ext_Args_Index");
                int i28 = this.f284009n;
                if (i28 == 35) {
                    i18 = 1;
                } else if (i28 != 85) {
                    switch (i28) {
                        case 87:
                            i18 = 2;
                            break;
                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                            i18 = 3;
                            break;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
                            i18 = 4;
                            break;
                        default:
                            i18 = 0;
                            break;
                    }
                } else {
                    i18 = 5;
                }
                java.lang.String string3 = this.E.getString("Contact_Ext_Extra_Params");
                if (string3 == null) {
                    string3 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string2);
                sb6.append(",");
                sb6.append(i17);
                sb6.append(",");
                java.lang.String d17 = this.f284004f.d1();
                sb6.append(d17 != null ? d17 : "");
                sb6.append(",");
                sb6.append(i27);
                sb6.append(",");
                sb6.append(java.lang.System.currentTimeMillis() / 1000);
                sb6.append(",");
                sb6.append(string);
                sb6.append(",");
                sb6.append(i18);
                java.lang.String sb7 = sb6.toString();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str2 = sb7 + ",," + string3;
                } else {
                    str2 = sb7 + "," + str + "," + string3;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10866, str2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r7.field_updateTime >= 86400000) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.t6.q(java.lang.String):void");
    }

    public final void r(boolean z17) {
        if (this.f284004f != null) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
            if (mMActivity != null) {
                if (z17) {
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String d17 = this.f284004f.d1();
                    ((qv.o) u2Var).getClass();
                    if (!r01.z.g(d17)) {
                        mMActivity.setTitleMuteIconVisibility(0);
                    }
                }
                mMActivity.setTitleMuteIconVisibility(8);
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284003e).h("contact_is_mute");
            if (checkBoxPreference != null) {
                checkBoxPreference.O(z17);
            }
        }
    }

    public final void s() {
        if (this.B == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.ui.MMActivity mMActivity = this.f284002d;
            sb6.append(mMActivity.getPackageName());
            sb6.append("_preferences");
            this.B = mMActivity.getSharedPreferences(sb6.toString(), 0);
        }
        if (this.C != null) {
            if (this.f284004f != null) {
                this.B.edit().putBoolean("biz_placed_to_the_top", this.f284004f.w2()).commit();
            } else {
                this.B.edit().putBoolean("biz_placed_to_the_top", false).commit();
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f284003e).notifyDataSetChanged();
    }
}
