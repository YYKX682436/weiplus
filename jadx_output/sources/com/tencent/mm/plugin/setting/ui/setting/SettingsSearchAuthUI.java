package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes8.dex */
public class SettingsSearchAuthUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f160633z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f160634d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f160635e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f160636f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160637g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160638h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f160639i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.rl f160641n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f160642o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160643p;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f160646s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f160640m = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f160644q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160645r = false;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f160647t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f160648u = -1;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f160649v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f160650w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f160651x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f160652y = false;

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI, java.lang.String str) {
        if (settingsSearchAuthUI.f160645r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        k14.e0 e0Var = new k14.e0(str, null, true);
        gm0.j1.d().g(e0Var);
        settingsSearchAuthUI.f160643p = str;
        settingsSearchAuthUI.f160645r = true;
        settingsSearchAuthUI.f160644q = java.lang.Integer.valueOf(e0Var.hashCode());
        android.view.View view = settingsSearchAuthUI.f160635e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsSearchAuthUI.f160639i.setVisibility(0);
        settingsSearchAuthUI.f160637g.setVisibility(8);
        settingsSearchAuthUI.f160638h.setVisibility(8);
        settingsSearchAuthUI.f160642o.setVisibility(8);
        ((java.util.ArrayList) settingsSearchAuthUI.f160640m).clear();
        settingsSearchAuthUI.removeAllOptionMenu();
        android.view.View view2 = settingsSearchAuthUI.f160647t;
        if (view2 != null) {
            settingsSearchAuthUI.f160642o.removeFooterView(view2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s, keyword: %s", settingsSearchAuthUI.f160644q, str);
    }

    public static void U6(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI, java.lang.String str, byte[] bArr) {
        if (settingsSearchAuthUI.f160645r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        k14.e0 e0Var = new k14.e0(str, bArr, true);
        gm0.j1.d().g(e0Var);
        settingsSearchAuthUI.f160643p = str;
        settingsSearchAuthUI.f160645r = true;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e0Var.hashCode());
        settingsSearchAuthUI.f160644q = valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s", valueOf);
    }

    public static void V6(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        android.view.View view = settingsSearchAuthUI.f160635e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsSearchAuthUI.f160637g.setText("");
        ((java.util.ArrayList) settingsSearchAuthUI.f160640m).clear();
        settingsSearchAuthUI.f160642o.setVisibility(8);
        settingsSearchAuthUI.f160643p = null;
        settingsSearchAuthUI.removeAllOptionMenu();
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "cancelSearch searchId: %s, searchingKeyWord: %s", this.f160644q, this.f160643p);
        this.f160645r = false;
        this.f160643p = null;
        if (this.f160644q != null) {
            gm0.j1.d().c(this.f160644q.intValue());
            this.f160644q = null;
        }
    }

    public final void X6() {
        android.view.View view = this.f160635e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f160637g.setVisibility(8);
        this.f160639i.setVisibility(8);
        this.f160638h.setVisibility(0);
        this.f160638h.setText(getResources().getString(com.tencent.mm.R.string.ipq));
        this.f160642o.setVisibility(8);
        ((java.util.ArrayList) this.f160640m).clear();
        removeAllOptionMenu();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477848d6);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cly;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f160634d = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f160642o = (android.widget.ListView) findViewById(com.tencent.mm.R.id.a8a);
        com.tencent.mm.plugin.setting.ui.setting.rl rlVar = new com.tencent.mm.plugin.setting.ui.setting.rl(this);
        this.f160641n = rlVar;
        this.f160642o.setAdapter((android.widget.ListAdapter) rlVar);
        this.f160635e = findViewById(com.tencent.mm.R.id.mfd);
        this.f160637g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mdf);
        this.f160638h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486771mf5);
        this.f160639i = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.met);
        removeAllOptionMenu();
        getSupportActionBar().y(this.f160634d);
        this.f160634d.setSearchViewListener(new com.tencent.mm.plugin.setting.ui.setting.kl(this));
        this.f160634d.getFtsEditText().g();
        this.f160634d.getFtsEditText().setFtsEditTextListener(new com.tencent.mm.plugin.setting.ui.setting.ll(this));
        this.f160634d.getFtsEditText().m();
        this.f160634d.getFtsEditText().t();
        this.f160637g.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ml(this));
        this.f160642o.setOnItemClickListener(new com.tencent.mm.plugin.setting.ui.setting.nl(this));
        this.f160642o.setOnScrollListener(new com.tencent.mm.plugin.setting.ui.setting.ol(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7j);
        this.f160636f = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.setting.ui.setting.pl(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        int i19;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1 && (list = this.f160640m) != null && this.f160641n != null && (i19 = this.f160648u) >= 0 && i19 < ((java.util.ArrayList) list).size()) {
            ((java.util.ArrayList) list).remove(this.f160648u);
            this.f160641n.notifyDataSetChanged();
            if (this.f160646s != null || ((java.util.ArrayList) list).size() > 1) {
                return;
            }
            X6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(ma1.m.CTRL_INDEX, this);
        gm0.j1.d().q(1127, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(ma1.m.CTRL_INDEX, this);
        gm0.j1.d().a(1127, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var != null ? m1Var.getType() : -1);
        objArr[4] = java.lang.Integer.valueOf(m1Var != null ? m1Var.hashCode() : -1);
        objArr[5] = this.f160644q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "errType %d, errCode %d, errMsg %s, type: %s, id: %s, currentSearchId: %s", objArr);
        if (m1Var != null && m1Var.hashCode() == this.f160644q.intValue()) {
            this.f160645r = false;
        }
        java.util.List list = this.f160640m;
        if (m1Var == null || i17 != 0 || i18 != 0) {
            if (m1Var != null && m1Var.getType() == 1169 && m1Var.hashCode() == this.f160644q.intValue()) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.isEmpty()) {
                    android.view.View view = this.f160635e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f160637g.setVisibility(8);
                    this.f160639i.setVisibility(8);
                    this.f160638h.setVisibility(0);
                    this.f160638h.setText(getResources().getString(com.tencent.mm.R.string.ipp));
                    this.f160642o.setVisibility(8);
                    arrayList.clear();
                    removeAllOptionMenu();
                    return;
                }
                if (this.f160649v != null) {
                    android.view.View view2 = this.f160650w;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f160651x;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var.getType() != 1169) {
            if (m1Var.getType() == 1127) {
                java.lang.String str2 = ((k14.w) m1Var).f303392e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return;
                }
                java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                if (!arrayList5.isEmpty()) {
                    java.util.Iterator it = arrayList5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((r45.ov6) it.next()).f382560d.equals(str2)) {
                            it.remove();
                            break;
                        }
                    }
                }
                this.f160641n.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (m1Var.hashCode() != this.f160644q.intValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingsSearchAuthUI", "search scene is cancelled and ignore, %s", java.lang.Integer.valueOf(m1Var.hashCode()));
            return;
        }
        k14.e0 e0Var = (k14.e0) m1Var;
        r45.px5 px5Var = e0Var.f303325f;
        this.f160646s = (px5Var == null || px5Var.f383466g != 1) ? null : px5Var.f383465f.g();
        if (!(e0Var.f303326g != null)) {
            ((java.util.ArrayList) list).clear();
        }
        r45.px5 px5Var2 = e0Var.f303325f;
        java.util.ArrayList arrayList6 = (java.util.ArrayList) list;
        arrayList6.addAll(px5Var2 != null ? px5Var2.f383464e : java.util.Collections.emptyList());
        if (arrayList6.isEmpty()) {
            X6();
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.rl rlVar = this.f160641n;
        rlVar.f161514d = list;
        rlVar.notifyDataSetChanged();
        android.view.View view4 = this.f160635e;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f160642o.setVisibility(0);
        removeAllOptionMenu();
        if (!arrayList6.isEmpty() && this.f160646s == null) {
            android.view.View view5 = this.f160649v;
            if (view5 != null) {
                this.f160652y = false;
                this.f160642o.removeFooterView(view5);
            }
            android.view.View view6 = this.f160647t;
            if (view6 != null) {
                this.f160642o.removeFooterView(view6);
            }
            if (this.f160647t == null) {
                this.f160647t = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bpa, (android.view.ViewGroup) null);
            }
            this.f160642o.addFooterView(this.f160647t);
        }
        if (arrayList6.isEmpty() || this.f160646s == null || this.f160652y) {
            return;
        }
        android.view.View view7 = this.f160647t;
        if (view7 != null) {
            this.f160642o.removeFooterView(view7);
        }
        this.f160652y = true;
        if (this.f160649v == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bp8, (android.view.ViewGroup) null);
            this.f160649v = inflate;
            this.f160650w = inflate.findViewById(com.tencent.mm.R.id.imd);
            android.view.View findViewById = this.f160649v.findViewById(com.tencent.mm.R.id.ime);
            this.f160651x = findViewById;
            findViewById.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.jl(this));
        }
        this.f160642o.addFooterView(this.f160649v);
    }
}
