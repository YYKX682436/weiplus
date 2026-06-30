package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142891d;

    public k4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142891d = iPCallShareCouponCardUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142891d;
        q83.d dVar = iPCallShareCouponCardUI.f142683t;
        dVar.d();
        dVar.f360754b = iPCallShareCouponCardUI.D;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 19L, 1L, true);
        if (iPCallShareCouponCardUI.B != null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) iPCallShareCouponCardUI.getContext(), 0, true);
            k0Var.q(iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g6e), 17);
            k0Var.f211872n = new com.tencent.mm.plugin.ipcall.ui.l4(iPCallShareCouponCardUI);
            k0Var.f211881s = new com.tencent.mm.plugin.ipcall.ui.m4(iPCallShareCouponCardUI);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
