package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusHistoryUI extends com.tencent.mm.ui.MMFragment implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f173632d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173633e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f173634f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public bk4.d f173635g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173636h;

    /* renamed from: i, reason: collision with root package name */
    public long f173637i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173638m;

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View v17) {
        pj4.p0 p0Var;
        kotlin.jvm.internal.o.g(v17, "v");
        super.dealContentView(v17);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(activity, new o04.e(pj4.p0.class, 9, true));
            pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity, 9, pj4.p0.class);
            if (p0Var2 != null) {
                try {
                    p0Var = (pj4.p0) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(9, "TextStatusCardExposed");
                } catch (java.lang.Throwable unused) {
                    p0Var = null;
                }
                p0Var2.f355236d = p0Var != null ? p0Var.f355236d : null;
            }
        }
        android.view.View findViewById = v17.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f173633e = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f173633e;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView.setLayoutManager(linearLayoutManager);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.textstatus.convert.album.g();
            }
        }, this.f173634f, true);
        wxRecyclerAdapter.F = new com.tencent.mm.plugin.textstatus.ui.ic(wxRecyclerAdapter, this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f173633e;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f173633e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView3.setOverScrollMode(2);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f173633e;
        if (wxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView4.i(new com.tencent.mm.plugin.textstatus.ui.jc(linearLayoutManager, this));
        android.view.View findViewById2 = v17.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        this.f173632d = refreshLoadMoreLayout;
        refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.textstatus.ui.nc(this, wxRecyclerAdapter));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f173632d;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        this.f173635g = new bk4.d(wxRecyclerAdapter, refreshLoadMoreLayout2, getContext());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "init OK");
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.czn;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f489984hg);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("KEY_TITLE", r17)) != null) {
            r17 = string;
        }
        setMMTitle(r17);
        setBackBtn(new com.tencent.mm.plugin.textstatus.ui.hc(this));
        gm0.j1.d().a(5967, this);
        this.f173637i = c01.id.c();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        qj4.s.p(qj4.s.f363958a, 3L, c01.id.c() - this.f173637i, null, 4, null);
        bk4.d dVar = this.f173635g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        dVar.f21441a.getData().clear();
        bk4.d dVar2 = this.f173635g;
        if (dVar2 == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().q(4245, dVar2.f21449i);
        bk4.d.f21437m.clear();
        bk4.d.f21438n.clear();
        gm0.j1.d().q(5967, this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f173635g == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = bk4.d.f21435k;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        bk4.d.f21435k = null;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        mj4.h M;
        super.onResume();
        bk4.b bVar = bk4.d.f21434j;
        java.util.ArrayList arrayList = bk4.d.f21437m;
        if (!(!arrayList.isEmpty()) || (M = ai4.m0.f5173a.M(en1.a.a())) == null || kotlin.jvm.internal.o.b(((mj4.k) M).l(), ((pj4.n1) kz5.n0.X(arrayList)).f355199d)) {
            return;
        }
        bk4.d dVar = this.f173635g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        dVar.f21447g = true;
        dVar.f21446f = null;
        arrayList.clear();
        dVar.f21441a.getData().clear();
        bk4.d dVar2 = this.f173635g;
        if (dVar2 != null) {
            dVar2.b();
        } else {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        if ((m1Var instanceof ej4.a) && i17 == 0 && i18 == 0) {
            ej4.a aVar = (ej4.a) m1Var;
            if (aVar.f253321e == 2) {
                java.util.Iterator it = this.f173634f.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    in5.c cVar = (in5.c) next;
                    if (cVar instanceof fj4.d) {
                        fj4.d dVar = (fj4.d) cVar;
                        java.util.Iterator it6 = dVar.f263236f.iterator();
                        int size = dVar.f263236f.size();
                        int i19 = 0;
                        while (true) {
                            boolean hasNext = it6.hasNext();
                            str2 = aVar.f253320d;
                            if (!hasNext) {
                                break;
                            }
                            pj4.n1 n1Var = (pj4.n1) it6.next();
                            if (kotlin.jvm.internal.o.b(n1Var.f355199d, str2)) {
                                dVar.f263236f.remove(n1Var);
                                if (dVar.f263236f.isEmpty()) {
                                    it.remove();
                                } else if (i19 == 0 || i19 == size - 1) {
                                    java.util.List<pj4.n1> list = dVar.f263236f;
                                    java.util.LinkedList linkedList = new java.util.LinkedList();
                                    if (list == null || list.isEmpty()) {
                                        str3 = str2;
                                    } else {
                                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                                        int i27 = -1;
                                        for (pj4.n1 n1Var2 : list) {
                                            java.lang.String str4 = str2;
                                            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
                                            java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(((mj4.k) fj4.b.a(n1Var2)).f327067b.field_CreateTime * 1000)));
                                            java.util.Calendar calendar = java.util.Calendar.getInstance();
                                            calendar.setTime(parse);
                                            int i28 = calendar.get(5);
                                            if (i28 != i27) {
                                                if (!linkedList2.isEmpty()) {
                                                    linkedList.add(new fj4.c(linkedList2));
                                                }
                                                linkedList2 = new java.util.LinkedList();
                                                linkedList2.add(n1Var2);
                                                i27 = i28;
                                            } else {
                                                linkedList2.add(n1Var2);
                                            }
                                            str2 = str4;
                                        }
                                        str3 = str2;
                                        if (!linkedList2.isEmpty()) {
                                            linkedList.add(new fj4.c(linkedList2));
                                        }
                                    }
                                    dVar.f263237g = dVar.a(dVar.a(linkedList));
                                }
                            } else {
                                i19++;
                            }
                        }
                        str3 = str2;
                        java.util.Iterator it7 = dVar.f263237g.iterator();
                        while (it7.hasNext()) {
                            fj4.c cVar2 = (fj4.c) it7.next();
                            java.util.List list2 = cVar2.f263227d;
                            if (!(list2 == null || list2.isEmpty())) {
                                java.util.List list3 = cVar2.f263227d;
                                kotlin.jvm.internal.o.d(list3);
                                java.util.Iterator it8 = list3.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        pj4.n1 n1Var3 = (pj4.n1) it8.next();
                                        java.lang.String str5 = str3;
                                        if (kotlin.jvm.internal.o.b(n1Var3.f355199d, str5)) {
                                            list3.remove(n1Var3);
                                            cVar2.f263228e = new java.util.LinkedList();
                                            cVar2.f263229f = new java.util.LinkedList();
                                            cVar2.f263231h = new java.util.LinkedList();
                                            cVar2.f263232i = 0L;
                                            cVar2.f263233m = new java.util.LinkedList();
                                            cVar2.a();
                                            str3 = str5;
                                            break;
                                        }
                                        str3 = str5;
                                    }
                                }
                            }
                        }
                        java.lang.String statusId = str3;
                        bk4.b bVar = bk4.d.f21434j;
                        kotlin.jvm.internal.o.g(statusId, "statusId");
                        java.util.Iterator it9 = bk4.d.f21437m.iterator();
                        kotlin.jvm.internal.o.f(it9, "iterator(...)");
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it9.next();
                            kotlin.jvm.internal.o.f(next2, "next(...)");
                            if (kotlin.jvm.internal.o.b(((pj4.n1) next2).f355199d, statusId)) {
                                it9.remove();
                                break;
                            }
                        }
                        java.util.Iterator it10 = bk4.d.f21438n.entrySet().iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                java.lang.Object next3 = it10.next();
                                kotlin.jvm.internal.o.f(next3, "next(...)");
                                if (kotlin.jvm.internal.o.b(((pj4.n1) ((java.util.Map.Entry) next3).getValue()).f355199d, statusId)) {
                                    it10.remove();
                                    break;
                                }
                            }
                        }
                    }
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f173633e;
                if (wxRecyclerView == null) {
                    kotlin.jvm.internal.o.o("rvSelfHistory");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onVisibilityChanged(boolean z17) {
        super.onVisibilityChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "[onVisibilityChanged]" + z17 + ' ' + this.f173638m);
        if (!z17 || this.f173638m) {
            return;
        }
        bk4.d dVar = this.f173635g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        dVar.b();
        this.f173638m = true;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        if (z17) {
            qj4.s.p(qj4.s.f363958a, 1L, 0L, null, 6, null);
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ui();
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ri();
        } else {
            java.util.Stack stack = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).f363960e;
            if (!stack.empty()) {
                stack.pop();
            }
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
