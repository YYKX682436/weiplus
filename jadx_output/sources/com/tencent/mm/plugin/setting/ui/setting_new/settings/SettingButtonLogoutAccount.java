package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount;", "Ls24/d;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingButtonLogoutAccount extends s24.d {
    public com.tencent.mm.modelbase.u0 A;
    public android.app.ProgressDialog B;
    public com.tencent.mm.modelbase.u0 C;
    public com.tencent.mm.sdk.platformtools.b4 D;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f161851g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f161852h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f161853i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f161854m;

    /* renamed from: n, reason: collision with root package name */
    public final int f161855n;

    /* renamed from: o, reason: collision with root package name */
    public final int f161856o;

    /* renamed from: p, reason: collision with root package name */
    public final int f161857p;

    /* renamed from: q, reason: collision with root package name */
    public final int f161858q;

    /* renamed from: r, reason: collision with root package name */
    public final int f161859r;

    /* renamed from: s, reason: collision with root package name */
    public final int f161860s;

    /* renamed from: t, reason: collision with root package name */
    public final int f161861t;

    /* renamed from: u, reason: collision with root package name */
    public final int f161862u;

    /* renamed from: v, reason: collision with root package name */
    public final int f161863v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f161864w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f161865x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.CheckBox f161866y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f161867z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingButtonLogoutAccount(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161855n = 1;
        this.f161856o = 2;
        this.f161857p = 1;
        this.f161858q = 3;
        this.f161859r = 4;
        this.f161860s = 5;
        this.f161861t = 6;
        this.f161862u = 7;
        this.f161863v = 8;
    }

    public static final boolean x7(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        settingButtonLogoutAccount.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11545, java.lang.Integer.valueOf(settingButtonLogoutAccount.f161857p));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        g0Var.d(11545, java.lang.Integer.valueOf(settingButtonLogoutAccount.f161858q));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
        g0Var.idkeyStat(99L, 145L, 1L, false);
        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
            gm0.j1.d().f70764d.C(false);
        }
        settingButtonLogoutAccount.D7();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        return true;
    }

    public static final void y7(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount, java.lang.String str) {
        settingButtonLogoutAccount.getClass();
        android.content.Intent putExtra = new android.content.Intent().putExtra("key_config_item", "SettingGroup_Main_AccountInfo");
        putExtra.putExtra("page_name_kv", "SettingGroup_Main_AccountInfo");
        putExtra.putExtra("ui_version", 2);
        putExtra.putExtra("setting_from_source", 2);
        putExtra.putExtra("setting_level", 1);
        java.lang.String stringExtra = settingButtonLogoutAccount.getActivity().getIntent().getStringExtra("setting_sessionid");
        if (stringExtra == null) {
            stringExtra = gm0.j1.b().j() + '_' + c01.id.c();
        }
        putExtra.putExtra("setting_sessionid", stringExtra);
        putExtra.putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
        pf5.j0.a(putExtra, com.tencent.mm.plugin.setting.ui.setting_new.uic.b.class);
        putExtra.putExtra("key_config_target_item", str);
        putExtra.putStringArrayListExtra("key_highlight_item", kz5.c0.d(str));
        j45.l.j(settingButtonLogoutAccount.getContext(), "setting", ".ui.setting_new.CommonSettingsUI", putExtra, null);
    }

    public static final void z7(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        settingButtonLogoutAccount.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "oneliang logout mm");
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        ((vd0.v1) j1Var).Zi(r17);
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.booter.q2.c();
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 0;
        logoutEvent.e();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
        com.tencent.mm.sdk.platformtools.c3.b("show_whatsnew");
        gm0.k2.a(settingButtonLogoutAccount.getContext(), true);
        com.tencent.mm.plugin.report.service.f0.e(8);
        gm0.j1.n().e();
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("Intro_Switch", true);
        ((com.tencent.mm.app.y7) f14.g.b()).u(intent, settingButtonLogoutAccount.getContext());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        settingButtonLogoutAccount.getContext().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A7() {
        if (gm0.j1.b().t()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.ui.bk.A() && !c01.z1.x()) {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                d24.r rVar = new d24.r(this);
                this.f161851g = rVar;
                d17.a(281, rVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
                B7();
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new d24.s(wi6, this), false);
                this.D = b4Var;
                b4Var.c(5000L, 5000L);
                this.B = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.l7z), true, true, new d24.t(wi6, this));
                return;
            }
        }
        B7();
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new d24.u(this), false);
        this.f161853i = b4Var2;
        b4Var2.c(5000L, 5000L);
        this.B = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbe), true, true, new d24.v(this));
    }

    public final void B7() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d24.x xVar = new d24.x(this);
        this.f161852h = xVar;
        d17.a(282, xVar);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.r0(4));
    }

    public final void C7(boolean z17) {
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        if (z17) {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).i();
        } else {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).getClass();
            com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
        }
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = false;
        backupProcessMgrExitEvent.e();
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.ui.vb.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).g();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        getActivity().finish();
        if (k35.p.f303943a != null) {
            com.tencent.mm.ui.vb.d(getContext(), z17, 2);
        }
    }

    public final void D7() {
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseSettingItem", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "queryHasPwdAndLogout: skip QueryHasPasswd for ex-device, do logout directly");
            A7();
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d24.g0 g0Var = new d24.g0(this);
        this.C = g0Var;
        d17.a(255, g0Var);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 2;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new d24.h0(w0Var, this), false);
        this.D = b4Var;
        b4Var.c(12000L, 12000L);
        this.B = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbe), true, false, new d24.i0(w0Var, this));
        if (gm0.j1.a()) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, false));
        }
    }

    public final void E7() {
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "setPwdOrexit: skip QueryHasPasswd for ex-device, exit directly");
            C7(true);
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d24.k0 k0Var = new d24.k0(this);
        this.C = k0Var;
        d17.a(255, k0Var);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 1;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new d24.l0(w0Var, this), false);
        this.D = b4Var;
        b4Var.c(3000L, 3000L);
        this.B = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbd), true, false, new d24.m0(w0Var, this));
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_LogoutAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonSwitchAccount.class);
    }

    @Override // s24.d, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.git;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ef, code lost:
    
        if (((is.f) r9).Zi(r0) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021c  */
    @Override // a24.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r7(android.content.Context r9, android.view.View r10, int r11) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.r7(android.content.Context, android.view.View, int):void");
    }
}
