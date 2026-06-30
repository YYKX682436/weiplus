package zk3;

/* loaded from: classes8.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC f473470d;

    public i0(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC) {
        this.f473470d = multiTaskUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC$createMultiTaskPanelView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = this.f473470d;
        rk3.e eVar = multiTaskUIC.f150591d;
        boolean z17 = false;
        if (eVar != null && eVar.f()) {
            z17 = true;
        }
        this.f473470d.i7(true, true, false, false, false, !z17, false, z17);
        if (z17) {
            multiTaskUIC.a7(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC$createMultiTaskPanelView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
