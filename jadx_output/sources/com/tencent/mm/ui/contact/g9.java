package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f206730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206732g;

    public g9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, int i17, int i18, java.lang.String str) {
        this.f206732g = selectContactUI;
        this.f206729d = i17;
        this.f206730e = i18;
        this.f206731f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206732g;
        java.lang.String string = selectContactUI.getString(this.f206729d, java.lang.Integer.valueOf(this.f206730e));
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI2 = this.f206732g;
        db5.e1.A(selectContactUI, string, "", selectContactUI2.getString(com.tencent.mm.R.string.f489911f7), selectContactUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.contact.f9(this), null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
