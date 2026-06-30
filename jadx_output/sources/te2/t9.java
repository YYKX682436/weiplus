package te2;

/* loaded from: classes10.dex */
public final class t9 implements te2.lc, android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f418442t = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418443d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418444e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f418445f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.kc f418446g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f418447h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f418448i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f418449m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f418450n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f418451o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f418452p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f418453q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f418454r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f418455s;

    public t9(android.view.View root, com.tencent.mm.ui.MMActivity activity, gk2.e liveData, te2.kc kcVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f418443d = root;
        this.f418444e = activity;
        this.f418445f = liveData;
        this.f418446g = kcVar;
    }

    @Override // te2.lc
    public void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f418443d;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.fq_);
        this.f418447h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f418448i = view.findViewById(com.tencent.mm.R.id.f486945v61);
        this.f418449m = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) view.findViewById(com.tencent.mm.R.id.fpu);
        this.f418453q = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.v5w);
        this.f418451o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tqt);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418449m;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnClickListener(this);
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f418449m;
        int i17 = f418442t;
        int i18 = 0;
        if (liveBottomSheetPanel2 != null) {
            liveBottomSheetPanel2.setOnVisibilityListener(new te2.n9(this));
            if (view.getContext().getResources().getConfiguration().orientation == 2) {
                liveBottomSheetPanel2.setUseCenterLandScapeStyle(true);
                liveBottomSheetPanel2.setTranslationY(com.tencent.mm.ui.bl.b(view.getContext()).y);
            } else {
                liveBottomSheetPanel2.setTranslationY(com.tencent.mm.ui.bl.b(view.getContext()).y);
            }
            liveBottomSheetPanel2.setShowing(false);
            liveBottomSheetPanel2.getLayoutParams().height = i17;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486944v60);
        this.f418450n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View view2 = this.f418450n;
        if (view2 != null) {
            view2.setContentDescription(view.getContext().getString(com.tencent.mm.R.string.dkw));
        }
        this.f418452p = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f486946v62);
        this.f418455s = view.findViewById(com.tencent.mm.R.id.f486947v63);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view.findViewById(com.tencent.mm.R.id.f486948v64);
        this.f418454r = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(view.getContext()));
            wxRecyclerView.P(new te2.o9());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f418454r;
        if (wxRecyclerView2 != null) {
            int c17 = com.tencent.mm.ui.bl.c(view.getContext());
            android.view.View view3 = this.f418448i;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                i18 = layoutParams.height;
            }
            if (i18 <= 0) {
                i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
            }
            int i19 = (i17 - c17) - i18;
            wxRecyclerView2.getLayoutParams().height = i19;
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorMusicSingSongNewPanelViewCallback", "adjustRvHeight height:" + i19);
        }
        if (view.getContext().getResources().getConfiguration().orientation != 2) {
            view.post(new te2.p9(this));
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel3 = this.f418449m;
            if (liveBottomSheetPanel3 != null) {
                liveBottomSheetPanel3.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + com.tencent.mm.ui.bl.c(view.getContext()));
                return;
            }
            return;
        }
        int min = java.lang.Math.min(com.tencent.mm.ui.bl.b(view.getContext()).x, com.tencent.mm.ui.bl.b(view.getContext()).y);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel4 = this.f418449m;
        android.view.ViewGroup.LayoutParams layoutParams2 = liveBottomSheetPanel4 != null ? liveBottomSheetPanel4.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = min;
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel5 = this.f418449m;
        android.view.ViewGroup.LayoutParams layoutParams3 = liveBottomSheetPanel5 != null ? liveBottomSheetPanel5.getLayoutParams() : null;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.height = min - com.tencent.mm.ui.bl.h(view.getContext());
    }

    @Override // te2.lc
    public void c(boolean z17) {
        android.view.View view = this.f418448i;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f418452p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.TextView textView = this.f418451o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = this.f418455s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418454r;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f418453q;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z17) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418449m;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
                z18 = true;
            }
            if (!z18 || liveBottomSheetPanel == null) {
                return;
            }
            liveBottomSheetPanel.post(new te2.r9(this));
        }
    }

    @Override // te2.lc
    public void d(boolean z17) {
        android.view.View view = this.f418448i;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f418451o;
        if (textView != null) {
            textView.setText(this.f418443d.getContext().getResources().getString(com.tencent.mm.R.string.eiv));
        }
        android.widget.TextView textView2 = this.f418451o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f418452p;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418454r;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.view.View view2 = this.f418455s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f418453q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z17) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418449m;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
                z18 = true;
            }
            if (!z18 || liveBottomSheetPanel == null) {
                return;
            }
            liveBottomSheetPanel.post(new te2.q9(this));
        }
    }

    @Override // te2.lc
    public void e() {
        int size = ((mm2.m6) this.f418445f.a(mm2.m6.class)).f329249q.f234085a.size();
        android.view.View view = this.f418448i;
        boolean z17 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f418452p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.view.View view2 = this.f418455s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418454r;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f418453q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.TextView textView = this.f418451o;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.f418451o;
        if (textView2 != null) {
            android.view.View view3 = this.f418443d;
            textView2.setText(size > 0 ? view3.getContext().getResources().getString(com.tencent.mm.R.string.eiu, java.lang.String.valueOf(size)) : view3.getContext().getResources().getString(com.tencent.mm.R.string.eiv));
        }
        android.widget.TextView textView3 = this.f418451o;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418449m;
        if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
            z17 = true;
        }
        if (!z17 || liveBottomSheetPanel == null) {
            return;
        }
        liveBottomSheetPanel.post(new te2.s9(this));
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418444e;
    }

    @Override // te2.lc
    public void k() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418449m;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = true;
        if ((valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.fq_) && (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.f486944v60)) {
            z17 = false;
        }
        if (z17) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
