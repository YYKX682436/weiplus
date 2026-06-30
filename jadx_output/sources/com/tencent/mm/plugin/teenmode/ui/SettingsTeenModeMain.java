package com.tencent.mm.plugin.teenmode.ui;

@db5.a(128)
@ul5.d(0)
/* loaded from: classes.dex */
public class SettingsTeenModeMain extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int I = 0;
    public android.widget.TextView A;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public android.view.View G;
    public android.view.View H;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f172850d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f172851e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f172852f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f172853g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f172854h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f172855i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f172856m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f172857n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f172858o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f172859p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f172860q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f172861r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f172862s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f172863t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f172864u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.RelativeLayout f172865v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f172866w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f172867x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f172868y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f172869z;

    public final void T6() {
        findViewById(com.tencent.mm.R.id.gvh).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.t4(this));
        com.tencent.mm.storage.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gvi);
        if (df6 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(df6.g2());
            textView.setVisibility(0);
        }
    }

    public final void U6(boolean z17) {
        android.view.View view = this.H;
        if (view != null) {
            if (this.F) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f172867x != null) {
            int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
            if (z17) {
                this.B = G8;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMain", "[updateView] finder, rangeVal:$rangeVal finderOldVal:$finderOldVal");
            if (c01.e2.a0() && G8 == 1) {
                G8 = 0;
            }
            if (G8 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMain", "doSaveConfig: write teenMode range");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
            } else if (G8 == 1) {
                this.f172867x.setText(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder.U6());
            } else if (G8 != 2) {
                this.f172867x.setText("");
            }
            this.f172867x.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jsy));
        }
        if (this.f172868y != null) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            if (z17) {
                this.C = h47;
            }
            if (h47 == 0) {
                this.f172868y.setText(com.tencent.mm.R.string.jss);
            } else if (h47 == 1) {
                this.f172868y.setText(com.tencent.mm.R.string.jsu);
            } else if (h47 != 2) {
                this.f172868y.setText("");
            } else {
                this.f172868y.setText(com.tencent.mm.R.string.jsy);
            }
        }
        if (this.f172869z != null) {
            int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            if (z17) {
                this.D = hd6;
            }
            if (hd6 == 0) {
                this.f172869z.setText(com.tencent.mm.R.string.jry);
            } else if (hd6 == 1) {
                this.f172869z.setText(com.tencent.mm.R.string.jsu);
            } else if (hd6 != 2) {
                this.f172869z.setText("");
            } else {
                this.f172869z.setText(com.tencent.mm.R.string.jrx);
            }
        }
        if (this.A != null) {
            int ag6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
            if (z17) {
                this.E = ag6;
            }
            if (ag6 == 0) {
                this.A.setText(com.tencent.mm.R.string.ls9);
            } else if (ag6 != 2) {
                this.A.setText(com.tencent.mm.R.string.jsy);
            } else {
                this.A.setText(com.tencent.mm.R.string.jsy);
            }
        }
        this.f172861r.setVisibility(0);
        this.f172862s.setVisibility(8);
        if (this.f172863t != null) {
            if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
                this.f172863t.setVisibility(0);
            } else {
                this.f172863t.setVisibility(8);
            }
        }
    }

    public final void V6() {
        if (this.f172856m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTeenModeMain", "payLL is null");
            return;
        }
        java.lang.String a17 = j62.e.g().a("clicfg_teenager_mode_pay_limit_open_android", "", false, false);
        if (!(!(!com.tencent.mm.sdk.platformtools.t8.K0(a17) && com.tencent.mm.sdk.platformtools.t8.P(a17, 0) != 0) ? false : c01.z1.G())) {
            this.f172856m.setVisibility(8);
        } else {
            this.f172856m.setVisibility(0);
            ((h45.q) i95.n0.c(h45.q.class)).startTeenagerPayGetDetail(this, new com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$b(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cm8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMain", "ticket : %s", ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h);
        this.f172856m = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.kqv);
        this.f172857n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o07);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o0c);
        this.f172858o = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172857n.setVisibility(8);
        this.f172856m.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
                com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.this;
                settingsTeenModeMain.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsTeenModeMain, array);
                ((h45.q) i95.n0.c(h45.q.class)).startTeenagerPay(settingsTeenModeMain, settingsTeenModeMain.f172859p, new com.tencent.mm.plugin.teenmode.ui.u4(settingsTeenModeMain));
                yj0.a.h(settingsTeenModeMain, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            V6();
        } else {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).G5(new com.tencent.mm.plugin.teenmode.ui.v4(this));
        }
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById(com.tencent.mm.R.id.vcw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vcv);
        if (this.F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.f172866w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vcu);
        if (c01.e2.a0()) {
            this.f172866w.setVisibility(0);
        } else {
            this.f172866w.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f482694li);
        this.f172852f = relativeLayout;
        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.q3(this));
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.n9z);
        this.f172853g = relativeLayout2;
        relativeLayout2.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.r3(this));
        this.f172867x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487238o00);
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.fro)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.s3(this));
        this.f172854h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f7n);
        this.f172855i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f7o);
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Bi()) {
            this.f172854h.setVisibility(8);
            this.f172855i.setVisibility(0);
        } else {
            this.f172854h.setVisibility(0);
            this.f172855i.setVisibility(8);
        }
        this.f172854h.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.t3(this));
        this.f172855i.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.u3(this));
        this.f172868y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487242o04);
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jsb)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.v3(this));
        this.f172869z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nzx);
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f483164yb)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.w3(this));
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.oge)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.x3(this));
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.d0p)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.y3(this));
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f485098gj0);
        this.f172860q = relativeLayout3;
        relativeLayout3.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.z3(this));
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.k6c);
        this.f172861r = relativeLayout4;
        relativeLayout4.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.b4(this));
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.k6d);
        this.f172862s = relativeLayout5;
        relativeLayout5.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.c4(this));
        android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487319r16);
        this.f172863t = relativeLayout6;
        relativeLayout6.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.d4(this));
        android.widget.RelativeLayout relativeLayout7 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.muw);
        this.f172864u = relativeLayout7;
        relativeLayout7.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.e4(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_teen_mode_remove_shopping, 0) == 1) {
            this.f172864u.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout8 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.vpr);
        this.f172865v = relativeLayout8;
        relativeLayout8.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.f4(this));
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nzz);
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.deb)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.g4(this));
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pkh)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.h4(this));
        if (c01.e2.a0()) {
            this.f172854h.setVisibility(8);
            this.f172860q.setVisibility(8);
            this.f172864u.setVisibility(8);
            this.f172865v.setVisibility(8);
        } else {
            this.f172852f.setVisibility(8);
            this.f172853g.setVisibility(8);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bzq);
        this.f172850d = findViewById2;
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.i4(this));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.j4(this));
        U6(true);
        T6();
        addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.teenmode.ui.n4(this));
        if (!getIntent().getBooleanExtra("intent_from_sys_to_inner", false) || this.F) {
            return;
        }
        db5.t7.h(this, getString(com.tencent.mm.R.string.oky));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        customfixStatusbar(true);
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482435ei);
        this.G = findViewById;
        if (findViewById != null && vj5.n.f437718k) {
            this.H = findViewById.findViewById(com.tencent.mm.R.id.coy);
            vj5.n b17 = vj5.n.b(this);
            com.tencent.mm.plugin.teenmode.ui.o4 o4Var = new com.tencent.mm.plugin.teenmode.ui.o4(this);
            this.mStatusBarHeightCallback = o4Var;
            b17.d(o4Var);
            getWindow().getDecorView().requestApplyInsets();
            vj5.o.e(getWindow());
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setActionbarElementColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.F = getIntent().getBooleanExtra("intent_is_sys_teen", false);
        initView();
        if (getIntent().getBooleanExtra("intent_close_me", false)) {
            finish();
        }
        supportLightStatusBar();
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.cgf)).setOnScrollChangeListener(new com.tencent.mm.plugin.teenmode.ui.a4(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if ((((this.B != ((uh4.c0) i95.n0.c(uh4.c0.class)).G8()) || this.C != ((uh4.c0) i95.n0.c(uh4.c0.class)).h4()) || this.D != ((uh4.c0) i95.n0.c(uh4.c0.class)).hd()) || this.E != ((uh4.c0) i95.n0.c(uh4.c0.class)).ag()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).T(3);
        }
        int i17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() ? 1 : 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c01.e2.a0()) {
            arrayList.add("AddFriend:Block");
            arrayList.add("Moments:Block");
        }
        xh4.x xVar = xh4.x.f454643a;
        arrayList.add("Finder:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).G8())));
        if (java.util.Objects.equals(c01.e2.s(), "CN")) {
            arrayList.add("Live:Block");
        }
        arrayList.add("WCPay:Block");
        arrayList.add("OfficialAccounts:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).h4())));
        arrayList.add("WeApp:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).hd())));
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            arrayList.add("TingFind:Block");
        }
        arrayList.add("WeSee:Block");
        arrayList.add("WeSearch:Block");
        arrayList.add("PeopleNearBy:Block");
        arrayList.add("GameCenter:Block");
        if (java.util.Objects.equals(c01.e2.s(), "CN")) {
            arrayList.add("Store:Block");
            arrayList.add("WxShop:Block");
        }
        arrayList.add("Emoticon:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).ag())));
        arrayList.add("WeCoin:Block");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb6.append((java.lang.CharSequence) "#");
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20917, 50, 1, java.lang.Integer.valueOf(i17), "", "", "", sb7);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMain", "cmingwang data report = %s", sb7);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(false);
        T6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).If();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        super.setActionbarColor(i17);
        android.view.View view = this.G;
        if (view != null) {
            view.setBackgroundColor(getStatusBarColor());
            vj5.o.e(getWindow());
        }
    }
}
