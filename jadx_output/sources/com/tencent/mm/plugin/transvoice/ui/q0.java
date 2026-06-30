package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class q0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175462d;

    public q0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175462d = v0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175462d;
        int i17 = v0Var.G;
        int i18 = i17 % 3;
        v0Var.G = i17 + 1;
        if (i18 == 0) {
            v0Var.F = "·";
        } else if (i18 == 1) {
            v0Var.F = "··";
        } else if (i18 == 2) {
            v0Var.F = "···";
        }
        java.lang.String str = v0Var.f175496x0;
        int length = str.length() > 3 ? str.length() - 3 : 0;
        java.lang.String str2 = str + v0Var.F;
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(v0Var.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3)), length, str2.length(), 18);
        com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
        if (mMEditText != null) {
            mMEditText.setText(spannableString);
        }
        return true;
    }
}
