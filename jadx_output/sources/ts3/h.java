package ts3;

/* loaded from: classes9.dex */
public class h implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f421669d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f421670e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f421671f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421672g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f421673h;

    /* renamed from: i, reason: collision with root package name */
    public long f421674i;

    public h(android.content.Context context) {
        this.f421670e = context;
    }

    public static void a(boolean z17) {
        int o17 = c01.z1.o();
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? o17 & (-1025) : o17 | 1024));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.o(26, z17 ? 2 : 1));
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.w4(z3Var.d1()));
        gm0.j1.u().c().a(this);
        this.f421671f = z3Var;
        this.f421669d = rVar;
        this.f421674i = c01.z1.i();
        android.content.Context context = this.f421670e;
        if (context instanceof android.app.Activity) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 16, "", "", "", "", "", 0, 0, ((android.app.Activity) context).getIntent().getStringExtra("reportSessionId"));
        }
        c();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_readerappnews_view");
        android.content.Context context = this.f421670e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.class);
            intent.putExtra("type", 20);
            intent.setFlags(67108864);
            android.content.Context context2 = this.f421670e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
            }
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            return true;
        }
        if (str.equals("contact_info_readerappnews_subscribe")) {
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI.class);
            android.content.Context context3 = this.f421670e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("contact_info_readerappnews_help")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", "https://ifeedback.qq.com/platform/feedback?app_id=1078&uin=test");
            intent3.putExtra("geta8key_scene", 79);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        if (str.equals("contact_info_readerappnews_clear_data")) {
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.bcv), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new ts3.c(this), null);
            return true;
        }
        if (str.equals("contact_info_readerappnews_recv_remind")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h(str);
            boolean z18 = (c01.z1.o() & 1024) == 0;
            if (z18) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 6, "", "");
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 7, "", "");
            }
            if (checkBoxPreference != null) {
                checkBoxPreference.O(!z18);
            }
            a(!z18);
            return true;
        }
        if (str.equals("contact_info_readerappnews_top")) {
            if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h(str)).N()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 13);
                c01.e2.t0("newsapp", true, true);
                this.f421673h = true;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 14);
                c01.e2.B0("newsapp", true, true);
                this.f421673h = false;
            }
            if (this.f421673h) {
                this.f421674i |= 8192;
            } else {
                this.f421674i &= -8193;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f421674i));
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f421674i);
            int i17 = this.f421673h ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 82;
            p53Var.f382762e = i17;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isTop open = " + this.f421673h + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
            return true;
        }
        if (!str.equals("contact_info_readerappnews_mute")) {
            if (str.equals("contact_info_readerappnews_install")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 5, "", "");
                b(context, true, null);
                return true;
            }
            if (str.equals("contact_info_readerappnews_uninstall")) {
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new ts3.d(this), null);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        if (c01.e2.P(this.f421671f)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 11);
            c01.e2.z0(this.f421671f, true);
            this.f421672g = false;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 12);
            c01.e2.p0(this.f421671f, true);
            this.f421672g = true;
        }
        if (this.f421672g) {
            this.f421674i |= 4096;
        } else {
            this.f421674i &= -4097;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f421674i));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f421674i);
        int i18 = this.f421672g ? 1 : 2;
        r45.p53 p53Var2 = new r45.p53();
        p53Var2.f382761d = 81;
        p53Var2.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isMute open = " + this.f421672g + " item value = " + p53Var2.f382762e + " functionId = " + p53Var2.f382761d);
        return true;
    }

    public void b(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new ts3.g(this, db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new ts3.f(this, z17, context, z9Var)), 5000L);
    }

    public final void c() {
        int i17 = (c01.z1.n() & 524288) == 0 ? 1 : 0;
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).g(com.tencent.mm.R.xml.f494854z);
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f421671f.d1(), this.f421671f.g2(), this.f421670e.getString(com.tencent.mm.R.string.bgc));
        helperHeaderPreference.N(i17);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h("contact_info_readerappnews_recv_remind");
        boolean z17 = (c01.z1.o() & 1024) == 0;
        if (checkBoxPreference != null) {
            checkBoxPreference.O(z17);
        }
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h("contact_info_readerappnews_mute")).O(c01.e2.P(this.f421671f));
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f421669d).h("contact_info_readerappnews_top")).O(this.f421671f.w2());
        if (i17 != 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_install");
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_subscribe");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_view");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_help");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_clear_data");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_uninstall");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_recv_remind");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_mute");
        ((com.tencent.mm.ui.base.preference.h0) this.f421669d).w("contact_info_readerappnews_top");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            c();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        gm0.j1.u().c().e(this);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
