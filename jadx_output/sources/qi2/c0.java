package qi2;

/* loaded from: classes10.dex */
public class c0 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f363502h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363503i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363504m;

    /* renamed from: n, reason: collision with root package name */
    public fg2.g f363505n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f363506o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f363507p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f363508q;

    /* renamed from: r, reason: collision with root package name */
    public int f363509r;

    /* renamed from: s, reason: collision with root package name */
    public dk2.m f363510s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f363502h = basePlugin;
        this.f363506o = new java.util.LinkedList();
        this.f363507p = new java.util.LinkedList();
        this.f363508q = new java.util.HashMap();
        this.f363509r = 1;
    }

    public final void A(java.lang.String str) {
        java.util.HashMap hashMap = this.f363508q;
        synchronized (hashMap) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (kotlin.jvm.internal.o.b(entry.getKey(), str)) {
                    ((qi2.z) entry.getValue()).b(false);
                } else {
                    ((qi2.z) entry.getValue()).b(true);
                }
            }
        }
    }

    public void B() {
        this.f363506o.clear();
        this.f363507p.clear();
        if (((mm2.o4) this.f363502h.P0(mm2.o4.class)).f329324s.size() == 2) {
            this.f363506o.add(((mm2.o4) this.f363502h.P0(mm2.o4.class)).a7());
            java.util.List list = ((mm2.o4) this.f363502h.P0(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f363507p.add((km2.q) it.next());
                }
            }
            return;
        }
        if (((mm2.o4) this.f363502h.P0(mm2.o4.class)).f329324s.size() == 3) {
            this.f363506o.add(((mm2.o4) this.f363502h.P0(mm2.o4.class)).a7());
            java.util.List list2 = ((mm2.o4) this.f363502h.P0(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
            synchronized (list2) {
                int i17 = 0;
                for (java.lang.Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    km2.q qVar = (km2.q) obj;
                    if (i17 == 1) {
                        this.f363506o.add(qVar);
                    } else {
                        this.f363507p.add(qVar);
                    }
                    i17 = i18;
                }
            }
        }
    }

    public final void C() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f363506o.size() == 1) {
            km2.q qVar = (km2.q) kz5.n0.Z(this.f363506o);
            if (qVar == null || (str2 = qVar.f309170a) == null) {
                str2 = "";
            }
            A(str2);
            return;
        }
        if (this.f363507p.size() == 1) {
            km2.q qVar2 = (km2.q) kz5.n0.Z(this.f363507p);
            if (qVar2 == null || (str = qVar2.f309170a) == null) {
                str = "";
            }
            A(str);
            return;
        }
        java.util.HashMap hashMap = this.f363508q;
        synchronized (hashMap) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((qi2.z) ((java.util.Map.Entry) it.next()).getValue()).b(true);
            }
        }
    }

    public void D(qi2.z viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }

    public final void E(dk2.m battleData) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        this.f363510s = battleData;
        super.w();
        F();
        G();
    }

    public final void F() {
        B();
        java.util.LinkedList linkedList = this.f363506o;
        fj2.k kVar = fj2.k.f263175d;
        fg2.g gVar = this.f363505n;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout redTeamLayout = gVar.f262039g;
        kotlin.jvm.internal.o.f(redTeamLayout, "redTeamLayout");
        y(linkedList, kVar, redTeamLayout);
        java.util.LinkedList linkedList2 = this.f363507p;
        fj2.k kVar2 = fj2.k.f263176e;
        fg2.g gVar2 = this.f363505n;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout blueTeamLayout = gVar2.f262034b;
        kotlin.jvm.internal.o.f(blueTeamLayout, "blueTeamLayout");
        y(linkedList2, kVar2, blueTeamLayout);
        C();
    }

    public void G() {
        this.f363509r = 1;
        fg2.g gVar = this.f363505n;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar.f262035c.setVisibility(8);
        fg2.g gVar2 = this.f363505n;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar2.f262037e.setVisibility(0);
        fg2.g gVar3 = this.f363505n;
        if (gVar3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar3.f262042j.setVisibility(8);
        fg2.g gVar4 = this.f363505n;
        if (gVar4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar4.f262036d.setText(this.f118381d.getResources().getString(com.tencent.mm.R.string.d6x));
    }

    public void H() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f363502h;
        if (((mm2.o4) lVar.P0(mm2.o4.class)).f329324s.size() < 2) {
            return;
        }
        if (this.f363506o.size() + this.f363507p.size() == ((mm2.o4) lVar.P0(mm2.o4.class)).f329324s.size() + 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorTeamPkApplyPanelWidget", "updateAnchorMicUserList save user, return");
        } else {
            F();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.anf;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        dk2.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.g gVar = this.f363505n;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = gVar.f262040h.getId();
        android.content.Context context = this.f118381d;
        fj2.j jVar = fj2.j.f263174a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f363502h;
        if (valueOf != null && valueOf.intValue() == id6) {
            dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
            boolean z17 = u4Var != null && u4Var.h();
            fj2.s sVar = fj2.s.f263183a;
            if (z17) {
                fj2.s.c(sVar, ml2.q2.D, null, null, 0, 0, 30, null);
            } else {
                fj2.s.c(sVar, ml2.q2.C, null, null, 0, 0, 30, null);
            }
            this.f363503i = jVar.c(this.f363503i, context, new qi2.b0(this));
        } else {
            fg2.g gVar2 = this.f363505n;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = gVar2.f262037e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                int i17 = this.f363509r;
                if (i17 != 1) {
                    if (i17 == 2) {
                        this.f363504m = jVar.a(this.f363504m, context, new qi2.a0(this));
                    } else if (i17 == 3) {
                        a();
                        qo0.c.a(lVar.f113325g, qo0.b.f365441y4, null, 2, null);
                    }
                } else if (((mm2.y2) lVar.P0(mm2.y2.class)).W6(true)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.r22 r22Var = new r45.r22();
                    java.util.LinkedList<km2.q> linkedList2 = this.f363506o;
                    for (km2.q qVar : linkedList2) {
                        java.util.LinkedList list = r22Var.getList(0);
                        r45.wk6 wk6Var = new r45.wk6();
                        wk6Var.set(0, qVar.f309172c);
                        wk6Var.set(1, qVar.f309170a);
                        list.add(wk6Var);
                    }
                    linkedList.add(r22Var);
                    r45.r22 r22Var2 = new r45.r22();
                    java.util.LinkedList<km2.q> linkedList3 = this.f363507p;
                    for (km2.q qVar2 : linkedList3) {
                        java.util.LinkedList list2 = r22Var2.getList(0);
                        r45.wk6 wk6Var2 = new r45.wk6();
                        wk6Var2.set(0, qVar2.f309172c);
                        wk6Var2.set(1, qVar2.f309170a);
                        list2.add(wk6Var2);
                    }
                    linkedList.add(r22Var2);
                    if (linkedList2.size() + linkedList3.size() == ((mm2.o4) lVar.P0(mm2.o4.class)).f329324s.size() + 1) {
                        km2.m V0 = lVar.V0();
                        if (V0 != null && (liveRoomControllerStore = V0.f309131f) != null && (mVar = this.f363510s) != null) {
                            mVar.f233743f = linkedList;
                            qf2.y1 y1Var = (qf2.y1) liveRoomControllerStore.controller(qf2.y1.class);
                            if (y1Var != null) {
                                y1Var.e7(mVar, null);
                            }
                        }
                    } else {
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.d6y), 0).show();
                    }
                    a();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.asx;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.asx);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.c_0;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.c_0);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.c_2;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.c_2);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.c_u;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.c_u);
                    if (linearLayout2 != null) {
                        i17 = com.tencent.mm.R.id.f6a;
                        android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.f6a);
                        if (a17 != null) {
                            i17 = com.tencent.mm.R.id.f6c;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f6c);
                            if (frameLayout != null) {
                                i17 = com.tencent.mm.R.id.fn8;
                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.fn8);
                                if (imageView != null) {
                                    i17 = com.tencent.mm.R.id.lqt;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.lqt);
                                    if (linearLayout3 != null) {
                                        i17 = com.tencent.mm.R.id.nzb;
                                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nzb);
                                        if (textView2 != null) {
                                            i17 = com.tencent.mm.R.id.nzi;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nzi);
                                            if (textView3 != null) {
                                                i17 = com.tencent.mm.R.id.p_m;
                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.p_m);
                                                if (textView4 != null) {
                                                    this.f363505n = new fg2.g((androidx.core.widget.NestedScrollView) rootView, linearLayout, weImageView, textView, linearLayout2, a17, frameLayout, imageView, linearLayout3, textView2, textView3, textView4);
                                                    ((com.tencent.mm.ui.widget.imageview.WeImageView) a17.findViewById(com.tencent.mm.R.id.f6b)).setIconColor(this.f118381d.getResources().getColor(com.tencent.mm.R.color.aaz));
                                                    fg2.g gVar = this.f363505n;
                                                    if (gVar == null) {
                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                    gVar.f262040h.setOnClickListener(this);
                                                    fg2.g gVar2 = this.f363505n;
                                                    if (gVar2 == null) {
                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                    gVar2.f262037e.setOnClickListener(this);
                                                    fg2.g gVar3 = this.f363505n;
                                                    if (gVar3 != null) {
                                                        com.tencent.mm.ui.bk.r0(gVar3.f262041i.getPaint(), 0.8f);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        F();
        G();
    }

    public final void y(java.util.LinkedList linkedList, fj2.k kVar, android.widget.LinearLayout linearLayout) {
        qi2.z zVar;
        linearLayout.removeAllViews();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.util.HashMap hashMap = this.f363508q;
            if (hashMap.containsKey(qVar.f309170a)) {
                zVar = (qi2.z) hashMap.get(qVar.f309170a);
            } else {
                android.view.View inflate = android.view.LayoutInflater.from(this.f118381d).inflate(com.tencent.mm.R.layout.ane, (android.view.ViewGroup) null, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                zVar = new qi2.z(this, inflate);
            }
            if (zVar != null) {
                java.lang.String str = qVar.f309170a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, zVar);
                zVar.f363664g = qVar;
                boolean S3 = com.tencent.mm.storage.z3.S3(qVar.f309172c);
                mn2.g1 g1Var = mn2.g1.f329975a;
                android.widget.ImageView imageView = zVar.f363660c;
                if (S3) {
                    g1Var.a().c(new mn2.n(qVar.f309171b, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                } else {
                    g1Var.l().c(new mn2.n(qVar.f309171b, null, 2, null), imageView, g1Var.h(mn2.f1.f329961o));
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context = zVar.f363658a.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.widget.TextView textView = zVar.f363661d;
                android.text.TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                textView.setText(c61.yb.nf(ybVar, context, paint, zl2.r4.D0(zl2.r4.f473950a, qVar.f309172c, qVar.f309173d, false, 4, null), 0, 8, null));
                zVar.a(kVar);
                D(zVar);
                z(zVar, linearLayout);
            }
        }
    }

    public final void z(qi2.z zVar, android.widget.LinearLayout linearLayout) {
        if (zVar != null) {
            android.view.View view = zVar.f363658a;
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(view.getContext(), 118), i65.a.b(view.getContext(), 138));
            layoutParams.leftMargin = linearLayout.getChildCount() == 0 ? 0 : i65.a.b(this.f118381d, 8);
            linearLayout.addView(view, layoutParams);
        }
    }
}
