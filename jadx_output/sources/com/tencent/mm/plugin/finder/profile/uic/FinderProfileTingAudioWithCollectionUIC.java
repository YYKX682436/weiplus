package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileTingAudioWithCollectionUIC extends com.tencent.mm.plugin.finder.profile.uic.fk {

    /* renamed from: i, reason: collision with root package name */
    public db2.e6 f123489i;

    /* renamed from: m, reason: collision with root package name */
    public int f123490m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f123491n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileTingAudioWithCollectionUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123489i = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment).f123478t;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123491n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingFinderProfileEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC$tingFinderProfileEvent$1
            {
                this.__eventId = 1837692789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingFinderProfileEvent tingFinderProfileEvent) {
                com.tencent.mm.autogen.events.TingFinderProfileEvent event = tingFinderProfileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "tingFinderProfileEvent type " + event.f54895g.f6197a + ", listType = " + event.f54895g.f6198b);
                if (kotlin.jvm.internal.o.b(event.f54895g.f6197a, "refreshList") && kotlin.jvm.internal.o.b(event.f54895g.f6198b, "audio")) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.finder.profile.uic.ci ciVar = new com.tencent.mm.plugin.finder.profile.uic.ci(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC.this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(ciVar, 1000L, false);
                }
                return false;
            }
        };
    }

    public static final java.lang.String R6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC) {
        android.app.Activity context = finderProfileTingAudioWithCollectionUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public static final void S6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC, r45.dg4 dg4Var) {
        finderProfileTingAudioWithCollectionUIC.getClass();
        ((o40.e) i95.n0.c(o40.e.class)).getClass();
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.app.Activity context = finderProfileTingAudioWithCollectionUIC.getContext();
        bw5.o50 a17 = ms2.a.a(dg4Var);
        boolean z17 = finderProfileTingAudioWithCollectionUIC.isSelf() && finderProfileTingAudioWithCollectionUIC.isSelfFlag();
        i0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(o40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        o40.e.g8((o40.e) c17, context, a17.toByteArray(), z17, null, 8, null);
    }

    public final void T6() {
        jz5.f0 f0Var;
        android.view.View findViewById;
        java.util.ArrayList arrayList;
        java.util.LinkedList<r45.vx0> list;
        com.tencent.mm.protobuf.f fVar = this.f123489i.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        int i17 = ((r45.wu0) fVar).f389467h;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o9i);
        if (textView != null) {
            textView.setText(getResources().getString(com.tencent.mm.R.string.f0c, java.lang.Integer.valueOf(i17)));
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o9h);
        if (textView2 != null) {
            textView2.setVisibility(this.f123489i.M().size() > 4 ? 0 : 8);
            com.tencent.mm.ui.fk.a(textView2);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(textView2, "profile_whole");
            ((cy1.a) aVar.ik(textView2, 40, 25496)).Ai(textView2, new com.tencent.mm.plugin.finder.profile.uic.yh(this));
        }
        r45.wx0 N = this.f123489i.N();
        this.f123490m = N != null ? N.getInteger(1) : 0;
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o8z);
        if (textView3 != null) {
            textView3.setText(getResources().getString(com.tencent.mm.R.string.f0b, java.lang.Integer.valueOf(this.f123490m)));
            com.tencent.mm.ui.fk.a(textView3);
        }
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487307o90);
        if (textView4 != null) {
            textView4.setVisibility(this.f123490m > 8 ? 0 : 8);
            com.tencent.mm.ui.fk.a(textView4);
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(textView4, "profile_whole");
            ((cy1.a) aVar2.ik(textView4, 40, 25496)).Ai(textView4, new com.tencent.mm.plugin.finder.profile.uic.zh(this));
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d0v);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d1c);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "initTitle: audioCount=" + i17 + ", collectionCount=" + this.f123490m);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.n0.K0(this.f123489i.M(), 4));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.o9k);
        if (arrayList4.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "initAudioListLayout for empty.");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.protobuf.f fVar2 = this.f123489i.f227963i.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
            r45.dg4 dg4Var = ((r45.wu0) fVar2).f389469m;
            if (dg4Var == null || (findViewById = findViewById(com.tencent.mm.R.id.o9h)) == null) {
                f0Var = null;
            } else {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.rh(this, dg4Var));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("Finder.TingAudioWithCollectionUIC", "initAudioListLayout: all audio category item is null");
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.o9h);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initAudioListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.o9j);
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(false);
                final android.app.Activity context = getContext();
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC$initAudioListLayout$3$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    /* renamed from: canScrollVertically */
                    public boolean getF123307r() {
                        return false;
                    }
                });
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC$initAudioListLayout$3$2
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        boolean z17 = false;
                        if (type != ms2.c.class.hashCode()) {
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            com.tencent.mm.sdk.platformtools.Log.c("Finder.TingAudioWithCollectionUIC", "type invalid", new java.lang.Object[0]);
                            return new com.tencent.mm.plugin.finder.convert.z2();
                        }
                        if (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC.this.isSelf() && com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC.this.isSelfFlag()) {
                            z17 = true;
                        }
                        return new com.tencent.mm.plugin.finder.convert.ku(z17);
                    }
                }, arrayList4, false);
                wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.sh(this);
                recyclerView.setAdapter(wxRecyclerAdapter);
            }
        }
        r45.wx0 N2 = this.f123489i.N();
        if (N2 == null || (list = N2.getList(0)) == null) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.vx0 vx0Var : list) {
                kotlin.jvm.internal.o.d(vx0Var);
                arrayList.add(new ms2.b(vx0Var));
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.n0.K0(arrayList, 8));
        com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "initCollectionListLayout: originDataListSize=" + arrayList.size());
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f487309o92);
        if (arrayList8.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "initCollectionListLayout for empty.");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initCollectionListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initCollectionListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById6, arrayList10.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initCollectionListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initCollectionListLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f487307o90);
            if (findViewById7 != null) {
                findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.th(this, arrayList));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f487308o91);
            if (recyclerView2 != null) {
                recyclerView2.N(new com.tencent.mm.plugin.finder.profile.uic.uh());
                recyclerView2.setNestedScrollingEnabled(false);
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC$initCollectionListLayout$2$2
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        if (type == ms2.b.class.hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.eu(false, null);
                        }
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        com.tencent.mm.sdk.platformtools.Log.c("Finder.TingAudioWithCollectionUIC", "type invalid", new java.lang.Object[0]);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }, arrayList8, false);
                wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.profile.uic.vh(this);
                recyclerView2.setAdapter(wxRecyclerAdapter2);
            }
        }
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ili);
        if (textView5 != null) {
            textView5.setText(com.tencent.mm.R.string.f491896el3);
        }
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ili);
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById8 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(findViewById8, arrayList11.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initNoMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initNoMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        db2.e6 e6Var = this.f123489i;
        r45.sd1 O = e6Var.O();
        com.tencent.mm.protobuf.f fVar3 = e6Var.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        r45.sd1 sd1Var = ((r45.wu0) fVar3).f389473q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initMusicPostLayout canPostTingMusic:");
        sb6.append(e6Var.K());
        sb6.append(' ');
        sb6.append(O != null);
        sb6.append(", canShowAudioManageEntrance:");
        sb6.append(e6Var.L());
        sb6.append(' ');
        sb6.append(sd1Var != null);
        com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", sb6.toString());
        if (((!e6Var.K() || O == null) && (!e6Var.L() || sd1Var == null)) || !isSelf() || !isSelfFlag()) {
            android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.g0_);
            if (findViewById9 == null) {
                return;
            }
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(findViewById9, arrayList12.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTingPostLayout", "(Lcom/tencent/mm/plugin/finder/cgi/NetSceneFinderTingAudioUserPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC", "initTingPostLayout", "(Lcom/tencent/mm/plugin/finder/cgi/NetSceneFinderTingAudioUserPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.g0_);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.widget.TextView textView7 = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f484933g00);
            if (textView7 != null) {
                com.tencent.mm.ui.tools.d8.a(textView7);
                if (!e6Var.K() || O == null) {
                    textView7.setVisibility(8);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("gotoLiteApp canPostTingMusic:");
                    sb7.append(e6Var.K());
                    sb7.append(' ');
                    sb7.append(O != null);
                    com.tencent.mars.xlog.Log.w("Finder.TingAudioWithCollectionUIC", sb7.toString());
                } else {
                    textView7.setText(com.tencent.mm.R.string.ezq);
                    textView7.setVisibility(0);
                    textView7.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.wh(this, O));
                }
            }
            android.widget.TextView textView8 = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.fzc);
            if (textView8 != null) {
                com.tencent.mm.ui.tools.d8.a(textView8);
                textView8.setText(textView8.getContext().getResources().getString(com.tencent.mm.R.string.f492026ez5));
                if (e6Var.L() && sd1Var != null) {
                    textView8.setVisibility(0);
                    textView8.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.xh(this, sd1Var));
                    return;
                }
                textView8.setVisibility(8);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("gotoLiteApp canShowMusicManageEntrance:");
                sb8.append(e6Var.L());
                sb8.append(' ');
                sb8.append(sd1Var != null);
                com.tencent.mars.xlog.Log.w("Finder.TingAudioWithCollectionUIC", sb8.toString());
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b7l;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 999 && i18 == -1) {
            int intExtra = intent != null ? intent.getIntExtra("key_audio_collection_count", 0) : 0;
            if (intExtra <= 0 || intExtra == this.f123490m) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.TingAudioWithCollectionUIC", "onActivityResult: reset collection count new=" + intExtra + ", old=" + this.f123490m);
            this.f123490m = intExtra;
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o8z);
            if (textView == null) {
                return;
            }
            textView.setText(getResources().getString(com.tencent.mm.R.string.f0b, java.lang.Integer.valueOf(this.f123490m)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        T6();
        if (isSelf() && isSelfFlag()) {
            this.f123491n.alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (isSelf() && isSelfFlag()) {
            this.f123491n.dead();
        }
    }
}
