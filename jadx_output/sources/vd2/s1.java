package vd2;

/* loaded from: classes3.dex */
public final class s1 extends com.tencent.mm.plugin.finder.view.np {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f435901d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.n f435902e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435903f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f435904g;

    /* renamed from: h, reason: collision with root package name */
    public long f435905h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f435906i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f435907m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f435908n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f435909o;

    public s1(androidx.fragment.app.Fragment fragment, km2.n datas, boolean z17, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback viewCallback, r45.qt2 qt2Var, long j17, boolean z18) {
        kotlin.jvm.internal.o.g(datas, "datas");
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f435901d = fragment;
        this.f435902e = datas;
        this.f435903f = viewCallback;
        this.f435904g = qt2Var;
        this.f435905h = j17;
        this.f435906i = z18;
        this.f435907m = "Finder.FinderLiveViewCallback.Adapter";
        registerAdapterDataObserver(new vd2.m1(this));
        this.f435908n = new java.util.ArrayList();
        this.f435909o = new java.util.Vector();
    }

    public static final void x(vd2.s1 s1Var, android.content.Context context) {
        s1Var.getClass();
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout(context, s1Var.f435901d, null, s1Var.f435904g);
        int i17 = qs5.r.f366463a;
        finderLiveVisitorPluginLayout.setUiState(1);
        s1Var.f435909o.add(new java.lang.ref.WeakReference(finderLiveVisitorPluginLayout));
        com.tencent.mars.xlog.Log.i(s1Var.f435907m, "pluginLayout:" + finderLiveVisitorPluginLayout.hashCode() + " produced");
        synchronized (s1Var.f435908n) {
            ((java.util.ArrayList) s1Var.f435908n).add(finderLiveVisitorPluginLayout);
        }
    }

