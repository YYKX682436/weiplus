package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes7.dex */
public final class ya0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f136544d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f136545e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f136546f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136547g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136549i;

    /* renamed from: m, reason: collision with root package name */
    public final kh3.e f136550m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136545e = new com.tencent.mm.plugin.finder.viewmodel.component.sa0(this);
        this.f136550m = new com.tencent.mm.plugin.finder.viewmodel.component.ua0(this);
    }

    public final void O6() {
        if (!com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[checkShowNotWifiHint]: is not mobile data");
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ye).getValue()).r()).booleanValue()) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.viewmodel.component.ra0(this, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[checkShowNotWifiHint]: not show free flow");
            S6(com.tencent.mm.R.string.ers, 3000L);
        }
    }

    public final void P6() {
        android.widget.TextView textView = this.f136544d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        R6(false);
        com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[hideHint]");
    }

    public final java.lang.String Q6(java.util.TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            return "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getValue();
            if (!(str == null || str.length() == 0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(((java.lang.String) entry2.getKey()) + '=' + ((java.lang.String) entry2.getValue()));
        }
        return kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
    }

    public final void R6(boolean z17) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout;
        float f17 = 0.0f;
        float dimension = z17 ? getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) : 0.0f;
        float dimension2 = getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        float measuredHeight = this.f136544d != null ? r3.getMeasuredHeight() : 0.0f;
        if (z17) {
            if (measuredHeight <= 0.0f || measuredHeight <= dimension2) {
                f17 = dimension2;
            } else {
                dimension += measuredHeight - dimension2;
                f17 = measuredHeight;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[setLoadingOffsetExtra] isShow:" + z17 + " hintHeight:" + f17 + " minHintHeight:" + dimension2 + " measuredHeight:" + measuredHeight);
        java.util.List<androidx.fragment.app.Fragment> list = this.f136546f;
        if (list != null) {
            for (androidx.fragment.app.Fragment fragment : list) {
                com.tencent.mm.ui.component.UIComponentFragment uIComponentFragment = fragment instanceof com.tencent.mm.ui.component.UIComponentFragment ? (com.tencent.mm.ui.component.UIComponentFragment) fragment : null;
                if ((uIComponentFragment != null ? uIComponentFragment.f206301h : null) == null) {
                    com.tencent.mars.xlog.Log.e("FinderWifiHintUIC", "[setLoadingOffsetExtra] fragment:" + fragment.getClass().getSimpleName() + " rootView is null");
                } else {
                    android.view.View view = ((com.tencent.mm.ui.component.UIComponentFragment) fragment).getView();
                    if (view != null && (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e)) != null && (stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout()) != null) {
                        stickTopLoadingLayout.offsetExtra = dimension;
                        stickTopLoadingLayout.hintHeight = f17;
                        if (stickTopLoadingLayout.progressBar.getVisibility() == 0) {
                            stickTopLoadingLayout.setTranslationY(stickTopLoadingLayout.getTranslationY() + dimension);
                        } else {
                            stickTopLoadingLayout.onScrollCallback.invoke(java.lang.Float.valueOf(dimension + f17));
                        }
                    }
                }
            }
        }
    }

    public final void S6(int i17, long j17) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.xa0(this, i17, j17, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ni(8, this.f136550m);
        this.f136544d = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.pmj);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Vi(8, this.f136550m);
    }
}
