package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ji0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f113107p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f113108q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f113109r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f113110s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f113111t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f113112u;

    /* renamed from: v, reason: collision with root package name */
    public r45.a73 f113113v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(android.view.ViewGroup root, qo0.c statusMonitor, android.app.Activity activity, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f113107p = "Finder.FinderLiveVisitorGameRankSwitchGuidePlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f483752by4);
        this.f113108q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.bi0.f112040d);
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) root.findViewById(com.tencent.mm.R.id.cgs);
        this.f113109r = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.ci0(this));
        }
        android.widget.Button button = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.c9z);
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ei0(this, root));
        }
        android.widget.Button button2 = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.b5i);
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.fi0(this));
        }
        this.f113110s = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f113111t = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.i0v);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.mn9);
        this.f113112u = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.gi0(this, activity));
        }
        java.lang.Object layoutParams = findViewById2 != null ? findViewById2.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = com.tencent.mm.ui.bl.c(root.getContext()) + ((int) root.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz));
        }
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setLayoutParams(layoutParams2);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var, r45.z63 z63Var, boolean z17) {
        long j17 = ((mm2.e1) ji0Var.P0(mm2.e1.class)).f328988r.getLong(0);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) ji0Var.P0(mm2.c1.class)).f328846n;
        long id6 = finderObject != null ? finderObject.getId() : -1L;
        ek2.q1 q1Var = ek2.r1.f253524u;
        java.lang.String string = z63Var.getString(0);
        if (string == null) {
            string = "";
        }
        new ek2.r1(j17, id6, 1, q1Var.b(string, z17)).l().K(new com.tencent.mm.plugin.finder.live.plugin.hi0(ji0Var, z17, z63Var));
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        r45.z63 g76 = ((mm2.c1) P0(mm2.c1.class)).g7();
        if (g76 != null) {
            v1(false, g76);
        }
        u1();
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
        if (i17 == 0 || (view = this.f113108q) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        com.tencent.mars.xlog.Log.i(this.f113107p, "back");
        android.view.View view = this.f113108q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f113109r;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
    }

    public final void v1(boolean z17, r45.z63 z63Var) {
        new ek2.v0(1, z17 ? 1 : 2, S0(), z63Var).l();
    }
}
