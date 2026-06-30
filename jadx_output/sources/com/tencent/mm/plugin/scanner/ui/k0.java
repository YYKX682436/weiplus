package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159574d;

    public k0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159574d = productUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        e04.n3 n3Var;
        int i17 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159574d;
        productUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList.add(productUI.getString(com.tencent.mm.R.string.lah));
        linkedList2.add(0);
        linkedList.add(productUI.getString(com.tencent.mm.R.string.lag));
        linkedList2.add(1);
        if (!productUI.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
            linkedList.add(productUI.getString(com.tencent.mm.R.string.hjg));
            linkedList2.add(2);
        } else if (productUI.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
            str = productUI.getString(com.tencent.mm.R.string.f490367t0);
            linkedList.add(productUI.getString(com.tencent.mm.R.string.f489842da));
            linkedList2.add(3);
            java.lang.String str2 = str;
            n3Var = productUI.f159319q;
            if (n3Var != null && !android.text.TextUtils.isEmpty(n3Var.field_exposeurl)) {
                linkedList.add(productUI.getString(com.tencent.mm.R.string.bdb));
                linkedList2.add(4);
            }
            db5.e1.d(productUI, "", linkedList, linkedList2, str2, false, new com.tencent.mm.plugin.scanner.ui.o0(productUI));
            return true;
        }
        str = "";
        java.lang.String str22 = str;
        n3Var = productUI.f159319q;
        if (n3Var != null) {
            linkedList.add(productUI.getString(com.tencent.mm.R.string.bdb));
            linkedList2.add(4);
        }
        db5.e1.d(productUI, "", linkedList, linkedList2, str22, false, new com.tencent.mm.plugin.scanner.ui.o0(productUI));
        return true;
    }
}
