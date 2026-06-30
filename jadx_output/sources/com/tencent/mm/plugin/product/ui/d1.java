package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSubmitUI f153278d;

    public d1(com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI) {
        this.f153278d = mallProductSubmitUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.w wVar = this.f153278d.f153246y;
        wVar.getClass();
        android.content.Intent intent = new android.content.Intent(wVar.f153364d, (java.lang.Class<?>) com.tencent.mm.plugin.product.ui.MallProductReceiptUI.class);
        android.app.Activity activity = wVar.f153364d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(4);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "goEditInvoice", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
