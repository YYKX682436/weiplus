package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI f159661d;

    public w(com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI) {
        this.f159661d = productFurtherInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI = this.f159661d;
        linkedList.add(productFurtherInfoUI.getString(com.tencent.mm.R.string.iad));
        linkedList2.add(0);
        db5.e1.d(productFurtherInfoUI.getContext(), "", linkedList, linkedList2, "", false, new com.tencent.mm.plugin.scanner.ui.v(this));
        return true;
    }
}
