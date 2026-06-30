package sj3;

/* loaded from: classes14.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408448d;

    public c2(sj3.g3 g3Var) {
        this.f408448d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3 g3Var = this.f408448d;
        g3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onScreenCastClicked: ");
        zj3.g gVar = zj3.g.f473302a;
        zj3.g.f473304c = java.lang.System.currentTimeMillis();
        gVar.b(1, 1);
        boolean a17 = zj3.j.a();
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
        if (a17) {
            com.tencent.mm.plugin.multitalk.model.u0.f150146f++;
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
                java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 0L, 1L);
            multiTalkMainUI.U6();
        } else {
            if (g3Var.g().getVisibility() != 0) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(multiTalkMainUI, 2, 3, false);
                z2Var.y(multiTalkMainUI.getResources().getString(com.tencent.mm.R.string.f490454vi));
                z2Var.x(1);
                z2Var.z(android.graphics.Color.parseColor("#07C160"));
                z2Var.i(com.tencent.mm.R.layout.cia);
                z2Var.F = new sj3.s2(z2Var, g3Var);
                z2Var.C();
            } else {
                android.view.View g17 = g3Var.g();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(multiTalkMainUI, 1, 3, false);
                z2Var2.m(multiTalkMainUI.getResources().getString(com.tencent.mm.R.string.f490347sg), multiTalkMainUI.getResources().getString(com.tencent.mm.R.string.ibn));
                z2Var2.v(android.graphics.Color.parseColor("#07C160"));
                z2Var2.o(0);
                z2Var2.i(com.tencent.mm.R.layout.cia);
                sj3.t2 t2Var = new sj3.t2(z2Var2);
                sj3.u2 u2Var = new sj3.u2(z2Var2, g3Var);
                z2Var2.D = t2Var;
                z2Var2.E = u2Var;
                z2Var2.C();
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(35);
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_screen_project_info");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            M.putBoolean("screen_project_has_been_educated", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
