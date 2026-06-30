package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f129515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129516e;

    public mb(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        this.f129515d = recyclerView;
        this.f129516e = finderMsgFeedDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View contentView;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f129515d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            androidx.recyclerview.widget.k3 q07 = recyclerView.q0(linearLayoutManager.w(), false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var == null) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.view.rm rmVar = new com.tencent.mm.plugin.finder.view.rm(context, null);
            com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f129516e;
            rmVar.setContentView(com.tencent.mm.ui.id.b(finderMsgFeedDetailUI).inflate(com.tencent.mm.R.layout.f489037b41, (android.view.ViewGroup) null, false));
            android.widget.TextView textView = (android.widget.TextView) rmVar.getContentView().findViewById(com.tencent.mm.R.id.o5r);
            if (textView != null) {
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String str = (java.lang.String) ((jz5.n) finderMsgFeedDetailUI.F).getValue();
                kotlin.jvm.internal.o.f(str, "<get-thankTipsContent>(...)");
                textView.setText(zy2.s6.l6((zy2.s6) c17, str, (int) textView.getTextSize(), true, null, 0, false, null, 120, null));
                rmVar.f132974m = 5000L;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484486ee3);
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i17 = 0; i17 < childCount; i17++) {
                        android.view.View childAt = viewGroup.getChildAt(i17);
                        if (childAt.getVisibility() == 0) {
                            if ((childAt.getAlpha() == 1.0f) && childAt.getId() != com.tencent.mm.R.id.gbz) {
                                arrayList.add(childAt);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList2.add(java.lang.Float.valueOf(0.3f));
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                                yj0.a.f(childAt, "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                        }
                    }
                }
                rmVar.setOnDismissListener(new com.tencent.mm.plugin.finder.ui.lb(arrayList));
                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.a_4);
                kotlin.jvm.internal.o.f(p17, "getView(...)");
                if (!rmVar.f132971j) {
                    rmVar.getContentView().measure(0, 0);
                    rmVar.f132971j = true;
                }
                int measuredWidth = rmVar.getContentView().getMeasuredWidth();
                int measuredHeight = rmVar.getContentView().getMeasuredHeight();
                p17.getHeight();
                int[] iArr = new int[2];
                p17.getLocationInWindow(iArr);
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(rmVar.f132965d);
                int i18 = (iArr[1] - rmVar.f132972k) - measuredHeight;
                rmVar.setAnimationStyle(com.tencent.mm.R.style.f494610rl);
                rmVar.showAtLocation(p17, 0, 0, i18);
                if (rmVar.f132974m > 0 && (contentView = rmVar.getContentView()) != null) {
                    contentView.postDelayed(new com.tencent.mm.plugin.finder.view.qm(rmVar.f132976o), rmVar.f132974m);
                }
                kotlin.jvm.internal.o.f(java.lang.String.format("showWithTop: popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{0, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(a17.f197135a), java.lang.Integer.valueOf(a17.f197136b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
            }
        }
    }
}
