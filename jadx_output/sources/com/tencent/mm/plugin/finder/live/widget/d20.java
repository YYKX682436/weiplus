package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d20 extends xt2.m implements jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f118042o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f118043p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f118044q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f118045r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f118046s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118042o = root;
        this.f118046s = true;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f0o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f118043p = imageView;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f2j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f118044q = findViewById2;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(root.getContext(), com.tencent.mm.R.raw.finder_icons_filled_gift, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8)));
        dy1.a.i(root, "finder_live_room_gift_icon");
        dy1.a.l(root, 8, 25561);
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.a20(this));
        s();
    }

    @Override // jf2.l
    public void F(int i17) {
        w();
    }

    public final void a(boolean z17) {
        this.f118046s = z17;
        boolean r17 = r(z17);
        android.view.ViewGroup viewGroup = this.f118042o;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456877f;
        if (r17 && !((mm2.e1) lVar.P0(mm2.e1.class)).A) {
            ((mm2.e1) lVar.P0(mm2.e1.class)).A = true;
            dk2.xf j17 = dk2.ef.f233372a.j(lVar.R0());
            if (j17 != null) {
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                dk2.r4 r4Var = (dk2.r4) j17;
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, "[WeCoin] initEngine");
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                dk2.t2 t2Var = new dk2.t2(r4Var, null, null);
                ((ms4.z) iVar).getClass();
                ms4.j0.f331046e.b(context, t2Var);
            }
        }
        if (viewGroup.getVisibility() != 0) {
            if (this.f118045r) {
                dk2.ef.f233392k.f(17);
                this.f118045r = false;
                return;
            }
            return;
        }
        if (this.f118045r) {
            return;
        }
        je2.w wVar = (je2.w) lVar.P0(je2.w.class);
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(17);
        r45.uc2 uc2Var = new r45.uc2();
        uc2Var.set(0, wVar.f299282i);
        tbVar.e(17, uc2Var, new je2.v(wVar, r45.vc2.class), false);
        this.f118045r = true;
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f118042o;
        if (viewGroup.getVisibility() != 0) {
            w();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_outlined_gift), java.lang.Integer.valueOf(com.tencent.mm.R.string.mip));
    }

    @Override // jf2.m
    public void e(int i17) {
        t();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f118042o.findViewById(com.tencent.mm.R.id.ezy);
    }

    @Override // jf2.o
    public void g() {
        this.f118042o.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118042o;
    }

    @Override // jf2.o
    public boolean i() {
        return r(this.f118046s);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f118043p;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveVisitorGiftWidget";
    }

    @Override // xt2.m
    public com.tencent.mm.view.MMPAGView m() {
        android.view.View findViewById = this.f118042o.findViewById(com.tencent.mm.R.id.f484665f34);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.view.MMPAGView) findViewById;
    }

    public final boolean r(boolean z17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
            if (!(I1 != null && I1.v0())) {
                if (!z17 || zl2.r4.f473950a.P1(this.f456877f.S0()) || ((mm2.c1) this.f456877f.P0(mm2.c1.class)).T) {
                    return false;
                }
                return !(((mm2.n0) this.f456877f.P0(mm2.n0.class)).f329273r) && ((mm2.c1) this.f456877f.P0(mm2.c1.class)).m7() && ((mm2.c1) this.f456877f.P0(mm2.c1.class)).a8();
            }
        }
        this.f118042o.setVisibility(8);
        com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorGiftWidget", "setVisible return for isTeenMode or accountLimit");
        return false;
    }

    public final void s() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, false);
        android.view.View view = this.f118044q;
        int i17 = o17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void t() {
        xu2.u uVar;
        xu2.v vVar;
        r45.yx1 Q6;
        java.lang.Object obj;
        km2.q qVar;
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.f3705b6;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != -1) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
            if (intValue == 1) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.content.Context context = this.f118042o.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (r4Var.v(context, "FinderLiveLegalPromot1", com.tencent.mm.plugin.finder.live.widget.b20.f117813d)) {
                    return;
                }
            } else if (intValue == 2) {
                zl2.r4 r4Var2 = zl2.r4.f473950a;
                android.content.Context context2 = this.f118042o.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (r4Var2.v(context2, "FinderLiveLegalPromot2", com.tencent.mm.plugin.finder.live.widget.c20.f117946d)) {
                    return;
                }
            }
        }
        qo0.c cVar = this.f456876e;
        qo0.b bVar = qo0.b.S1;
        android.os.Bundle bundle = new android.os.Bundle();
        if (((mm2.e1) this.f456877f.P0(mm2.e1.class)).b7() && (Q6 = ((om2.g) this.f456877f.P0(om2.g.class)).Q6()) != null && !kotlin.jvm.internal.o.b(Q6.f391469r, ((mm2.c1) this.f456877f.P0(mm2.c1.class)).m8())) {
            java.lang.String str = Q6.f391469r;
            if (str == null) {
                str = "";
            }
            if (kotlin.jvm.internal.o.b(str, ((mm2.o4) this.f456877f.P0(mm2.o4.class)).a7().f309170a)) {
                qVar = ((mm2.o4) this.f456877f.P0(mm2.o4.class)).a7();
            } else {
                java.util.List list = ((mm2.o4) this.f456877f.P0(mm2.o4.class)).f329327v;
                kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                                break;
                            }
                        }
                    }
                }
                qVar = (km2.q) obj;
            }
            if (qVar != null) {
                bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", qVar.f309172c);
                bundle.putString("PARAM_FINDER_LIVE_LINK_NICKNAME", qVar.f309173d);
                bundle.putString("PARAM_FINDER_LIVE_LINK_AVATAR", qVar.f309171b);
            }
        }
        cVar.statusChange(bVar, bundle);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327981r, null, null, null, null, null, false, 126, null);
        if (!((mm2.c1) this.f456877f.P0(mm2.c1.class)).M7() || (uVar = (xu2.u) this.f456877f.X0(xu2.u.class)) == null || (vVar = uVar.f457232r) == null) {
            return;
        }
        vVar.a();
        vVar.c(2017);
    }

    @Override // jf2.o
    public int type() {
        return 15;
    }

    public final void w() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328097x, null, null, null, null, null, false, 126, null);
        boolean z17 = ((ml2.r0) i95.n0.c(ml2.r0.class)).O1;
        android.view.ViewGroup viewGroup = this.f118042o;
        if (!z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", viewGroup, null, 25561);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327530n, "", viewGroup.getVisibility());
    }
}
