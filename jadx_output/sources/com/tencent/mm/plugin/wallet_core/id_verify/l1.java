package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI f179411d;

    public l1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI) {
        this.f179411d = wcPayRealnameInputAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = this.f179411d;
        wcPayRealnameInputAddressUI.hideVKB();
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI.f179245t;
        intent.putExtra("key_countrycode", wcPayRealnameInputAddressUI.f179251i);
        intent.putExtra("key_provincecode", wcPayRealnameInputAddressUI.f179252m);
        intent.putExtra("key_citycode", wcPayRealnameInputAddressUI.f179253n);
        intent.putExtra("key_zone", wcPayRealnameInputAddressUI.f179246d.getText());
        intent.putExtra("key_address", wcPayRealnameInputAddressUI.f179247e.getText());
        wcPayRealnameInputAddressUI.setResult(-1, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[click okbtn] countryCode: %s, provinceCode: %s ，cityCode：%s , mZoneEt: %s , mAddressEt：%s", wcPayRealnameInputAddressUI.f179251i, wcPayRealnameInputAddressUI.f179252m, wcPayRealnameInputAddressUI.f179253n, wcPayRealnameInputAddressUI.f179246d.getText(), wcPayRealnameInputAddressUI.f179247e.getText());
        wcPayRealnameInputAddressUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
