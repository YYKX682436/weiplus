package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179369d;

    public e2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179369d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179369d;
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(wcPayRealnameVerifyIdInputUI.getContext());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.d(i17, i18, i19);
        int i27 = i17 + org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID;
        if (i27 < 1) {
            i27 = 1;
        }
        oVar.f(i27, 1, 1);
        oVar.e(i17, i18, i19);
        oVar.f212307n = new com.tencent.mm.plugin.wallet_core.id_verify.d2(this, oVar);
        java.lang.String str = (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179474v.getValue();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.length() >= 10) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(str.substring(0, 4), 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(str.substring(5, 7), 0);
            int P3 = com.tencent.mm.sdk.platformtools.t8.P(str.substring(9, 10), 0);
            if (P > 0 && P2 > 0 && P3 > 0) {
                oVar.d(P, P2, P3);
            }
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
