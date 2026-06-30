package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ya f114898d;

    public wa(com.tencent.mm.plugin.finder.live.plugin.ya yaVar) {
        this.f114898d = yaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBottomTipPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(this.f114898d.f115171r, null, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBottomTipPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
