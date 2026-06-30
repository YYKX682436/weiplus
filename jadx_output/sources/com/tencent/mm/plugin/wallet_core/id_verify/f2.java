package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179375d;

    public f2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179375d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179375d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(wcPayRealnameVerifyIdInputUI.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
        java.lang.String[] strArr = wcPayRealnameVerifyIdInputUI.E;
        if (strArr != null) {
            intent.putExtra("exclude_countries_iso", strArr);
        }
        intent.putExtra("CountryCodeUI_isShowCountryCode", false);
        intent.putExtra("ui_title", wcPayRealnameVerifyIdInputUI.getString(com.tencent.mm.R.string.kzf));
        wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
