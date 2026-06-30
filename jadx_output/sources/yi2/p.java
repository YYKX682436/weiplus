package yi2;

/* loaded from: classes10.dex */
public abstract class p implements yi2.o0 {
    public final com.tencent.mm.sdk.platformtools.b4 A;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f462561a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.e f462562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f462563c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f462564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f462565e;

    /* renamed from: f, reason: collision with root package name */
    public final int f462566f;

    /* renamed from: g, reason: collision with root package name */
    public int f462567g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f462568h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f462569i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f462570j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f462571k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f462572l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462573m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f462574n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f462575o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f462576p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f462577q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f462578r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f462579s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f462580t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f462581u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f462582v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f462583w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f462584x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f462585y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f462586z;

    public p(android.view.View root, xi2.e server) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(server, "server");
        this.f462561a = root;
        this.f462562b = server;
        this.f462563c = n();
        this.f462564d = "finder_live_pk_fire_ball.pag";
        this.f462565e = (int) root.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479720dd);
        this.f462566f = i65.a.a(root.getContext(), 64.0f);
        this.f462569i = kotlinx.coroutines.z0.b();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ep_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f462570j = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.epd);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f462571k = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.epc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f462572l = findViewById3;
        this.f462573m = "red";
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.epc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f462574n = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.epb);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById5;
        this.f462575o = mMPAGView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.epe);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f462576p = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.q9p);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f462577q = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.qva);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f462578r = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById8;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.epg);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f462579s = textView;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.epf);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f462580t = findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f484568ep2);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f462581u = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.ep8);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById12;
        this.f462582v = textView2;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.f484571ep5);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById13;
        this.f462583w = textView3;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.f484569ep3);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f462584x = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.ep6);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f462585y = findViewById15;
        this.f462586z = root.findViewById(com.tencent.mm.R.id.f487179qq0);
        p();
        this.A = new com.tencent.mm.sdk.platformtools.b4(new yi2.i(this), true);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463300J));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "finder_live_pk_fire_ball.pag");
        mMPAGView.setRepeatCount(0);
        mMPAGView.g();
        mMPAGView.setScaleY(1.5f);
        mMPAGView.setScaleX(1.5f);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float d17 = fVar.d(context, 11.0f, false);
        textView2.setTextSize(1, d17);
        textView3.setTextSize(1, d17);
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView.setTextSize(1, fVar.d(context2, 12.6f, false));
    }

    @Override // yi2.o0
    public void b() {
        h();
        s(m(), l(), true);
        android.view.View view = this.f462576p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462580t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f462581u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        xi2.e eVar = this.f462562b;
        sb6.append(((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z);
        com.tencent.mars.xlog.Log.i(this.f462563c, sb6.toString());
        this.f462579s.setText(no0.m.f338730a.b(0, ":"));
        this.A.d();
        if (((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z != null) {
            android.view.View view = this.f462576p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z17) {
                return;
            }
            h();
        }
    }

    @Override // yi2.o0
    public void d() {
        java.lang.String str;
        java.lang.Long m17 = m();
        java.lang.Long l17 = l();
        com.tencent.mars.xlog.Log.i(this.f462563c, "updateBattleInfo: selfBattleWeCoinHot:" + m17 + " otherBattleWecoinHot:" + l17);
        java.lang.String valueOf = java.lang.String.valueOf(m17 != null ? m17.longValue() : 0L);
        android.widget.TextView textView = this.f462582v;
        textView.setText(valueOf);
        java.lang.String valueOf2 = java.lang.String.valueOf(l17 != null ? l17.longValue() : 0L);
        android.widget.TextView textView2 = this.f462583w;
        textView2.setText(valueOf2);
        android.view.View view = this.f462561a;
        this.f462585y.setContentDescription(view.getContext().getResources().getString(com.tencent.mm.R.string.cm8, textView.getText()));
        android.content.res.Resources resources = view.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        km2.q l76 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).l7();
        if (l76 == null || (str = l76.f309173d) == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = textView2.getText();
        this.f462584x.setContentDescription(resources.getString(com.tencent.mm.R.string.cm9, objArr));
        s(m17, l17, false);
    }

    @Override // yi2.o0
    public void e() {
    }

    @Override // yi2.o0
    public android.view.View f() {
        return this.f462561a;
    }

    public final void g(boolean z17) {
        r45.wk6 wk6Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.Object obj;
        this.f462573m = "red";
        this.f462571k.setBackgroundDrawable(k(z17));
        this.f462572l.setBackgroundDrawable(j(z17));
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (u4Var.f234160g != 2) {
                q(new yi2.g(this));
                return;
            }
            if (u4Var.f()) {
                r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
                java.lang.Object obj2 = null;
                if (r22Var == null || (list2 = r22Var.getList(0)) == null) {
                    wk6Var = null;
                } else {
                    synchronized (list2) {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(0), ((mm2.c1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.c1.class)).f328852o)) {
                                    break;
                                }
                            }
                        }
                    }
                    wk6Var = (r45.wk6) obj;
                }
                if (wk6Var != null) {
                    this.f462571k.setBackgroundDrawable(k(z17));
                    this.f462572l.setBackgroundDrawable(j(z17));
                }
                r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
                if (r22Var2 != null && (list = r22Var2.getList(0)) != null) {
                    synchronized (list) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it6.next();
                            if (kotlin.jvm.internal.o.b(((r45.wk6) next).getString(0), ((mm2.c1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.c1.class)).f328852o)) {
                                obj2 = next;
                                break;
                            }
                        }
                    }
                    obj2 = (r45.wk6) obj2;
                }
                if (obj2 != null) {
                    this.f462573m = "blue";
                    this.f462571k.setBackgroundDrawable(j(z17));
                    this.f462572l.setBackgroundDrawable(k(z17));
                }
            }
        }
        q(new yi2.h(this));
    }

    public void h() {
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = (com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            ce2.i e17 = dk2.u7.f234181a.e(u4Var.f234162i);
            int i17 = u4Var.f234161h;
            android.widget.ImageView imageView = this.f462577q;
            android.view.View view = this.f462576p;
            if (i17 != 1) {
                imageView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i65.a.b(view.getContext(), u4Var.f234167n <= 3600 ? 96 : 108);
                    return;
                }
                return;
            }
            if (((mm2.o4) p8Var.a().a(mm2.o4.class)).f329324s.size() != 1) {
                imageView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i65.a.b(view.getContext(), u4Var.f234167n <= 3600 ? 96 : 108);
                    return;
                }
                return;
            }
            imageView.setVisibility(0);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            java.lang.String str = e17 != null ? e17.field_thumbnailFileUrl : null;
            if (str == null) {
                str = "";
            }
            ((wo0.b) d1Var.a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i65.a.b(view.getContext(), 114);
            }
        }
    }

    public final android.graphics.drawable.Drawable j(boolean z17) {
        android.view.View view = this.f462561a;
        if (z17) {
            android.graphics.drawable.Drawable drawable = view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cod);
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0b);
        kotlin.jvm.internal.o.d(drawable2);
        return drawable2;
    }

    public final android.graphics.drawable.Drawable k(boolean z17) {
        android.view.View view = this.f462561a;
        if (z17) {
            android.graphics.drawable.Drawable drawable = view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.coe);
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0c);
        kotlin.jvm.internal.o.d(drawable2);
        return drawable2;
    }

    public java.lang.Long l() {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        if (u4Var.f234160g != 2) {
            dk2.u4 u4Var2 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
            if (u4Var2 == null) {
                return null;
            }
            km2.q l76 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).l7();
            km2.k c17 = u4Var2.c(l76 != null ? l76.f309172c : null);
            if (c17 != null) {
                return java.lang.Long.valueOf(u4Var.f234161h == 1 ? c17.f309122i : c17.f309116c);
            }
            return null;
        }
        for (r45.r22 r22Var : u4Var.f234163j) {
            java.util.LinkedList list = r22Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getMembers(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(1), ((mm2.e1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.e1.class)).f328987q.f380301n)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return u4Var.f234161h == 1 ? java.lang.Long.valueOf(r22Var.getLong(3)) : java.lang.Long.valueOf(r22Var.getLong(1));
            }
        }
        return null;
    }

    public java.lang.Long m() {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        if (u4Var.f234160g != 2) {
            km2.k e17 = u4Var.e(((mm2.c1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.c1.class)).f328852o);
            if (e17 != null) {
                return java.lang.Long.valueOf(u4Var.f234161h == 1 ? e17.f309122i : e17.f309116c);
            }
            return null;
        }
        for (r45.r22 r22Var : u4Var.f234163j) {
            java.util.LinkedList list = r22Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getMembers(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(1), ((mm2.e1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.e1.class)).f328987q.f380301n)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                return u4Var.f234161h == 1 ? java.lang.Long.valueOf(r22Var.getLong(3)) : java.lang.Long.valueOf(r22Var.getLong(1));
            }
        }
        return null;
    }

    public abstract java.lang.String n();

    public boolean o() {
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        boolean z17 = false;
        if (u4Var != null && u4Var.f234158e == 2) {
            z17 = true;
        }
        return !z17;
    }

    public final void p() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f462575o.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.View view = this.f462561a;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((com.tencent.mm.ui.bl.b(view.getContext()).x / 2) - this.f462567g) - com.tencent.mm.ui.zk.a(view.getContext(), 8));
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f462574n.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((com.tencent.mm.ui.bl.b(view.getContext()).x / 2) - this.f462567g);
    }

    public final void q(yz5.l lVar) {
        boolean b17 = kotlin.jvm.internal.o.b(this.f462573m, "red");
        android.view.View view = this.f462572l;
        android.view.View view2 = this.f462571k;
        if (b17) {
            view2.setOnClickListener(new yi2.j(lVar));
            view.setOnClickListener(new yi2.k(lVar));
        } else {
            view2.setOnClickListener(new yi2.l(lVar));
            view.setOnClickListener(new yi2.m(lVar));
        }
    }

    public void r() {
        com.tencent.mars.xlog.Log.i(this.f462563c, "showCounting");
        android.view.View view = this.f462581u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462580t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    public void reset() {
        setVisible(8);
        p();
        this.A.d();
        kotlinx.coroutines.r2 r2Var = this.f462568h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f462568h = null;
    }

    public final void s(java.lang.Long l17, java.lang.Long l18, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBattleBar: selfWecoinHot:");
        sb6.append(l17);
        sb6.append(" otherWecoinHot:");
        sb6.append(l18);
        sb6.append(" needInit:");
        sb6.append(z17);
        sb6.append(" visibility: ");
        android.view.View view = this.f462570j;
        sb6.append(view.getVisibility());
        com.tencent.mars.xlog.Log.i(this.f462563c, sb6.toString());
        if (view.getVisibility() != 0) {
            return;
        }
        view.post(new yi2.o(this, l17, l18, z17));
    }

    @Override // yi2.o0
    public void setVisible(int i17) {
        android.view.View view = this.f462561a;
        if (view.getContext() instanceof androidx.appcompat.app.AppCompatActivity) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
                i17 = 8;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f462563c, "battle setVisible: " + i17);
        android.view.View view2 = this.f462561a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
