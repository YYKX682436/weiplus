package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class LuckyMoneyBusiDetailUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int P = 0;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ap f145987J;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f145988g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f145989h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145990i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145991m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f145992n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f145993o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter f145994p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f145995q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f145996r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f145997s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145998t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f145999u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146000v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f146001w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f146002x;

    /* renamed from: y, reason: collision with root package name */
    public int f146003y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f146004z = true;
    public boolean A = false;
    public int G = 0;
    public final java.util.List H = new java.util.LinkedList();
    public final java.util.Map I = new java.util.HashMap();
    public java.lang.String K = "";
    public boolean L = false;
    public boolean M = false;
    public final android.widget.AbsListView.OnScrollListener N = new com.tencent.mm.plugin.luckymoney.ui.w(this);

    public static void fixBackgroundRepeat(android.view.View view) {
        android.graphics.drawable.Drawable background;
        if (view == null || (background = view.getBackground()) == null || !(background instanceof android.graphics.drawable.BitmapDrawable)) {
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) background;
        bitmapDrawable.mutate();
        bitmapDrawable.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
    }

    public final void V6() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f145994p;
        if (luckyMoneyWishFooter == null || luckyMoneyWishFooter.getVisibility() == 8) {
            return;
        }
        this.f145994p.setVisibility(8);
    }

    public final void W6() {
        this.A = true;
        if (this.f146003y > 0) {
            java.util.List list = this.H;
            if (((java.util.LinkedList) list).size() > 0) {
                if (((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1) != null) {
                    doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(this.C, 11, this.f146003y, this.E, com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.luckymoney.model.h5) ((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1)).f145315g, 0L), "v1.0", this.K));
                    return;
                }
            }
        }
        this.K = "";
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(this.C, 11, this.f146003y, this.E, "v1.0", "", ""));
    }

    public final void X6(com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        int i17;
        java.lang.String str;
        java.util.List list;
        com.tencent.mm.plugin.luckymoney.ui.ok okVar;
        android.view.View view;
        com.tencent.mm.plugin.luckymoney.ui.ok okVar2;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var;
        if (e1Var == null) {
            return;
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.v() && (h0Var = e1Var.C) != null && h0Var.f145304d != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "is not atomic luckymoney, go to LuckyMoneyDetailUI");
            gb3.l.b(this.C, e1Var);
            android.content.Intent intent = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.class) : new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.class);
            intent.putExtras(getIntent());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.M = true;
            finish();
            return;
        }
        getWindow().setStatusBarColor(-1186093);
        this.M = false;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477843d1);
        loadAnimation.setDuration(250L);
        getContentView().startAnimation(loadAnimation);
        setContentViewVisibility(0);
        this.f146004z = e1Var.f145253y == 1;
        if (this.f146003y == 0) {
            java.lang.String str2 = e1Var.f145250v;
            this.D = str2;
            com.tencent.mm.plugin.luckymoney.ui.ap apVar = this.f145987J;
            apVar.f146725e = str2;
            apVar.f146730m = e1Var.f145233J;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (e1Var.f145233J == 2) {
                this.f145989h.setImageResource(com.tencent.mm.R.drawable.c9b);
                if (e1Var.K != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "busi logo load from file:" + e1Var.K);
                    com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent = new com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent();
                    getFestivalLuckyMoneyResEvent.f54394g.getClass();
                    getFestivalLuckyMoneyResEvent.f192364d = new com.tencent.mm.plugin.luckymoney.ui.s(this, getFestivalLuckyMoneyResEvent, e1Var);
                    getFestivalLuckyMoneyResEvent.b(android.os.Looper.myLooper());
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f145240m)) {
                    com.tencent.mm.plugin.luckymoney.model.m5.b(this.f145989h, e1Var.f145240m, e1Var.Q);
                }
            } else {
                com.tencent.mm.plugin.luckymoney.model.m5.b(this.f145989h, e1Var.f145240m, e1Var.Q);
            }
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, this.f145990i, e1Var.f145239i);
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, this.f145991m, e1Var.f145238h);
            if (e1Var.A != 2 || this.B == 3) {
                android.view.View view2 = this.f145992n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f145993o.setText(com.tencent.mm.wallet_core.ui.r1.o(e1Var.f145245q / 100.0d));
                if (e1Var.f145251w != 1) {
                    this.f145987J.f146726f = true;
                } else {
                    this.f145987J.f146726f = false;
                }
                android.view.View view3 = this.f145992n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.E)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeWording is empty");
                android.view.View view4 = this.f145995q;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view5 = this.f145995q;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f145996r.setText(e1Var.E);
                if (e1Var.D == 1) {
                    if (android.text.TextUtils.isEmpty(e1Var.N) || e1Var.N.startsWith("weixin://wxpay")) {
                        this.f145997s.setVisibility(8);
                    } else {
                        this.f145997s.setVisibility(0);
                    }
                    this.f145996r.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.t(this, e1Var, context));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.jumpChange is false");
                    this.f145996r.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479367xm));
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f145254z)) {
                this.f145999u.setText((java.lang.CharSequence) null);
            } else {
                this.f145999u.setText(e1Var.f145254z);
            }
            java.util.LinkedList linkedList = e1Var.F;
            if (linkedList != null && linkedList.size() > 0) {
                android.view.View findViewById = this.f146002x.findViewById(com.tencent.mm.R.id.b2k);
                android.view.View findViewById2 = this.f146002x.findViewById(com.tencent.mm.R.id.b2l);
                android.view.View findViewById3 = this.f146002x.findViewById(com.tencent.mm.R.id.b2m);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f146002x.findViewById(com.tencent.mm.R.id.b2h);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f146002x.findViewById(com.tencent.mm.R.id.b2i);
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f146002x.findViewById(com.tencent.mm.R.id.b2j);
                android.view.View findViewById4 = this.f146002x.findViewById(com.tencent.mm.R.id.b2c);
                android.view.View findViewById5 = this.f146002x.findViewById(com.tencent.mm.R.id.b2d);
                com.tencent.mm.plugin.luckymoney.ui.ok okVar3 = new com.tencent.mm.plugin.luckymoney.ui.ok();
                okVar3.f147283a = getResources().getColor(com.tencent.mm.R.color.f479347x2);
                okVar3.f147285c = true;
                okVar3.f147287e = e1Var.K;
                okVar3.f147286d = this.G;
                if (linkedList.size() > 0) {
                    com.tencent.mm.plugin.luckymoney.ui.rk.a(this, viewGroup, (com.tencent.mm.plugin.luckymoney.model.o6) linkedList.get(0), okVar3);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    okVar = okVar3;
                    view = findViewById3;
                    yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    okVar = okVar3;
                    view = findViewById3;
                }
                if (linkedList.size() > 1) {
                    okVar2 = okVar;
                    com.tencent.mm.plugin.luckymoney.ui.rk.a(this, viewGroup2, (com.tencent.mm.plugin.luckymoney.model.o6) linkedList.get(1), okVar2);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    okVar2 = okVar;
                }
                if (linkedList.size() > 2) {
                    com.tencent.mm.plugin.luckymoney.ui.rk.a(this, viewGroup3, (com.tencent.mm.plugin.luckymoney.model.o6) linkedList.get(2), okVar2);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    android.view.View view6 = view;
                    yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById.getVisibility() == 0 && (findViewById2.getVisibility() == 0 || view.getVisibility() == 0)) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(findViewById4, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2.getVisibility() == 0 && view.getVisibility() == 0) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(findViewById5, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById.getVisibility() == 0 || findViewById2.getVisibility() == 0 || view.getVisibility() == 0) {
                    this.f146000v.requestLayout();
                    android.view.View view7 = this.f146000v;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view7, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) this.f145998t.findViewById(com.tencent.mm.R.id.b2e);
            com.tencent.mm.plugin.luckymoney.ui.ok okVar4 = new com.tencent.mm.plugin.luckymoney.ui.ok();
            okVar4.f147283a = getResources().getColor(com.tencent.mm.R.color.f479347x2);
            okVar4.f147284b = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479929j9);
            com.tencent.mm.plugin.luckymoney.ui.rk.a(this, viewGroup4, e1Var.G, okVar4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(e1Var.f145233J == 2 ? 13 : 7), 0, 0, 0, 1);
        }
        int i18 = e1Var.f145235e;
        boolean z17 = (i18 == 3 || i18 == 2) && e1Var.f145252x == 1 && !this.f146004z && e1Var.B == 1;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var2 = e1Var.C;
        boolean z18 = (h0Var2 == null || h0Var2.f145304d != 1 || com.tencent.mm.sdk.platformtools.t8.K0(h0Var2.f145305e)) ? false : true;
        android.widget.TextView textView = (android.widget.TextView) this.f145998t.findViewById(com.tencent.mm.R.id.b2r);
        if (z17 || z18) {
            textView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.u(this, e1Var));
            if (z18) {
                com.tencent.mm.plugin.luckymoney.model.h0 h0Var3 = e1Var.C;
                this.F = h0Var3.f145305e;
                textView.setText(h0Var3.f145306f);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(e1Var.f145233J == 2 ? 13 : 7), 0, 0, 0, 2);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.f145998t.findViewById(com.tencent.mm.R.id.b2o);
        int i19 = this.B;
        if (i19 == 1 || i19 == 3 || textView.getVisibility() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.v(this, e1Var));
            textView2.setVisibility(0);
        }
        if (!this.L) {
            this.f145988g.addFooterView(this.f145998t);
            this.L = true;
        }
        java.util.LinkedList linkedList2 = e1Var.M;
        if (linkedList2 != null) {
            int i27 = 0;
            while (true) {
                int size = linkedList2.size();
                list = this.H;
                if (i27 >= size) {
                    break;
                }
                com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) linkedList2.get(i27);
                java.util.HashMap hashMap = (java.util.HashMap) this.I;
                if (!hashMap.containsKey(h5Var.f145317i)) {
                    ((java.util.LinkedList) list).add((com.tencent.mm.plugin.luckymoney.model.h5) linkedList2.get(i27));
                    hashMap.put(h5Var.f145317i, 1);
                }
                i27++;
            }
            this.f146003y += linkedList2.size();
            this.A = false;
            com.tencent.mm.plugin.luckymoney.ui.ap apVar2 = this.f145987J;
            if (list == null) {
                apVar2.getClass();
                new java.util.LinkedList();
            } else {
                apVar2.f146724d = list;
            }
            apVar2.notifyDataSetChanged();
        }
        java.lang.String str3 = e1Var.I;
        java.lang.String str4 = e1Var.P;
        this.f146001w.setImageResource(com.tencent.mm.R.drawable.c9a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "renderAdImage: no adImage");
            this.f146001w.setVisibility(8);
            i17 = 0;
        } else {
            new android.util.DisplayMetrics();
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics() != null) {
                android.view.ViewGroup.LayoutParams layoutParams = this.f146001w.getLayoutParams();
                layoutParams.height = (int) (((r2.widthPixels - (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4k) * 2)) - (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4j) * 2)) * 0.75f);
                this.f146001w.setLayoutParams(layoutParams);
            }
            i17 = 0;
            com.tencent.mm.plugin.luckymoney.model.m5.u(this.f146001w, str3, str4, false);
            this.f146001w.setVisibility(0);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[i17] = java.lang.Integer.valueOf(this.G);
        objArr[1] = 1;
        objArr[2] = e1Var.I;
        java.util.LinkedList linkedList3 = e1Var.F;
        if (linkedList3 == null || linkedList3.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            for (int i28 = i17; i28 < linkedList3.size(); i28++) {
                com.tencent.mm.plugin.luckymoney.model.o6 o6Var = (com.tencent.mm.plugin.luckymoney.model.o6) linkedList3.get(i28);
                if (o6Var != null) {
                    if (i28 != 0) {
                        sb6.append("|");
                    }
                    sb6.append(o6Var.f145519f);
                    sb6.append("|");
                    sb6.append(o6Var.f145518e);
                }
            }
            str = sb6.toString();
        }
        objArr[3] = str;
        objArr[4] = "";
        objArr[5] = "";
        objArr[6] = "";
        objArr[7] = "";
        objArr[8] = e1Var.f145239i;
        objArr[9] = java.lang.Integer.valueOf(e1Var.K);
        g0Var.d(13051, objArr);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f145994p.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f145994p.setVisibility(8);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.M) {
            super.finish();
            return;
        }
        if (!getIntent().hasExtra("key_realname_guide_helper")) {
            super.finish();
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getIntent().getParcelableExtra("key_realname_guide_helper");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
        bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
        boolean a17 = realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.luckymoney.ui.r(this), null);
        getIntent().removeExtra("key_realname_guide_helper");
        if (a17) {
            return;
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489239bu2;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.lang.String str = this.F;
                if (str == null || !str.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")) {
                    doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(stringExtra.replaceAll(",", "|"), this.C, 1, "v1.0"));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "Not expected branch since 2015 fesitval");
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f145994p;
        if (luckyMoneyWishFooter == null || luckyMoneyWishFooter.f146683r == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "commentfooter release");
        luckyMoneyWishFooter.f146683r.l();
        luckyMoneyWishFooter.f146683r.a();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5) {
            if (i17 != 0 || i18 != 0) {
                db5.e1.T(this, str);
                return true;
            }
            com.tencent.mm.plugin.luckymoney.model.v5 v5Var = (com.tencent.mm.plugin.luckymoney.model.v5) m1Var;
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var = v5Var.f145665h;
            this.K = v5Var.f145666i;
            X6(e1Var);
            return true;
        }
        int i19 = 0;
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.e6)) {
            if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.n6)) {
                return false;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
                return true;
            }
            db5.e1.T(this, str);
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return true;
        }
        db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
        this.f145987J.f146726f = false;
        V6();
        com.tencent.mm.plugin.luckymoney.model.e6 e6Var = (com.tencent.mm.plugin.luckymoney.model.e6) m1Var;
        java.util.List list = this.H;
        if (list != null) {
            while (true) {
                if (i19 >= ((java.util.LinkedList) list).size()) {
                    break;
                }
                com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) ((java.util.LinkedList) list).get(i19);
                if (h5Var.f145317i.equalsIgnoreCase(e6Var.f145263h)) {
                    h5Var.f145316h = e6Var.f145264i;
                    this.f145987J.notifyDataSetChanged();
                    break;
                }
                i19++;
            }
        }
        return true;
    }
}
