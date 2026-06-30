package com.tencent.mm.plugin.finder.nearby.person;

/* loaded from: classes15.dex */
public final class NearbyPersonV1UIC extends mq2.c {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public com.tencent.mm.ui.widget.dialog.k0 H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f122091J;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f122092g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f122093h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f122094i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f122095m;

    /* renamed from: n, reason: collision with root package name */
    public mq2.h f122096n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f122097o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f122098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f122099q;

    /* renamed from: r, reason: collision with root package name */
    public int f122100r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f122101s;

    /* renamed from: t, reason: collision with root package name */
    public i11.e f122102t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f122103u;

    /* renamed from: v, reason: collision with root package name */
    public mq2.b f122104v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f122105w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f122106x;

    /* renamed from: y, reason: collision with root package name */
    public final i11.c f122107y;

    /* renamed from: z, reason: collision with root package name */
    public long f122108z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyPersonV1UIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        new java.util.LinkedList();
        this.f122098p = new java.util.LinkedList();
        this.f122100r = 1;
        this.f122107y = new mq2.q(this);
        this.D = true;
        this.E = true;
        this.G = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LbsSayHiEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$sayHiListener$1
            {
                this.__eventId = -772738789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent) {
                com.tencent.mm.autogen.events.LbsSayHiEvent event = lbsSayHiEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.sdk.platformtools.u3.h(new mq2.v(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.this));
                return false;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        nearbyPersonV1UIC.getClass();
        if (!((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            nearbyPersonV1UIC.W6();
            nearbyPersonV1UIC.U6();
            return;
        }
        if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227169t, new mq2.m(nearbyPersonV1UIC))) {
            nearbyPersonV1UIC.R6();
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "handleOnStartLoadData return for permission:" + nearbyPersonV1UIC.f122091J);
    }

    public final boolean P6() {
        boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6();
        this.f122091J = N6;
        return N6;
    }

