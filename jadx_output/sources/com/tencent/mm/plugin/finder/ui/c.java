package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.e f128965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f128966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f128967f;

    public c(com.tencent.mm.plugin.finder.ui.e eVar, android.view.View view, int i17) {
        this.f128965d = eVar;
        this.f128966e = view;
        this.f128967f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f128965d.f129084g;
        if (pVar != null) {
            android.view.View clickArea = this.f128966e;
            kotlin.jvm.internal.o.f(clickArea, "$clickArea");
            pVar.invoke(clickArea, java.lang.Integer.valueOf(this.f128967f));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
