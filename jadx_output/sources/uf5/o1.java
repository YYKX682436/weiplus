package uf5;

/* loaded from: classes10.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI f427280d;

    public o1(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI) {
        this.f427280d = selectPrivacyContactsFromRangeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427280d;
        selectPrivacyContactsFromRangeUI.L = !selectPrivacyContactsFromRangeUI.L;
        selectPrivacyContactsFromRangeUI.y7();
        if (selectPrivacyContactsFromRangeUI.L) {
            java.util.Iterator it = ((java.util.HashSet) selectPrivacyContactsFromRangeUI.Q).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!((java.util.LinkedList) selectPrivacyContactsFromRangeUI.C.f427289r).contains(str)) {
                    ((java.util.LinkedList) selectPrivacyContactsFromRangeUI.C.f427289r).add(str);
                }
            }
        } else {
            ((java.util.LinkedList) selectPrivacyContactsFromRangeUI.C.f427289r).clear();
        }
        selectPrivacyContactsFromRangeUI.C.notifyDataSetChanged();
        selectPrivacyContactsFromRangeUI.z7();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
