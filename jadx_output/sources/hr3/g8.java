package hr3;

/* loaded from: classes9.dex */
public final class g8 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f283578d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283579e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283580f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f283581g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f283582h;

    public g8(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f283578d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        er3.c.f256022f.c();
        this.f283579e = z3Var;
        this.f283580f = rVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach: contact=");
        java.lang.Object obj = z3Var;
        if (z3Var == null) {
            obj = "?";
        }
        sb6.append(obj);
        sb6.append(", readonly=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", sb6.toString());
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494851df);
        }
        this.f283581g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) (rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_qqassistant_top") : null);
        this.f283582h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) (rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_qqassistant_not_disturb") : null);
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "handleEvent " + str);
        boolean equals = "contact_info_qqassistant_view_msg".equals(str);
        android.app.Activity activity = this.f283578d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.storage.z3 z3Var = this.f283579e;
            intent.putExtra("Chat_User", z3Var != null ? z3Var.d1() : null);
            j45.l.u(activity, ".ui.chatting.ChattingUI", intent, null);
        } else if ("contact_info_qqassistant_top".equals(str)) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f283581g;
            if (checkBoxPreference != null && checkBoxPreference.N()) {
                com.tencent.mm.storage.z3 z3Var2 = this.f283579e;
                c01.e2.t0(z3Var2 != null ? z3Var2.d1() : null, true, true);
            } else {
                com.tencent.mm.storage.z3 z3Var3 = this.f283579e;
                c01.e2.B0(z3Var3 != null ? z3Var3.d1() : null, true, true);
            }
        } else if ("contact_info_qqassistant_not_disturb".equals(str)) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f283582h;
            if (checkBoxPreference2 != null && checkBoxPreference2.N()) {
                c01.e2.p0(this.f283579e, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "Set Mute");
            } else {
                c01.e2.z0(this.f283579e, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "Set to UnMute");
            }
        } else if ("contact_info_qqassistant_uninstall".equals(str)) {
            db5.e1.A(activity, activity.getString(com.tencent.mm.R.string.iws), "", activity.getString(com.tencent.mm.R.string.f490353sl), activity.getString(com.tencent.mm.R.string.f490347sg), new hr3.f8(this), null);
        } else if ("contact_info_qqassistant_install".equals(str)) {
            r45.zl3 a17 = er3.c.f256022f.a();
            java.lang.String str2 = a17 != null ? a17.f392193d : null;
            java.lang.String str3 = a17 != null ? a17.f392196g : null;
            java.lang.String str4 = a17 != null ? a17.f392194e : null;
            if (!(str2 == null)) {
                if (!(str3 == null)) {
                    if (!(str4 == null)) {
                        java.lang.String v17 = r26.i0.v(str3, "{weapp_param}", str4, false, 4, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "jump to:" + str2 + " pathWithParam: " + v17);
                        try {
                            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                            appBrandStatObject.f87790f = 1035;
                            appBrandStatObject.f87791g = "gh_051d9102de63";
                            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(this.f283578d, "", str2.toString(), j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigQQAssistantJumpDevMiniApp()) == 1 ? 2 : 0, 0, v17, appBrandStatObject, "");
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetQQAssistant", "Error when jumpToBind: " + th6);
                        }
                        a();
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetQQAssistant", "need path or appID.");
            a();
        } else if ("contact_info_clear_data".equals(str)) {
            android.app.Activity activity2 = this.f283578d;
            db5.e1.A(activity2, activity2.getString(com.tencent.mm.R.string.bcu), "", activity.getString(com.tencent.mm.R.string.f490353sl), activity.getString(com.tencent.mm.R.string.f490347sg), hr3.e8.f283517d, null);
        }
        return false;
    }

    public final void a() {
        com.tencent.mm.ui.base.preference.r rVar = this.f283580f;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) (rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_header_helper") : null);
        if (helperHeaderPreference != null) {
            com.tencent.mm.storage.z3 z3Var = this.f283579e;
            java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
            if (d17 == null) {
                d17 = "?";
            }
            com.tencent.mm.storage.z3 z3Var2 = this.f283579e;
            java.lang.String g27 = z3Var2 != null ? z3Var2.g2() : null;
            if (g27 == null) {
                g27 = "?";
            }
            helperHeaderPreference.M(d17, g27, this.f283578d.getString(com.tencent.mm.R.string.nbe));
        }
        com.tencent.mm.storage.z3 z3Var3 = this.f283579e;
        boolean z17 = z3Var3 != null && z3Var3.r2();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateProfile: username=");
        com.tencent.mm.storage.z3 z3Var4 = this.f283579e;
        java.lang.String d18 = z3Var4 != null ? z3Var4.d1() : null;
        if (d18 == null) {
            d18 = "?";
        }
        sb6.append(d18);
        sb6.append(" Display=");
        com.tencent.mm.storage.z3 z3Var5 = this.f283579e;
        java.lang.String g28 = z3Var5 != null ? z3Var5.g2() : null;
        sb6.append(g28 != null ? g28 : "?");
        sb6.append(" enable=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", sb6.toString());
        if (!z17) {
            if (helperHeaderPreference != null) {
                helperHeaderPreference.N(0);
            }
            com.tencent.mm.ui.base.preference.r rVar2 = this.f283580f;
            if (rVar2 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar2).m("contact_info_qqassistant_view_msg", true);
            }
            com.tencent.mm.ui.base.preference.r rVar3 = this.f283580f;
            if (rVar3 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar3).m("contact_info_qqassistant_top", true);
            }
            com.tencent.mm.ui.base.preference.r rVar4 = this.f283580f;
            if (rVar4 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar4).m("contact_info_qqassistant_not_disturb", true);
            }
            com.tencent.mm.ui.base.preference.r rVar5 = this.f283580f;
            if (rVar5 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar5).m("contact_info_clear_data", true);
            }
            com.tencent.mm.ui.base.preference.r rVar6 = this.f283580f;
            if (rVar6 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar6).m("contact_info_qqassistant_install", false);
            }
            com.tencent.mm.ui.base.preference.r rVar7 = this.f283580f;
            if (rVar7 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar7).m("contact_info_qqassistant_uninstall", true);
                return;
            }
            return;
        }
        if (helperHeaderPreference != null) {
            helperHeaderPreference.N(1);
        }
        com.tencent.mm.ui.base.preference.r rVar8 = this.f283580f;
        if (rVar8 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar8).m("contact_info_qqassistant_view_msg", false);
        }
        com.tencent.mm.ui.base.preference.r rVar9 = this.f283580f;
        if (rVar9 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar9).m("contact_info_qqassistant_top", false);
        }
        com.tencent.mm.ui.base.preference.r rVar10 = this.f283580f;
        if (rVar10 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar10).m("contact_info_qqassistant_not_disturb", false);
        }
        com.tencent.mm.ui.base.preference.r rVar11 = this.f283580f;
        if (rVar11 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar11).m("contact_info_clear_data", false);
        }
        com.tencent.mm.ui.base.preference.r rVar12 = this.f283580f;
        if (rVar12 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar12).m("contact_info_qqassistant_install", true);
        }
        com.tencent.mm.ui.base.preference.r rVar13 = this.f283580f;
        if (rVar13 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar13).m("contact_info_qqassistant_uninstall", false);
        }
        com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
        com.tencent.mm.storage.z3 z3Var6 = this.f283579e;
        java.lang.String d19 = z3Var6 != null ? z3Var6.d1() : null;
        if (d19 == null) {
            d19 = "";
        }
        if (((com.tencent.mm.storage.m4) r17).K(d19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is placed top");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f283581g;
            if (checkBoxPreference != null) {
                checkBoxPreference.O(true);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is not placed top");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f283581g;
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.O(false);
            }
        }
        if (c01.e2.P(this.f283579e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is muted");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = this.f283582h;
            if (checkBoxPreference3 == null) {
                return;
            }
            checkBoxPreference3.O(true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is not muted");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = this.f283582h;
        if (checkBoxPreference4 == null) {
            return;
        }
        checkBoxPreference4.O(false);
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    public boolean onBackPress() {
        android.app.Activity activity = this.f283578d;
        if (activity.getIntent().getBooleanExtra("Contact_NeedBackToLauncherUI", false)) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            j45.l.u(activity, ".ui.transmit.TaskRedirectUI", intent, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetQQAssistant", "back to LauncherUI");
        }
        return false;
    }

    @Override // t25.b
    public boolean onCreate() {
        return false;
    }

    @Override // t25.b
    public boolean onDestroy() {
        return false;
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }

    @Override // t25.b
    public void onPause() {
    }

    @Override // t25.b
    public void onResume() {
    }
}
