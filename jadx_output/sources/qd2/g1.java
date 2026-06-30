package qd2;

/* loaded from: classes10.dex */
public final class g1 {

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f361745u;

    /* renamed from: v, reason: collision with root package name */
    public static final float f361746v;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f361747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361748b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361749c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f361750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361751e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f361752f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckBox f361753g;

    /* renamed from: h, reason: collision with root package name */
    public y9.i f361754h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f361755i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.m f361756j;

    /* renamed from: k, reason: collision with root package name */
    public int f361757k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f361758l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f361759m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f361760n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f361761o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f361762p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ao2 f361763q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f361764r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f361765s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f361766t;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostOriginRuleUrl");
        if (d17 == null) {
            d17 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/GzdzwPjCFZDCZkmI";
        }
        com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_POST_ORIGIN_RULE_URL info = ".concat(d17));
        f361745u = d17;
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        f361746v = i18 * 0.75f;
    }

    public g1(android.content.Context context, int i17, long j17, java.lang.String exportId, boolean z17, int i18) {
        m92.b j37;
        r45.wn2 wn2Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(exportId, "exportId");
        this.f361747a = context;
        this.f361748b = i17;
        this.f361749c = j17;
        this.f361750d = z17;
        this.f361751e = i18;
        this.f361757k = -1;
        this.f361758l = new java.util.ArrayList();
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(context));
        boolean z18 = true;
        if (((b17 != null ? b17.field_additionalFlag : 0L) & 64) != 64) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127595a4).getValue()).r()).intValue() != 1) {
                z18 = false;
            }
        }
        this.f361760n = z18;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127614b4).getValue()).r()).intValue() != 3 || (j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null)) == null || (wn2Var = (r45.wn2) j37.u0().getCustom(28)) == null) {
            return;
        }
        wn2Var.getInteger(2);
    }

    public static final void a(qd2.g1 g1Var, java.lang.String str) {
        if (g1Var.f361756j == null) {
            oy2.g gVar = new oy2.g(g1Var.f361747a);
            com.tencent.mm.plugin.finder.view.m mVar = new com.tencent.mm.plugin.finder.view.m(gVar, str);
            g1Var.f361756j = mVar;
            mVar.f132621f = new qd2.c1(g1Var, str);
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout c17 = gVar.c();
            android.view.View findViewById = c17.findViewById(com.tencent.mm.R.id.l0w);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initAnnounceView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initAnnounceView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = c17.findViewById(com.tencent.mm.R.id.l0z);
            float dimension = f361746v - c17.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = (int) dimension;
            findViewById2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.finder.view.m mVar2 = g1Var.f361756j;
        if (mVar2 != null) {
            com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(mVar2.f132618c));
            com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "realShow");
            mVar2.f132616a.show();
        }
    }

    public final r45.ao2 b() {
        r45.wn2 wn2Var;
        java.util.LinkedList list;
        java.util.ArrayList arrayList = this.f361758l;
        int size = arrayList.size();
        int i17 = this.f361757k;
        java.lang.Object obj = null;
        if (!(i17 >= 0 && i17 < size)) {
            return null;
        }
        java.lang.Object obj2 = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        java.lang.String str = (java.lang.String) obj2;
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(this.f361747a), false, 2, null);
        if (j37 == null || (wn2Var = (r45.wn2) j37.u0().getCustom(28)) == null || (list = wn2Var.getList(0)) == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (r26.i0.q(((r45.ao2) next).getString(1), str, false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (r45.ao2) obj;
    }

    public final void c(android.view.View view, java.lang.String eventId) {
        java.lang.String str = this.f361750d ? "upgrade_original_right" : "set_original_statement";
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("original_statement_type", java.lang.Integer.valueOf(this.f361760n ? 1 : 0));
        r45.ao2 b17 = b();
        lVarArr[1] = new jz5.l("original_type", java.lang.Integer.valueOf(b17 != null ? b17.getInteger(0) : 0));
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(this.f361749c));
        lVarArr[3] = new jz5.l("original_statement_source_page", java.lang.Integer.valueOf(this.f361751e));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        hc2.v0.b(view, str, eventId, 0, k17, null, 20, null);
    }

    public final void d() {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = this.f361758l;
        int size = arrayList.size();
        int i17 = this.f361757k;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (textView = this.f361752f) == null) {
            return;
        }
        textView.setText((java.lang.CharSequence) arrayList.get(i17));
    }

    public final void e(boolean z17, boolean z18) {
        java.lang.String string;
        java.util.LinkedList list;
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        if (this.f361754h == null) {
            android.content.Context context = this.f361747a;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b5y, (android.view.ViewGroup) null, false);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            android.widget.ScrollView scrollView = (android.widget.ScrollView) inflate;
            scrollView.setOnTouchListener(new qd2.l0(scrollView));
            android.widget.TextView textView = (android.widget.TextView) scrollView.findViewById(com.tencent.mm.R.id.l19);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.Button button = (android.widget.Button) scrollView.findViewById(com.tencent.mm.R.id.l1c);
            button.setEnabled(false);
            com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
            button.setOnClickListener(new qd2.v0(this, button));
            c(scrollView, "view_exp");
            android.widget.TextView textView2 = (android.widget.TextView) scrollView.findViewById(com.tencent.mm.R.id.q9z);
            if (this.f361750d) {
                textView.setText(scrollView.getContext().getResources().getString(com.tencent.mm.R.string.lke));
                button.setText(scrollView.getContext().getResources().getString(com.tencent.mm.R.string.lkd));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            android.view.View findViewById = scrollView.findViewById(com.tencent.mm.R.id.tsd);
            if (findViewById != null) {
                findViewById.setOnClickListener(new qd2.m0(this));
            }
            android.widget.CheckBox checkBox = (android.widget.CheckBox) scrollView.findViewById(com.tencent.mm.R.id.f486370l14);
            this.f361753g = checkBox;
            checkBox.setOnCheckedChangeListener(new qd2.u0(this, z18, button));
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) scrollView.findViewById(com.tencent.mm.R.id.l17);
            java.lang.String string2 = scrollView.getContext().getResources().getString(com.tencent.mm.R.string.f492000ew3);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = scrollView.getContext().getResources().getString(com.tencent.mm.R.string.f492002ew5);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = scrollView.getContext().getResources().getString(com.tencent.mm.R.string.f492001ew4, string2, string3);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string4);
            int L = r26.n0.L(string4, string2, 0, false, 6, null);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string4, scrollView.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100), scrollView.getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new qd2.n0(this)), L, string2.length() + L, 17);
            int L2 = r26.n0.L(string4, string3, 0, false, 6, null);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string4, scrollView.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100), scrollView.getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new qd2.o0(this)), L2, string3.length() + L2, 17);
            com.tencent.mm.plugin.finder.view.FinderPostAnnounceItemsView finderPostAnnounceItemsView = (com.tencent.mm.plugin.finder.view.FinderPostAnnounceItemsView) scrollView.findViewById(com.tencent.mm.R.id.f486369l13);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = "";
            if (this.f361760n) {
                string = "";
            } else {
                string = finderPostAnnounceItemsView.getContext().getResources().getString(com.tencent.mm.R.string.lk_);
                kotlin.jvm.internal.o.d(string);
            }
            arrayList.add(new jz5.o(finderPostAnnounceItemsView.getContext().getResources().getString(com.tencent.mm.R.string.lka), string, new qd2.p0(finderPostAnnounceItemsView)));
            arrayList.add(new jz5.o(finderPostAnnounceItemsView.getContext().getResources().getString(com.tencent.mm.R.string.p48), "", null));
            arrayList.add(new jz5.o(finderPostAnnounceItemsView.getContext().getResources().getString(com.tencent.mm.R.string.p47), "", null));
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jz5.o oVar = (jz5.o) next;
                java.util.Iterator it6 = it;
                java.lang.String str2 = str;
                android.view.View inflate2 = com.tencent.mm.ui.id.b(finderPostAnnounceItemsView.getContext()).inflate(com.tencent.mm.R.layout.b5v, (android.view.ViewGroup) null, true);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                if (i17 != 0) {
                    layoutParams.topMargin = finderPostAnnounceItemsView.f131361d;
                }
                finderPostAnnounceItemsView.addView(inflate2, layoutParams);
                kotlin.jvm.internal.o.d(inflate2);
                ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l1g)).setText((java.lang.CharSequence) oVar.f302841d);
                finderPostAnnounceItemsView.contentContainer = inflate2.findViewById(com.tencent.mm.R.id.q9y);
                java.lang.CharSequence charSequence = (java.lang.CharSequence) oVar.f302842e;
                if (charSequence.length() > 0) {
                    android.view.View view = finderPostAnnounceItemsView.contentContainer;
                    if (view != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view2 = finderPostAnnounceItemsView.contentContainer;
                    if (view2 != null) {
                        view2.setOnClickListener((android.view.View.OnClickListener) oVar.f302843f);
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l1e)).setText(charSequence);
                } else {
                    android.view.View view3 = finderPostAnnounceItemsView.contentContainer;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        str = str2;
                        it = it6;
                        i17 = i18;
                    }
                }
                str = str2;
                it = it6;
                i17 = i18;
            }
            java.lang.String str3 = str;
            neatTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(scrollView.getContext()));
            neatTextView.b(spannableString);
            neatTextView.setOnClickListener(new qd2.q0(checkBox));
            ((android.widget.FrameLayout) scrollView.findViewById(com.tencent.mm.R.id.f486371l15)).setOnClickListener(new qd2.r0(checkBox));
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J8).getValue()).r()).intValue();
            java.util.ArrayList arrayList4 = this.f361758l;
            if (intValue == 0) {
                com.tencent.mars.xlog.Log.i("FinderOriginSheetHelper", "[initOriginData] switch is off");
            } else {
                arrayList4.clear();
                m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
                r45.wn2 wn2Var = j37 != null ? (r45.wn2) j37.u0().getCustom(28) : null;
                if (wn2Var != null && (list = wn2Var.getList(0)) != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (((r45.ao2) obj).getList(2).contains(java.lang.Integer.valueOf(this.f361748b))) {
                            arrayList5.add(obj);
                        }
                    }
                    java.util.Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        java.lang.String string5 = ((r45.ao2) it7.next()).getString(1);
                        if (string5 == null) {
                            string5 = str3;
                        }
                        arrayList4.add(string5);
                    }
                }
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J8).getValue()).r()).intValue() == 0) {
                com.tencent.mars.xlog.Log.i("FinderOriginSheetHelper", "[initOriginType] switch is off");
            } else if (arrayList4.isEmpty()) {
                com.tencent.mars.xlog.Log.i("FinderOriginSheetHelper", "[initOriginType] list is empty");
            } else {
                android.view.View findViewById2 = scrollView.findViewById(com.tencent.mm.R.id.l1_);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new qd2.w0(this));
                this.f361752f = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.l1a);
                d();
            }
            if (z17) {
                checkBox.setChecked(true);
                button.setEnabled(true);
            }
            if (z18) {
                textView.setText(scrollView.getContext().getResources().getString(com.tencent.mm.R.string.p49));
                button.setText(scrollView.getContext().getResources().getString(com.tencent.mm.R.string.f493802p46));
                android.widget.Button button2 = (android.widget.Button) scrollView.findViewById(com.tencent.mm.R.id.ure);
                if (button2 != null) {
                    button2.setVisibility(0);
                }
                com.tencent.mm.ui.bk.r0(button2.getPaint(), 0.8f);
                button2.setOnClickListener(new qd2.s0(this));
                android.widget.TextView textView3 = (android.widget.TextView) scrollView.findViewById(com.tencent.mm.R.id.urc);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (textView3 != null) {
                    textView3.setOnClickListener(new qd2.t0(this));
                }
            }
            y9.i iVar = new y9.i(context, com.tencent.mm.R.style.f30do);
            this.f361754h = iVar;
            iVar.setContentView(scrollView);
            java.lang.Object parent = scrollView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            this.f361755i = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
            y9.i iVar2 = this.f361754h;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.5f);
            }
            y9.i iVar3 = this.f361754h;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.tencent.mm.R.drawable.ayr);
            }
            y9.i iVar4 = this.f361754h;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new qd2.d1(this));
            }
            y9.i iVar5 = this.f361754h;
            if (iVar5 != null) {
                iVar5.setOnShowListener(new qd2.e1(this));
            }
        }
        y9.i iVar6 = this.f361754h;
        if (iVar6 != null) {
            iVar6.show();
        }
    }

    public /* synthetic */ g1(android.content.Context context, int i17, long j17, java.lang.String str, boolean z17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(context, i17, (i19 & 4) != 0 ? 0L : j17, (i19 & 8) != 0 ? "" : str, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? 0 : i18);
    }
}
