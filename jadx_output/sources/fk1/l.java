package fk1;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263278d;

    public l(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263278d = wAGameRecordShareUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f263278d, 1, false);
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263278d;
        k0Var.X1 = true;
        k0Var.f211872n = new fk1.e(wAGameRecordShareUI);
        k0Var.f211881s = new fk1.k(wAGameRecordShareUI);
        k0Var.v();
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.a7(wAGameRecordShareUI, 601L, 3L, 1, 1, null, 16, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
