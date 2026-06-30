package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes.dex */
public class m4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.VcardContactUI f159593b;

    public m4(com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI, java.lang.String str) {
        this.f159593b = vcardContactUI;
        this.f159592a = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str = this.f159592a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{str + " " + str});
            j45.l.j(this.f159593b, "qqmail", ".ui.ComposeUI", intent, null);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{str});
        com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI = this.f159593b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(vcardContactUI, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        vcardContactUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(vcardContactUI, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
