package ib2;

/* loaded from: classes2.dex */
public final class j0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ib2.i0 f290128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e5w;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f290128d = new ib2.i0(getContext());
        android.app.Activity context = getContext();
        ib2.i0 i0Var = this.f290128d;
        if (i0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ib2.l0 l0Var = new ib2.l0(context, i0Var);
        ib2.i0 i0Var2 = this.f290128d;
        if (i0Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.vx0 vx0Var = new r45.vx0();
        android.app.Activity activity = i0Var2.f290119a;
        com.tencent.mm.protobuf.f parseFrom = vx0Var.parseFrom(activity.getIntent().getByteArrayExtra("collection_info"));
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCollectionInfo");
        i0Var2.f290124f = (r45.vx0) parseFrom;
        activity.getIntent().getStringExtra("collection_author_username");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.vx0 vx0Var2 = i0Var2.f290124f;
        objArr[0] = pm0.v.u(vx0Var2 != null ? vx0Var2.getLong(0) : 0L);
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionPresenter", "collectionTopicId %s", objArr);
        i0Var2.f290121c = l0Var;
        android.app.Activity activity2 = l0Var.f290133a;
        android.view.View findViewById = activity2.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        l0Var.f290135c = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(activity2, null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        l0Var.d().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = activity2.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        l0Var.f290136d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        l0Var.b().setHasFixedSize(true);
        l0Var.b().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = l0Var.b().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        l0Var.b().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(activity2));
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = l0Var.b();
        ib2.i0 i0Var3 = l0Var.f290134b;
        i0Var3.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.collection.FinderCollectionPresenter$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.playlist.y1(false, false, true, false, 11, null);
                }
                hc2.l.a("Finder.FinderPaidCollectionPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, i0Var3.f290120b, false);
        i0Var3.f290122d = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new ib2.y(i0Var3);
        b17.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = activity2.findViewById(com.tencent.mm.R.id.svu);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        l0Var.f290137e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity2.findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        l0Var.f290138f = findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        l0Var.f290139g = findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        l0Var.f290140h = findViewById6;
        ib2.l0 l0Var2 = i0Var2.f290121c;
        if (l0Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l0Var2.d().setOnSimpleAction(new ib2.z(i0Var2));
        ib2.l0 l0Var3 = i0Var2.f290121c;
        if (l0Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l0Var3.e();
        i0Var2.c();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ib2.i0 i0Var = this.f290128d;
        if (i0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        kotlinx.coroutines.z0.d(i0Var.f290123e, i0Var + " onDetach", null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ib2.i0 i0Var = this.f290128d;
        if (i0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = i0Var.f290122d;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getData().size(), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.playlist.y1.f122497n), 1));
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
