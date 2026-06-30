package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(19)
/* loaded from: classes11.dex */
public class SettingsSwitchAccountUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f160683y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f160684d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView f160685e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160686f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f160687g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f160688h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f160689i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f160690m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160691n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160692o;

    /* renamed from: p, reason: collision with root package name */
    public int f160693p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160694q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160695r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f160696s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160697t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f160698u = "";

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f160699v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final android.content.BroadcastReceiver f160700w = new com.tencent.mm.plugin.setting.ui.setting.km(this);

    /* renamed from: x, reason: collision with root package name */
    public final w24.s f160701x = new com.tencent.mm.plugin.setting.ui.setting.rm(this);

    public final void T6(java.lang.String str) {
        com.tencent.mm.plugin.setting.model.SwitchAccountModel switchAccountModel = (com.tencent.mm.plugin.setting.model.SwitchAccountModel) ((java.util.HashMap) this.f160699v).get(str);
        if (switchAccountModel == null || this.f160694q) {
            return;
        }
        this.f160694q = true;
        this.f160685e.setLoginState(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "doLoginScene: wxid: %s username:%s, ticket:%s", str, switchAccountModel.f160048e, switchAccountModel.f160050g);
        gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(str, switchAccountModel.f160048e, switchAccountModel.f160050g, true, "", 0));
        this.f160685e.setSwitchToWxUsername(str);
        this.f160685e.b();
        Y6();
    }

    public final void U6() {
        if (gm0.j1.b().t() && !c01.z1.x()) {
            gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2));
        }
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.r0(0));
        this.f160685e.setLogoutState(true);
        this.f160685e.b();
        if (this.f160692o == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.jm(this), false);
            this.f160692o = b4Var;
            b4Var.c(8000L, 8000L);
        }
    }

    public final void V6() {
        if (this.f160694q) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingsSwitchAccountUI", "doing login now, ignore go back request.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "go back");
        int i17 = this.f160693p;
        if (i17 != 2 && i17 != 1) {
            qp1.h0.b();
            finish();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
        this.f160694q = false;
    }

    public final void W6() {
        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
            gm0.j1.d().f70764d.C(false);
        }
        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
        com.tencent.mars.xlog.Log.w("MicroMsg.SettingsSwitchAccountUI", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 1;
        gm0.j1.d().g(w0Var);
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "switch account logout");
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.booter.q2.c();
        setBackBtnVisible(false);
        showOptionMenu(false);
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 0;
        logoutEvent.e();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
        com.tencent.mm.sdk.platformtools.c3.b("show_whatsnew");
        gm0.k2.a(this, true);
        if (gm0.j1.a()) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, false));
            ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Zi(c01.z1.r());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "last login username in sp %s", c01.b9.f37069c.a("login_user_name", ""));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "last login username in configStg %s", c17.v(u3Var, ""));
        java.util.Map q17 = c01.z1.q();
        java.util.HashMap hashMap = (java.util.HashMap) q17;
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) hashMap.get("login_user_name")) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigSwitchProtectByConfigStg()) == 1) {
            hashMap.put("login_user_name", gm0.j1.u().c().v(u3Var, ""));
        }
        c01.uc.f37514c.g(c01.z1.r(), q17);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", true).commit();
        java.lang.String r18 = c01.z1.r();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("action_kill_mm_process");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f160700w;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 4);
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI.class);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(((java.util.HashMap) this.f160699v).values());
        intent.putParcelableArrayListExtra("key_switch_account_users", arrayList);
        intent.putExtra("key_switch_from_wx_username", r18);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("transit_to_switch_account", true).commit();
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), this);
        float q18 = i65.a.q(this);
        intent.putExtra("key_langauage_code", o17);
        intent.putExtra("key_font_scale_size", q18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
        intent.putExtra("key_mm_process_pid", android.os.Process.myPid());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.h(this);
    }

    public final void Y6() {
        if (this.f160694q) {
            showOptionMenu(false);
            return;
        }
        if (((java.util.HashMap) this.f160699v).size() <= 1 && this.f160693p == 0) {
            showOptionMenu(false);
            this.f160686f = false;
            this.f160685e.setDeleteState(false);
        } else if (!this.f160686f) {
            this.f160684d.setText(com.tencent.mm.R.string.f493093iz5);
            this.f160689i.setVisibility(8);
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490471w0), new com.tencent.mm.plugin.setting.ui.setting.um(this));
        } else {
            this.f160684d.setText(com.tencent.mm.R.string.f493090iz2);
            this.f160689i.setVisibility(0);
            if (this.f160695r) {
                addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.vm(this));
            } else {
                addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.hm(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489454cm3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x012f, code lost:
    
        if (r0.f37516a.contains(r24.f160691n) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c5  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 701) {
            if (i18 == -1) {
                U6();
                return;
            }
            return;
        }
        if (i17 == 702) {
            if (i18 == 1) {
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0);
                sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
                sharedPreferences.edit().putBoolean("last_switch_account_to_regui", true).commit();
                W6();
                return;
            }
            if (i18 == -1) {
                java.util.Set d17 = c01.uc.f37514c.d();
                java.util.Map map = this.f160699v;
                ((java.util.HashMap) map).clear();
                java.util.Iterator it = ((java.util.HashSet) d17).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    c01.uc ucVar = c01.uc.f37514c;
                    ((java.util.HashMap) map).put(str, new com.tencent.mm.plugin.setting.model.SwitchAccountModel(str, ucVar.c(str, "login_user_name"), ucVar.c(str, "last_avatar_path"), ucVar.c(str, "last_logout_no_pwd_ticket"), com.tencent.mm.sdk.platformtools.t8.D1(ucVar.c(str, "last_login_use_voice"), 0), ucVar.c(str, "last_login_nick_name"), ucVar.c(str, "last_login_alias")));
                }
                this.f160685e.a(map);
                Y6();
                this.f160685e.b();
                this.f160685e.post(new com.tencent.mm.plugin.setting.ui.setting.im(this, intent));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        java.lang.String k17 = wo.w0.k();
        this.f160697t = k17 + "_" + this.f160698u;
        this.f160698u = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.util.Map map = this.f160696s;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("login_sessionid", this.f160697t);
        hashMap.put("page_sessionid", this.f160698u);
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, k17);
        hashMap.put("login_page_type", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AccountLoginPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, map);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(281, this);
        gm0.j1.d().q(282, this);
        gm0.j1.d().q(255, this);
        try {
            unregisterReceiver(this.f160700w);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "onResume");
        qp1.h0.a(true, true, true);
        this.f160685e.b();
        Y6();
        int i17 = this.f160693p;
        if ((i17 == 1 || i17 == 2) && gm0.j1.a() && gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "account initialized");
            this.f160694q = true;
            android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
            b17.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            db5.f.k(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0269  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r33, int r34, java.lang.String r35, com.tencent.mm.modelbase.m1 r36) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "onStop");
        if (this.f160693p == 1) {
            this.f160685e.getClass();
        }
    }
}
