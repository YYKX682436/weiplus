package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class o7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f209450a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.n8 f209451b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f209453d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f209454e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f209455f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f209456g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f209457h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f209458i;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f209461l;

    /* renamed from: m, reason: collision with root package name */
    public int f209462m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f209463n;

    /* renamed from: c, reason: collision with root package name */
    public am.zg f209452c = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f209459j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f209460k = 0;

    public o7(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.ui.n8 n8Var) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f209461l = new com.tencent.mm.ui.GlobalAlertMgr$1(this, a0Var);
        this.f209462m = 0;
        this.f209463n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckMobileSpaceEvent>(a0Var) { // from class: com.tencent.mm.ui.GlobalAlertMgr$11
            {
                this.__eventId = -2026915730;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckMobileSpaceEvent checkMobileSpaceEvent) {
                com.tencent.mm.ui.o7.this.f209462m = checkMobileSpaceEvent.f54052g.f7688a;
                return false;
            }
        };
        this.f209450a = mMFragmentActivity;
        this.f209451b = n8Var;
    }

    public static long a(com.tencent.mm.ui.o7 o7Var) {
        o7Var.getClass();
        boolean equals = "1".equals(j62.e.g().a("clicfg_storage_alert_clean_cache_android", "1", false, true));
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "storageDisableAlert, use = " + equals);
        if (!equals) {
            return -1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilentCleanCacheService", "cleanCache");
        com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(lp0.b.g0()).G();
        long j17 = 0;
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilentCleanCacheService", "delete log file " + r6Var.o());
                long C = r6Var.C();
                if (r6Var.l()) {
                    j17 += C;
                }
            }
        }
        com.tencent.mm.vfs.r6[] G2 = new com.tencent.mm.vfs.r6(com.tencent.mm.storage.x3.f196324a).G();
        if (G2 != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G2) {
                java.lang.String name = r6Var2.getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(java.lang.System.currentTimeMillis()));
                if (r26.i0.n(name, ".xlog", false)) {
                    if (!r26.i0.n(name, format + ".xlog", false)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SilentCleanCacheService", "delete log file " + r6Var2.o());
                        long C2 = r6Var2.C();
                        if (r6Var2.l()) {
                            j17 += C2;
                        }
                    }
                }
            }
        }
        long j18 = j17;
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return j18;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.y6(o7Var, j18));
        return j18;
    }

    public final void b() {
        if (!this.f209459j) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(45);
        }
        this.f209459j = true;
    }

    public java.lang.String c(int i17) {
        return this.f209450a.getString(i17);
    }

    public final void d(boolean z17) {
        if (z17) {
            g();
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f209450a, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", c(com.tencent.mm.R.string.itc));
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f209450a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFragmentActivity, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFragmentActivity, "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void e(int i17, int i18, int i19, java.lang.String str) {
        u11.a a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert jumpByActionType  alertId[%d], actionType[%d], btnId[%d], url[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13191, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Boolean.FALSE);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f209450a;
        switch (i18) {
            case 2:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.j(mMFragmentActivity, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 3:
                if (this.f209457h) {
                    d(true);
                    return;
                }
                if (this.f209458i == null) {
                    this.f209458i = new com.tencent.mm.ui.j7(this);
                }
                c01.d9.e().a(255, this.f209458i);
                com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(1);
                c01.d9.e().g(w0Var);
                this.f209456g = db5.e1.Q(this.f209450a, c(com.tencent.mm.R.string.f490573yv), c(com.tencent.mm.R.string.irw), true, true, new com.tencent.mm.ui.h7(this, w0Var));
                return;
            case 4:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(mMFragmentActivity, com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
                intent2.putExtra("bind_scene", 3);
                java.lang.String simCountryIso = ((android.telephony.TelephonyManager) mMFragmentActivity.getSystemService("phone")).getSimCountryIso();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
                    intent2.putExtra("country_name", a17.f423729c);
                    intent2.putExtra("couttry_code", a17.f423728b);
                }
                com.tencent.mm.ui.MMWizardActivity.X6(mMFragmentActivity, intent2);
                return;
            case 5:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("BaseScanUI_select_scan_mode", 1);
                intent3.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                intent3.putExtra("key_scan_report_enter_scene", 25);
                intent3.setFlags(65536);
                if (iq.b.g(mMFragmentActivity) || iq.b.x(mMFragmentActivity) || iq.b.c(mMFragmentActivity, true)) {
                    return;
                }
                j45.l.j(mMFragmentActivity, "scanner", ".ui.BaseScanUI", intent3, null);
                return;
            case 6:
                android.content.Intent intent4 = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
                intent4.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
                com.tencent.mm.ui.MMWizardActivity.X6(mMFragmentActivity, intent4);
                return;
            case 7:
                android.content.Intent intent5 = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.class);
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = this.f209450a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent5);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mMFragmentActivity2, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMFragmentActivity2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mMFragmentActivity2, "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            default:
                return;
        }
    }

    public final boolean f(am.zg zgVar) {
        q45.b bVar;
        java.util.LinkedList linkedList;
        if (zgVar == null || (bVar = zgVar.f8561a) == null || (linkedList = bVar.f360127g) == null || linkedList.size() == 0) {
            return false;
        }
        q45.b bVar2 = zgVar.f8561a;
        int i17 = bVar2.f360124d;
        java.lang.String str = bVar2.f360125e;
        java.lang.String str2 = bVar2.f360126f;
        int i18 = zgVar.f8564d;
        int size = bVar2.f360127g.size();
        q45.b bVar3 = zgVar.f8561a;
        int i19 = bVar3.f360128h;
        if (i19 >= 0 && i19 < size) {
            q45.a aVar = (q45.a) bVar3.f360127g.get(i19);
            e(i17, aVar.f360121e, aVar.f360120d, aVar.f360123g);
            return true;
        }
        if (i18 != 0) {
            if (i18 != 1) {
                return true;
            }
            db5.e1.C(this.f209450a, str2, str, ((q45.a) bVar3.f360127g.get(0)).f360122f, ((q45.a) zgVar.f8561a.f360127g.get(1)).f360122f, false, zgVar.f8562b, zgVar.f8563c);
            return true;
        }
        if (size == 1) {
            q45.a aVar2 = (q45.a) bVar3.f360127g.get(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(aVar2.f360120d), java.lang.Integer.valueOf(aVar2.f360121e), aVar2.f360122f, aVar2.f360123g);
            db5.e1.E(this.f209450a, str2, str, aVar2.f360122f, false, new com.tencent.mm.ui.e7(this, i17, aVar2));
            return true;
        }
        q45.a aVar3 = (q45.a) bVar3.f360127g.get(1);
        q45.a aVar4 = (q45.a) zgVar.f8561a.f360127g.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", str, str2, java.lang.Integer.valueOf(aVar3.f360120d), java.lang.Integer.valueOf(aVar3.f360121e), aVar3.f360122f, aVar3.f360123g, java.lang.Integer.valueOf(aVar4.f360120d), java.lang.Integer.valueOf(aVar4.f360121e), aVar4.f360122f, aVar4.f360123g);
        db5.e1.C(this.f209450a, str2, str, aVar3.f360122f, aVar4.f360122f, false, new com.tencent.mm.ui.f7(this, i17, aVar3), new com.tencent.mm.ui.g7(this, i17, aVar4));
        return true;
    }

    public final void g() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f209455f;
        if (j0Var != null) {
            j0Var.show();
            return;
        }
        if (this.f209453d == null) {
            android.view.View inflate = android.view.View.inflate(this.f209450a, com.tencent.mm.R.layout.ckf, null);
            this.f209453d = inflate;
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mmq)).setText(c(com.tencent.mm.R.string.irg));
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f209453d.findViewById(com.tencent.mm.R.id.mmp);
            this.f209454e = mMLimitedClearEditText;
            mMLimitedClearEditText.getEditText().setInputType(129);
        }
        this.f209455f = db5.e1.x(this.f209450a, null, null, this.f209453d, new com.tencent.mm.ui.m7(this), new com.tencent.mm.ui.n7(this));
    }
}
