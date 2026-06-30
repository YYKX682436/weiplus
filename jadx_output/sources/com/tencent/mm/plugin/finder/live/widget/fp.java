package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f118368d;

    public fp(com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        this.f118368d = hpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.i2[] i2VarArr = ml2.i2.f327553d;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f118368d;
        hpVar.r0(2, 3);
        hpVar.v0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
