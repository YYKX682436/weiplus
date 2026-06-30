package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes15.dex */
public final class FinderProfileUiStyleUIC extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.profile.uic.si f123498v = new com.tencent.mm.plugin.finder.profile.uic.si(null);

    /* renamed from: e, reason: collision with root package name */
    public int f123499e;

    /* renamed from: f, reason: collision with root package name */
    public int f123500f;

    /* renamed from: g, reason: collision with root package name */
    public final is2.c f123501g;

    /* renamed from: h, reason: collision with root package name */
    public ya2.b2 f123502h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f123503i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f123504m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f123505n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f123506o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f123507p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f123508q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f123509r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f123510s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f123511t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1 f123512u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1] */
    public FinderProfileUiStyleUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f123500f = -1;
        this.f123501g = new is2.c(getActivity(), getFragment());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f123511t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127601aa).getValue()).r()).intValue() == 1 && !getFragmentMode();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123512u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedUiActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1
            {
                this.__eventId = 2090220060;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent) {
                com.tencent.mm.autogen.events.FinderFeedUiActionEvent event = finderFeedUiActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.fb fbVar = event.f54275g;
                if (fbVar == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "callback actionType:" + fbVar.f6664b);
                int i17 = fbVar.f6664b;
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.this;
                if (i17 != 50000) {
                    if (i17 != 50001) {
                        return true;
                    }
                    finderProfileUiStyleUIC.setNormalStyle();
                    return true;
                }
                java.lang.String url = fbVar.f6668f;
                kotlin.jvm.internal.o.f(url, "url");
                int i18 = fbVar.f6667e;
                int i19 = (int) (255 * 1.0f);
                if (i19 <= 0) {
                    i19 = 0;
                }
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.O6(finderProfileUiStyleUIC, url, ((255 > i19 ? i19 : 255) << 24) + (i18 & 16777215));
                return true;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC, java.lang.String str, int i17) {
        boolean z17 = finderProfileUiStyleUIC.f123511t;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = finderProfileUiStyleUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            if (((com.tencent.mm.plugin.finder.profile.uic.ob) zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.ob.class)).e7().f434503a.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for LogOutVisible");
                return;
            }
            if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for isTeenMode");
                finderProfileUiStyleUIC.setNormalStyle();
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + finderProfileUiStyleUIC.f123499e + " coverPath:" + str + ", coverColor:" + i17);
            com.tencent.mm.plugin.finder.profile.uic.si siVar = f123498v;
            int a17 = siVar.a(0.4f, i17);
            int a18 = siVar.a(1.0f, i17);
            is2.c cVar = finderProfileUiStyleUIC.f123501g;
            ns2.n nVar = cVar.f294475z;
            if (nVar == null) {
                kotlin.jvm.internal.o.o("extractColorTextStyle");
                throw null;
            }
            nVar.f339413d = a17;
            ns2.q qVar = cVar.A;
            if (qVar == null) {
                kotlin.jvm.internal.o.o("extractColorIconStyle");
                throw null;
            }
            qVar.f339418d = java.lang.Integer.valueOf(a17);
            androidx.appcompat.app.AppCompatActivity activity2 = finderProfileUiStyleUIC.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.finder.profile.uic.o0) zVar.a(activity2).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).d7(true, a18);
            androidx.appcompat.app.AppCompatActivity activity3 = finderProfileUiStyleUIC.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            com.tencent.mm.plugin.finder.profile.uic.ie ieVar = (com.tencent.mm.plugin.finder.profile.uic.ie) zVar.a(activity3).a(com.tencent.mm.plugin.finder.profile.uic.ie.class);
            ieVar.f123811p = true;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ieVar.f123809n;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            androidx.appcompat.app.AppCompatActivity activity4 = finderProfileUiStyleUIC.getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a(activity4).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).H7(true);
            cVar.b(200);
            finderProfileUiStyleUIC.f123499e = 200;
            if (z17) {
                android.view.View view = finderProfileUiStyleUIC.f123503i;
                if (view == null) {
                    kotlin.jvm.internal.o.o("appBarLayout");
                    throw null;
                }
                view.setBackground(null);
                android.view.View view2 = finderProfileUiStyleUIC.f123505n;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("descHeaderContainer");
                    throw null;
                }
                view2.setBackground(null);
                android.view.View view3 = finderProfileUiStyleUIC.f123504m;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("bgContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = finderProfileUiStyleUIC.f123506o;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("bgLevel1");
                    throw null;
                }
                view4.setBackgroundColor(a18);
                android.widget.ImageView imageView = finderProfileUiStyleUIC.f123507p;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("bgLevel2");
                    throw null;
                }
                if (z17) {
                    mn2.j0 j0Var = new mn2.j0(str == null ? "" : str);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    wo0.c a19 = g1Var.e().a(j0Var);
                    a19.g(g1Var.h(mn2.f1.f329966t));
                    a19.f447873d = new com.tencent.mm.plugin.finder.profile.uic.vi(str, imageView);
                    a19.c(imageView);
                }
                android.view.View view5 = finderProfileUiStyleUIC.f123508q;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("bgLevel3");
                    throw null;
                }
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{siVar.a(0.0f, a18), a18});
                view5.setBackground(gradientDrawable);
                android.view.View view6 = finderProfileUiStyleUIC.f123510s;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("tabLayoutContainer");
                    throw null;
                }
                view6.setBackground(null);
                android.view.View view7 = finderProfileUiStyleUIC.f123509r;
                if (view7 == null) {
                    kotlin.jvm.internal.o.o("friendFollowArrow");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void P6(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        if (this.f123511t) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ti(z17, this, username));
        }
    }

    public final boolean a2() {
        return this.f123511t && this.f123499e == 200;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreateAfter(bundle);
        boolean z17 = this.f123511t;
        if (z17) {
            if (z17) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483235a24);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                this.f123503i = findViewById;
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fxo);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                this.f123504m = findViewById2;
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.fxp);
                kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                this.f123506o = findViewById3;
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fxq);
                kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                this.f123507p = (android.widget.ImageView) findViewById4;
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fxr);
                kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                this.f123508q = findViewById5;
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.fyp);
                kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
                this.f123509r = findViewById6;
                android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.gyg);
                kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
                this.f123505n = findViewById7;
                android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.nuq);
                kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
                this.f123510s = findViewById8;
                android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.nup);
                kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
            }
            alive();
            is2.c cVar = this.f123501g;
            java.util.ArrayList arrayList = cVar.f294452i0;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kfn));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kff));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kfb));
            java.util.ArrayList arrayList2 = cVar.f294454j0;
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486447l85));
            java.util.ArrayList arrayList3 = cVar.f294446f0;
            arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f485546i22));
            java.util.ArrayList arrayList4 = cVar.f294448g0;
            arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzv));
            java.util.ArrayList arrayList5 = cVar.T;
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484921fx5));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.d9l));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fx_));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxc));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy8));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.feo));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fdt));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fe7));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486446l84));
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486443l81));
            java.util.ArrayList arrayList6 = cVar.S;
            arrayList6.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ov9));
            arrayList6.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxn));
            boolean a17 = cVar.a();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.id.fzr);
            if (!a17) {
                arrayList6.add(valueOf);
            }
            arrayList6.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ttt));
            arrayList6.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484402tb2));
            java.util.ArrayList arrayList7 = cVar.U;
            arrayList7.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzw));
            java.util.ArrayList arrayList8 = cVar.R;
            arrayList8.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzn));
            arrayList8.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482534h0));
            java.util.ArrayList arrayList9 = cVar.V;
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzk));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.c19));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzw));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdq));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyi));
            if (cVar.a()) {
                arrayList9.add(valueOf);
            }
            cVar.X.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jkr));
            java.util.ArrayList arrayList10 = cVar.f294440c0;
            arrayList10.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyn));
            arrayList10.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482526gs));
            java.util.ArrayList arrayList11 = cVar.W;
            arrayList11.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzs));
            arrayList11.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzu));
            arrayList11.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdp));
            arrayList11.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzu));
            cVar.Y.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484745fe3));
            java.util.ArrayList arrayList12 = cVar.f294436a0;
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy_));
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jqi));
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f483315aa4));
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzl));
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482533gz));
            arrayList12.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ttu));
            java.util.ArrayList arrayList13 = cVar.f294444e0;
            arrayList13.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fwz));
            arrayList13.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy6));
            arrayList13.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ffe));
            cVar.f294450h0.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484920fx4));
            java.util.ArrayList arrayList14 = cVar.f294458l0;
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyg), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_followed)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.jkr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_mini_program2)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzs), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_location)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdp), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_person_tie)));
            java.util.ArrayList arrayList15 = cVar.M;
            arrayList15.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kfn));
            arrayList15.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kfh));
            arrayList15.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kff));
            arrayList15.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.kfb));
            arrayList15.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486447l85));
            java.util.ArrayList arrayList16 = cVar.N;
            arrayList16.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f485546i22));
            arrayList16.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzv));
            cVar.H.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482534h0));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzk));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.c19));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzw));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdq));
            arrayList9.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyi));
            boolean a18 = cVar.a();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.id.fzr);
            if (a18) {
                arrayList9.add(valueOf2);
            }
            java.util.ArrayList arrayList17 = cVar.I;
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fx_));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxc));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy8));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.d9l));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484921fx5));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.feo));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.l86));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fe7));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fdt));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486446l84));
            arrayList17.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f486443l81));
            java.util.ArrayList arrayList18 = cVar.f294434J;
            arrayList18.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ov9));
            arrayList18.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxn));
            if (!cVar.a()) {
                arrayList18.add(valueOf2);
            }
            arrayList18.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ttt));
            arrayList18.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484402tb2));
            java.util.ArrayList arrayList19 = cVar.B;
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxt));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyg));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzs));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdp));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzu));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jkr));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fxt));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484745fe3));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ffe));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484920fx4));
            arrayList19.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzu));
            cVar.C.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy6));
            java.util.ArrayList arrayList20 = cVar.D;
            arrayList20.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fwz));
            arrayList20.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fbi));
            java.util.ArrayList arrayList21 = cVar.E;
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f483315aa4));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.jqi));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fy_));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzl));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482533gz));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyn));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482526gs));
            arrayList21.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.ttu));
            cVar.G.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzn));
            java.util.ArrayList arrayList22 = cVar.f294460m0;
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.fyg), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_follow)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.jkr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_mini_program2)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.fzs), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_location)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.jdp), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_official_accounts)));
            int i17 = cVar.f294472w;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = cVar.f294435a;
            androidx.fragment.app.Fragment fragment = cVar.f294437b;
            int i18 = cVar.f294466q;
            int i19 = cVar.f294465p;
            java.util.ArrayList arrayList23 = cVar.f294456k0;
            java.util.ArrayList arrayList24 = cVar.Q;
            int i27 = cVar.f294461n;
            java.util.ArrayList arrayList25 = cVar.R;
            int i28 = cVar.f294467r;
            cVar.f294474y.a(100, kz5.p1.d(new ns2.r(cVar.f294435a, cVar.f294437b, cVar.f294458l0, null, 8, null), new ns2.p(appCompatActivity, fragment, i17, arrayList), new ns2.p(appCompatActivity, fragment, i18, arrayList2), new ns2.p(appCompatActivity, fragment, i19, arrayList3), new ns2.p(appCompatActivity, fragment, cVar.f294473x, arrayList4), new ns2.n(appCompatActivity, fragment, cVar.f294441d, arrayList23), new ns2.n(appCompatActivity, fragment, cVar.f294455k, arrayList24), new ns2.n(appCompatActivity, fragment, i27, arrayList5), new ns2.n(appCompatActivity, fragment, i19, arrayList6), new ns2.n(appCompatActivity, fragment, cVar.f294459m, arrayList7), new ns2.n(appCompatActivity, fragment, cVar.f294457l, arrayList25), new ns2.n(appCompatActivity, fragment, i28, arrayList9), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(cVar.f294470u), cVar.X, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(i28), cVar.W, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(cVar.f294469t), cVar.Y, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(i27), cVar.f294436a0, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(cVar.f294463o), cVar.f294438b0, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(i19), cVar.f294442d0, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(i18), cVar.f294444e0, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, java.lang.Integer.valueOf(cVar.f294471v), cVar.f294450h0, null, 16, null), new ns2.q(cVar.f294435a, cVar.f294437b, null, cVar.Z, null, 16, null), new ns2.m(cVar.f294435a, cVar.f294437b, false, "ProfileStyle", null, 16, null)));
            cVar.f294475z = new ns2.n(cVar.f294435a, cVar.f294437b, 0, cVar.O);
            cVar.A = new ns2.q(cVar.f294435a, cVar.f294437b, null, cVar.P, "extractColorIcon", 4, null);
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
            if (p2Var == null || (str = p2Var.getUsername()) == null) {
                str = "";
            }
            P6(str, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f123511t) {
            dead();
        }
    }

    public final void setNormalStyle() {
        boolean z17 = this.f123511t;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + this.f123499e + ' ');
            if (this.f123499e == 100) {
                return;
            }
            this.f123500f = -1;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            ((com.tencent.mm.plugin.finder.profile.uic.o0) zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).d7(false, this.f123500f);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.plugin.finder.profile.uic.ie ieVar = (com.tencent.mm.plugin.finder.profile.uic.ie) zVar.a(activity2).a(com.tencent.mm.plugin.finder.profile.uic.ie.class);
            ieVar.f123811p = false;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ieVar.f123809n;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a(activity3).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).H7(false);
            this.f123499e = 100;
            this.f123501g.b(100);
            if (z17) {
                android.view.View view = this.f123504m;
                if (view == null) {
                    kotlin.jvm.internal.o.o("bgContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f123506o;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bgLevel1");
                    throw null;
                }
                view2.setBackgroundResource(com.tencent.mm.R.color.f478494f);
                android.widget.ImageView imageView = this.f123507p;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("bgLevel2");
                    throw null;
                }
                imageView.setImageDrawable(null);
                android.widget.ImageView imageView2 = this.f123507p;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("bgLevel2");
                    throw null;
                }
                imageView2.setVisibility(4);
                android.view.View view3 = this.f123509r;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("friendFollowArrow");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f123508q;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("bgLevel3");
                    throw null;
                }
                view4.setBackground(null);
                android.view.View view5 = this.f123503i;
                if (view5 != null) {
                    view5.setBackgroundColor(getActivity().getResources().getColor(com.tencent.mm.R.color.f478494f));
                } else {
                    kotlin.jvm.internal.o.o("appBarLayout");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1] */
    public FinderProfileUiStyleUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123500f = -1;
        this.f123501g = new is2.c(getActivity(), getFragment());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f123511t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127601aa).getValue()).r()).intValue() == 1 && !getFragmentMode();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123512u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedUiActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1
            {
                this.__eventId = 2090220060;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent) {
                com.tencent.mm.autogen.events.FinderFeedUiActionEvent event = finderFeedUiActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.fb fbVar = event.f54275g;
                if (fbVar == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "callback actionType:" + fbVar.f6664b);
                int i17 = fbVar.f6664b;
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.this;
                if (i17 != 50000) {
                    if (i17 != 50001) {
                        return true;
                    }
                    finderProfileUiStyleUIC.setNormalStyle();
                    return true;
                }
                java.lang.String url = fbVar.f6668f;
                kotlin.jvm.internal.o.f(url, "url");
                int i18 = fbVar.f6667e;
                int i19 = (int) (255 * 1.0f);
                if (i19 <= 0) {
                    i19 = 0;
                }
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.O6(finderProfileUiStyleUIC, url, ((255 > i19 ? i19 : 255) << 24) + (i18 & 16777215));
                return true;
            }
        };
    }
}
