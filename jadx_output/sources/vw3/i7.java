package vw3;

/* loaded from: classes.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f440992d;

    public i7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f440992d = repairerXLogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerXLogUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f440992d;
        repairerXLogUI.d = com.tencent.mm.ui.widget.dialog.u3.f(repairerXLogUI, "正在处理...", true, 0, null);
        ((ku5.t0) ku5.t0.f312615d).g(new vw3.h7(this.f440992d));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerXLogUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
