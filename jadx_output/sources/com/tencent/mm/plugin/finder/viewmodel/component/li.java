package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gi f135066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135067e;

    public li(com.tencent.mm.plugin.finder.viewmodel.component.gi giVar, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135066d = giVar;
        this.f135067e = blVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$1$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 1;
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = this.f135066d;
            int i18 = giVar.f134525b;
            androidx.appcompat.app.AppCompatActivity context = this.f135067e.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 W6 = nyVar != null ? nyVar.W6(giVar.f134525b) : null;
            int i19 = giVar.f134535l.f134635a == com.tencent.mm.plugin.finder.viewmodel.component.fi.f134406e ? 1 : 0;
            if (W6 != null) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                int i27 = 2;
                jz5.l lVar = new jz5.l("finder_tab_context_id", W6.getString(2));
                jz5.l lVar2 = new jz5.l("finder_context_id", W6.getString(1));
                jz5.l lVar3 = new jz5.l("comment_scene", java.lang.Integer.valueOf(W6.getInteger(5)));
                if (i18 != 1) {
                    i27 = 3;
                    if (i18 != 3) {
                        if (i18 != 4) {
                            i17 = 0;
                        }
                        ((cy1.a) rVar).Bj("finder_timeline_tab", "view_clk", kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("finder_tab_type", java.lang.Integer.valueOf(i17)), new jz5.l("finder_tab_clk_state", java.lang.Integer.valueOf(i19))), 1, false);
                    }
                }
                i17 = i27;
                ((cy1.a) rVar).Bj("finder_timeline_tab", "view_clk", kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("finder_tab_type", java.lang.Integer.valueOf(i17)), new jz5.l("finder_tab_clk_state", java.lang.Integer.valueOf(i19))), 1, false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$1$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
