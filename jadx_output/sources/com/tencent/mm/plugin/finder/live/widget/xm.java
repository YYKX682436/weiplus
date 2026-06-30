package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zm f120358d;

    public xm(com.tencent.mm.plugin.finder.live.widget.zm zmVar) {
        this.f120358d = zmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.cn cnVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLikeRecommendGuidePanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.zm zmVar = this.f120358d;
        com.tencent.mars.xlog.Log.i(zmVar.H, "okBtn click");
        zmVar.P = false;
        zmVar.e0(9);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) != null) {
            cnVar.t7(121, 60, 1);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(zmVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLikeRecommendGuidePanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
