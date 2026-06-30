package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract;", "", "<init>", "()V", "NotifyPresenter", "NotifyViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContract {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract f123002a = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f123003b = new java.util.ArrayList();

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class NotifyPresenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final int f123004d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f123005e;

        /* renamed from: f, reason: collision with root package name */
        public final java.util.ArrayList f123006f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f123007g;

        /* renamed from: h, reason: collision with root package name */
        public final java.util.List f123008h;

        /* renamed from: i, reason: collision with root package name */
        public final java.util.concurrent.ConcurrentHashMap f123009i;

        /* renamed from: m, reason: collision with root package name */
        public final java.util.concurrent.ConcurrentHashMap f123010m;

        /* renamed from: n, reason: collision with root package name */
        public long f123011n;

        /* renamed from: o, reason: collision with root package name */
        public final java.util.ArrayList f123012o;

        /* renamed from: p, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f123013p;

        /* renamed from: q, reason: collision with root package name */
        public final java.util.ArrayList f123014q;

        /* renamed from: r, reason: collision with root package name */
        public final com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct f123015r;

        /* renamed from: s, reason: collision with root package name */
        public final jz5.g f123016s;

        /* renamed from: t, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1 f123017t;

        /* renamed from: u, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$listStatusUpdateListener$1 f123018u;

        /* renamed from: v, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$thanksUpdateListener$1 f123019v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f123020w;

        /* JADX WARN: Type inference failed for: r6v3, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r6v4, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$listStatusUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r6v5, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$thanksUpdateListener$1] */
        public NotifyPresenter(int i17, int[] requestScenes, java.util.ArrayList msgTypes) {
            kotlin.jvm.internal.o.g(requestScenes, "requestScenes");
            kotlin.jvm.internal.o.g(msgTypes, "msgTypes");
            this.f123004d = i17;
            this.f123005e = requestScenes;
            this.f123006f = msgTypes;
            this.f123007g = "Finder.NotifyPresenter." + hashCode();
            this.f123008h = new java.util.ArrayList();
            this.f123009i = new java.util.concurrent.ConcurrentHashMap();
            this.f123010m = new java.util.concurrent.ConcurrentHashMap();
            this.f123012o = new java.util.ArrayList();
            this.f123014q = new java.util.ArrayList();
            this.f123015r = new com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct();
            this.f123016s = jz5.h.b(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$finderUserName$2(this));
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            this.f123017t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMentionUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1
                {
                    this.__eventId = -2136143875;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderMentionUpdateEvent event = finderMentionUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.lc lcVar = event.f54306g;
                    if (lcVar == null) {
                        return false;
                    }
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter.this, event, lcVar.f7236a, lcVar.f7237b));
                    return false;
                }
            };
            this.f123018u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$listStatusUpdateListener$1
                {
                    this.__eventId = 1226247341;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent finderMentionListStatusUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent event = finderMentionListStatusUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.kc kcVar = event.f54305g;
                    java.lang.Integer valueOf = kcVar != null ? java.lang.Integer.valueOf(kcVar.f7138a) : null;
                    if (valueOf != null && valueOf.intValue() == 1) {
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter.this;
                        java.util.Iterator it = ((java.util.ArrayList) notifyPresenter.f123008h).iterator();
                        final int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            if (((java.lang.Boolean) it.next()).booleanValue()) {
                                break;
                            }
                            i18++;
                        }
                        new bq.a(notifyPresenter.f123004d, notifyPresenter.f123005e[i18], (java.lang.String) ((jz5.n) notifyPresenter.f123016s).getValue(), true).l().K(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$insertFoldedList$1
                            @Override // gm5.a
                            public java.lang.Object call(java.lang.Object obj) {
                                java.util.ArrayList arrayList;
                                boolean z17;
                                java.lang.Object obj2;
                                java.util.Iterator it6;
                                java.lang.Object obj3;
                                java.util.LinkedList<r45.pg2> list;
                                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                                if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                                    r45.n81 n81Var = (r45.n81) fVar.f70618d;
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter.this;
                                    java.util.ArrayList arrayList2 = notifyPresenter2.f123014q;
                                    int i19 = i18;
                                    java.lang.Object obj4 = arrayList2.get(i19);
                                    kotlin.jvm.internal.o.f(obj4, "get(...)");
                                    final java.util.ArrayList arrayList3 = (java.util.ArrayList) obj4;
                                    final java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    r45.wg2 wg2Var = (r45.wg2) n81Var.getCustom(1);
                                    cu2.a0 a0Var2 = cu2.b0.f222371a;
                                    if (wg2Var == null || (list = wg2Var.getList(0)) == null) {
                                        arrayList = null;
                                    } else {
                                        arrayList = new java.util.ArrayList();
                                        for (r45.pg2 pg2Var : list) {
                                            kotlin.jvm.internal.o.d(pg2Var);
                                            arrayList.add(a0Var2.k(notifyPresenter2.f123004d, pg2Var, (java.lang.String) ((jz5.n) notifyPresenter2.f123016s).getValue()));
                                        }
                                    }
                                    if (arrayList != null) {
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                        java.util.Iterator it7 = arrayList.iterator();
                                        while (it7.hasNext()) {
                                            so2.i j17 = a0Var2.j((dm.pd) it7.next());
                                            if (j17 != null) {
                                                java.util.Iterator it8 = arrayList3.iterator();
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        it6 = it7;
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = it8.next();
                                                    it6 = it7;
                                                    if (((so2.i) obj3).f410411d.field_svrMentionId == j17.f410411d.field_svrMentionId) {
                                                        break;
                                                    }
                                                    it7 = it6;
                                                }
                                                if (obj3 == null) {
                                                    j17.f410414g = true;
                                                }
                                            } else {
                                                it6 = it7;
                                                j17 = null;
                                            }
                                            if (j17 != null) {
                                                arrayList5.add(j17);
                                            }
                                            it7 = it6;
                                        }
                                        arrayList4.addAll(arrayList5);
                                    }
                                    r45.qk4 qk4Var = (r45.qk4) notifyPresenter2.f123010m.get(java.lang.Integer.valueOf(i19));
                                    if (qk4Var != null) {
                                        java.util.ListIterator listIterator = arrayList4.listIterator(arrayList4.size());
                                        while (true) {
                                            if (!listIterator.hasPrevious()) {
                                                z17 = false;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = listIterator.previous();
                                            z17 = false;
                                            if (((so2.i) obj2).f410411d.field_svrMentionId > qk4Var.getLong(0)) {
                                                break;
                                            }
                                        }
                                        so2.i iVar = (so2.i) obj2;
                                        if (iVar != null) {
                                            iVar.f410412e = true;
                                            iVar.f410413f = qk4Var.getInteger(1) == 1 ? true : z17;
                                        }
                                    }
                                    androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new androidx.recyclerview.widget.b0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$insertFoldedList$1$result$1
                                        @Override // androidx.recyclerview.widget.b0
                                        public boolean a(int i27, int i28) {
                                            java.util.ArrayList arrayList6 = arrayList3;
                                            boolean z18 = ((so2.i) arrayList6.get(i27)).f410412e;
                                            java.util.ArrayList arrayList7 = arrayList4;
                                            return z18 == ((so2.i) arrayList7.get(i28)).f410412e && ((so2.i) arrayList6.get(i27)).f410413f == ((so2.i) arrayList7.get(i28)).f410413f;
                                        }

                                        @Override // androidx.recyclerview.widget.b0
                                        public boolean b(int i27, int i28) {
                                            return ((so2.i) arrayList3.get(i27)).f410411d.field_svrMentionId == ((so2.i) arrayList4.get(i28)).f410411d.field_svrMentionId;
                                        }

                                        @Override // androidx.recyclerview.widget.b0
                                        public int d() {
                                            return arrayList4.size();
                                        }

                                        @Override // androidx.recyclerview.widget.b0
                                        public int e() {
                                            return arrayList3.size();
                                        }
                                    }, true);
                                    final com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) notifyPresenter2.f123012o.get(i19)).f123085m;
                                    if (wxRecyclerAdapter != null) {
                                        arrayList3.clear();
                                        arrayList3.addAll(arrayList4);
                                        a17.a(new androidx.recyclerview.widget.r1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$insertFoldedList$1$1$1
                                            @Override // androidx.recyclerview.widget.r1
                                            public void a(int i27, int i28, java.lang.Object obj5) {
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeChanged(i27, i28, obj5);
                                            }

                                            @Override // androidx.recyclerview.widget.r1
                                            public void b(int i27, int i28) {
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeInserted(i27, i28);
                                            }

                                            @Override // androidx.recyclerview.widget.r1
                                            public void c(int i27, int i28) {
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeRemoved(i27, i28);
                                            }

                                            @Override // androidx.recyclerview.widget.r1
                                            public void d(int i27, int i28) {
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemMoved(i27, i28);
                                            }
                                        });
                                    }
                                }
                                return jz5.f0.f302826a;
                            }
                        });
                    }
                    return true;
                }
            };
            this.f123019v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$thanksUpdateListener$1
                {
                    this.__eventId = 1097932050;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.md mdVar = event.f54333g;
                    java.lang.String str = mdVar != null ? mdVar.f7339c : null;
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$thanksUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter.this, mdVar != null ? java.lang.Long.valueOf(mdVar.f7337a) : null, str, mdVar != null ? java.lang.Integer.valueOf(mdVar.f7340d) : null, event));
                    return false;
                }
            };
            int size = msgTypes.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                this.f123014q.add(new java.util.ArrayList());
                this.f123008h.add(java.lang.Boolean.FALSE);
            }
            for (java.lang.Object obj : this.f123014q) {
                int i27 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mars.xlog.Log.i(this.f123007g, "init containerList: item[" + i18 + "]: " + ((java.util.ArrayList) obj).hashCode());
                i18 = i27;
            }
            this.f123020w = true;
        }

        public final void c(int i17) {
            com.tencent.mm.ui.MMActivity mMActivity;
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) kz5.n0.Z(this.f123012o);
            kotlinx.coroutines.y0 b17 = (notifyViewCallback == null || (mMActivity = notifyViewCallback.f123083h) == null) ? null : v65.m.b(mMActivity);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e(this.f123007g, "viewCallbacks.firstOrNull()?.getActivity()?.lifecycleScope is null");
            }
            int i18 = this.f123005e[i17];
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.k kVar = (cq.k) c17;
            int i19 = this.f123004d;
            cq.j1.h(kVar, i19, i18, i19 == 1 ? (java.lang.String) ((jz5.n) this.f123016s).getValue() : "", null, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1(b17, this, i18, i17), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2(this, i18, b17, i17), 8, null);
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract finderNotifyContract = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            finderNotifyContract.getClass();
            java.util.ArrayList arrayList = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123003b;
            if ((i17 >= 0 && i17 < arrayList.size() ? arrayList : null) != null) {
                arrayList.set(i17, java.lang.Long.valueOf(uptimeMillis));
            }
        }

        public final java.util.ArrayList f(int i17) {
            java.util.ArrayList arrayList = this.f123014q;
            java.util.ArrayList arrayList2 = (i17 >= 0 && i17 < arrayList.size() ? arrayList : null) != null ? (java.util.ArrayList) arrayList.get(i17) : null;
            return arrayList2 == null ? new java.util.ArrayList() : arrayList2;
        }

        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback g(int i17) {
            java.util.ArrayList arrayList = this.f123012o;
            if (!(i17 >= 0 && i17 < arrayList.size())) {
                arrayList = null;
            }
            if (arrayList != null) {
                return (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) arrayList.get(i17);
            }
            return null;
        }

        public final void h(long j17, int i17, int i18, boolean z17, boolean z18, boolean z19) {
            pm0.v.K(null, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1(this, j17, i18, i17, z17, z18, z19));
        }

        public final void i(int i17, boolean z17) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback g17 = g(i17);
            if (g17 != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(null, g17, false, 0));
            }
            com.tencent.mars.xlog.Log.i(this.f123007g, "requestRefresh " + i17 + ", " + z17);
            if (z17) {
                return;
            }
            c(i17);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyPresenter;", "Lym5/l1;", "UICallbackListener", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class NotifyViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d, reason: collision with root package name */
        public final int f123079d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f123080e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f123081f;

        /* renamed from: g, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123082g;

        /* renamed from: h, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f123083h;

        /* renamed from: i, reason: collision with root package name */
        public final android.view.View f123084i;

        /* renamed from: m, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123085m;

        /* renamed from: n, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f123086n;

        /* renamed from: o, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f123087o;

        /* renamed from: p, reason: collision with root package name */
        public com.tencent.mm.ui.widget.MMProcessBar f123088p;

        /* renamed from: q, reason: collision with root package name */
        public android.widget.TextView f123089q;

        /* renamed from: r, reason: collision with root package name */
        public db2.g4 f123090r;

        /* renamed from: s, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.UICallbackListener f123091s;

        /* renamed from: t, reason: collision with root package name */
        public no2.c f123092t;

        /* renamed from: u, reason: collision with root package name */
        public rl5.r f123093u;

        /* renamed from: v, reason: collision with root package name */
        public final int f123094v;

        /* renamed from: w, reason: collision with root package name */
        public final int f123095w;

        /* renamed from: x, reason: collision with root package name */
        public final int f123096x;

        /* renamed from: y, reason: collision with root package name */
        public final int f123097y;

        /* renamed from: z, reason: collision with root package name */
        public db2.n4 f123098z;

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$UICallbackListener;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes10.dex */
        public interface UICallbackListener {
            void F(dm.pd pdVar);
        }

        public NotifyViewCallback(com.tencent.mm.ui.MMActivity activity, android.view.View notifyView, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter presenter, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.UICallbackListener uICallbackListener, int i17) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(notifyView, "notifyView");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f123079d = i17;
            this.f123080e = "Finder.NotifyViewCallback." + hashCode();
            this.f123081f = true;
            this.f123082g = presenter;
            this.f123083h = activity;
            this.f123084i = notifyView;
            this.f123091s = uICallbackListener;
            this.f123094v = 100;
            this.f123095w = 101;
            this.f123096x = 102;
            this.f123097y = 103;
        }

        public static final void l(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, int i17) {
            com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
            switch (i17) {
                case -8003:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.f492069f45, 0);
                    return;
                case -8002:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.cwu, 0);
                    return;
                case -8001:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.cv_, 0);
                    return;
                default:
                    return;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:347:0x07cb  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x07da  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x07e8  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x07f6  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x0804  */
        /* JADX WARN: Removed duplicated region for block: B:362:0x0822  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x0831  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x083d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void o(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback r23, boolean r24, com.tencent.mm.protocal.protobuf.FinderObject r25, long r26) {
            /*
                Method dump skipped, instructions count: 2155
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.o(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback, boolean, com.tencent.mm.protocal.protobuf.FinderObject, long):void");
        }

        public static final void q(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, dm.pd pdVar, int i17) {
            notifyViewCallback.getClass();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, mMActivity, 15L, 1L, false, finderMsgContract.g(pdVar), i17, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, notifyViewCallback.f123083h, notifyViewCallback.f123082g.f123004d, false, null, pdVar, false, false, false, false, uc1.o.CTRL_INDEX, null), 8, null);
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f123080e, "[onOverStart] dy=" + i18);
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f123088p;
            if (mMProcessBar == null) {
                return false;
            }
            mMProcessBar.b(i18 / ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479684cj)));
            return false;
        }

        public final void b() {
            fc2.o Z6;
            android.view.View view = this.f123084i;
            final com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e);
            this.f123087o = refreshLoadMoreLayout;
            if (this.f123081f) {
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setEnableRefresh(false);
                    refreshLoadMoreLayout.setEnableRefresh(false);
                    s();
                    refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
                    refreshLoadMoreLayout.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)));
                    refreshLoadMoreLayout.setDamping(1.85f);
                    this.f123088p = (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.m6l);
                    refreshLoadMoreLayout.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1
                        @Override // ym5.q3
                        public void b(int i17) {
                            boolean b17 = bq.q0.f23513t.b();
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this;
                            if (b17) {
                                notifyViewCallback.f123082g.c(notifyViewCallback.f123079d);
                            } else {
                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = notifyViewCallback.f123082g;
                                notifyPresenter.h(((so2.i) kz5.n0.i0(notifyPresenter.f(notifyViewCallback.f123079d))).f410411d.field_id, 20, notifyViewCallback.f123079d, true, false, true);
                            }
                        }

                        @Override // ym5.q3
                        public void c(ym5.s3 reason) {
                            kotlin.jvm.internal.o.g(reason, "reason");
                        }

                        @Override // ym5.q3
                        public void d(int i17, rn5.a aVar, boolean z17) {
                            com.tencent.mm.view.RefreshLoadMoreLayout.this.getRecyclerView().setItemAnimator(new uw2.n0());
                        }

                        @Override // ym5.q3
                        public void e(ym5.s3 reason) {
                            kotlin.jvm.internal.o.g(reason, "reason");
                            final com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = com.tencent.mm.view.RefreshLoadMoreLayout.this;
                            com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout2, null, 1, null);
                            refreshLoadMoreLayout2.getRecyclerView().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1$onRefreshEnd$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.tencent.mm.view.RefreshLoadMoreLayout.this.getRecyclerView().setItemAnimator(new androidx.recyclerview.widget.z());
                                }
                            }, 1000L);
                        }
                    });
                    refreshLoadMoreLayout.setOverCallback(this);
                }
            } else if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableRefresh(false);
                s();
            }
            com.tencent.mm.ui.MMActivity context = this.f123083h;
            this.f123093u = new rl5.r(context);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kge);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
            this.f123086n = recyclerView;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kgf);
            this.f123089q = textView;
            if (textView != null) {
                textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view2);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                        notifyViewCallback.f123082g.i(notifyViewCallback.f123079d, false);
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123082g;
            if (notifyPresenter.f123004d == 2 && !bq.q0.f23513t.b()) {
                this.f123092t = new no2.c(notifyPresenter.f123004d, null, context, this.f123087o);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.f123082g.f123004d == 2) {
                        if (type == so2.c4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.y3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.o3.class.getName().hashCode()) {
                            com.tencent.mm.plugin.finder.convert.kp v17 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v();
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                            return new com.tencent.mm.plugin.finder.convert.jp(v17, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$2$getItemConvert$1(notifyViewCallback), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$2$getItemConvert$2(notifyViewCallback));
                        }
                        if (type == so2.d4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.pq();
                        }
                        if (type == so2.r3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.cq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.a4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.lq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.w3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.v3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.b4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.mq();
                        }
                        if (type == so2.t3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.aq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.q3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.sq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.u3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.zp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.z3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.jq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.f4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.uq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.e4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.tq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.g4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.vq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                        }
                        if (type == so2.n3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.fp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v(), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$2$getItemConvert$3(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this));
                        }
                        hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.f123080e, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127951tb).getValue()).r()).intValue() == 1;
                    if (type == so2.c4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.y3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.p3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.tp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.o3.class.getName().hashCode()) {
                        return z17 ? new com.tencent.mm.plugin.finder.convert.jp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v(), null, null, 6, null) : new com.tencent.mm.plugin.finder.convert.gp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.d4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.pq();
                    }
                    if (type == so2.r3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.yp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.a4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.kq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.w3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.v3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.b4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.mq();
                    }
                    if (type == so2.s3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.xp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.u3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.zp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.z3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.jq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.f4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.uq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.e4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.tq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.g4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.vq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v());
                    }
                    if (type == so2.n3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.fp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.v(), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$2$getItemConvert$4(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this));
                    }
                    hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this.f123080e, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
            }, notifyPresenter.f(this.f123079d), true);
            this.f123085m = wxRecyclerAdapter;
            wxRecyclerAdapter.F = new in5.y0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$3
                @Override // in5.y0
                public void a(androidx.recyclerview.widget.RecyclerView recyclerView2, in5.w0 data) {
                    kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                    kotlin.jvm.internal.o.g(data, "data");
                    java.util.LinkedList<in5.x0> linkedList = data.f293156i;
                    for (in5.x0 x0Var : linkedList) {
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                    com.tencent.mars.xlog.Log.i(notifyViewCallback.f123080e, "index " + notifyViewCallback.f123079d + " last firstVisibleItemPosition " + data.f293151d + "  lastVisibleItemPosition :" + data.f293152e + "    lastFirstVisibleItemPosition   " + data.f293149b + " lastLastVisibleItemPosition  " + data.f293150c + "  diffVisibleDataList.size:" + linkedList.size() + " acrossDataList " + data.f293154g.size() + "   visibleDataList:" + data.f293153f.size());
                }
            };
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f123086n;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                Z6.d(recyclerView2);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f123086n;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView3.setAdapter(this.f123085m);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f123085m;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$4
                    @Override // in5.x
                    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
                        java.lang.String str;
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view2, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 >= 0) {
                            final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = notifyViewCallback.f123082g;
                            int i18 = notifyViewCallback.f123079d;
                            if (a07 >= notifyPresenter2.f(i18).size()) {
                                return;
                            }
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter3 = notifyViewCallback.f123082g;
                            java.lang.Object obj = notifyPresenter3.f(i18).get(a07);
                            kotlin.jvm.internal.o.f(obj, "get(...)");
                            so2.i iVar = (so2.i) obj;
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.UICallbackListener uICallbackListener = notifyViewCallback.f123091s;
                            final dm.pd pdVar = iVar.f410411d;
                            if (uICallbackListener != null) {
                                uICallbackListener.F(pdVar);
                            }
                            com.tencent.mars.xlog.Log.i(notifyViewCallback.f123080e, "onClick " + a07 + " id:" + pdVar.field_id + " commentId:" + pdVar.field_commentId);
                            int i19 = pdVar.field_jumpType;
                            android.content.Context context2 = holder.f293121e;
                            if (i19 == 1) {
                                xc2.y2 y2Var = xc2.y2.f453343a;
                                com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
                                com.tencent.mm.protocal.protobuf.FinderJumpInfo field_jumpInfo = pdVar.field_jumpInfo;
                                kotlin.jvm.internal.o.f(field_jumpInfo, "field_jumpInfo");
                                xc2.y2.i(y2Var, mMActivity, new xc2.p0(field_jumpInfo), 0, null, 12, null);
                            } else if (notifyPresenter3.f123004d != 1 || notifyPresenter3.f123005e[i18] != 1 || a07 != 0) {
                                int i27 = pdVar.field_type;
                                dm.pd pdVar2 = iVar.f410411d;
                                com.tencent.mm.ui.MMActivity mMActivity2 = notifyViewCallback.f123083h;
                                if (i27 == 1) {
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Bj(pdVar.field_type, i18 + 1, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uj(mMActivity2, null);
                                } else {
                                    i95.m c17 = i95.n0.c(cq.k.class);
                                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                                    if (((java.lang.Boolean) t70Var.N().r()).booleanValue() && pdVar.field_jumpType == 3) {
                                        kv2.h.f312662a.b(new java.lang.ref.WeakReference(mMActivity2), pdVar.field_extInfo.getLong(7), pdVar.field_commentId);
                                    } else {
                                        i95.m c18 = i95.n0.c(cq.k.class);
                                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                                        if (((java.lang.Boolean) t70Var.N().r()).booleanValue() && kv2.h.f312662a.d(pdVar)) {
                                            kv2.h.c(new java.lang.ref.WeakReference(mMActivity2), pdVar, a07, iVar);
                                        } else {
                                            int i28 = pdVar.field_type;
                                            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                                            int i29 = notifyPresenter3.f123004d;
                                            if (i28 == 10 || i28 == 11) {
                                                if (i28 == 11 && !com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_username)) {
                                                    android.content.Intent intent = new android.content.Intent();
                                                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.x(intent, i29, i18);
                                                    intent.putExtra("finder_username", pdVar.field_username);
                                                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context2, intent, 0L, null, 0, 9, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context2, intent);
                                                }
                                            } else if (i28 == 17) {
                                                android.content.Intent intent2 = new android.content.Intent();
                                                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                                i0Var.Ik(context2, intent2);
                                            } else if (i28 == 2 && (pdVar.field_extFlag & 16) > 0) {
                                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Cj(pdVar.field_type, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                                if (!com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.o(mMActivity2, pdVar, i29)) {
                                                    db2.g4 g4Var = notifyViewCallback.f123090r;
                                                    if (g4Var != null) {
                                                        g4Var.j();
                                                    }
                                                    db2.n4 n4Var = notifyViewCallback.f123098z;
                                                    if (n4Var != null) {
                                                        n4Var.j();
                                                    }
                                                    long j17 = pdVar.field_refVideoObjectId;
                                                    java.lang.String str2 = "";
                                                    java.lang.String field_refVideoObjectNonceId = pdVar.field_refVideoObjectNonceId;
                                                    kotlin.jvm.internal.o.f(field_refVideoObjectNonceId, "field_refVideoObjectNonceId");
                                                    int i37 = 0;
                                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                                    db2.n4 n4Var2 = new db2.n4(j17, str2, field_refVideoObjectNonceId, i37, nyVar2 != null ? nyVar2.V6() : null, 8, null);
                                                    notifyViewCallback.f123098z = n4Var2;
                                                    pq5.g l17 = n4Var2.l();
                                                    l17.f(mMActivity2);
                                                    l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1
                                                        @Override // gm5.a
                                                        public java.lang.Object call(java.lang.Object obj2) {
                                                            r45.wj4 wj4Var;
                                                            r45.wj4 wj4Var2;
                                                            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj2;
                                                            final dm.pd pdVar3 = pdVar;
                                                            final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                                                            if (fVar == null) {
                                                                com.tencent.mars.xlog.Log.i(notifyViewCallback2.f123080e, "result == null id " + pdVar3.field_id + " content " + com.tencent.mm.sdk.platformtools.t8.G1(pdVar3.field_content));
                                                            } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                                                                java.lang.String str3 = notifyViewCallback2.f123080e;
                                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get mega video detail success, id = ");
                                                                db2.n4 n4Var3 = notifyViewCallback2.f123098z;
                                                                sb6.append(n4Var3 != null ? java.lang.Long.valueOf(n4Var3.f228099t) : null);
                                                                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                                                                r45.xf2 xf2Var = new r45.xf2();
                                                                com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
                                                                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                                xf2Var.set(0, (r45.oj4) ((r45.tj4) fVar2).getCustom(1));
                                                                com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
                                                                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                                xf2Var.set(1, (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.tj4) fVar3).getCustom(2));
                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter4 = notifyViewCallback2.f123082g;
                                                                int i38 = notifyPresenter4.f123004d == 1 ? 7 : 5;
                                                                r45.oj4 oj4Var = (r45.oj4) xf2Var.getCustom(0);
                                                                if (oj4Var != null && (wj4Var = (r45.wj4) oj4Var.getCustom(18)) != null) {
                                                                    long j18 = wj4Var.getLong(0);
                                                                    r45.oj4 oj4Var2 = (r45.oj4) xf2Var.getCustom(0);
                                                                    java.lang.String string = (oj4Var2 == null || (wj4Var2 = (r45.wj4) oj4Var2.getCustom(18)) == null) ? null : wj4Var2.getString(1);
                                                                    int i39 = notifyPresenter4.f123004d;
                                                                    com.tencent.mm.ui.MMActivity context3 = notifyViewCallback2.f123083h;
                                                                    kotlin.jvm.internal.o.g(context3, "context");
                                                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                                                    db2.g4 g4Var2 = new db2.g4(j18, string, i38, i39, "", true, null, null, 0L, null, false, false, null, nyVar3 != null ? nyVar3.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
                                                                    notifyViewCallback2.f123090r = g4Var2;
                                                                    g4Var2.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1$1$1
                                                                        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
                                                                        
                                                                            if (com.tencent.mm.sdk.platformtools.t8.D0(r8 != null ? r8.getUsername() : null, xy2.c.e(r1)) != false) goto L28;
                                                                         */
                                                                        @Override // gm5.a
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                            To view partially-correct add '--show-bad-code' argument
                                                                        */
                                                                        public java.lang.Object call(java.lang.Object r8) {
                                                                            /*
                                                                                r7 = this;
                                                                                com.tencent.mm.modelbase.f r8 = (com.tencent.mm.modelbase.f) r8
                                                                                dm.pd r0 = r2
                                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r1 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this
                                                                                if (r8 != 0) goto L2d
                                                                                java.lang.String r8 = r1.f123080e
                                                                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                                                                java.lang.String r2 = "result == null id "
                                                                                r1.<init>(r2)
                                                                                long r2 = r0.field_id
                                                                                r1.append(r2)
                                                                                java.lang.String r2 = " content "
                                                                                r1.append(r2)
                                                                                java.lang.String r0 = r0.field_content
                                                                                java.lang.String r0 = com.tencent.mm.sdk.platformtools.t8.G1(r0)
                                                                                r1.append(r0)
                                                                                java.lang.String r0 = r1.toString()
                                                                                com.tencent.mars.xlog.Log.i(r8, r0)
                                                                                goto Ld3
                                                                            L2d:
                                                                                int r2 = r8.f70615a
                                                                                if (r2 != 0) goto L35
                                                                                int r3 = r8.f70616b
                                                                                if (r3 == 0) goto L3d
                                                                            L35:
                                                                                int r3 = r8.f70616b
                                                                                boolean r2 = hc2.p.b(r2, r3)
                                                                                if (r2 == 0) goto Lce
                                                                            L3d:
                                                                                com.tencent.mm.protobuf.f r8 = r8.f70618d
                                                                                r45.h51 r8 = (r45.h51) r8
                                                                                r2 = 2
                                                                                com.tencent.mm.protobuf.f r8 = r8.getCustom(r2)
                                                                                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.mm.protocal.protobuf.FinderObject) r8
                                                                                if (r8 == 0) goto Ld3
                                                                                android.content.Intent r2 = new android.content.Intent
                                                                                r2.<init>()
                                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract r3 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a
                                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r4 = r1.f123082g
                                                                                int r4 = r4.f123004d
                                                                                int r5 = r1.f123079d
                                                                                r3.x(r2, r4, r5)
                                                                                java.lang.String r4 = "feed_object_id"
                                                                                long r5 = r8.getId()
                                                                                r2.putExtra(r4, r5)
                                                                                java.lang.String r4 = "feed_object_nonceid"
                                                                                java.lang.String r5 = r8.getObjectNonceId()
                                                                                r2.putExtra(r4, r5)
                                                                                long r4 = r0.field_id
                                                                                java.lang.String r6 = "mention_id"
                                                                                r2.putExtra(r6, r4)
                                                                                java.lang.String r4 = "mention_create_time"
                                                                                int r5 = r0.field_createTime
                                                                                r2.putExtra(r4, r5)
                                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r4 = r1.f123082g
                                                                                int r5 = r4.f123004d
                                                                                java.lang.String r6 = "from_scene"
                                                                                r2.putExtra(r6, r5)
                                                                                com.tencent.mm.protocal.protobuf.FinderContact r5 = r8.getContact()
                                                                                if (r5 == 0) goto L8f
                                                                                java.lang.String r5 = r5.getUsername()
                                                                                if (r5 != 0) goto L91
                                                                            L8f:
                                                                                java.lang.String r5 = ""
                                                                            L91:
                                                                                java.lang.String r6 = "feed_username"
                                                                                r2.putExtra(r6, r5)
                                                                                int r4 = r4.f123004d
                                                                                r5 = 1
                                                                                com.tencent.mm.ui.MMActivity r1 = r1.f123083h
                                                                                if (r4 != r5) goto Lb4
                                                                                com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.getContact()
                                                                                if (r8 == 0) goto La8
                                                                                java.lang.String r8 = r8.getUsername()
                                                                                goto La9
                                                                            La8:
                                                                                r8 = 0
                                                                            La9:
                                                                                java.lang.String r4 = xy2.c.e(r1)
                                                                                boolean r8 = com.tencent.mm.sdk.platformtools.t8.D0(r8, r4)
                                                                                if (r8 == 0) goto Lb4
                                                                                goto Lb5
                                                                            Lb4:
                                                                                r5 = 0
                                                                            Lb5:
                                                                                java.lang.String r8 = "feed_is_self"
                                                                                r2.putExtra(r8, r5)
                                                                                r3.u(r2, r0)
                                                                                com.tencent.mm.plugin.finder.viewmodel.component.iy r8 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1
                                                                                r8.c(r1, r2)
                                                                                java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r8 = com.tencent.mm.plugin.finder.assist.i0.class
                                                                                i95.m r8 = i95.n0.c(r8)
                                                                                com.tencent.mm.plugin.finder.assist.i0 r8 = (com.tencent.mm.plugin.finder.assist.i0) r8
                                                                                r8.Xj(r1, r2)
                                                                                goto Ld3
                                                                            Lce:
                                                                                int r8 = r8.f70616b
                                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.l(r1, r8)
                                                                            Ld3:
                                                                                jz5.f0 r8 = jz5.f0.f302826a
                                                                                return r8
                                                                            */
                                                                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1$1$1.call(java.lang.Object):java.lang.Object");
                                                                        }
                                                                    });
                                                                }
                                                            } else {
                                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.l(notifyViewCallback2, fVar.f70616b);
                                                            }
                                                            return jz5.f0.f302826a;
                                                        }
                                                    });
                                                }
                                            } else if (i28 == 18) {
                                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Bj(pdVar.field_type, i18 + 1, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                                db2.g4 g4Var2 = notifyViewCallback.f123090r;
                                                if (g4Var2 != null) {
                                                    g4Var2.j();
                                                }
                                                r45.xg2 xg2Var = pdVar.field_thankInfo;
                                                boolean z17 = false;
                                                if (xg2Var != null && xg2Var.getInteger(0) == 1) {
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    android.content.Intent intent3 = new android.content.Intent();
                                                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                                                    finderMsgContract.x(intent3, i29, i18);
                                                    intent3.putExtra("finder_username", pdVar.field_username);
                                                    intent3.putExtra("key_profile_mention_id", pdVar.field_id);
                                                    intent3.putExtra("key_profile_mention_create_time", pdVar.field_createTime);
                                                    intent3.putExtra("key_profile_mention_from_scene", i29);
                                                    intent3.putExtra("emFinderWxMsgFromIsThank", true);
                                                    finderMsgContract.u(intent3, pdVar);
                                                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context2, intent3, 0L, null, 0, 36, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context2, intent3);
                                                } else {
                                                    notifyViewCallback.u(pdVar);
                                                }
                                            } else if (i28 == 33) {
                                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Bj(pdVar.field_type, i18 + 1, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                                db2.g4 g4Var3 = notifyViewCallback.f123090r;
                                                if (g4Var3 != null) {
                                                    g4Var3.j();
                                                }
                                                notifyViewCallback.u(pdVar);
                                            } else if (i28 == 39 || i28 == 40) {
                                                notifyViewCallback.u(pdVar);
                                            } else if (i28 != 4) {
                                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Bj(pdVar.field_type, i18 + 1, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                                if (!com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.o(mMActivity2, pdVar, i29)) {
                                                    db2.g4 g4Var4 = notifyViewCallback.f123090r;
                                                    if (g4Var4 != null) {
                                                        g4Var4.j();
                                                    }
                                                    notifyViewCallback.u(pdVar);
                                                }
                                            } else {
                                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Bj(pdVar.field_type, i18 + 1, pdVar.u0() ? 1 : 0, pdVar.v0(), pdVar2.field_objectId);
                                                r45.rk2 rk2Var = pdVar.field_notify;
                                                if (rk2Var != null) {
                                                    int integer = rk2Var.getInteger(2);
                                                    if (integer == 1) {
                                                        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(notifyViewCallback.f123083h, rk2Var.getString(4), "", 0, 0, rk2Var.getString(3), new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject());
                                                    } else if (integer == 2) {
                                                        android.content.Intent intent4 = new android.content.Intent();
                                                        intent4.putExtra("rawUrl", rk2Var.getString(3));
                                                        j45.l.j(mMActivity2, "webview", ".ui.tools.WebViewUI", intent4, null);
                                                    } else if (integer == 3 || integer == 4) {
                                                        if (i29 == 2) {
                                                            db2.g4 g4Var5 = notifyViewCallback.f123090r;
                                                            if (g4Var5 != null) {
                                                                g4Var5.j();
                                                            }
                                                            notifyViewCallback.u(pdVar);
                                                        }
                                                    } else if (integer == 6 && i29 == 2 && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) rk2Var.getCustom(7)) != null) {
                                                        xc2.y2 y2Var2 = xc2.y2.f453343a;
                                                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                                        xc2.y2.i(y2Var2, context2, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            long j18 = notifyPresenter3.f123004d == 2 ? 15L : 14L;
                            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            int i38 = notifyPresenter3.f123004d;
                            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_contact;
                            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                                str = "";
                            }
                            java.lang.String l18 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract2, context2, i38, false, str, pdVar, false, false, true, false, 356, null);
                            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            kotlin.jvm.internal.o.f(c19, "getService(...)");
                            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c19, notifyViewCallback.f123083h, j18, 1L, false, notifyPresenter3.f123004d, 2, l18, 8, null);
                        }
                    }
                };
            }
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$5
                    @Override // in5.y
                    public boolean c(androidx.recyclerview.widget.f2 adapter, final android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view2, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        final int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 < 0) {
                            return true;
                        }
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = notifyViewCallback.f123082g;
                        final int i18 = notifyViewCallback.f123079d;
                        if (a07 >= notifyPresenter2.f(i18).size()) {
                            return true;
                        }
                        java.lang.Object obj = notifyViewCallback.f123082g.f(i18).get(a07);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick ");
                        sb6.append(a07);
                        sb6.append(" id:");
                        final dm.pd pdVar = ((so2.i) obj).f410411d;
                        sb6.append(pdVar.field_id);
                        sb6.append(" commentId:");
                        sb6.append(pdVar.field_commentId);
                        com.tencent.mars.xlog.Log.i(notifyViewCallback.f123080e, sb6.toString());
                        rl5.r rVar = notifyViewCallback.f123093u;
                        if (rVar == null) {
                            kotlin.jvm.internal.o.o("popupMenu");
                            throw null;
                        }
                        rVar.a();
                        rl5.r rVar2 = notifyViewCallback.f123093u;
                        if (rVar2 != null) {
                            rVar2.h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$1
                                @Override // android.view.View.OnCreateContextMenuListener
                                public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                    java.lang.String str;
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = notifyViewCallback;
                                    dm.pd pdVar2 = pdVar;
                                    android.view.View view4 = view2;
                                    if (i18 == 1) {
                                        notifyViewCallback2.getClass();
                                        r45.vg2 vg2Var = pdVar2.field_extInfo;
                                        if (vg2Var == null || (str = vg2Var.getString(0)) == null) {
                                            str = "";
                                        }
                                        if (!kotlin.jvm.internal.o.b(str, "music")) {
                                            contextMenu.add(0, notifyViewCallback2.f123095w, 0, view4.getResources().getString(com.tencent.mm.R.string.cki));
                                        }
                                    }
                                    contextMenu.add(1, notifyViewCallback2.f123094v, 0, view4.getResources().getString(com.tencent.mm.R.string.ev_));
                                    if (pm0.v.z(pdVar2.field_extFlag, 8192)) {
                                        java.lang.String str2 = pdVar2.field_silentMentionEntityId;
                                        if (str2 == null || str2.length() == 0) {
                                            return;
                                        }
                                        int i19 = pdVar2.field_isSilentMention;
                                        if (i19 == 0) {
                                            contextMenu.add(2, 102, 0, view4.getResources().getString(com.tencent.mm.R.string.mqr));
                                        } else if (i19 == 1) {
                                            contextMenu.add(2, 103, 0, view4.getResources().getString(com.tencent.mm.R.string.mqs));
                                        }
                                    }
                                }
                            }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lr45/e11;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2$1, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123126d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback f123127e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123128f;

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ int f123129g;

                                    /* renamed from: h, reason: collision with root package name */
                                    public final /* synthetic */ int f123130h;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(az2.f fVar, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, dm.pd pdVar, int i17, int i18) {
                                        super(1);
                                        this.f123126d = fVar;
                                        this.f123127e = notifyViewCallback;
                                        this.f123128f = pdVar;
                                        this.f123129g = i17;
                                        this.f123130h = i18;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        r45.e11 it = (r45.e11) obj;
                                        kotlin.jvm.internal.o.g(it, "it");
                                        this.f123126d.b();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f123127e;
                                        java.lang.String str = notifyViewCallback.f123080e;
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mentionId: ");
                                        dm.pd pdVar = this.f123128f;
                                        sb6.append(pdVar.field_id);
                                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                                        cu2.a0 a0Var = cu2.b0.f222371a;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = notifyViewCallback.f123082g;
                                        a0Var.a(pdVar, notifyPresenter.f123004d);
                                        java.util.ArrayList f17 = notifyPresenter.f(this.f123129g);
                                        int i17 = this.f123130h;
                                        f17.remove(i17);
                                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123085m;
                                        if (wxRecyclerAdapter != null) {
                                            wxRecyclerAdapter.notifyItemRemoved(i17);
                                        }
                                        com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
                                        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.erj), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2$2, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass2 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123131d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback f123132e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123133f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(az2.f fVar, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, dm.pd pdVar) {
                                        super(1);
                                        this.f123131d = fVar;
                                        this.f123132e = notifyViewCallback;
                                        this.f123133f = pdVar;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        this.f123131d.b();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f123132e;
                                        com.tencent.mars.xlog.Log.i(notifyViewCallback.f123080e, "del mention network error!: " + this.f123133f.field_id);
                                        com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
                                        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.eri), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2$3, reason: invalid class name */
                                /* loaded from: classes5.dex */
                                final class AnonymousClass3 extends kotlin.jvm.internal.q implements yz5.a {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123134d;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass3(az2.f fVar) {
                                        super(0);
                                        this.f123134d = fVar;
                                    }

                                    @Override // yz5.a
                                    public java.lang.Object invoke() {
                                        this.f123134d.b();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "opType", "Ljz5/f0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2$5, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass5 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback f123136d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123137e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ int f123138f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass5(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, dm.pd pdVar, int i17) {
                                        super(1);
                                        this.f123136d = notifyViewCallback;
                                        this.f123137e = pdVar;
                                        this.f123138f = i17;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        ((java.lang.Number) obj).intValue();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f123136d;
                                        dm.pd pdVar = this.f123137e;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.q(notifyViewCallback, pdVar, 8);
                                        int i17 = 0;
                                        for (java.lang.Object obj2 : notifyViewCallback.f123082g.f(this.f123138f)) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            so2.i iVar = (so2.i) obj2;
                                            if (kotlin.jvm.internal.o.b(iVar.f410411d.field_silentMentionEntityId, pdVar.field_silentMentionEntityId)) {
                                                iVar.f410411d.field_isSilentMention = 1;
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123085m;
                                                if (wxRecyclerAdapter != null) {
                                                    wxRecyclerAdapter.notifyItemChanged(i17, 4);
                                                }
                                            }
                                            i17 = i18;
                                        }
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "opType", "Ljz5/f0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2$6, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass6 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback f123139d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123140e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ int f123141f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass6(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback, dm.pd pdVar, int i17) {
                                        super(1);
                                        this.f123139d = notifyViewCallback;
                                        this.f123140e = pdVar;
                                        this.f123141f = i17;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        ((java.lang.Number) obj).intValue();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f123139d;
                                        dm.pd pdVar = this.f123140e;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.q(notifyViewCallback, pdVar, 9);
                                        int i17 = 0;
                                        for (java.lang.Object obj2 : notifyViewCallback.f123082g.f(this.f123141f)) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            so2.i iVar = (so2.i) obj2;
                                            if (kotlin.jvm.internal.o.b(iVar.f410411d.field_silentMentionEntityId, pdVar.field_silentMentionEntityId)) {
                                                iVar.f410411d.field_isSilentMention = 0;
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123085m;
                                                if (wxRecyclerAdapter != null) {
                                                    wxRecyclerAdapter.notifyItemChanged(i17, 4);
                                                }
                                            }
                                            i17 = i18;
                                        }
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @Override // db5.t4
                                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i19) {
                                    int itemId = menuItem.getItemId();
                                    final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                                    int i27 = notifyViewCallback2.f123094v;
                                    int i28 = i18;
                                    dm.pd pdVar2 = pdVar;
                                    if (itemId == i27) {
                                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).rj(1, 1, pdVar2.field_type);
                                        bq.p0 p0Var = bq.q0.f23513t;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter3 = notifyViewCallback2.f123082g;
                                        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bq.p0.e(p0Var, notifyPresenter3.f123004d, notifyPresenter3.f123005e[i28], xy2.c.e(notifyViewCallback2.f123083h), false, 8, null));
                                        java.lang.String e17 = notifyViewCallback2.f123082g.f123004d == 1 ? xy2.c.e(notifyViewCallback2.f123083h) : "";
                                        az2.c cVar = az2.f.f16125d;
                                        com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback2.f123083h;
                                        az2.f a17 = az2.c.a(cVar, mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.f9y), 200L, null, 8, null);
                                        a17.a();
                                        i95.m c17 = i95.n0.c(cq.k.class);
                                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                                        cq.k kVar = (cq.k) c17;
                                        dm.pd pdVar3 = pdVar;
                                        long j17 = pdVar3.field_id;
                                        long j18 = pdVar3.field_objectId;
                                        long j19 = pdVar3.field_commentId;
                                        int i29 = pdVar3.field_type;
                                        long j27 = pdVar3.field_svrMentionId;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                                        cq.j1.e(kVar, e17, j17, null, j18, j19, b17, i29, j27, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.AnonymousClass1(a17, notifyViewCallback3, pdVar3, i18, a07), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.AnonymousClass2(a17, notifyViewCallback3, pdVar3), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.AnonymousClass3(a17));
                                        return;
                                    }
                                    if (itemId == notifyViewCallback2.f123095w) {
                                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).rj(1, 2, pdVar2.field_type);
                                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                        hb2.y yVar = hb2.y.f280114e;
                                        long j28 = pdVar2.field_commentId;
                                        long j29 = pdVar2.field_objectId;
                                        java.lang.String field_objectNonceId = pdVar2.field_objectNonceId;
                                        kotlin.jvm.internal.o.f(field_objectNonceId, "field_objectNonceId");
                                        yVar.o(j28, j29, field_objectNonceId, true, new zy2.gc() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.4
                                            @Override // zy2.gc
                                            public void r5(java.lang.Object obj2, r45.ix0 ret) {
                                                r45.kh2 req = (r45.kh2) obj2;
                                                kotlin.jvm.internal.o.g(req, "req");
                                                kotlin.jvm.internal.o.g(ret, "ret");
                                                int integer = ret.getInteger(1);
                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback4 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                                                if (integer == 0) {
                                                    com.tencent.mars.xlog.Log.i(notifyViewCallback4.f123080e, "MENU_ID_BLOCK_MENTION list succ");
                                                    com.tencent.mm.ui.MMActivity mMActivity2 = notifyViewCallback4.f123083h;
                                                    db5.t7.makeText(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.e7g), 0).show();
                                                } else {
                                                    com.tencent.mars.xlog.Log.i(notifyViewCallback4.f123080e, "MENU_ID_BLOCK_MENTION failed:" + ret.getInteger(1));
                                                    com.tencent.mm.ui.MMActivity mMActivity3 = notifyViewCallback4.f123083h;
                                                    db5.t7.makeText(mMActivity3, mMActivity3.getResources().getString(com.tencent.mm.R.string.e7h), 0).show();
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    int i37 = notifyViewCallback2.f123096x;
                                    ya2.r rVar3 = ya2.r.f460525a;
                                    if (itemId == i37) {
                                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                        com.tencent.mm.ui.MMActivity mMActivity2 = notifyViewCallback2.f123083h;
                                        rVar3.c(mMActivity2, 1, pdVar2.field_svrMentionId, xy2.c.e(mMActivity2), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.AnonymousClass5(notifyViewCallback2, pdVar2, i28));
                                    } else if (itemId == notifyViewCallback2.f123097y) {
                                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                        com.tencent.mm.ui.MMActivity mMActivity3 = notifyViewCallback2.f123083h;
                                        rVar3.c(mMActivity3, 2, pdVar2.field_svrMentionId, xy2.c.e(mMActivity3), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2.AnonymousClass6(notifyViewCallback2, pdVar2, i28));
                                    }
                                }
                            }, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
                            return true;
                        }
                        kotlin.jvm.internal.o.o("popupMenu");
                        throw null;
                    }
                };
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f123086n;
            if (recyclerView4 != null) {
                ym5.a1.g(recyclerView4, new ym5.m0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$reportExpose$1

                    /* renamed from: a, reason: collision with root package name */
                    public final java.util.HashSet f123143a = new java.util.HashSet();

                    @Override // ym5.m0
                    public boolean d() {
                        return false;
                    }

                    @Override // ym5.m0
                    public void e(android.view.View parent, java.util.List exposedHolders) {
                        java.lang.String str;
                        kotlin.jvm.internal.o.g(parent, "parent");
                        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
                        java.util.Iterator it = exposedHolders.iterator();
                        while (it.hasNext()) {
                            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
                            if (s0Var != null) {
                                java.lang.Object obj = s0Var.f293125i;
                                so2.i iVar = obj instanceof so2.i ? (so2.i) obj : null;
                                if (iVar != null) {
                                    java.util.HashSet hashSet = this.f123143a;
                                    dm.pd pdVar = iVar.f410411d;
                                    if (!hashSet.contains(java.lang.Long.valueOf(pdVar.field_id))) {
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.this;
                                        com.tencent.mars.xlog.Log.i(notifyViewCallback.f123080e, "onChildExposeChanged:" + s0Var.getAdapterPosition());
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = notifyViewCallback.f123082g;
                                        int i17 = notifyPresenter2.f123004d == 1 ? 14 : 15;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                                        finderMsgContract.getClass();
                                        int g17 = finderMsgContract.g(pdVar);
                                        hashSet.add(java.lang.Long.valueOf(pdVar.field_id));
                                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                                        com.tencent.mm.ui.MMActivity mMActivity = notifyViewCallback.f123083h;
                                        long j17 = i17;
                                        int i18 = notifyPresenter2.f123004d;
                                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_contact;
                                        if (finderContact == null || (str = finderContact.getUsername()) == null) {
                                            str = "";
                                        }
                                        com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, mMActivity, j17, 2L, false, g17, 2, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, mMActivity, i18, false, str, iVar.f410411d, false, i17 == 15, false, false, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn, null), 8, null);
                                    }
                                }
                            }
                        }
                    }
                });
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.tencent.mars.xlog.Log.i(this.f123080e, "[onOverStop]");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f123088p;
            if (mMProcessBar != null) {
                mMProcessBar.d();
            }
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f123083h;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f123080e, "[onOverEnd] dy=" + i18);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            if (r0.f373887d == 1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
        
            if (r0.f373887d == 1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void s() {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.s():void");
        }

        public final void t(java.util.List msgList, boolean z17, boolean z18, int i17) {
            int i18;
            no2.c cVar;
            int i19;
            int i27;
            dm.pd pdVar;
            int i28;
            kotlin.jvm.internal.o.g(msgList, "msgList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("presenter.getData(");
            int i29 = this.f123079d;
            sb6.append(i29);
            sb6.append(": ");
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123082g;
            sb6.append(notifyPresenter.f(i29).hashCode());
            sb6.append(" --- ");
            sb6.append(notifyPresenter.f(i29));
            sb6.append(')');
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f123080e;
            com.tencent.mars.xlog.Log.i(str, sb7);
            int size = notifyPresenter.f(i29).size();
            java.util.ArrayList arrayList = notifyPresenter.f123014q;
            java.util.ArrayList arrayList2 = (i17 >= 0 && i17 < arrayList.size() ? arrayList : null) != null ? (java.util.ArrayList) arrayList.get(i17) : null;
            java.lang.String str2 = notifyPresenter.f123007g;
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(msgList);
                } else {
                    arrayList2.get(kz5.c0.h(arrayList2));
                    for (so2.i iVar : kz5.n0.x0(msgList)) {
                        java.util.Iterator it = arrayList2.iterator();
                        int i37 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i27 = -1;
                                break;
                            }
                            dm.pd pdVar2 = ((so2.i) it.next()).f410411d;
                            long j17 = pdVar2.field_id;
                            dm.pd pdVar3 = iVar.f410411d;
                            if (j17 == pdVar3.field_id && pdVar2.field_createTime == pdVar3.field_createTime) {
                                i27 = i37;
                                break;
                            }
                            i37++;
                        }
                        if (i27 == -1) {
                            dm.pd pdVar4 = iVar.f410411d;
                            if (pdVar4.field_type == 10 && !com.tencent.mm.sdk.platformtools.t8.K0(pdVar4.field_clientMsgId)) {
                                java.util.Iterator it6 = arrayList2.iterator();
                                int i38 = 0;
                                while (true) {
                                    boolean hasNext = it6.hasNext();
                                    pdVar = iVar.f410411d;
                                    if (!hasNext) {
                                        i28 = -1;
                                        break;
                                    } else {
                                        if (kotlin.jvm.internal.o.b(((so2.i) it6.next()).f410411d.field_clientMsgId, pdVar.field_clientMsgId)) {
                                            i28 = i38;
                                            break;
                                        }
                                        i38++;
                                    }
                                }
                                if (i28 >= 0) {
                                    arrayList2.remove(i28);
                                    com.tencent.mars.xlog.Log.i(str2, "remove same clientMsgId, " + pdVar.field_clientMsgId);
                                }
                            }
                            arrayList2.add(iVar);
                        } else {
                            arrayList2.set(i27, iVar);
                        }
                    }
                    kz5.g0.t(arrayList2, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$sortMentionList$comparator$1
                        @Override // java.util.Comparator
                        public int compare(java.lang.Object obj, java.lang.Object obj2) {
                            dm.pd pdVar5 = ((so2.i) obj).f410411d;
                            int i39 = pdVar5.field_createTime;
                            dm.pd pdVar6 = ((so2.i) obj2).f410411d;
                            int i47 = pdVar6.field_createTime;
                            return i39 == i47 ? kotlin.jvm.internal.o.j(pdVar6.field_id, pdVar5.field_id) : kotlin.jvm.internal.o.i(i47, i39);
                        }
                    });
                    com.tencent.mars.xlog.Log.i(str2, "increment size " + msgList.size());
                    if (!msgList.isEmpty()) {
                        java.lang.Long l17 = (java.lang.Long) notifyPresenter.f123009i.get(java.lang.Integer.valueOf(i17));
                        long longValue = l17 == null ? 0L : l17.longValue();
                        if (longValue > 0) {
                            java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((so2.i) listIterator.previous()).f410411d.field_id == longValue) {
                                        i19 = listIterator.nextIndex();
                                        break;
                                    }
                                } else {
                                    i19 = -1;
                                    break;
                                }
                            }
                            com.tencent.mars.xlog.Log.i(str2, "unread index " + i19 + ", raw size " + arrayList2.size());
                            if (i19 != -1) {
                                if (i19 >= 0) {
                                    int i39 = 0;
                                    while (true) {
                                        ((so2.i) arrayList2.get(i39)).f410412e = false;
                                        if (i39 == i19) {
                                            break;
                                        } else {
                                            i39++;
                                        }
                                    }
                                }
                                if (i19 != kz5.c0.h(arrayList2)) {
                                    ((so2.i) arrayList2.get(i19)).f410412e = true;
                                }
                            }
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str2, "mergeData after");
            if (notifyPresenter.f(i29).isEmpty()) {
                i18 = 0;
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(getResources().getString(com.tencent.mm.R.string.epa), this, false, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3)));
            } else {
                i18 = 0;
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(null, this, false, 0));
            }
            if (z17) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f123087o;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.P(i18);
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("finishLoadMore: onFinishRefresh notifyDataSetChanged:");
                sb8.append(i29);
                sb8.append(" size:");
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f123086n;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                sb8.append(adapter != null ? java.lang.Integer.valueOf(adapter.getItemCount()) : null);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f123086n;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
            } else {
                ym5.s3 s3Var = new ym5.s3(1);
                s3Var.f463522g = false;
                s3Var.f463521f = !msgList.isEmpty();
                s3Var.f463523h = msgList.size();
                androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f123086n;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter3 = recyclerView3.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemRangeInserted(size, msgList.size());
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f123087o;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(s3Var);
                }
            }
            if (z18 && notifyPresenter.f123004d == 2 && (!msgList.isEmpty()) && (cVar = this.f123092t) != null) {
                cVar.a(msgList, new java.util.ArrayList(notifyPresenter.f(i29)), i29, notifyPresenter.f123005e[i17]);
            }
        }

        public final void u(final dm.pd pdVar) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123082g;
            final int i17 = notifyPresenter.f123004d == 1 ? 7 : 5;
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract finderNotifyContract = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a;
            com.tencent.mm.ui.MMActivity context = this.f123083h;
            if (finderNotifyContract.b(pdVar, context)) {
                return;
            }
            long j17 = pdVar.field_objectId;
            java.lang.String str = pdVar.field_objectNonceId;
            int i18 = notifyPresenter.f123004d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
            this.f123090r = g4Var;
            g4Var.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$getCommentDetail$1
                /* JADX WARN: Removed duplicated region for block: B:128:0x02b9  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
                @Override // gm5.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object call(java.lang.Object r31) {
                    /*
                        Method dump skipped, instructions count: 772
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$getCommentDetail$1.call(java.lang.Object):java.lang.Object");
                }
            });
        }

        public final com.tencent.mm.plugin.finder.convert.kp v() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123082g;
            return new com.tencent.mm.plugin.finder.convert.kp(notifyPresenter.f123004d, notifyPresenter.f123005e[this.f123079d]);
        }

        public final void w(java.lang.String str) {
            android.view.View inflate = com.tencent.mm.ui.id.b(this.f123083h).inflate(com.tencent.mm.R.layout.b3i, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ft7)).setText(str);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f123087o;
            if (refreshLoadMoreLayout != null) {
                com.tencent.mm.view.HeadFooterLayout.c(refreshLoadMoreLayout, inflate, false, 2, null);
            }
        }

        public final void x() {
            com.tencent.mars.xlog.Log.i(this.f123080e, "initRefresh:" + this.f123079d);
            if (!bq.q0.f23513t.b()) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123082g;
                int size = notifyPresenter.f123006f.size();
                for (int i17 = 0; i17 < size; i17++) {
                    notifyPresenter.h(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 20, i17, false, true, true);
                }
            }
            pm0.v.V(200L, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initAndRefreshAll$1(this));
        }

        public final void y() {
            com.tencent.mars.xlog.Log.i(this.f123080e, "refresh: " + this.f123079d);
            pm0.v.V(250L, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$refresh$1(this));
        }
    }

    private FinderNotifyContract() {
    }

    public final long a(int i17) {
        java.util.ArrayList arrayList = f123003b;
        java.lang.Long l17 = (i17 >= 0 && i17 < arrayList.size() ? arrayList : null) != null ? (java.lang.Long) arrayList.get(i17) : null;
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public final boolean b(dm.pd mention, android.content.Context context) {
        java.lang.String str;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(mention, "mention");
        kotlin.jvm.internal.o.g(context, "context");
        r45.vg2 vg2Var = mention.field_extInfo;
        java.lang.String str2 = "";
        if (vg2Var == null || (str = vg2Var.getString(0)) == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b(str, "music")) {
            return false;
        }
        r45.vg2 vg2Var2 = mention.field_extInfo;
        if (vg2Var2 == null || (byteString = vg2Var2.getByteString(2)) == null) {
            com.tencent.mars.xlog.Log.e("FinderNotifyContract", "jumpToMusic extBuff empty!");
            return false;
        }
        byte[] bArr = byteString.f192156a;
        kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        long j17 = mention.field_commentId;
        java.lang.String string = mention.field_extInfo.getString(1);
        if (string == null) {
            string = "";
        }
        f123002a.getClass();
        try {
            r45.hf2 hf2Var = new r45.hf2();
            hf2Var.parseFrom(bArr);
            r45.xs4 xs4Var = new r45.xs4();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_mv_cover_url", hf2Var.getString(8));
            intent.putExtra("key_launch_mv_comment", true);
            intent.putExtra("key_refer_mv_comment_id", j17);
            intent.putExtra("key_need_update_music_ball_url", true);
            intent.putExtra("key_mv_extra_info", hf2Var.getString(12));
            intent.putExtra("key_mv_identification", hf2Var.getString(13));
            intent.putExtra("key_mv_music_duration", hf2Var.getInteger(14));
            intent.putExtra("key_mv_song_mid", hf2Var.getString(18));
            xs4Var.set(2, hf2Var.getString(8));
            xs4Var.set(4, hf2Var.getString(1));
            xs4Var.set(5, hf2Var.getString(7));
            xs4Var.set(6, hf2Var.getString(12));
            xs4Var.set(7, hf2Var.getString(9));
            xs4Var.set(9, hf2Var.getString(13));
            xs4Var.set(10, java.lang.Integer.valueOf(hf2Var.getInteger(14)));
            xs4Var.set(14, hf2Var.getString(0));
            xs4Var.set(15, hf2Var.getString(6));
            xs4Var.set(16, hf2Var.getString(8));
            xs4Var.set(11, hf2Var.getString(18));
            xs4Var.set(13, hf2Var.getString(8));
            com.tencent.mm.plugin.finder.storage.oa0 oa0Var = com.tencent.mm.plugin.finder.storage.oa0.f127302a;
            java.lang.String string2 = hf2Var.getString(5);
            if (string2 == null) {
                string2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            java.lang.String str3 = string2;
            kotlin.jvm.internal.o.d(str3);
            oa0Var.e(hf2Var, str3, 13, xs4Var);
            java.lang.String string3 = xs4Var.getString(14);
            if (string3 == null) {
                string3 = "";
            }
            intent.putExtra("key_mv_song_name", string3);
            java.lang.String string4 = xs4Var.getString(15);
            if (string4 == null) {
                string4 = "";
            }
            intent.putExtra("key_mv_song_lyric", string4);
            java.lang.String string5 = xs4Var.getString(4);
            if (string5 == null) {
                string5 = "";
            }
            intent.putExtra("key_mv_singer_name", string5);
            java.lang.String string6 = xs4Var.getString(5);
            if (string6 == null) {
                string6 = "";
            }
            intent.putExtra("key_mv_album_name", string6);
            java.lang.String string7 = xs4Var.getString(7);
            if (string7 == null) {
                string7 = "";
            }
            intent.putExtra("key_mv_music_genre", string7);
            intent.putExtra("key_mv_issue_date", java.lang.String.valueOf(xs4Var.getLong(8)));
            java.lang.String string8 = xs4Var.getString(16);
            if (string8 == null) {
                string8 = "";
            }
            intent.putExtra("key_mv_album_cover_url", string8);
            java.lang.String string9 = xs4Var.getString(9);
            if (string9 == null) {
                string9 = "";
            }
            intent.putExtra("key_mv_identification", string9);
            java.lang.String string10 = xs4Var.getString(6);
            if (string10 != null) {
                str2 = string10;
            }
            intent.putExtra("key_mv_extra_info", str2);
            intent.putExtra("key_mv_music_duration", xs4Var.getInteger(10));
            intent.putExtra("key_mv_music_operation_url", xs4Var.getString(12));
            intent.putExtra("key_mv_song_mid", xs4Var.getString(11));
            intent.putExtra("key_mv_entity_id", string);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Pk(context, intent);
        } catch (java.lang.Exception unused) {
        }
        return true;
    }
}
