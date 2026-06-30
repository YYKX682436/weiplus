package te2;

/* loaded from: classes10.dex */
public final class fa implements te2.lc, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418008d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418009e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f418010f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.kc f418011g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f418012h;

    /* renamed from: i, reason: collision with root package name */
    public final int f418013i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f418014m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f418015n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f418016o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f418017p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f418018q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f418019r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f418020s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f418021t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f418022u;

    public fa(android.view.View root, com.tencent.mm.ui.MMActivity activity, gk2.e liveData, te2.kc kcVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f418008d = root;
        this.f418009e = activity;
        this.f418010f = liveData;
        this.f418011g = kcVar;
        this.f418012h = "FinderLiveVisitorMusicSingSongViewCallback";
        this.f418013i = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));
    }

    @Override // te2.lc
    public void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        java.lang.String str = this.f418012h;
        com.tencent.mars.xlog.Log.i(str, "initView");
        android.view.View view = this.f418008d;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.fq_);
        this.f418014m = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f418015n = view.findViewById(com.tencent.mm.R.id.my7);
        this.f418016o = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) view.findViewById(com.tencent.mm.R.id.fpu);
        this.f418020s = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.mxy);
        this.f418018q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fqa);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418016o;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnClickListener(this);
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f418016o;
        int i17 = this.f418013i;
        if (liveBottomSheetPanel2 != null) {
            liveBottomSheetPanel2.setOnVisibilityListener(new te2.z9(this));
            if (view.getContext().getResources().getConfiguration().orientation == 2) {
                liveBottomSheetPanel2.setTranslationX(com.tencent.mm.ui.bl.b(view.getContext()).y);
            } else {
                liveBottomSheetPanel2.setTranslationY(com.tencent.mm.ui.bl.b(view.getContext()).y);
            }
            liveBottomSheetPanel2.getLayoutParams().height = i17;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.my6);
        this.f418017p = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View view2 = this.f418017p;
        if (view2 != null) {
            view2.setContentDescription(view.getContext().getString(com.tencent.mm.R.string.dkw));
        }
        this.f418019r = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.my8);
        this.f418022u = view.findViewById(com.tencent.mm.R.id.my9);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view.findViewById(com.tencent.mm.R.id.my_);
        this.f418021t = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(view.getContext()));
            wxRecyclerView.P(new te2.aa());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f418021t;
        if (wxRecyclerView2 != null) {
            int c17 = com.tencent.mm.ui.bl.c(view.getContext());
            android.view.View view3 = this.f418015n;
            int i18 = (view3 == null || (layoutParams = view3.getLayoutParams()) == null) ? 0 : layoutParams.height;
            if (i18 <= 0) {
                i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
            }
            int i19 = (i17 - c17) - i18;
            wxRecyclerView2.getLayoutParams().height = i19;
            com.tencent.mars.xlog.Log.i(str, "adjustRvHeight height:" + i19);
        }
        if (view.getContext().getResources().getConfiguration().orientation != 2) {
            view.post(new te2.ba(this));
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel3 = this.f418016o;
            if (liveBottomSheetPanel3 != null) {
                liveBottomSheetPanel3.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + com.tencent.mm.ui.bl.c(view.getContext()));
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel4 = this.f418016o;
        android.view.ViewGroup.LayoutParams layoutParams2 = liveBottomSheetPanel4 != null ? liveBottomSheetPanel4.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = com.tencent.mm.ui.bl.b(view.getContext()).y;
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel5 = this.f418016o;
        android.view.ViewGroup.LayoutParams layoutParams3 = liveBottomSheetPanel5 != null ? liveBottomSheetPanel5.getLayoutParams() : null;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.height = com.tencent.mm.ui.bl.b(view.getContext()).x;
    }

    @Override // te2.lc
    public void c(boolean z17) {
        android.view.View view = this.f418015n;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f418019r;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.TextView textView = this.f418018q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = this.f418022u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418021t;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f418020s;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z17) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418016o;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
                z18 = true;
            }
            if (!z18 || liveBottomSheetPanel == null) {
                return;
            }
            liveBottomSheetPanel.post(new te2.da(this));
        }
    }

    @Override // te2.lc
    public void d(boolean z17) {
        android.view.View view = this.f418015n;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f418018q;
        if (textView != null) {
            textView.setText(this.f418008d.getContext().getResources().getString(com.tencent.mm.R.string.f493783p21));
        }
        android.widget.TextView textView2 = this.f418018q;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f418019r;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418021t;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.view.View view2 = this.f418022u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f418020s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z17) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418016o;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
                z18 = true;
            }
            if (!z18 || liveBottomSheetPanel == null) {
                return;
            }
            liveBottomSheetPanel.post(new te2.ca(this));
        }
    }

    @Override // te2.lc
    public void e() {
        int size = ((java.util.ArrayList) ((mm2.m6) this.f418010f.a(mm2.m6.class)).f329241f.b()).size();
        com.tencent.mars.xlog.Log.i(this.f418012h, "showMusicView size:" + size);
        android.view.View view = this.f418015n;
        boolean z17 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f418019r;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.view.View view2 = this.f418022u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f418021t;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f418020s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.TextView textView = this.f418018q;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.f418018q;
        if (textView2 != null) {
            android.view.View view3 = this.f418008d;
            textView2.setText(size > 0 ? view3.getContext().getResources().getString(com.tencent.mm.R.string.p2f, java.lang.String.valueOf(size)) : view3.getContext().getResources().getString(com.tencent.mm.R.string.f493783p21));
        }
        android.widget.TextView textView3 = this.f418018q;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418016o;
        if (liveBottomSheetPanel != null && !liveBottomSheetPanel.isShowing) {
            z17 = true;
        }
        if (!z17 || liveBottomSheetPanel == null) {
            return;
        }
        liveBottomSheetPanel.post(new te2.ea(this));
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418009e;
    }

    @Override // te2.lc
    public void k() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418016o;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fq_) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f418016o;
            if (liveBottomSheetPanel2 != null) {
                com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel2, null, 1, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.my6 && (liveBottomSheetPanel = this.f418016o) != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
