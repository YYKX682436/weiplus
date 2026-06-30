package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rf extends com.tencent.mm.plugin.finder.live.widget.h1 implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final android.view.View B;
    public final android.view.View C;
    public final android.view.View D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f119635J;
    public final android.widget.TextView K;
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.TextView N;
    public final android.widget.TextView P;
    public final com.tencent.mm.ui.widget.imageview.WeImageView Q;
    public final com.tencent.mm.ui.widget.imageview.WeImageView R;
    public final android.widget.ImageView S;
    public final com.tencent.mm.ui.widget.imageview.WeImageView T;
    public final com.tencent.mm.ui.widget.imageview.WeImageView U;
    public final com.tencent.mm.ui.widget.imageview.WeImageView V;
    public int W;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f119636z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dit, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f119636z = inflate;
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.qld);
        this.A = findViewById;
        android.view.View findViewById2 = getRoot().findViewById(com.tencent.mm.R.id.qlf);
        this.B = findViewById2;
        android.view.View findViewById3 = getRoot().findViewById(com.tencent.mm.R.id.drg);
        this.C = findViewById3;
        android.view.View findViewById4 = getRoot().findViewById(com.tencent.mm.R.id.dre);
        this.D = findViewById4;
        this.E = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.dri);
        this.F = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.ds6);
        android.widget.TextView joinBtn = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.f485447hp5);
        this.G = joinBtn;
        android.widget.TextView textView = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.dqw);
        textView.setTextSize(1, 17.0f);
        this.H = textView;
        android.widget.TextView textView2 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qir);
        textView2.setTextSize(1, 32.0f);
        this.I = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qil);
        textView3.setTextSize(1, 17.0f);
        this.f119635J = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qis);
        textView4.setTextSize(1, 12.0f);
        this.K = textView4;
        android.widget.TextView textView5 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.f487182qq3);
        textView5.setTextSize(1, 17.0f);
        this.L = textView5;
        android.widget.TextView textView6 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qq7);
        textView6.setTextSize(1, 32.0f);
        this.M = textView6;
        android.widget.TextView textView7 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qpy);
        textView7.setTextSize(1, 17.0f);
        this.N = textView7;
        android.widget.TextView textView8 = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.qq8);
        textView8.setTextSize(1, 12.0f);
        this.P = textView8;
        this.Q = (com.tencent.mm.ui.widget.imageview.WeImageView) getRoot().findViewById(com.tencent.mm.R.id.qq6);
        this.R = (com.tencent.mm.ui.widget.imageview.WeImageView) getRoot().findViewById(com.tencent.mm.R.id.qiq);
        this.S = (android.widget.ImageView) getRoot().findViewById(com.tencent.mm.R.id.f487180qq1);
        this.T = (com.tencent.mm.ui.widget.imageview.WeImageView) getRoot().findViewById(com.tencent.mm.R.id.qim);
        this.U = (com.tencent.mm.ui.widget.imageview.WeImageView) getRoot().findViewById(com.tencent.mm.R.id.qin);
        this.V = (com.tencent.mm.ui.widget.imageview.WeImageView) getRoot().findViewById(com.tencent.mm.R.id.f487181qq2);
        findViewById3.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        joinBtn.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        kotlin.jvm.internal.o.f(joinBtn, "joinBtn");
        setTextBold(joinBtn);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.h1
    public void c() {
        yg2.b bVar;
        if (this.W == 1) {
            d();
            gk2.e buContext = getBuContext();
            if (buContext == null || (bVar = buContext.f272475i) == null) {
                return;
            }
            kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.widget.qf(this, null), 3, null);
            return;
        }
        if (!getNeedPurcahse()) {
            kotlinx.coroutines.l.d(this.f118492i, null, null, new com.tencent.mm.plugin.finder.live.widget.d1(this, null), 3, null);
            return;
        }
        d();
        yz5.l joinClickListener = getJoinClickListener();
        if (joinClickListener != null) {
            joinClickListener.invoke(getFromScene());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.h1
    public void e(gk2.e business, boolean z17, com.tencent.mm.plugin.finder.live.plugin.eh0 fromScene) {
        kotlin.jvm.internal.o.g(business, "business");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        this.f118498r = business;
        this.f118499s = z17;
        this.f118500t = fromScene == com.tencent.mm.plugin.finder.live.plugin.eh0.f112417g;
        this.f118501u = fromScene;
        h(business, z17);
        com.tencent.mm.plugin.finder.live.widget.io ioVar = new com.tencent.mm.plugin.finder.live.widget.io(getContext());
        zl2.r4.f473950a.Q2(getRoot());
        ioVar.k(getRoot());
        ioVar.B.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
        ioVar.s();
        this.f118493m = ioVar;
        f(0);
    }

    public final void f(int i17) {
        this.W = i17;
        android.widget.TextView superFansNameTv = this.L;
        android.widget.TextView fansClubPrivilegeTv = this.K;
        android.widget.TextView fansClubDurationTv = this.f119635J;
        android.widget.TextView fansClubPriceTv = this.I;
        android.widget.TextView fansClubNameTv = this.H;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.V;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.U;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.T;
        android.widget.ImageView imageView = this.S;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.R;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.Q;
        android.view.View view = this.A;
        android.view.View view2 = this.B;
        if (i17 == 0) {
            view.setSelected(true);
            view2.setSelected(false);
            weImageView5.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            weImageView4.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            imageView.setImageResource(com.tencent.mm.R.raw.finder_super_fans_icon_unselected);
            weImageView3.setIconColor(android.graphics.Color.parseColor("#FFC300"));
            weImageView2.setIconColor(android.graphics.Color.parseColor("#0D7A7A7A"));
            weImageView.setIconColor(android.graphics.Color.parseColor("#0D000000"));
            kotlin.jvm.internal.o.f(fansClubNameTv, "fansClubNameTv");
            i(fansClubNameTv, true);
            kotlin.jvm.internal.o.f(fansClubPriceTv, "fansClubPriceTv");
            i(fansClubPriceTv, true);
            kotlin.jvm.internal.o.f(fansClubDurationTv, "fansClubDurationTv");
            i(fansClubDurationTv, true);
            kotlin.jvm.internal.o.f(fansClubPrivilegeTv, "fansClubPrivilegeTv");
            i(fansClubPrivilegeTv, true);
            kotlin.jvm.internal.o.f(superFansNameTv, "superFansNameTv");
            j(superFansNameTv, false);
            android.widget.TextView superFansPriceTv = this.M;
            kotlin.jvm.internal.o.f(superFansPriceTv, "superFansPriceTv");
            j(superFansPriceTv, false);
            android.widget.TextView superFansDurationTv = this.N;
            kotlin.jvm.internal.o.f(superFansDurationTv, "superFansDurationTv");
            j(superFansDurationTv, false);
            android.widget.TextView superFansPrivilegeTv = this.P;
            kotlin.jvm.internal.o.f(superFansPrivilegeTv, "superFansPrivilegeTv");
            j(superFansPrivilegeTv, false);
        } else {
            view2.setSelected(true);
            view.setSelected(false);
            weImageView5.setIconColor(android.graphics.Color.parseColor("#E4D18E"));
            weImageView4.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            imageView.setImageResource(com.tencent.mm.R.raw.finder_super_fans_icon_selected);
            weImageView3.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            weImageView2.setIconColor(android.graphics.Color.parseColor("#0D000000"));
            weImageView.setIconColor(android.graphics.Color.parseColor("#0D8E7036"));
            kotlin.jvm.internal.o.f(fansClubNameTv, "fansClubNameTv");
            i(fansClubNameTv, false);
            kotlin.jvm.internal.o.f(fansClubPriceTv, "fansClubPriceTv");
            i(fansClubPriceTv, false);
            kotlin.jvm.internal.o.f(fansClubDurationTv, "fansClubDurationTv");
            i(fansClubDurationTv, false);
            kotlin.jvm.internal.o.f(fansClubPrivilegeTv, "fansClubPrivilegeTv");
            i(fansClubPrivilegeTv, false);
            kotlin.jvm.internal.o.f(superFansNameTv, "superFansNameTv");
            j(superFansNameTv, true);
            android.widget.TextView superFansPriceTv2 = this.M;
            kotlin.jvm.internal.o.f(superFansPriceTv2, "superFansPriceTv");
            j(superFansPriceTv2, true);
            android.widget.TextView superFansDurationTv2 = this.N;
            kotlin.jvm.internal.o.f(superFansDurationTv2, "superFansDurationTv");
            j(superFansDurationTv2, true);
            android.widget.TextView superFansPrivilegeTv2 = this.P;
            kotlin.jvm.internal.o.f(superFansPrivilegeTv2, "superFansPrivilegeTv");
            j(superFansPrivilegeTv2, true);
        }
        g();
    }

    public final void g() {
        boolean follow = getFollow();
        android.widget.TextView textView = this.G;
        if (!follow) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.del));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327614g, null, getFromScene(), 2, null);
            return;
        }
        if (this.W != 0) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.lvf));
            return;
        }
        if (getNeedPurcahse()) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.dem));
        } else {
            textView.setText(getContext().getString(com.tencent.mm.R.string.f491531lu4));
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327616i, java.lang.Boolean.valueOf(getNeedPurcahse()), getFromScene());
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.h1
    public android.view.View getRoot() {
        return this.f119636z;
    }

    public final int getSelectedMode() {
        return this.W;
    }

    public void h(gk2.e business, boolean z17) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(business, "business");
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) business.a(mm2.c1.class)).f328852o);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getRoot().getContext();
        android.content.Context context2 = getRoot().getContext();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = "";
        objArr[0] = b17 != null ? b17.w0() : "";
        r45.eq1 eq1Var = ((mm2.n2) business.a(mm2.n2.class)).f329279g;
        if (eq1Var != null && (string = eq1Var.getString(0)) != null) {
            str = string;
        }
        objArr[1] = str;
        java.lang.String string2 = context2.getString(com.tencent.mm.R.string.ddy, objArr);
        android.widget.TextView textView = this.E;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string2, textSize));
        android.content.Context context3 = getRoot().getContext();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.eq1 eq1Var2 = ((mm2.n2) business.a(mm2.n2.class)).f329279g;
        objArr2[0] = java.lang.Integer.valueOf(eq1Var2 != null ? eq1Var2.getInteger(2) : 0);
        this.F.setText(context3.getString(com.tencent.mm.R.string.f491528de4, objArr2));
        setFollow(zl2.r4.f473950a.q1(business));
        g();
        android.widget.TextView textView2 = this.f119635J;
        android.widget.TextView textView3 = this.I;
        if (z17) {
            textView3.setText("1");
            textView2.setVisibility(0);
        } else {
            textView3.setText(getContext().getString(com.tencent.mm.R.string.lui));
            textView2.setVisibility(8);
        }
    }

    public final void i(android.widget.TextView textView, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.a3.e(com.tencent.mm.plugin.finder.live.util.a3.f115443a, textView, new java.util.LinkedList(kz5.c0.i("#FFFFFF", "#DCDCDC")), com.tencent.mm.plugin.finder.live.util.u2.f115715d, null, 4, null);
        } else {
            textView.getPaint().setShader(null);
        }
    }

    public final void j(android.widget.TextView textView, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.a3.e(com.tencent.mm.plugin.finder.live.util.a3.f115443a, textView, new java.util.LinkedList(kz5.c0.i("#FFF1C1", "#E4D18E")), com.tencent.mm.plugin.finder.live.util.u2.f115715d, null, 4, null);
        } else {
            textView.getPaint().setShader(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.drg) {
            d();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dre) {
            yz5.a helpClickListener = getHelpClickListener();
            if (helpClickListener != null) {
                helpClickListener.invoke();
            }
        } else {
            boolean z17 = false;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f485447hp5) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f361767a < 500) {
                    com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                    z17 = true;
                }
                qd2.h.f361767a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (getFollow()) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327617m, java.lang.Boolean.valueOf(getNeedPurcahse()), getFromScene());
                    c();
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327615h, java.lang.Boolean.valueOf(getNeedPurcahse()), getFromScene());
                    b();
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.qld) {
                f(0);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.qlf) {
                f(1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setSelectedMode(int i17) {
        this.W = i17;
    }
}
