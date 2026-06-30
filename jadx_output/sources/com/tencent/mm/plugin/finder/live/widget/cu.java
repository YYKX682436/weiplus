package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class cu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f118027d;

    public cu(com.tencent.mm.plugin.finder.live.widget.pu puVar) {
        this.f118027d = puVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118027d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
