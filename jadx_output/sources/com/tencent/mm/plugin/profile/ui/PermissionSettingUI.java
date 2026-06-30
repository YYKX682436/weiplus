package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class PermissionSettingUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153742d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153743e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f153744f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f153745g;

    /* renamed from: u, reason: collision with root package name */
    public gr3.g f153756u;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153746h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f153747i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f153748m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f153749n = "";

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153750o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153751p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153752q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f153753r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f153754s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f153755t = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f153757v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final long f153758w = java.lang.System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int T6() {
        com.tencent.mm.storage.z3 z3Var = this.f153750o;
        if (z3Var == null || z3Var.y2()) {
            if (this.f153750o != null) {
                return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
            }
            return 0;
        }
        boolean x27 = this.f153750o.x2();
        ?? r07 = x27;
        if (U6(this.f153749n, 5L)) {
            r07 = (x27 ? 1 : 0) | 2;
        }
        if (r07 == 0) {
            return 4;
        }
        return r07;
    }

    public final boolean U6(java.lang.String str, long j17) {
        return ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(str, 5L);
    }

    public void V6(boolean z17) {
        gr3.g gVar;
        if (this.f153750o == null || (gVar = this.f153756u) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method reportWithModifyOutsiderPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f274883h : gr3.j.f274885m;
        gVar.getClass();
        gVar.f274864e = jVar;
        this.f153756u.f274865f = this.f153750o.y2();
        gr3.g gVar2 = this.f153756u;
        gVar2.f274866g = z17;
        gVar2.f274867h = U6(this.f153749n, 5L);
        this.f153756u.c();
    }

    public void W6() {
        android.content.res.Resources resources;
        int i17;
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153749n, true);
        this.f153750o = n17;
        n17.X1(this.f153749n);
        this.f153744f.setVisibility(this.f153750o.y2() ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f153745g;
        if (weImageView != null) {
            weImageView.setVisibility(this.f153750o.y2() ? 8 : 0);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kds);
        int i18 = (this.f153746h && this.f153750o.y2()) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kdt);
        if (findViewById2 instanceof android.widget.TextView) {
            ((android.widget.TextView) findViewById2).setText(bi4.v1.g() ? com.tencent.mm.R.string.hna : com.tencent.mm.R.string.hn9);
        }
        boolean x27 = this.f153750o.x2();
        boolean U6 = U6(this.f153749n, 5L);
        this.f153742d.setCheck(x27);
        int i19 = this.f153750o.I;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kdv);
        if (i19 == 1) {
            textView.setText(com.tencent.mm.R.string.jdc);
        } else if (i19 == 2) {
            textView.setText(com.tencent.mm.R.string.jdb);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486160ke4);
        if (i19 == 1) {
            textView2.setText(com.tencent.mm.R.string.j9h);
        } else if (i19 == 2) {
            textView2.setText(com.tencent.mm.R.string.j9g);
        }
        this.f153743e.setCheck(U6);
        ((android.view.View) ((android.view.View) this.f153745g.getParent()).getParent()).setClickable(!this.f153747i);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487037na3);
        if (this.f153747i) {
            resources = getResources();
            i17 = com.tencent.mm.R.color.f479232tk;
        } else {
            resources = getResources();
            i17 = com.tencent.mm.R.color.a0c;
        }
        textView3.setTextColor(resources.getColor(i17));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nxr);
        int i27 = this.f153750o.y2() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (findViewById3 instanceof android.widget.TextView) {
            ((android.widget.TextView) findViewById3).setText(bi4.v1.g() ? com.tencent.mm.R.string.hnd : com.tencent.mm.R.string.hnc);
        }
        if (!com.tencent.mm.storage.z3.m4(this.f153749n) || !"3552365301".equals(this.f153750o.Q0())) {
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kdr);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.nxt);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.kdq);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById6, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById6, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.kdr);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById7, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        setResult(-1, new android.content.Intent());
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c9d;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(ir3.e.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f153750o != null && com.tencent.mm.storage.z3.m4(this.f153749n) && "3552365301".equals(this.f153750o.Q0())) {
            setMMTitle(com.tencent.mm.R.string.jdf);
        } else {
            setMMTitle(com.tencent.mm.R.string.hhq);
        }
        setBackBtn(new hr3.wb(this));
        this.f153744f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.nxq);
        this.f153745g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.n_y);
        this.f153742d = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.kdq).findViewById(com.tencent.mm.R.id.kdu);
        this.f153743e = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.n6q).findViewById(com.tencent.mm.R.id.f486159ke3);
        ((android.view.View) this.f153744f.getParent()).setOnClickListener(new hr3.xb(this));
        ((android.view.View) ((android.view.View) this.f153745g.getParent()).getParent()).setOnClickListener(new hr3.yb(this));
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_SOURCE_FROM_PROFILE_MENU", false);
        this.f153742d.setSwitchListener(new hr3.zb(this, booleanExtra));
        this.f153743e.setSwitchListener(new hr3.ac(this, booleanExtra));
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.f153746h = z17;
        if (!z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.nxt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W6();
        ((ir3.e) pf5.z.f353948a.a(this).a(ir3.e.class)).setValue("not_allow_see_sns_permission_cb_key", !this.f153742d.f211363x ? getResources().getString(com.tencent.mm.R.string.i8m) : getResources().getString(com.tencent.mm.R.string.i8l));
        ((ir3.e) pf5.z.f353948a.a(this).a(ir3.e.class)).setValue("not_see_sns_permission_tv_key", !this.f153743e.f211363x ? getResources().getString(com.tencent.mm.R.string.i8m) : getResources().getString(com.tencent.mm.R.string.i8l));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        this.f153749n = getIntent().getStringExtra("sns_permission_userName");
        this.f153753r = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f153754s = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153749n, true);
        this.f153750o = n17;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f153749n);
            finish();
            return;
        }
        n17.X1(this.f153749n);
        initView();
        com.tencent.mm.autogen.events.GetSnsTagListEvent getSnsTagListEvent = new com.tencent.mm.autogen.events.GetSnsTagListEvent();
        getSnsTagListEvent.f54413g.f7532a = 1;
        getSnsTagListEvent.e();
        this.f153757v = T6();
        if (this.f153750o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method initProfilePermissionModifyReport");
        } else {
            this.f153755t = getIntent().getIntExtra("entry_50321_path", 0);
            gr3.g gVar = new gr3.g();
            this.f153756u = gVar;
            java.lang.String str = this.f153749n;
            gVar.f274862c = str;
            gVar.f274861b = com.tencent.mm.storage.z3.m4(str) ? 2 : 1;
            this.f153756u.f274863d = com.tencent.mm.plugin.profile.p2.wi(getIntent());
            this.f153756u.f274860a = this.f153755t;
        }
        com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 19, 1, this.f153749n);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        long j17 = this.f153753r;
        if (j17 != 0 && j17 != -1) {
            com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent = new com.tencent.mm.autogen.events.SnsFinishBlockUserEvent();
            boolean z17 = this.f153752q;
            am.rv rvVar = snsFinishBlockUserEvent.f54809g;
            rvVar.f7847a = z17;
            rvVar.f7848b = this.f153753r;
            snsFinishBlockUserEvent.e();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int T6 = T6();
        com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct snsPermissionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct();
        snsPermissionReportStruct.f60682d = snsPermissionReportStruct.b("Username", this.f153749n, true);
        snsPermissionReportStruct.f60683e = snsPermissionReportStruct.b("PublishId", ca4.z0.t0(this.f153753r), true);
        snsPermissionReportStruct.f60684f = this.f153757v;
        snsPermissionReportStruct.f60685g = T6;
        snsPermissionReportStruct.f60686h = this.f153754s;
        snsPermissionReportStruct.f60687i = (int) (java.lang.System.currentTimeMillis() - this.f153758w);
        snsPermissionReportStruct.k();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gr3.g gVar = this.f153756u;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
        if (m1Var.getType() == 291) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f153748m;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f153748m = null;
            }
            W6();
            ai4.m0.f5173a.P(this.f153749n);
            if (this.f153751p) {
                this.f153752q = true;
            }
        }
        if (m1Var.getType() == 681 && (m1Var instanceof e21.j)) {
            e21.j jVar = (e21.j) m1Var;
            java.util.List list = jVar.f246538f;
            r45.i25 i25Var = jVar.f246537e.f246521b.f246528a;
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i19 >= arrayList.size()) {
                    break;
                }
                if (((xg3.q0) arrayList.get(i19)).b() == 72) {
                    r45.j25 j25Var = i25Var.f376688e;
                    if (j25Var == null || ((java.lang.Integer) j25Var.f377518e.get(i19)).intValue() != -3400) {
                        r45.j25 j25Var2 = i25Var.f376688e;
                        if (j25Var2 != null && ((java.lang.Integer) j25Var2.f377518e.get(i19)).intValue() == 0 && !this.f153750o.y2()) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                        }
                    } else {
                        this.f153747i = true;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                        this.f153750o.i3();
                        c01.e2.j0(this.f153750o);
                        java.lang.String str2 = ((r45.g25) i25Var.f376688e.f377519f.get(i19)).f374841d;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.nxr)).getText().toString();
                        } else {
                            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.nxr)).setText(str2);
                        }
                        W6();
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                        u1Var.g(((r45.g25) i25Var.f376688e.f377519f.get(i19)).f374841d);
                        u1Var.a(true);
                        u1Var.j(getString(com.tencent.mm.R.string.hmr));
                        u1Var.m(com.tencent.mm.R.string.hms);
                        u1Var.b(new hr3.bc(this));
                        u1Var.q(false);
                    }
                }
                i19++;
            }
            ai4.m0.f5173a.P(this.f153749n);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(bs3.h.class);
    }
}
