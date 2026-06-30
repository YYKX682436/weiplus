package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ye extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.o72 f136565d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f136566e;

    /* renamed from: f, reason: collision with root package name */
    public long f136567f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f136568g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136569h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f136570i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f136571m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f136572n;

    /* renamed from: o, reason: collision with root package name */
    public int f136573o;

    /* renamed from: p, reason: collision with root package name */
    public int f136574p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f136575q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136567f = java.lang.System.currentTimeMillis();
        this.f136569h = true;
        this.f136571m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.pe(this));
        this.f136572n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.qe.f135693d);
        this.f136573o = -1;
        this.f136574p = -1;
        this.f136575q = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.re(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.ye r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ye.O6(com.tencent.mm.plugin.finder.viewmodel.component.ye, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout P6(android.view.ViewGroup viewGroup) {
        com.tencent.mm.view.RefreshLoadMoreLayout P6;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                if (childAt instanceof com.tencent.mm.view.RefreshLoadMoreLayout) {
                    return (com.tencent.mm.view.RefreshLoadMoreLayout) childAt;
                }
                android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                if (viewGroup2 != null && (P6 = P6(viewGroup2)) != null) {
                    return P6;
                }
            }
            i17++;
        }
    }

    public final int Q6() {
        return ((java.lang.Number) this.f136571m.getValue()).intValue();
    }

    public final int R6() {
        jz5.g gVar = this.f136572n;
        if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() > 0) {
            return ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        }
        int i17 = this.f136573o;
        return i17 == -1 ? gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC, 0) : i17;
    }

    public final int S6() {
        int i17 = this.f136574p;
        return i17 == -1 ? gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC, 0) : i17;
    }

    public final void T6(boolean z17) {
        if (R6() <= 0 || S6() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderFeedSafeCheckUIC", "startNextSafeCheck: not support feed safe check 1, intervalSce=" + R6() + ", lastFeedCount=" + S6());
            kotlinx.coroutines.r2 r2Var = this.f136568g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f136568g = null;
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "startNextSafeCheck: notify from remote, cancle cur job");
            kotlinx.coroutines.r2 r2Var2 = this.f136568g;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            this.f136568g = null;
        }
        kotlinx.coroutines.r2 r2Var3 = this.f136568g;
        if (r2Var3 != null && r2Var3.a()) {
            return;
        }
        this.f136568g = kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.xe(z17, this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "onPause: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + Q6());
        com.tencent.mm.sdk.event.IListener iListener = this.f136570i;
        if (iListener != null) {
            iListener.dead();
        }
        this.f136570i = null;
        kotlinx.coroutines.r2 r2Var = this.f136568g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f136568g = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "onResume: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + Q6() + ", isUserVisibleFocused=" + getIsUserVisibleFocused());
        if (getIsUserVisibleFocused()) {
            com.tencent.mm.sdk.event.IListener iListener = this.f136570i;
            if (iListener != null) {
                iListener.dead();
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckNewUIC$registNotifyEventListner$1 finderFeedSafeCheckNewUIC$registNotifyEventListner$1 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckNewUIC$registNotifyEventListner$1(this, com.tencent.mm.app.a0.f53288d);
            this.f136570i = finderFeedSafeCheckNewUIC$registNotifyEventListner$1;
            finderFeedSafeCheckNewUIC$registNotifyEventListner$1.alive();
            T6(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "onUserVisibleFocused: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + Q6() + ", isFirstUserVisibleFocus=" + this.f136569h);
        if (this.f136569h) {
            this.f136567f = java.lang.System.currentTimeMillis();
            this.f136569h = false;
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f136570i;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckNewUIC$registNotifyEventListner$1 finderFeedSafeCheckNewUIC$registNotifyEventListner$1 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckNewUIC$registNotifyEventListner$1(this, com.tencent.mm.app.a0.f53288d);
        this.f136570i = finderFeedSafeCheckNewUIC$registNotifyEventListner$1;
        finderFeedSafeCheckNewUIC$registNotifyEventListner$1.alive();
        T6(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "onUserVisibleUnFocused: activity=" + getActivity().getClass().getSimpleName() + ", commentScene=" + Q6());
        com.tencent.mm.sdk.event.IListener iListener = this.f136570i;
        if (iListener != null) {
            iListener.dead();
        }
        this.f136570i = null;
        kotlinx.coroutines.r2 r2Var = this.f136568g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f136568g = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136567f = java.lang.System.currentTimeMillis();
        this.f136569h = true;
        this.f136571m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.pe(this));
        this.f136572n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.qe.f135693d);
        this.f136573o = -1;
        this.f136574p = -1;
        this.f136575q = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.re(this));
    }
}
