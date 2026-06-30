package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f159500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159501e;

    public a1(com.tencent.mm.plugin.scanner.ui.ProductUI productUI, e04.n3 n3Var) {
        this.f159501e = productUI;
        this.f159500d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.d(this.f159501e.getContext(), intent, android.net.Uri.parse(this.f159500d.field_playurl), "video/*", false);
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159501e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(productUI, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        productUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(productUI, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
