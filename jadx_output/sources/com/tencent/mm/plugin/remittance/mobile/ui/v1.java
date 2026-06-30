package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes5.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156732d;

    public v1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156732d = mobileRemittanceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156732d;
        int measuredWidth = mobileRemittanceUI.f156632x.getMeasuredWidth();
        java.lang.String string = mobileRemittanceUI.getString(com.tencent.mm.R.string.f492550gx5, mobileRemittanceUI.f156616f);
        java.lang.String string2 = mobileRemittanceUI.getString(com.tencent.mm.R.string.gxe, mobileRemittanceUI.f156617g);
        if (measuredWidth != 0) {
            float measureText = mobileRemittanceUI.f156634y.getPaint().measureText(string);
            float measureText2 = mobileRemittanceUI.f156635z.getPaint().measureText(string2) + i65.a.b(mobileRemittanceUI, 17);
            float f17 = measuredWidth;
            if (measureText + measureText2 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) mobileRemittanceUI.f156634y.getLayoutParams();
                layoutParams.width = (int) (f17 - measureText2);
                mobileRemittanceUI.f156634y.setLayoutParams(layoutParams);
            }
        }
        mobileRemittanceUI.f156634y.setText(string);
        mobileRemittanceUI.f156635z.setText(string2);
    }
}
