package yw3;

/* loaded from: classes.dex */
public final class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI f466755d;

    public g7(com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI repairerTextStatusShowConfigUI) {
        this.f466755d = repairerTextStatusShowConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        we0.c1 c1Var = (we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class));
        c1Var.getClass();
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "start insert..", 0).show();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new we0.b1(c1Var, currentTimeMillis, null), 2, null);
        }
        android.widget.Toast.makeText(this.f466755d.getContext(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
