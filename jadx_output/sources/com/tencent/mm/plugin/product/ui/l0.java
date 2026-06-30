package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class l0 implements com.tencent.mm.plugin.product.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI f153312a;

    public l0(com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI) {
        this.f153312a = mallProductSelectSkuUI;
    }

    @Override // com.tencent.mm.plugin.product.ui.v
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI = this.f153312a;
        if (i17 == 0 && i18 == 0) {
            int i19 = com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.f153215t;
            mallProductSelectSkuUI.T6();
        } else {
            mallProductSelectSkuUI.f153192d = str;
            mallProductSelectSkuUI.showDialog(-10001);
        }
    }
}
