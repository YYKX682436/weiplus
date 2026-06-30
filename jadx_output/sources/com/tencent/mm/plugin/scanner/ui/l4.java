package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes.dex */
public class l4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.VcardContactUI f159588b;

    public l4(com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI, java.lang.String str) {
        this.f159588b = vcardContactUI;
        this.f159587a = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + this.f159587a));
        com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI = this.f159588b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(vcardContactUI, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        vcardContactUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(vcardContactUI, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
