package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public class SettingsTrustFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static int f160733n = 5;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f160734d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.GridView f160735e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.wn f160736f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160737g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f160738h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160739i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160740m;

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        if (((java.util.ArrayList) settingsTrustFriendUI.f160734d).size() > 0 && ((java.util.ArrayList) settingsTrustFriendUI.f160734d).size() < 3) {
            db5.e1.s(settingsTrustFriendUI, settingsTrustFriendUI.getString(com.tencent.mm.R.string.j07, 3), settingsTrustFriendUI.getString(com.tencent.mm.R.string.f490573yv));
            return;
        }
        k14.v vVar = new k14.v(settingsTrustFriendUI.f160734d);
        gm0.j1.d().g(vVar);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsTrustFriendUI.f160740m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        settingsTrustFriendUI.f160740m = db5.e1.Q(settingsTrustFriendUI, settingsTrustFriendUI.getString(com.tencent.mm.R.string.f490386tj), settingsTrustFriendUI.getString(com.tencent.mm.R.string.f490552yb), false, true, new com.tencent.mm.plugin.setting.ui.setting.jn(settingsTrustFriendUI, vVar));
    }

    public final void U6() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352277, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            arrayList = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
        }
        if (((java.util.ArrayList) this.f160734d).size() == arrayList.size() && this.f160734d.containsAll(arrayList)) {
            finish();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.i8_), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490547y6), getString(com.tencent.mm.R.string.f490504wy), true, new com.tencent.mm.plugin.setting.ui.setting.kn(this), new com.tencent.mm.plugin.setting.ui.setting.ln(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cmc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493098j04);
        this.f160735e = (android.widget.GridView) findViewById(com.tencent.mm.R.id.oju);
        this.f160736f = new com.tencent.mm.plugin.setting.ui.setting.wn(this, null);
        this.f160735e.setColumnWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479892i5));
        this.f160735e.setNumColumns(-1);
        this.f160735e.setStretchMode(1);
        this.f160735e.setHorizontalSpacing(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480533a26) * 2);
        this.f160735e.setVerticalSpacing(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a27));
        this.f160735e.setAdapter((android.widget.ListAdapter) this.f160736f);
        ((android.view.ViewGroup) this.f160735e.getParent()).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.on(this));
        this.f160735e.setOnTouchListener(new com.tencent.mm.plugin.setting.ui.setting.pn(this));
        this.f160735e.setHorizontalScrollBarEnabled(false);
        this.f160735e.setVerticalScrollBarEnabled(false);
        this.f160735e.setOnItemClickListener(new com.tencent.mm.plugin.setting.ui.setting.qn(this));
        this.f160737g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ojt);
        java.lang.String stringExtra = getIntent().getStringExtra("trust_friend_show_tips");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f160737g.setText(getResources().getString(com.tencent.mm.R.string.j08, 3));
        } else {
            this.f160737g.setText(stringExtra);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ojx);
        this.f160738h = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) this.f160738h.findViewById(com.tencent.mm.R.id.pfx)).setText(getString(com.tencent.mm.R.string.j07, 3));
        this.f160738h.findViewById(com.tencent.mm.R.id.close_icon).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.rn(this));
        findViewById(com.tencent.mm.R.id.ojv).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.sn(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.tn(this));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.un(this), null, com.tencent.mm.ui.fb.GREEN);
        showOptionMenu(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            ((java.util.ArrayList) this.f160734d).clear();
            ((java.util.ArrayList) this.f160734d).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
            this.f160736f.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352277, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f160734d = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
        }
        if (this.f160734d == null) {
            this.f160734d = new java.util.ArrayList();
        }
        getContentView().post(new com.tencent.mm.plugin.setting.ui.setting.mn(this));
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160740m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            db5.e1.T(this, str);
            return;
        }
        if (m1Var.getType() != 869) {
            if (m1Var.getType() == 583) {
                gm0.j1.u().c().w(352277, com.tencent.mm.sdk.platformtools.t8.c1(this.f160734d, ","));
                finish();
                return;
            }
            return;
        }
        r45.mp3 mp3Var = (r45.mp3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
        f160733n = mp3Var.f380727e;
        java.util.LinkedList linkedList = mp3Var.f380726d;
        boolean z17 = true;
        if (linkedList.size() == ((java.util.ArrayList) this.f160734d).size()) {
            if (linkedList.size() != 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((java.util.ArrayList) this.f160734d).contains(((r45.fq6) it.next()).f374554d)) {
                        break;
                    }
                }
            }
            z17 = false;
        }
        if (z17) {
            ((java.util.ArrayList) this.f160734d).clear();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((java.util.ArrayList) this.f160734d).add(((r45.fq6) it6.next()).f374554d);
            }
            this.f160736f.notifyDataSetChanged();
        }
        if (((java.util.ArrayList) this.f160734d).size() > 0 && ((java.util.ArrayList) this.f160734d).size() < 3) {
            android.view.View view = this.f160738h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.u().c().w(352277, com.tencent.mm.sdk.platformtools.t8.c1(this.f160734d, ","));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        gm0.j1.d().a(869, this);
        gm0.j1.d().a(583, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(869, this);
        gm0.j1.d().q(583, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(n14.g.class);
    }
}
