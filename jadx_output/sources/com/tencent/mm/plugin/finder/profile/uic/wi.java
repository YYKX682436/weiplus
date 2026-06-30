package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class wi implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f124333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f124335g;

    public wi(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.profile.uic.dk dkVar, int i17) {
        this.f124332d = view;
        this.f124333e = recyclerView;
        this.f124334f = dkVar;
        this.f124335g = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f124332d.getViewTreeObserver().removeOnPreDrawListener(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124333e;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124334f;
        int size = (dkVar.O6().size() - this.f124335g) + 1 + 6;
        int size2 = dkVar.O6().size();
        if (size > size2) {
            size = size2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(size));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }
}
