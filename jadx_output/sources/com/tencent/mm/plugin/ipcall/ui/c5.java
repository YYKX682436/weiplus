package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI f142774d;

    public c5(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        this.f142774d = iPCallShareCouponUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f142774d;
        iPCallShareCouponUI.A.f360751d++;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 1L, 1L, true);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IPCALL_EXCHANGE_RECORD_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE);
        iPCallShareCouponUI.f142704u.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", iPCallShareCouponUI.getString(com.tencent.mm.R.string.g3q));
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
