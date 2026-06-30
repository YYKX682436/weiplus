package sj3;

/* loaded from: classes14.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408749d;

    public t4(sj3.a5 a5Var) {
        this.f408749d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.a5 a5Var = this.f408749d;
        if (a5Var.A.isEnabled()) {
            com.tencent.mm.plugin.multitalk.model.u0.f150143c++;
            com.tencent.mm.plugin.multitalk.model.e3.Ri().R(a5Var.A.a());
            a5Var.y();
            if (a5Var.A.a()) {
                a5Var.A.setChecked(true);
                com.tencent.mm.plugin.multitalk.model.u0.a(3);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().c(true);
            } else {
                a5Var.A.setChecked(false);
                com.tencent.mm.plugin.multitalk.model.u0.a(4);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().c(false);
            }
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
                zj3.g.f473302a.b(6, 2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
