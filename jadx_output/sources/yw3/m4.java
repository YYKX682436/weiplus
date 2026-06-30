package yw3;

/* loaded from: classes4.dex */
public final class m4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466810d;

    public m4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        this.f466810d = repairerMvvmListDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI.i;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f466810d;
        repairerMvvmListDemoUI.U6().a().setAdapter((xm3.t0) ((jz5.n) repairerMvvmListDemoUI.f).getValue());
        repairerMvvmListDemoUI.U6().a().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(repairerMvvmListDemoUI));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
