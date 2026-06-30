package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class n0 implements com.tencent.mm.plugin.product.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI f153318a;

    public n0(com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI) {
        this.f153318a = mallProductSelectSkuUI;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI = this.f153318a;
        mallProductSelectSkuUI.f153224p.f448553f = i17;
        mallProductSelectSkuUI.f153219h.setVisibility(8);
    }

    public void b(int i17, int i18) {
        com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI = this.f153318a;
        if (i18 == 1) {
            mallProductSelectSkuUI.f153219h.setText(com.tencent.mm.R.string.gru);
            mallProductSelectSkuUI.f153219h.setVisibility(0);
        } else {
            if (i18 != 3) {
                return;
            }
            mallProductSelectSkuUI.f153219h.setText(mallProductSelectSkuUI.getString(com.tencent.mm.R.string.grv, java.lang.Integer.valueOf(i17)));
            mallProductSelectSkuUI.f153219h.setVisibility(0);
        }
    }
}
