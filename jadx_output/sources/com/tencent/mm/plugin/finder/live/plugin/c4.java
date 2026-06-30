package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c4 extends com.tencent.mm.plugin.finder.live.plugin.g {
    public final com.tencent.mm.plugin.finder.live.widget.xp A;
    public final on2.d B;
    public final com.tencent.mm.plugin.finder.live.widget.w4 C;
    public final com.tencent.mm.plugin.finder.live.widget.l5 D;
    public final com.tencent.mm.plugin.finder.live.widget.v6 E;
    public final java.util.HashMap F;
    public final jz5.g G;
    public int H;
    public final java.util.List I;

    /* renamed from: v, reason: collision with root package name */
    public final qo0.c f112102v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f112103w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f112104x;

    /* renamed from: y, reason: collision with root package name */
    public final xt2.d f112105y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.s6 f112106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        jy2.b bVar;
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var;
        com.tencent.mm.plugin.finder.live.widget.u4 u4Var;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112102v = statusMonitor;
        this.f112103w = "Finder.FinderLiveAnchorBottomOptionPlugin";
        this.f112104x = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.a4(root));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.muu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        xt2.d dVar = new xt2.d((android.view.ViewGroup) findViewById, statusMonitor, this);
        this.f112105y = dVar;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.i2v);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.s6 s6Var = new com.tencent.mm.plugin.finder.live.widget.s6((android.view.ViewGroup) findViewById2, statusMonitor, this);
        this.f112106z = s6Var;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.qxu);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.h40 h40Var = new com.tencent.mm.plugin.finder.live.widget.h40((android.view.ViewGroup) findViewById3, statusMonitor, this);
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f486015jv3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.xp xpVar = new com.tencent.mm.plugin.finder.live.widget.xp((android.view.ViewGroup) findViewById4, statusMonitor, this);
        this.A = xpVar;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.tzs);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.i5 i5Var = new com.tencent.mm.plugin.finder.live.widget.i5((android.view.ViewGroup) findViewById5, statusMonitor, this);
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.j0u);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.o6 o6Var = new com.tencent.mm.plugin.finder.live.widget.o6((android.view.ViewGroup) findViewById6, statusMonitor, this);
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.iri);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.B = new on2.d((android.view.ViewGroup) findViewById7, statusMonitor, this);
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.er_);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.w4 w4Var = new com.tencent.mm.plugin.finder.live.widget.w4((android.view.ViewGroup) findViewById8, statusMonitor, this);
        this.C = w4Var;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f485013tx0);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.g5 g5Var = new com.tencent.mm.plugin.finder.live.widget.g5((android.view.ViewGroup) findViewById9, statusMonitor, this);
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.jyz);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.u4 u4Var2 = new com.tencent.mm.plugin.finder.live.widget.u4((android.view.ViewGroup) findViewById10, statusMonitor, this);
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.eyy);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var2 = new com.tencent.mm.plugin.finder.live.widget.l5((android.view.ViewGroup) findViewById11, statusMonitor, this);
        this.D = l5Var2;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.p96);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        jy2.b bVar2 = new jy2.b((android.view.ViewGroup) findViewById12, statusMonitor, this);
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.jrk);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.v6 v6Var = new com.tencent.mm.plugin.finder.live.widget.v6((android.view.ViewGroup) findViewById13, statusMonitor, this);
        this.E = v6Var;
        this.F = kz5.c1.i(new jz5.l(16, dVar), new jz5.l(10, s6Var), new jz5.l(12, xpVar), new jz5.l(11, l5Var2), new jz5.l(5, w4Var), new jz5.l(1, v6Var), new jz5.l(18, h40Var), new jz5.l(8, u4Var2), new jz5.l(24, g5Var), new jz5.l(25, i5Var), new jz5.l(2, bVar2));
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.z3(root));
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!x0()) {
            if (!(sn0.b.f409964e2 != null)) {
                root.post(new com.tencent.mm.plugin.finder.live.plugin.w3(root, i17, this));
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.x3 x3Var = new com.tencent.mm.plugin.finder.live.plugin.x3(this, root, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(root, x3Var);
        if (x0()) {
            bVar = bVar2;
            l5Var = l5Var2;
            u4Var = u4Var2;
        } else {
            bVar = bVar2;
            l5Var = l5Var2;
            u4Var = u4Var2;
            zl2.r4.o3(zl2.r4.f473950a, root, "Finder.FinderLiveAnchorBottomOptionPlugin", false, false, 12, null);
        }
        this.I = kz5.c0.i(w4Var, g5Var, dVar, s6Var, xpVar, h40Var, o6Var, u4Var, l5Var, i5Var, bVar);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode is ok:");
        sb6.append(i18 == -1);
        com.tencent.mars.xlog.Log.i(this.f112103w, sb6.toString());
        on2.d dVar = this.B;
        dVar.getClass();
        if (i17 == 1002 && i18 == -1) {
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1)) : null;
            com.tencent.mars.xlog.Log.i(dVar.f346863g, "onActivityResult Source:" + valueOf);
            qo0.c.a(dVar.f346861e, qo0.b.f365373k3, null, 2, null);
            com.tencent.mm.plugin.finder.live.util.y.a(dVar.f346862f, kotlinx.coroutines.q1.f310570c, null, new on2.b(dVar, null), 2, null);
            if (valueOf == null) {
                return;
            }
            valueOf.intValue();
        }
    }

    public final void C1() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        jz5.g gVar = this.G;
        android.content.Context context = ((android.view.ViewGroup) ((jz5.n) gVar).getValue()).getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (r4Var.Y1(context)) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int childCount = ((android.view.ViewGroup) ((jz5.n) gVar).getValue()).getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = ((android.view.ViewGroup) ((jz5.n) gVar).getValue()).getChildAt(i18);
            android.view.View view = childAt.getVisibility() == 0 ? childAt : null;
            if (view != null) {
                linkedList.add(view);
            }
            i18++;
        }
        if (this.H != linkedList.size()) {
            this.H = linkedList.size();
            for (java.lang.Object obj : linkedList) {
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view2 = (android.view.View) obj;
                if (i17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMargins(((java.lang.Number) ((jz5.n) this.f112104x).getValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    } else {
                        marginLayoutParams = null;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMargins(i65.a.f(this.f365323d.getContext(), com.tencent.mm.R.dimen.f479672c9), marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    } else {
                        marginLayoutParams2 = null;
                    }
                    view2.setLayoutParams(marginLayoutParams2);
                }
                i17 = i19;
            }
        }
    }

    public final void D1(android.content.Intent intent) {
        android.content.Intent intent2;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (intent == null) {
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            intent = activity != null ? activity.getIntent() : null;
        }
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 7 && ((mm2.c1) P0(mm2.c1.class)).X2) {
            android.content.Context context2 = viewGroup.getContext();
            android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.E.k(null);
            zl2.r4.f473950a.e3();
        }
    }

    public final void E1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.y3(this));
    }

    public final void F1() {
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            this.A.f120367i = true;
            G1();
            K0(0);
            C1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        if (((mm2.c1) P0(mm2.c1.class)).X2) {
            D1(null);
        }
        com.tencent.mm.plugin.finder.live.widget.v6 v6Var = this.E;
        if (v6Var.f120041f) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328098x0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            ll2.e.f319133a.j(v6Var.f120043h, false);
            v6Var.f120041f = false;
            gk2.e S0 = v6Var.f120040e.S0();
            if (S0 != null) {
                bf2.c.b(bf2.c.f19598a, S0, 1, 0, null, 0, 28, null);
            }
        }
        v6Var.f120039d.setVisibility(0);
    }

    public final void H1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchor animate close def ");
        r45.ym1 ym1Var = ((mm2.c1) P0(mm2.c1.class)).f328831k4;
        sb6.append(ym1Var != null ? java.lang.Integer.valueOf(ym1Var.getInteger(3)) : null);
        com.tencent.mars.xlog.Log.i("LiveButtonChangeController", sb6.toString());
        r45.ym1 ym1Var2 = ((mm2.c1) P0(mm2.c1.class)).f328831k4;
        if ((ym1Var2 != null ? ym1Var2.getInteger(3) : 0) > 0) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.b4(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        jf2.u uVar;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            this.E.getClass();
            return;
        }
        if (ordinal == 123) {
            this.A.f120367i = true;
        } else if (ordinal == 124 && (uVar = (jf2.u) U0(jf2.u.class)) != null) {
            jf2.u.a7(uVar, "liveModeChange", false, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        pk2.d9 d9Var;
        super.O0();
        this.B.getClass();
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var = this.D;
        mm2.c1 c1Var = (mm2.c1) l5Var.f118900f.P0(mm2.c1.class);
        c1Var.f328833k6.postValue("");
        c1Var.f328805f6.postValue(java.lang.Boolean.FALSE);
        c1Var.f328811g6 = null;
        c1Var.f328839l6 = "";
        l5Var.f118898d.setVisibility(8);
        xt2.d dVar = this.f112105y;
        dVar.getClass();
        ll2.e.f319133a.e(dVar.f456672u, false);
        pk2.o9 o9Var = this.E.f120044i;
        if (o9Var == null || (d9Var = o9Var.f356082f) == null) {
            return;
        }
        d9Var.i();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void k1(android.content.Intent intent) {
        D1(intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        on2.d dVar = this.B;
        dVar.getClass();
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_CREATE_LOTTERY")) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = dVar.f346862f;
            java.lang.String str = ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v;
            long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328983m;
            java.lang.String str2 = ((mm2.c1) lVar.P0(mm2.c1.class)).f328852o;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToCreateLotteryImpl root.context is activity:");
            android.view.ViewGroup viewGroup = dVar.f346860d;
            sb6.append(viewGroup.getContext() instanceof android.app.Activity);
            sb6.append(",liveId:");
            sb6.append(j17);
            sb6.append(",objectId:");
            sb6.append(j18);
            sb6.append(",nonceId:");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(dVar.f346863g, sb6.toString());
            if (!(viewGroup.getContext() instanceof android.app.Activity) || j17 == 0 || j18 == 0) {
                return;
            }
            if (str.length() > 0) {
                if (((mm2.c1) lVar.P0(mm2.c1.class)).T) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(1);
                }
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
                intent.putExtra("KEY_PARAMS_LIVE_ID", j17);
                intent.putExtra("KEY_PARAMS_OBJECT_ID", j18);
                intent.putExtra("KEY_PARAMS_NONCE_ID", str);
                intent.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str2);
                ((com.tencent.mm.plugin.finder.assist.i0) ubVar).sj((android.app.Activity) context, intent, 1002);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.g
    public java.util.HashMap v1() {
        return this.F;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.g, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        jf2.u uVar;
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var = this.D;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = l5Var.f118900f;
        ((mm2.c1) lVar.S0().a(mm2.c1.class)).f328805f6.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.k5(l5Var));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.I) {
            if (obj instanceof jf2.h) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            jf2.h hVar = next instanceof jf2.h ? (jf2.h) next : null;
            if (hVar != null && (uVar = (jf2.u) U0(jf2.u.class)) != null) {
                java.util.LinkedList linkedList = uVar.f299400o;
                if (!linkedList.contains(hVar)) {
                    com.tencent.mars.xlog.Log.i(uVar.f299398m, "registerEntrance = " + hVar);
                    linkedList.add(hVar);
                }
            }
        }
        jf2.u uVar2 = (jf2.u) U0(jf2.u.class);
        if (uVar2 != null) {
            jf2.u.a7(uVar2, this.f112103w + "-mount", false, 2, null);
        }
    }
}
