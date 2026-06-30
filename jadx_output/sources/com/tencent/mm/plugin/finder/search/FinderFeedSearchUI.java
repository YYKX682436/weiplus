package com.tencent.mm.plugin.finder.search;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderFeedSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Ltj5/w;", "Ltj5/n;", "Lcom/tencent/mm/plugin/finder/feed/k8;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/u0", "com/tencent/mm/plugin/finder/search/v0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI implements tj5.w, tj5.n, com.tencent.mm.plugin.finder.feed.k8 {
    public static final /* synthetic */ int U1 = 0;
    public com.tencent.mm.protobuf.g A;
    public bq.m0 B;
    public com.tencent.mm.sdk.event.IListener C1;
    public int D;
    public bq.o1 E1;
    public bq.o1 F1;
    public boolean G1;
    public boolean I;
    public final com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedDislikeListener$1 I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f125543J;
    public final com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedExposeInfoChangeListener$1 J1;
    public int K;
    public final com.tencent.mm.plugin.finder.search.b2 K1;
    public boolean L;
    public final com.tencent.mm.sdk.platformtools.n3 L1;
    public boolean M;
    public java.lang.Runnable M1;
    public com.tencent.mm.view.RefreshLoadMoreLayout N;
    public android.widget.TextView N1;
    public final long O1;
    public androidx.recyclerview.widget.RecyclerView P;
    public boolean P1;
    public android.widget.TextView Q;
    public final java.util.HashMap Q1;
    public android.view.View R;
    public final java.util.HashMap R1;
    public java.lang.String S1;
    public final java.util.HashSet T1;
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer U;
    public com.tencent.mm.plugin.finder.search.k4 V;
    public com.tencent.mm.plugin.finder.search.u4 W;
    public com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable X;
    public com.tencent.mm.protobuf.g Y;
    public com.tencent.mm.protobuf.g Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f125544l1;

    /* renamed from: p0, reason: collision with root package name */
    public int f125545p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f125546p1;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125547t;

    /* renamed from: w, reason: collision with root package name */
    public int f125550w;

    /* renamed from: x, reason: collision with root package name */
    public int f125551x;

    /* renamed from: x0, reason: collision with root package name */
    public o25.y1 f125552x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f125553x1;

    /* renamed from: y, reason: collision with root package name */
    public int f125554y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f125555y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.e21 f125556y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125557z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.q2 f125558z1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f125548u = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f125549v = "";
    public final com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer C = new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer(null, 1, null);
    public java.lang.String E = "";
    public final java.util.HashMap F = new java.util.HashMap();
    public final androidx.recyclerview.widget.y2 G = new androidx.recyclerview.widget.y2();
    public int H = 1;
    public final cw2.f8 S = new cw2.f8(0, 1, null);
    public final android.util.ArrayMap T = new android.util.ArrayMap();
    public final jz5.g A1 = jz5.h.b(new com.tencent.mm.plugin.finder.search.w0(this));
    public final jz5.g B1 = jz5.h.b(new com.tencent.mm.plugin.finder.search.x0(this));
    public java.lang.Runnable D1 = new com.tencent.mm.plugin.finder.search.e2(this);
    public final com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$noInterestFeedScrollListener$1 H1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent>() { // from class: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$noInterestFeedScrollListener$1
        {
            super(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this);
            this.__eventId = 1966115342;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent finderNoInterestFeedScrollEvent) {
            com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent event = finderNoInterestFeedScrollEvent;
            kotlin.jvm.internal.o.g(event, "event");
            am.tc tcVar = event.f54314g;
            if (tcVar == null) {
                return false;
            }
            boolean z17 = tcVar.f7998a;
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this;
            androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
            if (recyclerView == null) {
                com.tencent.mars.xlog.Log.e("Finder.FinderFeedSearchUI", "feedScrollToNeighborListener not initialized");
                return false;
            }
            finderFeedSearchUI.t7(recyclerView, z17);
            return true;
        }
    };

    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$noInterestFeedScrollListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedExposeInfoChangeListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedDislikeListener$1] */
    public FinderFeedSearchUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedDislikeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedDislikeListener$1
            {
                this.__eventId = -633386071;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedDislikeEvent finderFeedDislikeEvent) {
                int i17;
                java.lang.Object obj;
                com.tencent.mm.autogen.events.FinderFeedDislikeEvent event = finderFeedDislikeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (bd2.r.f19284a.b()) {
                    return true;
                }
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this;
                java.util.Iterator<T> it = finderFeedSearchUI.C.iterator();
                while (true) {
                    i17 = 0;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    so2.j5 j5Var = (so2.j5) obj;
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == event.f54274g.f6547a) {
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj;
                if (j5Var2 == null) {
                    return false;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                java.util.Iterator<T> it6 = finderFeedSearchUI.C.iterator();
                kotlin.jvm.internal.o.f(it6, "iterator(...)");
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    so2.j5 j5Var3 = (so2.j5) next;
                    if (j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        ya2.b2 contact = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3).getContact();
                        java.lang.String str = contact != null ? contact.field_username : null;
                        ya2.b2 contact2 = baseFinderFeed.getContact();
                        if (kotlin.jvm.internal.o.b(str, contact2 != null ? contact2.field_username : null)) {
                            it6.remove();
                            androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.o.o("recyclerView");
                                throw null;
                            }
                            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemRemoved(i17);
                            }
                        } else {
                            continue;
                        }
                    }
                    i17++;
                }
                return true;
            }
        };
        this.J1 = new com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener() { // from class: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedExposeInfoChangeListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f125560d = "Finder.FinderFeedSearchUI";

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public com.tencent.mm.plugin.finder.storage.FinderItem c(long j17) {
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this;
                androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                if (Y != null) {
                    so2.j5 j5Var = (so2.j5) finderFeedSearchUI.C.get(Y.getAdapterPosition());
                    if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                    }
                }
                return null;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            /* renamed from: d, reason: from getter */
            public java.lang.String getF125560d() {
                return this.f125560d;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public void e(long j17, r45.yl2 yl2Var) {
                androidx.recyclerview.widget.RecyclerView recyclerView = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this.P;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                if (Y != null) {
                    int adapterPosition = Y.getAdapterPosition();
                    androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemChanged(adapterPosition, new jz5.l(1, yl2Var));
                    }
                }
            }
        };
        this.K1 = new com.tencent.mm.plugin.finder.search.b2(this);
        this.L1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.O1 = 3000L;
        this.Q1 = new java.util.HashMap();
        this.R1 = new java.util.HashMap();
        this.S1 = "";
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.mfh));
        this.T1 = hashSet;
    }

    public static final boolean c7(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        finderFeedSearchUI.getClass();
        ya2.b2 contact = baseFinderFeed.getContact();
        java.lang.String str = contact != null ? contact.field_username : null;
        androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return r26.i0.q(str, xy2.c.e(context), false, 2, null);
    }

    public static /* synthetic */ void v7(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, java.lang.String str, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            gVar = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        finderFeedSearchUI.u7(str, gVar, z17, z18);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.search.a1(this, feed, sheet, holder);
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.R;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.Q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.N;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.V;
        if (k4Var != null) {
            k4Var.b(str3);
        } else {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.search.l1(feed, aVar, this, holder, i17);
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125547t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return true;
        }
        this.H = 1;
        this.Y = null;
        this.K = 0;
        r7();
        v7(this, str2, null, false, false, 14, null);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.V;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(str2);
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.W;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.b();
        jx3.f.INSTANCE.idkeyStat(1265L, 6L, 1L, false);
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1, reason: from getter */
    public cw2.f8 getS() {
        return this.S;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.search.d1(this, feed, bottomSheet, holder);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.kvStat(19184, str);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("key_search_comment_scene", 0);
        if (intExtra == 0) {
            return 6;
        }
        return intExtra;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.search.b1(this, feed);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.search.o1(this, feed, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    public final void d7(long j17, int i17, int i18) {
        int i19;
        java.lang.String str;
        com.tencent.mm.plugin.finder.search.v0 v0Var;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.search.v0 v0Var2;
        java.lang.String str3;
        if (j17 == 0 || j17 == -1) {
            return;
        }
        java.lang.String u17 = pm0.v.u(j17);
        java.util.HashMap hashMap = this.F;
        if (hashMap.containsKey(u17)) {
            return;
        }
        com.tencent.mm.plugin.finder.search.e0 e0Var = new com.tencent.mm.plugin.finder.search.e0();
        e0Var.f125666b = u17;
        e0Var.f125665a = i17;
        e0Var.f125667c = i18;
        e0Var.f125668d = java.lang.System.currentTimeMillis();
        hashMap.put(u17, e0Var);
        int size = hashMap.size() % 30;
        android.util.ArrayMap arrayMap = this.T;
        if (size == 0) {
            java.lang.String str4 = (j17 == 0 || j17 == -1 || (v0Var2 = (com.tencent.mm.plugin.finder.search.v0) arrayMap.get(java.lang.Long.valueOf(j17))) == null || (str3 = v0Var2.f125920c) == null) ? "" : str3;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && (!hashMap.isEmpty())) {
                com.tencent.mm.plugin.finder.report.t3.f125364a.a(str4, (j17 == 0 || j17 == -1 || (v0Var = (com.tencent.mm.plugin.finder.search.v0) arrayMap.get(java.lang.Long.valueOf(j17))) == null || (str2 = v0Var.f125919b) == null) ? "" : str2, 0, hashMap, 3);
            }
        }
        int i27 = this.K;
        if (i27 == 6 || i27 == 5) {
            this.H = 3;
            i19 = i27 != 6 ? 5 : 1;
        } else {
            i19 = 3;
        }
        com.tencent.mm.plugin.finder.search.v0 v0Var3 = (com.tencent.mm.plugin.finder.search.v0) arrayMap.get(java.lang.Long.valueOf(j17));
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String str5 = v0Var3 != null ? v0Var3.f125920c : null;
        java.lang.String str6 = v0Var3 != null ? v0Var3.f125919b : null;
        java.lang.String u18 = pm0.v.u(j17);
        java.lang.String str7 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
        int i28 = this.H;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.o3.Ij(o3Var, str5, str6, 2, 2, u18, i17, i19, 1, str7, 1, i28, nyVar != null ? nyVar.V6() : null, (v0Var3 == null || (str = v0Var3.f125921d) == null) ? "" : str, 0, 8192, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: e2, reason: from getter */
    public androidx.recyclerview.widget.y2 getG() {
        return this.G;
    }

    public final void e7(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16);
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.plugin.finder.search.l4.f125764d.put(java.lang.Long.valueOf(a17.getId()), a17);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a17);
        sc2.p2.f406143b.a().a(kz5.b0.c(a17));
        this.C.add(p17);
    }

    public final void f7(so2.r1 r1Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "addScrollTips wording:" + r1Var.f410573d);
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.C;
        if (kz5.n0.i0(dataBuffer) instanceof so2.r1) {
            n7(r1Var.f410573d);
            return;
        }
        int size = dataBuffer.size();
        this.Q1.put(java.lang.Integer.valueOf(size), r1Var.f410573d);
        dataBuffer.add(r1Var);
    }

    public final boolean g7(r45.lu2 lu2Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "getHotSearchList");
        if (this.K != 5) {
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "getHotSearchList return for hotSearchType:" + this.K + '!');
            return false;
        }
        if (this.f125543J) {
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "getHotSearchList return for banGetHotSearchList!");
            return false;
        }
        if (this.L) {
            bq.m0 m0Var = this.B;
            if (m0Var != null) {
                m0Var.f23493o = z17;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "getHotSearchList return for isLoadingSearchList:" + this.L + '!');
            return true;
        }
        this.L = true;
        com.tencent.mm.protobuf.g gVar = this.A;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        bq.m0 m0Var2 = new bq.m0(14, gVar, nyVar != null ? nyVar.V6() : null, this.Z, this.Y, 0, 32, null);
        this.B = m0Var2;
        m0Var2.f23493o = z17;
        pm0.v.T(m0Var2.l(), new com.tencent.mm.plugin.finder.search.c1(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ail;
    }

    public final boolean h7() {
        int i17 = this.K;
        return (i17 == 5 || i17 == 6) ? false : true;
    }

    public final void i7(int i17, int i18, bq.o1 o1Var, r45.tu2 tu2Var) {
        bq.o1 o1Var2;
        r45.lu2 lu2Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.lu2 lu2Var2;
        r45.lu2 lu2Var3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.C;
        int size = dataBuffer.size();
        int size2 = dataBuffer.size();
        boolean z17 = o1Var != null && o1Var.f23511x;
        if (kotlin.jvm.internal.o.b(this.F1, o1Var)) {
            this.G1 = false;
        } else if (kotlin.jvm.internal.o.b(this.E1, o1Var)) {
            if (o1Var != null && o1Var.f23511x) {
                this.G1 = false;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "onSceneEnd: MMFunc_FinderSearch scene:" + o1Var + "  preloadNetSceneFinderSearch:" + this.F1 + " netSceneFinderSearch:" + this.E1 + ' ');
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.idkeyStat(1265L, 7L, 1L, false);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = tu2Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getObjectList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                kotlin.jvm.internal.o.d(finderObject);
                e7(finderObject);
                long id6 = finderObject.getId();
                java.lang.String str6 = (o1Var == null || (str5 = o1Var.f23502o) == null) ? "" : str5;
                java.lang.String str7 = (o1Var == null || (str4 = o1Var.f23504q) == null) ? "" : str4;
                r45.lu2 lu2Var4 = (r45.lu2) tu2Var.getCustom(13);
                this.T.put(java.lang.Long.valueOf(id6), new com.tencent.mm.plugin.finder.search.v0(id6, str6, str7, pm0.v.u(lu2Var4 != null ? lu2Var4.getLong(7) : 0L)));
                arrayList.add(jz5.f0.f302826a);
            }
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "onSceneEnd: MMFunc_FinderSearch scene:" + o1Var + " size:" + tu2Var.getList(4).size());
            if (tu2Var.getList(4).size() == 0) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "response objectList empty");
            } else {
                if (!h7()) {
                    r45.lu2 lu2Var5 = (r45.lu2) tu2Var.getCustom(13);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(lu2Var5 != null ? lu2Var5.getString(0) : null) && (lu2Var = (r45.lu2) tu2Var.getCustom(13)) != null) {
                        if (o1Var == null || (str = o1Var.f23502o) == null) {
                            str = "";
                        }
                        lu2Var.set(0, str);
                    }
                }
                l7((r45.lu2) tu2Var.getCustom(13));
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list2 = tu2Var.getList(4);
                kotlin.jvm.internal.o.f(list2, "getObjectList(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : list2) {
                    com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                    kotlin.jvm.internal.o.d(finderObject2);
                    arrayList2.add(h90Var.a(finderObject2, 16));
                }
                androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                xc2.k0.f7((xc2.k0) a17, arrayList2, 6, null, 0, null, null, 60, null);
            }
            if (tu2Var.getInteger(3) == 0 && o1Var != null && (lu2Var3 = o1Var.f23510w) != null) {
                kotlin.jvm.internal.o.f(tu2Var.getList(4), "getObjectList(...)");
                if (!r10.isEmpty()) {
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
                    java.lang.String string = lu2Var3.getString(0);
                    if (string == null) {
                        string = getResources().getString(com.tencent.mm.R.string.f2w);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                    }
                    f7(new so2.r1(finderItem, string));
                } else {
                    java.lang.String string2 = lu2Var3.getString(0);
                    if (string2 == null) {
                        string2 = "";
                    }
                    n7(string2);
                }
            }
            this.f125550w = tu2Var.getInteger(2);
            this.f125551x = tu2Var.getInteger(3);
            this.f125557z = tu2Var.getByteString(5);
            int size3 = dataBuffer.size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
            sb6.append(z17);
            sb6.append(' ');
            sb6.append(tu2Var.getInteger(2));
            sb6.append(' ');
            sb6.append(tu2Var.getInteger(3));
            sb6.append(' ');
            sb6.append(dataBuffer.size());
            sb6.append(' ');
            sb6.append((o1Var == null || (lu2Var2 = o1Var.f23510w) == null) ? null : lu2Var2.getString(0));
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", sb6.toString());
            if (o1Var == null || (str2 = o1Var.f23502o) == null) {
                str2 = this.f125549v;
            }
            java.lang.String str8 = str2;
            if (o1Var == null || (str3 = o1Var.f23504q) == null) {
                str3 = this.E;
            }
            java.lang.String str9 = str3;
            int i19 = o1Var != null ? o1Var.f23509v : 1;
            int i27 = tu2Var.getList(4).isEmpty() ? 1 : 2;
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String str10 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            o3Var.Gj(1, str10, str9, str8, 3, i19, 2, 0, i27, nyVar != null ? nyVar.V6() : null);
            size2 = size3;
        } else {
            jx3.f.INSTANCE.idkeyStat(1265L, 8L, 1L, false);
        }
        if (kotlin.jvm.internal.o.b(this.F1, o1Var)) {
            o1Var2 = null;
            this.F1 = null;
        } else {
            o1Var2 = null;
        }
        if (kotlin.jvm.internal.o.b(this.E1, o1Var)) {
            this.E1 = o1Var2;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.N;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.N(size2);
        if (size2 == 0) {
            android.view.View view = this.R;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onCgiBack", "(IILcom/tencent/mm/data/cgi/FinderSearchCGI;Lcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onCgiBack", "(IILcom/tencent/mm/data/cgi/FinderSearchCGI;Lcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.Q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.N;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            android.view.View view2 = this.R;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onCgiBack", "(IILcom/tencent/mm/data/cgi/FinderSearchCGI;Lcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onCgiBack", "(IILcom/tencent/mm/data/cgi/FinderSearchCGI;Lcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.Q;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.N;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setVisibility(0);
        }
        if (size == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else if (size < size2) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.P;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(size, size2 - size);
            }
        }
        com.tencent.mm.plugin.finder.report.j0.f125083a.e(hashCode());
        if (z17 || h7()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.P;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        t7(recyclerView3, true);
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.h80.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class});
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
    }

    public final int j7() {
        if (h7()) {
            return 2;
        }
        int i17 = this.f125545p0;
        return i17 != 0 ? i17 : this.X != null ? 10 : 14;
    }

    public final java.lang.String k7(int i17) {
        java.lang.String str = null;
        int i18 = Integer.MAX_VALUE;
        for (java.util.Map.Entry entry : this.Q1.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            int abs = java.lang.Math.abs(i17 - intValue);
            if (i17 > intValue && abs < i18) {
                str = str2;
                i18 = abs;
            } else if (i17 <= 0 && intValue == 0) {
                return str2;
            }
        }
        return str;
    }

    public final void l7(r45.lu2 lu2Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "recordEventInfo hotWord:" + lu2Var);
        if (lu2Var != null) {
            java.util.HashMap hashMap = this.R1;
            java.lang.String string = lu2Var.getString(0);
            if (string == null) {
                string = "";
            }
            hashMap.put(string, (r45.e21) lu2Var.getCustom(6));
            java.lang.String stringExtra = getIntent().getStringExtra("key_search_query");
            java.lang.String str = stringExtra != null ? stringExtra : "";
            if (kotlin.jvm.internal.o.b(str, lu2Var.getString(0))) {
                m7(str);
            }
        }
    }

    public final void m7(java.lang.String str) {
        jz5.f0 f0Var;
        android.view.View view;
        if (h7()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "refreshHotSearchTitle hotWordText:" + str);
        r45.e21 e21Var = (r45.e21) this.R1.get(str);
        this.f125556y1 = e21Var;
        android.widget.TextView textView = this.f125544l1;
        if (textView != null) {
            textView.setText(str);
        }
        if (e21Var != null) {
            android.view.View view2 = this.f125546p1;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || (view = this.f125546p1) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        int i18;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (qt2Var == null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        r45.qt2 qt2Var2 = qt2Var;
        so2.z1 z1Var = so2.z1.f410730a;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        z1Var.a(context2, qt2Var2, feed, z17 ? 1 : 2, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : i17);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
            i18 = 0;
        }
        gVar.i(D0, i18);
    }

    public final void n7(java.lang.String hotWordText) {
        com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable searchHotWordListParcelable = this.X;
        if (searchHotWordListParcelable != null) {
            kotlin.jvm.internal.o.g(hotWordText, "hotWordText");
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(hotWordText);
            java.lang.String str = searchHotWordListParcelable.f125659d;
            if (K0) {
                com.tencent.mars.xlog.Log.i(str, "removePre return for empty");
            } else {
                java.util.Iterator it = searchHotWordListParcelable.f125662g.iterator();
                int i17 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable = (com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable) it.next();
                    r45.lu2 lu2Var = searchHotWordParcelable.f125663d;
                    if (com.tencent.mm.sdk.platformtools.t8.D0(lu2Var != null ? lu2Var.getString(0) : null, hotWordText)) {
                        com.tencent.mars.xlog.Log.i(str, "remove :" + hotWordText + " index:" + searchHotWordListParcelable.f125662g.indexOf(searchHotWordParcelable) + ": position:" + searchHotWordListParcelable.f125661f);
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0 && i17 < searchHotWordListParcelable.f125662g.size()) {
                    searchHotWordListParcelable.f125662g.remove(i17);
                    searchHotWordListParcelable.f125661f = i17 - 1;
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.C;
        if (dataBuffer.size() > 0) {
            java.lang.Object i07 = kz5.n0.i0(dataBuffer);
            so2.r1 r1Var = i07 instanceof so2.r1 ? (so2.r1) i07 : null;
            if (r1Var != null) {
                kotlin.jvm.internal.o.g(hotWordText, "<set-?>");
                r1Var.f410573d = hotWordText;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(dataBuffer.size() - 1);
            }
            this.Q1.put(java.lang.Integer.valueOf(dataBuffer.size() - 1), hotWordText);
        }
        com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "onSceneEnd remove for list empty!");
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    public final void o7(bq.o1 o1Var, com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable searchHotWordListParcelable) {
        java.util.LinkedList linkedList;
        if (o1Var == null || searchHotWordListParcelable == null || (linkedList = searchHotWordListParcelable.f125662g) == null) {
            return;
        }
        int i17 = searchHotWordListParcelable.f125661f + 1;
        if (i17 >= 0 && i17 < linkedList.size()) {
            o1Var.f23510w = ((com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable) searchHotWordListParcelable.f125662g.get(i17)).f125663d;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        if (v6Var != null && v6Var.O6()) {
            return;
        }
        com.tencent.mm.plugin.finder.view.f5 j27 = j2();
        if (j27 != null && j27.b()) {
            j27.a();
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.U;
        if (finderLikeDrawer == null) {
            kotlin.jvm.internal.o.o("friendLikeDrawer");
            throw null;
        }
        if (!finderLikeDrawer.q()) {
            finish();
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.U;
        if (finderLikeDrawer2 != null) {
            finderLikeDrawer2.u();
        } else {
            kotlin.jvm.internal.o.o("friendLikeDrawer");
            throw null;
        }
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125547t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        fc2.c n17;
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFeedSearchUI);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f125547t = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125547t;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125547t;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125547t;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125547t;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125547t;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        android.view.View findViewById = fTSSearchView6.findViewById(com.tencent.mm.R.id.b5i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125547t;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getSearchContainer().setBackground(null);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125547t;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = fTSSearchView8.getSearchContainer().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125547t;
        if (fTSSearchView9 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView9.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f482426ea);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView10 = this.f125547t;
        if (fTSSearchView10 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        frameLayout.addView(fTSSearchView10);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView11 = this.f125547t;
        if (fTSSearchView11 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        int color = fTSSearchView11.getContext().getResources().getColor(com.tencent.mm.R.color.f479253u5);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView12 = this.f125547t;
        if (fTSSearchView12 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView12.getFtsEditText().getEditText().setTextColor(color);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView13 = this.f125547t;
        if (fTSSearchView13 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView13.getSearchIcon().setIconColor(color);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView14 = this.f125547t;
        if (fTSSearchView14 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView14.getFtsEditText().getClearBtn().getDrawable().setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP);
        com.tencent.mm.plugin.finder.search.l4.f125764d.clear();
        r45.b31 b31Var = com.tencent.mm.plugin.finder.search.l4.f125763c;
        if (b31Var != null) {
            com.tencent.mm.plugin.finder.search.l4.f125763c = null;
            java.lang.String string = b31Var.getString(6);
            this.E = string == null ? "" : string;
            java.lang.String string2 = b31Var.getString(0);
            this.f125549v = string2 != null ? string2 : "";
            this.f125550w = b31Var.getInteger(1);
            this.f125551x = b31Var.getInteger(2);
            this.f125557z = b31Var.getByteString(4);
            this.D = b31Var.getInteger(5);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = b31Var.getList(3);
            kotlin.jvm.internal.o.f(list, "getObjectList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                kotlin.jvm.internal.o.d(finderObject);
                e7(finderObject);
                arrayList2.add(jz5.f0.f302826a);
            }
        } else {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            this.E = uuid;
            this.f125549v = "";
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView15 = this.f125547t;
            if (fTSSearchView15 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView15.getFtsEditText().m();
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView16 = this.f125547t;
            if (fTSSearchView16 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView16.getFtsEditText().t();
        }
        androidx.recyclerview.widget.y2 y2Var = this.G;
        y2Var.e(1, 10);
        y2Var.e(2, 10);
        this.V = new com.tencent.mm.plugin.finder.search.k4(this, true, true, new com.tencent.mm.plugin.finder.search.w1(this), null);
        com.tencent.mm.plugin.finder.viewmodel.component.oq oqVar = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z;
        com.tencent.mm.plugin.finder.viewmodel.component.hs.B.clear();
        com.tencent.mm.plugin.finder.viewmodel.component.hs.C.clear();
        com.tencent.mm.plugin.finder.viewmodel.component.hs.D.clear();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView17 = this.f125547t;
        if (fTSSearchView17 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = fTSSearchView17.getFtsEditText();
        kotlin.jvm.internal.o.f(ftsEditText, "getFtsEditText(...)");
        com.tencent.mm.plugin.finder.search.u4 u4Var = new com.tencent.mm.plugin.finder.search.u4(this, ftsEditText, 0, 3, false, false, new com.tencent.mm.plugin.finder.search.y1(this));
        this.W = u4Var;
        u4Var.f125893n = new com.tencent.mm.plugin.finder.search.z1(this);
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.Window window = getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        this.U = com.tencent.mm.plugin.finder.view.vc.a(vcVar, context, window, 1, false, false, 24, null);
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        this.N = refreshLoadMoreLayout;
        this.P = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.R = findViewById4;
        this.N1 = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.mea);
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        finderLinearLayoutManager.f132639x = 25.0f;
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        finderLinearLayoutManager.f132640y = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R1().r()).intValue();
        finderLinearLayoutManager.f132641z = 100;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.C;
        java.util.Iterator<T> it = dataBuffer.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList3.add(feedObject);
            }
        }
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xc2.k0.f7((xc2.k0) a17, arrayList3, 6, null, 0, null, null, 60, null);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        final com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == -11) {
                    return new com.tencent.mm.plugin.finder.convert.av();
                }
                if (type != 2) {
                    if (type != 4) {
                        if (type == 9) {
                            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this;
                            return new com.tencent.mm.plugin.finder.convert.zf(finderFeedSearchUI.S, finderFeedSearchUI, false, 0, 0, 28, null);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                return new com.tencent.mm.plugin.finder.convert.z2();
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI2 = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this;
                    return new com.tencent.mm.plugin.finder.convert.bh(finderFeedSearchUI2.S, finderFeedSearchUI2, false, 0, false, 28, null);
                }
                return new com.tencent.mm.plugin.finder.convert.df(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this, false, 0, false, 14, null);
            }
        }, dataBuffer, false);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.P;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.P;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.i(this.K1);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.P;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView4 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView4 : null;
        if (finderRecyclerView != null) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, finderLinearLayoutManager, null, 2, null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.P;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.P;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView6.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.P;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        recyclerView7.setTag(com.tencent.mm.R.id.tcy, bool);
        android.widget.TextView textView = this.Q;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479241tt));
        getContext().findViewById(com.tencent.mm.R.id.orv).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
        android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.ggn);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContext().findViewById(com.tencent.mm.R.id.aa9).setOnClickListener(new com.tencent.mm.plugin.finder.search.q1(this));
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        android.view.View decorView = getContext().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.search.p1(decorView, this, dimension));
        getContext().findViewById(com.tencent.mm.R.id.h0r).setTag(bool);
        android.view.View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView2, "getDecorView(...)");
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ggn);
        viewGroup.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(viewGroup, true);
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        com.tencent.mm.plugin.finder.ui.o6 o6Var = new com.tencent.mm.plugin.finder.ui.o6();
        androidx.recyclerview.widget.RecyclerView recyclerView8 = this.P;
        if (recyclerView8 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        o6Var.b(recyclerView8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.N;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.civ, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
        androidx.recyclerview.widget.RecyclerView recyclerView9 = this.P;
        if (recyclerView9 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView9.setOnTouchListener(new com.tencent.mm.plugin.finder.search.r1(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.N;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout3.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.N;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.search.s1(this));
        java.lang.String str = this.f125549v;
        if (str != null) {
            com.tencent.mm.plugin.finder.search.u4 u4Var2 = this.W;
            if (u4Var2 == null) {
                kotlin.jvm.internal.o.o("searchSuggestionManager");
                throw null;
            }
            u4Var2.f125891l = str;
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView18 = this.f125547t;
            if (fTSSearchView18 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView18.getFtsEditText().q(str, null, true);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView10 = this.P;
        if (recyclerView10 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int i17 = this.D;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(recyclerView10, arrayList5.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView10.a1(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(recyclerView10, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        androidx.lifecycle.c1 a18 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a18).Z6(-1);
        if (Z6 != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView11 = this.P;
            if (recyclerView11 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            Z6.d(recyclerView11);
        }
        java.lang.Object a19 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        fc2.c n18 = zy2.ra.n1((zy2.ra) a19, 0, 1, null);
        if (n18 != null) {
            n18.a(new com.tencent.mm.plugin.finder.search.u0(this));
        }
        alive();
        if (bd2.r.f19284a.b()) {
            alive();
        }
        alive();
        jz5.g gVar = this.A1;
        ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue()).N0(2, 6, new com.tencent.mm.plugin.finder.search.t1(this));
        java.lang.Object a27 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a27, "get(...)");
        fc2.c n19 = zy2.ra.n1((zy2.ra) a27, 0, 1, null);
        if (n19 != null) {
            n19.a((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue());
        }
        jz5.g gVar2 = this.B1;
        zy2.h8 h8Var = (zy2.h8) ((jz5.n) gVar2).getValue();
        com.tencent.mm.plugin.finder.search.u1 u1Var = new com.tencent.mm.plugin.finder.search.u1(this);
        androidx.recyclerview.widget.RecyclerView recyclerView12 = this.P;
        if (recyclerView12 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(u1Var, recyclerView12);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar2).getValue());
            s3Var.getClass();
            n17.a(s3Var);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC) uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.class);
        androidx.recyclerview.widget.RecyclerView recyclerView13 = this.P;
        if (recyclerView13 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        finderFeedMegaVideoBtnAnimUIC.P6(recyclerView13);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$initContentView$8
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.search.v1(event, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.this, wxRecyclerAdapter));
                return true;
            }
        };
        this.C1 = iListener;
        iListener.alive();
        cw2.f8.L0(this.S, this, null, new com.tencent.mm.plugin.finder.search.a2(this), false, 8, null);
        java.lang.String stringExtra = getIntent().getStringExtra("key_search_query");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.plugin.finder.search.u4 u4Var3 = this.W;
            if (u4Var3 == null) {
                kotlin.jvm.internal.o.o("searchSuggestionManager");
                throw null;
            }
            kotlin.jvm.internal.o.d(stringExtra);
            u4Var3.f125891l = stringExtra;
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView19 = this.f125547t;
            if (fTSSearchView19 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView19.getFtsEditText().q(stringExtra, null, true);
            this.f125545p0 = getIntent().getIntExtra("key_search_request_scene", 0);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_search_session_buffer");
            if (byteArrayExtra != null) {
                this.Z = new com.tencent.mm.protobuf.g(byteArrayExtra, 0, byteArrayExtra.length);
            }
            this.X = (com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable) getIntent().getParcelableExtra("key_search_hot_word_info");
            byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_search_hot_word_buffer");
            if (byteArrayExtra2 != null) {
                this.Y = new com.tencent.mm.protobuf.g(byteArrayExtra2, 0, byteArrayExtra2.length);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "searchHotWordList: " + this.X);
            this.I = true;
            this.K = 6;
            if (getIntent().getBooleanExtra("key_search_is_from_feed_list", false)) {
                this.K = 5;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(getIntent().getLongExtra("key_search_feed_id", 0L)));
                jSONObject.put("requestid", this.E);
                jSONObject.put("query_word", stringExtra);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "hotsearch_timelinespot", t17, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            }
            if (getIntent().getBooleanExtra("key_search_is_from_wx_global_search", false)) {
                this.I = false;
                this.K = 0;
                r7();
            }
            if (getIntent().getBooleanExtra("key_search_ban_get_hot_search_list", false)) {
                z17 = true;
                this.f125543J = true;
            } else {
                z17 = true;
            }
            com.tencent.mm.plugin.finder.report.j0.f125083a.f(hashCode());
            u7(stringExtra, this.Z, this.I, z17);
            if (!this.I) {
                com.tencent.mm.plugin.finder.search.k4 k4Var = this.V;
                if (k4Var == null) {
                    kotlin.jvm.internal.o.o("historyLogic");
                    throw null;
                }
                k4Var.c(stringExtra);
            }
            if (this.X == null) {
                r45.lu2 lu2Var = new r45.lu2();
                lu2Var.set(0, stringExtra);
                lu2Var.set(4, this.Z);
                lu2Var.set(1, 1);
                g7(lu2Var, false);
            }
            if (!h7()) {
                if (this.f125555y0 == null) {
                    android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489174bk0, (android.view.ViewGroup) null);
                    this.f125546p1 = inflate2.findViewById(com.tencent.mm.R.id.h1o);
                    this.f125544l1 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.h1q);
                    this.f125553x1 = inflate2.findViewById(com.tencent.mm.R.id.h1p);
                    android.content.Context context4 = inflate2.getContext();
                    kotlin.jvm.internal.o.f(context4, "getContext(...)");
                    this.f125558z1 = new com.tencent.mm.plugin.finder.search.q2(context4);
                    android.widget.TextView textView2 = this.f125544l1;
                    if (textView2 != null) {
                        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    }
                    android.view.View view = this.f125553x1;
                    if (view != null) {
                        view.setOnClickListener(new com.tencent.mm.plugin.finder.search.x1(this, inflate2));
                    }
                    this.f125555y0 = inflate2;
                }
                android.view.View view2 = this.f125555y0;
                if (view2 != null) {
                    ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f482426ea)).removeAllViews();
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.setMarginEnd((int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
                    ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f482426ea)).addView(view2, layoutParams2);
                }
            }
            m7(stringExtra);
        }
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127797l0).getValue()).r()).booleanValue() || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127815m0).getValue()).r()).booleanValue()) {
            androidx.appcompat.app.AppCompatActivity context5 = getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            ni3.n nVar = (ni3.n) uVar.c(context5).a(ni3.n.class);
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = this.C;
            cw2.f8 f8Var = this.S;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            nVar.P6(dataBuffer2, 0, f8Var, nyVar3 != null ? zy2.ra.n1(nyVar3, 0, 1, null) : null, -1);
        }
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f125552x0 = new com.tencent.mm.pluginsdk.forward.m();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFeedSearchUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        fc2.c n17;
        com.tencent.mm.plugin.finder.search.l4.f125764d.clear();
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.V;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.a();
        bu2.n.f24550a.c();
        dead();
        if (bd2.r.f19284a.b()) {
            dead();
        }
        dead();
        hideVKB();
        jz5.g gVar = this.A1;
        ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue()).onDetach();
        pf5.z zVar = pf5.z.f353948a;
        java.lang.Object a17 = zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.c n18 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
        if (n18 != null) {
            n18.d((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue());
        }
        jz5.g gVar2 = this.B1;
        ((com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar2).getValue())).onDetach();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar2).getValue());
            s3Var.getClass();
            n17.d(s3Var);
        }
        com.tencent.mm.sdk.event.IListener iListener = this.C1;
        if (iListener != null) {
            iListener.dead();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.V0(this.K1);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "6", ml2.y.f328241f, 0, 0L, 0, 112, null);
        if (this.W == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        if (this.f125552x0 != null) {
            return;
        }
        kotlin.jvm.internal.o.o("quickMenuHelper");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "6", ml2.y.f328240e, 0, 0L, 0, 112, null);
        if (this.f125548u) {
            this.f125548u = false;
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView.post(new com.tencent.mm.plugin.finder.search.c2(this));
        }
        if (this.W == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.P;
        if (recyclerView2 != null) {
            recyclerView2.post(new com.tencent.mm.plugin.finder.search.d2(this));
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.search.z0(feed, this, sheet);
    }

    public final void p7() {
        android.widget.TextView textView;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "showLoadMoreFooter");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.N;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
        if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f491894el1);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.N;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x2 = refreshLoadMoreLayout2.getF213435x();
        android.widget.TextView textView2 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.N;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x3 = refreshLoadMoreLayout3.getF213435x();
        android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.N;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x4 = refreshLoadMoreLayout4.getF213435x();
        android.view.View findViewById2 = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ile) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.N;
        if (refreshLoadMoreLayout5 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x5 = refreshLoadMoreLayout5.getF213435x();
        android.view.View findViewById3 = f213435x5 != null ? f213435x5.findViewById(com.tencent.mm.R.id.m6l) : null;
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void q7() {
        android.widget.TextView textView;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "showNoMoreFooter");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.N;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
        if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.N;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x2 = refreshLoadMoreLayout2.getF213435x();
        android.widget.TextView textView2 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.N;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x3 = refreshLoadMoreLayout3.getF213435x();
        android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.N;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x4 = refreshLoadMoreLayout4.getF213435x();
        android.view.View findViewById2 = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ile) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.N;
        if (refreshLoadMoreLayout5 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x5 = refreshLoadMoreLayout5.getF213435x();
        android.view.View findViewById3 = f213435x5 != null ? f213435x5.findViewById(com.tencent.mm.R.id.m6l) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int y17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).y();
        if (y17 == -1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "[smoothScrollToLastPosition] nextPosition=" + y17);
        recyclerView.post(new com.tencent.mm.plugin.finder.search.g2(recyclerView, y17));
    }

    public final void r7() {
        if (this.K == 0) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125547t;
            if (fTSSearchView == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            if (fTSSearchView.getParent() == null) {
                ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f482426ea)).removeAllViews();
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125547t;
                if (fTSSearchView2 == null) {
                    kotlin.jvm.internal.o.o("searchView");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = fTSSearchView2.getSearchContainer().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125547t;
                if (fTSSearchView3 == null) {
                    kotlin.jvm.internal.o.o("searchView");
                    throw null;
                }
                fTSSearchView3.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f482426ea);
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125547t;
                if (fTSSearchView4 != null) {
                    frameLayout.addView(fTSSearchView4);
                } else {
                    kotlin.jvm.internal.o.o("searchView");
                    throw null;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataBuffer) {
            if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                arrayList.add(obj);
            }
        }
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        synchronized (arrayList) {
            int i17 = 0;
            for (java.lang.Object obj2 : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
                if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == feed.getFeedObject().getId()) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                }
                i17 = i18;
            }
        }
        for (jz5.l lVar : linkedList) {
            this.C.remove(lVar.f302834e);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
            }
        }
    }

    public final void s7(java.lang.String str) {
        android.widget.TextView textView = this.N1;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.N1;
        if (textView2 != null) {
            textView2.setText(str);
        }
        java.lang.Runnable runnable = this.M1;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.L1;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
            this.M1 = null;
        }
        com.tencent.mm.plugin.finder.search.f2 f2Var = new com.tencent.mm.plugin.finder.search.f2(this);
        this.M1 = f2Var;
        n3Var.postDelayed(f2Var, this.O1);
    }

    public final void t7(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "can not cast layoutManager to FinderLinearLayoutManager: " + recyclerView.getLayoutManager());
            return;
        }
        int w17 = z17 ? finderLinearLayoutManager.w() + 1 : finderLinearLayoutManager.w() - 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "[smoothScrollToNeighbor] position=" + w17);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (w17 >= 0 && w17 < (adapter != null ? adapter.getItemCount() : 0)) {
            recyclerView.post(new com.tencent.mm.plugin.finder.search.h2(recyclerView, w17));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.v0.f410644a.c(this, feed, z17, 2, (r17 & 16) != 0 ? 0 : i17, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : bc1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(java.lang.String r26, com.tencent.mm.protobuf.g r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.u7(java.lang.String, com.tencent.mm.protobuf.g, boolean, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.search.y0(this, feed);
    }

    public final boolean w7(boolean z17) {
        r45.lu2 lu2Var;
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startSearchNextHot: " + this.X + " isPreloadingNextHotWord:" + this.G1);
        if (h7()) {
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot return for BlockHotSearch.");
            return true;
        }
        if (this.G1) {
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot return for isPreloadingNextHotWord.");
            return true;
        }
        com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable searchHotWordListParcelable = this.X;
        if (searchHotWordListParcelable != null) {
            if (searchHotWordListParcelable.f125662g.isEmpty()) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot return for searchHotWordParcelableList is null.");
                return false;
            }
            int i17 = searchHotWordListParcelable.f125661f;
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot return for invalid pos:" + searchHotWordListParcelable.f125661f + '.');
                return false;
            }
            int i18 = i17 + 1;
            searchHotWordListParcelable.f125661f = i18;
            if (i18 >= searchHotWordListParcelable.f125662g.size()) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot: return for pos:" + searchHotWordListParcelable.f125661f + " over size:" + searchHotWordListParcelable.f125662g.size() + '.');
                searchHotWordListParcelable.f125661f = searchHotWordListParcelable.f125661f + (-1);
                return false;
            }
            com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable = (com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable) searchHotWordListParcelable.f125662g.get(searchHotWordListParcelable.f125661f);
            searchHotWordListParcelable.f125660e = searchHotWordParcelable;
            if (searchHotWordParcelable != null && (lu2Var = searchHotWordParcelable.f125663d) != null && (string = lu2Var.getString(0)) != null) {
                this.f125549v = string;
                this.f125550w = 0;
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid, "toString(...)");
                this.E = uuid;
                this.f125557z = null;
                com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable2 = searchHotWordListParcelable.f125660e;
                kotlin.jvm.internal.o.d(searchHotWordParcelable2);
                r45.lu2 lu2Var2 = searchHotWordParcelable2.f125663d;
                kotlin.jvm.internal.o.d(lu2Var2);
                bq.o1 o1Var = new bq.o1(this.f125549v, this.f125550w, this.E, this.f125557z, 10, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), lu2Var2.getByteString(4), null, null, this.Y, false, 0, 3456, null);
                this.F1 = o1Var;
                o1Var.f23509v = 3;
                o1Var.f23511x = z17;
                o7(o1Var, this.X);
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startSearchNextHot pos:" + searchHotWordListParcelable.f125661f + " query:" + this.f125549v + " isPreload:" + z17 + " preloadNetSceneFinderSearch:" + this.F1);
                if (!z17) {
                    com.tencent.mm.plugin.finder.search.u4 u4Var = this.W;
                    if (u4Var == null) {
                        kotlin.jvm.internal.o.o("searchSuggestionManager");
                        throw null;
                    }
                    java.lang.String text = this.f125549v;
                    kotlin.jvm.internal.o.g(text, "text");
                    u4Var.f125891l = text;
                    com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125547t;
                    if (fTSSearchView == null) {
                        kotlin.jvm.internal.o.o("searchView");
                        throw null;
                    }
                    fTSSearchView.getFtsEditText().q(this.f125549v, null, true);
                }
                bq.o1 o1Var2 = this.F1;
                if (o1Var2 != null) {
                    pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.k2(this, o1Var2)).f(this);
                }
                this.G1 = true;
                return true;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearchNextHot hotWord:");
            com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable3 = searchHotWordListParcelable.f125660e;
            sb6.append(searchHotWordParcelable3 != null ? searchHotWordParcelable3.f125663d : null);
            sb6.append('.');
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", sb6.toString());
            r5 = jz5.f0.f302826a;
        }
        if (r5 == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextHot return for null.");
        }
        return false;
    }

    public final void x7(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        bq.o1 o1Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startSearchNextPage: " + str + " isPreload:" + z17);
        if (h7()) {
            com.tencent.mars.xlog.Log.w("Finder.FinderFeedSearchUI", "startSearchNextPage return for BlockHotSearch.");
            return;
        }
        if (this.G1) {
            return;
        }
        int j76 = j7();
        if (j76 == 2 || j76 == 10 || j76 == 14) {
            str2 = "Finder.FinderFeedSearchUI";
            str3 = " isPreload:";
            str4 = "startSearchNextPage: ";
            o1Var = new bq.o1(str, this.f125550w, this.E, this.f125557z, j76, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), this.Z, null, null, this.Y, false, 0, 3456, null);
        } else {
            str2 = "Finder.FinderFeedSearchUI";
            str3 = " isPreload:";
            str4 = "startSearchNextPage: ";
            o1Var = new bq.o1(str, this.f125550w, this.E, this.f125557z, j76, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null, this.Z, null, this.Y, false, 0, 3392, null);
        }
        this.E1 = o1Var;
        o1Var.f23511x = z17;
        if (this.I) {
            o7(o1Var, this.X);
        }
        com.tencent.mars.xlog.Log.i(str2, str4 + str + str3 + z17 + " netSceneFinderSearch:" + this.E1);
        bq.o1 o1Var2 = this.F1;
        if (o1Var2 != null) {
            pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.l2(this, o1Var2)).f(this);
        }
        p7();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.search.m1(this, feed);
    }
}
