package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderContinueWatchUI f129532d;

    public n2(com.tencent.mm.plugin.finder.ui.FinderContinueWatchUI finderContinueWatchUI) {
        this.f129532d = finderContinueWatchUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderContinueWatchUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f129532d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderContinueWatchUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
