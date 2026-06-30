package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143374d;

    public l(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143374d = contactManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143374d;
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = contactManagerUI.U6();
        kotlin.jvm.internal.o.d(U6);
        java.util.ArrayList arrayList2 = U6.B;
        if (arrayList2 != null && arrayList2.size() != 0) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) contactManagerUI, 1, true);
            k0Var.f211872n = new com.tencent.mm.plugin.label.ui.searchContact.h(contactManagerUI);
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            java.lang.String str2 = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.label.ui.searchContact.d dVar = (com.tencent.mm.plugin.label.ui.searchContact.d) it.next();
                if (android.text.TextUtils.isEmpty(dVar.f143353i)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str2);
                    com.tencent.mm.storage.z3 z3Var = dVar.f143354m;
                    sb6.append(z3Var != null ? z3Var.P0() : null);
                    str2 = sb6.toString();
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str2);
                    com.tencent.mm.storage.z3 z3Var2 = dVar.f143354m;
                    sb7.append(z3Var2 != null ? z3Var2.P0() : null);
                    sb7.append('@');
                    sb7.append(dVar.f143353i);
                    str2 = sb7.toString();
                }
                i17++;
                if (i17 < arrayList2.size()) {
                    str2 = str2 + (char) 12289;
                }
            }
            if (arrayList2.size() > 1) {
                str = contactManagerUI.getString(com.tencent.mm.R.string.f491040bo2, java.lang.String.valueOf(arrayList2.size()), str2);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (arrayList2.size() == 1) {
                str = contactManagerUI.getString(com.tencent.mm.R.string.f491038bo0, str2);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else {
                str = "";
            }
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.label.ui.searchContact.k(3L, ""));
            k0Var.r(str, 17, i65.a.b(contactManagerUI, 14), null);
            k0Var.f211881s = new com.tencent.mm.plugin.label.ui.searchContact.i(contactManagerUI);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
