package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI f156708d;

    public q0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI mobileRemitResultUI) {
        this.f156708d = mobileRemitResultUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI mobileRemitResultUI = this.f156708d;
        int measuredWidth = mobileRemitResultUI.f156594g.getMeasuredWidth();
        java.lang.String string = mobileRemitResultUI.getString(com.tencent.mm.R.string.gxa, mobileRemitResultUI.f156609y);
        java.lang.String string2 = mobileRemitResultUI.getString(com.tencent.mm.R.string.gxb, mobileRemitResultUI.f156610z);
        if (measuredWidth != 0) {
            float measureText = mobileRemitResultUI.f156595h.getPaint().measureText(string);
            float measureText2 = mobileRemitResultUI.f156596i.getPaint().measureText(string2);
            float f17 = measuredWidth;
            if (measureText + measureText2 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) mobileRemitResultUI.f156595h.getLayoutParams();
                layoutParams.width = (int) (f17 - measureText2);
                mobileRemitResultUI.f156595h.setLayoutParams(layoutParams);
            }
        }
        mobileRemitResultUI.f156595h.setText(string);
        mobileRemitResultUI.f156596i.setText(string2);
    }
}
