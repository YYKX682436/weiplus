package qi2;

/* loaded from: classes10.dex */
public class n extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {
    public final yi2.b A;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f363577h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f363578i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f363579m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f363580n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363581o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f363582p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f363583q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f363584r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f363585s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f363586t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f363587u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f363588v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f363589w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f363590x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f363591y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f363592z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f363577h = pluginAbility;
        this.f363591y = jz5.h.b(new qi2.d(context, this));
        this.f363592z = jz5.h.b(new qi2.m(this, context));
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.tencent.mm.ui.bl.b(y().getContext()).y * 3) / 4;
        }
        this.A = new yi2.b(y(), pluginAbility.g(), new ii2.c(new ii2.a(context.getResources().getColor(com.tencent.mm.R.color.f479314vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f291621d, null, 8, null)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dnv;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f474017a;
        zl2.u4 u4Var = zl2.u4.f473990f;
        android.content.Context context = this.f118381d;
        return w4Var.b(com.tencent.mm.R.layout.dnv, root, false, u4Var, context, com.tencent.mm.ui.id.b(context));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f363590x;
        boolean b17 = kotlin.jvm.internal.o.b(valueOf, weImageView != null ? java.lang.Integer.valueOf(weImageView.getId()) : null);
        zh2.c cVar = this.f363577h;
        if (b17) {
            dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (u4Var != null) {
                ((ni2.x) ((jz5.n) this.f363591y).getValue()).g0(u4Var.f234168o);
            }
        } else {
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hrl) {
                fj2.s.f263183a.a(ml2.k1.f327642i);
                ((qi2.v) ((jz5.n) this.f363592z).getValue()).I(((mm2.y2) cVar.g().a(mm2.y2.class)).f329563p, true);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f487090qx4) {
                dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                if (u4Var2 != null && u4Var2.g()) {
                    dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                    if (u4Var3 != null && u4Var3.i()) {
                        qf2.y1 y1Var = (qf2.y1) cVar.getController(qf2.y1.class);
                        if (y1Var != null) {
                            qi2.e eVar = new qi2.e(this);
                            dk2.m mVar = ((mm2.y2) y1Var.business(mm2.y2.class)).f329568u;
                            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain , curBattle: " + ((mm2.o4) y1Var.business(mm2.o4.class)).Z + " setting: " + mVar);
                            if (mVar != null) {
                                com.tencent.mm.plugin.finder.live.util.y.d(y1Var, null, null, new qf2.h1(y1Var, mVar, mVar, eVar, null), 3, null);
                            }
                        }
                    } else {
                        qf2.y1 y1Var2 = (qf2.y1) cVar.getController(qf2.y1.class);
                        if (y1Var2 != null) {
                            qi2.f fVar = new qi2.f(this);
                            dk2.u4 u4Var4 = ((mm2.o4) y1Var2.business(mm2.o4.class)).Z;
                            dk2.m mVar2 = ((mm2.y2) y1Var2.business(mm2.y2.class)).f329568u;
                            if (u4Var4 != null && mVar2 != null) {
                                com.tencent.mm.plugin.finder.live.util.y.d(y1Var2, null, null, new qf2.j1(y1Var2, mVar2, fVar, null), 3, null);
                            }
                            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorStartCrossRoomBattle , curBattle: " + ((mm2.o4) y1Var2.business(mm2.o4.class)).Z + " setting: " + ((mm2.y2) y1Var2.business(mm2.y2.class)).f329568u);
                        }
                    }
                } else {
                    dk2.u4 u4Var5 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                    if (u4Var5 != null) {
                        int i17 = u4Var5.f234160g;
                        int i18 = u4Var5.f234161h;
                        java.lang.String str = u4Var5.f234162i;
                        if (str == null) {
                            str = "";
                        }
                        dk2.m mVar3 = new dk2.m(i17, i18, str, u4Var5.f234167n, u4Var5.f234166m, u4Var5.f234163j, u4Var5.f234168o);
                        qf2.y1 y1Var3 = (qf2.y1) cVar.getController(qf2.y1.class);
                        if (y1Var3 != null) {
                            y1Var3.e7(mVar3, new qi2.g(this));
                        }
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f6c) {
                a();
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fkk) {
                v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f363578i = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.hrl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363579m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f487090qx4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f363580n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.hqq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f363582p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.hqp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f363583q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.f6c);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f363584r = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.fkk);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f363585s = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.qvb);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f363586t = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.f487091qx5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f363587u = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.f487089qx3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f363589w = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.efe);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f363588v = findViewById10;
        this.f363590x = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.ook);
        android.view.View view = this.f363579m;
        if (view == null) {
            kotlin.jvm.internal.o.o("changeModeLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f363580n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("startPkLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f363584r;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("leftLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.widget.TextView textView = this.f363585s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        textView.setOnClickListener(this);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f363590x;
        if (weImageView != null) {
            weImageView.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f363582p;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerTitleText");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f363585s;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        android.widget.TextView textView4 = this.f363583q;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("battleStatusText");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f6b)).setIconColor(this.f118381d.getResources().getColor(com.tencent.mm.R.color.f479106q5));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        fj2.s sVar = fj2.s.f263183a;
        sVar.a(ml2.k1.f327643m);
        fj2.s.c(sVar, ml2.q2.D, null, null, 0, 0, 30, null);
        fj2.j jVar = fj2.j.f263174a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f363581o;
        android.content.Context context = this.f118381d;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.jdz);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f363581o = jVar.b(k0Var, context, string, new qi2.i(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        jz5.f0 f0Var;
        super.w();
        android.widget.TextView textView = this.f363585s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        android.content.Context context = this.f118381d;
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.jdz));
        android.widget.TextView textView2 = this.f363585s;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        textView2.setVisibility(0);
        android.view.View view = this.f363586t;
        if (view == null) {
            kotlin.jvm.internal.o.o("playOptionLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zh2.c cVar = this.f363577h;
        dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (u4Var.h()) {
                android.view.View view2 = this.f363586t;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("playOptionLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (u4Var.i()) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f363589w;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("startPkIcon");
                    throw null;
                }
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_refresh);
                android.widget.TextView textView3 = this.f363587u;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("startPkTextView");
                    throw null;
                }
                textView3.setText(context.getResources().getString(com.tencent.mm.R.string.d6v));
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f363589w;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("startPkIcon");
                    throw null;
                }
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_play);
                android.widget.TextView textView4 = this.f363587u;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("startPkTextView");
                    throw null;
                }
                textView4.setText(context.getResources().getString(com.tencent.mm.R.string.lzs));
            }
            java.lang.String string = u4Var.f234160g == 1 ? context.getResources().getString(com.tencent.mm.R.string.f491672dw1) : u4Var.f234166m == 3 ? context.getResources().getString(com.tencent.mm.R.string.m8r) : context.getResources().getString(com.tencent.mm.R.string.f491674dw4);
            kotlin.jvm.internal.o.d(string);
            java.lang.String string2 = u4Var.f234161h == 0 ? context.getResources().getString(com.tencent.mm.R.string.ljg) : context.getResources().getString(com.tencent.mm.R.string.lje);
            kotlin.jvm.internal.o.d(string2);
            android.widget.TextView textView5 = this.f363582p;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("headerTitleText");
                throw null;
            }
            textView5.setText(context.getResources().getString(com.tencent.mm.R.string.lzr, string, string2));
            java.lang.String string3 = u4Var.f234158e == 2 ? context.getResources().getString(com.tencent.mm.R.string.iqp) : context.getResources().getString(com.tencent.mm.R.string.lzt);
            kotlin.jvm.internal.o.d(string3);
            android.widget.TextView textView6 = this.f363583q;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("battleStatusText");
                throw null;
            }
            textView6.setText(string3);
            android.view.View view3 = this.f363588v;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("anchorAcceptHeaderLayout");
                throw null;
            }
            view3.getVisibility();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f363590x;
            if (weImageView3 != null) {
                weImageView3.setVisibility((u4Var.f() && u4Var.f234160g == 1 && ((mm2.c1) cVar.g().a(mm2.c1.class)).M) ? 0 : 8);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("VisitorPkPanelWidget", "curBattle is null", null);
        }
        this.A.a();
    }

    public final android.view.View y() {
        android.view.View view = this.f363578i;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    public void z() {
        this.A.a();
    }
}
