package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameLibraryUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f140898J = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f140899d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.d4 f140900e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameBannerView f140901f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView f140902g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f140903h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f140904i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f140905m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameDropdownView f140906n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f140907o;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f140913u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f140914v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f140915w;

    /* renamed from: y, reason: collision with root package name */
    public android.app.Dialog f140917y;

    /* renamed from: p, reason: collision with root package name */
    public int f140908p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f140909q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f140910r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f140911s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f140912t = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f140916x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f140918z = true;
    public int A = 0;
    public final int B = com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX;
    public int C = 0;
    public final com.tencent.mm.plugin.game.ui.b4 D = new com.tencent.mm.plugin.game.ui.b4();
    public final com.tencent.mm.plugin.game.ui.w4 E = new com.tencent.mm.plugin.game.ui.g4(this);
    public final android.view.View.OnClickListener F = new com.tencent.mm.plugin.game.ui.j4(this);
    public final android.view.View.OnClickListener G = new com.tencent.mm.plugin.game.ui.k4(this);
    public final com.tencent.mm.plugin.game.ui.j3 H = new com.tencent.mm.plugin.game.ui.l4(this);
    public final android.widget.AbsListView.OnScrollListener I = new com.tencent.mm.plugin.game.ui.m4(this);

    public static void T6(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI, com.tencent.mm.plugin.game.model.y1 y1Var, boolean z17) {
        java.util.LinkedList<com.tencent.mm.plugin.game.ui.u> linkedList;
        java.util.LinkedList<com.tencent.mm.plugin.game.ui.c4> linkedList2;
        m53.d4 d4Var;
        m53.i4 i4Var;
        java.util.LinkedList linkedList3;
        gameLibraryUI.getClass();
        m53.k2 k2Var = y1Var.f140526a;
        gameLibraryUI.f140912t = k2Var.f323839f;
        java.util.LinkedList linkedList4 = y1Var.f140528c;
        if (z17) {
            com.tencent.mm.plugin.game.ui.d4 d4Var2 = gameLibraryUI.f140900e;
            d4Var2.getClass();
            if (linkedList4 != null) {
                gm0.j1.e().j(new com.tencent.mm.plugin.game.ui.q4(d4Var2, linkedList4));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "Appending list size: %d", java.lang.Integer.valueOf(linkedList4.size()));
        } else {
            com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = gameLibraryUI.f140901f;
            m53.u3 u3Var = k2Var.f323837d;
            android.util.Pair pair = null;
            if (u3Var == null || u3Var.f324099d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GamePBDataLibrary", "Has no banner");
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList<>();
                for (int i17 = 0; i17 < k2Var.f323837d.f324099d.size(); i17++) {
                    com.tencent.mm.plugin.game.ui.u uVar = new com.tencent.mm.plugin.game.ui.u();
                    m53.d dVar = (m53.d) k2Var.f323837d.f324099d.get(i17);
                    com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a(dVar.f323609d);
                    if (a17 != null) {
                        r53.n.b(a17);
                        uVar.f141775a = a17;
                        uVar.f141776b = dVar.f323610e;
                        uVar.f141777c = dVar.f323611f;
                        linkedList.add(uVar);
                    }
                }
            }
            gameBannerView.setBannerList(linkedList);
            com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView gameLibraryCategoriesView = gameLibraryUI.f140902g;
            m53.k2 k2Var2 = y1Var.f140526a;
            m53.u3 u3Var2 = k2Var2.f323837d;
            if (u3Var2 == null || u3Var2.f324101f == null) {
                linkedList2 = null;
            } else {
                linkedList2 = new java.util.LinkedList<>();
                java.util.Iterator it = k2Var2.f323837d.f324101f.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    m53.u uVar2 = (m53.u) it.next();
                    com.tencent.mm.plugin.game.ui.c4 c4Var = new com.tencent.mm.plugin.game.ui.c4();
                    c4Var.f141075a = uVar2.f324079d;
                    c4Var.f141077c = uVar2.f324080e;
                    c4Var.f141078d = uVar2.f324082g;
                    c4Var.f141076b = uVar2.f324081f;
                    i18++;
                    c4Var.f141079e = i18;
                    linkedList2.add(c4Var);
                }
            }
            gameLibraryCategoriesView.setData(linkedList2);
            gameLibraryUI.f140902g.setSourceScene(gameLibraryUI.A);
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.LinkedList linkedList6 = y1Var.f140527b;
            linkedList5.addAll(linkedList6);
            linkedList5.addAll(linkedList4);
            com.tencent.mm.plugin.game.ui.d4 d4Var3 = gameLibraryUI.f140900e;
            d4Var3.getClass();
            s75.d.b(new com.tencent.mm.plugin.game.ui.s4(d4Var3, linkedList5), "game_get_download_info");
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "Initial new game list size: %d, initial all game list size: %d", java.lang.Integer.valueOf(linkedList6.size()), java.lang.Integer.valueOf(linkedList4.size()));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            m53.u3 u3Var3 = k2Var2.f323837d;
            if (u3Var3 != null && (linkedList3 = u3Var3.f324103h) != null) {
                java.util.Iterator it6 = linkedList3.iterator();
                while (it6.hasNext()) {
                    m53.g5 g5Var = (m53.g5) it6.next();
                    linkedHashMap.put(java.lang.Integer.valueOf(g5Var.f323712d), g5Var.f323713e);
                }
            }
            gameLibraryUI.f140907o = linkedHashMap;
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            linkedList7.addAll(gameLibraryUI.f140907o.values());
            com.tencent.mm.plugin.game.ui.GameDropdownView gameDropdownView = gameLibraryUI.f140906n;
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            linkedList8.addAll(gameLibraryUI.f140907o.keySet());
            int indexOf = linkedList8.indexOf(java.lang.Integer.valueOf(gameLibraryUI.f140908p));
            gameDropdownView.getClass();
            if (linkedList7.size() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameDropdownView", "No menu item");
            } else {
                gameDropdownView.f140769f = linkedList7;
                int size = linkedList7.size() - 1;
                gameDropdownView.f140771h = size;
                if (indexOf < 0 || indexOf > size) {
                    gameDropdownView.f140770g = 0;
                } else {
                    gameDropdownView.f140770g = indexOf;
                }
                android.content.Context context = gameDropdownView.f140767d;
                android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
                android.view.ViewGroup viewGroup = (android.widget.LinearLayout) layoutInflater.inflate(com.tencent.mm.R.layout.bgm, (android.view.ViewGroup) null);
                for (int i19 = 0; i19 < linkedList7.size(); i19++) {
                    java.lang.String str = (java.lang.String) linkedList7.get(i19);
                    android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.bgn, viewGroup, false);
                    textView.setText(str);
                    textView.setOnClickListener(gameDropdownView.f140774n);
                    if (i19 == gameDropdownView.f140770g) {
                        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
                        gameDropdownView.setText(str);
                    }
                    viewGroup.addView(textView);
                }
                gameDropdownView.f140768e.setContentView(viewGroup);
                gameDropdownView.setVisibility(0);
            }
            m53.u3 u3Var4 = k2Var2.f323837d;
            android.util.Pair pair2 = (u3Var4 == null || (i4Var = u3Var4.f324100e) == null) ? null : new android.util.Pair(i4Var.f323794f, i4Var.f323793e);
            if (pair2 == null || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) pair2.first) || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) pair2.second)) {
                gameLibraryUI.f140903h.setTag(null);
                gameLibraryUI.f140904i.setVisibility(8);
            } else {
                gameLibraryUI.f140903h.setTag(pair2.second);
                gameLibraryUI.f140904i.setVisibility(0);
                gameLibraryUI.f140904i.setText((java.lang.CharSequence) pair2.first);
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            if (linkedList6.size() != 0) {
                sparseArray.put(0, gameLibraryUI.f140903h);
            }
            sparseArray.put(linkedList6.size(), gameLibraryUI.f140905m);
            com.tencent.mm.plugin.game.ui.d4 d4Var4 = gameLibraryUI.f140900e;
            d4Var4.f141882r = sparseArray;
            d4Var4.notifyDataSetChanged();
            m53.u3 u3Var5 = k2Var2.f323837d;
            if (u3Var5 != null && (d4Var = u3Var5.f324102g) != null) {
                pair = new android.util.Pair(d4Var.f323627d, d4Var.f323628e);
            }
            if (pair != null) {
                gameLibraryUI.f140915w.setText((java.lang.CharSequence) pair.first);
                gameLibraryUI.f140915w.setTag(pair.second);
                gameLibraryUI.f140916x = true;
            }
        }
        if (gameLibraryUI.f140912t || !gameLibraryUI.f140916x) {
            return;
        }
        android.view.View view = gameLibraryUI.f140914v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataLibrary;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataLibrary;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void U6() {
        java.util.LinkedList e17 = com.tencent.mm.plugin.game.model.f.e(this);
        int i17 = this.f140911s;
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.g3(i17, 15, e17, this.f140908p, i17 == 0));
        this.f140910r = true;
    }

    public final void V6() {
        java.lang.String stringExtra = getIntent().getStringExtra("jump_game_center");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && stringExtra.equals("jump_game_center")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameCenterUI.class);
            intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bgj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.fms);
        setBackBtn(new com.tencent.mm.plugin.game.ui.e4(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            addIconOptionMenu(0, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.game.ui.f4(this));
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gmt);
        this.f140899d = listView;
        com.tencent.mm.plugin.game.ui.b4 b4Var = this.D;
        listView.setOnItemClickListener(b4Var);
        b4Var.f141046d = this.A;
        this.f140899d.setOnScrollListener(this.I);
        com.tencent.mm.plugin.game.ui.d4 d4Var = new com.tencent.mm.plugin.game.ui.d4(this);
        this.f140900e = d4Var;
        d4Var.f141880p = this.A;
        d4Var.f141884t = this.E;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.bgq, (android.view.ViewGroup) this.f140899d, false);
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = (com.tencent.mm.plugin.game.ui.GameBannerView) inflate.findViewById(com.tencent.mm.R.id.gmx);
        this.f140901f = gameBannerView;
        gameBannerView.setSourceScene(this.A);
        this.f140899d.addHeaderView(inflate);
        this.C++;
        this.f140902g = (com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView) layoutInflater.inflate(com.tencent.mm.R.layout.bgl, (android.view.ViewGroup) this.f140899d, false);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.addView(this.f140902g);
        this.f140899d.addHeaderView(linearLayout);
        this.C++;
        android.view.View inflate2 = layoutInflater.inflate(com.tencent.mm.R.layout.bgp, (android.view.ViewGroup) this.f140899d, false);
        this.f140903h = inflate2;
        inflate2.setOnClickListener(this.F);
        this.f140904i = (android.widget.TextView) this.f140903h.findViewById(com.tencent.mm.R.id.gmv);
        android.view.View inflate3 = layoutInflater.inflate(com.tencent.mm.R.layout.bgk, (android.view.ViewGroup) this.f140899d, false);
        this.f140905m = inflate3;
        inflate3.setOnClickListener(null);
        com.tencent.mm.plugin.game.ui.GameDropdownView gameDropdownView = (com.tencent.mm.plugin.game.ui.GameDropdownView) this.f140905m.findViewById(com.tencent.mm.R.id.gmp);
        this.f140906n = gameDropdownView;
        gameDropdownView.setAnchorView(this.f140905m);
        this.f140906n.setOnSelectionChangedListener(this.H);
        android.view.View inflate4 = layoutInflater.inflate(com.tencent.mm.R.layout.bgs, (android.view.ViewGroup) this.f140899d, false);
        this.f140913u = inflate4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate4, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate4, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
        linearLayout2.addView(this.f140913u);
        this.f140899d.addFooterView(linearLayout2);
        android.view.View inflate5 = layoutInflater.inflate(com.tencent.mm.R.layout.bgo, (android.view.ViewGroup) this.f140899d, false);
        this.f140914v = inflate5;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(inflate5, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate5, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.Button button = (android.widget.Button) this.f140914v.findViewById(com.tencent.mm.R.id.gmu);
        this.f140915w = button;
        button.setOnClickListener(this.G);
        this.f140899d.addFooterView(this.f140914v);
        this.f140899d.setAdapter((android.widget.ListAdapter) this.f140900e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryUI", "error request code");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryUI", "account not ready");
            finish();
            return;
        }
        boolean z17 = false;
        this.A = getIntent().getIntExtra("game_report_from_scene", 0);
        gm0.j1.d().a(1218, this);
        initView();
        byte[] D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_library");
        if (D0 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "No cache found");
        } else {
            gm0.j1.e().j(new com.tencent.mm.plugin.game.ui.i4(this, D0));
            z17 = true;
        }
        if (!z17) {
            android.app.Dialog e17 = r53.f.e(this);
            this.f140917y = e17;
            e17.show();
        }
        U6();
        com.tencent.mm.game.report.l.c(this, 11, 1100, 0, 1, this.A, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "onDestroy");
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        gm0.j1.d().q(1218, this);
        this.f140900e.h();
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = this.f140901f;
        if (gameBannerView != null) {
            gameBannerView.f140661m.d();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        super.onPause();
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = this.f140901f;
        if (gameBannerView == null || (b4Var = gameBannerView.f140661m) == null) {
            return;
        }
        b4Var.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "Auto scroll stopped");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView;
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        super.onResume();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryUI", "account not ready");
            return;
        }
        this.f140900e.notifyDataSetChanged();
        if (!this.f140918z && (gameBannerView = this.f140901f) != null && (b4Var = gameBannerView.f140661m) != null && b4Var.e() && gameBannerView.f140660i.size() > 1) {
            b4Var.c(5000L, 5000L);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "Auto scroll restarted");
        }
        if (this.f140918z) {
            this.f140918z = false;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() != 1218) {
                return;
            }
            gm0.j1.e().j(new com.tencent.mm.plugin.game.ui.o4(this, ((com.tencent.mm.plugin.game.model.g3) m1Var).f140321e.f70711b.f70700a));
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fna, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
        android.app.Dialog dialog = this.f140917y;
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
