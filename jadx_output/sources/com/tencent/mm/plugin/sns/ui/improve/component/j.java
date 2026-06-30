package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.ui.component.UIComponent {
    public static final com.tencent.mm.plugin.sns.ui.improve.component.a Companion = new com.tencent.mm.plugin.sns.ui.improve.component.a(null);
    private static final java.lang.String TAG = "MicroMsg.Improve.BaseUIC";
    private final jz5.g actionBarHeight$delegate;
    private final jz5.g dispatcher$delegate;
    private boolean isActive;
    private final jz5.g layoutManager$delegate;
    private final androidx.lifecycle.y lifecycleOwner;
    private final jz5.g navigationBarHeight$delegate;
    private final jz5.g overScrollView$delegate;
    private final jz5.g recycleView$delegate;
    private final jz5.g screenHeight$delegate;
    private final jz5.g statusBarHeight$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.lifecycleOwner = activity;
        this.screenHeight$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.h(this));
        this.navigationBarHeight$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.e(this));
        this.statusBarHeight$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.i(this));
        this.actionBarHeight$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.b(this));
        this.recycleView$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.g(this));
        this.layoutManager$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.d(this));
        this.dispatcher$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.c(activity));
        this.overScrollView$delegate = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.f(this));
    }

    public static /* synthetic */ java.lang.Object onScrollStateChanged$suspendImpl(com.tencent.mm.plugin.sns.ui.improve.component.j jVar, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var, int i17, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return f0Var;
    }

    public final int getActionBarHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((java.lang.Number) this.actionBarHeight$delegate.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final t26.d getDispatcher() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        t26.d dVar = (t26.d) this.dispatcher$delegate.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return dVar;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager getLayoutManager() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager improveLayoutManager = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager) this.layoutManager$delegate.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return improveLayoutManager;
    }

    public final androidx.lifecycle.y getLifecycleOwner() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        androidx.lifecycle.y yVar = this.lifecycleOwner;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return yVar;
    }

    public final int getNavigationBarHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((java.lang.Number) this.navigationBarHeight$delegate.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView getOverScrollView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        java.lang.Object value = this.overScrollView$delegate.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView improveOverScrollView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return improveOverScrollView;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView getRecycleView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        java.lang.Object value = this.recycleView$delegate.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return improveRecyclerView;
    }

    public final int getScreenHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((java.lang.Number) this.screenHeight$delegate.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final int getStatusBarHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((java.lang.Number) this.statusBarHeight$delegate.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.component.x1 getVisibleItemView() {
        zc4.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int w17 = getLayoutManager().w();
        int y17 = getLayoutManager().y();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class)).S6().f152065o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int max = java.lang.Integer.max(w17, 1);
        if (max <= y17) {
            while (true) {
                int i17 = max - 1;
                if (i17 < arrayList.size()) {
                    android.view.View findViewByPosition = getLayoutManager().findViewByPosition(max);
                    if (findViewByPosition != null) {
                        int[] iArr = new int[2];
                        findViewByPosition.getLocationOnScreen(iArr);
                        if (iArr[1] <= getScreenHeight() - getNavigationBarHeight() && (bVar = (zc4.b) kz5.n0.a0(arrayList, i17)) != null) {
                            int i18 = iArr[0];
                            arrayList2.add(new com.tencent.mm.plugin.sns.ui.improve.component.o0(max, bVar, findViewByPosition, new android.graphics.Rect(i18, iArr[1], findViewByPosition.getWidth() + i18, iArr[1] + findViewByPosition.getHeight())));
                        }
                    }
                    if (max == y17) {
                        break;
                    }
                    max++;
                } else {
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "getVisibleHolder range:[" + w17 + ' ' + y17 + "],snapshot size:" + arrayList2.size());
        com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var = new com.tencent.mm.plugin.sns.ui.improve.component.x1(w17, y17, arrayList2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return x1Var;
    }

    public final boolean isActive() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isActive", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        boolean z17 = this.isActive;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActive", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        super.onPause();
        this.isActive = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        this.isActive = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
    }

    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var, int i17, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        java.lang.Object onScrollStateChanged$suspendImpl = onScrollStateChanged$suspendImpl(this, recyclerView, x1Var, i17, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return onScrollStateChanged$suspendImpl;
    }

    public void onScrollStateChangedInMain(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
    }

    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
    }

    public final boolean resumePage() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        boolean z17 = getIntent().getBooleanExtra("sns_resume_state", true) && com.tencent.mm.plugin.sns.model.l4.qj().b();
        com.tencent.mars.xlog.Log.i(TAG, "resumePage:" + z17);
        if (z17) {
            com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
            com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
            qj6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j17 = qj6.f168315e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            Kj.u(j17, -1);
            com.tencent.mm.plugin.sns.model.d6 Kj2 = com.tencent.mm.plugin.sns.model.l4.Kj();
            com.tencent.mm.plugin.sns.ui.f8 qj7 = com.tencent.mm.plugin.sns.model.l4.qj();
            qj7.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j18 = qj7.f168316f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            Kj2.t(j18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return z17;
    }

    public final void setActive(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActive", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        this.isActive = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActive", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
    }
}
