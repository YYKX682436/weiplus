package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.lk f118761d;

    public jk(com.tencent.mm.plugin.finder.live.widget.lk lkVar) {
        this.f118761d = lkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.lk lkVar = this.f118761d;
        lkVar.b().setChecked(!lkVar.b().isChecked());
        lkVar.f118944d = lkVar.b().isChecked() ? 1 : 0;
        lkVar.f118943c.onChange();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
