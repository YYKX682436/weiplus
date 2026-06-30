package df2;

/* loaded from: classes3.dex */
public final class ox extends if2.b implements if2.e, mf2.v {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f231012m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f231013n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231014o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f231015p;

    /* renamed from: q, reason: collision with root package name */
    public pk2.o9 f231016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(android.content.Intent intent) {
        android.content.Intent intent2;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.MoreActionController", "checkAutoShow, doAction:" + valueOf + ", isLiveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8());
        if (valueOf != null && valueOf.intValue() == 1 && ((mm2.c1) business(mm2.c1.class)).a8()) {
            com.tencent.mm.ui.MMActivity N6 = N6();
            if (N6 != null && (intent2 = N6.getIntent()) != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            pm0.v.V(1000L, new df2.lx(this));
        }
    }

    public final void a7() {
        el2.r2 r2Var;
        jz5.f0 f0Var;
        android.view.View reddotView = this.f231014o;
        if (c7()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f231015p;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(O6(), com.tencent.mm.R.raw.finder_full_share_new, -1));
            }
        } else if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f231015p;
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(O6(), com.tencent.mm.R.raw.finder_full_share_new, -1));
            }
        } else {
            android.view.View view = this.f231013n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "enableBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "enableBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if2.d0 d0Var = this.f231012m;
            if (d0Var != null) {
                d0Var.d(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var == null || (r2Var = ag0Var.I) == null) {
                reddotView = this.f231014o;
            } else {
                reddotView = r2Var.f253903h;
                kotlin.jvm.internal.o.f(reddotView, "reddotView");
            }
        }
        if2.d0 d0Var2 = this.f231012m;
        if (d0Var2 != null) {
            d0Var2.d(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableBtn moreActionBtn:");
        android.view.View view2 = this.f231013n;
        sb6.append(view2 != null ? view2.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.MoreActionController", sb6.toString());
        android.view.View view3 = this.f231013n;
        if (view3 != null) {
            view3.setOnClickListener(new df2.mx(this));
        }
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            pk2.o9 o9Var = new pk2.o9(this, N6);
            this.f231016q = o9Var;
            zl2.r4 r4Var = zl2.r4.f473950a;
            boolean w17 = r4Var.w1();
            pk2.d9 d9Var = o9Var.f356082f;
            if (w17 || c7()) {
                qk2.a aVar = new qk2.a(o9Var, r4Var.w1() ? this.f231014o : null);
                if (d9Var != null) {
                    pk2.o9 o9Var2 = d9Var.f355680w;
                    o9Var2.f356086h = aVar;
                    d9Var.d(new pk2.b8(o9Var2, 0));
                    d9Var.d(new pk2.d8(o9Var2, 0));
                    d9Var.d(new pk2.r7(o9Var2, 0));
                    d9Var.d(new pk2.t7(o9Var2, 0));
                    aVar.m();
                }
            } else if (((mm2.c1) business(mm2.c1.class)).T) {
                qk2.b bVar = new qk2.b(o9Var, this.f231014o);
                if (d9Var != null) {
                    pk2.o9 o9Var3 = d9Var.f355680w;
                    o9Var3.f356086h = bVar;
                    d9Var.d(new pk2.b8(o9Var3, 3));
                    d9Var.d(new pk2.d8(o9Var3, 3));
                    d9Var.d(new pk2.q7(o9Var3, 3));
                    d9Var.b(new pk2.o2(o9Var3, 3));
                    d9Var.c(new pk2.t1(o9Var3, 3));
                    d9Var.c(new pk2.g6(o9Var3, 3));
                    d9Var.c(new pk2.p2(o9Var3, 3));
                    d9Var.c(new pk2.j6(o9Var3, 3));
                    bVar.m();
                }
            } else {
                qk2.i iVar = new qk2.i(o9Var, reddotView);
                if (d9Var != null) {
                    pk2.o9 o9Var4 = d9Var.f355680w;
                    o9Var4.f356086h = iVar;
                    d9Var.b(new pk2.b8(o9Var4, 2));
                    d9Var.b(new pk2.d8(o9Var4, 2));
                    d9Var.b(new pk2.q7(o9Var4, 2));
                    d9Var.b(new pk2.pb(o9Var4, 2));
                    d9Var.b(new pk2.r7(o9Var4, 2));
                    d9Var.b(new pk2.w9(o9Var4, 2));
                    d9Var.c(new pk2.x9(o9Var4, 2));
                    d9Var.c(new pk2.ua(o9Var4, 2));
                    d9Var.c(new pk2.ka(o9Var4, 2));
                    d9Var.c(new pk2.nb(o9Var4, 2));
                    d9Var.c(new pk2.qb(o9Var4, 2));
                    d9Var.c(new pk2.sb(o9Var4, 2));
                    d9Var.c(new pk2.wb(o9Var4, 2));
                    d9Var.c(new pk2.bb(o9Var4, 2));
                    d9Var.c(new pk2.kb(o9Var4, 2));
                    d9Var.c(new pk2.fa(o9Var4, 2));
                    d9Var.c(new pk2.sa(o9Var4, 2));
                    iVar.m();
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f231016q = null;
            com.tencent.mars.xlog.Log.e("Finder.MoreActionController", "enbleBtn but activity is null");
        }
    }

    public final if2.d0 b7() {
        return this.f231012m;
    }

    public final boolean c7() {
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        return (n0Var != null && n0Var.f329273r) || ((mm2.c1) business(mm2.c1.class)).T;
    }

    public final void d7() {
        pk2.d9 d9Var;
        kotlinx.coroutines.f1 f1Var;
        android.widget.TextView textView;
        pk2.d9 d9Var2;
        if (!zl2.r4.f473950a.w1() && !c7()) {
            pk2.o9 o9Var = this.f231016q;
            if (o9Var == null || (d9Var2 = o9Var.f356082f) == null) {
                return;
            }
            d9Var2.e();
            return;
        }
        pk2.o9 o9Var2 = this.f231016q;
        if (o9Var2 == null || (d9Var = o9Var2.f356082f) == null) {
            return;
        }
        pk2.o9 o9Var3 = d9Var.f355680w;
        com.tencent.mm.ui.MMActivity mMActivity = o9Var3.f356078d;
        if (d9Var.f355661d == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 0, true);
            d9Var.f355661d = k0Var;
            k0Var.X1 = o9Var3.h();
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = d9Var.f355661d;
            if (k0Var2 != null) {
                k0Var2.U1 = true;
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = d9Var.f355661d;
        if (k0Var3 != null) {
            k0Var3.f211876p = new pk2.j8(d9Var, o9Var3);
        }
        if (d9Var.f355666i == null) {
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            d9Var.f355666i = new com.tencent.mm.pluginsdk.forward.m();
            r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(mMActivity, 14, r45.pk5.class);
            if (pk5Var != null) {
                pk5Var.f383137i = 8;
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = d9Var.f355661d;
        if (k0Var4 != null) {
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479001n5);
            if (k0Var4.W != null && (textView = k0Var4.f211887x0) != null) {
                textView.setTextColor(color);
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var5 = d9Var.f355661d;
        if (k0Var5 != null) {
            k0Var5.f211872n = new pk2.p8(d9Var);
        }
        if (k0Var5 != null) {
            k0Var5.f211885w = d9Var.f355677t;
        }
        if (k0Var5 != null) {
            k0Var5.f211881s = d9Var.f355676s;
        }
        if (k0Var5 != null) {
            k0Var5.p(new pk2.k8(d9Var, o9Var3));
        }
        kotlinx.coroutines.f1 f1Var2 = null;
        pk2.d9 d9Var3 = o9Var3.f356082f;
        if (d9Var3 != null && (f1Var = d9Var3.f355668k) != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
        if (d9Var3 != null) {
            pk2.g8 g8Var = d9Var3.f355658a;
            if (g8Var != null) {
                f1Var2 = com.tencent.mm.plugin.finder.live.util.y.i(((pk2.k9) g8Var).f355924a, oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, new pk2.u7(o9Var3, null));
            }
            d9Var3.f355668k = f1Var2;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var6 = d9Var.f355661d;
        if (k0Var6 != null) {
            k0Var6.v();
        }
    }

    @Override // mf2.v
    public void e0() {
        pk2.o9 o9Var = this.f231016q;
        if (o9Var != null) {
            pk2.la.a(o9Var, true);
        }
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1009) {
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IS_FROM_SETTING", false) : false;
            com.tencent.mars.xlog.Log.i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + booleanExtra);
            df2.ve veVar = (df2.ve) controller(df2.ve.class);
            if (veVar != null) {
                veVar.f231596n = null;
                veVar.f231597o = null;
                veVar.f231598p = null;
                veVar.f231599q = null;
            }
            if (i18 != -1 || booleanExtra) {
                com.tencent.mars.xlog.Log.i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE resultCode:" + i18 + ",data:" + intent);
            } else {
                dk2.xf P6 = P6();
                if (P6 != null) {
                    ((dk2.r4) P6).q(intent);
                }
            }
            int integer = g92.b.f269769e.k2().getInteger(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 2);
            jSONObject.put("sub_element", integer);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(23);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        pk2.o9 o9Var = this.f231016q;
        if (o9Var != null) {
            pk2.d9 d9Var = o9Var.f356082f;
        }
        if2.d0 d0Var = this.f231012m;
        if (d0Var != null) {
            d0Var.d(4);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        ((mm2.c1) business(mm2.c1.class)).Q5 = hc1Var != null ? (r45.qw1) hc1Var.getCustom(70) : null;
        a7();
        com.tencent.mm.ui.MMActivity N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // if2.e
    public void onNewIntent(android.content.Intent intent) {
        Z6(intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.fbg);
        kotlin.jvm.internal.o.d(viewGroup);
        this.f231012m = new if2.d0(viewGroup, this);
        this.f291103i = new df2.nx(this);
        this.f231013n = viewGroup.findViewById(com.tencent.mm.R.id.fbf);
        this.f231015p = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.fbe);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.lqe);
        this.f231014o = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.w1()) {
            android.view.View findViewById2 = pluginLayout.findViewById(com.tencent.mm.R.id.fbg);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            r4Var.c((android.view.ViewGroup) findViewById2, U6());
        }
        if (c7()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f231015p;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(pluginLayout.getContext(), com.tencent.mm.R.raw.finder_full_share_new, -1));
            }
        } else if (r4Var.w1()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f231015p;
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(pluginLayout.getContext(), com.tencent.mm.R.raw.finder_full_share_new, -1));
            }
        } else {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3783j4).getValue()).r()).intValue() == 0) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f231015p;
                if (weImageView3 != null) {
                    weImageView3.setImageDrawable(com.tencent.mm.ui.uk.e(pluginLayout.getContext(), com.tencent.mm.R.raw.finder_full_share_new, -1));
                }
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f231015p;
                if (weImageView4 != null) {
                    weImageView4.setImageDrawable(com.tencent.mm.ui.uk.e(pluginLayout.getContext(), com.tencent.mm.R.raw.icons_filled_more, -1));
                }
            }
        }
        if2.d0 d0Var = this.f231012m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        if (((mm2.c1) business(mm2.c1.class)).a8()) {
            a7();
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        if2.d0 d0Var;
        pk2.d9 d9Var;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        pk2.o9 o9Var = this.f231016q;
        if (o9Var != null && (d9Var = o9Var.f356082f) != null) {
            d9Var.i();
        }
        this.f231016q = null;
        if (!zl2.r4.f473950a.w1() && (d0Var = this.f231012m) != null) {
            d0Var.d(8);
        }
        this.f231012m = null;
        this.f231013n = null;
        this.f231014o = null;
        this.f231015p = null;
    }

    @Override // if2.e
    public void resume() {
        com.tencent.mm.ui.MMActivity N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // mf2.v
    public void s6(int i17, android.os.Bundle bundle) {
        pk2.o9 o9Var;
        if (i17 == 22) {
            pk2.o9 o9Var2 = this.f231016q;
            if (o9Var2 != null) {
                pk2.la.a(o9Var2, true);
                return;
            }
            return;
        }
        if (i17 != 23 || (o9Var = this.f231016q) == null) {
            return;
        }
        pk2.la.a(o9Var, false);
    }
}
