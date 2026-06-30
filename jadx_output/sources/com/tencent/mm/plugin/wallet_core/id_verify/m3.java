package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179420d;

    public m3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179420d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179420d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        wcPayRealnameVerifyIdInputUI.f179296w = new com.tencent.mm.ui.widget.picker.o(wcPayRealnameVerifyIdInputUI.getContext());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        wcPayRealnameVerifyIdInputUI.f179296w.d(i17, i18, i19);
        wcPayRealnameVerifyIdInputUI.f179296w.f(i17, i18, i19);
        wcPayRealnameVerifyIdInputUI.f179296w.e(i17 + 200, 12, 31);
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = wcPayRealnameVerifyIdInputUI.f179296w.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.setLongTermYear(true);
        }
        wcPayRealnameVerifyIdInputUI.f179296w.f212307n = new com.tencent.mm.plugin.wallet_core.id_verify.l3(this);
        java.lang.String str = (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179472t.getValue();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.length() >= 8) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(str.substring(0, 4), 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(str.substring(5, 7), 0);
            int P3 = com.tencent.mm.sdk.platformtools.t8.P(str.substring(8, 10), 0);
            if (P > 0 && P2 > 0 && P3 > 0) {
                if (P == 9999) {
                    wcPayRealnameVerifyIdInputUI.f179296w.d(1, 1, 1);
                } else {
                    wcPayRealnameVerifyIdInputUI.f179296w.d(P, P2, P3);
                }
            }
        }
        wcPayRealnameVerifyIdInputUI.f179296w.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
