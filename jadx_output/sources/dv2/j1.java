package dv2;

/* loaded from: classes2.dex */
public final class j1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f243874d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f243875e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f243876f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f243877g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f243878h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f243879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f243874d = kotlinx.coroutines.z0.a(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f243877g = new java.util.ArrayList();
        this.f243878h = new java.util.ArrayList();
    }

    public static final com.tencent.mm.plugin.finder.viewmodel.component.h00 O6(dv2.j1 j1Var) {
        androidx.appcompat.app.AppCompatActivity activity = j1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.h00.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.h00) a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489080ee1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484949tu4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f243875e = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484948tu2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f243876f = (android.widget.TextView) findViewById2;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f243875e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.uic.FinderRecentAuthorListUIC$onCreate$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.al(dv2.i.f243866f);
            }
        }, this.f243877g, true);
        this.f243879i = wxRecyclerAdapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f243875e;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f243879i;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293105o = new dv2.f1(this);
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293104n = new dv2.g1(this);
        kotlinx.coroutines.l.d(this.f243874d, null, null, new dv2.i1(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.z0.e(this.f243874d, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f243874d = kotlinx.coroutines.z0.a(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f243877g = new java.util.ArrayList();
        this.f243878h = new java.util.ArrayList();
    }
}
