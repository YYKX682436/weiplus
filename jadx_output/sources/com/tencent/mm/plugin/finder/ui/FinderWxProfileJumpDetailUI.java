package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxProfileJumpDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderWxProfileJumpDetailUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f128799t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f128800u = jz5.h.b(new com.tencent.mm.plugin.finder.ui.el(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f128801v = jz5.h.b(new com.tencent.mm.plugin.finder.ui.wk(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f128802w = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fl(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f128803x = jz5.h.b(new com.tencent.mm.plugin.finder.ui.dl(this));

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eeu;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getResources().getString(com.tencent.mm.R.string.nn8, (java.lang.String) ((jz5.n) this.f128801v).getValue()));
        showActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.finder.ui.xk(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById(com.tencent.mm.R.id.m6e);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.im7);
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI$onCreate$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.o3.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.sp();
                }
                hc2.l.a("FinderWxProfileJumpDetailUI", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.f128799t, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.ui.yk(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout.setLoadMoreFooter(inflate);
        refreshLoadMoreLayout.setEnableRefresh(false);
        refreshLoadMoreLayout.setEnableLoadMore(true);
        refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.finder.ui.al(this, h0Var, refreshLoadMoreLayout));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxProfileJumpDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderWxProfileJumpDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Number) ((jz5.n) this.f128802w).getValue()).intValue();
        int intValue2 = ((java.lang.Number) ((jz5.n) this.f128800u).getValue()).intValue();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String str = (java.lang.String) ((jz5.n) this.f128803x).getValue();
        kotlin.jvm.internal.o.f(str, "<get-reqUsername>(...)");
        new bq.a(intValue, intValue2, e17, str, (com.tencent.mm.protobuf.g) h0Var.f310123d).l().K(new com.tencent.mm.plugin.finder.ui.cl(h0Var, refreshLoadMoreLayout, findViewById, this));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(this);
        cy1.a aVar2 = (cy1.a) aVar.ak(this, iy1.c.FinderWxProfileJumpDetailUI);
        aVar2.dk(this, "WCFinderHistoryCommentViewController");
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        aVar2.gk(this, kz5.c1.k(lVarArr));
        aVar2.Tj(this, 12, 1, false);
    }
}
