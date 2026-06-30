package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/gc;", "Lr45/kh2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderFansListUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements zy2.gc {
    public static final /* synthetic */ int D = 0;
    public com.tencent.mm.plugin.finder.view.e3 B;
    public final com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1 C;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ListView f128566t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f128567u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f128570x;

    /* renamed from: y, reason: collision with root package name */
    public rl5.r f128571y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f128572z;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.e f128568v = new com.tencent.mm.plugin.finder.ui.e(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f128569w = new java.util.ArrayList();
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.ui.o5(this));

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1] */
    public FinderFansListUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1
            {
                this.__eventId = 2076502958;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent finderAddUserToBlackListEvent) {
                com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent event = finderAddUserToBlackListEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ma maVar = event.f54256g;
                if (maVar == null) {
                    return true;
                }
                java.lang.String fansId = maVar.f7331a;
                kotlin.jvm.internal.o.f(fansId, "fansId");
                int i17 = maVar.f7332b;
                int i18 = com.tencent.mm.plugin.finder.ui.FinderFansListUI.D;
                com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = com.tencent.mm.plugin.finder.ui.FinderFansListUI.this;
                finderFansListUI.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.w5(i17, finderFansListUI, fansId));
                return true;
            }
        };
    }

    public static final void c7(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        android.widget.ListView listView = finderFansListUI.f128566t;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        if (listView.getFooterViewsCount() == 0) {
            android.widget.ListView listView2 = finderFansListUI.f128566t;
            if (listView2 != null) {
                listView2.addFooterView(android.view.View.inflate(finderFansListUI.getContext(), com.tencent.mm.R.layout.agu, null));
            } else {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
        }
    }

    public final void d7() {
        com.tencent.mm.protobuf.g gVar = this.f128572z;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.protobuf.g gVar2 = this.f128572z;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        new bq.h0(gVar2, 0L, 0, xy2.c.d(context)).l().q(new cq.f0(new com.tencent.mm.plugin.finder.ui.n5(this, gVar), null));
    }

    public final void e7() {
        g92.b bVar = g92.b.f269769e;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
        int integer = j37 != null ? j37.u0().getInteger(20) : 0;
        if (integer == 0) {
            integer = getIntent().getIntExtra("fans_count", 0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFansListUI", "update title %s", java.lang.Integer.valueOf(integer));
        setMMTitle(getString(com.tencent.mm.R.string.eqo, java.lang.Integer.valueOf(integer)));
        if (integer != 0) {
            android.widget.TextView textView = this.f128567u;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(8);
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_search, new com.tencent.mm.plugin.finder.ui.b6(this));
            return;
        }
        android.widget.TextView textView2 = this.f128567u;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f128567u;
        if (textView3 != null) {
            textView3.setText(getString(com.tencent.mm.R.string.cug));
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
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128566t = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128567u = (android.widget.TextView) findViewById2;
        e7();
        setBackBtn(new com.tencent.mm.plugin.finder.ui.p5(this));
        this.f128571y = new rl5.r(this);
        android.widget.ListView listView = this.f128566t;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.e eVar = this.f128568v;
        listView.setAdapter((android.widget.ListAdapter) eVar);
        android.widget.ListView listView2 = this.f128566t;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setSelector(new android.graphics.drawable.ColorDrawable(0));
        android.widget.ListView listView3 = this.f128566t;
        if (listView3 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView3.setOnScrollListener(new com.tencent.mm.plugin.finder.ui.q5(this));
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue() > 0) {
            eVar.f129085h = new com.tencent.mm.plugin.finder.ui.s5(this);
        }
        eVar.f129084g = new com.tencent.mm.plugin.finder.ui.t5(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        pm0.v.T(pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.ui.u5(this)), new com.tencent.mm.plugin.finder.ui.v5(this));
        d7();
        alive();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFansListUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dead();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        java.lang.String string = req.getString(4);
        if (string == null) {
            string = "";
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.w5(ret.getInteger(1), this, string));
    }
}
