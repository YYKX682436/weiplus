package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class PermissionSettingUI2 extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153759d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153760e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f153761f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f153762g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f153763h;

    /* renamed from: v, reason: collision with root package name */
    public gr3.g f153774v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f153764i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f153765m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f153766n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f153767o = "";

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153768p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153769q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f153770r = false;

    /* renamed from: s, reason: collision with root package name */
    public long f153771s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f153772t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f153773u = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f153775w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final long f153776x = java.lang.System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int T6() {
        com.tencent.mm.storage.z3 z3Var = this.f153768p;
        if (z3Var == null || z3Var.y2()) {
            if (this.f153768p != null) {
                return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
            }
            return 0;
        }
        boolean x27 = this.f153768p.x2();
        ?? r07 = x27;
        if (U6(this.f153767o, 5L)) {
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
        if (this.f153768p == null || (gVar = this.f153774v) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifyOutsiderPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f274883h : gr3.j.f274885m;
        gVar.getClass();
        gVar.f274864e = jVar;
        this.f153774v.f274865f = this.f153768p.y2();
        gr3.g gVar2 = this.f153774v;
        gVar2.f274866g = z17;
        gVar2.f274867h = U6(this.f153767o, 5L);
        this.f153774v.c();
    }

    public void W6(boolean z17) {
        gr3.g gVar;
        if (this.f153768p == null || (gVar = this.f153774v) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifySocialBlackPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f274882g : gr3.j.f274881f;
        gVar.getClass();
        gVar.f274864e = jVar;
        gr3.g gVar2 = this.f153774v;
        gVar2.f274865f = z17;
        gVar2.f274866g = this.f153768p.x2();
        this.f153774v.f274867h = U6(this.f153767o, 5L);
        this.f153774v.c();
    }

    public final void X6() {
        android.content.res.Resources resources;
        int i17;
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153767o, true);
        this.f153768p = n17;
        n17.X1(this.f153767o);
        this.f153761f.setVisibility(this.f153768p.y2() ? 0 : 8);
        this.f153762g.setVisibility(this.f153768p.y2() ? 8 : 0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kds);
        int i18 = (this.f153764i && this.f153768p.y2()) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f153763h.setVisibility(this.f153768p.y2() ? 0 : 8);
        boolean x27 = this.f153768p.x2();
        boolean U6 = U6(this.f153767o, 5L);
        this.f153759d.setCheck(x27);
        int i19 = this.f153768p.I;
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
        this.f153760e.setCheck(U6);
        ((android.view.View) ((android.view.View) this.f153762g.getParent()).getParent()).setClickable(!this.f153765m);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487037na3);
        if (this.f153765m) {
            resources = getResources();
            i17 = com.tencent.mm.R.color.f479232tk;
        } else {
            resources = getResources();
            i17 = com.tencent.mm.R.color.a0c;
        }
        textView3.setTextColor(resources.getColor(i17));
        if (!com.tencent.mm.storage.z3.m4(this.f153767o) || !"3552365301".equals(this.f153768p.Q0())) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kdr);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nxt);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kdq);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kdr);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        return com.tencent.mm.R.layout.c9e;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f153768p != null && com.tencent.mm.storage.z3.m4(this.f153767o) && "3552365301".equals(this.f153768p.Q0())) {
            setMMTitle(com.tencent.mm.R.string.jdf);
        } else {
            setMMTitle(com.tencent.mm.R.string.hhq);
        }
        setBackBtn(new hr3.cc(this));
        this.f153761f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.nxq);
        this.f153762g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.n_y);
        this.f153759d = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.kdq).findViewById(com.tencent.mm.R.id.kdu);
        this.f153760e = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.n6q).findViewById(com.tencent.mm.R.id.f486159ke3);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nxr);
        this.f153763h = textView;
        if (textView instanceof android.widget.TextView) {
            textView.setText(bi4.v1.g() ? com.tencent.mm.R.string.hnd : com.tencent.mm.R.string.hnc);
        }
        ((android.view.View) this.f153761f.getParent()).setOnClickListener(new hr3.dc(this));
        ((android.view.View) ((android.view.View) this.f153762g.getParent()).getParent()).setOnClickListener(new hr3.ec(this));
        this.f153759d.setSwitchListener(new hr3.fc(this));
        this.f153760e.setSwitchListener(new hr3.gc(this));
        findViewById(com.tencent.mm.R.id.jrr).setOnClickListener(new hr3.hc(this));
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.f153764i = z17;
        if (!z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.nxt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        X6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this);
        this.f153767o = getIntent().getStringExtra("sns_permission_userName");
        this.f153771s = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f153772t = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153767o, true);
        this.f153768p = n17;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsPermissionUI2", "the error cause by get contact by %s", this.f153767o);
            finish();
        }
        this.f153768p.X1(this.f153767o);
        initView();
        com.tencent.mm.autogen.events.GetSnsTagListEvent getSnsTagListEvent = new com.tencent.mm.autogen.events.GetSnsTagListEvent();
        getSnsTagListEvent.f54413g.f7532a = 1;
        getSnsTagListEvent.e();
        this.f153775w = T6();
        if (this.f153768p == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method initProfilePermissionModifyReport");
        } else {
            this.f153773u = getIntent().getIntExtra("entry_50321_path", 0);
            gr3.g gVar = new gr3.g();
            this.f153774v = gVar;
            java.lang.String str = this.f153767o;
            gVar.f274862c = str;
            gVar.f274861b = com.tencent.mm.storage.z3.m4(str) ? 2 : 1;
            this.f153774v.f274863d = com.tencent.mm.plugin.profile.p2.wi(getIntent());
            this.f153774v.f274860a = this.f153773u;
        }
        com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 19, 1, this.f153767o);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this);
        long j17 = this.f153771s;
        if (j17 != 0 && j17 != -1) {
            com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent = new com.tencent.mm.autogen.events.SnsFinishBlockUserEvent();
            boolean z17 = this.f153770r;
            am.rv rvVar = snsFinishBlockUserEvent.f54809g;
            rvVar.f7847a = z17;
            rvVar.f7848b = this.f153771s;
            snsFinishBlockUserEvent.e();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int T6 = T6();
        com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct snsPermissionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct();
        snsPermissionReportStruct.f60682d = snsPermissionReportStruct.b("Username", this.f153767o, true);
        snsPermissionReportStruct.f60683e = snsPermissionReportStruct.b("PublishId", ca4.z0.t0(this.f153771s), true);
        snsPermissionReportStruct.f60684f = this.f153775w;
        snsPermissionReportStruct.f60685g = T6;
        snsPermissionReportStruct.f60686h = this.f153772t;
        snsPermissionReportStruct.f60687i = (int) (java.lang.System.currentTimeMillis() - this.f153776x);
        snsPermissionReportStruct.k();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gr3.g gVar = this.f153774v;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI2", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
        if (m1Var.getType() == 291) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f153766n;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f153766n = null;
            }
            X6();
            if (this.f153769q) {
                this.f153770r = true;
            }
        }
        if (m1Var.getType() != 681 || !(m1Var instanceof e21.j)) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        java.util.List list = jVar.f246538f;
        r45.i25 i25Var = jVar.f246537e.f246521b.f246528a;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i19 >= arrayList.size()) {
                return;
            }
            if (((xg3.q0) arrayList.get(i19)).b() == 72) {
                r45.j25 j25Var = i25Var.f376688e;
                if (j25Var != null && ((java.lang.Integer) j25Var.f377518e.get(i19)).intValue() == -3400) {
                    this.f153765m = true;
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                    this.f153768p.i3();
                    c01.e2.j0(this.f153768p);
                    java.lang.String str2 = ((r45.g25) i25Var.f376688e.f377519f.get(i19)).f374841d;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.nxr)).getText().toString();
                    } else {
                        this.f153763h.setText(str2);
                    }
                    X6();
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                    u1Var.g(((r45.g25) i25Var.f376688e.f377519f.get(i19)).f374841d);
                    u1Var.a(true);
                    u1Var.j(getString(com.tencent.mm.R.string.hmr));
                    u1Var.m(com.tencent.mm.R.string.hms);
                    u1Var.b(new hr3.ic(this));
                    u1Var.q(false);
                    return;
                }
                r45.j25 j25Var2 = i25Var.f376688e;
                if (j25Var2 != null && ((java.lang.Integer) j25Var2.f377518e.get(i19)).intValue() == 0 && !this.f153768p.y2()) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                }
            }
            i19++;
        }
    }
}
