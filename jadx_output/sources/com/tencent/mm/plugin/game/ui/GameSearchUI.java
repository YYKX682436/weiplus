package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class GameSearchUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.tools.b9 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.regex.Pattern f140966x = java.util.regex.Pattern.compile("\\s+");

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f140967d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f140968e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140969f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f140970g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f140971h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f140972i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f140973m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.z5 f140974n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.d6 f140975o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f140976p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f140977q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f140978r;

    /* renamed from: u, reason: collision with root package name */
    public int f140981u;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f140979s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f140980t = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f140982v = new com.tencent.mm.plugin.game.ui.i6(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f140983w = new com.tencent.mm.plugin.game.ui.j6(this);

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        if (this.f140980t) {
            this.f140980t = false;
            return;
        }
        java.lang.String str2 = this.f140978r;
        if (str2 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2.equals(str == null ? "" : str)) {
                return;
            }
        }
        this.f140978r = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str3 : f140966x.split(str.replace('*', ' '))) {
                linkedList.add(str3);
            }
            T6(linkedList, 0, true);
            U6(6);
            return;
        }
        while (true) {
            java.util.LinkedList linkedList2 = this.f140979s;
            if (linkedList2.isEmpty()) {
                com.tencent.mm.plugin.game.model.c3 c3Var = new com.tencent.mm.plugin.game.model.c3(com.tencent.mm.sdk.platformtools.m2.d(), str, com.tencent.mm.plugin.game.model.f.e(this));
                gm0.j1.d().g(c3Var);
                linkedList2.add(c3Var);
                return;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.d((com.tencent.mm.modelbase.m1) linkedList2.pop());
        }
    }

    public final void T6(java.util.LinkedList linkedList, int i17, boolean z17) {
        java.util.LinkedList linkedList2;
        while (true) {
            linkedList2 = this.f140979s;
            if (linkedList2.isEmpty()) {
                break;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.d((com.tencent.mm.modelbase.m1) linkedList2.pop());
        }
        if (z17) {
            com.tencent.mm.plugin.game.ui.z5 z5Var = this.f140974n;
            z5Var.f141907p = 0;
            z5Var.f141908q = false;
        }
        this.f140977q = linkedList;
        com.tencent.mm.plugin.game.model.b3 b3Var = new com.tencent.mm.plugin.game.model.b3(com.tencent.mm.sdk.platformtools.m2.d(), linkedList, com.tencent.mm.plugin.game.model.f.e(this), this.f140974n.f141907p);
        gm0.j1.d().g(b3Var);
        linkedList2.add(b3Var);
        java.util.Iterator it = linkedList.iterator();
        this.f140976p = "";
        while (it.hasNext()) {
            this.f140976p += " " + ((java.lang.String) it.next());
        }
        java.lang.String trim = this.f140976p.trim();
        this.f140976p = trim;
        if (i17 == 1 || i17 == 2) {
            this.f140980t = true;
            this.f140967d.r(trim);
        }
    }

    public final void U6(int i17) {
        switch (i17) {
            case 0:
                this.f140968e.setVisibility(8);
                this.f140969f.setVisibility(8);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(8);
                return;
            case 1:
                hideVKB();
                android.widget.ListView listView = this.f140971h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(listView, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f140967d.a();
                this.f140968e.setVisibility(8);
                this.f140969f.setVisibility(8);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(0);
                return;
            case 2:
                this.f140968e.setVisibility(8);
                if (this.f140974n.getCount() > 0) {
                    this.f140969f.setVisibility(8);
                    this.f140971h.setVisibility(0);
                } else {
                    this.f140969f.setVisibility(0);
                    this.f140971h.setVisibility(8);
                }
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(8);
                return;
            case 3:
                this.f140968e.setVisibility(0);
                this.f140969f.setVisibility(8);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(8);
                return;
            case 4:
                this.f140968e.setVisibility(8);
                this.f140969f.setVisibility(0);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(8);
                return;
            case 5:
                this.f140968e.setVisibility(8);
                this.f140969f.setVisibility(8);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(0);
                this.f140970g.setVisibility(8);
                return;
            case 6:
                android.widget.ListView listView2 = this.f140971h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(listView2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView2.smoothScrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(listView2, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f140968e.setVisibility(8);
                this.f140969f.setVisibility(8);
                this.f140971h.setVisibility(8);
                this.f140972i.setVisibility(8);
                this.f140970g.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.ui.tools.b9
    public void Z2() {
        hideVKB();
        onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bhm;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.game.ui.e6(this));
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9();
        this.f140967d = c9Var;
        c9Var.c(true);
        this.f140967d.f210324i = this;
        this.f140968e = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.p7i);
        this.f140970g = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.mf_);
        this.f140969f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kch);
        this.f140971h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mfc);
        com.tencent.mm.plugin.game.ui.z5 z5Var = new com.tencent.mm.plugin.game.ui.z5(this, null);
        this.f140974n = z5Var;
        this.f140971h.setAdapter((android.widget.ListAdapter) z5Var);
        this.f140971h.setOnItemClickListener(this.f140982v);
        this.f140971h.setOnTouchListener(new com.tencent.mm.plugin.game.ui.f6(this));
        this.f140971h.setOnScrollListener(new com.tencent.mm.plugin.game.ui.g6(this));
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.bgs, (android.view.ViewGroup) this.f140971h, false);
        this.f140973m = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f140971h.addFooterView(this.f140973m);
        this.f140972i = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mfa);
        com.tencent.mm.plugin.game.ui.d6 d6Var = new com.tencent.mm.plugin.game.ui.d6(this);
        this.f140975o = d6Var;
        this.f140972i.setAdapter((android.widget.ListAdapter) d6Var);
        this.f140972i.setOnItemClickListener(this.f140983w);
        this.f140972i.setOnTouchListener(new com.tencent.mm.plugin.game.ui.h6(this));
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : f140966x.split(str.replace('*', ' '))) {
            linkedList.add(str2);
        }
        T6(linkedList, 0, true);
        U6(1);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSearchUI", "account not ready");
            finish();
            return;
        }
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        gm0.j1.d().a(zd1.e.CTRL_INDEX, this);
        gm0.j1.d().a(1329, this);
        this.f140981u = getIntent().getIntExtra("game_report_from_scene", 0);
        initView();
        com.tencent.mm.game.report.l.c(this, 14, 1401, 0, 2, this.f140981u, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f140967d.j(this, menu);
        this.f140967d.q("");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSearchUI", "onDestroy");
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        gm0.j1.d().q(zd1.e.CTRL_INDEX, this);
        gm0.j1.d().q(1329, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f140967d.m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        int i19;
        char c17;
        if (m1Var.isCanceled()) {
            return;
        }
        java.util.LinkedList linkedList2 = this.f140979s;
        if (linkedList2.contains(m1Var)) {
            linkedList2.remove(m1Var);
        }
        android.view.View view = this.f140973m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = 0;
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int type = m1Var.getType();
        int i28 = 3;
        if (type != 1328) {
            if (type == 1329 && i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.game.model.c3 c3Var = (com.tencent.mm.plugin.game.model.c3) m1Var;
                r45.e63 e63Var = (r45.e63) c3Var.f140252e.f70711b.f70700a;
                java.lang.String str2 = e63Var.f373040d;
                java.util.LinkedList linkedList3 = e63Var.f373045i;
                com.tencent.mm.plugin.game.ui.d6 d6Var = this.f140975o;
                d6Var.getClass();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList3)) {
                    java.lang.String str3 = c3Var.f140253f;
                    d6Var.f141366e = str3;
                    java.util.LinkedList linkedList4 = d6Var.f141367f;
                    linkedList4.clear();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mm.plugin.game.ui.b6 b6Var = new com.tencent.mm.plugin.game.ui.b6();
                        b6Var.f141059a = 1;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            b6Var.f141060b = d6Var.f141365d.getString(com.tencent.mm.R.string.fp_);
                        } else {
                            b6Var.f141060b = str2;
                        }
                        linkedList4.add(b6Var);
                    }
                    java.util.Iterator it = linkedList3.iterator();
                    while (it.hasNext()) {
                        r45.f63 f63Var = (r45.f63) it.next();
                        com.tencent.mm.plugin.game.ui.b6 b6Var2 = new com.tencent.mm.plugin.game.ui.b6();
                        b6Var2.f141059a = com.tencent.mm.sdk.platformtools.t8.K0(str3) ? 2 : 3;
                        b6Var2.f141061c = f63Var.f374032d;
                        b6Var2.f141060b = f63Var.f374033e;
                        b6Var2.f141062d = f63Var.f374034f;
                        b6Var2.f141063e = f63Var.f374035g;
                        b6Var2.f141064f = f63Var.f374036h;
                        linkedList4.add(b6Var2);
                    }
                    d6Var.notifyDataSetChanged();
                }
                U6(5);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.game.model.b3) m1Var).f140234e;
        java.util.LinkedList linkedList5 = ((r45.g63) oVar.f70710a.f70684a).f374912d;
        if (i17 == 0 && i18 == 0) {
            r45.h63 h63Var = (r45.h63) oVar.f70711b.f70700a;
            java.util.LinkedList linkedList6 = h63Var != null ? h63Var.f375869d : null;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList6)) {
                java.lang.String str4 = this.f140976p;
                com.tencent.mm.plugin.game.ui.z5 z5Var = this.f140974n;
                if (z5Var.f141907p != 0) {
                    java.util.Iterator it6 = linkedList6.iterator();
                    while (it6.hasNext()) {
                        r45.i63 i63Var = (r45.i63) it6.next();
                        if (i63Var.f376753e == 3) {
                            java.util.LinkedList linkedList7 = i63Var.f376755g;
                            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList7)) {
                                z5Var.f141907p = i63Var.f376759n;
                                z5Var.f141908q = i63Var.f376760o;
                                java.util.Iterator it7 = linkedList7.iterator();
                                while (it7.hasNext()) {
                                    com.tencent.mm.plugin.game.ui.w5 a17 = com.tencent.mm.plugin.game.ui.w5.a((r45.k63) it7.next());
                                    com.tencent.mm.plugin.game.ui.x5 x5Var = a17.f141834m;
                                    x5Var.f141859b = a17.f141822a;
                                    x5Var.f141861d = a17.f141830i;
                                    x5Var.f141862e = a17.f141831j;
                                    x5Var.f141864g = "2";
                                    int i29 = z5Var.f141903i;
                                    z5Var.f141903i = i29 + 1;
                                    x5Var.f141865h = i29 + 301;
                                    x5Var.f141863f = z5Var.f141898d ? 1403 : 1405;
                                    z5Var.f141905n.add(a17);
                                }
                            }
                        }
                        z5Var.f141908q = false;
                    }
                } else {
                    if (z5Var.f141905n == null) {
                        z5Var.f141905n = new java.util.ArrayList();
                    }
                    z5Var.f141900f = 0;
                    z5Var.f141901g = 0;
                    z5Var.f141902h = 0;
                    z5Var.f141903i = 0;
                    z5Var.f141898d = false;
                    z5Var.f141899e = false;
                    z5Var.f141908q = false;
                    z5Var.f141907p = 0;
                    z5Var.f141905n.clear();
                    z5Var.f141909r = false;
                    java.util.Iterator it8 = linkedList6.iterator();
                    while (it8.hasNext()) {
                        r45.i63 i63Var2 = (r45.i63) it8.next();
                        java.util.LinkedList linkedList8 = i63Var2.f376754f;
                        int i37 = (linkedList8 == null || linkedList8.size() == 0) ? 1 : i27;
                        java.util.LinkedList linkedList9 = i63Var2.f376755g;
                        int i38 = (linkedList9 == null || linkedList9.size() == 0) ? 1 : i27;
                        java.util.LinkedList linkedList10 = i63Var2.f376758m;
                        if (((i37 == 0 || i38 == 0 || ((linkedList10 == null || linkedList10.size() == 0) ? 1 : i27) == 0) ? i27 : 1) == 0) {
                            java.util.ArrayList arrayList2 = z5Var.f141905n;
                            java.lang.String str5 = i63Var2.f376752d;
                            com.tencent.mm.plugin.game.ui.w5 w5Var = new com.tencent.mm.plugin.game.ui.w5();
                            w5Var.f141832k = i27;
                            w5Var.f141823b = str5;
                            w5Var.f141834m = new com.tencent.mm.plugin.game.ui.x5();
                            arrayList2.add(w5Var);
                            if (!z5Var.f141909r) {
                                java.util.ArrayList arrayList3 = z5Var.f141905n;
                                ((com.tencent.mm.plugin.game.ui.w5) arrayList3.get(arrayList3.size() - 1)).f141833l = true;
                                z5Var.f141909r = true;
                            }
                            if (i63Var2.f376753e == 4 && linkedList10 != null) {
                                java.util.Iterator it9 = linkedList10.iterator();
                                while (it9.hasNext()) {
                                    r45.j63 j63Var = (r45.j63) it9.next();
                                    com.tencent.mm.plugin.game.ui.w5 w5Var2 = new com.tencent.mm.plugin.game.ui.w5();
                                    w5Var2.f141832k = i28;
                                    r45.c63 c63Var = j63Var.f377604d;
                                    java.lang.String str6 = c63Var.f371302d;
                                    w5Var2.f141822a = str6;
                                    w5Var2.f141823b = c63Var.f371303e;
                                    w5Var2.f141824c = c63Var.f371304f;
                                    w5Var2.f141825d = c63Var.f371305g;
                                    w5Var2.f141826e = c63Var.f371306h;
                                    int i39 = c63Var.f371308m;
                                    java.lang.String str7 = c63Var.f371309n;
                                    w5Var2.f141829h = j63Var.f377605e;
                                    com.tencent.mm.plugin.game.ui.x5 x5Var2 = new com.tencent.mm.plugin.game.ui.x5(i39, 4, str6, str7);
                                    w5Var2.f141834m = x5Var2;
                                    x5Var2.f141864g = "3";
                                    int i47 = z5Var.f141902h;
                                    z5Var.f141902h = i47 + 1;
                                    x5Var2.f141865h = i47 + 601;
                                    z5Var.f141905n.add(w5Var2);
                                    i28 = 3;
                                }
                            }
                            int i48 = i63Var2.f376753e;
                            if ((i48 == 1 || i48 == 2) && (linkedList = i63Var2.f376754f) != null) {
                                java.util.Iterator it10 = linkedList.iterator();
                                while (it10.hasNext()) {
                                    r45.c63 c63Var2 = (r45.c63) it10.next();
                                    com.tencent.mm.plugin.game.ui.w5 w5Var3 = new com.tencent.mm.plugin.game.ui.w5();
                                    w5Var3.f141832k = 1;
                                    java.lang.String str8 = c63Var2.f371302d;
                                    w5Var3.f141822a = str8;
                                    w5Var3.f141823b = c63Var2.f371303e;
                                    w5Var3.f141824c = c63Var2.f371304f;
                                    w5Var3.f141825d = c63Var2.f371305g;
                                    w5Var3.f141826e = c63Var2.f371306h;
                                    com.tencent.mm.plugin.game.ui.x5 x5Var3 = new com.tencent.mm.plugin.game.ui.x5(c63Var2.f371308m, 1, str8, c63Var2.f371309n);
                                    w5Var3.f141834m = x5Var3;
                                    int i49 = i63Var2.f376753e;
                                    if (i49 == 1) {
                                        z5Var.f141898d = true;
                                        int i57 = z5Var.f141900f + 1;
                                        z5Var.f141900f = i57;
                                        x5Var3.f141865h = i57;
                                    } else if (i49 == 2) {
                                        z5Var.f141899e = true;
                                        int i58 = z5Var.f141901g + 1;
                                        z5Var.f141901g = i58;
                                        x5Var3.f141865h = i58;
                                    }
                                    x5Var3.f141864g = "1";
                                    z5Var.f141905n.add(w5Var3);
                                }
                                i19 = 3;
                            } else {
                                i19 = 3;
                                if (i48 == 3 && linkedList9 != null) {
                                    z5Var.f141907p = i63Var2.f376759n;
                                    z5Var.f141908q = i63Var2.f376760o;
                                    java.util.Iterator it11 = linkedList9.iterator();
                                    while (it11.hasNext()) {
                                        com.tencent.mm.plugin.game.ui.w5 a18 = com.tencent.mm.plugin.game.ui.w5.a((r45.k63) it11.next());
                                        com.tencent.mm.plugin.game.ui.x5 x5Var4 = a18.f141834m;
                                        x5Var4.f141859b = a18.f141822a;
                                        x5Var4.f141861d = a18.f141830i;
                                        x5Var4.f141862e = a18.f141831j;
                                        x5Var4.f141864g = "2";
                                        int i59 = z5Var.f141903i;
                                        z5Var.f141903i = i59 + 1;
                                        x5Var4.f141865h = i59 + 301;
                                        z5Var.f141905n.add(a18);
                                    }
                                }
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(i63Var2.f376756h) || com.tencent.mm.sdk.platformtools.t8.K0(i63Var2.f376757i) || i63Var2.f376753e != 1) {
                                c17 = 5;
                            } else {
                                java.lang.String str9 = i63Var2.f376756h;
                                java.lang.String str10 = i63Var2.f376757i;
                                com.tencent.mm.plugin.game.ui.w5 w5Var4 = new com.tencent.mm.plugin.game.ui.w5();
                                c17 = 5;
                                w5Var4.f141832k = 5;
                                w5Var4.f141823b = str9;
                                com.tencent.mm.plugin.game.ui.x5 x5Var5 = new com.tencent.mm.plugin.game.ui.x5(2, str10);
                                w5Var4.f141834m = x5Var5;
                                x5Var5.f141859b = "wx62d9035fd4fd2059";
                                x5Var5.f141864g = "1";
                                x5Var5.f141865h = 300;
                                z5Var.f141905n.add(w5Var4);
                            }
                            i28 = i19;
                            i27 = 0;
                        } else if (i63Var2.f376753e == 1) {
                            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str4);
                            android.content.Context context = z5Var.f141904m;
                            java.lang.String string = !K0 ? context.getString(com.tencent.mm.R.string.fp9, str4) : context.getString(com.tencent.mm.R.string.fp8);
                            java.util.ArrayList arrayList4 = z5Var.f141905n;
                            com.tencent.mm.plugin.game.ui.w5 w5Var5 = new com.tencent.mm.plugin.game.ui.w5();
                            w5Var5.f141832k = 6;
                            w5Var5.f141823b = string;
                            w5Var5.f141834m = new com.tencent.mm.plugin.game.ui.x5();
                            arrayList4.add(w5Var5);
                            z5Var.f141909r = true;
                        }
                    }
                    java.util.Iterator it12 = z5Var.f141905n.iterator();
                    while (it12.hasNext()) {
                        com.tencent.mm.plugin.game.ui.w5 w5Var6 = (com.tencent.mm.plugin.game.ui.w5) it12.next();
                        if (z5Var.f141898d) {
                            w5Var6.f141834m.f141863f = 1403;
                        } else if (z5Var.f141899e) {
                            w5Var6.f141834m.f141863f = 1404;
                        } else {
                            w5Var6.f141834m.f141863f = 1405;
                        }
                    }
                    z5Var.notifyDataSetChanged();
                }
            }
        }
        U6(2);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
