package qi2;

/* loaded from: classes10.dex */
public final class j1 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {
    public final kj2.o A;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f363535h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f363536i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f363537m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f363538n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363539o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f363540p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f363541q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f363542r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f363543s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f363544t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f363545u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f363546v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f363547w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f363548x;

    /* renamed from: y, reason: collision with root package name */
    public final nj2.p f363549y;

    /* renamed from: z, reason: collision with root package name */
    public final mj2.k f363550z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f363535h = pluginAbility;
        this.f363548x = jz5.h.b(new qi2.i1(this, context));
        android.view.View view = this.f363547w;
        if (view == null) {
            kotlin.jvm.internal.o.o("inviteListLayout");
            throw null;
        }
        this.A = new kj2.o(view, pluginAbility.g(), new qi2.y0(this), null, new qi2.z0(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            android.view.View view2 = this.f363536i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            layoutParams.height = (com.tencent.mm.ui.bl.b(view2.getContext()).y * 3) / 4;
        }
        gk2.e g17 = pluginAbility.g();
        android.view.View view3 = this.f363536i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        this.f363550z = new mj2.k(context, g17, view3, pluginAbility, userInterface, new qi2.x0(this));
        android.view.View view4 = this.f363536i;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view4.findViewById(com.tencent.mm.R.id.qv7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363549y = new nj2.p(view4, findViewById, pluginAbility.g(), userInterface);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dle;
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
        return w4Var.b(com.tencent.mm.R.layout.dle, root, false, u4Var, context, com.tencent.mm.ui.id.b(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.j1.onClick(android.view.View):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f363536i = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.hrl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363537m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f487090qx4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f363538n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.hqq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f363540p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.hqp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f363541q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.f6c);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f363542r = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.fkk);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f363543s = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.qvb);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f363544t = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.f487091qx5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f363545u = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.f487089qx3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f363546v = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.qtx);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f363547w = findViewById10;
        android.view.View view = this.f363537m;
        if (view == null) {
            kotlin.jvm.internal.o.o("changeModeLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f363538n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("startPkLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f363542r;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("leftLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.widget.TextView textView = this.f363543s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        textView.setOnClickListener(this);
        android.widget.TextView textView2 = this.f363540p;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerTitleText");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f363543s;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        android.widget.TextView textView4 = this.f363541q;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("battleStatusText");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f6b)).setIconColor(this.f118381d.getResources().getColor(com.tencent.mm.R.color.f479106q5));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        if (y()) {
            this.A.b();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        dk2.u4 u4Var = ((mm2.o4) this.f363535h.g().a(mm2.o4.class)).Z;
        boolean z17 = false;
        if (u4Var != null && u4Var.h()) {
            z17 = true;
        }
        android.content.Context context = this.f118381d;
        fj2.j jVar = fj2.j.f263174a;
        fj2.s sVar = fj2.s.f263183a;
        if (z17) {
            sVar.a(ml2.k1.f327644n);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f363539o;
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491476m35);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            this.f363539o = jVar.b(k0Var, context, string, new qi2.d1(this));
            return;
        }
        sVar.a(ml2.k1.f327643m);
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f363539o;
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.jdz);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f363539o = jVar.b(k0Var2, context, string2, new qi2.f1(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        jz5.f0 f0Var;
        super.w();
        android.widget.TextView textView = this.f363543s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        android.content.Context context = this.f118381d;
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.jdz));
        android.widget.TextView textView2 = this.f363543s;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("rightTextView");
            throw null;
        }
        textView2.setVisibility(0);
        android.view.View view = this.f363544t;
        if (view == null) {
            kotlin.jvm.internal.o.o("playOptionLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zh2.c cVar = this.f363535h;
        dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (u4Var.h()) {
                if (((mm2.e1) cVar.g().a(mm2.e1.class)).c7()) {
                    android.widget.TextView textView3 = this.f363543s;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("rightTextView");
                        throw null;
                    }
                    textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491476m35));
                } else {
                    android.widget.TextView textView4 = this.f363543s;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("rightTextView");
                        throw null;
                    }
                    textView4.setVisibility(8);
                }
                android.view.View view2 = this.f363544t;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("playOptionLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (u4Var.i()) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f363546v;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("startPkIcon");
                    throw null;
                }
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_refresh);
                android.widget.TextView textView5 = this.f363545u;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("startPkTextView");
                    throw null;
                }
                textView5.setText(context.getResources().getString(com.tencent.mm.R.string.d6v));
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f363546v;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("startPkIcon");
                    throw null;
                }
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_play);
                android.widget.TextView textView6 = this.f363545u;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("startPkTextView");
                    throw null;
                }
                textView6.setText(context.getResources().getString(com.tencent.mm.R.string.lzs));
            }
            java.lang.String string = u4Var.f234160g == 1 ? context.getResources().getString(com.tencent.mm.R.string.f491672dw1) : context.getResources().getString(com.tencent.mm.R.string.f491674dw4);
            kotlin.jvm.internal.o.d(string);
            java.lang.String string2 = u4Var.f234161h == 0 ? context.getResources().getString(com.tencent.mm.R.string.ljg) : context.getResources().getString(com.tencent.mm.R.string.lje);
            kotlin.jvm.internal.o.d(string2);
            android.widget.TextView textView7 = this.f363540p;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("headerTitleText");
                throw null;
            }
            textView7.setText(context.getResources().getString(com.tencent.mm.R.string.lzr, string, string2));
            java.lang.String string3 = u4Var.f234158e == 2 ? context.getResources().getString(com.tencent.mm.R.string.iqp) : context.getResources().getString(com.tencent.mm.R.string.lzt);
            kotlin.jvm.internal.o.d(string3);
            android.widget.TextView textView8 = this.f363541q;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("battleStatusText");
                throw null;
            }
            textView8.setText(string3);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("VisitorPkPanelWidget", "curBattle is null", null);
        }
        android.view.View view3 = this.f363547w;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("inviteListLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (y()) {
            this.A.f();
        }
        this.f363549y.n();
        this.f363550z.s();
    }

    public final boolean y() {
        zh2.c cVar = this.f363535h;
        return ((mm2.e1) cVar.g().a(mm2.e1.class)).c7() || ((mm2.c1) cVar.g().a(mm2.c1.class)).L;
    }

    public void z() {
        this.f363550z.r("onTimerUpdateData");
        nj2.p pVar = this.f363549y;
        pVar.getClass();
        pm0.v.X(new nj2.l(pVar));
        if (y()) {
            this.A.c();
        }
    }
}
