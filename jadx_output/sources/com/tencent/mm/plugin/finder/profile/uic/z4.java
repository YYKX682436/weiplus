package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class z4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f124410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f124413h;

    public z4(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, int i17, com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, int i18) {
        this.f124409d = view;
        this.f124410e = recyclerView;
        this.f124411f = i17;
        this.f124412g = finderProfileFeedUIC;
        this.f124413h = i18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        this.f124409d.getViewTreeObserver().removeOnPreDrawListener(this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f124410e;
        recyclerView = this.f124412g.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        int i17 = this.f124411f + ((gridLayoutManager != null ? gridLayoutManager.f11861w : 0) * 2);
        int i18 = this.f124413h;
        if (i17 > i18) {
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$1$2$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$1$2$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }
}
