package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class gi implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderProgressBar f132164d;

    public gi(com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar) {
        this.f132164d = finderProgressBar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProgressBar$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mars.xlog.Log.i("Finder.ProgressBar", "onLongClick...");
        int i17 = com.tencent.mm.plugin.finder.view.FinderProgressBar.f131437h;
        this.f132164d.b(true, 0L);
        view.performHapticFeedback(0, 2);
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/view/FinderProgressBar$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