    public final void Q6() {
        if (!this.F) {
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.F);
            return;
        }
        if (!this.C) {
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.C);
            return;
        }
        if (this.f122091J) {
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.f122091J);
            return;
        }
        if (!((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for permission:" + this.f122091J);
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain requestInit");
        com.tencent.mars.xlog.Log.w("NearbyPersonUIC", "dismissPermissionView");
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.hzf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6();
    }

    public final void R6() {
        int P;
        java.util.Map map;
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "fetchDataInternal hasLoadData:" + this.A);
        if (this.A) {
            return;
        }
        X6();
        if (com.tencent.mm.sdk.platformtools.m2.m()) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_nearby_ad, "", true), "lbsads", null);
            if (d17 != null && (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".lbsads.$count"), 0)) > 0) {
                int i17 = 0;
                while (true) {
                    map = this.f330724f;
                    if (i17 >= P) {
                        break;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".lbsads.lbsad");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    mq2.a aVar = new mq2.a();
                    aVar.f330704a = (java.lang.String) d17.get(sb7 + ".$id");
                    aVar.f330705b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$pos"), 0);
                    aVar.f330706c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$close_times"), 0);
                    aVar.f330707d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$show_times"), Integer.MAX_VALUE);
                    aVar.f330708e = (java.lang.String) d17.get(sb7 + ".name");
                    aVar.f330709f = (java.lang.String) d17.get(sb7 + ".desc");
                    aVar.f330710g = (java.lang.String) d17.get(sb7 + ".icon");
                    aVar.f330711h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".jump.$type"), 0);
                    aVar.f330712i = (java.lang.String) d17.get(sb7 + ".jump");
                    java.lang.String str = aVar.f330704a;
                    kotlin.jvm.internal.o.d(str);
                    ((java.util.HashMap) map).put(str, aVar);
                    i17++;
                }
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, null);
                if (str2 != null) {
                    for (java.lang.String str3 : (java.lang.String[]) r26.n0.f0(str2, new java.lang.String[]{"\\|"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str3, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
                        if (strArr.length == 3) {
                            mq2.a aVar2 = (mq2.a) ((java.util.HashMap) map).get(strArr[0]);
                            if (aVar2 != null) {
                                aVar2.f330713j = com.tencent.mm.sdk.platformtools.t8.P(strArr[1], 0);
                                aVar2.f330714k = com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0);
                            }
                        }
                    }
                }
            }
        }
        this.A = true;
    }

    public final boolean S6(r45.b64 b64Var) {
        r45.cb6 cb6Var = b64Var.f370566w;
        return cb6Var != null && (cb6Var.f371428d & 1) > 0;
    }

    public final void T6() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = this.f122098p.size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            if (!(((r45.b64) this.f122098p.get(i19)).f370556m == 10000)) {
                linkedList.add(this.f122098p.get(i19));
            }
            i19++;
        }
        this.f122098p.clear();
        this.f122098p = linkedList;
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "mergeADItemList friendList size:" + this.f122098p.size());
        boolean isEmpty = this.f122098p.isEmpty() ^ true;
        java.util.Map map = this.f330724f;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (isEmpty) {
                mq2.a aVar = (mq2.a) ((java.util.HashMap) map).get(str);
                kotlin.jvm.internal.o.d(aVar);
                if (!aVar.f330716m && ((i17 = aVar.f330706c) < 1 || aVar.f330713j < i17)) {
                    if (aVar.f330714k < aVar.f330707d) {
                        java.util.List list = this.f122098p;
                        int i27 = aVar.f330705b;
                        int size2 = (i27 < 0 || i27 > list.size()) ? this.f122098p.size() : aVar.f330705b + i18;
                        java.lang.String str2 = aVar.f330704a;
                        java.lang.String str3 = aVar.f330710g;
                        java.lang.String str4 = aVar.f330708e;
                        java.lang.String str5 = aVar.f330709f;
                        java.lang.String str6 = aVar.f330712i;
                        ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
                        an3.c cVar = new an3.c();
                        cVar.f370556m = 10000;
                        cVar.f370550d = str2;
                        cVar.f370569z = str3;
                        cVar.f370555i = str5;
                        cVar.f370551e = str4;
                        cVar.f370552f = str6;
                        list.add(size2, cVar);
                        i18++;
                    }
                }
            }
        }
    }

    public final void U6() {
        boolean Di;
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            ((sb0.f) jVar).getClass();
            Di = j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true);
            if (!Di) {
                if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                    androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                    ((sb0.f) jVar2).getClass();
                    j35.u.i(activity2, "android.permission.ACCESS_FINE_LOCATION", com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
                } else {
                    js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                    androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                    java.lang.String string = getActivity().getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d());
                    ((is.h) s0Var).getClass();
                    c71.b.c(activity3, string, 30764, true);
                }
            }
        } else {
            Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(getActivity(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, null, null);
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "requestLocationPermission checkLocation:" + Di);
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "showLbsTips");
        qa0.e eVar = (qa0.e) i95.n0.c(qa0.e.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((pa0.e) eVar).getClass();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.e(activity);
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.w("NearbyPersonUIC", "showNoPermissionView");
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.hzf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRootView().findViewById(com.tencent.mm.R.id.hzg).setOnClickListener(new mq2.e0(this));
    }

    public final void X6() {
        gm0.j1.d().a(148, this);
        gm0.j1.d().a(1087, this);
        this.f122095m = db5.e1.Q(getActivity(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.h69), true, true, new mq2.d0(this));
        this.f122103u = false;
        this.f122106x = false;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f122102t = e17;
        if (e17 != null) {
            e17.l(this.f122107y, true, false, false);
        }
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public final void Y6() {
        ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
        if (!m25.a.c()) {
            ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
            if (!m25.a.b()) {
                return;
            }
        }
        android.view.View view = null;
        if (this.f122094i != null) {
            android.widget.ListView listView = this.f122093h;
            kotlin.jvm.internal.o.d(listView);
            listView.removeHeaderView(this.f122094i);
            this.f122094i = null;
        }
        android.view.View inflate = android.view.View.inflate(getActivity(), com.tencent.mm.R.layout.c6_, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m9z);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        gm0.j1.b().c();
        int f17 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f();
        if (f17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(getActivity().getResources().getQuantityString(com.tencent.mm.R.plurals.f489691a1, f17, java.lang.Integer.valueOf(f17)));
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f485863jd0);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
            com.tencent.mm.storage.t8 P0 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).P0();
            if (P0 != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, P0.field_sayhiuser, null);
            }
            inflate.setOnClickListener(new mq2.j(this));
            rq2.u.f398889a.b(11L);
            view = inflate;
        }
        this.f122094i = view;
        if (view != null) {
            android.widget.ListView listView2 = this.f122093h;
            kotlin.jvm.internal.o.d(listView2);
            listView2.addHeaderView(this.f122094i);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7d;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.f0.a(11);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LBSShowBindPhone");
        if (d17 != null) {
            if (d17.length() > 0) {
                try {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(d17);
                    kotlin.jvm.internal.o.d(valueOf);
                    valueOf.intValue();
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f122100r = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(16386, null), 1);
        this.f122096n = new mq2.h(this, getActivity());
        android.widget.ListView listView = (android.widget.ListView) getRootView().findViewById(com.tencent.mm.R.id.k5q);
        this.f122093h = listView;
        if (listView != null) {
            if (this.f122092g == null) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getActivity());
                this.f122092g = linearLayout;
                linearLayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                android.view.ViewGroup viewGroup = this.f122092g;
                kotlin.jvm.internal.o.e(viewGroup, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((android.widget.LinearLayout) viewGroup).setGravity(17);
            }
            this.f122097o = true;
            listView.addHeaderView(this.f122092g);
        }
        android.widget.ListView listView2 = this.f122093h;
        if (listView2 != null) {
            listView2.setAdapter((android.widget.ListAdapter) this.f122096n);
        }
        android.widget.ListView listView3 = this.f122093h;
        if (listView3 != null) {
            listView3.setOnItemClickListener(new mq2.n(this));
        }
        android.widget.ListView listView4 = this.f122093h;
        if (listView4 != null) {
            listView4.setOnTouchListener(new mq2.o(this));
        }
        this.f122108z = java.lang.System.currentTimeMillis();
        P6();
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onCreate");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        bb5.g gVar;
        com.tencent.mm.plugin.report.service.f0.e(11);
        gm0.j1.d().q(148, this);
        gm0.j1.d().q(1087, this);
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "dismissTipDialog");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f122095m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f122095m = null;
        i11.e eVar = this.f122102t;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f122107y);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().a();
        mq2.h hVar = this.f122096n;
        if (hVar != null && (gVar = hVar.f330737e) != null) {
            gVar.a();
            hVar.f330737e = null;
        }
        if (((java.util.LinkedList) this.f122098p).size() > 0) {
            java.lang.String str = "";
            for (mq2.a aVar : ((java.util.HashMap) this.f330724f).values()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('|');
                sb6.append(aVar.f330704a);
                sb6.append(':');
                sb6.append(aVar.f330713j);
                sb6.append(':');
                int i17 = aVar.f330714k + 1;
                aVar.f330714k = i17;
                sb6.append(i17);
                str = sb6.toString();
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        rq2.u.c(rq2.u.f398889a, null, null, null, null, 0L, 100L, 0L, 0L, 0L, 0L, 0L, 0L, java.lang.System.currentTimeMillis() - this.f122108z, 4063, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onPause");
        i11.e eVar = this.f122102t;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f122107y);
        }
        this.I.dead();
        this.f122106x = true;
        this.F = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0]);
        if (i17 == 79 || i17 == 153) {
            if (grantResults[0] == 0) {
                Q6();
            } else {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter.TAG, "onRequestPermissionsResult return for grant.");
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onResume");
        this.F = true;
        if (!this.G) {
            Q6();
        }
        Y6();
        mq2.h hVar = this.f122096n;
        kotlin.jvm.internal.o.d(hVar);
        hVar.notifyDataSetChanged();
        gm0.j1.b().c();
        if (((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() == 0) {
            android.widget.ListView listView = this.f122093h;
            kotlin.jvm.internal.o.d(listView);
            listView.removeHeaderView(null);
        }
        this.I.alive();
        this.f122106x = false;
        this.G = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e2, code lost:
    
        if (r6 != 4) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0325  */
    @Override // mq2.c, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, com.tencent.mm.modelbase.m1 r27) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        P6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        c01.fb b17 = c01.fb.b();
        if (!this.E || b17 == null || com.tencent.mm.sdk.platformtools.t8.K0(b17.d()) || com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(b17.f37188b), 0) == 0) {
            this.E = true;
            j45.l.h(getContext(), "nearby", ".ui.NearbyPersonalInfoUI");
            pm0.v.V(200L, new mq2.s(this));
            return;
        }
        this.C = true;
        mq2.u uVar = new mq2.u(this);
        mq2.t tVar = new mq2.t(this);
        if (this.B || !gm0.j1.u().c().n(4104, true)) {
            uVar.invoke();
        } else {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
            android.view.View inflate = android.view.View.inflate(getActivity(), com.tencent.mm.R.layout.bpr, null);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            mq2.x xVar = new mq2.x(uVar);
            mq2.y yVar = new mq2.y(tVar);
            if (!(activity instanceof android.app.Activity) || !activity.isFinishing()) {
                com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(activity);
                i0Var.g(com.tencent.mm.R.string.f490573yv);
                i0Var.d(-1);
                com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                aVar.L = inflate;
                i0Var.f(com.tencent.mm.R.string.f490507x1);
                aVar.E = xVar;
                i0Var.e(com.tencent.mm.R.string.f490012ig);
                aVar.F = yVar;
                aVar.G = new db5.t0(yVar);
                j0Var = i0Var.a();
                j0Var.show();
                db5.e1.a(activity, j0Var);
            }
            j0Var.show();
            rq2.u.f398889a.b(15L);
            this.B = true;
        }
        if (!this.D) {
            Q6();
        }
        com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        gaVar.o(3, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        this.D = false;
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onUserVisibleFocused");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        this.C = false;
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onUserVisibleUnFocused");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyPersonV1UIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        new java.util.LinkedList();
        this.f122098p = new java.util.LinkedList();
        this.f122100r = 1;
        this.f122107y = new mq2.q(this);
        this.D = true;
        this.E = true;
        this.G = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LbsSayHiEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$sayHiListener$1
            {
                this.__eventId = -772738789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent) {
                com.tencent.mm.autogen.events.LbsSayHiEvent event = lbsSayHiEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.sdk.platformtools.u3.h(new mq2.v(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.this));
                return false;
            }
        };
    }
}
