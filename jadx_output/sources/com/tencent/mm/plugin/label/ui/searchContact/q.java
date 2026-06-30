package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class q implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143379d;

    public q(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143379d = contactManagerUI;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.tencent.mm.plugin.label.ui.searchContact.d data = (com.tencent.mm.plugin.label.ui.searchContact.d) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        int i18 = com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI.f143316z;
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143379d;
        contactManagerUI.getClass();
        if (itemView.getTag() instanceof com.tencent.mm.plugin.label.ui.searchContact.a) {
            java.lang.Object tag = itemView.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
            if (((com.tencent.mm.plugin.label.ui.searchContact.a) tag).f143340r != null) {
                java.lang.Object tag2 = itemView.getTag();
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
                android.widget.CheckBox checkBox = ((com.tencent.mm.plugin.label.ui.searchContact.a) tag2).f143340r;
                if (checkBox != null) {
                    checkBox.setChecked(!checkBox.isChecked());
                }
                if (checkBox.isChecked()) {
                    com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = contactManagerUI.U6();
                    kotlin.jvm.internal.o.d(U6);
                    java.util.List list = U6.A;
                    com.tencent.mm.storage.z3 z3Var = data.f143354m;
                    list.add(java.lang.String.valueOf(z3Var != null ? z3Var.d1() : null));
                    com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U62 = contactManagerUI.U6();
                    if (U62 != null && (arrayList2 = U62.B) != null) {
                        arrayList2.add(data);
                    }
                } else {
                    com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U63 = contactManagerUI.U6();
                    kotlin.jvm.internal.o.d(U63);
                    java.util.List list2 = U63.A;
                    com.tencent.mm.storage.z3 z3Var2 = data.f143354m;
                    list2.remove(java.lang.String.valueOf(z3Var2 != null ? z3Var2.d1() : null));
                    com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U64 = contactManagerUI.U6();
                    if (U64 != null && (arrayList = U64.B) != null) {
                        arrayList.remove(data);
                    }
                }
                contactManagerUI.V6();
            }
        }
    }
}
