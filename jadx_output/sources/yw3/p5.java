package yw3;

/* loaded from: classes.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466850d;

    public p5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f466850d = repairerPatchDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f466850d;
        dp.a.makeText(context, "触发手动更新", 1).show();
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).qj(2, context);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
