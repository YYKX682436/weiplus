package os3;

/* loaded from: classes11.dex */
public class j1 implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f348112d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f348113e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f348114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348115g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348116h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f348117i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f348118m;

    /* renamed from: n, reason: collision with root package name */
    public long f348119n;

    /* renamed from: o, reason: collision with root package name */
    public ks3.c0 f348120o;

    public j1(android.content.Context context) {
        iz5.a.g(null, context != null);
        this.f348112d = context;
    }

    public static void a(os3.j1 j1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        j1Var.getClass();
        j1Var.f348120o = new ks3.c0(3, str, str2, str3, str4);
        gm0.j1.d().g(j1Var.f348120o);
        android.content.Context context = j1Var.f348112d;
        j1Var.f348118m = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.t4(z3Var.d1()));
        gm0.j1.n().f273288b.a(3848, this);
        gm0.j1.n().f273288b.a(3889, this);
        gm0.j1.d().a(586, this);
        gm0.j1.n().f273288b.a(129, this);
        this.f348114f = z17;
        this.f348113e = z3Var;
        this.f348117i = rVar;
        this.f348119n = c01.z1.i();
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494852x);
        f();
        if (((android.app.Activity) this.f348112d).getIntent().getBooleanExtra("key_need_rebind_xmail", false)) {
            c();
        }
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        int i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_qqmailhelper_view");
        android.content.Context context = this.f348112d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f348114f) {
                intent.putExtra("Chat_User", this.f348113e.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((android.app.Activity) context).setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", this.f348113e.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 7, 4);
            }
            ((android.app.Activity) context).finish();
            return true;
        }
        if (str.equals("contact_info_qqmailhelper_compose")) {
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.ComposeUI.class);
            if (this.f348114f) {
                intent2.putExtra("Chat_User", this.f348113e.d1());
                intent2.addFlags(67108864);
                ((android.app.Activity) context).setResult(-1, intent2);
            } else {
                intent2.putExtra("Chat_User", this.f348113e.d1());
                intent2.addFlags(67108864);
                android.content.Context context2 = this.f348112d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "composeMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "composeMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ((android.app.Activity) context).finish();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 25);
            return true;
        }
        if (str.equals("contact_info_qqmailhelper_top")) {
            boolean N = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h(str)).N();
            if (N) {
                c01.e2.t0("qqmail", true, true);
            } else {
                c01.e2.B0("qqmail", true, true);
            }
            if (N) {
                this.f348119n |= 262144;
            } else {
                this.f348119n &= -262145;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f348119n));
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f348119n);
            i17 = N ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 84;
            p53Var.f382762e = i17;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "switch ext change : isTop open = " + N + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
            return true;
        }
        if (!str.equals("contact_info_qqmailhelper_mute")) {
            if (str.equals("contact_info_qqmailhelper_recv_remind")) {
                gm0.j1.n().f273288b.g(new ks3.f0(((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h(str)).N(), ""));
                return true;
            }
            if (str.equals("contact_info_qqmailhelper_clear_data")) {
                db5.e1.u(context, context.getString(com.tencent.mm.R.string.bcw), "", new os3.d1(this), null);
                return true;
            }
            if (str.equals("contact_info_qqmailhelper_install")) {
                c();
                return true;
            }
            if (str.equals("contact_info_qqmailhelper_uninstall")) {
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new os3.e1(this), null);
                return true;
            }
            if (str.equals("contact_info_qqmailhelper_account")) {
                c();
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetQQMail", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        boolean N2 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h(str)).N();
        if (N2) {
            c01.e2.p0(this.f348113e, true);
        } else {
            c01.e2.z0(this.f348113e, true);
        }
        if (N2) {
            this.f348119n |= 131072;
        } else {
            this.f348119n &= -131073;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f348119n));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f348119n);
        i17 = N2 ? 1 : 2;
        r45.p53 p53Var2 = new r45.p53();
        p53Var2.f382761d = 83;
        p53Var2.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "switch ext change : isMute open = " + N2 + " item value = " + p53Var2.f382762e + " functionId = " + p53Var2.f382761d);
        return true;
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Context context = this.f348112d;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489439cj3, null);
        db5.e1.q(context, context.getString(com.tencent.mm.R.string.f490978bg0), inflate, new os3.h1(this, (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.mgd), str, str2, str3));
    }

    public final void c() {
        android.content.Context context = this.f348112d;
        this.f348118m = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
        gm0.j1.d().g(new ks3.e0(d()));
    }

    public final java.lang.String d() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "last bind xmail %s", str);
        return str;
    }

    public final void e(boolean z17, java.lang.String str) {
        int i17;
        int n17 = c01.z1.n();
        if (z17) {
            i17 = n17 & (-2);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, str);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) | 2));
            gm0.j1.n().f273288b.g(new ks3.f0(true, ""));
        } else {
            i17 = n17 | 1;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, "");
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC;
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(c18.r(u3Var2, 0) & (-3)));
            ls3.e.b();
        }
        int i18 = i17;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(i18));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i18, "", 0, "", 0));
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
    }

    public final void f() {
        this.f348115g = (c01.z1.n() & 1) == 0;
        this.f348116h = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(17, null)) == 1;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h("contact_info_header_helper");
        java.lang.String d17 = this.f348113e.d1();
        java.lang.String g27 = this.f348113e.g2();
        android.content.Context context = this.f348112d;
        helperHeaderPreference.M(d17, g27, context.getString(com.tencent.mm.R.string.f490980bg2));
        helperHeaderPreference.N(this.f348115g ? 1 : 0);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_install", this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_view", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_compose", !this.f348115g);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h("contact_info_qqmailhelper_recv_remind");
        if (checkBoxPreference != null) {
            checkBoxPreference.O(this.f348116h);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_recv_remind", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_download_mgr_view", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_clear_data", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_uninstall", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_account", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_top", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_mute", !this.f348115g);
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).m("contact_info_qqmailhelper_remind_footer", !this.f348115g);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h("contact_info_qqmailhelper_account");
        if (this.f348115g) {
            h17.E(8);
            h17.w(false);
            java.lang.String d18 = d();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(9, 0)).intValue();
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "bindXMail %s, bindQQ %d, extUserStatus %d", d18, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(r17));
            if (com.tencent.mm.sdk.platformtools.t8.K0(d18)) {
                if (intValue != 0) {
                    h17.H(kk.v.a(intValue) + "@qq.com");
                } else {
                    h17.H(context.getString(com.tencent.mm.R.string.bfw));
                    h17.E(0);
                    h17.w(true);
                }
            } else if ((r17 & 2) != 0) {
                h17.H(d18);
            } else {
                h17.H(context.getString(com.tencent.mm.R.string.bfw));
                h17.E(0);
                h17.w(true);
            }
        }
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h("contact_info_qqmailhelper_top")).O(this.f348113e.w2());
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f348117i).h("contact_info_qqmailhelper_mute")).O(c01.e2.P(this.f348113e));
        ((com.tencent.mm.ui.base.preference.h0) this.f348117i).notifyDataSetChanged();
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 291) {
            if (i18 != -1 || intent == null) {
                return;
            }
            e(true, intent.getStringExtra("Key_Bind_XMail"));
            f();
            return;
        }
        if (i17 == 292) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("key_qq_mail");
                java.lang.String string2 = bundleExtra.getString("key_bind_ticket");
                boolean z17 = bundleExtra.getBoolean("key_need_second_pwd", false);
                java.lang.String string3 = bundleExtra.getString("key_second_pwd_key");
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "mail %s, ticket %s, needSecondPwd %s, secPwdKey %s", string, string2, java.lang.Boolean.valueOf(z17), string3);
                if (com.tencent.mm.sdk.platformtools.t8.N0(string, string2)) {
                    return;
                }
                android.content.Context context = this.f348112d;
                if (!z17) {
                    db5.e1.t(context, context.getString(com.tencent.mm.R.string.bfx), "", new os3.g1(this, string, string2));
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.is6), 1).show();
                } else {
                    db5.e1.t(context, context.getString(com.tencent.mm.R.string.bfx), "", new os3.f1(this, string, string2, string3));
                }
            }
        }
    }

    @Override // t25.a
    public boolean onDetach() {
        gm0.j1.n().f273288b.q(3848, this);
        gm0.j1.n().f273288b.q(3889, this);
        gm0.j1.d().q(586, this);
        gm0.j1.n().f273288b.q(129, this);
        android.app.ProgressDialog progressDialog = this.f348118m;
        if (progressDialog == null) {
            return true;
        }
        progressDialog.dismiss();
        this.f348118m = null;
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f348118m;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f348118m = null;
        }
        int type = m1Var.getType();
        android.content.Context context = this.f348112d;
        if (type == 3848) {
            if (i17 != 0 || i18 != 0) {
                dp.a.makeText(context, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.is6) : str, 0).show();
                return;
            }
            ks3.m0 m0Var = (ks3.m0) ((ks3.e0) m1Var).f311661d.f70711b.f70700a;
            java.lang.String str2 = m0Var.f311717e;
            java.lang.String str3 = m0Var.f311718f;
            java.lang.String str4 = m0Var.f311716d;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "wxMail %s, wxLoginUrl %s, qqLoginUrl %s", str2, str3, str4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str3);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, 292);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(context, com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI.class);
            intent2.putExtra("Key_WeXin_Mail", str2);
            intent2.putExtra("Key_QQMail_Login_Url", str4);
            intent2.putExtra("Key_Last_Bind_Mail", d());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(291);
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        if (m1Var.getType() == 3889) {
            if (i17 != 0 || i18 != 0) {
                dp.a.makeText(context, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.is8) : str, 0).show();
                return;
            } else {
                e(false, null);
                f();
                return;
            }
        }
        if (m1Var.getType() != 586) {
            if (m1Var.getType() == 129) {
                if (i17 != 0 || i18 != 0) {
                    if (i18 == -31) {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
                        u1Var.u(context.getString(com.tencent.mm.R.string.f490978bg0));
                        u1Var.f(java.lang.Boolean.TRUE);
                        u1Var.b(new os3.i1(this));
                        u1Var.q(false);
                    } else {
                        dp.a.makeText(context, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.f490479w8) : str, 0).show();
                    }
                }
                f();
                return;
            }
            return;
        }
        if (m1Var != this.f348120o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQMail", "not my scene, ignore");
            return;
        }
        ks3.c0 c0Var = (ks3.c0) m1Var;
        int i19 = ((ks3.f) c0Var.f311644d.f70711b.f70700a).f311664e;
        java.lang.String str5 = c0Var.f311646f;
        if (i17 == 0 && i18 == 0 && i19 == 0) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.is7), 0).show();
            e(true, str5);
            f();
            ((hs3.s) i95.n0.c(hs3.s.class)).wi().f();
            return;
        }
        if (i19 != -39006) {
            dp.a.makeText(context, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.is6) : str, 1).show();
        } else {
            dp.a.makeText(context, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.hou) : str, 0).show();
            b(str5, c0Var.f311647g, c0Var.f311648h);
        }
    }
}
