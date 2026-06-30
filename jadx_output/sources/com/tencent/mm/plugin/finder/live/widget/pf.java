package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pf extends com.tencent.mm.plugin.finder.live.widget.h1 implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final android.view.View B;
    public final android.widget.TextView C;
    public final android.view.View D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f119381z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119381z = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqb, (android.view.ViewGroup) this, false);
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.drg);
        this.A = findViewById;
        android.view.View findViewById2 = getRoot().findViewById(com.tencent.mm.R.id.dre);
        this.B = findViewById2;
        this.C = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.dri);
        this.D = getRoot().findViewById(com.tencent.mm.R.id.krc);
        this.E = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.ds6);
        android.widget.TextView joinBtn = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.f485447hp5);
        this.F = joinBtn;
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        joinBtn.setOnClickListener(this);
        kotlin.jvm.internal.o.f(joinBtn, "joinBtn");
        setTextBold(joinBtn);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.h1
    public void c() {
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
        java.lang.String string;
        kotlin.jvm.internal.o.g(business, "business");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        setBuContext(business);
        setNeedPurcahse(z17);
        setFromGiftPanel(fromScene == com.tencent.mm.plugin.finder.live.plugin.eh0.f112417g);
        setFromScene(fromScene);
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
        android.widget.TextView textView = this.C;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string2, textSize));
        android.content.Context context3 = getRoot().getContext();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.eq1 eq1Var2 = ((mm2.n2) business.a(mm2.n2.class)).f329279g;
        objArr2[0] = java.lang.Integer.valueOf(eq1Var2 != null ? eq1Var2.getInteger(2) : 0);
        this.E.setText(context3.getString(com.tencent.mm.R.string.f491528de4, objArr2));
        zl2.r4 r4Var = zl2.r4.f473950a;
        setFollow(r4Var.q1(business));
        boolean follow = getFollow();
        android.widget.TextView textView2 = this.F;
        if (follow) {
            if (z17) {
                android.view.View view = this.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(getContext().getString(com.tencent.mm.R.string.dem));
            } else {
                android.view.View view2 = this.D;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(getContext().getString(com.tencent.mm.R.string.f491531lu4));
            }
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327616i, java.lang.Boolean.valueOf(z17), getFromScene());
        } else {
            if (z17) {
                android.view.View view3 = this.D;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view4 = this.D;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView2.setText(getContext().getString(com.tencent.mm.R.string.del));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327614g, null, getFromScene(), 2, null);
        }
        com.tencent.mm.plugin.finder.live.widget.io ioVar = new com.tencent.mm.plugin.finder.live.widget.io(getContext());
        android.view.View root = getRoot();
        kotlin.jvm.internal.o.f(root, "<get-root>(...)");
        r4Var.Q2(root);
        ioVar.k(getRoot());
        ioVar.B.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
        ioVar.s();
        setBottomSheet(ioVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.h1
    public android.view.View getRoot() {
        return this.f119381z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.drg) {
            d();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dre) {
            yz5.a helpClickListener = getHelpClickListener();
            if (helpClickListener != null) {
                helpClickListener.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f485447hp5) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f361767a >= 500) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                z17 = true;
            }
            qd2.h.f361767a = currentTimeMillis;
            if (z17) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (getFollow()) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327617m, java.lang.Boolean.valueOf(getNeedPurcahse()), getFromScene());
                c();
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f327615h, java.lang.Boolean.valueOf(getNeedPurcahse()), getFromScene());
                b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
