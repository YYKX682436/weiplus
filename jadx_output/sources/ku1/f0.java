package ku1;

/* loaded from: classes15.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku1.g0 f312078d;

    public f0(ku1.g0 g0Var) {
        this.f312078d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof fu1.p)) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ku1.g0 g0Var = this.f312078d;
        com.tencent.mm.plugin.card.ui.s4 s4Var = g0Var.f312132a;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94939h = false;
        fu1.p pVar = (fu1.p) view.getTag();
        if (pVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList arrayList2 = pVar.f266869d;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = pVar.f266866a;
        if (str != null && str.equals(jVar.a())) {
            android.view.View view2 = g0Var.f312085h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.plugin.card.ui.b0) g0Var.f312132a).f();
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (android.text.TextUtils.isEmpty(pVar.f266866a) && android.text.TextUtils.isEmpty(jVar.a())) {
            android.view.View view3 = g0Var.f312085h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.plugin.card.ui.b0) g0Var.f312132a).f();
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList h17 = eu1.f.h(pVar.f266867b);
        if (h17.size() > 0) {
            z17 = false;
            for (int i17 = 0; i17 < h17.size(); i17++) {
                fu1.p pVar2 = (fu1.p) h17.get(i17);
                java.lang.String str2 = pVar2.f266866a;
                if ((str2 == null || !str2.equals(pVar.f266866a)) && !(android.text.TextUtils.isEmpty(pVar2.f266866a) && android.text.TextUtils.isEmpty(pVar.f266866a))) {
                    pVar2.f266870e = false;
                    h17.set(i17, pVar2);
                } else {
                    pVar2.f266870e = true;
                    if (!pVar2.f266871f) {
                        pVar2.f266871f = true;
                        z17 = true;
                    }
                    h17.set(i17, pVar2);
                }
            }
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y07 = xt1.t0.nj().y0((java.lang.String) pVar.f266869d.get(0));
        if (y07 != null) {
            com.tencent.mm.plugin.card.ui.b0 b0Var = (com.tencent.mm.plugin.card.ui.b0) g0Var.f312132a;
            b0Var.E = y07;
            com.tencent.mm.plugin.card.ui.s0 s0Var = b0Var.T;
            if (s0Var != null) {
                com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = ((com.tencent.mm.plugin.card.ui.q) s0Var).f95124a;
                cardDetailUI.f94764f = y07;
                java.lang.String g17 = y07.g();
                cardDetailUI.f94765g = g17;
                cardDetailUI.f94781z.f95105c = g17;
            }
            b0Var.f();
        }
        if (z17) {
            com.tencent.mm.plugin.card.ui.s4 s4Var2 = g0Var.f312132a;
            if (((com.tencent.mm.plugin.card.ui.b0) s4Var2).T != null) {
                com.tencent.mm.plugin.card.ui.q qVar = (com.tencent.mm.plugin.card.ui.q) ((com.tencent.mm.plugin.card.ui.b0) s4Var2).T;
                qVar.getClass();
                int i18 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                qVar.f95124a.getClass();
            }
        }
        android.view.View view4 = g0Var.f312085h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
