package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class g implements android.app.DatePickerDialog.OnDateSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.h f214182a;

    public g(com.tencent.mm.wallet_core.ui.h hVar) {
        this.f214182a = hVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
        com.tencent.mm.wallet_core.ui.h hVar = this.f214182a;
        com.tencent.mm.wallet_core.ui.EditHintView editHintView = hVar.f214187d;
        if (i17 >= editHintView.B || i18 >= editHintView.C) {
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
            if (c01.z1.I()) {
                hVar.f214187d.f214088y = decimalFormat.format(i18 + 1) + i17;
            } else {
                hVar.f214187d.f214088y = decimalFormat.format(i17).substring(2) + decimalFormat.format(i18 + 1);
            }
            hVar.f214187d.f214073g.setText(decimalFormat.format(i18 + 1) + decimalFormat.format(i17).substring(2));
        } else {
            db5.e1.s(editHintView.getContext(), hVar.f214187d.getContext().getString(com.tencent.mm.R.string.kli), null);
        }
        com.tencent.mm.wallet_core.ui.EditHintView editHintView2 = hVar.f214187d;
        editHintView2.f214083t = editHintView2.a();
        hVar.f214187d.getClass();
    }
}
