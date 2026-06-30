package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class n0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f135226s = new com.tencent.mm.sdk.platformtools.r2(6);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f135227d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135228e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135229f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135230g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f135231h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f135232i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f135233m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f135234n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f135235o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f135236p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderDataLoader f135237q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f135238r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135227d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.m0(this));
        this.f135228e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.k0(this));
        this.f135229f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.y(this));
        this.f135230g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.i0(this));
        this.f135231h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.v(this));
        this.f135232i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.j0(this));
        this.f135233m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.w(this));
        this.f135234n = new java.util.ArrayList();
        this.f135235o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.x(this));
        this.f135236p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.l0(this));
        this.f135237q = new com.tencent.mm.plugin.finder.feed.model.FinderDataLoader(null, 1, null);
    }

    public static final vb2.b O6(com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var) {
        return (vb2.b) ((jz5.n) n0Var.f135227d).getValue();
    }

    public final java.lang.String P6() {
        return (java.lang.String) ((jz5.n) this.f135235o).getValue();
    }

    public final int Q6() {
        return ((java.lang.Number) ((jz5.n) this.f135236p).getValue()).intValue();
    }

    public final void R6(boolean z17, boolean z18, boolean z19) {
        jz5.g gVar = this.f135233m;
        jz5.g gVar2 = this.f135229f;
        jz5.g gVar3 = this.f135232i;
        jz5.g gVar4 = this.f135231h;
        if (z19) {
            ((android.widget.FrameLayout) ((jz5.n) gVar4).getValue()).setVisibility(0);
            getRlLayout().setVisibility(8);
            ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setVisibility(8);
            ((android.widget.ProgressBar) ((jz5.n) gVar2).getValue()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(8);
            return;
        }
        if (!z17) {
            ((android.widget.FrameLayout) ((jz5.n) gVar4).getValue()).setVisibility(0);
            getRlLayout().setVisibility(8);
            ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setVisibility(0);
            ((android.widget.ProgressBar) ((jz5.n) gVar2).getValue()).setVisibility(8);
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(8);
            return;
        }
        ((android.widget.FrameLayout) ((jz5.n) gVar4).getValue()).setVisibility(8);
        getRlLayout().setVisibility(0);
        if (z18) {
            return;
        }
        ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setVisibility(8);
        ((android.widget.ProgressBar) ((jz5.n) gVar2).getValue()).setVisibility(8);
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.add;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f135228e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        getContext().finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        android.view.View findViewById;
        android.view.View view2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.view.View view3;
        android.view.View findViewById2;
        android.view.View view4;
        android.widget.TextView textView;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle(Q6() == 2 ? com.tencent.mm.R.string.cht : com.tencent.mm.R.string.chu);
            mMActivity.setBackBtn(new com.tencent.mm.plugin.finder.viewmodel.component.z(this));
            mMActivity.hideActionbarLine();
        }
        java.lang.String P6 = P6();
        kotlin.jvm.internal.o.f(P6, "<get-finderUsername>(...)");
        if (P6.length() == 0) {
            com.tencent.mars.xlog.Log.e("Finder.AccountRecommendListUIC", "finderUsername is null");
            getContext().finish();
            return;
        }
        jz5.g gVar = this.f135230g;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        java.util.List list = (java.util.List) f135226s.get(P6());
        java.util.ArrayList arrayList = this.f135234n;
        if (list != null) {
            java.util.List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$onCreate$adapter$1
            @Override // in5.s
            public com.tencent.mm.plugin.finder.viewmodel.component.s getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.viewmodel.component.s();
            }
        }, arrayList, false);
        if (!arrayList.isEmpty()) {
            wxRecyclerAdapter.notifyDataSetChanged();
            R6(true, true, false);
        } else {
            R6(false, false, true);
        }
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setAdapter(wxRecyclerAdapter);
        on5.c loadMoreFooter = getRlLayout().getLoadMoreFooter();
        if (loadMoreFooter != null && (view4 = loadMoreFooter.getView()) != null && (textView = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
        on5.c loadMoreFooter2 = getRlLayout().getLoadMoreFooter();
        if (loadMoreFooter2 != null && (view3 = loadMoreFooter2.getView()) != null && (findViewById2 = view3.findViewById(com.tencent.mm.R.id.i0a)) != null) {
            findViewById2.setBackgroundColor(findViewById2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
        on5.c loadMoreFooter3 = getRlLayout().getLoadMoreFooter();
        if (loadMoreFooter3 != null && (view2 = loadMoreFooter3.getView()) != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.bdv)) != null) {
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
        on5.c loadMoreFooter4 = getRlLayout().getLoadMoreFooter();
        if (loadMoreFooter4 != null && (view = loadMoreFooter4.getView()) != null && (findViewById = view.findViewById(com.tencent.mm.R.id.m3v)) != null) {
            findViewById.setBackgroundColor(findViewById.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = getRlLayout();
        mn5.a aVar = new mn5.a();
        aVar.f330191a = 0.5f;
        aVar.f330192b = 300;
        aVar.f330193c = true;
        aVar.f330195e = true;
        aVar.f330196f = true;
        aVar.f330197g = true;
        aVar.f330198h = true;
        aVar.f330199i = false;
        aVar.f330200j = true;
        aVar.f330201k = true;
        aVar.f330202l = false;
        aVar.f330203m = false;
        aVar.f330204n = false;
        aVar.f330205o = true;
        aVar.f330206p = false;
        aVar.f330207q = false;
        rlLayout.setCommonConfig(aVar);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.h0(this));
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.viewmodel.component.a0(this);
        qn5.c cVar = getRlLayout().onSimpleAction;
        if (cVar != null) {
            cVar.a(false);
        }
    }
}
