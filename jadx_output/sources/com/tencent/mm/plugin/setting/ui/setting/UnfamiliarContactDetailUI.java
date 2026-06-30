package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class UnfamiliarContactDetailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final java.lang.String B = new java.lang.String(java.lang.Character.toChars(123));

    /* renamed from: d, reason: collision with root package name */
    public boolean f160766d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160767e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160768f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f160769g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160770h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f160771i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f160772m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f160773n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f160774o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f160775p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.xp f160776q;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.dq f160781v;

    /* renamed from: y, reason: collision with root package name */
    public k14.x0 f160784y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f160785z;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f160777r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f160778s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f160779t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f160780u = new java.util.HashSet();

    /* renamed from: w, reason: collision with root package name */
    public int f160782w = -1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashSet f160783x = new java.util.HashSet();
    public com.tencent.mm.ui.widget.dialog.u3 A = null;

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI, boolean z17) {
        unfamiliarContactDetailUI.getClass();
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(unfamiliarContactDetailUI, com.tencent.mm.R.anim.f477857df);
            loadAnimation.setAnimationListener(new com.tencent.mm.plugin.setting.ui.setting.gp(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.f160771i.startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(unfamiliarContactDetailUI, com.tencent.mm.R.anim.f477855dd);
            loadAnimation2.setAnimationListener(new com.tencent.mm.plugin.setting.ui.setting.wp(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.f160771i.startAnimation(loadAnimation2);
        }
        unfamiliarContactDetailUI.f160785z = z17;
        if (z17) {
            unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2k));
        } else {
            unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2q));
            ((android.widget.CheckBox) unfamiliarContactDetailUI.f160774o.findViewById(com.tencent.mm.R.id.btf)).setChecked(false);
        }
    }

    public final void U6(java.util.List list) {
        java.util.HashMap hashMap = this.f160777r;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f160778s;
        hashMap2.clear();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        java.lang.String str = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.setting.ui.setting.yp ypVar = (com.tencent.mm.plugin.setting.ui.setting.yp) it.next();
            if (B.equalsIgnoreCase(ypVar.f161798a)) {
                ypVar.f161798a = "#";
            }
            java.lang.String str2 = ypVar.f161798a;
            if (!str2.equalsIgnoreCase(str)) {
                hashMap.put(str2.toUpperCase(), java.lang.Integer.valueOf(i17));
                hashMap2.put(java.lang.Integer.valueOf(i17), str2.toUpperCase());
            }
            i17++;
            str = str2;
        }
    }

    public final void V6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.A = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.k2n), true, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.A.dismiss();
        this.A = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cme;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(com.tencent.mm.R.string.j0i);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.k2q), new com.tencent.mm.plugin.setting.ui.setting.kp(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.lp(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mpp);
        int i17 = this.f160766d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mpr);
        int i18 = this.f160768f ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mpq);
        int i19 = this.f160767e ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f160769g = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f487496os3);
        this.f160771i = findViewById(com.tencent.mm.R.id.atj);
        this.f160770h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jf6);
        this.f160781v = new com.tencent.mm.plugin.setting.ui.setting.dq(this, this.f160780u, new com.tencent.mm.plugin.setting.ui.setting.mp(this));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f487493os0);
        this.f160772m = findViewById4;
        findViewById4.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.op(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f487494os1);
        this.f160773n = findViewById5;
        findViewById5.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.rp(this));
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f487495os2);
        this.f160774o = findViewById6;
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.tp(this));
        this.f160775p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_q);
        this.f160769g.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        com.tencent.mm.plugin.setting.ui.setting.xp xpVar = new com.tencent.mm.plugin.setting.ui.setting.xp(this);
        this.f160776q = xpVar;
        this.f160769g.setAdapter(xpVar);
        ((com.tencent.mm.ui.base.RealAlphabetScrollBar) findViewById(com.tencent.mm.R.id.f487497os4)).setOnScrollBarTouchListener(new com.tencent.mm.plugin.setting.ui.setting.up(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(291, this);
        this.f160766d = getIntent().getBooleanExtra("half_year_not_chat", false);
        this.f160767e = getIntent().getBooleanExtra("half_year_not_response", false);
        this.f160768f = getIntent().getBooleanExtra("has_not_same_chatroom", false);
        initView();
        k14.x0 x0Var = new k14.x0(this.f160766d, this.f160767e, this.f160768f, new com.tencent.mm.plugin.setting.ui.setting.vp(this));
        this.f160784y = x0Var;
        x0Var.f303414m = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.plugin.setting.ui.setting.vp) x0Var.f303413l).a(com.tencent.mm.plugin.setting.ui.setting.eq.NORMAL);
        x0Var.f303406e.postToWorker(new k14.o0(x0Var));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = (this.f160766d ? 1 : 0) | (this.f160768f ? 2 : 0) | (this.f160767e ? 4 : 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14434, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161047b), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161046a), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161051f), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161048c), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161050e), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161049d));
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[%s:%s:%s:%s:%s:%s:%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161047b), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161046a), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161051f), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161048c), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161050e), java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.fq.f161049d));
        com.tencent.mm.plugin.setting.ui.setting.fq.f161046a = 0;
        com.tencent.mm.plugin.setting.ui.setting.fq.f161047b = 0;
        com.tencent.mm.plugin.setting.ui.setting.fq.f161048c = 0;
        com.tencent.mm.plugin.setting.ui.setting.fq.f161049d = 0;
        com.tencent.mm.plugin.setting.ui.setting.fq.f161050e = 0;
        com.tencent.mm.plugin.setting.ui.setting.fq.f161051f = 0;
        gm0.j1.d().q(291, this);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this.f160781v);
        k14.x0 x0Var = this.f160784y;
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[onDestroy] [%s:%s:%s]", java.lang.Boolean.valueOf(x0Var.f303403b), java.lang.Boolean.valueOf(x0Var.f303402a), java.lang.Boolean.valueOf(x0Var.f303404c));
        k14.w0 w0Var = x0Var.f303412k;
        if (w0Var != null) {
            gm0.j1.d().q(292, w0Var);
        }
        wu5.b bVar = x0Var.f303415n;
        if (bVar != null) {
            bVar.b();
        }
        x0Var.f303406e.quit();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f160782w;
        if (-1 != i17) {
            boolean z17 = false;
            if (-1 != i17) {
                java.util.ArrayList arrayList = this.f160779t;
                com.tencent.mm.plugin.setting.ui.setting.yp ypVar = (com.tencent.mm.plugin.setting.ui.setting.yp) arrayList.get(i17);
                com.tencent.mm.storage.z3 z3Var = ypVar.f161800c;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
                if (n17.r2() || !z3Var.r2()) {
                    ypVar.f161800c = n17;
                } else {
                    arrayList.remove(this.f160782w);
                    z17 = true;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.setting.ui.setting.fq.f161047b++;
            }
            this.f160782w = -1;
        }
        this.f160783x.clear();
        com.tencent.mm.plugin.setting.ui.setting.xp xpVar = this.f160776q;
        if (xpVar != null) {
            xpVar.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.k2s), 1).show();
        }
        if (m1Var.getType() == 291) {
            V6(false);
            this.f160783x.clear();
            this.f160776q.notifyDataSetChanged();
        }
    }
}
