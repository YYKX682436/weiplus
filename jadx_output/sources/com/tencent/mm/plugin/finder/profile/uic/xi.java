package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class xi implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f124370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124371f;

    public xi(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        this.f124369d = view;
        this.f124370e = recyclerView;
        this.f124371f = dkVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f124369d.getViewTreeObserver().removeOnPreDrawListener(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124370e;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124371f;
        java.util.Iterator it = dkVar.O6().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((so2.j5) it.next()).getItemId() == dkVar.f123645v) {
                break;
            }
            i17++;
        }
        int size = dkVar.O6().size();
        if (i17 > size) {
            i17 = size;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$5$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$5$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }
}
