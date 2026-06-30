package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayCardManagerUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {
    public static final /* synthetic */ int Y = 0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.tencent.mm.wallet_core.ui.WcPayBannerView D;
    public v73.q E;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard G;
    public r45.n75 H;
    public r45.n75 I;
    public java.lang.String M;
    public long N;
    public long P;
    public int Q;
    public r45.an6 R;
    public boolean S;
    public at4.y1 T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f142287f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f142288g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f142289h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f142290i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f142291m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f142292n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f142293o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f142294p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f142295q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f142296r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f142297s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f142298t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f142299u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f142300v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f142301w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f142302x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f142303y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f142304z;
    public java.util.List F = new java.util.ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f142286J = "";
    public java.lang.String K = "";
    public java.lang.String L = "";

    public final void V6() {
        com.tencent.mars.xlog.Log.i(this.f142260d, "do qry detail");
        r73.l lVar = new r73.l(this.M);
        lVar.K(this);
        doSceneProgress(lVar, true);
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard W6(java.lang.String str) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        com.tencent.mm.plugin.wallet_core.model.Bankcard e17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().e(str);
        return (e17 == null && (bankcard = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14004m) != null && bankcard.field_bindSerial.equals(str)) ? bankcard : e17;
    }

    public final void X6(r45.rg5 rg5Var) {
        this.f142286J = rg5Var.f384853r;
        this.L = rg5Var.f384854s;
        this.R = rg5Var.f384850o;
        this.K = rg5Var.f384855t;
        this.F.clear();
        this.E.notifyDataSetChanged();
        r45.kp4 kp4Var = rg5Var.f384856u;
        if (kp4Var != null) {
            this.U = kp4Var.f378893d;
            this.V = kp4Var.f378895f;
            this.W = kp4Var.f378896g;
            this.X = kp4Var.f378894e;
        }
        r45.bx3 bx3Var = rg5Var.f384844f;
        if (bx3Var != null) {
            setMMTitle(bx3Var.f371131s);
            this.N = rg5Var.f384847i;
            this.P = rg5Var.f384846h;
            r45.n75 n75Var = rg5Var.f384844f.f371125m;
            if (n75Var != null) {
                this.G = W6(n75Var.f381137g);
                this.H = rg5Var.f384844f.f371125m;
            }
            r45.bx3 bx3Var2 = rg5Var.f384844f;
            java.lang.String str = com.tencent.mm.wallet_core.ui.r1.h(bx3Var2.f371120e, 6) + getString(com.tencent.mm.R.string.fx_);
            android.widget.TextView textView = this.f142297s;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = this.f142297s.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f142292n, bx3Var2.f371120e, 0.06f);
            this.f142293o.setText(u73.h.a(bx3Var2.f371121f));
            this.f142295q.setCheck(bx3Var2.f371124i != 0);
            Y6();
            this.D.setBannerData(rg5Var.f384852q);
            int i17 = rg5Var.f384844f.f371122g;
            com.tencent.mars.xlog.Log.i(this.f142260d, "detail state: %s", java.lang.Integer.valueOf(i17));
            if (com.tencent.mm.sdk.platformtools.t8.K0(rg5Var.f384844f.f371130r)) {
                this.f142299u.setVisibility(8);
            } else {
                this.f142299u.setText(rg5Var.f384844f.f371130r);
                this.f142299u.setVisibility(0);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(rg5Var.f384844f.f371123h)) {
                this.f142300v.setVisibility(8);
            } else {
                this.f142300v.setText(rg5Var.f384844f.f371123h);
                this.f142300v.setVisibility(0);
            }
            if (i17 == 1) {
                this.f142299u.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
                this.f142293o.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.h2z);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f142287f.removeFooterView(this.f142289h);
                this.f142289h.setVisibility(8);
                android.view.View view = this.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.S) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bjj, (android.view.ViewGroup) null);
                    this.f142291m = viewGroup;
                    ((android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.f485261h30)).setOnClickListener(new v73.k(this));
                    this.f142287f.addFooterView(this.f142291m);
                    showHomeBtn(false);
                    enableBackMenu(false);
                    setMMTitle("");
                }
            } else if (i17 == 2) {
                java.util.LinkedList linkedList = rg5Var.f384845g;
                if (linkedList != null && !linkedList.isEmpty()) {
                    this.F = rg5Var.f384845g;
                    this.E.notifyDataSetChanged();
                    this.f142287f.removeFooterView(this.f142289h);
                    this.f142289h.setVisibility(8);
                    r45.fq4 fq4Var = rg5Var.f384851p;
                    if (fq4Var != null) {
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.View.inflate(this, com.tencent.mm.R.layout.bjl, null);
                        this.f142290i = viewGroup2;
                        ((android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.h2v)).setText(fq4Var.f374550d);
                        this.f142290i.setOnClickListener(new v73.l(this, fq4Var));
                        this.f142287f.addFooterView(this.f142290i);
                    }
                    findViewById(com.tencent.mm.R.id.h3c).setBackgroundResource(com.tencent.mm.R.color.f479234tm);
                }
                this.f142294p.setVisibility(0);
                this.f142293o.setVisibility(0);
                android.view.View view2 = this.A;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.h2z);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 3) {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h2z);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f142301w.setText(com.tencent.mm.R.string.fwu);
                this.f142303y.setText(com.tencent.mm.R.string.fxm);
                this.f142302x.setText(u73.h.b(rg5Var.f384844f.f371126n));
                this.f142304z.setText(u73.h.b(rg5Var.f384844f.f371127o));
                this.f142287f.removeFooterView(this.f142289h);
                this.f142289h.setVisibility(8);
                android.view.View view3 = this.A;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.h3g);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 4) {
                this.f142294p.setVisibility(8);
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.h2z);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f142301w.setText(com.tencent.mm.R.string.fxl);
                this.f142302x.setText(u73.h.b(rg5Var.f384844f.f371128p));
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.h3d);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f142287f.removeFooterView(this.f142289h);
                this.f142289h.setVisibility(8);
                android.view.View view4 = this.A;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.h3g);
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(findViewById7, arrayList11.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(findViewById7, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById(com.tencent.mm.R.id.h3c).setBackgroundResource(com.tencent.mm.R.color.aaw);
            }
        }
        android.view.View view5 = this.B;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList12.add(8);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view5, arrayList12.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u73.h.h(this, rg5Var.f384848m, this.M, 2, this.R);
        v73.n nVar = (v73.n) component(v73.n.class);
        nVar.getClass();
        ku5.u0 u0Var = ku5.t0.f312615d;
        v73.p pVar = new v73.p(nVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(pVar, 300L, false);
    }

    public final void Y6() {
        r45.n75 n75Var = this.H;
        if (n75Var == null) {
            com.tencent.mars.xlog.Log.i(this.f142260d, "reset payway view for null");
            this.f142298t.setText("");
            this.f142298t.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.C.setVisibility(8);
            return;
        }
        this.f142298t.setText(n75Var.f381134d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H.f381135e)) {
            this.f142298t.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            this.f142298t.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.H.f381135e, true));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H.f381140m)) {
            this.C.setVisibility(8);
        } else {
            this.C.setText(this.H.f381140m);
            this.C.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjo;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bjm, (android.view.ViewGroup) null);
        this.f142288g = viewGroup;
        this.f142295q = (com.tencent.mm.ui.widget.MMSwitchBtn) viewGroup.findViewById(com.tencent.mm.R.id.h37);
        this.f142296r = (android.widget.LinearLayout) this.f142288g.findViewById(com.tencent.mm.R.id.h38);
        this.f142298t = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3a);
        this.f142292n = (android.widget.ImageView) this.f142288g.findViewById(com.tencent.mm.R.id.h2w);
        this.f142293o = (com.tencent.mm.wallet_core.ui.WalletTextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3b);
        this.f142297s = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3k);
        this.f142294p = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.f485267h36);
        this.f142299u = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3i);
        this.f142300v = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3h);
        this.f142301w = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.f485263h32);
        this.f142302x = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.f485264h33);
        this.f142303y = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3e);
        this.f142304z = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h3f);
        this.A = this.f142288g.findViewById(com.tencent.mm.R.id.h2y);
        this.C = (android.widget.TextView) this.f142288g.findViewById(com.tencent.mm.R.id.h39);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) this.f142288g.findViewById(com.tencent.mm.R.id.pga);
        this.D = wcPayBannerView;
        wcPayBannerView.a();
        this.f142293o.b();
        this.f142295q.setSwitchListener(new v73.d(this));
        this.f142296r.setOnClickListener(new v73.e(this));
        java.lang.String string = getString(com.tencent.mm.R.string.fx_);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.append((java.lang.CharSequence) getString(com.tencent.mm.R.string.fxb));
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(1, new v73.f(this)), string.length(), spannableStringBuilder.length(), 18);
        this.f142294p.setClickable(true);
        this.f142294p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.f142294p.setText(spannableStringBuilder);
        this.f142289h = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bjk, (android.view.ViewGroup) null);
        this.B = findViewById(com.tencent.mm.R.id.h2x);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485266h35);
        this.f142287f = listView;
        listView.addHeaderView(this.f142288g);
        this.f142287f.addFooterView(this.f142289h, null, false);
        v73.q qVar = new v73.q(this, null);
        this.E = qVar;
        this.f142287f.setAdapter((android.widget.ListAdapter) qVar);
        this.f142287f.setOnItemClickListener(new v73.m(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (i18 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
                this.f142293o.setText(u73.h.a(intent.getLongExtra("key_credit_line", 0L)));
                setResult(-1);
            }
        } else if (i17 == 2) {
            if (i18 == -1) {
                removeAllOptionMenu();
                setResult(-1);
                finish();
            }
        } else if (i17 == 3 && i18 == -1) {
            V6();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2876);
        addSceneEndListener(2742);
        addSceneEndListener(2941);
        this.M = getIntent().getStringExtra("key_card_no");
        this.Q = getIntent().getIntExtra("key_scene", 0);
        this.S = getIntent().getBooleanExtra("key_is_create", false);
        getIntent().getStringExtra("key_card_type");
        initView();
        setMMTitle(com.tencent.mm.R.string.f492288fx5);
        if (this.Q != 1) {
            V6();
            return;
        }
        r45.rg5 rg5Var = new r45.rg5();
        try {
            rg5Var.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
            X6(rg5Var);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f142260d, e17, "", new java.lang.Object[0]);
            V6();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2876);
        removeSceneEndListener(2742);
        removeSceneEndListener(2941);
        at4.y1 y1Var = this.T;
        if (y1Var != null) {
            at4.c2.f13816d.d(y1Var);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof r73.l) {
            r73.l lVar = (r73.l) m1Var;
            if (!lVar.f214031i && !lVar.f214032m) {
                X6(lVar.f393177r);
            }
        } else if (m1Var instanceof r73.i) {
            r73.i iVar = (r73.i) m1Var;
            boolean z17 = iVar.f214031i;
            boolean z18 = iVar.f214032m;
            int i19 = iVar.f393174s;
            if (z18) {
                this.f142295q.setCheck(i19 != 1);
            }
            if (iVar.f214031i) {
                this.f142295q.setCheck(i19 != 1);
            }
        } else if (m1Var instanceof r73.j) {
            r73.j jVar = (r73.j) m1Var;
            if (!jVar.f214031i && !jVar.f214032m) {
                r45.n75 n75Var = jVar.f393175r.f385898f;
                this.H = n75Var;
                if (n75Var != null) {
                    this.G = W6(n75Var.f381137g);
                }
                Y6();
            }
            if (jVar.f214032m) {
                r45.n75 n75Var2 = this.I;
                this.H = n75Var2;
                if (n75Var2 != null) {
                    this.G = W6(n75Var2.f381137g);
                }
                Y6();
            }
            if (jVar.f214031i) {
                r45.n75 n75Var3 = this.I;
                this.H = n75Var3;
                if (n75Var3 != null) {
                    this.G = W6(n75Var3.f381137g);
                }
                Y6();
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.n.class);
    }
}
