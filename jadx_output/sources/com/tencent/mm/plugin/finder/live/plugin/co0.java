package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class co0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin f112182d;

    public co0(com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
        this.f112182d = finderVisitorRoleChooserPlugin;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f112182d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = finderVisitorRoleChooserPlugin.f111768e;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        yz5.l lVar = finderVisitorRoleChooserPlugin.f111771h;
        if (lVar != null) {
            int integer = g92.b.f269769e.k2().getInteger(4);
            finderVisitorRoleChooserPlugin.b(false);
            lVar.invoke(java.lang.Integer.valueOf(integer));
            finderVisitorRoleChooserPlugin.f111771h = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
