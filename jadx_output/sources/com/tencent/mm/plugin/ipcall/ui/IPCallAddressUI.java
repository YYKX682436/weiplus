package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class IPCallAddressUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f142537d;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f142539f;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.m0 f142538e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f142540g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f142541h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f142542i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f142543m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142544n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.IPCallNewXmlInfoChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI.1
        {
            this.__eventId = 682820784;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.IPCallNewXmlInfoChangeEvent iPCallNewXmlInfoChangeEvent) {
            com.tencent.mm.plugin.ipcall.ui.m0 m0Var = com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI.this.f142538e;
            if (m0Var == null) {
                return true;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.i0(m0Var));
            return true;
        }
    };

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f142545o = new com.tencent.mm.plugin.ipcall.ui.o0(this);

    public final void T6() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (a17) {
            s75.d.b(this.f142545o, "IPCallAddressUI_LoadSystemAddressBook");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blk;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f142540g == 1) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(new android.content.Intent(), this);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            c01.d9.b().p().x(u3Var, bool);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
            this.f142542i = false;
        }
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.n0(this));
        if (this.f142542i) {
            this.f142543m = true;
            T6();
        }
        com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_IPCALL_FIRST_IN_BOOLEAN;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.f142541h = ((java.lang.Boolean) p18.m(u3Var2, bool2)).booleanValue();
        setMMTitle(com.tencent.mm.R.string.g3s);
        this.f142537d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482732mc);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482754n3);
        this.f142539f = findViewById;
        android.widget.ListView listView = this.f142537d;
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = new com.tencent.mm.plugin.ipcall.ui.m0(this, listView, findViewById);
        this.f142538e = m0Var;
        m0Var.f142930b = new com.tencent.mm.plugin.ipcall.ui.j3(this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.tencent.mm.R.layout.blw, null);
        listView.addHeaderView(viewGroup, null, false);
        listView.setAdapter((android.widget.ListAdapter) m0Var.f142930b);
        m0Var.f142934f = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482390d9);
        m0Var.f142935g = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482406dq);
        m0Var.f142936h = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.f482382d1);
        m0Var.f142937i = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482383d2);
        m0Var.f142938j = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.oss);
        viewGroup.findViewById(com.tencent.mm.R.id.f482409ds).setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.d0(m0Var));
        viewGroup.findViewById(com.tencent.mm.R.id.cfm).setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.e0(m0Var));
        viewGroup.findViewById(com.tencent.mm.R.id.cyv).setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.f0(m0Var));
        listView.setOnItemClickListener(new com.tencent.mm.plugin.ipcall.ui.g0(m0Var));
        listView.setOnItemLongClickListener(new com.tencent.mm.plugin.ipcall.ui.h0(m0Var));
        if (((java.lang.Boolean) c01.d9.b().p().m(u3Var2, bool2)).booleanValue()) {
            com.tencent.mm.plugin.ipcall.model.k.a().d(true);
            c01.d9.b().p().x(u3Var2, bool);
        } else {
            com.tencent.mm.plugin.ipcall.model.k.a().d(false);
        }
        if (m0Var.f142930b.getCount() > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.j0(m0Var));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.i0(m0Var));
        m0Var.f142933e = true;
        c01.d9.e().a(257, this);
        this.f142544n.alive();
        this.f142540g = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 0L, 1L, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142538e;
        if (m0Var != null) {
            android.widget.ListView listView = m0Var.f142929a;
            listView.setOnItemClickListener(null);
            listView.setOnItemLongClickListener(null);
            com.tencent.mm.plugin.ipcall.ui.j3 j3Var = m0Var.f142930b;
            j3Var.getClass();
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().q(j3Var);
        }
        c01.d9.e().q(257, this);
        this.f142544n.dead();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 48 && iArr[0] != 0 && this.f142541h) {
            this.f142541h = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.ipcall.ui.p0(this), new com.tencent.mm.plugin.ipcall.ui.q0(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142538e;
        if (m0Var != null) {
            com.tencent.mm.plugin.ipcall.ui.j3 j3Var = m0Var.f142930b;
            if (j3Var != null && !m0Var.f142933e) {
                j3Var.notifyDataSetChanged();
                if (m0Var.f142930b.getCount() > 0) {
                    android.view.View view = m0Var.f142931c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = m0Var.f142931c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            m0Var.f142933e = false;
        }
        supportInvalidateOptionsMenu();
        if (r83.b.f393311b == null) {
            r83.b.f393311b = new r83.b();
        }
        r83.b.f393311b.a(true);
        if (this.f142543m) {
            return;
        }
        this.f142543m = true;
        T6();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var;
        if ((m1Var instanceof p83.g) && i17 == 0 && i18 == 0 && (m0Var = this.f142538e) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.j0(m0Var));
        }
    }
}
