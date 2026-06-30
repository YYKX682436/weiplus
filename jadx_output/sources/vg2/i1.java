package vg2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f436521e;

    public i1(vg2.r1 r1Var, android.widget.TextView textView) {
        this.f436520d = r1Var;
        this.f436521e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.pk pkVar;
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customGiftContentRootEntrance$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.u7 u7Var = dk2.u7.f234181a;
        vg2.r1 r1Var = this.f436520d;
        boolean b17 = kotlin.jvm.internal.o.b(dk2.u7.f234187g.get(r1Var.f436567h.field_rewardProductId), java.lang.Boolean.TRUE);
        android.widget.TextView textView = this.f436521e;
        if (!b17) {
            db5.t7.e(textView.getContext(), textView.getContext().getResources().getString(com.tencent.mm.R.string.dbu), com.tencent.mm.R.raw.gift_on);
        } else if (textView.getContext().getResources().getConfiguration().orientation == 2) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.hm.class)) != null) {
                java.lang.String str = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
                hmVar.p1("PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_GIFT", r1Var.f436567h.c1().toByteArray());
            }
        } else {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null && (pkVar = (df2.pk) liveRoomControllerStore.controller(df2.pk.class)) != null) {
                pkVar.h7(r1Var.f436567h, r1Var.f436569j);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customGiftContentRootEntrance$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
