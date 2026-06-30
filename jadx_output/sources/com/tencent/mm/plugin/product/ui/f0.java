package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductReceiptUI f153287d;

    public f0(com.tencent.mm.plugin.product.ui.MallProductReceiptUI mallProductReceiptUI) {
        this.f153287d = mallProductReceiptUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.product.ui.MallProductReceiptUI mallProductReceiptUI = this.f153287d;
        java.lang.String obj = mallProductReceiptUI.f153205g.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            db5.t7.makeText(mallProductReceiptUI, com.tencent.mm.R.string.grs, 0).show();
        } else {
            wq3.j jVar = mallProductReceiptUI.f153204f;
            jVar.getClass();
            r45.ek5 ek5Var = new r45.ek5();
            jVar.f448557j = ek5Var;
            ek5Var.f373582d = !com.tencent.mm.sdk.platformtools.t8.K0(obj) ? 1 : 0;
            jVar.f448557j.f373583e = obj;
            mallProductReceiptUI.finish();
        }
        return true;
    }
}
