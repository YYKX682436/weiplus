package vg2;

/* loaded from: classes3.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436534d;

    public k1(vg2.r1 r1Var) {
        this.f436534d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.pl plVar;
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customTextEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.r1 r1Var = this.f436534d;
        r1Var.g();
        r1Var.f436562c.invoke();
        if (r1Var.f436560a.getResources().getConfiguration().orientation == 2) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.hm.class)) != null) {
                java.lang.String str = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
                hmVar.p1("PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_TEXT_PANEL", r1Var.f436567h.c1().toByteArray());
            }
        } else {
            dk2.ef efVar2 = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null && (plVar = (df2.pl) liveRoomControllerStore.controller(df2.pl.class)) != null) {
                plVar.f7(r1Var.f436567h);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customTextEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
