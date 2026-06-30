package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f30 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118306d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118307e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f118308f;

    public f30(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118306d = root;
        this.f118307e = basePlugin;
        this.f118308f = "Finder.FinderLiveVisitorLuckyMoneyEntranceWidget";
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(root, "finder_live_link_red_packet");
        if (statusMonitor.getLiveRole() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(root, 8, 25561);
        }
        root.setOnClickListener(this);
    }

    @Override // jf2.l
    public void F(int i17) {
        l();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f118306d;
        if (viewGroup.getVisibility() != 0) {
            l();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_lucky_money), java.lang.Integer.valueOf(com.tencent.mm.R.string.dsi));
    }

    @Override // jf2.m
    public void e(int i17) {
        k();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return null;
    }

    @Override // jf2.o
    public void g() {
        this.f118306d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118306d;
    }

    @Override // jf2.o
    public boolean i() {
        java.lang.Object obj;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.w(this.f118308f, "setVisible return for isTeenMode");
            return false;
        }
        java.util.List list = ((mm2.o4) this.f118307e.P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) this.f118307e.P0(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        return obj != null && ((mm2.c1) this.f118307e.P0(mm2.c1.class)).o7() && ((mm2.c1) this.f118307e.P0(mm2.c1.class)).I7().getInteger(2) == 1;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f118306d.findViewById(com.tencent.mm.R.id.vnt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        java.lang.Object obj;
        dk2.xf W0;
        r45.xn1 xn1Var;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        if (intValue == 0 || intValue == 1) {
            java.util.List list = ((mm2.o4) this.f118307e.P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) this.f118307e.P0(mm2.c1.class)).m8())) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if ((qVar == null || (xn1Var = qVar.f309187r) == null || !km2.o.a(xn1Var)) ? false : true) {
                db5.t7.makeText(this.f118306d.getContext(), this.f118306d.getContext().getResources().getString(com.tencent.mm.R.string.mkx), 0).show();
                return;
            } else if ((this.f118306d.getContext() instanceof android.app.Activity) && (W0 = this.f118307e.W0()) != null) {
                android.content.Context context = this.f118306d.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((dk2.r4) W0).V((android.app.Activity) context);
            }
        } else {
            db5.t7.makeText(this.f118306d.getContext(), this.f118306d.getContext().getResources().getString(com.tencent.mm.R.string.dsn), 0).show();
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S, null, null, null, null, null, false, 126, null);
    }

    public final void l() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.S, null, null, null, null, null, false, 126, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.tpx) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // jf2.o
    public int type() {
        return 7;
    }
}
