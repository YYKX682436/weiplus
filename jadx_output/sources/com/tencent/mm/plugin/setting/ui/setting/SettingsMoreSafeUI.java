package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsMoreSafeUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference implements l75.z0, com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160564h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160565i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseIntArray f160566m;

    public SettingsMoreSafeUI() {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        this.f160566m = sparseIntArray;
        sparseIntArray.put(0, com.tencent.mm.R.string.iqc);
        sparseIntArray.put(-82, com.tencent.mm.R.string.inx);
        sparseIntArray.put(-83, com.tencent.mm.R.string.inu);
        sparseIntArray.put(-84, com.tencent.mm.R.string.inv);
        sparseIntArray.put(-85, com.tencent.mm.R.string.inq);
        sparseIntArray.put(-86, com.tencent.mm.R.string.iny);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    public final void X6() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_facebook");
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsMoreSafeUI", "updateFacebook Preference null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityFacebook.h() || !c01.z1.C()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).v(h17);
        } else if (c01.z1.u()) {
            h17.H((java.lang.String) gm0.j1.u().c().l(65826, null));
        } else {
            h17.H(getString(com.tencent.mm.R.string.ipy));
        }
    }

    public final void Y6() {
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_email_addr");
        iz5.a.d(null, normalIconNewTipPreference);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        normalIconNewTipPreference.b0(0);
        normalIconNewTipPreference.f197752p1 = com.tencent.mm.R.dimen.f479575r;
        android.widget.TextView textView = normalIconNewTipPreference.J1;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(r6, com.tencent.mm.R.dimen.f479575r) * i65.a.m(normalIconNewTipPreference.Q1));
        }
        if (num != null && (num.intValue() & 2) != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            normalIconNewTipPreference.d0(w14.a.f442225a.a(str), -1, getColor(com.tencent.mm.R.color.FG_1));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            normalIconNewTipPreference.d0(getString(com.tencent.mm.R.string.inp), -1, getColor(com.tencent.mm.R.color.FG_1));
        } else {
            normalIconNewTipPreference.d0(getString(com.tencent.mm.R.string.iqj), -1, getColor(com.tencent.mm.R.color.FG_1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r1.k(r2.f21272d) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            r6 = this;
            com.tencent.mm.ui.base.preference.r r0 = r6.f160563g
            com.tencent.mm.ui.base.preference.h0 r0 = (com.tencent.mm.ui.base.preference.h0) r0
            java.lang.String r1 = "settings_phone_security"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.h(r1)
            com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference r0 = (com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference) r0
            if (r0 != 0) goto L16
            java.lang.String r0 = "MicroMsg.SettingsMoreSafeUI"
            java.lang.String r1 = "phone_security preference is null"
            com.tencent.mars.xlog.Log.e(r0, r1)
            return
        L16:
            boolean r2 = com.tencent.mm.sdk.platformtools.a0.c()
            r3 = 1
            if (r2 != 0) goto L63
            boolean r2 = c01.e2.a0()
            if (r2 == 0) goto L24
            goto L63
        L24:
            java.lang.Class<d70.i> r1 = d70.i.class
            i95.m r1 = i95.n0.c(r1)
            d70.i r1 = (d70.i) r1
            c70.e r1 = (c70.e) r1
            r1.getClass()
            bk0.a r1 = bk0.a.g()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC
            boolean r4 = r1.f21262c
            r5 = 0
            if (r4 != 0) goto L45
            java.lang.String r1 = "MicroMsg.NewBadge"
            java.lang.String r2 = "queryHasDotSourceValue NewBadge has not initialized"
            com.tencent.mars.xlog.Log.w(r1, r2)
        L43:
            r3 = r5
            goto L57
        L45:
            bk0.g r4 = r1.f21260a
            bk0.e r2 = r4.b(r2)
            if (r2 != 0) goto L4e
        L4d:
            goto L43
        L4e:
            java.lang.String r2 = r2.f21272d
            int r1 = r1.k(r2)
            if (r1 != 0) goto L57
            goto L4d
        L57:
            if (r3 == 0) goto L5d
            r0.c0(r5)
            goto L62
        L5d:
            r1 = 8
            r0.c0(r1)
        L62:
            return
        L63:
            com.tencent.mm.ui.base.preference.r r0 = r6.f160563g
            com.tencent.mm.ui.base.preference.h0 r0 = (com.tencent.mm.ui.base.preference.h0) r0
            r0.m(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI.Z6():void");
    }

    public final void a7() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_bind_qq");
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsMoreSafeUI", "updateUin Preference null");
            return;
        }
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(9, 0)).intValue();
        if (intValue == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMoreSafeUI", "updateUin 0 Preference");
            if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) != 1) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160563g).m("settings_uin", true);
            } else {
                h17.G(com.tencent.mm.R.string.ipy);
            }
        } else {
            h17.H("" + new kk.v(intValue));
        }
        if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityQQ.h()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).v(h17);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        a7();
        Y6();
        X6();
        Z6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494942ca;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iti);
        this.f160563g = getPreferenceScreen();
        if (((java.lang.Integer) gm0.j1.u().c().l(9, 0)).intValue() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch bindqq");
        } else if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).m("settings_uin", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch off");
        }
        this.f160564h = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CloseAcctUrl");
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ui(this));
        ((com.tencent.mm.ui.base.preference.h0) this.f160563g).m("settings_email_bind_tip_wechat", true);
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_email_addr");
        if (((com.tencent.mm.plugin.newtips.model.r) rn3.i.Di().c(new vn3.c(53)).first) == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).m("settings_email_bind_tip_wechat", false);
            normalIconNewTipPreference.e0(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2 && i18 == -1) {
            if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
                gm0.j1.d().f70764d.C(false);
            }
            new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
            ((com.tencent.mm.app.o7) f14.g.a()).getClass();
            com.tencent.mm.booter.q2.c();
            gm0.j1.u().c().e(this);
            com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
            am.hj hjVar = logoutEvent.f54484g;
            hjVar.getClass();
            hjVar.f6836a = 3;
            logoutEvent.e();
            com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f53993g.f6990a = true;
            backupProcessMgrExitEvent.e();
            com.tencent.mm.sdk.platformtools.c3.b("show_whatsnew");
            gm0.k2.a(this, true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("Intro_Switch", true);
            ((com.tencent.mm.app.y7) f14.g.b()).u(intent2, getContext());
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(256, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMoreSafeUI", str + " item has been clicked!");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (str.equals("settings_facebook")) {
            if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityFacebook.k(this, null)) {
                startActivity(com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
            }
            return true;
        }
        if (str.equals("settings_email_addr")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).w("settings_email_bind_tip_wechat");
            ((com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_email_addr")).e0(false);
            gm0.j1.d().q(256, this);
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).cj(getContext());
            rn3.i.Di().a(53);
            return true;
        }
        if (str.equals("settings_bind_qq")) {
            if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityQQ.k(this, null)) {
                ((com.tencent.mm.app.y7) f14.g.b()).i(new android.content.Intent(), this);
            }
            return true;
        }
        if (str.equals("settings_phone_security")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().q(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, false);
            ((com.tencent.mm.ui.base.preference.IconPreference) preference).c0(8);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10939, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DEVICE_PROTECT_SECURITY_STATUS_INT_SYNC, 0)).intValue()));
            gw4.f fVar = new gw4.f(this);
            fVar.f276157b = "mmdownloadapp_HMNgrd6q8lVpXoJy7Y";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        } else if (str.equals("settings_delete_account")) {
            android.content.Intent intent = new android.content.Intent();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f160564h)) {
                intent.putExtra("rawUrl", this.f160564h + "&lang=" + com.tencent.mm.sdk.platformtools.m2.f(getContext()));
                intent.putExtra("showShare", true);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                j45.l.n(getContext(), "webview", ".ui.tools.WebViewUI", intent, 2);
            }
        } else if (str.equals("settings_dump_personal_data")) {
            android.content.Intent intent2 = new android.content.Intent();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f160565i)) {
                intent2.putExtra("rawUrl", this.f160565i);
                intent2.putExtra("showShare", false);
                intent2.putExtra("needRedirect", false);
                intent2.putExtra("neverGetA8Key", false);
                intent2.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        a7();
        Y6();
        X6();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowExportUserDataEntry");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            this.f160565i = "";
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).m("settings_dump_personal_data", true);
        } else {
            this.f160565i = d17;
        }
        Z6();
        ((com.tencent.mm.ui.base.preference.h0) this.f160563g).v(((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_about_domainmail"));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160564h)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160563g).v(((com.tencent.mm.ui.base.preference.h0) this.f160563g).h("settings_delete_account"));
        }
        gm0.j1.d().a(256, this);
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        if (m1Var.getType() == 256) {
            if (i17 != 0 || i18 != 0) {
                ((com.tencent.mm.app.o7) f14.g.a()).getClass();
                if (com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
                    return;
                }
            }
            int i19 = this.f160566m.get(i18);
            java.lang.String string = getString(com.tencent.mm.R.string.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i19 != 0) {
                try {
                    string = getString(i19);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsMoreSafeUI", "try get string by id %d, fail:%s", java.lang.Integer.valueOf(i19), e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsMoreSafeUI", e17, "", new java.lang.Object[0]);
                }
            }
            db5.e1.T(getContext(), string);
        }
    }
}
