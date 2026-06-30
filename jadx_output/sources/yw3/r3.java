package yw3;

/* loaded from: classes.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMMXWebDebugUI f466866d;

    public r3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMMXWebDebugUI repairerMMXWebDebugUI) {
        this.f466866d = repairerMMXWebDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMMXWebDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
        androidx.appcompat.app.AppCompatActivity context = this.f466866d.getContext();
        ((th0.a0) eVar).getClass();
        com.tencent.mm.xwebutil.u0.a(context, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMMXWebDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
