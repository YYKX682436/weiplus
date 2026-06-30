package sj3;

/* loaded from: classes14.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408740d;

    public s4(sj3.a5 a5Var) {
        this.f408740d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.multitalk.model.u0.f150142b++;
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        sj3.a5 a5Var = this.f408740d;
        Ri.Q(!a5Var.f408436z.a());
        if (a5Var.f408436z.a()) {
            a5Var.f408436z.setChecked(false);
            com.tencent.mm.plugin.multitalk.model.u0.a(1);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().b(true);
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        } else {
            a5Var.f408436z.setChecked(true);
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
            com.tencent.mm.plugin.multitalk.model.u0.a(2);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().b(false);
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
            zj3.g.f473302a.b(5, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
