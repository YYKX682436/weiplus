package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207098d;

    public p9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f207098d = selectContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207098d;
        if (selectContactUI.A1) {
            if (selectContactUI.D1 == 0) {
                selectContactUI.f206555y0.setVisibility(8);
                selectContactUI.f206549l1.setVisibility(8);
                selectContactUI.f206554x1.setVisibility(8);
                selectContactUI.f206552p1.setVisibility(0);
                selectContactUI.f206556y1.setTextColor(selectContactUI.getResources().getColor(com.tencent.mm.R.color.a4h));
                selectContactUI.f206556y1.setText(com.tencent.mm.R.string.igk);
                selectContactUI.f206553x0.setBackground(selectContactUI.getResources().getDrawable(com.tencent.mm.R.drawable.ayn));
                return;
            }
            if (selectContactUI.H1 || selectContactUI.L1) {
                selectContactUI.f206555y0.setVisibility(8);
                selectContactUI.f206549l1.setVisibility(0);
                selectContactUI.f206554x1.setVisibility(8);
                selectContactUI.f206552p1.setVisibility(8);
                selectContactUI.f206556y1.setTextColor(selectContactUI.getResources().getColor(com.tencent.mm.R.color.Brand_100));
                selectContactUI.f206556y1.setText(selectContactUI.getString(com.tencent.mm.R.string.igt, java.lang.Integer.toString(selectContactUI.D1)));
                selectContactUI.f206553x0.setBackground(selectContactUI.getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
                return;
            }
            if (selectContactUI.G1 || selectContactUI.K1) {
                selectContactUI.f206555y0.setVisibility(8);
                selectContactUI.f206549l1.setVisibility(8);
                selectContactUI.f206554x1.setVisibility(0);
                selectContactUI.f206552p1.setVisibility(8);
                selectContactUI.f206556y1.setTextColor(selectContactUI.getResources().getColor(com.tencent.mm.R.color.Brand_100));
                selectContactUI.f206556y1.setText(selectContactUI.getString(com.tencent.mm.R.string.igt, java.lang.Integer.toString(selectContactUI.D1)));
                selectContactUI.f206553x0.setBackground(selectContactUI.getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
                return;
            }
            selectContactUI.f206555y0.setVisibility(0);
            selectContactUI.f206549l1.setVisibility(8);
            selectContactUI.f206554x1.setVisibility(8);
            selectContactUI.f206552p1.setVisibility(8);
            selectContactUI.f206556y1.setTextColor(selectContactUI.getResources().getColor(com.tencent.mm.R.color.Brand_100));
            selectContactUI.f206556y1.setText(selectContactUI.getString(com.tencent.mm.R.string.igt, java.lang.Integer.toString(selectContactUI.D1)));
            selectContactUI.f206553x0.setBackground(selectContactUI.getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
        }
    }
}
