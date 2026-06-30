package z32;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z32.s f469904e;

    public e(java.lang.String str, z32.s sVar) {
        this.f469903d = str;
        this.f469904e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f469903d);
        j45.l.j(this.f469904e.getActivity(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
