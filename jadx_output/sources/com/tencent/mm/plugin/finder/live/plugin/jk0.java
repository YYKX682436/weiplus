package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jk0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f113127p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f113128q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f113129r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f113130s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f113131t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(android.view.ViewGroup root, qo0.c statusMonitor, android.app.Activity activity, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f113127p = "FinderLiveVisitorRoleGuidePlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f483752by4);
        this.f113128q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ek0(this));
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) root.findViewById(com.tencent.mm.R.id.cgs);
        this.f113129r = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.fk0(this));
        }
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f482468fc);
        this.f113130s = findViewById2;
        int c17 = com.tencent.mm.ui.bl.c(root.getContext());
        if (findViewById2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
        }
        android.widget.Button button = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.bun);
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.gk0(this, activity));
        }
        android.widget.Button button2 = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.gt7);
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.hk0(this));
        }
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.yb.t2((c61.yb) c18, 14, null, 2, null);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1009) {
            java.lang.String str = this.f113127p;
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i(str, "REQUEST_FINDER_LIVE_ROLE resultCode:" + i18 + ",data:" + intent);
                return;
            }
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IS_FROM_SETTING", false) : false;
            com.tencent.mars.xlog.Log.i(str, "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + booleanExtra);
            if (booleanExtra) {
                t1(!(W0() != null ? ((dk2.r4) r5).q(intent) : false));
            }
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        t1(true);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        android.view.View view;
        super.K0(i17);
        if (i17 == 0 || (view = this.f113128q) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        yz5.a aVar;
        android.view.View view = this.f113128q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f113129r;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        if (!z17 || (aVar = this.f113131t) == null) {
            return;
        }
        aVar.invoke();
    }
}
