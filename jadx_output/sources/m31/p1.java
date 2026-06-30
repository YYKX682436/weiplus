package m31;

/* loaded from: classes9.dex */
public class p1 implements fl1.b2 {
    public final android.widget.CheckBox A;
    public final android.widget.TextView B;
    public final android.view.View C;
    public android.view.View D;
    public final java.util.List E;
    public boolean F;
    public java.lang.Integer G;
    public fl1.g2 H;
    public final m31.p0 I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f323179J;
    public boolean K;
    public m31.o0 L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public boolean Q;
    public java.lang.String R;
    public boolean S;
    public java.lang.String T;
    public java.lang.String U;
    public int V;
    public m31.e1 W;
    public int X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f323180d;

    /* renamed from: e, reason: collision with root package name */
    public final m31.c1 f323181e;

    /* renamed from: f, reason: collision with root package name */
    public final m31.d1 f323182f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f323183g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f323184h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ScrollView f323185i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f323186m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f323187n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f323188o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f323189p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f323190q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.Button f323191r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f323192s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f323193t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.FrameLayout f323194u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f323195v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f323196w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f323197x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f323198y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f323199z;

    public p1(android.content.Context context, java.util.List items, m31.c1 c1Var, boolean z17, boolean z18, m31.d1 d1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(items, "items");
        this.f323180d = context;
        this.f323181e = c1Var;
        this.f323182f = d1Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cx_, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f323183g = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.E = arrayList;
        m31.p0 p0Var = m31.p0.f323175d;
        this.I = p0Var;
        this.M = "";
        this.N = "";
        this.P = "";
        this.Q = true;
        this.R = "";
        this.S = true;
        this.T = "";
        this.U = "";
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.hia);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f323184h = frameLayout;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.mcm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f323185i = (android.widget.ScrollView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f323186m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f482424e6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f323187n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f323189p = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.o_1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f323190q = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.a1p);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f323188o = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.cz6);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById8;
        this.f323191r = button;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.czm);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById9;
        this.f323192s = button2;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.m9j);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f323193t = findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.m9l);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.czz);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById12;
        this.f323194u = frameLayout2;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.czy);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f323195v = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.bzv);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f323196w = findViewById14;
        findViewById14.setContentDescription(context.getString(com.tencent.mm.R.string.f490018im));
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.f482950sn);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f323197x = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.tencent.mm.R.id.ki8);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f323199z = findViewById16;
        android.view.View findViewById17 = inflate.findViewById(com.tencent.mm.R.id.f482949sm);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.A = (android.widget.CheckBox) findViewById17;
        android.view.View findViewById18 = inflate.findViewById(com.tencent.mm.R.id.f482951so);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById18;
        this.f323198y = textView;
        android.view.View findViewById19 = inflate.findViewById(com.tencent.mm.R.id.f487375og4);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.C = findViewById19;
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new m31.h0(this));
        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new m31.i0(this));
        arrayList.addAll(items);
        if (z17) {
            this.I = m31.p0.f323176e;
            frameLayout.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById19, arrayList2.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById19, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById19.setOnClickListener(new m31.j0(this, items));
        } else if (z18) {
            this.I = m31.p0.f323177f;
            java.lang.Object obj = items.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestDialog.ItemWithVoice");
            m31.a1 a1Var = (m31.a1) obj;
            frameLayout.removeAllViews();
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cxc, (android.view.ViewGroup) null);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate2.findViewById(com.tencent.mm.R.id.ntc);
            mMSwitchBtn.setVisibility(0);
            mMSwitchBtn.setCheck(false);
            mMSwitchBtn.setSwitchListener(new m31.g1(a1Var));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.f485290h63);
            weImageView.setVisibility(8);
            java.lang.String str = a1Var.f323118e;
            if (!(str == null || str.length() == 0)) {
                weImageView.setVisibility(0);
                weImageView.setOnClickListener(new m31.i1(a1Var, this));
            }
            ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f484050cu2)).setText(context.getString(com.tencent.mm.R.string.akl));
            m31.j1 j1Var = new m31.j1(this);
            int applyDimension = (int) android.util.TypedValue.applyDimension(1, 56.0f, context.getResources().getDisplayMetrics());
            linearLayout.addView((android.view.View) j1Var.invoke());
            linearLayout.addView(inflate2, new android.view.ViewGroup.LayoutParams(-1, applyDimension));
            linearLayout.addView((android.view.View) j1Var.invoke());
            frameLayout.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        } else {
            this.I = p0Var;
            c(items);
        }
        button2.setOnClickListener(new m31.k0(this));
        button.setOnClickListener(new m31.l0(this));
        findViewById16.setOnClickListener(new m31.m0(this, items));
        textView.setOnClickListener(new m31.n0(this));
        this.X = 2;
    }

    @Override // fl1.b2
    public boolean a() {
        if (!this.F) {
            return false;
        }
        o(false, new m31.l1(this));
        this.F = false;
        return true;
    }

    public final void b(android.content.Context context) {
        boolean z17 = this.K;
        android.widget.FrameLayout frameLayout = this.f323184h;
        if (!z17) {
            android.view.View view = this.D;
            if (view == null || frameLayout.indexOfChild(view) <= -1) {
                return;
            }
            frameLayout.removeView(view);
            return;
        }
        android.view.View view2 = this.D;
        if (view2 != null) {
            if (frameLayout.indexOfChild(view2) > -1) {
                return;
            }
            frameLayout.addView(view2);
            return;
        }
        android.view.View view3 = new android.view.View(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) android.util.TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics()));
        layoutParams.gravity = 80;
        view3.setLayoutParams(layoutParams);
        view3.setBackgroundResource(com.tencent.mm.R.drawable.d9q);
        frameLayout.addView(view3);
        this.D = view3;
    }

    public final void c(java.util.List list) {
        android.content.Context context = this.f323180d;
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        android.widget.FrameLayout frameLayout = this.f323184h;
        frameLayout.removeAllViews();
        frameLayout.addView(recyclerView, new android.view.ViewGroup.LayoutParams(-1, -2));
        b(context);
        recyclerView.setAdapter(new m31.y0(list, this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.N(new m31.f1(this));
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        f(2);
        dismiss();
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        h31.a aVar;
        fl1.g2 g2Var = this.H;
        if (g2Var != null) {
            g2Var.a(this);
        }
        m31.e1 e1Var = this.W;
        if (e1Var != null && (aVar = ((h31.p) e1Var).f278425a.f278434h) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onDismissDialog");
            int i17 = com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.f71874u;
            ((m31.y1) aVar).f323240a.getClass();
        }
        yz5.a aVar2 = this.f323179J;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final void e(int i17) {
        m31.v vVar = m31.w.f323224a;
        android.view.View view = this.f323183g;
        vVar.a(i17, view);
        android.widget.ScrollView scrollView = this.f323185i;
        android.view.View view2 = this.f323195v;
        if (i17 != 1 && i17 != 3) {
            android.widget.FrameLayout frameLayout = this.f323194u;
            if (frameLayout.indexOfChild(view2) == -1) {
                android.view.ViewParent parent = view2.getParent();
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view2);
                }
                frameLayout.addView(view2);
                scrollView.setVisibility(8);
            }
        } else if (scrollView.indexOfChild(view2) == -1) {
            android.view.ViewParent parent2 = view2.getParent();
            if (parent2 != null) {
                ((android.view.ViewGroup) parent2).removeView(view2);
            }
            scrollView.addView(view2);
            scrollView.setVisibility(0);
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new m31.k1(this));
    }

    public final void f(int i17) {
        com.tencent.mars.xlog.Log.i("SubscribeMsgRequestDialog", "dispatchEvent " + i17);
        m31.c1 c1Var = this.f323181e;
        if (c1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.E);
            c1Var.a(i17, arrayList);
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f323183g;
    }

    @Override // fl1.b2
    public int getPosition() {
        return this.X;
    }

    public final void h(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.P = value;
        android.view.View view = this.f323199z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f323197x.setText(this.P);
    }

    public final void i(int i17) {
        this.X = i17;
        android.content.Context context = this.f323180d;
        android.view.View view = this.f323183g;
        if (i17 == 1) {
            view.findViewById(com.tencent.mm.R.id.f484093d00).setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.b4m));
        } else {
            if (i17 != 2) {
                return;
            }
            view.findViewById(com.tencent.mm.R.id.f484093d00).setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.b4l));
        }
    }

    @Override // fl1.b2
    public boolean j() {
        return this instanceof h31.n;
    }

    public final void k(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.U = value;
        android.widget.TextView textView = this.f323190q;
        textView.setText(value);
        textView.setVisibility(this.U.length() == 0 ? 8 : 0);
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f323183g);
    }

    public final void o(boolean z17, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f323193t;
        android.widget.FrameLayout frameLayout = this.f323194u;
        if (z17) {
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, (android.util.Property<android.widget.FrameLayout, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, -frameLayout.getWidth()).setDuration(200L);
            duration.setInterpolator(new n31.a());
            android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, view.getWidth(), 0.0f).setDuration(200L);
            duration2.setInterpolator(new n31.a());
            animatorSet.playTogether(duration, duration2);
        } else {
            android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(frameLayout, (android.util.Property<android.widget.FrameLayout, java.lang.Float>) android.view.View.TRANSLATION_X, -frameLayout.getWidth(), 0.0f).setDuration(200L);
            duration3.setInterpolator(new n31.a());
            android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, view.getWidth()).setDuration(200L);
            duration4.setInterpolator(new n31.a());
            animatorSet.playTogether(duration3, duration4);
        }
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }

    @Override // fl1.b2
    public void onCancel() {
        f(2);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        l01.d0.f314761a.a(this.f323186m, this.M, this.V, new l01.n0());
        this.H = g2Var;
        java.lang.Object systemService = this.f323180d.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        e(((android.view.WindowManager) systemService).getDefaultDisplay().getRotation());
        m31.e1 e1Var = this.W;
        if (e1Var != null) {
            h31.r rVar = ((h31.p) e1Var).f278425a;
            h31.a aVar = rVar.f278434h;
            if (aVar != null) {
                fl1.c0 c0Var = rVar.f278439m;
                com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onShowDialog");
                int i17 = com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.f71874u;
                com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = ((m31.y1) aVar).f323240a;
                subscribeMsgRequestProxyUI.getClass();
                subscribeMsgRequestProxyUI.f71875d = c0Var;
            }
            j31.e.f297392a.c(1, rVar.f278445s);
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        e(i17);
    }
}
