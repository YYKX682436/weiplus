package uf5;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f427199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f427200e;

    public b(yz5.a aVar, android.widget.PopupWindow popupWindow) {
        this.f427199d = aVar;
        this.f427200e = popupWindow;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchDeletePopupHelper$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f427199d.invoke();
        this.f427200e.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchDeletePopupHelper$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
