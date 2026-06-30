package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qf extends com.tencent.mm.ui.component.UIComponent implements zy2.j7 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f135694d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f135695e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f135696f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f135697g;

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f135698h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f135699i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f135700m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f135701n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f135702o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f135703p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135697g = "";
        this.f135699i = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f135700m = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127727h3).getValue()).r()).intValue() == 1;
        this.f135701n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.af.f133772d);
        this.f135703p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.df(this));
    }

    public final void O6() {
        Q6(false);
        db5.d5 d5Var = this.f135698h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        this.f135698h = null;
        this.f135702o = false;
    }

    public final void P6(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.ik(view, i17, 25496);
        aVar.gk(view, kz5.c1.k(new jz5.l("feed_id", str2), new jz5.l("comment_text", str3)));
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(getActivity());
        aVar.Ai(view, new com.tencent.mm.plugin.finder.viewmodel.component.bf(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }

    public final void Q6(boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f135696f;
        if (finderItem != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f135699i;
            com.tencent.mm.plugin.finder.viewmodel.component.ze zeVar = (com.tencent.mm.plugin.finder.viewmodel.component.ze) concurrentHashMap.get(java.lang.Long.valueOf(finderItem.getId()));
            if (zeVar == null) {
                zeVar = (com.tencent.mm.plugin.finder.viewmodel.component.ze) concurrentHashMap.get(java.lang.Long.valueOf(finderItem.getLocalId()));
            }
            if (zeVar != null) {
                android.view.View p17 = ((com.tencent.mm.plugin.finder.convert.w8) zeVar).f104853b.p(com.tencent.mm.R.id.f484486ee3);
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.3f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void R6() {
        if (this.f135700m) {
            O6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        getRootView().removeCallbacks((java.lang.Runnable) ((jz5.n) this.f135703p).getValue());
        this.f135699i.clear();
        db5.d5 d5Var = this.f135698h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f135695e = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f135695e = false;
        if (this.f135694d) {
            android.view.View rootView = getRootView();
            jz5.n nVar = (jz5.n) this.f135703p;
            rootView.removeCallbacks((java.lang.Runnable) nVar.getValue());
            getRootView().postDelayed((java.lang.Runnable) nVar.getValue(), 500L);
            this.f135694d = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135697g = "";
        this.f135699i = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f135700m = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127727h3).getValue()).r()).intValue() == 1;
        this.f135701n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.af.f133772d);
        this.f135703p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.df(this));
    }
}
