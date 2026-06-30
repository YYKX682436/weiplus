package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class s6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f157935d;

    public s6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f157935d = remittanceF2fLargeMoneyUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = this.f157935d;
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "click enter, mTotalAmt:%s", java.lang.Double.valueOf(remittanceF2fLargeMoneyUI.f157424t));
            double d17 = remittanceF2fLargeMoneyUI.f157424t;
            if (d17 <= 0.0d) {
                db5.t7.makeText(remittanceF2fLargeMoneyUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
                return true;
            }
            remittanceF2fLargeMoneyUI.U6(d17);
        }
        return true;
    }
}
