package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI f179404d;

    public k1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI) {
        this.f179404d = wcPayRealnameInputAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI.f179245t;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = this.f179404d;
        wcPayRealnameInputAddressUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "go to select address ui");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("GetAddress", true);
        intent.putExtra("ShowSelectedLocation", false);
        intent.putExtra("IsRealNameVerifyScene", true);
        intent.putExtra("IsNeedShowSearchBar", true);
        java.util.ArrayList<java.lang.String> arrayList2 = wcPayRealnameInputAddressUI.f179258s;
        if (!arrayList2.isEmpty()) {
            intent.putStringArrayListExtra("BlockedCountries", arrayList2);
        }
        j45.l.v(wcPayRealnameInputAddressUI.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, wcPayRealnameInputAddressUI.f179250h);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
