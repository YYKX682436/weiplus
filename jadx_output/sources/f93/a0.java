package f93;

/* loaded from: classes4.dex */
public final class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260286d;

    public a0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260286d = contactEditLabel;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260286d;
        f93.y yVar = contactEditLabel.A;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        com.tencent.mm.ui.contact.item.d item = yVar.getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
        f93.y yVar2 = contactEditLabel.A;
        if (yVar2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (yVar2.f207078f) {
            if (yVar2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            kotlin.jvm.internal.o.d(str);
            java.util.LinkedList linkedList = yVar2.f260514r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            yVar2.notifyDataSetChanged();
        } else if (com.tencent.mm.storage.z3.k4(str)) {
            android.content.Intent intent = new android.content.Intent(contactEditLabel.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.contact.AddressUI.class);
            intent.putExtra("Contact_GroupFilter_DisplayName", "@biz.contact");
            com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel2 = this.f260286d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(contactEditLabel2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactEditLabel2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(contactEditLabel2, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 3);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (str != null) {
            if (str.length() > 0) {
                j45.l.j(contactEditLabel.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
