package sj3;

/* loaded from: classes14.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408778d;

    public u4(sj3.a5 a5Var) {
        this.f408778d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.multitalk.model.u0.f150144d++;
        sj3.a5 a5Var = this.f408778d;
        a5Var.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = a5Var.f408417d;
        androidx.appcompat.app.AppCompatActivity context = multiTalkMainUI.getContext();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(context, "android.permission.CAMERA", 22, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), multiTalkMainUI.getContext());
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = a5Var.f408435y;
        if (!a17) {
            multiTalkControlIconLayout.setChecked(false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 26L, 1L, false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            multiTalkControlIconLayout.setChecked(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().z()) {
            multiTalkControlIconLayout.setChecked(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(multiTalkMainUI)) {
            p21.i.b(multiTalkMainUI, com.tencent.mm.R.string.f490500wu, null);
            multiTalkControlIconLayout.setChecked(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        long a18 = com.tencent.mm.plugin.multitalk.model.o2.a();
        if (a18 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onClickVideoAction, isOverLoadFail is true! videoWaitMills:%s", java.lang.Long.valueOf(a18));
            int ceil = (int) java.lang.Math.ceil(((float) a18) / 1000.0f);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.h2n, java.lang.Integer.valueOf(ceil)), 0).show();
            multiTalkControlIconLayout.setChecked(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        zj3.g gVar = zj3.g.f473302a;
        boolean a19 = multiTalkControlIconLayout.a();
        zj3.f fVar = zj3.g.f473320s;
        if (a19) {
            fVar.b();
            zj3.g.f473317p = true;
        } else {
            fVar.a();
        }
        if (multiTalkControlIconLayout.a()) {
            a5Var.u(false);
            com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
            ((com.tencent.mm.plugin.multitalk.model.r3) com.tencent.mm.plugin.multitalk.model.e3.Ri().r()).a(true);
            com.tencent.mm.plugin.multitalk.model.u0.a(5);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStart");
            i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.n3(i4Var));
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        } else {
            a5Var.v(false);
            com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
            com.tencent.mm.plugin.multitalk.model.u0.a(6);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.H();
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
            java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
