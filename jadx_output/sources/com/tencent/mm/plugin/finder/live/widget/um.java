package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class um implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119979d;

    public um(com.tencent.mm.plugin.finder.live.widget.wm wmVar) {
        this.f119979d = wmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f119979d.f120209g.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
