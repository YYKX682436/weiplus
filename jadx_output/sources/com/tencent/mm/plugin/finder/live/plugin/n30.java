package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r30 f113586d;

    public n30(com.tencent.mm.plugin.finder.live.plugin.r30 r30Var) {
        this.f113586d = r30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dk2.xf W0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = this.f113586d;
        if (((mm2.c1) r30Var.P0(mm2.c1.class)).a8()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.S, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) r30Var.X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
            if (c4Var != null) {
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) m17).intValue();
                android.view.ViewGroup viewGroup = c4Var.f365323d;
                if (intValue != 0 && intValue != 1) {
                    db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dsn), 0).show();
                } else if ((viewGroup.getContext() instanceof android.app.Activity) && (W0 = c4Var.W0()) != null) {
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((dk2.r4) W0).V((android.app.Activity) context);
                }
            }
        } else {
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) r30Var.U0(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var != null) {
                android.content.Intent intent = new android.content.Intent(r5Var.O6(), (java.lang.Class<?>) ((jz5.n) jz2.x0.f302762i).getValue());
                intent.putExtra("titile", r5Var.O6().getResources().getString(com.tencent.mm.R.string.ecg));
                intent.putExtra("KBlockOpenImFav", true);
                intent.putExtra("KEY_LUCKY_MONEY_CHAT_ROOM_MAX_COUNT", ((mm2.e1) r5Var.business(mm2.e1.class)).a7() ? ((mm2.o2) r5Var.business(mm2.o2.class)).f329302h.getInteger(0) : ((mm2.c1) r5Var.business(mm2.c1.class)).f328792d4.getInteger(0));
                intent.putStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", new java.util.ArrayList<>(((mm2.c1) r5Var.business(mm2.c1.class)).f328803f4.f309049a));
                com.tencent.mm.ui.MMActivity N6 = r5Var.N6();
                if (N6 != null) {
                    N6.startActivityForResult(intent, 1004);
                }
            }
        }
        r30Var.u1();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
