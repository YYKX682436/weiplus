package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117429d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f117430e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f117431f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f117432g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.hm f117433h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l8 f117434i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.c6 f117435m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f117436n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f117437o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.wn0 f117438p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f117439q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117429d = "FinderGameLivePostContextUIC";
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        eVar = eVar == null ? new gk2.e("TAG") : eVar;
        this.f117430e = eVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        this.f117431f = liveRoomControllerStore == null ? new com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore(eVar) : liveRoomControllerStore;
        new dk2.r4(new java.lang.ref.WeakReference(activity), eVar, null);
        this.f117432g = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.q(activity));
        this.f117436n = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.p(activity, this));
        this.f117439q = new com.tencent.mm.plugin.finder.live.viewmodel.s(this, activity);
    }

    public final android.view.View O6(int i17, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(i17)).inflate();
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public final com.tencent.mm.plugin.finder.live.view.v1 P6() {
        return (com.tencent.mm.plugin.finder.live.view.v1) ((jz5.n) this.f117436n).getValue();
    }

    public final st2.h1 Q6() {
        return (st2.h1) ((jz5.n) this.f117432g).getValue();
    }

    public final android.view.ViewGroup R6() {
        android.view.ViewGroup viewGroup = this.f117437o;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("rootLayoutView");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f485135go4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117437o = (android.view.ViewGroup) findViewById;
        gk2.e eVar = this.f117430e;
        androidx.lifecycle.b0 b0Var = eVar.f272474h;
        kotlin.jvm.internal.o.e(b0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        b0Var.i(androidx.lifecycle.n.RESUMED);
        if (getActivity().getIntent() != null) {
            r45.n73 n73Var = new r45.n73();
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("GameUserInfo");
            if (byteArrayExtra != null) {
                try {
                    n73Var.parseFrom(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            r45.z73 z73Var = (r45.z73) n73Var.getCustom(5);
            if (z73Var != null) {
                ((mm2.o2) eVar.a(mm2.o2.class)).f329301g = z73Var.getInteger(2);
                mm2.o2 o2Var = (mm2.o2) eVar.a(mm2.o2.class);
                r45.lz1 lz1Var = new r45.lz1();
                lz1Var.set(0, java.lang.Integer.valueOf(z73Var.getInteger(3)));
                lz1Var.set(1, java.lang.Integer.valueOf(z73Var.getInteger(4)));
                o2Var.f329302h = lz1Var;
                ((mm2.o2) eVar.a(mm2.o2.class)).f329303i = z73Var.getInteger(5);
                dk2.p pVar = ((mm2.o2) eVar.a(mm2.o2.class)).f329304m;
                r45.xl1 xl1Var = (r45.xl1) z73Var.getCustom(6);
                pVar.l(xl1Var != null ? xl1Var.getList(1) : null);
                ((mm2.o2) eVar.a(mm2.o2.class)).O6(z73Var.getInteger(8) != 1);
                java.lang.String str = "[saveFuncSwitchFlag] flags = " + z73Var.getLong(9);
                java.lang.String str2 = this.f117429d;
                com.tencent.mars.xlog.Log.i(str2, str);
                ((mm2.c1) eVar.a(mm2.c1.class)).R1 = z73Var.getLong(9);
                mm2.o2 o2Var2 = (mm2.o2) eVar.a(mm2.o2.class);
                r45.dc6 dc6Var = (r45.dc6) z73Var.getCustom(12);
                o2Var2.f329308q = dc6Var != null ? dc6Var.getBoolean(2) : false;
                com.tencent.mars.xlog.Log.i(str2, "[saveGameLiveGlobalFlag] flags = " + z73Var.getInteger(15));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, java.lang.Integer.valueOf(z73Var.getInteger(15)));
                mm2.o2 o2Var3 = (mm2.o2) eVar.a(mm2.o2.class);
                r45.kz0 kz0Var = (r45.kz0) z73Var.getCustom(10);
                o2Var3.f329306o = pm0.v.z(kz0Var != null ? kz0Var.getInteger(1) : 0, 16);
                ((mm2.c1) eVar.a(mm2.c1.class)).J4 = ya2.h.f460484a.b(xy2.c.e(getContext()));
                ((oe0.x) i95.n0.c(oe0.x.class)).getClass();
                if (this.f117435m == null) {
                    android.view.View findViewById2 = R6().findViewById(com.tencent.mm.R.id.ejs);
                    kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                    com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = new com.tencent.mm.plugin.finder.live.plugin.c6((android.view.ViewGroup) findViewById2, P6());
                    this.f117435m = c6Var;
                    c6Var.K0(8);
                    com.tencent.mm.plugin.finder.live.plugin.c6 c6Var2 = this.f117435m;
                    if (c6Var2 != null) {
                        c6Var2.z0();
                    }
                }
                ((mm2.c1) eVar.a(mm2.c1.class)).f328805f6.setValue(java.lang.Boolean.valueOf(z73Var.getBoolean(13)));
                ((mm2.c1) eVar.a(mm2.c1.class)).f328811g6 = (r45.yq1) z73Var.getCustom(14);
                ((mm2.o2) eVar.a(mm2.o2.class)).f329307p = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var.getCustom(19);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelive creatorCenterEntrance:");
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var.getCustom(16);
                sb6.append(finderJumpInfo != null ? java.lang.Integer.valueOf(finderJumpInfo.hashCode()) : null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                ((mm2.c1) eVar.a(mm2.c1.class)).W2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var.getCustom(18);
                ((mm2.c1) eVar.a(mm2.c1.class)).X2 = z73Var.getBoolean(17);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("canShow3d: ");
                sb7.append(((mm2.c1) eVar.a(mm2.c1.class)).X2);
                sb7.append(", data: ");
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                sb7.append((c1Var != null ? c1Var.W2 : null) != null);
                com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).f328778a5 = true;
        findViewById(com.tencent.mm.R.id.f485135go4);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        gk2.e eVar2 = ((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a(activity2).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6();
        ((mm2.c1) eVar.a(mm2.c1.class)).l9(1);
        mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
        java.lang.String e18 = xy2.c.e(getContext());
        kotlin.jvm.internal.o.g(e18, "<set-?>");
        c1Var2.f328852o = e18;
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = new com.tencent.mm.plugin.finder.live.plugin.wn0(R6(), P6());
        this.f117438p = wn0Var;
        wn0Var.z0();
        if (this.f117433h == null) {
            com.tencent.mm.plugin.finder.live.viewmodel.t tVar = new com.tencent.mm.plugin.finder.live.viewmodel.t(O6(com.tencent.mm.R.id.f1i, R6()), P6(), com.tencent.mm.plugin.finder.live.plugin.jj.f113115e);
            this.f117433h = tVar;
            tVar.K0(8);
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f117433h;
            if (hmVar != null) {
                hmVar.z0();
            }
        }
        if (this.f117434i == null) {
            android.view.View findViewById3 = R6().findViewById(com.tencent.mm.R.id.fdg);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = new com.tencent.mm.plugin.finder.live.plugin.l8((android.view.ViewGroup) findViewById3, P6());
            this.f117434i = l8Var;
            l8Var.K0(8);
            com.tencent.mm.plugin.finder.live.plugin.l8 l8Var2 = this.f117434i;
            if (l8Var2 != null) {
                l8Var2.z0();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        gk2.e eVar2 = this.f117430e;
        if (!kotlin.jvm.internal.o.b(eVar2, eVar)) {
            eVar2.b();
        }
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f117438p;
        if (wn0Var != null) {
            wn0Var.O0();
        }
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f117433h;
        if (hmVar != null) {
            hmVar.O0();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = this.f117435m;
        if (c6Var != null) {
            c6Var.onResume();
        }
    }
}
