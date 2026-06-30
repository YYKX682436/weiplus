package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew;", "", "<init>", "()V", "NotifyPresenter", "NotifyViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContractNew {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew f123149a = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct f123150b = new com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class NotifyPresenter implements fs2.a {
        public static final java.lang.String B = "Finder.NotifyPresenter." + new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.Companion(null).hashCode();
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1 A;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.fragment.app.Fragment f123151d;

        /* renamed from: e, reason: collision with root package name */
        public final int f123152e;

        /* renamed from: f, reason: collision with root package name */
        public final int f123153f;

        /* renamed from: g, reason: collision with root package name */
        public final int[] f123154g;

        /* renamed from: h, reason: collision with root package name */
        public final int f123155h;

        /* renamed from: i, reason: collision with root package name */
        public final int f123156i;

        /* renamed from: m, reason: collision with root package name */
        public final jz5.g f123157m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f123158n;

        /* renamed from: o, reason: collision with root package name */
        public long f123159o;

        /* renamed from: p, reason: collision with root package name */
        public r45.qk4 f123160p;

        /* renamed from: q, reason: collision with root package name */
        public long f123161q;

        /* renamed from: r, reason: collision with root package name */
        public long f123162r;

        /* renamed from: s, reason: collision with root package name */
        public long f123163s;

        /* renamed from: t, reason: collision with root package name */
        public ir2.a1 f123164t;

        /* renamed from: u, reason: collision with root package name */
        public no2.c f123165u;

        /* renamed from: v, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123166v;

        /* renamed from: w, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f123167w;

        /* renamed from: x, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource f123168x;

        /* renamed from: y, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1 f123169y;

        /* renamed from: z, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$listStatusUpdateListener$1 f123170z;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$listStatusUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1] */
        public NotifyPresenter(androidx.fragment.app.Fragment fragment, int i17, int i18, int[] msgTypes, int i19, int i27) {
            kotlin.jvm.internal.o.g(fragment, "fragment");
            kotlin.jvm.internal.o.g(msgTypes, "msgTypes");
            this.f123151d = fragment;
            this.f123152e = i17;
            this.f123153f = i18;
            this.f123154g = msgTypes;
            this.f123155h = i19;
            this.f123156i = i27;
            this.f123157m = jz5.h.b(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$userName$2(this));
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            this.f123169y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMentionUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1
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
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this, event, lcVar.f7236a, lcVar.f7237b));
                    return false;
                }
            };
            this.f123170z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$listStatusUpdateListener$1
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
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this;
                        if (notifyPresenter.f123158n) {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = notifyPresenter.f123166v;
                            if (notifyViewCallback == null) {
                                kotlin.jvm.internal.o.o("viewCallback");
                                throw null;
                            }
                            new bq.a(notifyPresenter.f123152e, notifyPresenter.f123153f, xy2.c.e(notifyViewCallback.getActivity()), true).l().K(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$insertFoldedList$1
                                @Override // gm5.a
                                public java.lang.Object call(java.lang.Object obj) {
                                    java.util.ArrayList arrayList;
                                    java.lang.Object obj2;
                                    java.lang.Object obj3;
                                    java.util.LinkedList<r45.pg2> list;
                                    com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                                    if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                                        r45.n81 n81Var = (r45.n81) fVar.f70618d;
                                        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        r45.wg2 wg2Var = (r45.wg2) n81Var.getCustom(1);
                                        cu2.a0 a0Var2 = cu2.b0.f222371a;
                                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this;
                                        if (wg2Var == null || (list = wg2Var.getList(0)) == null) {
                                            arrayList = null;
                                        } else {
                                            arrayList = new java.util.ArrayList();
                                            for (r45.pg2 pg2Var : list) {
                                                int i28 = notifyPresenter2.f123152e;
                                                kotlin.jvm.internal.o.d(pg2Var);
                                                arrayList.add(a0Var2.k(i28, pg2Var, (java.lang.String) ((jz5.n) notifyPresenter2.f123157m).getValue()));
                                            }
                                        }
                                        if (arrayList != null) {
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            java.util.Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                so2.i j17 = a0Var2.j((dm.pd) it.next());
                                                if (j17 != null) {
                                                    java.util.Iterator it6 = notifyPresenter2.c().iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = it6.next();
                                                        if (((so2.i) obj3).f410411d.field_svrMentionId == j17.f410411d.field_svrMentionId) {
                                                            break;
                                                        }
                                                    }
                                                    if (obj3 == null) {
                                                        j17.f410414g = true;
                                                    }
                                                } else {
                                                    j17 = null;
                                                }
                                                if (j17 != null) {
                                                    arrayList3.add(j17);
                                                }
                                            }
                                            arrayList2.addAll(arrayList3);
                                        }
                                        if (notifyPresenter2.f123160p != null) {
                                            java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                                            while (true) {
                                                if (!listIterator.hasPrevious()) {
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = listIterator.previous();
                                                long j18 = ((so2.i) obj2).f410411d.field_svrMentionId;
                                                r45.qk4 qk4Var = notifyPresenter2.f123160p;
                                                if (j18 > (qk4Var != null ? qk4Var.getLong(0) : 0L)) {
                                                    break;
                                                }
                                            }
                                            so2.i iVar = (so2.i) obj2;
                                            if (iVar != null) {
                                                iVar.f410412e = true;
                                            }
                                        }
                                        androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new androidx.recyclerview.widget.b0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$insertFoldedList$1$result$1
                                            @Override // androidx.recyclerview.widget.b0
                                            public boolean a(int i29, int i37) {
                                                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this;
                                                boolean z17 = ((so2.i) notifyPresenter3.c().get(i29)).f410412e;
                                                java.util.ArrayList arrayList4 = arrayList2;
                                                return z17 == ((so2.i) arrayList4.get(i37)).f410412e && ((so2.i) notifyPresenter3.c().get(i29)).f410413f == ((so2.i) arrayList4.get(i37)).f410413f;
                                            }

                                            @Override // androidx.recyclerview.widget.b0
                                            public boolean b(int i29, int i37) {
                                                return ((so2.i) com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this.c().get(i29)).f410411d.field_svrMentionId == ((so2.i) arrayList2.get(i37)).f410411d.field_svrMentionId;
                                            }

                                            @Override // androidx.recyclerview.widget.b0
                                            public int d() {
                                                return arrayList2.size();
                                            }

                                            @Override // androidx.recyclerview.widget.b0
                                            public int e() {
                                                return com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this.c().size();
                                            }
                                        }, true);
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = notifyPresenter2.f123166v;
                                        if (notifyViewCallback2 == null) {
                                            kotlin.jvm.internal.o.o("viewCallback");
                                            throw null;
                                        }
                                        final com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback2.f123205s;
                                        if (wxRecyclerAdapter != null) {
                                            notifyPresenter2.c().clear();
                                            notifyPresenter2.c().addAll(arrayList2);
                                            a17.a(new androidx.recyclerview.widget.r1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$insertFoldedList$1$1$1
                                                @Override // androidx.recyclerview.widget.r1
                                                public void a(int i29, int i37, java.lang.Object obj4) {
                                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeChanged(i29, i37, obj4);
                                                }

                                                @Override // androidx.recyclerview.widget.r1
                                                public void b(int i29, int i37) {
                                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeInserted(i29, i37);
                                                }

                                                @Override // androidx.recyclerview.widget.r1
                                                public void c(int i29, int i37) {
                                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemRangeRemoved(i29, i37);
                                                }

                                                @Override // androidx.recyclerview.widget.r1
                                                public void d(int i29, int i37) {
                                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter.this.notifyItemMoved(i29, i37);
                                                }
                                            });
                                        }
                                    }
                                    return jz5.f0.f302826a;
                                }
                            });
                        }
                    }
                    return true;
                }
            };
            this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1
                {
                    this.__eventId = 1097932050;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.md mdVar = event.f54333g;
                    java.lang.String str = mdVar != null ? mdVar.f7339c : null;
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1$callback$1(mdVar != null ? java.lang.Long.valueOf(mdVar.f7337a) : null, str, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this, mdVar != null ? java.lang.Integer.valueOf(mdVar.f7340d) : null, event));
                    return false;
                }
            };
        }

        public final java.util.ArrayList c() {
            ir2.a1 a1Var = this.f123164t;
            if (a1Var == null) {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
            java.util.List list = a1Var.f294091d;
            kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderMsg> }");
            return (java.util.ArrayList) list;
        }

        public final void f() {
            ir2.a1 a1Var = this.f123164t;
            if (a1Var != null) {
                a1Var.R6(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1(this));
            } else {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
        }

        public final void g() {
            com.tencent.mars.xlog.Log.i(B, "requestRefresh:");
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123166v;
            if (notifyViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            notifyViewCallback.s(null, 0, false);
            this.f123162r = c01.id.a();
            ir2.a1 a1Var = this.f123164t;
            if (a1Var != null) {
                pf5.e.launch$default(a1Var, null, null, new ir2.x0(a1Var, null), 3, null);
            } else {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
        }

        public final void h(so2.i msg) {
            kotlin.jvm.internal.o.g(msg, "msg");
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = this.f123167w;
            if (finderMsgOperateVM != null) {
                finderMsgOperateVM.i(msg);
            } else {
                kotlin.jvm.internal.o.o("msgOperateVM");
                throw null;
            }
        }

        @Override // fs2.a
        public void onDetach() {
            com.tencent.mars.xlog.Log.i(B, "onDetach " + this.f123152e + ' ' + this.f123153f);
            dead();
            dead();
            dead();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter;", "Lym5/l1;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class NotifyViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: t, reason: collision with root package name */
        public static final java.lang.String f123192t = "Finder.NotifyViewCallback." + new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.Companion(null).hashCode();

        /* renamed from: d, reason: collision with root package name */
        public final androidx.fragment.app.Fragment f123193d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f123194e;

        /* renamed from: f, reason: collision with root package name */
        public final int f123195f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f123196g;

        /* renamed from: h, reason: collision with root package name */
        public volatile java.lang.Runnable f123197h;

        /* renamed from: i, reason: collision with root package name */
        public final android.content.Context f123198i;

        /* renamed from: m, reason: collision with root package name */
        public final android.view.View f123199m;

        /* renamed from: n, reason: collision with root package name */
        public com.tencent.mm.ui.widget.MMProcessBar f123200n;

        /* renamed from: o, reason: collision with root package name */
        public android.widget.TextView f123201o;

        /* renamed from: p, reason: collision with root package name */
        public android.view.View f123202p;

        /* renamed from: q, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f123203q;

        /* renamed from: r, reason: collision with root package name */
        public rl5.r f123204r;

        /* renamed from: s, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123205s;

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$Companion;", "", "()V", "MENU_ID_BLOCK_MENTION", "", "MENU_ID_DEL_MENTION", "MENU_ID_SILENT_MENTION", "MENU_ID_SILENT_MENTION_RECOVER", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        public NotifyViewCallback(androidx.fragment.app.Fragment fragment, android.view.View notifyView, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter presenter, int i17) {
            java.lang.String str;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            kotlin.jvm.internal.o.g(notifyView, "notifyView");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f123193d = fragment;
            this.f123194e = presenter;
            this.f123195f = i17;
            android.content.Context context = fragment.getContext();
            this.f123198i = context;
            this.f123199m = notifyView;
            final com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) notifyView.findViewById(com.tencent.mm.R.id.m6e);
            this.f123196g = refreshLoadMoreLayout;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableRefresh(false);
                if (presenter.f123152e == 1) {
                    java.lang.String str2 = "";
                    if (context != null) {
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        str = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).w7(i17);
                    } else {
                        str = i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike";
                    }
                    r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(str, context != null ? xy2.c.e(context) : null);
                    if (b07 != null) {
                        long j17 = 1;
                        if (i17 == 0) {
                            str2 = getResources().getString(com.tencent.mm.R.string.enw, java.lang.String.valueOf(b07.f373888e));
                            kotlin.jvm.internal.o.f(str2, "getString(...)");
                        } else if (i17 == 1) {
                            str2 = getResources().getString(com.tencent.mm.R.string.enu, java.lang.String.valueOf(b07.f373888e));
                            kotlin.jvm.internal.o.f(str2, "getString(...)");
                            j17 = 2;
                        } else if (i17 == 2) {
                            str2 = getResources().getString(com.tencent.mm.R.string.env, java.lang.String.valueOf(b07.f373888e));
                            kotlin.jvm.internal.o.f(str2, "getString(...)");
                            j17 = 4;
                        }
                        if (!hc2.s.d(ya2.h.f460484a.b(xy2.c.e(getActivity())), j17)) {
                            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b3i, (android.view.ViewGroup) null);
                            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ft7)).setText(str2);
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f123196g;
                            if (refreshLoadMoreLayout2 != null) {
                                com.tencent.mm.view.HeadFooterLayout.c(refreshLoadMoreLayout2, inflate, false, 2, null);
                            }
                        }
                    }
                }
                refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
                refreshLoadMoreLayout.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)));
                refreshLoadMoreLayout.setDamping(1.85f);
                this.f123200n = (com.tencent.mm.ui.widget.MMProcessBar) notifyView.findViewById(com.tencent.mm.R.id.m6l);
                refreshLoadMoreLayout.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1
                    @Override // ym5.q3
                    public void b(int i18) {
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123194e;
                        ir2.a1 a1Var = notifyPresenter.f123164t;
                        if (a1Var != null) {
                            a1Var.S6(new ir2.u() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$loadMore$1
                                @Override // ir2.u
                                public void a(java.util.List dataList) {
                                    kotlin.jvm.internal.o.g(dataList, "dataList");
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.this;
                                    ir2.a1 a1Var2 = notifyPresenter2.f123164t;
                                    if (a1Var2 == null) {
                                        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                                        throw null;
                                    }
                                    long j18 = ((so2.i) kz5.n0.i0(a1Var2.f294091d)).f410411d.field_id;
                                    notifyPresenter2.f123163s = c01.id.a();
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, "loadMore:  lastMentionId-" + j18);
                                    com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource finderMessageDbSource = notifyPresenter2.f123168x;
                                    if (finderMessageDbSource != null) {
                                        finderMessageDbSource.f123278m = 20;
                                        finderMessageDbSource.f123277i = j18;
                                    }
                                    ir2.a1 a1Var3 = notifyPresenter2.f123164t;
                                    if (a1Var3 != null) {
                                        pf5.e.launch$default(a1Var3, null, null, new ir2.p0(a1Var3, null), 3, null);
                                    } else {
                                        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                                        throw null;
                                    }
                                }
                            });
                        } else {
                            kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                            throw null;
                        }
                    }

                    @Override // ym5.q3
                    public void c(ym5.s3 reason) {
                        kotlin.jvm.internal.o.g(reason, "reason");
                    }

                    @Override // ym5.q3
                    public void d(int i18, rn5.a aVar, boolean z17) {
                        com.tencent.mm.view.RefreshLoadMoreLayout.this.getRecyclerView().setItemAnimator(null);
                    }

                    @Override // ym5.q3
                    public void e(ym5.s3 reason) {
                        kotlin.jvm.internal.o.g(reason, "reason");
                        final com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = com.tencent.mm.view.RefreshLoadMoreLayout.this;
                        com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout3, null, 1, null);
                        refreshLoadMoreLayout3.getRecyclerView().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1$onRefreshEnd$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.view.RefreshLoadMoreLayout.this.getRecyclerView().setItemAnimator(null);
                            }
                        }, 1000L);
                    }
                });
                refreshLoadMoreLayout.setOverCallback(this);
            }
        }

        public static final so2.i l(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, androidx.recyclerview.widget.f2 f2Var, int i17) {
            notifyViewCallback.getClass();
            kotlin.jvm.internal.o.e(f2Var, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<com.tencent.mm.view.recyclerview.SimpleViewHolder>");
            int a07 = i17 - ((in5.n0) f2Var).a0();
            java.util.ArrayList c17 = notifyViewCallback.f123194e.c();
            if (a07 < 0 || a07 >= c17.size()) {
                return null;
            }
            java.lang.Object obj = c17.get(a07);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            so2.i iVar = (so2.i) obj;
            com.tencent.mars.xlog.Log.i(f123192t, "filterMention " + a07);
            return iVar;
        }

        public static final void o(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, android.content.Context context, dm.pd pdVar, int i17) {
            notifyViewCallback.getClass();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context, 14L, 1L, false, finderMsgContract.g(pdVar), i17, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, context, notifyViewCallback.f123194e.f123152e, false, null, pdVar, false, false, false, false, uc1.o.CTRL_INDEX, null), 8, null);
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f123200n;
            if (mMProcessBar == null) {
                return false;
            }
            mMProcessBar.b(i18 / ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479684cj)));
            return false;
        }

        public final void b() {
            this.f123204r = new rl5.r(getActivity());
            android.view.View view = this.f123199m;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kge);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
            this.f123203q = recyclerView;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f123198i));
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kgf);
            this.f123201o = textView;
            if (textView != null) {
                textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initView$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view2);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                        notifyViewCallback.s(null, 0, false);
                        notifyViewCallback.f123194e.g();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.f123194e.f123152e == 2) {
                        if (type == so2.c4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.y3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.o3.class.getName().hashCode()) {
                            com.tencent.mm.plugin.finder.convert.kp q17 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q();
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                            return new com.tencent.mm.plugin.finder.convert.jp(q17, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$1(notifyViewCallback), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$2(notifyViewCallback));
                        }
                        if (type == so2.d4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.pq();
                        }
                        if (type == so2.r3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.cq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.a4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.lq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.w3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.v3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.b4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.mq();
                        }
                        if (type == so2.t3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.aq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.q3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.sq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.u3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.zp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.z3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.jq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.f4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.uq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.g4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.vq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.x3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.fq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        if (type == so2.n3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.fp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q(), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$3(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this));
                        }
                        hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127951tb).getValue()).r()).intValue() == 1;
                    if (type == so2.c4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.y3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.p3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.tp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.o3.class.getName().hashCode()) {
                        if (!z17) {
                            return new com.tencent.mm.plugin.finder.convert.gp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                        }
                        com.tencent.mm.plugin.finder.convert.kp q18 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q();
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                        return new com.tencent.mm.plugin.finder.convert.jp(q18, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$4(notifyViewCallback2), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$5(notifyViewCallback2));
                    }
                    if (type == so2.d4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.pq();
                    }
                    if (type == so2.r3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.yp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.a4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.kq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.w3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.v3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.b4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.mq();
                    }
                    if (type == so2.s3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.xp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.u3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.zp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.z3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.jq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.f4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.uq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.e4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.tq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.g4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.vq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.x3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.fq(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q());
                    }
                    if (type == so2.n3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.fp(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.q(), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$6(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this));
                    }
                    hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
            }, this.f123194e.c(), true);
            this.f123205s = wxRecyclerAdapter;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f123203q;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(wxRecyclerAdapter);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f123205s;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$1
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0313  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0347  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0356  */
                    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x034a  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0315  */
                    @Override // in5.x
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void s2(androidx.recyclerview.widget.f2 r37, android.view.View r38, int r39, androidx.recyclerview.widget.k3 r40) {
                        /*
                            Method dump skipped, instructions count: 883
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$1.s2(androidx.recyclerview.widget.f2, android.view.View, int, androidx.recyclerview.widget.k3):void");
                    }
                };
            }
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$2
                    @Override // in5.y
                    public boolean c(androidx.recyclerview.widget.f2 adapter, final android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        dm.pd pdVar;
                        dm.pd pdVar2;
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view2, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                        so2.i l17 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.l(notifyViewCallback, adapter, i17);
                        java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick id:");
                        jz5.f0 f0Var = null;
                        sb6.append((l17 == null || (pdVar2 = l17.f410411d) == null) ? null : java.lang.Long.valueOf(pdVar2.field_id));
                        sb6.append(" commentId:");
                        sb6.append((l17 == null || (pdVar = l17.f410411d) == null) ? null : java.lang.Long.valueOf(pdVar.field_commentId));
                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                        if (l17 != null) {
                            final int a07 = i17 - ((in5.n0) adapter).a0();
                            rl5.r rVar = notifyViewCallback.f123204r;
                            if (rVar == null) {
                                kotlin.jvm.internal.o.o("popupMenu");
                                throw null;
                            }
                            rVar.a();
                            rl5.r rVar2 = notifyViewCallback.f123204r;
                            if (rVar2 == null) {
                                kotlin.jvm.internal.o.o("popupMenu");
                                throw null;
                            }
                            final int i18 = notifyViewCallback.f123195f;
                            final dm.pd pdVar3 = l17.f410411d;
                            rVar2.h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$1
                                @Override // android.view.View.OnCreateContextMenuListener
                                public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                    java.lang.String str2;
                                    dm.pd pdVar4 = pdVar3;
                                    android.view.View view4 = view2;
                                    if (i18 == 1) {
                                        java.lang.String str3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
                                        notifyViewCallback.getClass();
                                        r45.vg2 vg2Var = pdVar4.field_extInfo;
                                        if (vg2Var == null || (str2 = vg2Var.getString(0)) == null) {
                                            str2 = "";
                                        }
                                        if (!kotlin.jvm.internal.o.b(str2, "music")) {
                                            contextMenu.add(0, 101, 0, view4.getResources().getString(com.tencent.mm.R.string.cki));
                                        }
                                    }
                                    contextMenu.add(1, 100, 0, view4.getResources().getString(com.tencent.mm.R.string.ev_));
                                    if (pm0.v.z(pdVar4.field_extFlag, 8192)) {
                                        java.lang.String str4 = pdVar4.field_silentMentionEntityId;
                                        if (str4 == null || str4.length() == 0) {
                                            return;
                                        }
                                        int i19 = pdVar4.field_isSilentMention;
                                        if (i19 == 0) {
                                            contextMenu.add(2, 102, 0, view4.getResources().getString(com.tencent.mm.R.string.mqr));
                                        } else if (i19 == 1) {
                                            contextMenu.add(2, 103, 0, view4.getResources().getString(com.tencent.mm.R.string.mqs));
                                        }
                                    }
                                }
                            }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lr45/e11;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2$1, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123230d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123231e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123232f;

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ int f123233g;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(az2.f fVar, dm.pd pdVar, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, int i17) {
                                        super(1);
                                        this.f123230d = fVar;
                                        this.f123231e = pdVar;
                                        this.f123232f = notifyViewCallback;
                                        this.f123233g = i17;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        r45.e11 it = (r45.e11) obj;
                                        kotlin.jvm.internal.o.g(it, "it");
                                        this.f123230d.b();
                                        java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mentionId: ");
                                        dm.pd pdVar = this.f123231e;
                                        sb6.append(pdVar.field_id);
                                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                                        cu2.a0 a0Var = cu2.b0.f222371a;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123232f;
                                        a0Var.a(pdVar, notifyViewCallback.f123194e.f123152e);
                                        java.util.ArrayList c17 = notifyViewCallback.f123194e.c();
                                        int i17 = this.f123233g;
                                        c17.remove(i17);
                                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123205s;
                                        if (wxRecyclerAdapter != null) {
                                            wxRecyclerAdapter.notifyItemRemoved(i17);
                                        }
                                        db5.t7.makeText(notifyViewCallback.f123198i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erj), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2$2, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass2 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123234d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123235e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123236f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(az2.f fVar, dm.pd pdVar, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
                                        super(1);
                                        this.f123234d = fVar;
                                        this.f123235e = pdVar;
                                        this.f123236f = notifyViewCallback;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        this.f123234d.b();
                                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, "del mention network error!: " + this.f123235e.field_id);
                                        db5.t7.makeText(this.f123236f.f123198i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eri), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2$3, reason: invalid class name */
                                /* loaded from: classes5.dex */
                                final class AnonymousClass3 extends kotlin.jvm.internal.q implements yz5.a {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f123237d;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass3(az2.f fVar) {
                                        super(0);
                                        this.f123237d = fVar;
                                    }

                                    @Override // yz5.a
                                    public java.lang.Object invoke() {
                                        this.f123237d.b();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "opType", "Ljz5/f0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2$5, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass5 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123239d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123240e;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass5(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, dm.pd pdVar) {
                                        super(1);
                                        this.f123239d = notifyViewCallback;
                                        this.f123240e = pdVar;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        ((java.lang.Number) obj).intValue();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123239d;
                                        android.content.Context context = notifyViewCallback.f123198i;
                                        dm.pd pdVar = this.f123240e;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.o(notifyViewCallback, context, pdVar, 8);
                                        int i17 = 0;
                                        for (java.lang.Object obj2 : notifyViewCallback.f123194e.c()) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            so2.i iVar = (so2.i) obj2;
                                            if (kotlin.jvm.internal.o.b(iVar.f410411d.field_silentMentionEntityId, pdVar.field_silentMentionEntityId)) {
                                                iVar.f410411d.field_isSilentMention = 1;
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123205s;
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
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2$6, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass6 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123241d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f123242e;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass6(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, dm.pd pdVar) {
                                        super(1);
                                        this.f123241d = notifyViewCallback;
                                        this.f123242e = pdVar;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        ((java.lang.Number) obj).intValue();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123241d;
                                        android.content.Context context = notifyViewCallback.f123198i;
                                        dm.pd pdVar = this.f123242e;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.o(notifyViewCallback, context, pdVar, 9);
                                        int i17 = 0;
                                        for (java.lang.Object obj2 : notifyViewCallback.f123194e.c()) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            so2.i iVar = (so2.i) obj2;
                                            if (kotlin.jvm.internal.o.b(iVar.f410411d.field_silentMentionEntityId, pdVar.field_silentMentionEntityId)) {
                                                iVar.f410411d.field_isSilentMention = 0;
                                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123205s;
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
                                    ya2.r rVar3 = ya2.r.f460525a;
                                    dm.pd pdVar4 = dm.pd.this;
                                    final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = notifyViewCallback;
                                    switch (itemId) {
                                        case 100:
                                            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).rj(1, 1, pdVar4.field_type);
                                            bq.p0 p0Var = bq.q0.f23513t;
                                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = notifyViewCallback2.f123194e;
                                            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bq.p0.e(p0Var, notifyPresenter.f123152e, notifyPresenter.f123153f, xy2.c.e(notifyViewCallback2.getActivity()), false, 8, null));
                                            az2.f a17 = az2.c.a(az2.f.f16125d, notifyViewCallback2.getActivity(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f9y), 200L, null, 8, null);
                                            a17.a();
                                            i95.m c17 = i95.n0.c(cq.k.class);
                                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                                            cq.j1.e((cq.k) c17, (java.lang.String) ((jz5.n) notifyViewCallback2.f123194e.f123157m).getValue(), pdVar4.field_id, null, pdVar4.field_objectId, pdVar4.field_commentId, b17, pdVar4.field_type, pdVar4.field_svrMentionId, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.AnonymousClass1(a17, pdVar4, notifyViewCallback2, a07), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.AnonymousClass2(a17, pdVar4, notifyViewCallback2), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.AnonymousClass3(a17));
                                            return;
                                        case 101:
                                            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).rj(1, 2, pdVar4.field_type);
                                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                            hb2.y yVar = hb2.y.f280114e;
                                            long j17 = pdVar4.field_commentId;
                                            long j18 = pdVar4.field_objectId;
                                            java.lang.String field_objectNonceId = pdVar4.field_objectNonceId;
                                            kotlin.jvm.internal.o.f(field_objectNonceId, "field_objectNonceId");
                                            yVar.o(j17, j18, field_objectNonceId, true, new zy2.gc() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.4
                                                @Override // zy2.gc
                                                public void r5(java.lang.Object obj, r45.ix0 ret) {
                                                    r45.kh2 req = (r45.kh2) obj;
                                                    kotlin.jvm.internal.o.g(req, "req");
                                                    kotlin.jvm.internal.o.g(ret, "ret");
                                                    int integer = ret.getInteger(1);
                                                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                                                    if (integer == 0) {
                                                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, "MENU_ID_BLOCK_MENTION list succ");
                                                        db5.t7.makeText(notifyViewCallback3.f123198i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7g), 0).show();
                                                        return;
                                                    }
                                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, "MENU_ID_BLOCK_MENTION failed:" + ret.getInteger(1));
                                                    db5.t7.makeText(notifyViewCallback3.f123198i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7h), 0).show();
                                                }
                                            });
                                            return;
                                        case 102:
                                            if (notifyViewCallback2.f123198i != null) {
                                                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                                long j19 = pdVar4.field_svrMentionId;
                                                android.content.Context context = notifyViewCallback2.f123198i;
                                                rVar3.c(context, 1, j19, xy2.c.e(context), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.AnonymousClass5(notifyViewCallback2, pdVar4));
                                                return;
                                            }
                                            return;
                                        case 103:
                                            if (notifyViewCallback2.f123198i != null) {
                                                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                                long j27 = pdVar4.field_svrMentionId;
                                                android.content.Context context2 = notifyViewCallback2.f123198i;
                                                rVar3.c(context2, 2, j27, xy2.c.e(context2), new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2.AnonymousClass6(notifyViewCallback2, pdVar4));
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var != null) {
                            return true;
                        }
                        com.tencent.mars.xlog.Log.i(str, "onItemLongClick: null");
                        return true;
                    }
                };
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f123203q;
            if (recyclerView3 != null) {
                ym5.a1.g(recyclerView3, new ym5.m0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$reportExpose$1

                    /* renamed from: a, reason: collision with root package name */
                    public final java.util.HashSet f123243a = new java.util.HashSet();

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
                                    java.util.HashSet hashSet = this.f123243a;
                                    dm.pd pdVar = iVar.f410411d;
                                    if (!hashSet.contains(java.lang.Long.valueOf(pdVar.field_id))) {
                                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, "onChildExposeChanged:" + s0Var.getAdapterPosition());
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = notifyViewCallback.f123194e;
                                        boolean z17 = notifyPresenter.f123156i == 1;
                                        int i17 = z17 ? 16 : notifyPresenter.f123152e == 1 ? 14 : 15;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                                        finderMsgContract.getClass();
                                        int g17 = finderMsgContract.g(pdVar);
                                        hashSet.add(java.lang.Long.valueOf(pdVar.field_id));
                                        android.content.Context context = notifyViewCallback.f123198i;
                                        if (context != null) {
                                            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                                            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                                            long j17 = i17;
                                            int i18 = notifyViewCallback.f123194e.f123152e;
                                            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_contact;
                                            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                                                str = "";
                                            }
                                            com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context, j17, 2L, false, g17, 2, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, context, i18, false, str, iVar.f410411d, z17, i17 == 15, false, false, nd1.u0.CTRL_INDEX, null), 8, null);
                                        }
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
            com.tencent.mars.xlog.Log.i(f123192t, "[onOverStop]");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f123200n;
            if (mMProcessBar != null) {
                mMProcessBar.d();
            }
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            androidx.fragment.app.FragmentActivity activity = this.f123193d.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            return (com.tencent.mm.ui.MMFragmentActivity) activity;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(f123192t, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final com.tencent.mm.plugin.finder.convert.kp q() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123194e;
            return new com.tencent.mm.plugin.finder.convert.kp(notifyPresenter.f123152e, notifyPresenter.f123153f);
        }

        public final void s(java.lang.String str, int i17, boolean z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshTip$1(str, this, z17, i17));
        }
    }

    private FinderNotifyContractNew() {
    }
}
