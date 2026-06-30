package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153323d;

    public o1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153323d = mallProductUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI = this.f153323d;
        java.lang.String[] stringArray = mallProductUI.getResources().getStringArray(com.tencent.mm.R.array.f478012z);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArray) {
            arrayList.add(str);
        }
        if ((mallProductUI.f153261v.d().f153344a & 1) > 0) {
            arrayList.add(mallProductUI.getString(com.tencent.mm.R.string.f492474gs1));
        }
        db5.e1.h(mallProductUI.getContext(), null, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), null, false, new com.tencent.mm.plugin.product.ui.n1(this));
        return true;
    }
}
