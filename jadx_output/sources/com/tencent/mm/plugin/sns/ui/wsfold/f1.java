package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class f1 extends com.tencent.mm.plugin.sns.ui.wsfold.a implements com.tencent.mm.plugin.sns.ui.improve.component.g2 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f171361d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f171362e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f171363f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f171364g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f171365h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f171366i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f171367m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f171368n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f171369o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f171370p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f171371q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f171372r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f171361d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.v0(activity));
        this.f171362e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.q0(activity));
        this.f171363f = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.o0(this));
        this.f171364g = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.b1(this));
        this.f171365h = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.x0(this));
        this.f171366i = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.e1(this));
        this.f171367m = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.n0(this));
        this.f171368n = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.r0(this));
        this.f171369o = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.a1(this));
        this.f171370p = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.w0(this));
        this.f171371q = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.p0(activity));
    }

    public static final com.tencent.mm.plugin.sns.ui.improve.component.m P6(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        f1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.m mVar = (com.tencent.mm.plugin.sns.ui.improve.component.m) ((jz5.n) f1Var.f171362e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return mVar;
    }

    public static final boolean Q6(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        f1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        boolean z17 = f1Var.getActivity().isDestroyed() || f1Var.getActivity().isFinishing();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.g2
    public void B2(xm3.o0 pendingData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterUpdate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        if (this.f171372r) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager layoutManager = getLayoutManager();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC", "afterUpdate", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            layoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC", "afterUpdate", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterUpdate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.wsfold.a
    public void O6(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        super.O6(recyclerView, struct, i17);
        S6().c(recyclerView, i17, struct.a());
        if (i17 == 0) {
            int y17 = getLayoutManager().y();
            int size = R6().getData().size();
            if (y17 != -1 && size - y17 <= 3 && size > 0) {
                com.tencent.mm.plugin.sns.ui.wsfold.w U6 = U6();
                U6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadMore", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
                if (U6.V6()) {
                    kotlinx.coroutines.r2 r2Var = U6.f171451i;
                    if ((r2Var == null || r2Var.A()) ? false : true) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldDataUIC", "repeat loadmore job");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadMore", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
                    } else {
                        U6.f171451i = U6.W6(new com.tencent.mm.plugin.sns.ui.wsfold.k(U6, null));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadMore", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadMore", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
                }
            }
        }
        bd4.f2.F.b(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    public final com.tencent.mm.plugin.sns.ui.wsfold.b R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.wsfold.b bVar = (com.tencent.mm.plugin.sns.ui.wsfold.b) ((jz5.n) this.f171363f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return bVar;
    }

    public final ad4.d S6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        ad4.d dVar = (ad4.d) ((jz5.n) this.f171371q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return dVar;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView improveLoadingMoreView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView) ((jz5.n) this.f171368n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return improveLoadingMoreView;
    }

    public final com.tencent.mm.plugin.sns.ui.wsfold.w U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.wsfold.w wVar = (com.tencent.mm.plugin.sns.ui.wsfold.w) ((jz5.n) this.f171361d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return wVar;
    }

    public final void V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerVideoAutoPlay", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        ad4.d S6 = S6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f171369o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        kotlin.jvm.internal.o.f(wxRecyclerView, "<get-recyclerView>(...)");
        S6.c(wxRecyclerView, 0, getVisibleItemView().a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerVideoAutoPlay", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.g2
    public void a3(xm3.o0 pendingData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeUpdate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        this.f171372r = getLayoutManager().getChildCount() <= 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeUpdate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager getLayoutManager() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager improveLayoutManager = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager) ((jz5.n) this.f171370p).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return improveLayoutManager;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.component.x1 getVisibleItemView() {
        zc4.b bVar;
        com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        int w17 = getLayoutManager().w();
        int y17 = getLayoutManager().y();
        java.util.ArrayList arrayList = U6().T6().f152065o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (w17 <= y17) {
            int i17 = w17;
            while (i17 < arrayList.size()) {
                android.view.View findViewByPosition = getLayoutManager().findViewByPosition(i17);
                if (findViewByPosition != null) {
                    int[] iArr = new int[2];
                    findViewByPosition.getLocationOnScreen(iArr);
                    int i18 = iArr[1];
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
                    int intValue = ((java.lang.Number) ((jz5.n) f1Var.f171364g).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
                    int intValue2 = ((java.lang.Number) ((jz5.n) f1Var.f171365h).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
                    if (i18 <= intValue - intValue2 && (bVar = (zc4.b) kz5.n0.a0(arrayList, i17)) != null) {
                        int i19 = iArr[0];
                        arrayList2.add(new com.tencent.mm.plugin.sns.ui.improve.component.o0(i17, bVar, findViewByPosition, new android.graphics.Rect(i19, iArr[1], findViewByPosition.getWidth() + i19, iArr[1] + findViewByPosition.getHeight())));
                    }
                }
                if (i17 == y17) {
                    break;
                }
                i17++;
                f1Var = this;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldMainUIC", "getVisibleHolder range:[" + w17 + ' ' + y17 + "],snapshot size:" + arrayList2.size());
        com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var = new com.tencent.mm.plugin.sns.ui.improve.component.x1(w17, y17, arrayList2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        return x1Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.v9b);
        wxRecyclerView.setItemAnimator(null);
        wxRecyclerView.setLayoutManager(getLayoutManager());
        wxRecyclerView.setAdapter(R6());
        wxRecyclerView.i(new com.tencent.mm.plugin.sns.ui.wsfold.c1(this));
        R6().O(T6(), 2147483646, true);
        ((u30.e) ((v30.e) i95.n0.c(v30.e.class))).wi(wxRecyclerView, getActivity().getClass().getName());
        T6().b();
        wxRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.ui.wsfold.d1(wxRecyclerView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.sns.ui.wsfold.y0(this, null), 2, null);
        ym5.a1.h(T6(), new com.tencent.mm.plugin.sns.ui.wsfold.z0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        ad4.d S6 = S6();
        S6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIDestroy");
        com.tencent.mm.plugin.sns.ui.zm b17 = S6.b();
        b17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(b17.f171702c);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b17.f171700a = null;
        b17.f171701b = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        ym5.a1.h(T6(), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        ad4.w.f3206d = null;
        android.view.animation.TranslateAnimation translateAnimation = ad4.w.f3204b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        ad4.w.f3204b = null;
        android.view.animation.TranslateAnimation translateAnimation2 = ad4.w.f3205c;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        ad4.w.f3205c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        super.onPause();
        S6().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        S6().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIResume");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        V6();
        yc4.b0.f460839a.a();
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
    }
}
