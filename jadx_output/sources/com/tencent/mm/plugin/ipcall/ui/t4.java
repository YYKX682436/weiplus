package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI f143013d;

    public t4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        this.f143013d = iPCallShareCouponUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f143013d;
        sb6.append(iPCallShareCouponUI.getString(com.tencent.mm.R.string.g4g));
        sb6.append("&usedcc=");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.ipcall.model.j a17 = com.tencent.mm.plugin.ipcall.model.j.a();
        if (!a17.f142473c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList2 = a17.f142471a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            sb7 = sb7 + t83.c.g(t83.f.f());
        } else {
            int size = arrayList2.size();
            if (size > 5) {
                size = 5;
            }
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String g17 = t83.c.g(((java.lang.Integer) arrayList2.get(i17)).toString());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    sb7 = sb7 + g17 + "|";
                }
            }
            if (sb7.endsWith("|")) {
                sb7 = sb7.substring(0, sb7.length() - 1);
            }
        }
        intent.putExtra("rawUrl", sb7);
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
