package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlackListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/gc;", "Lr45/kh2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderBlackListUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements zy2.gc {
    public static final /* synthetic */ int D = 0;
    public android.view.View A;
    public android.view.View B;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ListView f128514t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f128515u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f128518x;

    /* renamed from: y, reason: collision with root package name */
    public rl5.r f128519y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f128520z;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.e f128516v = new com.tencent.mm.plugin.finder.ui.e(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f128517w = new java.util.ArrayList();
    public final java.lang.Runnable C = new com.tencent.mm.plugin.finder.ui.d1(this);

    public final void c7() {
        android.view.View view = this.A;
        if (view != null) {
            view.removeCallbacks(this.C);
        }
        android.view.View view2 = this.A;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d7() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.protobuf.g gVar = this.f128520z;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        new bq.c0(gVar, xy2.c.d(context)).l().q(new cq.d0(new com.tencent.mm.plugin.finder.ui.f1(this), new com.tencent.mm.plugin.finder.ui.h1(this)));
    }

    public final void e7() {
        c7();
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f128517w.isEmpty()) {
            android.widget.TextView textView = this.f128515u;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.f128515u;
            if (textView2 != null) {
                textView2.setText(getString(com.tencent.mm.R.string.cmk));
                return;
            } else {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.ListView listView = this.f128514t;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView.setVisibility(0);
        android.widget.TextView textView3 = this.f128515u;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afn;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.eqn));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128514t = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128515u = (android.widget.TextView) findViewById2;
        setBackBtn(new com.tencent.mm.plugin.finder.ui.i1(this));
        this.f128519y = new rl5.r(this);
        android.widget.ListView listView = this.f128514t;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.e eVar = this.f128516v;
        listView.setAdapter((android.widget.ListAdapter) eVar);
        android.widget.ListView listView2 = this.f128514t;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setOnScrollListener(new com.tencent.mm.plugin.finder.ui.j1(this));
        eVar.f129084g = new com.tencent.mm.plugin.finder.ui.k1(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.oai);
        this.A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.postDelayed(this.C, 400L);
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.oav);
        this.B = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.l1(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        d7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.m1(ret, this, req));
    }
}
