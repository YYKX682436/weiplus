package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class wu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dv f120235d;

    public wu(com.tencent.mm.plugin.finder.live.widget.dv dvVar) {
        this.f120235d = dvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = this.f120235d;
        yz5.a aVar = dvVar.f118151d;
        if (aVar != null) {
            aVar.invoke();
        }
        dvVar.f118149b.v7(fn2.u1.f264410e, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
