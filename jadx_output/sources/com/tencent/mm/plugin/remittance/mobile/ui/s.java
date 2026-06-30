package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.y f156713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ow3 f156714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.v f156715f;

    public s(com.tencent.mm.plugin.remittance.mobile.ui.v vVar, com.tencent.mm.plugin.remittance.mobile.ui.y yVar, r45.ow3 ow3Var) {
        this.f156715f = vVar;
        this.f156713d = yVar;
        this.f156714e = ow3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.y yVar = this.f156713d;
        int measuredWidth = yVar.f156743e.getMeasuredWidth();
        r45.ow3 ow3Var = this.f156714e;
        if (measuredWidth != 0) {
            float measureText = yVar.f156744f.getPaint().measureText(ow3Var.f382576e);
            float measureText2 = yVar.f156745g.getPaint().measureText(ow3Var.f382577f);
            float b17 = i65.a.b(this.f156715f.f156725e, 14);
            float f17 = measuredWidth;
            if (measureText + measureText2 + b17 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) yVar.f156744f.getLayoutParams();
                layoutParams.width = (int) ((f17 - measureText2) - b17);
                yVar.f156744f.setLayoutParams(layoutParams);
            }
        }
        yVar.f156744f.setText(ow3Var.f382576e);
        yVar.f156745g.setText(ow3Var.f382577f);
    }
}
