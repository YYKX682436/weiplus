package ub4;

/* loaded from: classes4.dex */
public class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f426168e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f426171h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f426172i;

    /* renamed from: s, reason: collision with root package name */
    public final ub4.k f426179s;

    /* renamed from: u, reason: collision with root package name */
    public final ub4.b f426181u;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f426167d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f426169f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f426170g = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f426173m = false;

    /* renamed from: n, reason: collision with root package name */
    public long f426174n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f426175o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f426176p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f426177q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f426178r = "";

    /* renamed from: t, reason: collision with root package name */
    public ub4.l f426180t = null;

    public i(android.content.Context context, java.lang.String str, ub4.b bVar) {
        this.f426168e = null;
        this.f426171h = "";
        this.f426172i = false;
        this.f426179s = null;
        this.f426181u = null;
        this.f426168e = context;
        this.f426181u = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        } else {
            o17.equals("zh_HK");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        }
        this.f426171h = str;
        gm0.j1.i();
        if (str.equals((java.lang.String) gm0.j1.u().c().l(2, null))) {
            this.f426172i = true;
        }
        this.f426179s = new ub4.k(new ub4.a(this), str, this.f426172i);
        I(0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "limitId=%s", this.f426170g);
        E(false);
    }

    public static /* synthetic */ java.util.List x(ub4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.util.List list = iVar.f426167d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return list;
    }

    public static /* synthetic */ android.content.Context y(ub4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        android.content.Context context = iVar.f426168e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return context;
    }

    public void B(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        E(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public void E(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "limitSeq " + this.f426170g);
        ub4.k kVar = this.f426179s;
        if (kVar != null) {
            java.lang.String str = this.f426170g;
            boolean z18 = this.f426173m;
            kVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapterHelper", "limitSeq " + str);
            kVar.f426184e = str;
            kVar.f426185f = z18;
            kVar.a(z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public final void I(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        java.lang.String str = this.f426171h;
        int j18 = Kj.j(str);
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long T1 = Fj.T1(Fj.D2(false, str, this.f426172i, false), j17, j18, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String s07 = ca4.z0.s0(T1);
        if (this.f426169f.equals("")) {
            this.f426170g = s07;
        } else {
            this.f426170g = s07.compareTo(this.f426169f) < 0 ? s07 : this.f426169f;
        }
        r45.cp0 t07 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(str).t0();
        long j19 = t07.f371760e;
        if (j19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f426169f, this.f426170g, java.lang.Long.valueOf(t07.f371760e), java.lang.Long.valueOf(t07.f371759d));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            return;
        }
        java.lang.String s08 = ca4.z0.s0(j19);
        if (this.f426170g.equals("")) {
            this.f426170g = s08;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimitSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f426169f, this.f426170g, java.lang.Long.valueOf(t07.f371760e), java.lang.Long.valueOf(t07.f371759d));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f426169f, this.f426170g, java.lang.Long.valueOf(t07.f371760e), java.lang.Long.valueOf(t07.f371759d));
            if (s08.compareTo(this.f426170g) <= 0) {
                s08 = this.f426170g;
            }
            this.f426170g = s08;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        int size = ((java.util.ArrayList) this.f426167d).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.util.List list = this.f426167d;
        int i18 = "loading".equals(((ub4.c) ((java.util.ArrayList) list).get(i17)).f426153b) ? 1 : "my_timeline".equals(((ub4.c) ((java.util.ArrayList) list).get(i17)).f426153b) ? 2 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        if (k3Var instanceof ub4.d) {
            ub4.d dVar = (ub4.d) k3Var;
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            ub4.i iVar = dVar.f426155e;
            boolean z17 = iVar.f426176p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = dVar.f426154d;
            if (z17) {
                loadingMoreView.setVisibility(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                java.lang.String str = iVar.f426177q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                loadingMoreView.b(0, str);
            } else {
                loadingMoreView.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
        } else if (k3Var instanceof ub4.h) {
            ub4.h hVar = (ub4.h) k3Var;
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            ub4.i iVar2 = hVar.f426166i;
            ub4.c cVar = (ub4.c) ((java.util.ArrayList) x(iVar2)).get(i17);
            ub4.c cVar2 = i17 > 1 ? (ub4.c) ((java.util.ArrayList) x(iVar2)).get(i17 - 1) : null;
            int head = ((com.tencent.mm.plugin.sns.storage.SnsInfo) cVar.f426152a.get(0)).getHead();
            int head2 = cVar2 == null ? 0 : ((com.tencent.mm.plugin.sns.storage.SnsInfo) cVar2.f426152a.get(0)).getHead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            int i18 = head / 10000;
            int i19 = head2 / 10000;
            android.widget.TextView textView = hVar.f426162e;
            if ((head2 != 0 || i18 == com.tencent.mm.plugin.sns.ui.os.f()) && (head2 == 0 || i18 == i19)) {
                textView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams = hVar.itemView.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479563f);
                    hVar.itemView.setLayoutParams(marginLayoutParams);
                }
            } else {
                textView.setText(java.lang.String.format(y(iVar2).getResources().getString(com.tencent.mm.R.string.jh6), java.lang.Integer.valueOf(i18)));
                textView.setVisibility(0);
                android.view.ViewGroup.LayoutParams layoutParams2 = hVar.itemView.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    if (head2 != 0) {
                        marginLayoutParams2.topMargin = i65.a.b(textView.getContext(), 70);
                    } else {
                        marginLayoutParams2.topMargin = i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479563f);
                    }
                    hVar.itemView.setLayoutParams(marginLayoutParams2);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            java.lang.String str2 = cVar.f426153b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            boolean contains = str2.contains("/");
            android.widget.TextView textView2 = hVar.f426163f;
            if (contains) {
                java.lang.String[] split = str2.split("/");
                if (split.length > 1) {
                    textView2.setText(split[1]);
                }
            } else {
                textView2.setText(str2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = hVar.f426165h;
            androidx.recyclerview.widget.RecyclerView recyclerView = hVar.f426164g;
            recyclerView.setLayoutManager(gridLayoutManager);
            ub4.p pVar = hVar.f426161d;
            recyclerView.setAdapter(pVar);
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> list = cVar.f426152a;
            pVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            java.util.ArrayList arrayList = (java.util.ArrayList) pVar.f426194d;
            arrayList.clear();
            for (com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo : list) {
                java.util.Iterator it = snsInfo.getTimeLine().ContentObj.f369840h.iterator();
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    ub4.e eVar = new ub4.e();
                    eVar.f426156a = snsInfo.localid;
                    eVar.f426157b = jj4Var;
                    arrayList.add(eVar);
                }
            }
            pVar.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
        } else if (k3Var instanceof ub4.g) {
            ((ub4.g) k3Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        androidx.recyclerview.widget.k3 dVar = i17 == 1 ? new ub4.d(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cql, viewGroup, false)) : i17 == 2 ? new ub4.g(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cqn, viewGroup, false)) : new ub4.h(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cqk, viewGroup, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return dVar;
    }

    public void z() {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "i addSize ");
        java.util.List list = this.f426167d;
        if (((java.util.ArrayList) list).size() > 1) {
            java.util.List list2 = ((ub4.c) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 2)).f426152a;
            if (!list2.isEmpty()) {
                j17 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) list2.get(list2.size() - 1)).field_snsId;
                I(j17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        j17 = 0;
        I(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }
}
