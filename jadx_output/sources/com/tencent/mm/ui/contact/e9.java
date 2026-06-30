package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206690d;

    public e9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206690d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.f9.ContactOa.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", 16384);
        j45.l.n(this.f206690d, "brandservice", ".ui.BrandServiceIndexUI", intent, 2);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
