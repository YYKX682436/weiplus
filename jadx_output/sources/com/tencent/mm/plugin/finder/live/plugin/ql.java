package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114023d;

    public ql(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f114023d = hmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$refreshSendGiftTargetTitleLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ae2.in.f3805l6.r()).booleanValue()) {
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) this.f114023d.P0(mm2.s2.class)).f329411p;
            r45.zb4 zb4Var = new r45.zb4();
            zb4Var.set(0, "findercoin_5_14109477660941945125");
            zb4Var.set(1, java.lang.Boolean.TRUE);
            liveMutableData.postValue(zb4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$refreshSendGiftTargetTitleLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
