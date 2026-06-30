package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z60 extends android.widget.LinearLayout implements yf2.r {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f120532u = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f120533d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f120534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f120535f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.y0 f120536g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f120537h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f120538i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f120539m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.b60 f120540n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f120541o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.w50 f120542p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f120543q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f120544r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f120545s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f120546t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(android.content.Context context, java.lang.ref.WeakReference controllerRef) {
        super(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controllerRef, "controllerRef");
        boolean z17 = false;
        this.f120533d = controllerRef;
        this.f120535f = true;
        com.tencent.mm.plugin.finder.live.widget.w50 w50Var = new com.tencent.mm.plugin.finder.live.widget.w50(context);
        this.f120542p = w50Var;
        this.f120543q = "video";
        this.f120544r = kz5.p0.f313996d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.m09);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var = new com.tencent.mm.plugin.finder.live.widget.y50("video", string, w50Var.c(getController()));
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.otv);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = w50Var.f120146a.getString(com.tencent.mm.R.string.onn);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var2 = new com.tencent.mm.plugin.finder.live.widget.y50("co_live", string2, kz5.b0.c(new com.tencent.mm.plugin.finder.live.widget.x50("co_live_normal", string3, null, null, null, 28, null)));
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.ozb);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var3 = new com.tencent.mm.plugin.finder.live.widget.y50("chat_room", string4, w50Var.a());
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.epw);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var4 = new com.tencent.mm.plugin.finder.live.widget.y50("karaoke", string5, w50Var.b());
        java.lang.String string6 = context.getString(com.tencent.mm.R.string.m08);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        this.f120545s = kz5.c0.i(y50Var, y50Var2, y50Var3, y50Var4, new com.tencent.mm.plugin.finder.live.widget.y50("game", string6, kz5.b0.c(new com.tencent.mm.plugin.finder.live.widget.x50("game_widget", "选择游戏", null, null, null, 28, null))));
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eej, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487203vc1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120538i = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120539m = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487202vc0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120541o = findViewById3;
        int color = getContext().getColor(com.tencent.mm.R.color.f478491c);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: BG_2 color resource ID = 2131099660");
        java.lang.String format = java.lang.String.format("#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(color)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Actual color value = ".concat(format));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color alpha = " + ((color >>> 24) & 255));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color red = " + ((color >>> 16) & 255));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color green = " + ((color >>> 8) & 255));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color blue = " + (color & 255));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Current UI mode = ".concat((getContext().getResources().getConfiguration().uiMode & 48) == 32 ? "NIGHT" : "DAY"));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(getContext().getResources().getDisplayMetrics().density * 12.0f);
        setBackground(gradientDrawable);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f120538i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("tabRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        com.tencent.mm.plugin.finder.live.widget.b60 b60Var = new com.tencent.mm.plugin.finder.live.widget.b60(this, new com.tencent.mm.plugin.finder.live.widget.s60(this));
        this.f120540n = b60Var;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f120538i;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("tabRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(b60Var);
        yf2.m1 m1Var = (yf2.m1) controllerRef.get();
        java.util.List i17 = i(m1Var != null ? m1Var.f461749n : null);
        this.f120544r = i17;
        com.tencent.mm.plugin.finder.live.widget.b60 b60Var2 = this.f120540n;
        if (b60Var2 == null) {
            kotlin.jvm.internal.o.o("tabAdapter");
            throw null;
        }
        b60Var2.f117841e = i17;
        b60Var2.notifyDataSetChanged();
        f();
        e();
        p();
        yf2.m1 controller = getController();
        if (controller != null) {
            yf2.t tVar = controller.f461751p;
            tVar.getClass();
            java.util.List list = tVar.f461787a;
            kz5.h0.B(list, yf2.s.f461780d);
            if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((java.lang.ref.WeakReference) it.next()).get(), this)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                ((java.util.ArrayList) list).add(new java.lang.ref.WeakReference(this));
            }
        }
    }

    public static final boolean a(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        yf2.m1 controller = z60Var.getController();
        return controller != null && zl2.r4.f473950a.G1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) controller.business(mm2.g1.class)).f329068f).getValue());
    }

    public static final void b(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        z60Var.getClass();
        com.tencent.mm.plugin.finder.live.widget.r60 r60Var = new com.tencent.mm.plugin.finder.live.widget.r60(z60Var);
        yf2.m1 controller = z60Var.getController();
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = z60Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!r4Var.Y1(context) || controller == null) {
            r60Var.invoke();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "openPreparePanelSafely: landscape, defer open via portraitCallback");
            controller.f291101g = r60Var;
        }
    }

    public static final void c(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        z60Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "Show game selection dialog");
        yf2.m1 controller = z60Var.getController();
        if (controller != null) {
            controller.c7();
        }
    }

    public static final void d(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, java.lang.String str) {
        r45.q12 b76;
        java.lang.String str2;
        z60Var.getClass();
        switch (str.hashCode()) {
            case -936045084:
                if (!str.equals("karaoke")) {
                    return;
                }
                break;
            case 3165170:
                if (str.equals("game")) {
                    z60Var.s();
                    return;
                }
                return;
            case 112202875:
                if (!str.equals("video")) {
                    return;
                }
                break;
            case 937443551:
                if (!str.equals("co_live")) {
                    return;
                }
                break;
            case 1620049250:
                if (!str.equals("chat_room")) {
                    return;
                }
                break;
            default:
                return;
        }
        yf2.m1 controller = z60Var.getController();
        if (controller != null && (b76 = controller.b7()) != null && (str2 = (java.lang.String) z60Var.f120542p.e(b76).f302834e) != null) {
            z60Var.t(str2);
        }
        z60Var.q();
    }

    private final yf2.m1 getController() {
        return (yf2.m1) this.f120533d.get();
    }

    private final java.lang.String getNextTabToShow() {
        java.util.Iterator it = this.f120544r.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) it.next()).f120415a, this.f120543q)) {
                break;
            }
            i17++;
        }
        return i17 >= this.f120544r.size() + (-1) ? i17 > 0 ? ((com.tencent.mm.plugin.finder.live.widget.y50) this.f120544r.get(i17 - 1)).f120415a : "" : ((com.tencent.mm.plugin.finder.live.widget.y50) this.f120544r.get(i17 + 1)).f120415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.z60.e():void");
    }

    public final void f() {
        android.view.View h17 = h("video");
        android.widget.LinearLayout linearLayout = this.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout.addView(h17);
        android.view.View h18 = h("chat_room");
        android.widget.LinearLayout linearLayout2 = this.f120539m;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout2.addView(h18);
        android.view.View h19 = h("karaoke");
        android.widget.LinearLayout linearLayout3 = this.f120539m;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout3.addView(h19);
        android.view.View h27 = h("game");
        android.widget.LinearLayout linearLayout4 = this.f120539m;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout4.addView(h27);
        android.view.View h28 = h("co_live");
        android.widget.LinearLayout linearLayout5 = this.f120539m;
        if (linearLayout5 != null) {
            linearLayout5.addView(h28);
        } else {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
    }

    public final android.view.View g(com.tencent.mm.plugin.finder.live.widget.x50 x50Var, boolean z17) {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        android.widget.LinearLayout linearLayout = this.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.eas, (android.view.ViewGroup) linearLayout, false);
        if (inflate != null) {
            inflate.setTag(x50Var.f120294a);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kk9);
        if (textView != null) {
            textView.setText(x50Var.f120295b);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f486199kk2);
        yz5.a aVar = x50Var.f120298e;
        boolean booleanValue = aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false;
        java.lang.Integer num = x50Var.f120296c;
        if (num != null) {
            imageView.setImageResource(num.intValue());
            if (kotlin.jvm.internal.o.b(x50Var.f120294a, "landscape")) {
                imageView.setRotation(90.0f);
            } else {
                imageView.setRotation(0.0f);
            }
            com.tencent.mm.plugin.finder.live.widget.s50 s50Var = com.tencent.mm.plugin.finder.live.widget.s50.f119723a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            s50Var.a(inflate, context, false, booleanValue);
        } else {
            imageView.setVisibility(8);
        }
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            }
            layoutParams2.setMarginEnd((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
            inflate.setLayoutParams(layoutParams2);
        }
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.i60(this, x50Var));
        return inflate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View h(java.lang.String str) {
        android.view.View view;
        java.lang.Object obj;
        android.view.View view2;
        java.util.List list;
        java.lang.Object obj2;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var;
        java.lang.Object obj3;
        java.util.List list2;
        android.util.AttributeSet attributeSet = null;
        switch (str.hashCode()) {
            case -936045084:
                if (str.equals("karaoke")) {
                    view = new android.view.View(getContext());
                    view.setTag(str);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 3165170:
                if (str.equals("game")) {
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
                    android.widget.LinearLayout linearLayout = this.f120539m;
                    if (linearLayout == null) {
                        kotlin.jvm.internal.o.o("contentContainer");
                        throw null;
                    }
                    view = from.inflate(com.tencent.mm.R.layout.e_n, (android.view.ViewGroup) linearLayout, false);
                    view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.h60(this));
                    view.setTag(str);
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22 = zj0.c.f473285a;
                    arrayList22.add(8);
                    java.util.Collections.reverse(arrayList22);
                    yj0.a.d(view, arrayList22.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal222 = zj0.c.f473285a;
                arrayList222.add(8);
                java.util.Collections.reverse(arrayList222);
                yj0.a.d(view, arrayList222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 112202875:
                if (str.equals("video")) {
                    java.util.Iterator it = this.f120544r.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) obj).f120415a, "video")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    com.tencent.mm.plugin.finder.live.widget.y50 y50Var = (com.tencent.mm.plugin.finder.live.widget.y50) obj;
                    if (y50Var == null || (list = y50Var.f120417c) == null) {
                        view2 = new android.view.View(getContext());
                    } else {
                        if (list.size() > 1) {
                            android.view.LayoutInflater from2 = android.view.LayoutInflater.from(getContext());
                            android.widget.LinearLayout linearLayout2 = this.f120539m;
                            if (linearLayout2 == null) {
                                kotlin.jvm.internal.o.o("contentContainer");
                                throw null;
                            }
                            view = from2.inflate(com.tencent.mm.R.layout.eat, (android.view.ViewGroup) linearLayout2, false);
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qmy);
                            int i17 = 0;
                            for (java.lang.Object obj4 : list) {
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                linearLayout3.addView(g((com.tencent.mm.plugin.finder.live.widget.x50) obj4, i17 < list.size() - 1));
                                i17 = i18;
                            }
                            view.setTag(str);
                            java.util.ArrayList arrayList2222 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2222 = zj0.c.f473285a;
                            arrayList2222.add(8);
                            java.util.Collections.reverse(arrayList2222);
                            yj0.a.d(view, arrayList2222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList2222.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return view;
                        }
                        view2 = new android.view.View(getContext());
                    }
                    view = view2;
                    view.setTag(str);
                    java.util.ArrayList arrayList22222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22222 = zj0.c.f473285a;
                    arrayList22222.add(8);
                    java.util.Collections.reverse(arrayList22222);
                    yj0.a.d(view, arrayList22222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList22222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal222222 = zj0.c.f473285a;
                arrayList222222.add(8);
                java.util.Collections.reverse(arrayList222222);
                yj0.a.d(view, arrayList222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 937443551:
                if (str.equals("co_live")) {
                    android.view.LayoutInflater from3 = android.view.LayoutInflater.from(getContext());
                    android.widget.LinearLayout linearLayout4 = this.f120539m;
                    if (linearLayout4 == null) {
                        kotlin.jvm.internal.o.o("contentContainer");
                        throw null;
                    }
                    view = from3.inflate(com.tencent.mm.R.layout.e9q, (android.view.ViewGroup) linearLayout4, false);
                    android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.sus);
                    kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                    android.widget.TextView textView = (android.widget.TextView) findViewById;
                    java.util.Iterator it6 = this.f120544r.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj2 = it6.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) obj2).f120415a, "co_live")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    com.tencent.mm.plugin.finder.live.widget.y50 y50Var2 = (com.tencent.mm.plugin.finder.live.widget.y50) obj2;
                    java.util.List list3 = y50Var2 != null ? y50Var2.f120417c : null;
                    if (list3 == null || (x50Var = (com.tencent.mm.plugin.finder.live.widget.x50) kz5.n0.Z(list3)) == null || (str2 = x50Var.f120295b) == null) {
                        str2 = "";
                    }
                    textView.setText(str2);
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.st_);
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars = new com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars(context, attributeSet, 2, null == true ? 1 : 0);
                    finderLiveColiveAnchorListAvatars.setScene(com.tencent.mm.plugin.finder.live.widget.ac.f117753d);
                    viewGroup.addView(finderLiveColiveAnchorListAvatars);
                    this.f120546t = new java.lang.ref.WeakReference(finderLiveColiveAnchorListAvatars);
                    r(finderLiveColiveAnchorListAvatars);
                    m(finderLiveColiveAnchorListAvatars);
                    view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.g60(this));
                    view.setTag(str);
                    java.util.ArrayList arrayList2222222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2222222 = zj0.c.f473285a;
                    arrayList2222222.add(8);
                    java.util.Collections.reverse(arrayList2222222);
                    yj0.a.d(view, arrayList2222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2222222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList22222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal22222222 = zj0.c.f473285a;
                arrayList22222222.add(8);
                java.util.Collections.reverse(arrayList22222222);
                yj0.a.d(view, arrayList22222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList22222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 1620049250:
                if (str.equals("chat_room")) {
                    java.util.Iterator it7 = this.f120544r.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj3 = it7.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) obj3).f120415a, "chat_room")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    com.tencent.mm.plugin.finder.live.widget.y50 y50Var3 = (com.tencent.mm.plugin.finder.live.widget.y50) obj3;
                    if (y50Var3 == null || (list2 = y50Var3.f120417c) == null) {
                        view = new android.view.View(getContext());
                    } else if (list2.size() > 1) {
                        android.view.LayoutInflater from4 = android.view.LayoutInflater.from(getContext());
                        android.widget.LinearLayout linearLayout5 = this.f120539m;
                        if (linearLayout5 == null) {
                            kotlin.jvm.internal.o.o("contentContainer");
                            throw null;
                        }
                        view = from4.inflate(com.tencent.mm.R.layout.eat, (android.view.ViewGroup) linearLayout5, false);
                        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qmy);
                        int i19 = 0;
                        for (java.lang.Object obj5 : list2) {
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            linearLayout6.addView(g((com.tencent.mm.plugin.finder.live.widget.x50) obj5, i19 < list2.size() - 1));
                            i19 = i27;
                        }
                    } else {
                        view = new android.view.View(getContext());
                    }
                    view.setTag(str);
                    java.util.ArrayList arrayList222222222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal222222222 = zj0.c.f473285a;
                    arrayList222222222.add(8);
                    java.util.Collections.reverse(arrayList222222222);
                    yj0.a.d(view, arrayList222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList222222222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList2222222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2222222222 = zj0.c.f473285a;
                arrayList2222222222.add(8);
                java.util.Collections.reverse(arrayList2222222222);
                yj0.a.d(view, arrayList2222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2222222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            default:
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList22222222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal22222222222 = zj0.c.f473285a;
                arrayList22222222222.add(8);
                java.util.Collections.reverse(arrayList22222222222);
                yj0.a.d(view, arrayList22222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList22222222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0054. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v29, types: [r45.p12, com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.util.LinkedList r20) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.z60.i(java.util.LinkedList):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
    
        if (r13 != 16) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.z60.j(java.lang.String, java.lang.String):void");
    }

    public final void k(java.lang.String str) {
        if (isAttachedToWindow() && kotlin.jvm.internal.o.b(str, "video") && getController() != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            gVar.h("game_id", null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
        }
    }

    public final boolean l(r45.p12 p12Var, int i17, com.tencent.mm.plugin.finder.live.widget.x50 x50Var) {
        if (((x50Var != null ? x50Var.f120297d : null) == null || ((java.lang.Boolean) x50Var.f120297d.invoke()).booleanValue()) && p12Var != null) {
            return pm0.v.z(p12Var.getInteger(3), i17);
        }
        return false;
    }

    public final void m(com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars) {
        try {
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
                kotlinx.coroutines.y0 y0Var = this.f120536g;
                if (y0Var == null) {
                    return;
                }
                kotlinx.coroutines.r2 r2Var = this.f120537h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f120537h = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.l60(n0Var, this, finderLiveColiveAnchorListAvatars, null), 3, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("Finder.FinderStartLiveModeTabWidget", "observeCoLiveSlice error", e17);
        }
    }

    public final void n(java.lang.String tabId, com.tencent.mm.plugin.finder.live.widget.t50 t50Var) {
        int i17;
        if (t50Var == com.tencent.mm.plugin.finder.live.widget.t50.f119869e) {
            if (!kotlin.jvm.internal.o.b(tabId, this.f120543q)) {
                k(tabId);
            }
            this.f120543q = tabId;
            com.tencent.mm.plugin.finder.live.widget.b60 b60Var = this.f120540n;
            if (b60Var == null) {
                kotlin.jvm.internal.o.o("tabAdapter");
                throw null;
            }
            kotlin.jvm.internal.o.g(tabId, "tabId");
            if (!kotlin.jvm.internal.o.b(b60Var.f117842f, tabId)) {
                java.util.Iterator it = b60Var.f117841e.iterator();
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i17 = -1;
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) it.next()).f120415a, b60Var.f117842f)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                java.util.Iterator it6 = b60Var.f117841e.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) it6.next()).f120415a, tabId)) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                b60Var.f117842f = tabId;
                if (i19 >= 0) {
                    b60Var.notifyItemChanged(i19);
                }
                if (i17 >= 0) {
                    b60Var.notifyItemChanged(i17);
                }
            }
            e();
        }
        if (t50Var == com.tencent.mm.plugin.finder.live.widget.t50.f119868d) {
            if (kotlin.jvm.internal.o.b(tabId, "video")) {
                ll2.e.d(ll2.e.f319133a, "startlive.more.video", false, false, 6, null);
            }
            j(tabId, null);
        }
    }

    public final void o() {
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 5);
        q12Var.set(1, 1);
        yf2.m1 controller = getController();
        if (controller != null) {
            controller.e7(q12Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars;
        super.onAttachedToWindow();
        if (this.f120536g == null) {
            this.f120536g = kotlinx.coroutines.z0.b();
            java.lang.ref.WeakReference weakReference = this.f120546t;
            if (weakReference != null && (finderLiveColiveAnchorListAvatars = (com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars) weakReference.get()) != null) {
                m(finderLiveColiveAnchorListAvatars);
            }
        }
        if ((this.f120543q.length() > 0) && this.f120535f) {
            this.f120535f = false;
            k(this.f120543q);
            if (kotlin.jvm.internal.o.b(this.f120543q, "video")) {
                ll2.e.d(ll2.e.f319133a, "startlive.more.video", false, false, 6, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.r2 r2Var = this.f120537h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f120537h = null;
        kotlinx.coroutines.y0 y0Var = this.f120536g;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f120536g = null;
    }

    public final void p() {
        r45.q12 b76;
        r45.q12 b77;
        yf2.m1 controller = getController();
        if (controller == null || (b76 = controller.b7()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.w50 w50Var = this.f120542p;
        jz5.l e17 = w50Var.e(b76);
        java.lang.String str = (java.lang.String) e17.f302833d;
        java.lang.String str2 = (java.lang.String) e17.f302834e;
        n(str, com.tencent.mm.plugin.finder.live.widget.t50.f119869e);
        if (str2 != null) {
            t(str2);
        }
        yf2.m1 controller2 = getController();
        if (controller2 == null || (b77 = controller2.b7()) == null) {
            return;
        }
        jz5.l e18 = w50Var.e(b77);
        java.lang.String str3 = (java.lang.String) e18.f302833d;
        if (kotlin.jvm.internal.o.b(str3, "game")) {
            s();
        }
    }

    public final void q() {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var;
        java.util.List list;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout = this.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.qmy);
        if (linearLayout2 != null) {
            n3.t1 t1Var = new n3.t1(linearLayout2);
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                java.lang.Object tag = view.getTag();
                java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                java.util.Iterator it = this.f120544r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) obj).f120415a, this.f120543q)) {
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.finder.live.widget.y50 y50Var = (com.tencent.mm.plugin.finder.live.widget.y50) obj;
                if (y50Var == null || (list = y50Var.f120417c) == null) {
                    x50Var = null;
                } else {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.x50) obj2).f120294a, str)) {
                                break;
                            }
                        }
                    }
                    x50Var = (com.tencent.mm.plugin.finder.live.widget.x50) obj2;
                }
                if (x50Var != null) {
                    yz5.a aVar = x50Var.f120298e;
                    boolean booleanValue = aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false;
                    boolean isSelected = view.isSelected();
                    com.tencent.mm.plugin.finder.live.widget.s50 s50Var = com.tencent.mm.plugin.finder.live.widget.s50.f119723a;
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    s50Var.a(view, context, isSelected, booleanValue);
                }
            }
        }
    }

    public final void r(com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars) {
        kotlinx.coroutines.flow.f3 f3Var;
        r45.f50 f50Var;
        try {
            gk2.e eVar = dk2.ef.I;
            mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
            if (n0Var != null && (f3Var = n0Var.f329265g) != null && (f50Var = (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) != null) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.util.List a17 = com.tencent.mm.plugin.finder.live.widget.v1.f120019f.a(f50Var, xy2.c.e(context));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((com.tencent.mm.plugin.finder.live.widget.v1) it.next()).f120022c;
                    if (str == null || !(!r26.n0.N(str))) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                finderLiveColiveAnchorListAvatars.setAvatars(arrayList);
                return;
            }
            finderLiveColiveAnchorListAvatars.setAvatars(kz5.p0.f313996d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("Finder.FinderStartLiveModeTabWidget", "updateCoLiveAvatars error", e17);
        }
    }

    public final void s() {
        java.lang.String str;
        java.lang.String string;
        r45.z53 z53Var;
        yf2.m1 controller = getController();
        if (controller != null) {
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) controller.business(mm2.g1.class)).f329071i).getValue();
            android.widget.LinearLayout linearLayout = this.f120539m;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("contentContainer");
                throw null;
            }
            android.view.View findViewWithTag = linearLayout.findViewWithTag("game");
            if (findViewWithTag != null) {
                android.view.View findViewById = findViewWithTag.findViewById(com.tencent.mm.R.id.gln);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
                android.view.View findViewById2 = findViewWithTag.findViewById(com.tencent.mm.R.id.gpb);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                android.widget.TextView textView = (android.widget.TextView) findViewById2;
                if (n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null || (str = z53Var.getString(1)) == null) {
                    str = "";
                }
                textView.setText(str);
                if (n73Var != null) {
                    i95.m c17 = i95.n0.c(vd2.i5.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    vd2.i5 i5Var = (vd2.i5) c17;
                    r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
                    vd2.i5.l8(i5Var, (z53Var2 == null || (string = z53Var2.getString(2)) == null) ? "" : string, imageView, null, 4, null);
                }
            }
        }
    }

    public final void t(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var;
        yz5.a aVar;
        java.util.List list;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout = this.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.qmy);
        if (linearLayout2 != null) {
            n3.t1 t1Var = new n3.t1(linearLayout2);
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                java.lang.Object tag = view.getTag();
                java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                boolean b17 = kotlin.jvm.internal.o.b(str2, str);
                view.setSelected(b17);
                java.util.Iterator it = this.f120544r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.y50) obj).f120415a, this.f120543q)) {
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.finder.live.widget.y50 y50Var = (com.tencent.mm.plugin.finder.live.widget.y50) obj;
                if (y50Var == null || (list = y50Var.f120417c) == null) {
                    x50Var = null;
                } else {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.live.widget.x50) obj2).f120294a, str2)) {
                                break;
                            }
                        }
                    }
                    x50Var = (com.tencent.mm.plugin.finder.live.widget.x50) obj2;
                }
                boolean booleanValue = (x50Var == null || (aVar = x50Var.f120298e) == null) ? false : ((java.lang.Boolean) aVar.invoke()).booleanValue();
                com.tencent.mm.plugin.finder.live.widget.s50 s50Var = com.tencent.mm.plugin.finder.live.widget.s50.f119723a;
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                s50Var.a(view, context, b17, booleanValue);
            }
        }
    }
}
