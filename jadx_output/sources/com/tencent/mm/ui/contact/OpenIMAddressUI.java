package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class OpenIMAddressUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragment f206516d;

    /* loaded from: classes11.dex */
    public static class OpenIMAddressUIFragment extends com.tencent.mm.ui.MMFragment implements com.tencent.mm.modelbase.u0 {

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ int f206517v = 0;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f206518d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.ListView f206519e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.ui.contact.b8 f206520f;

        /* renamed from: g, reason: collision with root package name */
        public yk5.u f206521g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f206522h;

        /* renamed from: i, reason: collision with root package name */
        public al5.y1 f206523i;

        /* renamed from: m, reason: collision with root package name */
        public int f206524m;

        /* renamed from: n, reason: collision with root package name */
        public int f206525n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f206526o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f206527p;

        /* renamed from: q, reason: collision with root package name */
        public final java.lang.Runnable f206528q;

        /* renamed from: r, reason: collision with root package name */
        public final db5.t4 f206529r;

        /* renamed from: s, reason: collision with root package name */
        public final com.tencent.mm.pluginsdk.ui.b0 f206530s;

        /* renamed from: t, reason: collision with root package name */
        public java.util.List f206531t;

        /* renamed from: u, reason: collision with root package name */
        public java.util.List f206532u;

        public OpenIMAddressUIFragment() {
            super(true);
            this.f206518d = "";
            this.f206522h = "";
            this.f206527p = true;
            this.f206528q = new com.tencent.mm.ui.contact.a8(this);
            this.f206529r = new com.tencent.mm.ui.contact.l7(this);
            this.f206530s = new com.tencent.mm.pluginsdk.ui.b0(new com.tencent.mm.ui.contact.m7(this));
            this.f206531t = new java.util.LinkedList();
            this.f206532u = new java.util.LinkedList();
        }

        public static void l0(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment, java.lang.String str, boolean z17) {
            openIMAddressUIFragment.getClass();
            ((l75.a1) c01.d9.b().q()).e(openIMAddressUIFragment.f206520f);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            n17.s3();
            c01.e2.g0(n17, true);
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
            com.tencent.mm.ui.contact.b8 b8Var = openIMAddressUIFragment.f206520f;
            b8Var.S.add(str);
            b8Var.n(str, 5);
            ((l75.a1) c01.d9.b().q()).a(openIMAddressUIFragment.f206520f);
        }

        @Override // com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.c8o;
        }

        @Override // com.tencent.mm.ui.MMFragment
        public android.view.View getLayoutView() {
            return android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c8o, (android.view.ViewGroup) null);
        }

        public final void m0() {
            this.f206531t = new java.util.LinkedList();
            this.f206532u = new java.util.LinkedList();
            ((java.util.LinkedList) this.f206531t).add("tmessage");
            ((java.util.LinkedList) this.f206532u).addAll(this.f206531t);
            if (!((java.util.LinkedList) this.f206531t).contains("officialaccounts")) {
                ((java.util.LinkedList) this.f206531t).add("officialaccounts");
            }
            ((java.util.LinkedList) this.f206531t).add("helper_entry");
            com.tencent.mm.ui.contact.b8 b8Var = this.f206520f;
            if (b8Var != null) {
                b8Var.C(this.f206531t);
            }
            yk5.u uVar = this.f206521g;
            if (uVar != null) {
                uVar.x(new yk5.m(uVar, this.f206532u));
            }
        }

        public final synchronized void n0() {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            m0();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "KEVIN updateBlockList() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (this.f206520f != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.n7(this));
            }
            if (this.f206521g != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.o7(this));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "KEVIN doRefresh() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            super.onActivityCreated(bundle);
            c01.d9.e().a(138, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.a(453, this);
            this.f206518d = getStringExtra("key_openim_acctype_id");
            setMMTitle(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(this.f206518d, "openim_acct_type_title", j41.a0.TYPE_WORDING));
            setBackBtn(new com.tencent.mm.ui.contact.t7(this));
            setTitleBarDoubleClickListener(this.f206528q);
            getResources().getDisplayMetrics();
            android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
            this.f206519e = listView;
            listView.setScrollingCacheEnabled(false);
            com.tencent.mm.ui.contact.b8 b8Var = new com.tencent.mm.ui.contact.b8(getContext(), "@openim.contact", null, 2, true, this.f206518d);
            this.f206520f = b8Var;
            b8Var.f209022i = new com.tencent.mm.ui.contact.u7(this);
            b8Var.K = true;
            b8Var.V = this;
            b8Var.D = new com.tencent.mm.ui.contact.v7(this);
            b8Var.C = new com.tencent.mm.ui.contact.w7(this);
            yk5.u uVar = new yk5.u(getContext(), 1);
            this.f206521g = uVar;
            uVar.x(new yk5.n(uVar, true));
            this.f206523i = new al5.y1(getContext());
            this.f206519e.setOnItemClickListener(new com.tencent.mm.ui.contact.x7(this));
            this.f206519e.setOnItemLongClickListener(new com.tencent.mm.ui.contact.y7(this));
            this.f206519e.setOnTouchListener(new com.tencent.mm.ui.contact.z7(this));
            this.f206519e.setOnScrollListener(this.f206530s);
            this.f206519e.setDrawingCacheEnabled(false);
            ((l75.a1) c01.d9.b().q()).a(this.f206520f);
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenIMAddressUI)).Rj(this, iy1.a.WorkWxContacts);
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "onAcvityResult requestCode: %d", java.lang.Integer.valueOf(i17));
            if (i17 == 6 && i18 == -1) {
                setResult(-1);
                finish();
            } else if (i18 == -1 && i17 == 4) {
                setResult(-1, intent);
                finish();
            }
        }

        @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f206522h, true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMAddressUI", "onCreateContextMenu, contact is null, username = " + this.f206522h);
                return;
            }
            if (c01.z1.r().equals(n17.d1())) {
                return;
            }
            if (c01.e2.M(this.f206522h)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = view.getContext();
                java.lang.String g27 = n17.g2();
                ((ke0.e) xVar).getClass();
                contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, g27));
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.tencent.mm.R.string.f489894eq);
                return;
            }
            if (com.tencent.mm.storage.z3.z4(this.f206522h) || com.tencent.mm.storage.z3.R3(this.f206522h)) {
                return;
            }
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = view.getContext();
            java.lang.String g28 = n17.g2();
            ((ke0.e) xVar2).getClass();
            contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, g28));
            if (!n17.r2() || n17.F0() == 1) {
                return;
            }
            contextMenu.add(adapterContextMenuInfo.position, 7, 0, com.tencent.mm.R.string.bf9);
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            c01.d9.e().q(138, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.q(453, this);
            com.tencent.mm.ui.contact.b8 b8Var = this.f206520f;
            if (b8Var != null) {
                b8Var.d(true);
                this.f206520f.getClass();
                this.f206520f.f209022i = null;
            }
            yk5.u uVar = this.f206521g;
            if (uVar != null) {
                bb5.g gVar = uVar.f462916z;
                if (gVar != null) {
                    gVar.a();
                    uVar.f462916z = null;
                }
                this.f206521g.c();
            }
            if (!gm0.j1.a() || this.f206520f == null) {
                return;
            }
            ((l75.a1) c01.d9.b().q()).e(this.f206520f);
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            super.onPause();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "AddressUI on Pause");
            yk5.u uVar = this.f206521g;
            if (uVar != null) {
                c01.d9.e().q(106, uVar);
            }
            this.f206520f.E.b();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.s7(this));
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            if (this.f206527p) {
                this.f206527p = false;
                this.f206526o = false;
                m0();
                this.f206519e.setAdapter((android.widget.ListAdapter) this.f206520f);
                this.f206519e.post(new com.tencent.mm.ui.contact.p7(this));
                this.f206521g.y(false);
            } else if (this.f206526o) {
                this.f206526o = false;
                s75.d.c(new com.tencent.mm.ui.contact.q7(this), "AddressUI_updateUIData", 4);
            }
            yk5.u uVar = this.f206521g;
            if (uVar != null) {
                c01.d9.e().a(106, uVar);
            }
            this.f206520f.f209025o = false;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.r7(this));
        }

        @Override // com.tencent.mm.modelbase.u0
        public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
            if (m1Var.getType() != 453) {
                if (com.tencent.mm.sdk.platformtools.t8.U0(getContext())) {
                    com.tencent.mm.ui.pc.a(getContext(), i17, i18, str, 4);
                }
            } else if (i17 == 0 && i18 == 0 && !((r45.ik3) ((l41.z) m1Var).f315972e.f70711b.f70700a).f377109f.isEmpty()) {
                n0();
            }
        }

        @Override // com.tencent.mm.ui.MMFragment
        public boolean supportNavigationSwipeBack() {
            return false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c8k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
            com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = new com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment();
            this.f206516d = openIMAddressUIFragment;
            openIMAddressUIFragment.setArguments(getIntent().getExtras());
            androidx.fragment.app.i2 beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.h(com.tencent.mm.R.id.f485345hd4, this.f206516d, null, 1);
            beginTransaction.d();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenIMAddressUI)).Rj(this, iy1.a.WorkWxContacts);
    }
}
