package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StatusAlbumUI extends com.tencent.mm.ui.MMFragment implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f173463d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173464e;

    /* renamed from: g, reason: collision with root package name */
    public bk4.d f173466g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f173468i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f173469m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f173465f = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f173470n = new com.tencent.mm.plugin.textstatus.ui.b3(this);

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
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.f173464e = wxRecyclerView;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 0 ? new com.tencent.mm.plugin.textstatus.convert.album.a(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI.this.f173470n) : new com.tencent.mm.plugin.textstatus.convert.album.a(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI.this.f173470n);
            }
        }, this.f173465f, true);
        wxRecyclerAdapter.F = new com.tencent.mm.plugin.textstatus.ui.u2(wxRecyclerAdapter, this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f173464e;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f173464e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        wxRecyclerView3.N(new com.tencent.mm.plugin.textstatus.ui.v2(this));
        android.view.View findViewById2 = v17.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        this.f173463d = refreshLoadMoreLayout;
        refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.textstatus.ui.y2(this, wxRecyclerAdapter));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f173463d;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        this.f173466g = new bk4.d(wxRecyclerAdapter, refreshLoadMoreLayout2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "init OK");
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.d09;
    }

    public final void l0() {
        fj4.a aVar;
        mj4.h hVar;
        java.util.Iterator it = this.f173465f.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof fj4.a) && (hVar = (aVar = (fj4.a) cVar).f263224e) != null) {
                long j17 = ((mj4.k) hVar).f327067b.field_CreateTime * 1000;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
                java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(j17)));
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(parse);
                int i19 = calendar.get(1);
                int i27 = calendar.get(5);
                if (i19 != i17) {
                    aVar.f263225f = android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jxl), j17).toString();
                    i17 = i19;
                } else {
                    aVar.f263225f = "";
                }
                if (i27 != i18) {
                    aVar.f263226g = android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jwc), j17).toString();
                    i18 = i27;
                } else {
                    aVar.f263226g = "";
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f489984hg);
        setBackBtn(new com.tencent.mm.plugin.textstatus.ui.t2(this));
        gm0.j1.d().a(5967, this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        bk4.d dVar = this.f173466g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().q(4245, dVar.f21449i);
        gm0.j1.d().q(5967, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        if (m1Var instanceof ej4.a) {
            if (i17 == 0 && i18 == 0) {
                z17 = true;
            } else {
                android.app.Activity context = getContext();
                if (context != null) {
                    db5.e1.s(context, context.getString(com.tencent.mm.R.string.f493360jv3), "");
                }
                z17 = false;
            }
            if (z17) {
                java.util.ArrayList arrayList = this.f173465f;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    in5.c cVar = (in5.c) it.next();
                    if (cVar instanceof fj4.a) {
                        mj4.h hVar = ((fj4.a) cVar).f263224e;
                        if (kotlin.jvm.internal.o.b(hVar != null ? ((mj4.k) hVar).l() : null, ((ej4.a) m1Var).f253320d)) {
                            arrayList.remove(cVar);
                            break;
                        }
                    }
                }
                l0();
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f173464e;
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
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f173469m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onVisibilityChanged(boolean z17) {
        super.onVisibilityChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "[onVisibilityChanged]" + z17 + ' ' + this.f173468i);
        if (!z17 || this.f173468i) {
            return;
        }
        bk4.d dVar = this.f173466g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().g(new ej4.f(dVar.f21446f, null, null, null, null, 30, null));
        this.f173468i = true;
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
