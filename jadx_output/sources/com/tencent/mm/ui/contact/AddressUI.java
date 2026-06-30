package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class AddressUI extends androidx.fragment.app.FragmentActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragment f206305d;

    /* loaded from: classes11.dex */
    public static class AddressUIFragment extends com.tencent.mm.ui.contact.address.BaseAddressUIFragment {
        public static final /* synthetic */ int Y = 0;
        public com.tencent.mm.ui.contact.g0 A;
        public com.tencent.mm.ui.contact.g0 B;
        public com.tencent.mm.ui.contact.g0 C;
        public com.tencent.mm.ui.contact.g0 D;
        public com.tencent.mm.ui.contact.ContactCountView E;
        public com.tencent.mm.ui.contact.g8 F;
        public com.tencent.mm.ui.contact.q3 G;
        public rl5.r H;
        public int I;

        /* renamed from: J, reason: collision with root package name */
        public int f206306J;
        public boolean K;
        public android.widget.LinearLayout M;
        public android.view.animation.Animation Q;
        public android.view.animation.Animation R;

        /* renamed from: o, reason: collision with root package name */
        public android.widget.ListView f206307o;

        /* renamed from: p, reason: collision with root package name */
        public android.widget.TextView f206308p;

        /* renamed from: q, reason: collision with root package name */
        public com.tencent.mm.ui.contact.e f206309q;

        /* renamed from: r, reason: collision with root package name */
        public yk5.u f206310r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f206311s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f206312t;

        /* renamed from: v, reason: collision with root package name */
        public int f206314v;

        /* renamed from: w, reason: collision with root package name */
        public com.tencent.mm.ui.base.AlphabetScrollBar f206315w;

        /* renamed from: y, reason: collision with root package name */
        public com.tencent.mm.ui.contact.a4 f206317y;

        /* renamed from: z, reason: collision with root package name */
        public com.tencent.mm.ui.contact.BizContactEntranceView f206318z;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f206313u = "";

        /* renamed from: x, reason: collision with root package name */
        public boolean f206316x = false;
        public boolean L = true;
        public final tf5.l0 N = new tf5.l0();
        public final com.tencent.mm.sdk.event.IListener P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsShowStoryHeadViewEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.1
            {
                this.__eventId = 1693113157;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsShowStoryHeadViewEvent snsShowStoryHeadViewEvent) {
                com.tencent.mm.autogen.events.SnsShowStoryHeadViewEvent snsShowStoryHeadViewEvent2 = snsShowStoryHeadViewEvent;
                com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.this;
                if (addressUIFragment.getContext() == null || addressUIFragment.getContext().isFinishing()) {
                    return false;
                }
                snsShowStoryHeadViewEvent2.f54840g.getClass();
                if (addressUIFragment.f206309q == null) {
                    return false;
                }
                ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FavourUserChecker", "setFavourStoryRead:%s", java.lang.Integer.valueOf(ef4.i.f252447b));
                if (ef4.i.f252447b != 0) {
                    ef4.i.f252447b = 2;
                }
                addressUIFragment.f206309q.notifyDataSetChanged();
                return false;
            }
        };
        public final db5.t4 S = new com.tencent.mm.ui.contact.k(this);
        public final db5.o9 T = new com.tencent.mm.ui.contact.l(this);
        public final com.tencent.mm.pluginsdk.ui.b0 U = new com.tencent.mm.pluginsdk.ui.b0(new com.tencent.mm.ui.contact.m(this));
        public java.util.List V = new java.util.LinkedList();
        public java.util.List W = new java.util.LinkedList();
        public final java.lang.Runnable X = new com.tencent.mm.ui.contact.t(this);

        public static void y0(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment, java.lang.String str, boolean z17) {
            addressUIFragment.getClass();
            ((l75.a1) c01.d9.b().q()).e(addressUIFragment.f206309q);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            n17.s3();
            c01.e2.g0(n17, true);
            if (com.tencent.mm.storage.z3.R4(str)) {
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).k(str);
                ((com.tencent.mm.storage.b3) c01.d9.b().l()).y0(str);
            } else {
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
            }
            com.tencent.mm.ui.contact.e eVar = addressUIFragment.f206309q;
            eVar.S.add(str);
            eVar.n(str, 5);
            ((l75.a1) c01.d9.b().q()).a(addressUIFragment.f206309q);
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
        public void B() {
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
        public void V() {
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
        public void e0() {
            com.tencent.mm.ui.contact.e eVar = this.f206309q;
            if (eVar != null) {
                eVar.P.clear();
                eVar.M.clear();
                eVar.N = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "KEVIN Address turnTobg");
            com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206318z;
            if (bizContactEntranceView != null) {
                bizContactEntranceView.destroyDrawingCache();
            }
            com.tencent.mm.ui.contact.g0 g0Var = this.A;
            if (g0Var != null) {
                g0Var.destroyDrawingCache();
            }
            com.tencent.mm.ui.contact.g0 g0Var2 = this.C;
            if (g0Var2 != null) {
                g0Var2.destroyDrawingCache();
            }
            com.tencent.mm.ui.contact.g0 g0Var3 = this.D;
            if (g0Var3 != null) {
                g0Var3.destroyDrawingCache();
            }
            com.tencent.mm.ui.contact.ContactCountView contactCountView = this.E;
            if (contactCountView != null) {
                contactCountView.destroyDrawingCache();
            }
            com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
            if (a4Var != null) {
                a4Var.destroyDrawingCache();
            }
        }

        @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.f487985db;
        }

        @Override // com.tencent.mm.ui.MMFragment
        public android.view.View getLayoutView() {
            return android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f487985db, (android.view.ViewGroup) null);
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void l0(android.os.Bundle bundle) {
            tf5.l0 l0Var = this.N;
            l0Var.getClass();
            l0Var.f419000a = c01.id.c();
            l0Var.f419001b = "MvvmAddressUI";
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            l0Var.f419002c = uuid;
            this.f206316x = false;
            this.f206312t = null;
            this.f206311s = "@all.contact.without.chatroom.without.openim";
            this.f206312t = getStringExtra("Contact_GroupFilter_Str");
            getString(com.tencent.mm.R.string.ftj);
            this.f206314v = getIntExtra("List_Type", 2);
            x0();
            getResources().getDisplayMetrics();
            android.widget.ListView listView = this.f206307o;
            if (listView != null) {
                com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
                if (a4Var != null) {
                    listView.removeHeaderView(a4Var);
                }
                com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206318z;
                if (bizContactEntranceView != null) {
                    this.f206307o.removeHeaderView(bizContactEntranceView);
                }
                com.tencent.mm.ui.contact.g0 g0Var = this.A;
                if (g0Var != null) {
                    this.f206307o.removeHeaderView(g0Var);
                }
                com.tencent.mm.ui.contact.g0 g0Var2 = this.D;
                if (g0Var2 != null) {
                    this.f206307o.removeHeaderView(g0Var2);
                }
                com.tencent.mm.ui.contact.g0 g0Var3 = this.C;
                if (g0Var3 != null) {
                    this.f206307o.removeHeaderView(g0Var3);
                }
            }
            android.widget.ListView listView2 = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
            this.f206307o = listView2;
            listView2.setScrollingCacheEnabled(false);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484222df4);
            this.f206308p = textView;
            textView.setText(com.tencent.mm.R.string.f489897et);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6)).setText(com.tencent.mm.R.string.f489899ev);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dgv)).setOnClickListener(new com.tencent.mm.ui.contact.v(this));
            this.f206309q = new com.tencent.mm.ui.contact.e(getContext(), this.f206311s, this.f206312t, this.f206314v, true);
            this.f206307o.setAdapter((android.widget.ListAdapter) null);
            com.tencent.mm.ui.contact.e eVar = this.f206309q;
            eVar.f209022i = new com.tencent.mm.ui.contact.w(this);
            eVar.K = true;
            eVar.F = this;
            eVar.D = new com.tencent.mm.ui.contact.x(this);
            eVar.C = new com.tencent.mm.ui.contact.y(this);
            yk5.u uVar = new yk5.u(getContext(), 1);
            this.f206310r = uVar;
            uVar.x(new yk5.n(uVar, true));
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            this.M = linearLayout;
            linearLayout.setOrientation(1);
            this.f206307o.addHeaderView(this.M);
            com.tencent.mm.ui.contact.g0 g0Var4 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.ContactIpCall);
            this.B = g0Var4;
            this.M.addView(g0Var4);
            ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
            this.B.setVisible(false);
            com.tencent.mm.ui.contact.a4 a4Var2 = new com.tencent.mm.ui.contact.a4(getContext());
            this.f206317y = a4Var2;
            this.M.addView(a4Var2);
            com.tencent.mm.ui.contact.g0 g0Var5 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.OnlyChat);
            this.D = g0Var5;
            this.M.addView(g0Var5);
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, false);
            if (!o17) {
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.ui.contact.a0(this));
            }
            this.D.setVisible(o17);
            com.tencent.mm.ui.contact.g0 g0Var6 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.Chatromm);
            this.A = g0Var6;
            this.M.addView(g0Var6);
            this.A.setVisible(true);
            com.tencent.mm.ui.contact.g0 g0Var7 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.ContactLabel);
            this.C = g0Var7;
            this.M.addView(g0Var7);
            this.C.setVisible(true);
            android.widget.ListView listView3 = this.f206307o;
            com.tencent.mm.ui.contact.ContactCountView contactCountView = new com.tencent.mm.ui.contact.ContactCountView(getContext());
            this.E = contactCountView;
            listView3.addFooterView(contactCountView, null, false);
            j45.l.g("brandservice");
            com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = new com.tencent.mm.ui.contact.BizContactEntranceView(getContext(), 251658241);
            this.f206318z = bizContactEntranceView2;
            this.M.addView(bizContactEntranceView2);
            this.f206318z.setVisible(true);
            com.tencent.mm.ui.contact.b0 b0Var = new com.tencent.mm.ui.contact.b0(this);
            com.tencent.mm.ui.contact.g8 g8Var = new com.tencent.mm.ui.contact.g8(getContext(), new com.tencent.mm.ui.contact.c0(this));
            this.F = g8Var;
            g8Var.setOnVisibilityChangeListener(b0Var);
            if (this.F.getOpenIMCount() <= 0) {
                b0Var.a(false);
                this.F.setVisibility(8);
            } else {
                b0Var.a(true);
            }
            this.M.addView(this.F);
            com.tencent.mm.ui.contact.q3 q3Var = new com.tencent.mm.ui.contact.q3(getContext(), new com.tencent.mm.ui.contact.f(this));
            this.G = q3Var;
            if (q3Var.getEnterpriseFriendCount() <= 0) {
                this.G.setVisibility(8);
            }
            this.M.addView(this.G);
            this.H = new rl5.r(getContext());
            this.f206309q.getClass();
            this.f206307o.setOnItemClickListener(new com.tencent.mm.ui.contact.g(this));
            this.f206307o.setOnItemLongClickListener(new com.tencent.mm.ui.contact.h(this));
            this.f206307o.setOnTouchListener(new com.tencent.mm.ui.contact.i(this));
            this.f206307o.setOnScrollListener(this.U);
            this.f206307o.setDrawingCacheEnabled(false);
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = (com.tencent.mm.ui.base.AlphabetScrollBar) findViewById(com.tencent.mm.R.id.f482748mx);
            this.f206315w = alphabetScrollBar;
            alphabetScrollBar.setOnScrollBarTouchListener(this.T);
            ((l75.a1) c01.d9.b().q()).a(this.f206309q);
            if (this.G != null) {
                r01.x cj6 = r01.q3.cj();
                cj6.f368272d.a(this.G, null);
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void m0() {
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = this.f206315w;
            if (alphabetScrollBar != null) {
                alphabetScrollBar.f197714q = null;
            }
            com.tencent.mm.ui.contact.e eVar = this.f206309q;
            if (eVar != null) {
                eVar.d(true);
                this.f206309q.getClass();
                this.f206309q.f209022i = null;
            }
            yk5.u uVar = this.f206310r;
            if (uVar != null) {
                bb5.g gVar = uVar.f462916z;
                if (gVar != null) {
                    gVar.a();
                    uVar.f462916z = null;
                }
                this.f206310r.c();
            }
            if (gm0.j1.a() && this.f206309q != null) {
                ((l75.a1) c01.d9.b().q()).e(this.f206309q);
            }
            if (gm0.j1.a() && this.G != null) {
                r01.x cj6 = r01.q3.cj();
                com.tencent.mm.ui.contact.q3 q3Var = this.G;
                l75.v0 v0Var = cj6.f368272d;
                if (v0Var != null) {
                    v0Var.j(q3Var);
                }
            }
            com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
            if (a4Var != null) {
                if (gm0.j1.a()) {
                    r21.w.wi().remove(a4Var.f206585i);
                }
                this.f206317y = null;
            }
            if (this.f206318z != null) {
                this.f206318z = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.D != null) {
                this.D = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            if (this.G != null) {
                this.G = null;
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void n0() {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "AddressUI on Pause");
            c01.d9.b().p().w(340226, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c01.d9.b().p().w(12296, java.lang.Boolean.valueOf(this.f206316x));
            yk5.u uVar = this.f206310r;
            if (uVar != null) {
                c01.d9.e().q(106, uVar);
            }
            this.f206309q.E.b();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.u(this));
            com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
            if (a4Var != null) {
                a4Var.setFrontGround(false);
            }
            com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) getContext();
            if (launcherUI != null) {
                com.tencent.mm.ui.HomeUI homeUI = launcherUI.getHomeUI();
                homeUI.T.remove(this.X);
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void o0() {
            if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(340226, null), 0L) >= 180000) {
                u0();
            }
            if (this.L) {
                this.L = false;
                this.K = false;
                z0();
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.q(this));
            } else if (this.K) {
                this.K = false;
                s75.d.c(new com.tencent.mm.ui.contact.r(this), "AddressUI_updateUIData", 4);
                this.E.a();
            }
            com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206318z;
            if (bizContactEntranceView != null) {
                bizContactEntranceView.b(true);
            }
            com.tencent.mm.ui.contact.q3 q3Var = this.G;
            if (q3Var != null) {
                if (q3Var.getEnterpriseFriendCount() <= 0) {
                    this.G.setVisibility(8);
                } else {
                    this.G.setVisibility(0);
                }
            }
            this.f206316x = ((java.lang.Boolean) c01.d9.b().p().l(12296, java.lang.Boolean.FALSE)).booleanValue();
            if (this.f206314v == 2) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(c01.z1.r(), true);
                if (n17 != null && (!n17.r2() || !com.tencent.mm.sdk.platformtools.t8.K0(n17.w0()) || !com.tencent.mm.sdk.platformtools.t8.K0(n17.y0()) || !com.tencent.mm.sdk.platformtools.t8.K0(n17.z0()))) {
                    n17.N2();
                    n17.n1("");
                    n17.o1("");
                    n17.p1("");
                    ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(c01.z1.r(), n17);
                }
            }
            yk5.u uVar = this.f206310r;
            if (uVar != null) {
                c01.d9.e().a(106, uVar);
            }
            this.f206309q.f209025o = false;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.s(this));
            com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
            if (a4Var != null) {
                a4Var.setFrontGround(true);
                this.f206317y.b();
            }
            com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) getContext();
            if (launcherUI != null) {
                com.tencent.mm.ui.HomeUI homeUI = launcherUI.getHomeUI();
                java.lang.Runnable runnable = this.X;
                java.util.LinkedList linkedList = homeUI.T;
                if (linkedList.contains(runnable)) {
                    return;
                }
                linkedList.add(runnable);
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "onAcvityResult requestCode: %d", java.lang.Integer.valueOf(i17));
            if (i17 == 6 && i18 == -1) {
                setResult(-1);
                finish();
            } else if (i18 == -1 && i17 == 4) {
                setResult(-1, intent);
                finish();
            }
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            this.P.alive();
        }

        @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f206313u, true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddressUI", "onCreateContextMenu, contact is null, username = " + this.f206313u);
                return;
            }
            if (c01.z1.r().equals(n17.d1())) {
                return;
            }
            if (c01.e2.M(this.f206313u)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = view.getContext();
                java.lang.String g27 = n17.g2();
                ((ke0.e) xVar).getClass();
                contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, g27));
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.tencent.mm.R.string.f489894eq);
                return;
            }
            if (com.tencent.mm.storage.z3.z4(this.f206313u) || com.tencent.mm.storage.z3.R3(this.f206313u)) {
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

        @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            this.P.dead();
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void p0() {
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void q0() {
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
        public void r() {
            com.tencent.mm.ui.contact.a4 a4Var = this.f206317y;
            if (a4Var != null) {
                a4Var.b();
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
        public void r0() {
            android.widget.ListView listView = this.f206307o;
            if (listView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(listView);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "requestToTop", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "requestToTop", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
        public java.lang.String s0() {
            return "MicroMsg.AddressUI";
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
        public void u0() {
            android.widget.ListView listView = this.f206307o;
            if (listView != null) {
                listView.setSelection(0);
            }
        }

        @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
        public void w0(boolean z17) {
            if (this.f206315w != null) {
                if (this.Q == null) {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477778b7);
                    this.Q = loadAnimation;
                    loadAnimation.setDuration(200L);
                }
                if (this.R == null) {
                    android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477778b7);
                    this.R = loadAnimation2;
                    loadAnimation2.setDuration(200L);
                }
                if (z17) {
                    if (this.f206315w.getVisibility() != 0) {
                        this.f206315w.setVisibility(0);
                        this.f206315w.startAnimation(this.Q);
                        return;
                    }
                    return;
                }
                if (4 != this.f206315w.getVisibility()) {
                    this.f206315w.setVisibility(8);
                    this.f206315w.startAnimation(this.R);
                }
            }
        }

        public final void z0() {
            this.V = new java.util.LinkedList();
            this.W = new java.util.LinkedList();
            ((java.util.LinkedList) this.V).add("tmessage");
            ((java.util.LinkedList) this.W).addAll(this.V);
            if (!((java.util.LinkedList) this.V).contains("officialaccounts")) {
                ((java.util.LinkedList) this.V).add("officialaccounts");
            }
            ((java.util.LinkedList) this.V).add("helper_entry");
            com.tencent.mm.ui.contact.e eVar = this.f206309q;
            if (eVar != null) {
                eVar.C(this.V);
            }
            yk5.u uVar = this.f206310r;
            if (uVar != null) {
                uVar.x(new yk5.m(uVar, this.W));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
            com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = new com.tencent.mm.ui.contact.AddressUI.AddressUIFragment();
            this.f206305d = addressUIFragment;
            addressUIFragment.setArguments(getIntent().getExtras());
            androidx.fragment.app.i2 beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.h(android.R.id.content, this.f206305d, null, 1);
            beginTransaction.d();
        }
        jx3.f.INSTANCE.idkeyStat(1728L, 2L, 1L, false);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
