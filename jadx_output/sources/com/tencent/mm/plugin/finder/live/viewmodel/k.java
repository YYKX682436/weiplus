package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l f117172d;

    public k(com.tencent.mm.plugin.finder.live.viewmodel.l lVar) {
        this.f117172d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 19) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(4);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_create_scene", 4);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("key_router_to_profile", false);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(this.f117172d.getActivity(), intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20694, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
