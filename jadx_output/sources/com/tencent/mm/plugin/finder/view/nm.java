package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class nm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.rm f132724d;

    public nm(com.tencent.mm.plugin.finder.view.rm rmVar) {
        this.f132724d = rmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.rm rmVar = this.f132724d;
        com.tencent.mm.plugin.finder.view.om omVar = rmVar.f132966e;
        if (omVar != null) {
            rmVar.getClass();
            omVar.a(null);
        }
        rmVar.dismiss();
        android.view.View contentView = rmVar.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.tencent.mm.plugin.finder.view.qm(rmVar.f132976o));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
