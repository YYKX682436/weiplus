package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class yl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f136586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f136587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f136588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f136589g;

    public yl(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17, int i18) {
        this.f136586d = zlVar;
        this.f136587e = linearLayoutManager;
        this.f136588f = i17;
        this.f136589g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f136586d;
        if (!zlVar.f136703u) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f136587e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(this.f136589g));
            arrayList.add(java.lang.Integer.valueOf(this.f136588f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        zlVar.f136703u = true;
    }
}
