package nr2;

/* loaded from: classes2.dex */
public final class j1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public nr2.i1 f339240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489054di3;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.Set set;
        java.util.Set set2;
        this.f339240d = new nr2.i1(getContext());
        android.app.Activity context = getContext();
        nr2.i1 i1Var = this.f339240d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        nr2.l1 l1Var = new nr2.l1(context, i1Var);
        nr2.i1 i1Var2 = this.f339240d;
        if (i1Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.do2 do2Var = new r45.do2();
        android.app.Activity activity = i1Var2.f339210a;
        com.tencent.mm.protobuf.f parseFrom = do2Var.parseFrom(activity.getIntent().getByteArrayExtra("paid_collection_info"));
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
        nr2.m mVar = new nr2.m((r45.do2) parseFrom);
        i1Var2.f339215f = mVar;
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPresenter", "collectionTopicId %s", pm0.v.u(mVar.l()));
        nr2.m mVar2 = i1Var2.f339215f;
        if ((mVar2 == null || mVar2.g()) ? false : true) {
            nr2.m mVar3 = i1Var2.f339215f;
            if (!kotlin.jvm.internal.o.b(mVar3 != null ? mVar3.o() : null, xy2.c.e(activity))) {
                pf5.z zVar = pf5.z.f353948a;
                boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
                nr2.u0 u0Var = (nr2.u0) zVar.a(appCompatActivity).e(nr2.u0.class);
                yz5.a aVar = i1Var2.f339218i;
                if (u0Var != null && (set2 = u0Var.f339319m) != null) {
                    set2.remove(aVar);
                }
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                nr2.u0 u0Var2 = (nr2.u0) zVar.a(appCompatActivity).e(nr2.u0.class);
                if (u0Var2 != null && (set = u0Var2.f339319m) != null) {
                    set.add(aVar);
                }
            }
        }
        i1Var2.f339212c = l1Var;
        android.app.Activity activity2 = l1Var.f339260a;
        android.view.View findViewById = activity2.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        l1Var.f339262c = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(activity2, null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        l1Var.d().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = activity2.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        l1Var.f339263d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        l1Var.b().setHasFixedSize(true);
        l1Var.b().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = l1Var.b().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        l1Var.b().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(activity2));
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = l1Var.b();
        nr2.i1 i1Var3 = l1Var.f339261b;
        i1Var3.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.paidcollection.FinderPaidCollectionPresenter$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.playlist.y1(false, false, true, false, 11, null);
                }
                hc2.l.a("Finder.FinderPaidCollectionPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, i1Var3.f339211b, false);
        i1Var3.f339213d = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new nr2.w0(i1Var3);
        b17.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = activity2.findViewById(com.tencent.mm.R.id.kxr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        l1Var.f339264e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity2.findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        l1Var.f339265f = findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        l1Var.f339266g = findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        l1Var.f339267h = findViewById6;
        nr2.l1 l1Var2 = i1Var2.f339212c;
        if (l1Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var2.d().setOnSimpleAction(new nr2.z0(i1Var2));
        nr2.l1 l1Var3 = i1Var2.f339212c;
        if (l1Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var3.e();
        com.tencent.mm.plugin.finder.storage.rj0 tk6 = ((c61.l7) i95.n0.c(c61.l7.class)).tk();
        nr2.m mVar4 = i1Var2.f339215f;
        long l17 = mVar4 != null ? mVar4.l() : 0L;
        tk6.getClass();
        if (l17 != 0) {
            p75.n0 n0Var = dm.e5.f236615o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.m0 i17 = dm.e5.f236618r.i(java.lang.Long.valueOf(l17));
            p75.i0 g17 = dm.e5.f236615o.g(linkedList);
            g17.f352657d = i17;
            g17.f352659f = linkedList2;
            g17.f352660g = linkedList3;
            java.util.List k17 = g17.a().k(tk6.f127496d, dm.e5.class);
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ey2.v2 v2Var = (ey2.v2) a17;
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                dm.e5 e5Var = (dm.e5) it.next();
                long j17 = e5Var.field_feedId;
                ey2.t2 t2Var = ey2.t2.f257517g;
                ey2.q2 R6 = v2Var.R6(j17, false, t2Var);
                if ((R6 != null ? R6.f257480c : 0) == 0) {
                    long j18 = e5Var.field_feedId;
                    int i18 = e5Var.field_progress;
                    int i19 = e5Var.field_maxProgress;
                    v2Var.W6(j18, 0, i18 < i19 ? i19 : i18, e5Var.field_playTimeMs, 0L, e5Var.field_speedRatio, (r28 & 64) != 0 ? 1 : 0, (r28 & 128) != 0 ? false : false, (r28 & 256) != 0 ? ey2.t2.f257523p : t2Var);
                }
                long j19 = e5Var.field_feedId;
                int i27 = e5Var.field_completePlayCnt;
                int i28 = e5Var.field_maxProgress;
                java.util.HashMap hashMap = v2Var.f257557g;
                ey2.r2 r2Var = (ey2.r2) hashMap.get(java.lang.Long.valueOf(j19));
                if (r2Var == null) {
                    hashMap.put(java.lang.Long.valueOf(j19), new ey2.r2(i27, 0, i28));
                } else {
                    if (r2Var.f257493a < i27) {
                        r2Var.f257493a = i27;
                    }
                    if (r2Var.f257495c < i28) {
                        r2Var.f257495c = i28;
                    }
                }
            }
        }
        i1Var2.c();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        nr2.i1 i1Var = this.f339240d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        kotlinx.coroutines.z0.d(i1Var.f339214e, i1Var + " onDetach", null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        nr2.i1 i1Var = this.f339240d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = i1Var.f339213d;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getData().size(), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.playlist.y1.f122497n), 1));
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