    public final void B(vd2.n1 n1Var, int i17, km2.t tVar) {
        java.lang.Object obj;
        boolean z17;
        km2.n nVar;
        gk2.e eVar;
        km2.m mVar = tVar.f309222d;
        gk2.e o07 = mVar != null ? dk2.ef.f233372a.o0(mVar) : null;
        if (mVar != null) {
            com.tencent.mm.plugin.finder.assist.y8.e(com.tencent.mm.plugin.finder.assist.y8.f102732a, "RV_VISITOR_" + mVar.f309129d.f68537e, com.tencent.mm.plugin.finder.assist.t8.f102557c.f102540b, null, false, false, false, 60, null);
        }
        android.view.View view = n1Var.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        synchronized (this.f435908n) {
            if (((java.util.ArrayList) this.f435908n).isEmpty()) {
                com.tencent.mars.xlog.Log.i(this.f435907m, "consumeView: item view list is empty, inflate visitor view");
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout(context, this.f435901d, null, this.f435904g);
                finderLiveVisitorPluginLayout.setUiState(2);
                this.f435909o.add(new java.lang.ref.WeakReference(finderLiveVisitorPluginLayout));
                obj = finderLiveVisitorPluginLayout;
            } else {
                java.lang.Object remove = ((java.util.ArrayList) this.f435908n).remove(((java.util.ArrayList) r10).size() - 1);
                ((com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) remove).setUiState(2);
                obj = remove;
            }
        }
        android.view.View view2 = (android.view.View) obj;
        view2.setId(com.tencent.mm.R.id.f484854fq1);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f484854fq1);
        if (findViewById != null) {
            com.tencent.mars.xlog.Log.i(this.f435907m, "pluginLayout:" + findViewById.hashCode() + " replaced");
            viewGroup.removeView(findViewById);
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = findViewById instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewById : null;
            if (finderLiveVisitorPluginLayout2 != null) {
                finderLiveVisitorPluginLayout2.setUiState(3);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f435907m, "pluginLayout:" + view2.hashCode() + " addView");
        viewGroup.addView(view2, layoutParams);
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout3 = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) n1Var.itemView.findViewById(com.tencent.mm.R.id.f484854fq1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind view pos:");
        sb6.append(i17);
        sb6.append(", viewHolder:");
        sb6.append(n1Var.hashCode());
        sb6.append(",pluginLayout:");
        sb6.append(finderLiveVisitorPluginLayout3.hashCode());
        sb6.append(',');
        sb6.append(mVar != null ? mVar.c() : null);
        sb6.append(", clickLiveId:");
        sb6.append(this.f435905h);
        sb6.append(", launchWithAnim:");
        sb6.append(this.f435906i);
        sb6.append(", buContext:");
        sb6.append((mVar == null || (eVar = mVar.f309130e) == null) ? null : java.lang.Integer.valueOf(eVar.hashCode()));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i(this.f435907m, sb7);
        kz2.b.f313858a.d(this.f435907m, sb7);
        if (mVar == null || o07 == null) {
            com.tencent.mars.xlog.Log.w(this.f435907m, "bind view err: data is null!!!");
            return;
        }
        finderLiveVisitorPluginLayout3.bindData(mVar);
        android.view.View findViewById2 = n1Var.itemView.findViewById(com.tencent.mm.R.id.f7s);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new vd2.o1(this, i17));
        }
        android.view.View findViewById3 = n1Var.itemView.findViewById(com.tencent.mm.R.id.fjv);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new vd2.p1(this, i17));
        }
        if (this.f435905h == mVar.f309129d.f68537e) {
            if (this.f435906i) {
                finderLiveVisitorPluginLayout3.setAlpha(0.0f);
            } else {
                finderLiveVisitorPluginLayout3.setAlpha(1.0f);
            }
            if (gk2.e.f272471n == null || (!((mm2.c1) r5.a(mm2.c1.class)).a8())) {
                com.tencent.mm.live.api.LiveConfig liveConfig = mVar.f309129d;
                z17 = true;
                finderLiveVisitorPluginLayout3.preloadLive(liveConfig.f68537e, liveConfig.f68545p, java.lang.Integer.valueOf(liveConfig.f68547q), (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : this.f435906i);
                this.f435905h = 0L;
            } else {
                z17 = true;
            }
            this.f435906i = false;
        } else {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435903f;
        if (((java.lang.Boolean) ((jz5.n) finderLiveViewCallback.f111497v).getValue()).booleanValue()) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = finderLiveViewCallback.f111492q;
            if (finderLiveRecyclerView.getScrollState() == 0) {
                java.lang.Integer valueOf = (finderLiveViewCallback.f111486h == null || (nVar = dk2.ef.H) == null) ? null : java.lang.Integer.valueOf(nVar.d());
                if (valueOf != null) {
                    valueOf.intValue();
                    if (i17 != valueOf.intValue()) {
                        finderLiveRecyclerView.post(new vd2.z3(finderLiveViewCallback, valueOf, i17));
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "bindCheckPrepareLive: current data is null");
                }
            }
        }
        y(n1Var, z17);
        android.content.Context context2 = finderLiveVisitorPluginLayout3.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        z(finderLiveVisitorPluginLayout3, ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(pl2.x.class)).f356683f);
        com.tencent.mm.plugin.finder.assist.y8.e(com.tencent.mm.plugin.finder.assist.y8.f102732a, "RV_VISITOR_" + mVar.f309129d.f68537e, com.tencent.mm.plugin.finder.assist.t8.f102558d.f102540b, null, false, false, false, 60, null);
    }

    public final km2.m E(int i17) {
        if (i17 >= 0 && i17 < getItemCount()) {
            return ((km2.t) this.f435902e.f309153e.get(i17)).f309222d;
        }
        com.tencent.mars.xlog.Log.i(this.f435907m, "getData invalid pos:" + i17 + '!');
        return null;
    }

    public final void I(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    I(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public final void J(boolean z17, java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f435903f.f111492q.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            com.tencent.mars.xlog.Log.i(this.f435907m, "sidebar updateCorner " + z17 + ", from:" + from + ", first:" + w17 + ", last:" + y17);
            if (w17 < 0 || y17 < 0) {
                return;
            }
            notifyItemRangeChanged(w17, (y17 - w17) + 1, z17 ? "PayLoadCorner" : "PayLoadHideCorner");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f435902e.f309153e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object obj = this.f435902e.f309153e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        km2.p pVar = ((km2.t) obj).f309223e;
        return (pVar != null ? pVar.f309166a : null) != null ? 100 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        byte[] bArr;
        r45.nw1 nw1Var;
        vd2.n1 vh6 = (vd2.n1) k3Var;
        kotlin.jvm.internal.o.g(vh6, "vh");
        java.lang.String str2 = this.f435907m;
        com.tencent.mars.xlog.Log.i(str2, "onBindViewHolder start");
        java.lang.Object obj = this.f435902e.f309153e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        km2.t tVar = (km2.t) obj;
        int itemViewType = getItemViewType(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder pos:");
        sb6.append(i17);
        sb6.append(", viewType:");
        sb6.append(itemViewType);
        sb6.append(", isGuideCard:");
        sb6.append(tVar.f309223e != null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (itemViewType == 0) {
            B(vh6, i17, tVar);
        } else if (itemViewType != 100) {
            com.tencent.mars.xlog.Log.w(str2, "onBindViewHolder: unknown view type:" + itemViewType + " at pos:" + i17);
            B(vh6, i17, tVar);
        } else {
            com.tencent.mars.xlog.Log.i(str2, "bindGuideContainer pos:" + i17);
            km2.p pVar = tVar.f309223e;
            com.tencent.mm.protobuf.g gVar = null;
            r45.fa2 fa2Var = pVar != null ? pVar.f309166a : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindGuideContainer pos:");
            sb7.append(i17);
            sb7.append(", hasContainer:");
            sb7.append(fa2Var != null);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            if (fa2Var == null) {
                com.tencent.mars.xlog.Log.w(str2, "bindGuideContainer: container is null");
            } else {
                android.view.View itemView = vh6.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                com.tencent.mm.plugin.finder.live.viewmodel.p4 p4Var = new com.tencent.mm.plugin.finder.live.viewmodel.p4(itemView);
                java.lang.String string = vh6.itemView.getContext().getString(com.tencent.mm.R.string.osh);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                p4Var.f117320h = pVar == null ? new km2.p(fa2Var, null, null, 6, null) : pVar;
                android.widget.TextView textView = p4Var.f117317e;
                if (textView != null) {
                    textView.setText(string);
                }
                android.view.View view = p4Var.f117316d;
                if (view != null) {
                    view.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.l4(p4Var));
                }
                android.widget.GridLayout gridLayout = p4Var.f117318f;
                if (gridLayout != null) {
                    gridLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.m4(p4Var));
                }
                android.view.View view2 = p4Var.f117319g;
                if (view2 != null) {
                    view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.n4(p4Var));
                }
                if (gridLayout != null) {
                    gridLayout.removeAllViews();
                }
                java.util.LinkedList linkedList = fa2Var.f374129h;
                if (!(linkedList == null || linkedList.isEmpty()) && gridLayout != null) {
                    gridLayout.post(new com.tencent.mm.plugin.finder.live.viewmodel.o4(gridLayout, p4Var, linkedList));
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.u1 u1Var = ml2.u1.f328087t3;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ml2.q1 q1Var = ml2.q1.f327812e;
                zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, "temp_2", null, null, false, 112, null);
                r45.w92 w92Var = new r45.w92();
                w92Var.set(0, pVar != null ? pVar.f309167b : null);
                r45.u92 u92Var = new r45.u92();
                u92Var.set(0, 9);
                u92Var.set(4, w92Var);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(u92Var);
                r45.y92 y92Var = new r45.y92();
                y92Var.set(1, db2.t4.f228171a.a(13215));
                gk2.e eVar = dk2.ef.I;
                y92Var.set(3, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0)));
                gk2.e eVar2 = dk2.ef.I;
                y92Var.set(4, java.lang.Long.valueOf(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f328983m : 0L));
                gk2.e eVar3 = dk2.ef.I;
                if (eVar3 != null && (bArr = ((mm2.e1) eVar3.a(mm2.e1.class)).f328985o) != null) {
                    gVar = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
                }
                y92Var.set(2, gVar);
                gk2.e eVar4 = dk2.ef.I;
                if (eVar4 == null || (str = ((mm2.e1) eVar4.a(mm2.e1.class)).f328992v) == null) {
                    str = "";
                }
                y92Var.set(5, str);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                y92Var.set(6, xy2.c.e(context));
                y92Var.set(7, linkedList2);
                y92Var.d().l();
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "onBindViewHolder end");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup vg6, int i17) {
        kotlin.jvm.internal.o.g(vg6, "vg");
        com.tencent.mars.xlog.Log.i(this.f435907m, "onCreateViewHolder type:" + i17);
        if (i17 == 100) {
            android.view.View inflate = android.view.LayoutInflater.from(vg6.getContext()).inflate(com.tencent.mm.R.layout.e_6, vg6, false);
            kotlin.jvm.internal.o.d(inflate);
            return new vd2.n1(inflate);
        }
        android.content.Context context = vg6.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pm0.v.X(new vd2.r1(this, false, context));
        android.content.Context context2 = vg6.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = new com.tencent.mm.ui.widget.RoundCornerFrameLayout(context2);
        roundCornerFrameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return new vd2.n1(roundCornerFrameLayout);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        vd2.n1 holder = (vd2.n1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(this.f435907m, "onViewDetachedFromWindow, " + holder.hashCode());
        super.onViewDetachedFromWindow(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        I(itemView);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View findViewById;
        vd2.n1 holder = (vd2.n1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        android.view.View view = holder.itemView;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f484854fq1)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f435907m, "pluginLayout:" + findViewById.hashCode() + " onViewRecycled");
        viewGroup.removeView(findViewById);
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = findViewById instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewById : null;
        if (finderLiveVisitorPluginLayout != null) {
            int i17 = qs5.r.f366463a;
            finderLiveVisitorPluginLayout.setUiState(3);
        }
    }

    public final void y(vd2.n1 n1Var, boolean z17) {
        android.view.View view = n1Var.itemView;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = view instanceof com.tencent.mm.ui.widget.RoundCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundCornerFrameLayout) view : null;
        if (roundCornerFrameLayout != null) {
            if (z17) {
                roundCornerFrameLayout.setRadius(roundCornerFrameLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
            } else {
                roundCornerFrameLayout.setRadius(0.0f);
            }
        }
    }

    public final void z(com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout, boolean z17) {
        if (finderLiveVisitorPluginLayout != null) {
            float dimension = finderLiveVisitorPluginLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
            float dimension2 = finderLiveVisitorPluginLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            android.view.View findViewById = finderLiveVisitorPluginLayout.findViewById(com.tencent.mm.R.id.fqc);
            int i17 = z17 ? (int) dimension2 : (int) dimension;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 == null) {
                    return;
                }
                layoutParams3.topMargin = i17;
                return;
            }
            if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById != null ? findViewById.getLayoutParams() : null;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = layoutParams4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 == null) {
                    return;
                }
                layoutParams5.f10910u = i17;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        vd2.n1 holder = (vd2.n1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        boolean contains = payloads.contains("PayLoadCorner");
        java.lang.String str = this.f435907m;
        boolean z17 = false;
        boolean z18 = true;
        if (contains) {
            com.tencent.mars.xlog.Log.i(str, "sidebar updateCorner show, position:" + i17);
            y(holder, true);
            z18 = false;
        }
        if (payloads.contains("PayLoadHideCorner")) {
            com.tencent.mars.xlog.Log.i(str, "sidebar updateCorner hide, position:" + i17);
            y(holder, false);
        } else {
            z17 = z18;
        }
        if (z17) {
            super.onBindViewHolder(holder, i17, payloads);
        }
    }
}
