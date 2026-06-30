package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes3.dex */
public class o1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f156700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, java.util.List list) {
        super(false);
        this.f156701e = mobileRemittanceUI;
        this.f156700d = list;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        for (android.view.View view2 : this.f156700d) {
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.jnc);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setContentDescription(((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jnd)).getText());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.getTag();
        int intValue = ((java.lang.Integer) imageView.getTag()).intValue();
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156701e;
        mobileRemittanceUI.S = intValue;
        imageView.setVisibility(0);
        view.setContentDescription(mobileRemittanceUI.getString(com.tencent.mm.R.string.hhu) + ((java.lang.Object) ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jnd)).getText()));
        view.sendAccessibilityEvent(32768);
    }
}
