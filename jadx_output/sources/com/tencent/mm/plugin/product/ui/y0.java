package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class y0 implements com.tencent.mm.plugin.product.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSubmitUI f153376a;

    public y0(com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI) {
        this.f153376a = mallProductSubmitUI;
    }

    @Override // com.tencent.mm.plugin.product.ui.v
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI = this.f153376a;
        if (i17 == 0 && i18 == 0) {
            int i19 = com.tencent.mm.plugin.product.ui.MallProductSubmitUI.f153228z;
            mallProductSubmitUI.T6();
        } else {
            mallProductSubmitUI.f153192d = str;
            mallProductSubmitUI.showDialog(-10001);
        }
    }
}
