package ws2;

/* loaded from: classes3.dex */
public final class y extends ws2.l1 {

    /* renamed from: d */
    public final java.lang.String f449156d;

    /* renamed from: e */
    public at2.v f449157e;

    /* renamed from: f */
    public com.tencent.mm.plugin.finder.live.plugin.nd0 f449158f;

    /* renamed from: g */
    public com.tencent.mm.plugin.finder.live.plugin.le0 f449159g;

    /* renamed from: h */
    public at2.k f449160h;

    /* renamed from: i */
    public com.tencent.mm.plugin.finder.live.plugin.kh f449161i;

    /* renamed from: j */
    public com.tencent.mm.plugin.finder.live.plugin.a8 f449162j;

    /* renamed from: k */
    public com.tencent.mm.plugin.finder.live.plugin.mg f449163k;

    /* renamed from: l */
    public com.tencent.mm.plugin.finder.live.plugin.x80 f449164l;

    /* renamed from: m */
    public com.tencent.mm.plugin.finder.live.plugin.ad f449165m;

    /* renamed from: n */
    public at2.i f449166n;

    /* renamed from: o */
    public at2.n1 f449167o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f449156d = "FinderLiveReplayDecorateUIC";
    }

    public static /* synthetic */ void h(ws2.y yVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        yVar.g(z17, z18, z19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    public void e(boolean z17, boolean z18) {
        java.lang.Integer num;
        ?? r132;
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var;
        at2.u0 u0Var;
        at2.u0 u0Var2;
        at2.i iVar;
        at2.n1 n1Var;
        java.lang.String str;
        java.lang.Integer num2;
        boolean z19;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
        java.lang.String str2 = this.f449156d;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = (com.tencent.mm.plugin.finder.live.plugin.nd0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.nd0.class);
            if (nd0Var == null) {
                android.view.View genRootViewByStub = k0Var.genRootViewByStub(com.tencent.mm.R.id.g1i, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
                nd0Var = new com.tencent.mm.plugin.finder.live.plugin.nd0((android.view.ViewGroup) genRootViewByStub, k0Var, null);
            }
            this.f449158f = nd0Var;
            com.tencent.mm.plugin.finder.live.plugin.le0 le0Var2 = (com.tencent.mm.plugin.finder.live.plugin.le0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class);
            if (le0Var2 == null) {
                android.view.View genRootViewByStub2 = k0Var.genRootViewByStub(com.tencent.mm.R.id.g1k, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub2, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) genRootViewByStub2;
                android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ozm);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                le0Var2 = new com.tencent.mm.plugin.finder.live.plugin.le0(viewGroup, (android.widget.ImageView) findViewById, viewGroup, k0Var);
            }
            this.f449159g = le0Var2;
            at2.q0 q0Var = (at2.q0) k0Var.getPlugin(at2.q0.class);
            if (q0Var == null) {
                android.view.View findViewById2 = k0Var.findViewById(com.tencent.mm.R.id.g1h);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                q0Var = new at2.q0((android.view.ViewGroup) findViewById2, k0Var);
            }
            q0Var.K0(0);
            at2.b0 b0Var = (at2.b0) k0Var.getPlugin(at2.b0.class);
            if (b0Var == null) {
                android.view.View findViewById3 = k0Var.findViewById(com.tencent.mm.R.id.g1m);
                kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                b0Var = new at2.b0((android.view.ViewGroup) findViewById3, k0Var);
            }
            b0Var.K0(0);
            at2.k kVar = (at2.k) k0Var.getPlugin(at2.k.class);
            if (kVar == null) {
                android.view.View findViewById4 = k0Var.findViewById(com.tencent.mm.R.id.g1l);
                kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                kVar = new at2.k((android.view.ViewGroup) findViewById4, k0Var);
            }
            this.f449160h = kVar;
            kVar.K0(0);
            com.tencent.mm.plugin.finder.live.plugin.kh khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.kh.class);
            if (khVar == null) {
                android.view.View genRootViewByStub3 = k0Var.genRootViewByStub(com.tencent.mm.R.id.f485589i95, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub3, "null cannot be cast to non-null type android.view.ViewGroup");
                khVar = new com.tencent.mm.plugin.finder.live.plugin.kh((android.view.ViewGroup) genRootViewByStub3, k0Var);
            }
            this.f449161i = khVar;
            com.tencent.mars.xlog.Log.e(str2, "initCommonInfoPlugin isLandscape = " + k0Var.isLandscape() + " anchorLiveStatePlugin: " + this.f449162j);
            com.tencent.mm.plugin.finder.live.plugin.a8 a8Var = (com.tencent.mm.plugin.finder.live.plugin.a8) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.a8.class);
            if (a8Var == null) {
                android.view.View findViewById5 = k0Var.findViewById(com.tencent.mm.R.id.fnw);
                kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.view.ViewGroup");
                a8Var = new com.tencent.mm.plugin.finder.live.plugin.a8((android.view.ViewGroup) findViewById5, k0Var);
            }
            this.f449162j = a8Var;
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class);
            if (mgVar == null) {
                android.view.View genRootViewByStub4 = k0Var.genRootViewByStub(com.tencent.mm.R.id.g1d, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub4, "null cannot be cast to non-null type android.view.ViewGroup");
                mgVar = new com.tencent.mm.plugin.finder.live.plugin.mg((android.view.ViewGroup) genRootViewByStub4, k0Var, null);
            }
            this.f449163k = mgVar;
            at2.v vVar = (at2.v) k0Var.getPlugin(at2.v.class);
            if (vVar == null) {
                android.view.View findViewById6 = k0Var.findViewById(com.tencent.mm.R.id.g1g);
                kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
                vVar = new at2.v((android.view.ViewGroup) findViewById6, k0Var);
            }
            this.f449157e = vVar;
            com.tencent.mm.plugin.finder.live.plugin.ad adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class);
            if (adVar == null) {
                android.view.View genRootViewByStub5 = k0Var.genRootViewByStub(com.tencent.mm.R.id.g1e, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub5, "null cannot be cast to non-null type android.view.ViewGroup");
                str = "null cannot be cast to non-null type android.view.ViewGroup";
                num2 = 0;
                z19 = false;
                adVar = new com.tencent.mm.plugin.finder.live.plugin.ad((android.view.ViewGroup) genRootViewByStub5, k0Var, null, 4, null);
            } else {
                str = "null cannot be cast to non-null type android.view.ViewGroup";
                num2 = 0;
                z19 = false;
            }
            this.f449165m = adVar;
            com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.x80.class);
            if (x80Var == null) {
                android.view.View genRootViewByStub6 = k0Var.genRootViewByStub(com.tencent.mm.R.id.fk8, k0Var);
                kotlin.jvm.internal.o.e(genRootViewByStub6, str);
                x80Var = new com.tencent.mm.plugin.finder.live.plugin.x80((android.view.ViewGroup) genRootViewByStub6, k0Var);
            }
            this.f449164l = x80Var;
            if (k0Var.isLandscape()) {
                com.tencent.mm.plugin.finder.live.plugin.le0 le0Var3 = this.f449159g;
                if (le0Var3 != null) {
                    le0Var3.K0(z19 ? 1 : 0);
                }
                android.view.View findViewById7 = k0Var.findViewById(com.tencent.mm.R.id.ien);
                if (findViewById7 != null && (layoutParams = findViewById7.getLayoutParams()) != null) {
                    int measuredHeight = k0Var.findViewById(com.tencent.mm.R.id.ien) != null ? k0Var.findViewById(com.tencent.mm.R.id.ien).getMeasuredHeight() : z19 ? 1 : 0;
                    if (measuredHeight <= 0) {
                        measuredHeight = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479659bw);
                    }
                    layoutParams.height = measuredHeight;
                }
            } else {
                com.tencent.mm.plugin.finder.live.plugin.le0 le0Var4 = this.f449159g;
                if (le0Var4 != null) {
                    le0Var4.K0(8);
                }
            }
            if (((ct2.j) c(ct2.j.class)).f222280x) {
                at2.v vVar2 = this.f449157e;
                if (vVar2 != null) {
                    vVar2.K0(z19 ? 1 : 0);
                    android.view.View view = (android.view.View) ((jz5.n) vVar2.f13766r).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(z19 ? 1 : 0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    vVar2.t1(((mm2.c1) vVar2.P0(mm2.c1.class)).f328852o);
                    ((android.view.View) ((jz5.n) vVar2.f13765q).getValue()).setOnClickListener(new at2.u(vVar2));
                }
            } else {
                at2.v vVar3 = this.f449157e;
                if (vVar3 != null) {
                    vVar3.K0(8);
                    android.view.View view2 = (android.view.View) ((jz5.n) vVar3.f13766r).getValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    num = num2;
                    arrayList2.add(num);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(z19 ? 1 : 0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    r132 = z19;
                }
            }
            num = num2;
            r132 = z19;
        } else {
            num = 0;
            r132 = 0;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f449093c;
        if (k0Var2 != null) {
            k0Var2.registerLazyInitPluginTask("Finder.Live:" + at2.i.class.getCanonicalName(), new ws2.r(this, k0Var2));
            k0Var2.registerLazyInitPluginTask("Finder.Live:" + at2.u0.class.getCanonicalName(), new ws2.s(this, k0Var2));
            k0Var2.registerLazyInitPluginTask("Finder.Live:" + at2.n1.class.getCanonicalName(), new ws2.t(this, k0Var2));
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = this.f449158f;
        if (nd0Var2 != null) {
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var2, null, r132, 3, null);
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i(str2, "ReplayTransition0:showReplayTransition fromFloat:" + z17);
            com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = this.f449093c;
            if (k0Var3 == null || (n1Var = (at2.n1) k0Var3.getPlugin(at2.n1.class)) == null) {
                return;
            }
            at2.k kVar2 = this.f449160h;
            com.tencent.mars.xlog.Log.i(n1Var.f13714p, "ReplayTransition0.1:showCover,requireTouchView:" + (kVar2 != null ? kVar2.f365323d : null) + ",fromFloat:" + z17);
            ((ct2.j) n1Var.P0(ct2.j.class)).D = true;
            n1Var.f365323d.setVisibility(r132);
            android.view.View u17 = n1Var.u1();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(u17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            u17.setVisibility(((java.lang.Integer) arrayList3.get(r132)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value = ((jz5.n) n1Var.f13718t).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view3 = (android.view.View) value;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(r132)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z17) {
                n1Var.v1().setVisibility(r132);
                at2.n1.y1(n1Var, n1Var.v1(), "...", kz5.c0.i("", ".", "..", "..."), 0L, 8, null);
                return;
            }
            n1Var.x1().setVisibility(r132);
            n1Var.x1().setAlpha(1.0f);
            n1Var.w1().setVisibility(r132);
            n1Var.w1().setAlpha(1.0f);
            n1Var.R0().showBlurBg();
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var4 = this.f449093c;
        if (k0Var4 != null && (iVar = (at2.i) k0Var4.getPlugin(at2.i.class)) != 0) {
            ws2.u0 u0Var3 = ws2.k1.f449066r;
            if (((java.lang.Boolean) ((jz5.n) ws2.k1.f449068t).getValue()).booleanValue()) {
                iVar.K0(r132);
                xs2.p pVar = iVar.f13684q;
                android.view.ViewGroup viewGroup2 = iVar.f365323d;
                if (pVar == null) {
                    pVar = (xs2.p) viewGroup2.findViewById(com.tencent.mm.R.id.cq_);
                }
                iVar.f13684q = pVar;
                if (pVar != null) {
                    android.view.View findViewById8 = viewGroup2.findViewById(com.tencent.mm.R.id.b1w);
                    kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
                    pVar.setAnchorView(findViewById8);
                }
                xs2.p pVar2 = iVar.f13684q;
                if (pVar2 != null) {
                    android.view.View view4 = pVar2.getView();
                    xs2.f0 f0Var = (xs2.f0) ((jz5.n) iVar.f13687t).getValue();
                    if (iVar.f13686s == null) {
                        xs2.q0 q0Var2 = new xs2.q0(view4, iVar.S0(), f0Var);
                        q0Var2.f456320g = new at2.f(q0Var2, iVar);
                        iVar.f13686s = q0Var2;
                    }
                    xs2.o oVar = iVar.f13686s;
                    kotlin.jvm.internal.o.d(oVar);
                    pVar2.b(oVar, ((ct2.d) iVar.S0().a(ct2.d.class)).N6());
                    android.view.View view5 = pVar2.getView();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList5.add(num);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayBulletLazyPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(r132)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/replay/plugin/ReplayBulletLazyPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    xs2.o oVar2 = iVar.f13686s;
                    kotlin.jvm.internal.o.d(oVar2);
                    if (iVar.f13685r == null) {
                        android.content.Context context = viewGroup2.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        iVar.f13685r = new xs2.m(context, iVar.S0(), oVar2);
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var5 = this.f449093c;
        if (k0Var5 != null && (u0Var2 = (at2.u0) k0Var5.getPlugin(at2.u0.class)) != null) {
            android.view.ViewGroup viewGroup3 = u0Var2.f365323d;
            android.view.View findViewById9 = viewGroup3.findViewById(com.tencent.mm.R.id.mho);
            if (findViewById9 == null) {
                findViewById9 = android.view.LayoutInflater.from(viewGroup3.getContext()).inflate(com.tencent.mm.R.layout.asu, viewGroup3, (boolean) r132);
                com.tencent.mars.xlog.Log.i("ReplayScreenDragLazyPlugin", "seekTimeLayoutGenerator " + findViewById9.hashCode());
                if (viewGroup3 instanceof android.widget.FrameLayout) {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 17;
                    viewGroup3.addView(findViewById9, layoutParams2);
                } else if (viewGroup3 instanceof android.widget.RelativeLayout) {
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13);
                    viewGroup3.addView(findViewById9, layoutParams3);
                }
            }
            u0Var2.f13757p = findViewById9;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            android.view.View view6 = findViewById9;
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "activate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList6.get(r132)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "activate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var2 = this.f449164l;
        if (x80Var2 != null) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var6 = this.f449093c;
            x80Var2.x1((k0Var6 == null || (u0Var = (at2.u0) k0Var6.getPlugin(at2.u0.class)) == null) ? null : (at2.s0) ((jz5.n) u0Var.f13759r).getValue());
        }
        if (((ct2.j) c(ct2.j.class)).f222269m == 3 || (le0Var = this.f449159g) == 0) {
            return;
        }
        le0Var.x1(((mm2.c1) c(mm2.c1.class)).L9(), r132);
    }

    public void f(com.tencent.mm.plugin.finder.live.view.k0 baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f449093c = baseRouter;
    }

    public final void g(boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
        if (k0Var != null) {
            com.tencent.mm.sdk.platformtools.Log.c(this.f449156d, "liveinfo:" + cm2.a.f43328a.y(((ct2.j) c(ct2.j.class)).P6()), new java.lang.Object[0]);
            if (((at2.q) k0Var.getPlugin(at2.q.class)) == null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(k0Var.getContext());
                frameLayout.setElevation(2.0f);
                k0Var.addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
                new at2.q(frameLayout, k0Var);
            }
            if (z17) {
                at2.q qVar = (at2.q) k0Var.getPlugin(at2.q.class);
                if (qVar != null) {
                    java.lang.String N6 = ((ct2.j) c(ct2.j.class)).N6();
                    com.tencent.mars.xlog.Log.i(qVar.f13734p, "showPrivateCount anchorUserName:".concat(N6));
                    qVar.f365323d.setVisibility(0);
                    qVar.t1(N6);
                    com.tencent.mm.plugin.finder.live.widget.se seVar = qVar.f13735q;
                    if (seVar != null) {
                        com.tencent.mm.plugin.finder.live.widget.se.d(seVar, 9, null, 0, new at2.o(qVar), 6, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z18) {
                at2.q qVar2 = (at2.q) k0Var.getPlugin(at2.q.class);
                if (qVar2 != null) {
                    java.lang.String N62 = ((ct2.j) c(ct2.j.class)).N6();
                    com.tencent.mars.xlog.Log.i(qVar2.f13734p, "showPrivateCount anchorUserName:".concat(N62));
                    qVar2.f365323d.setVisibility(0);
                    qVar2.t1(N62);
                    com.tencent.mm.plugin.finder.live.widget.se seVar2 = qVar2.f13735q;
                    if (seVar2 != null) {
                        com.tencent.mm.plugin.finder.live.widget.se.d(seVar2, 11, null, 0, new at2.p(qVar2), 6, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z19) {
                at2.q qVar3 = (at2.q) k0Var.getPlugin(at2.q.class);
                if (qVar3 != null) {
                    java.lang.String N63 = ((ct2.j) c(ct2.j.class)).N6();
                    com.tencent.mars.xlog.Log.i(qVar3.f13734p, "showLiveEnd anchorUserName:".concat(N63));
                    qVar3.f365323d.setVisibility(0);
                    qVar3.t1(N63);
                    com.tencent.mm.plugin.finder.live.widget.se seVar3 = qVar3.f13735q;
                    if (seVar3 != null) {
                        com.tencent.mm.plugin.finder.live.widget.se.d(seVar3, 13, null, 0, new at2.m(qVar3), 6, null);
                        return;
                    }
                    return;
                }
                return;
            }
            at2.q qVar4 = (at2.q) k0Var.getPlugin(at2.q.class);
            if (qVar4 != null) {
                java.lang.String N64 = ((ct2.j) c(ct2.j.class)).N6();
                com.tencent.mars.xlog.Log.i(qVar4.f13734p, "showPrivateCount anchorUserName:".concat(N64));
                qVar4.f365323d.setVisibility(0);
                qVar4.t1(N64);
                com.tencent.mm.plugin.finder.live.widget.se seVar4 = qVar4.f13735q;
                if (seVar4 != null) {
                    com.tencent.mm.plugin.finder.live.widget.se.d(seVar4, 10, null, 0, new at2.n(qVar4), 6, null);
                }
            }
        }
    }
}
