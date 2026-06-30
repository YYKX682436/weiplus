package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s2 f119347d;

    public p2(com.tencent.mm.plugin.finder.live.widget.s2 s2Var) {
        this.f119347d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = this.f119347d;
        yz5.a aVar = s2Var.f119701c;
        if (aVar != null) {
            aVar.invoke();
        }
        s2Var.b().h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
