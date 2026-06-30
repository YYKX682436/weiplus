package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostAtUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/qb", "com/tencent/mm/plugin/finder/ui/rb", "com/tencent/mm/plugin/finder/ui/sb", "com/tencent/mm/plugin/finder/ui/ac", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostAtUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public com.tencent.mm.view.RefreshLoadMoreLayout B;
    public androidx.recyclerview.widget.RecyclerView C;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f128647w;

    /* renamed from: y, reason: collision with root package name */
    public int f128649y;

    /* renamed from: z, reason: collision with root package name */
    public long f128650z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f128644t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f128645u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final bu2.o f128646v = new bu2.o("followList.fp");

    /* renamed from: x, reason: collision with root package name */
    public boolean f128648x = true;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b5k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 20000 && intent != null && i18 == -1) {
            getIntent().putExtra("key_select_contact", intent.getByteArrayExtra("at_select_contact"));
            getIntent().putExtra("key_source", intent.getBooleanExtra("is_follow", false) ? 3 : 4);
            setResult(-1, getIntent());
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ya2.b2 b2Var;
        super.onCreate(bundle);
        gm0.j1.d().a(713, this);
        this.f128649y = getIntent().getIntExtra("KEY_ENTER_SCENE", 0);
        this.f128650z = getIntent().getLongExtra("key_finder_object_id", 0L);
        this.A = getIntent().getIntExtra("key_remind_finder_half_screen_source", 0);
        java.util.LinkedList Xk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Xk();
        if (Xk != null) {
            java.util.Collections.sort(Xk, com.tencent.mm.plugin.finder.ui.ec.f129100d);
            java.util.Iterator it = Xk.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var == null) {
                    b2Var = null;
                } else {
                    b2Var = new ya2.b2();
                    b2Var.field_username = gb4Var.getString(0);
                    b2Var.field_nickname = gb4Var.getString(2);
                    java.lang.String string = gb4Var.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    b2Var.field_avatarUrl = string;
                    b2Var.field_authInfo = (com.tencent.mm.protocal.protobuf.FinderAuthInfo) gb4Var.getCustom(3);
                    b2Var.field_user_flag = gb4Var.getInteger(7);
                }
                if (b2Var != null) {
                    this.f128645u.add(b2Var);
                }
            }
        }
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.T(pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.ui.fc(this)), new com.tencent.mm.plugin.finder.ui.gc(this));
        gm0.j1.d().g(new db2.o5(this.f128647w));
        setResult(0, getIntent());
        if (this.f128649y == 1) {
            setMMTitle(getResources().getString(com.tencent.mm.R.string.f491989ev3));
        } else {
            setMMTitle(getResources().getString(com.tencent.mm.R.string.f491988ev2));
        }
        if (lk5.s.b(this)) {
            hideTitleView();
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.qkl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qkm);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            findViewById(com.tencent.mm.R.id.lth).setOnClickListener(new com.tencent.mm.plugin.finder.ui.bc(this));
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.r0b);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(findViewById2, "remind_finder_half_screen");
            dy1.r ik6 = aVar.ik(findViewById2, 32, 25496);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
            lVarArr[2] = new jz5.l("remind_finder_half_screen_source", java.lang.Integer.valueOf(this.A));
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
            ((cy1.a) ik6).gk(findViewById2, kz5.c1.k(lVarArr));
        }
        setBackBtn(new com.tencent.mm.plugin.finder.ui.cc(this));
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById3;
        this.B = refreshLoadMoreLayout;
        this.C = refreshLoadMoreLayout.getRecyclerView();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.C;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.plugin.finder.ui.ac(this));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.C;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.C;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.C;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView5.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.tencent.mm.plugin.finder.ui.ac) adapter).notifyDataSetChanged();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.B;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.B;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.B;
        if (refreshLoadMoreLayout4 != null) {
            refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.ui.dc(this));
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(713, this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        if (((com.tencent.mm.plugin.finder.ui.ac) adapter).f128857d) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.C;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
        kotlin.jvm.internal.o.e(adapter2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.tencent.mm.plugin.finder.ui.ac) adapter2).f128857d = true;
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.C;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter3 = recyclerView3.getAdapter();
        kotlin.jvm.internal.o.e(adapter3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.tencent.mm.plugin.finder.ui.ac) adapter3).notifyItemInserted(0);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.ui.hc hcVar = new com.tencent.mm.plugin.finder.ui.hc(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(hcVar, 300L, false);
        if (lk5.s.b(this)) {
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.C;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView4, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "onResume", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView4, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "onResume", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(" scene type ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostAtUI", sb6.toString());
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 713 && i17 == 0 && i18 == 0) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
            db2.o5 o5Var = (db2.o5) m1Var;
            com.tencent.mm.protobuf.f fVar = o5Var.f228106g.f70710a.f70684a;
            r45.k61 k61Var = fVar instanceof r45.k61 ? (r45.k61) fVar : null;
            if (!kotlin.jvm.internal.o.b(this.f128647w, k61Var != null ? k61Var.getByteString(1) : null)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPostAtUI", "not my buf, ignore!");
                return;
            }
            if (this.f128647w == null) {
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.ui.ic(this, m1Var));
                z17 = true;
            } else {
                z17 = false;
            }
            com.tencent.mm.protobuf.f fVar2 = o5Var.f228106g.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            this.f128648x = ((r45.l61) fVar2).getInteger(3) != 0;
            this.f128647w = o5Var.L();
            java.util.LinkedList K = o5Var.K();
            com.tencent.mars.xlog.Log.i("Finder.FinderPostAtUI", "firstPage " + z17 + ", get follow contact " + K.size());
            java.util.ArrayList arrayList = this.f128644t;
            if (z17) {
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(K, 10));
            java.util.Iterator it = K.iterator();
            while (it.hasNext()) {
                arrayList2.add(ya2.d.h((com.tencent.mm.protocal.protobuf.FinderContact) it.next(), null, false, 3, null));
            }
            arrayList.addAll(arrayList2);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
            ((com.tencent.mm.plugin.finder.ui.ac) adapter).notifyDataSetChanged();
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.B;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.N(K.size());
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }
    }
}
