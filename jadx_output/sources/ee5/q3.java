package ee5;

/* loaded from: classes9.dex */
public final class q3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f252006d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f252007e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f252008f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f252009g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f252010h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f252011i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f252012m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f252013n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f252014o;

    /* renamed from: p, reason: collision with root package name */
    public int f252015p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f252016q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f252017r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f252018s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f252019t;

    /* renamed from: u, reason: collision with root package name */
    public int f252020u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f252021v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f252022w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f252023x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f252006d = jz5.h.b(new ee5.i3(this));
        this.f252007e = jz5.h.b(new ee5.h3(this));
        this.f252008f = jz5.h.b(new ee5.p3(this));
        this.f252009g = new java.util.ArrayList();
        fn5.o0 o0Var = fn5.o0.f264743d;
        this.f252016q = true;
        this.f252017r = true;
        aq.c cVar = aq.c.f12842d;
    }

    public final com.google.android.material.tabs.TabLayout O6() {
        java.lang.Object value = ((jz5.n) this.f252007e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.google.android.material.tabs.TabLayout) value;
    }

    public final androidx.viewpager.widget.ViewPager P6() {
        java.lang.Object value = ((jz5.n) this.f252008f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.viewpager.widget.ViewPager) value;
    }

    public final void Q6() {
        if (this.f252022w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "initTabView is init");
            return;
        }
        this.f252022w = true;
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcu, (android.view.ViewGroup) null);
        this.f252010h = inflate;
        this.f252011i = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ggd) : null;
        android.view.View view = this.f252010h;
        this.f252013n = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ggc) : null;
        android.view.View view2 = this.f252010h;
        this.f252012m = view2 != null ? (android.widget.ProgressBar) view2.findViewById(com.tencent.mm.R.id.ggb) : null;
        android.view.View view3 = this.f252010h;
        this.f252014o = view3 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view3.findViewById(com.tencent.mm.R.id.gga) : null;
        R6();
    }

    public final void R6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((ee5.z) pf5.z.f353948a.a(activity).a(ee5.z.class)).f252103m.observe(getActivity(), new ee5.o3(this));
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress");
        if (!this.f252022w) {
            Q6();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress >> is no init");
        }
        android.widget.ProgressBar progressBar = this.f252012m;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        R6();
    }

    public final void T6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "setTabViewVisible >> " + i17);
        java.lang.Object value = ((jz5.n) this.f252006d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        this.f252016q = ((ee5.z) zVar.a(activity).a(ee5.z.class)).S6();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        this.f252017r = ((ee5.z) zVar.a(activity2).a(ee5.z.class)).T6();
        this.f252018s = j62.e.g().l("clicfg_android_enable_emoji_vertical_search_and_full_search", false, true, true);
        com.google.android.material.tabs.TabLayout O6 = O6();
        oa.i l17 = O6().l();
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.fgy));
        l17.f343783f = inflate;
        l17.f();
        O6.b(l17);
        if (this.f252016q) {
            Q6();
            com.google.android.material.tabs.TabLayout O62 = O6();
            oa.i l18 = O6().l();
            l18.f343783f = this.f252010h;
            l18.f();
            O62.b(l18);
        }
        com.google.android.material.tabs.TabLayout O63 = O6();
        oa.i l19 = O6().l();
        android.view.View inflate2 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.ice));
        l19.f343783f = inflate2;
        l19.f();
        O63.b(l19);
        com.google.android.material.tabs.TabLayout O64 = O6();
        oa.i l27 = O6().l();
        android.view.View inflate3 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.ick));
        l27.f343783f = inflate3;
        l27.f();
        O64.b(l27);
        com.google.android.material.tabs.TabLayout O65 = O6();
        oa.i l28 = O6().l();
        android.view.View inflate4 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.ici));
        l28.f343783f = inflate4;
        l28.f();
        O65.b(l28);
        com.google.android.material.tabs.TabLayout O66 = O6();
        oa.i l29 = O6().l();
        android.view.View inflate5 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate5.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.icj));
        l29.f343783f = inflate5;
        l29.f();
        O66.b(l29);
        com.google.android.material.tabs.TabLayout O67 = O6();
        oa.i l37 = O6().l();
        android.view.View inflate6 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate6.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.icc));
        l37.f343783f = inflate6;
        l37.f();
        O67.b(l37);
        com.google.android.material.tabs.TabLayout O68 = O6();
        oa.i l38 = O6().l();
        android.view.View inflate7 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate7.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.icf));
        l38.f343783f = inflate7;
        l38.f();
        O68.b(l38);
        com.google.android.material.tabs.TabLayout O69 = O6();
        oa.i l39 = O6().l();
        android.view.View inflate8 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate8.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.p7h));
        l39.f343783f = inflate8;
        l39.f();
        O69.b(l39);
        com.google.android.material.tabs.TabLayout O610 = O6();
        oa.i l47 = O6().l();
        android.view.View inflate9 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate9.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.p7f));
        l47.f343783f = inflate9;
        l47.f();
        O610.b(l47);
        com.google.android.material.tabs.TabLayout O611 = O6();
        oa.i l48 = O6().l();
        android.view.View inflate10 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate10.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.p7g));
        l48.f343783f = inflate10;
        l48.f();
        O611.b(l48);
        com.google.android.material.tabs.TabLayout O612 = O6();
        oa.i l49 = O6().l();
        android.view.View inflate11 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate11.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.oga));
        l49.f343783f = inflate11;
        l49.f();
        O612.b(l49);
        com.google.android.material.tabs.TabLayout O613 = O6();
        oa.i l57 = O6().l();
        android.view.View inflate12 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate12.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.og_));
        l57.f343783f = inflate12;
        l57.f();
        O613.b(l57);
        if (this.f252018s) {
            com.google.android.material.tabs.TabLayout O614 = O6();
            oa.i l58 = O6().l();
            android.view.View inflate13 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.bcv, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate13.findViewById(com.tencent.mm.R.id.ggd)).setText(getString(com.tencent.mm.R.string.p7e));
            l58.f343783f = inflate13;
            l58.f();
            O614.b(l58);
        }
        java.util.ArrayList arrayList = this.f252009g;
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment());
        if (this.f252016q) {
            arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment());
        }
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(1));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(2));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(3));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(4));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(5));
        java.lang.String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((com.tencent.mm.plugin.finder.service.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = new com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment(stringExtra);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        ee5.y0 y0Var = (ee5.y0) zVar.a(activity3).a(ee5.y0.class);
        y0Var.getClass();
        y0Var.f252093r = finderConvSearchFeedFragment;
        arrayList.add(finderConvSearchFeedFragment);
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(8));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(9));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(10));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(6));
        arrayList.add(new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment(7));
        if (this.f252018s) {
            com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = new com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment(stringExtra, false);
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            ee5.q0 q0Var = (ee5.q0) zVar.a(activity4).a(ee5.q0.class);
            q0Var.getClass();
            q0Var.f252001r = emojiHistoryListFragment;
            arrayList.add(emojiHistoryListFragment);
        }
        androidx.viewpager.widget.ViewPager P6 = P6();
        androidx.fragment.app.FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        P6.setAdapter(new zd5.o(supportFragmentManager, arrayList));
        P6().addOnPageChangeListener(new oa.j(O6()));
        P6().setCurrentItem(this.f252015p);
        O6().setOnTabSelectedListener(new ee5.j3(this));
    }
}
