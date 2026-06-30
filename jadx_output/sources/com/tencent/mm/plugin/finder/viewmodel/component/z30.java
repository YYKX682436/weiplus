package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f136647e;

    public z30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, android.widget.TextView textView) {
        this.f136646d = f50Var;
        this.f136647e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Class cls;
        java.lang.String str;
        com.tencent.mm.plugin.finder.viewmodel.component.z30 z30Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$sendMsgLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136646d;
        java.lang.String e17 = xy2.c.e(f50Var.getContext());
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "finder_private_msg_entrance", e17, false, false, 12, null);
        r45.f03 I0 = S0 != null ? S0.I0("finder_private_msg_entrance") : null;
        java.lang.String b76 = f50Var.b7(I0);
        if (S0 != null && S0.getType() == 1028) {
            if (I0 != null && I0.f373887d == 2) {
                str = "finder_private_msg_entrance";
                cls = c61.l7.class;
                r45.f03 f03Var = I0;
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 6L, true, I0.f373888e, b76, e17);
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", S0, f03Var, 3, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            } else {
                cls = c61.l7.class;
                str = "finder_private_msg_entrance";
                r45.f03 f03Var2 = I0;
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 6L, true, 0L, b76, e17);
                if (f03Var2 != null) {
                    com.tencent.mm.plugin.finder.report.x2 x2Var2 = com.tencent.mm.plugin.finder.report.x2.f125429a;
                    androidx.appcompat.app.AppCompatActivity context2 = f50Var.getActivity();
                    kotlin.jvm.internal.o.g(context2, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    com.tencent.mm.plugin.finder.report.x2.i(x2Var2, "4", S0, f03Var2, 2, nyVar2 != null ? nyVar2.V6() : null, 0, null, 0, 0, 480, null);
                }
            }
        } else {
            cls = c61.l7.class;
            str = "finder_private_msg_entrance";
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 6L, false, 0L, b76, e17);
        }
        com.tencent.mm.plugin.finder.report.p.f125223b.c(2L, 0L, xy2.c.e(f50Var.getContext()));
        ((c61.l7) i95.n0.c(cls)).nk().y(str, e17);
        if (!(gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_END_TIME_LONG_SYNC, 0L) * 1000 < c01.id.c())) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Db).getValue()).r()).intValue() == 1) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_SEQ_CLICK_LONG_SYNC, java.lang.Long.valueOf(gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_SEQ_LONG_SYNC, 0L)));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_CONTENT_STRING_SYNC, "");
                z30Var = this;
                z30Var.f136647e.setVisibility(8);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.assist.i0.pj((com.tencent.mm.plugin.finder.assist.i0) c17, f50Var.getActivity(), null, 2, null);
                yj0.a.h(z30Var, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$sendMsgLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        z30Var = this;
        i95.m c172 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c172, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.pj((com.tencent.mm.plugin.finder.assist.i0) c172, f50Var.getActivity(), null, 2, null);
        yj0.a.h(z30Var, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$sendMsgLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
