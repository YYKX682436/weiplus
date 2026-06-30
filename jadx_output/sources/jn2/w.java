package jn2;

/* loaded from: classes5.dex */
public final class w implements android.view.View.OnClickListener {
    public boolean A;
    public com.tencent.mm.protobuf.g B;
    public int C;
    public java.lang.String D;
    public final java.util.Set E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f300720d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f300721e;

    /* renamed from: f, reason: collision with root package name */
    public final sf2.x f300722f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f300723g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f300724h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f300725i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f300726m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f300727n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f300728o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f300729p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f300730q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f300731r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f300732s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f300733t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f300734u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f300735v;

    /* renamed from: w, reason: collision with root package name */
    public jn2.z f300736w;

    /* renamed from: x, reason: collision with root package name */
    public jn2.c1 f300737x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f300738y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f300739z;

    public w(android.view.View root, kotlinx.coroutines.y0 y0Var, sf2.x controller, gk2.e liveData, yz5.a onShowSearch, yz5.a onEndSearch) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(onShowSearch, "onShowSearch");
        kotlin.jvm.internal.o.g(onEndSearch, "onEndSearch");
        this.f300720d = root;
        this.f300721e = y0Var;
        this.f300722f = controller;
        this.f300723g = onShowSearch;
        this.f300724h = onEndSearch;
        this.D = "";
        this.E = new java.util.LinkedHashSet();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.ssf);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new jn2.q(this));
        }
        this.f300725i = (android.widget.EditText) root.findViewById(com.tencent.mm.R.id.t8k);
        this.f300727n = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.vhi);
        this.f300726m = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.u6q);
        this.f300728o = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.uzz);
        this.f300729p = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.f486717v00);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f300728o;
        this.f300730q = constraintLayout2 != null ? (androidx.recyclerview.widget.RecyclerView) constraintLayout2.findViewById(com.tencent.mm.R.id.f487066s71) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.f300729p;
        this.f300731r = constraintLayout3 != null ? (androidx.recyclerview.widget.RecyclerView) constraintLayout3.findViewById(com.tencent.mm.R.id.f487066s71) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.f300728o;
        this.f300732s = constraintLayout4 != null ? (androidx.constraintlayout.widget.ConstraintLayout) constraintLayout4.findViewById(com.tencent.mm.R.id.rfs) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.f300728o;
        this.f300733t = constraintLayout5 != null ? (android.widget.TextView) constraintLayout5.findViewById(com.tencent.mm.R.id.qgx) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.f300729p;
        this.f300734u = constraintLayout6 != null ? (androidx.constraintlayout.widget.ConstraintLayout) constraintLayout6.findViewById(com.tencent.mm.R.id.rfs) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout7 = this.f300729p;
        this.f300735v = constraintLayout7 != null ? (android.widget.TextView) constraintLayout7.findViewById(com.tencent.mm.R.id.qgx) : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f300726m;
        if (weImageView != null) {
            weImageView.setOnClickListener(this);
        }
        android.widget.TextView textView = this.f300727n;
        if (textView != null) {
            textView.setOnClickListener(new jn2.r(this));
        }
        zl2.r4.f473950a.Z2(this.f300725i, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new jn2.t(this));
        android.widget.EditText editText = this.f300725i;
        if (editText != null) {
            editText.setOnEditorActionListener(new jn2.v(this));
        }
        android.content.Context d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-context>(...)");
        jn2.z zVar = new jn2.z(d17, new jn2.n(this));
        this.f300736w = zVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f300730q;
        if (recyclerView != null) {
            recyclerView.setAdapter(zVar);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        }
        android.content.Context d18 = d();
        kotlin.jvm.internal.o.f(d18, "<get-context>(...)");
        jn2.c1 c1Var = new jn2.c1(d18, controller, liveData, y0Var, jn2.a2.f300551e, null, null, 96, null);
        this.f300737x = c1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f300731r;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c1Var);
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView2.getContext()));
            ym5.a1.g(recyclerView2, new jn2.o(this));
            recyclerView2.i(new jn2.p(this));
        }
    }

    public static final void a(jn2.w wVar, java.util.List list) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = wVar.f300728o;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setEnabled(false);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = wVar.f300734u;
        if (constraintLayout2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(constraintLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f300731r;
        if (recyclerView != null) {
            int i17 = list.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f300735v;
        if (textView != null) {
            int i18 = list.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = wVar.f300735v;
        if (textView2 != null) {
            android.content.Context d17 = wVar.d();
            kotlin.jvm.internal.o.f(d17, "<get-context>(...)");
            java.lang.String string = d17.getString(com.tencent.mm.R.string.lqo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            textView2.setText(string);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = wVar.f300729p;
        if (constraintLayout3 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(constraintLayout3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(constraintLayout3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setEnabled(true);
        }
    }

    public static final void b(jn2.w wVar, java.util.List list) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = wVar.f300729p;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setEnabled(false);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = wVar.f300732s;
        if (constraintLayout2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(constraintLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f300730q;
        if (recyclerView != null) {
            int i17 = list.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f300733t;
        if (textView != null) {
            int i18 = list.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = wVar.f300733t;
        if (textView2 != null) {
            android.content.Context d17 = wVar.d();
            kotlin.jvm.internal.o.f(d17, "<get-context>(...)");
            java.lang.String string = d17.getString(com.tencent.mm.R.string.lqo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            textView2.setText(string);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = wVar.f300728o;
        if (constraintLayout3 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(constraintLayout3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(constraintLayout3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setEnabled(true);
        }
    }

    public static final void c(jn2.w wVar) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = wVar.f300728o;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setEnabled(false);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = wVar.f300734u;
        if (constraintLayout2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(constraintLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f300731r;
        if (recyclerView != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f300735v;
        if (textView != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = wVar.f300729p;
        if (constraintLayout3 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(constraintLayout3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(constraintLayout3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout3.setEnabled(true);
        }
    }

    public final android.content.Context d() {
        return this.f300720d.getContext();
    }

    public final void e() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f300728o;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setEnabled(false);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f300729p;
        if (constraintLayout2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(constraintLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout2.setEnabled(false);
        }
    }

    public final void f() {
        kotlinx.coroutines.r2 r2Var = this.f300739z;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.widget.EditText editText = this.f300725i;
        if (editText != null) {
            editText.clearComposingText();
            editText.clearFocus();
            editText.setText("");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f300726m;
        if (weImageView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f300727n;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-context>(...)");
        android.widget.EditText editText2 = this.f300725i;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) d17.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText2 != null ? editText2.getWindowToken() : null, 0);
        }
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.u6q) {
            android.widget.EditText editText = this.f300725i;
            if (editText != null) {
                editText.setText("");
            }
            e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
