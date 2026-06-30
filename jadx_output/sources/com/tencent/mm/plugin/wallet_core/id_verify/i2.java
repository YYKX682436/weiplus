package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179392d;

    public i2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179392d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179392d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        wcPayRealnameVerifyIdInputUI.hideTenpayKB();
        if (wcPayRealnameVerifyIdInputUI.f179299z) {
            wcPayRealnameVerifyIdInputUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to detail address ui");
            android.content.Intent intent = new android.content.Intent(wcPayRealnameVerifyIdInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI.class);
            intent.putExtra("key_countrycode", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179464i.getValue());
            intent.putExtra("key_provincecode", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179465m.getValue());
            intent.putExtra("key_citycode", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179466n.getValue());
            intent.putExtra("key_zone", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179467o.getValue());
            intent.putExtra("key_address", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179468p.getValue());
            intent.putExtra("key_exclude_country", wcPayRealnameVerifyIdInputUI.E);
            wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 4);
        } else {
            wcPayRealnameVerifyIdInputUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to select address ui");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("GetAddress", true);
            intent2.putExtra("ShowSelectedLocation", false);
            intent2.putExtra("IsRealNameVerifyScene", true);
            intent2.putExtra("IsNeedShowSearchBar", true);
            j45.l.v(wcPayRealnameVerifyIdInputUI.getContext(), ".ui.tools.MultiStageCitySelectUI", intent2, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
