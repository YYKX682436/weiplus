package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.e f129040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f129042f;

    public d(com.tencent.mm.plugin.finder.ui.e eVar, android.view.View view, int i17) {
        this.f129040d = eVar;
        this.f129041e = view;
        this.f129042f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f129040d.f129085h;
        if (pVar != null) {
            android.view.View clickArea = this.f129041e;
            kotlin.jvm.internal.o.f(clickArea, "$clickArea");
            pVar.invoke(clickArea, java.lang.Integer.valueOf(this.f129042f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
