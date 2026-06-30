package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class yo0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f115223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f115225g;

    public yo0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, android.view.View view2, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f115222d = view;
        this.f115223e = ep0Var;
        this.f115224f = view2;
        this.f115225g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f115222d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.u49);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.hhb);
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f115223e;
        android.view.View view2 = this.f115224f;
        android.graphics.Rect p17 = ep0Var.p(view2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f115224f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f115225g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.m(lVar, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.xo0(this.f115223e, this.f115224f, p17, findViewById, findViewById2, null), 2, null);
    }
}
